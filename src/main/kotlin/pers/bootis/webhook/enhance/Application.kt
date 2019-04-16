package pers.bootis.webhook.enhance

import io.vertx.core.Future
import io.vertx.core.Vertx
import org.slf4j.LoggerFactory
import pers.bootis.webhook.enhance.apps.gitlab.GitlabVerticle
import pers.bootis.webhook.enhance.db.DBVerticle


class Application : BaseVerticle() {

    private val log = LoggerFactory.getLogger(Application::class.java)

    companion object {
        @JvmStatic
        fun main(array: Array<String>) {
            Vertx.vertx().deployVerticle(Application())
        }
    }

    override fun start(future: Future<Void>) {
        startHttpServer("/api.yml")
        Vertx.vertx().deployVerticle(GitlabVerticle())
        Vertx.vertx().deployVerticle(DBVerticle())
        if (future.failed()) {
            log.info("Could not start HTTP Server")
            future.cause().printStackTrace()
        } else {
            log.info("Server started")
        }
    }


}