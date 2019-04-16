package pers.bootis.webhook.enhance.manage

import pers.bootis.webhook.enhance.BaseVerticle

class ManageVerticle : BaseVerticle() {

    override fun start() {
        super.startHttpServer("/manage-api.yml")
    }

}