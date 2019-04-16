package pers.bootis.webhook.enhance.db

import io.vertx.core.AbstractVerticle
import io.vertx.core.Future

class DBVerticle : AbstractVerticle() {

    override fun start(future: Future<Void>?) {
        JdbcUtil.create(vertx)
    }

    override fun stop() {
        JdbcUtil.closeClient()
    }
}