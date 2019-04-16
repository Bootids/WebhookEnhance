package pers.bootis.webhook.enhance.processor

@Target(AnnotationTarget.CLASS)
annotation class Message(val app: String, val model: String)
