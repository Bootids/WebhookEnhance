package pers.bootis.webhook.enhance.apps.gitlab.model

import com.google.gson.annotations.SerializedName

class CommentOnCommit {

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
    @SerializedName("commit")
    private var commit: CommitBean? = null

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

    fun getCommit(): CommitBean? {
        return commit
    }

    fun setCommit(commit: CommitBean) {
        this.commit = commit
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
        var lineCode: String? = null
        @SerializedName("commit_id")
        var commitId: String? = null
        @SerializedName("noteable_id")
        var noteableId: Any? = null
        @SerializedName("system")
        var isSystem: Boolean = false
        @SerializedName("st_diff")
        var stDiff: StDiffBean? = null
        @SerializedName("url")
        var url: String? = null

        class StDiffBean {
            @SerializedName("diff")
            var diff: String? = null
            @SerializedName("new_path")
            var newPath: String? = null
            @SerializedName("old_path")
            var oldPath: String? = null
            @SerializedName("a_mode")
            var aMode: String? = null
            @SerializedName("b_mode")
            var bMode: String? = null
            @SerializedName("new_file")
            var isNewFile: Boolean = false
            @SerializedName("renamed_file")
            var isRenamedFile: Boolean = false
            @SerializedName("deleted_file")
            var isDeletedFile: Boolean = false
        }
    }

    class CommitBean {
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

        class AuthorBean {
            @SerializedName("name")
            var name: String? = null
            @SerializedName("email")
            var email: String? = null
        }
    }

}