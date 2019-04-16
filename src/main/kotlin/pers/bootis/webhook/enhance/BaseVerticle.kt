package pers.bootis.webhook.enhance

import io.vertx.core.AbstractVerticle
import io.vertx.core.Future
import io.vertx.core.http.HttpServerOptions
import io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory
import io.vertx.ext.web.handler.StaticHandler

open class BaseVerticle : AbstractVerticle() {

    protected fun startHttpServer(apiUrl: String): Future<Void> {
        val future = Future.future<Void>()
        OpenAPI3RouterFactory.create(this.vertx, apiUrl) { openAPI3RouterFactoryAsyncResult ->
            if (openAPI3RouterFactoryAsyncResult.succeeded()) {

                val routerFactory = openAPI3RouterFactoryAsyncResult.result()
                routerFactory.mountServicesFromExtensions()

                val router = routerFactory.router
                router.route().handler(StaticHandler.create())

                vertx.createHttpServer(
                    HttpServerOptions().setPort(
                        Config.getInt(
                            "http.port",
                            8080
                        )
                    ).setHost(Config.getString("http.host", "localhost"))
                )
                    .requestHandler(router).listen { ar ->
                        if (ar.succeeded()) {
                            future.complete()
                        } else
                            future.fail(ar.cause())
                    }
            } else {
                future.fail(openAPI3RouterFactoryAsyncResult.cause())
            }
        }
        return future
    }
}
