package pers.bootis.webhook.enhance.apps.gitlab.model

import com.google.gson.annotations.SerializedName

class Push {

    @SerializedName("object_kind")
    private var objectKind: String? = null
    @SerializedName("before")
    private var before: String? = null
    @SerializedName("after")
    private var after: String? = null
    @SerializedName("ref")
    private var ref: String? = null
    @SerializedName("checkout_sha")
    private var checkoutSha: String? = null
    @SerializedName("user_id")
    private var userId: Int = 0
    @SerializedName("user_name")
    private var userName: String? = null
    @SerializedName("user_username")
    private var userUsername: String? = null
    @SerializedName("user_email")
    private var userEmail: String? = null
    @SerializedName("user_avatar")
    private var userAvatar: String? = null
    @SerializedName("project_id")
    private var projectId: Int = 0
    @SerializedName("project")
    private var project: ProjectBean? = null
    @SerializedName("repository")
    private var repository: RepositoryBean? = null
    @SerializedName("total_commits_count")
    private var totalCommitsCount: Int = 0
    @SerializedName("commits")
    private var commits: List<CommitsBean>? = null

    fun getObjectKind(): String? {
        return objectKind
    }

    fun setObjectKind(objectKind: String) {
        this.objectKind = objectKind
    }

    fun getBefore(): String? {
        return before
    }

    fun setBefore(before: String) {
        this.before = before
    }

    fun getAfter(): String? {
        return after
    }

    fun setAfter(after: String) {
        this.after = after
    }

    fun getRef(): String? {
        return ref
    }

    fun setRef(ref: String) {
        this.ref = ref
    }

    fun getCheckoutSha(): String? {
        return checkoutSha
    }

    fun setCheckoutSha(checkoutSha: String) {
        this.checkoutSha = checkoutSha
    }

    fun getUserId(): Int {
        return userId
    }

    fun setUserId(userId: Int) {
        this.userId = userId
    }

    fun getUserName(): String? {
        return userName
    }

    fun setUserName(userName: String) {
        this.userName = userName
    }

    fun getUserUsername(): String? {
        return userUsername
    }

    fun setUserUsername(userUsername: String) {
        this.userUsername = userUsername
    }

    fun getUserEmail(): String? {
        return userEmail
    }

    fun setUserEmail(userEmail: String) {
        this.userEmail = userEmail
    }

    fun getUserAvatar(): String? {
        return userAvatar
    }

    fun setUserAvatar(userAvatar: String) {
        this.userAvatar = userAvatar
    }

    fun getProjectId(): Int {
        return projectId
    }

    fun setProjectId(projectId: Int) {
        this.projectId = projectId
    }

    fun getProject(): ProjectBean? {
        return project
    }

    fun setProject(project: ProjectBean) {
        this.project = project
    }

    fun getRepository(): RepositoryBean? {
        return repository
    }

    fun setRepository(repository: RepositoryBean) {
        this.repository = repository
    }

    fun getTotalCommitsCount(): Int {
        return totalCommitsCount
    }

    fun setTotalCommitsCount(totalCommitsCount: Int) {
        this.totalCommitsCount = totalCommitsCount
    }

    fun getCommits(): List<CommitsBean>? {
        return commits
    }

    fun setCommits(commits: List<CommitsBean>) {
        this.commits = commits
    }

    class ProjectBean {
        @SerializedName("id")
        var id: Int = 0
        @SerializedName("name")
        var name: String? = null
        @SerializedName("description")
        var description: String? = null
        @SerializedName("web_url")
        var webUrl: String? = null
        @SerializedName("avatar_url")
        var avatarUrl: Any? = null
        @SerializedName("git_ssh_url")
        var gitSshUrl: String? = null
        @SerializedName("git_http_url")
        var gitHttpUrl: String? = null
        @SerializedName("namespace")
        var namespace: String? = null
        @SerializedName("visibility_level")
        var visibilityLevel: Int = 0
        @SerializedName("path_with_namespace")
        var pathWithNamespace: String? = null
        @SerializedName("default_branch")
        var defaultBranch: String? = null
        @SerializedName("homepage")
        var homepage: String? = null
        @SerializedName("url")
        var url: String? = null
        @SerializedName("ssh_url")
        var sshUrl: String? = null
        @SerializedName("http_url")
        var httpUrl: String? = null
    }

    class RepositoryBean {
        @SerializedName("name")
        var name: String? = null
        @SerializedName("url")
        var url: String? = null
        @SerializedName("description")
        var description: String? = null
        @SerializedName("homepage")
        var homepage: String? = null
        @SerializedName("git_http_url")
        var gitHttpUrl: String? = null
        @SerializedName("git_ssh_url")
        var gitSshUrl: String? = null
        @SerializedName("visibility_level")
        var visibilityLevel: Int = 0
    }

    class CommitsBean {
        @SerializedName("id")
        var id: String? = null
        @SerializedName("message")
        var message: String? = null
        @SerializedName("timestamp")
        var timestamp: String? = null
        @SerializedName("url")
        var url: String? = null
        @SerializedName("author")
        var author: AuthorBean? = null
        @SerializedName("added")
        var added: List<String>? = null
        @SerializedName("modified")
        var modified: List<String>? = null
        @SerializedName("removed")
        var removed: List<*>? = null

        class AuthorBean {
            @SerializedName("name")
            var name: String? = null
            @SerializedName("email")
            var email: String? = null
        }
    }

}