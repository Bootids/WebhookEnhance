package pers.bootis.webhook.enhance.apps.gitlab.service.impl

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import io.vertx.core.AsyncResult
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.ext.web.api.OperationRequest
import io.vertx.ext.web.api.OperationResponse
import pers.bootis.webhook.enhance.apps.gitlab.model.Push
import pers.bootis.webhook.enhance.apps.gitlab.service.GitlabService

class GitlabServiceImpl : GitlabService {

    override fun sendMessage(
        redirectUrl: String,
        request: OperationRequest,
        resultHandler: Handler<AsyncResult<OperationResponse>>
    ) {
        println(request.params.getJsonObject("body").toString())
        val gson = GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create()
        val push = gson.fromJson<Push>(
            request.params.getJsonObject("body").toString(),
            Push::class.java
        )
        resultHandler.handle(
            Future.succeededFuture(OperationResponse().setStatusCode(200).setStatusMessage("成功!"))
        )

    }

}