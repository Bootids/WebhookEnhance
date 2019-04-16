package pers.bootis.webhook.enhance.apps.gitlab.model

import com.google.gson.annotations.SerializedName

class Build {

    @SerializedName("object_kind")
    private var objectKind: String? = null
    @SerializedName("ref")
    private var ref: String? = null
    @SerializedName("tag")
    private var tag: Boolean = false
    @SerializedName("before_sha")
    private var beforeSha: String? = null
    @SerializedName("sha")
    private var sha: String? = null
    @SerializedName("build_id")
    private var buildId: Int = 0
    @SerializedName("build_name")
    private var buildName: String? = null
    @SerializedName("build_stage")
    private var buildStage: String? = null
    @SerializedName("build_status")
    private var buildStatus: String? = null
    @SerializedName("build_started_at")
    private var buildStartedAt: Any? = null
    @SerializedName("build_finished_at")
    private var buildFinishedAt: Any? = null
    @SerializedName("build_duration")
    private var buildDuration: Any? = null
    @SerializedName("build_allow_failure")
    private var buildAllowFailure: Boolean = false
    @SerializedName("build_failure_reason")
    private var buildFailureReason: String? = null
    @SerializedName("project_id")
    private var projectId: Int = 0
    @SerializedName("project_name")
    private var projectName: String? = null
    @SerializedName("user")
    private var user: UserBean? = null
    @SerializedName("commit")
    private var commit: CommitBean? = null
    @SerializedName("repository")
    private var repository: RepositoryBean? = null

    fun getObjectKind(): String? {
        return objectKind
    }

    fun setObjectKind(objectKind: String) {
        this.objectKind = objectKind
    }

    fun getRef(): String? {
        return ref
    }

    fun setRef(ref: String) {
        this.ref = ref
    }

    fun isTag(): Boolean {
        return tag
    }

    fun setTag(tag: Boolean) {
        this.tag = tag
    }

    fun getBeforeSha(): String? {
        return beforeSha
    }

    fun setBeforeSha(beforeSha: String) {
        this.beforeSha = beforeSha
    }

    fun getSha(): String? {
        return sha
    }

    fun setSha(sha: String) {
        this.sha = sha
    }

    fun getBuildId(): Int {
        return buildId
    }

    fun setBuildId(buildId: Int) {
        this.buildId = buildId
    }

    fun getBuildName(): String? {
        return buildName
    }

    fun setBuildName(buildName: String) {
        this.buildName = buildName
    }

    fun getBuildStage(): String? {
        return buildStage
    }

    fun setBuildStage(buildStage: String) {
        this.buildStage = buildStage
    }

    fun getBuildStatus(): String? {
        return buildStatus
    }

    fun setBuildStatus(buildStatus: String) {
        this.buildStatus = buildStatus
    }

    fun getBuildStartedAt(): Any? {
        return buildStartedAt
    }

    fun setBuildStartedAt(buildStartedAt: Any) {
        this.buildStartedAt = buildStartedAt
    }

    fun getBuildFinishedAt(): Any? {
        return buildFinishedAt
    }

    fun setBuildFinishedAt(buildFinishedAt: Any) {
        this.buildFinishedAt = buildFinishedAt
    }

    fun getBuildDuration(): Any? {
        return buildDuration
    }

    fun setBuildDuration(buildDuration: Any) {
        this.buildDuration = buildDuration
    }

    fun isBuildAllowFailure(): Boolean {
        return buildAllowFailure
    }

    fun setBuildAllowFailure(buildAllowFailure: Boolean) {
        this.buildAllowFailure = buildAllowFailure
    }

    fun getBuildFailureReason(): String? {
        return buildFailureReason
    }

    fun setBuildFailureReason(buildFailureReason: String) {
        this.buildFailureReason = buildFailureReason
    }

    fun getProjectId(): Int {
        return projectId
    }

    fun setProjectId(projectId: Int) {
        this.projectId = projectId
    }

    fun getProjectName(): String? {
        return projectName
    }

    fun setProjectName(projectName: String) {
        this.projectName = projectName
    }

    fun getUser(): UserBean? {
        return user
    }

    fun setUser(user: UserBean) {
        this.user = user
    }

    fun getCommit(): CommitBean? {
        return commit
    }

    fun setCommit(commit: CommitBean) {
        this.commit = commit
    }

    fun getRepository(): RepositoryBean? {
        return repository
    }

    fun setRepository(repository: RepositoryBean) {
        this.repository = repository
    }

    class UserBean {
        @SerializedName("id")
        var id: Int = 0
        @SerializedName("name")
        var name: String? = null
        @SerializedName("email")
        var email: String? = null
    }

    class CommitBean {
        @SerializedName("id")
        var id: Int = 0
        @SerializedName("sha")
        var sha: String? = null
        @SerializedName("message")
        var message: String? = null
        @SerializedName("author_name")
        var authorName: String? = null
        @SerializedName("author_email")
        var authorEmail: String? = null
        @SerializedName("status")
        var status: String? = null
        @SerializedName("duration")
        var duration: Any? = null
        @SerializedName("started_at")
        var startedAt: Any? = null
        @SerializedName("finished_at")
        var finishedAt: Any? = null
    }

    class RepositoryBean {
        @SerializedName("name")
        var name: String? = null
        @SerializedName("description")
        var description: String? = null
        @SerializedName("homepage")
        var homepage: String? = null
        @SerializedName("git_ssh_url")
        var gitSshUrl: String? = null
        @SerializedName("git_http_url")
        var gitHttpUrl: String? = null
        @SerializedName("visibility_level")
        var visibilityLevel: Int = 0
    }

}