package pers.bootis.webhook.enhance.apps.gitlab.model

enum class GitlabEvent(val value: String) {

    PUSH("push"),
    TAG("tag_push"),
    ISSUE("issue"),
    COMMENT("note"),
    MERGE("merge_request"),
    WIKI("wiki_page"),
    PIPELINE("pipeline"),
    BUILD("build")

}