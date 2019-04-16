package pers.bootis.webhook.enhance.apps.gitlab.model

import com.google.gson.annotations.SerializedName

class Issue {

    @SerializedName("object_kind")
    private var objectKind: String? = null
    @SerializedName("user")
    private var user: UserBean? = null
    @SerializedName("project")
    private var project: ProjectBean? = null
    @SerializedName("repository")
    private var repository: RepositoryBean? = null
    @SerializedName("object_attributes")
    private var objectAttributes: ObjectAttributesBean? = null
    @SerializedName("assignee")
    private var assignee: AssigneeBean? = null
    @SerializedName("changes")
    private var changes: ChangesBean? = null
    @SerializedName("assignees")
    private var assignees: List<AssigneesBean>? = null
    @SerializedName("labels")
    private var labels: List<LabelsBeanX>? = null

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

    fun getAssignee(): AssigneeBean? {
        return assignee
    }

    fun setAssignee(assignee: AssigneeBean) {
        this.assignee = assignee
    }

    fun getChanges(): ChangesBean? {
        return changes
    }

    fun setChanges(changes: ChangesBean) {
        this.changes = changes
    }

    fun getAssignees(): List<AssigneesBean>? {
        return assignees
    }

    fun setAssignees(assignees: List<AssigneesBean>) {
        this.assignees = assignees
    }

    fun getLabels(): List<LabelsBeanX>? {
        return labels
    }

    fun setLabels(labels: List<LabelsBeanX>) {
        this.labels = labels
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
        @SerializedName("title")
        var title: String? = null
        @SerializedName("assignee_id")
        var assigneeId: Int = 0
        @SerializedName("author_id")
        var authorId: Int = 0
        @SerializedName("project_id")
        var projectId: Int = 0
        @SerializedName("created_at")
        var createdAt: String? = null
        @SerializedName("updated_at")
        var updatedAt: String? = null
        @SerializedName("position")
        var position: Int = 0
        @SerializedName("branch_name")
        var branchName: Any? = null
        @SerializedName("description")
        var description: String? = null
        @SerializedName("milestone_id")
        var milestoneId: Any? = null
        @SerializedName("state")
        var state: String? = null
        @SerializedName("iid")
        var iid: Int = 0
        @SerializedName("url")
        var url: String? = null
        @SerializedName("action")
        var action: String? = null
        @SerializedName("assignee_ids")
        var assigneeIds: List<Int>? = null
    }

    class AssigneeBean {
        @SerializedName("name")
        var name: String? = null
        @SerializedName("username")
        var username: String? = null
        @SerializedName("avatar_url")
        var avatarUrl: String? = null
    }

    class ChangesBean {
        @SerializedName("labels")
        var labels: LabelsBean? = null
        @SerializedName("updated_by_id")
        var updatedById: List<Int?>? = null
        @SerializedName("updated_at")
        var updatedAt: List<String>? = null

        class LabelsBean {
            @SerializedName("previous")
            var previous: List<PreviousBean>? = null
            @SerializedName("current")
            var current: List<CurrentBean>? = null

            class PreviousBean {
                @SerializedName("id")
                var id: Int = 0
                @SerializedName("title")
                var title: String? = null
                @SerializedName("color")
                var color: String? = null
                @SerializedName("project_id")
                var projectId: Int = 0
                @SerializedName("created_at")
                var createdAt: String? = null
                @SerializedName("updated_at")
                var updatedAt: String? = null
                @SerializedName("template")
                var isTemplate: Boolean = false
                @SerializedName("description")
                var description: String? = null
                @SerializedName("type")
                var type: String? = null
                @SerializedName("group_id")
                var groupId: Int = 0
            }

            class CurrentBean {
                @SerializedName("id")
                var id: Int = 0
                @SerializedName("title")
                var title: String? = null
                @SerializedName("color")
                var color: String? = null
                @SerializedName("project_id")
                var projectId: Int = 0
                @SerializedName("created_at")
                var createdAt: String? = null
                @SerializedName("updated_at")
                var updatedAt: String? = null
                @SerializedName("template")
                var isTemplate: Boolean = false
                @SerializedName("description")
                var description: String? = null
                @SerializedName("type")
                var type: String? = null
                @SerializedName("group_id")
                var groupId: Int = 0
            }
        }
    }

    class AssigneesBean {
        @SerializedName("name")
        var name: String? = null
        @SerializedName("username")
        var username: String? = null
        @SerializedName("avatar_url")
        var avatarUrl: String? = null
    }

    class LabelsBeanX {
        @SerializedName("id")
        var id: Int = 0
        @SerializedName("title")
        var title: String? = null
        @SerializedName("color")
        var color: String? = null
        @SerializedName("project_id")
        var projectId: Int = 0
        @SerializedName("created_at")
        var createdAt: String? = null
        @SerializedName("updated_at")
        var updatedAt: String? = null
        @SerializedName("template")
        var isTemplate: Boolean = false
        @SerializedName("description")
        var description: String? = null
        @SerializedName("type")
        var type: String? = null
        @SerializedName("group_id")
        var groupId: Int = 0
    }

}