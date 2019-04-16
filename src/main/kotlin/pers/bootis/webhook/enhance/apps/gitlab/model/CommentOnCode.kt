package pers.bootis.webhook.enhance.apps.gitlab.model

import com.google.gson.annotations.SerializedName
import pers.bootis.webhook.enhance.processor.Message

@Message(app = "gitlab", model = "comment-on-code")
class CommentOnCode {

    @SerializedName("object_kind")
    private var objectKind: String? = null
    @SerializedName("user")
    private var user: UserBean? = null
    @SerializedName("project_id")
    private var projectId: Int = 0
    @SerializedName("project")
    private var project: ProjectBean? = null
    @SerializedName("repository")
    private var repository: RepositoryBean? = null
    @SerializedName("object_attributes")
    private var objectAttributes: ObjectAttributesBean? = null
    @SerializedName("snippet")
    private var snippet: SnippetBean? = null

    fun getObjectKind(): String? {
        return objectKind
    }

    fun setObjectKind(objectKind: String) {
        this.objectKind = objectKind
    }

    fun getUser(): UserBean? {
        return user
    }

    fun setUser(user: UserBean) {
        this.user = user
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

    fun getObjectAttributes(): ObjectAttributesBean? {
        return objectAttributes
    }

    fun setObjectAttributes(objectAttributes: ObjectAttributesBean) {
        this.objectAttributes = objectAttributes
    }

    fun getSnippet(): SnippetBean? {
        return snippet
    }

    fun setSnippet(snippet: SnippetBean) {
        this.snippet = snippet
    }

    class UserBean {
        @SerializedName("name")
        var name: String? = null
        @SerializedName("username")
        var username: String? = null
        @SerializedName("avatar_url")
        var avatarUrl: String? = null
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
    }

    class ObjectAttributesBean {
        @SerializedName("id")
        var id: Int = 0
        @SerializedName("note")
        var note: String? = null
        @SerializedName("noteable_type")
        var noteableType: String? = null
        @SerializedName("author_id")
        var authorId: Int = 0
        @SerializedName("created_at")
        var createdAt: String? = null
        @SerializedName("updated_at")
        var updatedAt: String? = null
        @SerializedName("project_id")
        var projectId: Int = 0
        @SerializedName("attachment")
        var attachment: Any? = null
        @SerializedName("line_code")
        var lineCode: Any? = null
        @SerializedName("commit_id")
        var commitId: String? = null
        @SerializedName("noteable_id")
        var noteableId: Int = 0
        @SerializedName("system")
        var isSystem: Boolean = false
        @SerializedName("st_diff")
        var stDiff: Any? = null
        @SerializedName("url")
        var url: String? = null
    }

    class SnippetBean {
        @SerializedName("id")
        var id: Int = 0
        @SerializedName("title")
        var title: String? = null
        @SerializedName("content")
        var content: String? = null
        @SerializedName("author_id")
        var authorId: Int = 0
        @SerializedName("project_id")
        var projectId: Int = 0
        @SerializedName("created_at")
        var createdAt: String? = null
        @SerializedName("updated_at")
        var updatedAt: String? = null
        @SerializedName("file_name")
        var fileName: String? = null
        @SerializedName("expires_at")
        var expiresAt: Any? = null
        @SerializedName("type")
        var type: String? = null
        @SerializedName("visibility_level")
        var visibilityLevel: Int = 0
    }

}