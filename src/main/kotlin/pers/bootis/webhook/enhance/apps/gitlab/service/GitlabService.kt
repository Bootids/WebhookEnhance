package pers.bootis.webhook.enhance.apps.gitlab.service

import io.vertx.core.AsyncResult
import io.vertx.core.Handler
import io.vertx.ext.web.api.OperationRequest
import io.vertx.ext.web.api.OperationResponse
import io.vertx.ext.web.api.generator.WebApiServiceGen

@WebApiServiceGen
interface GitlabService {

    fun sendMessage(
        redirectUrl: String,
        request: OperationRequest,
        resultHandler: Handler<AsyncResult<OperationResponse>>
    )

}
