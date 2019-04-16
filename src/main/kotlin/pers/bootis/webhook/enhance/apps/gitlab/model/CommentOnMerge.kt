package pers.bootis.webhook.enhance.apps.gitlab.model

import com.google.gson.annotations.SerializedName

class CommentOnMerge {

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
    @SerializedName("merge_request")
    private var mergeRequest: MergeRequestBean? = null

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

    fun getMergeRequest(): MergeRequestBean? {
        return mergeRequest
    }

    fun setMergeRequest(mergeRequest: MergeRequestBean) {
        this.mergeRequest = mergeRequest
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

    class MergeRequestBean {
        @SerializedName("id")
        var id: Int = 0
        @SerializedName("target_branch")
        var targetBranch: String? = null
        @SerializedName("source_branch")
        var sourceBranch: String? = null
        @SerializedName("source_project_id")
        var sourceProjectId: Int = 0
        @SerializedName("author_id")
        var authorId: Int = 0
        @SerializedName("assignee_id")
        var assigneeId: Int = 0
        @SerializedName("title")
        var title: String? = null
        @SerializedName("created_at")
        var createdAt: String? = null
        @SerializedName("updated_at")
        var updatedAt: String? = null
        @SerializedName("milestone_id")
        var milestoneId: Int = 0
        @SerializedName("state")
        var state: String? = null
        @SerializedName("merge_status")
        var mergeStatus: String? = null
        @SerializedName("target_project_id")
        var targetProjectId: Int = 0
        @SerializedName("iid")
        var iid: Int = 0
        @SerializedName("description")
        var description: String? = null
        @SerializedName("position")
        var position: Int = 0
        @SerializedName("source")
        var source: SourceBean? = null
        @SerializedName("target")
        var target: TargetBean? = null
        @SerializedName("last_commit")
        var lastCommit: LastCommitBean? = null
        @SerializedName("work_in_progress")
        var isWorkInProgress: Boolean = false
        @SerializedName("assignee")
        var assignee: AssigneeBean? = null

        class SourceBean {
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

        class TargetBean {
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

        class LastCommitBean {
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

        class AssigneeBean {
            @SerializedName("name")
            var name: String? = null
            @SerializedName("username")
            var username: String? = null
            @SerializedName("avatar_url")
            var avatarUrl: String? = null
        }
    }

}