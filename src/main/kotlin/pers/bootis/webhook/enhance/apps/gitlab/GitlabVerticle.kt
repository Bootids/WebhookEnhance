package pers.bootis.webhook.enhance.apps.gitlab

import io.vertx.core.Future
import io.vertx.serviceproxy.ServiceBinder
import pers.bootis.webhook.enhance.BaseVerticle
import pers.bootis.webhook.enhance.apps.gitlab.service.GitlabService
import pers.bootis.webhook.enhance.apps.gitlab.service.impl.GitlabServiceImpl

class GitlabVerticle : BaseVerticle() {

    override fun start(future: Future<Void>) {
        startService()
        startHttpServer("/gitlab-api.yml").setHandler(future.completer())
    }

    private fun startService(){
        val serviceBinder = ServiceBinder(vertx)
        val gitlabService = GitlabServiceImpl()
        serviceBinder
            .setAddress("transactions_manager.myapp")
            .register(GitlabService::class.java, gitlabService)
    }

}