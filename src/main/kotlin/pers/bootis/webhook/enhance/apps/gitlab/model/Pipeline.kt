package pers.bootis.webhook.enhance.apps.gitlab.model

import com.google.gson.annotations.SerializedName

class Pipeline {

    @SerializedName("object_kind")
    private var objectKind: String? = null
    @SerializedName("object_attributes")
    private var objectAttributes: ObjectAttributesBean? = null
    @SerializedName("user")
    private var user: UserBean? = null
    @SerializedName("project")
    private var project: ProjectBean? = null
    @SerializedName("commit")
    private var commit: CommitBean? = null
    @SerializedName("builds")
    private var builds: List<BuildsBean>? = null

    fun getObjectKind(): String? {
        return objectKind
    }

    fun setObjectKind(objectKind: String) {
        this.objectKind = objectKind
    }

    fun getObjectAttributes(): ObjectAttributesBean? {
        return objectAttributes
    }

    fun setObjectAttributes(objectAttributes: ObjectAttributesBean) {
        this.objectAttributes = objectAttributes
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

    fun getCommit(): CommitBean? {
        return commit
    }

    fun setCommit(commit: CommitBean) {
        this.commit = commit
    }

    fun getBuilds(): List<BuildsBean>? {
        return builds
    }

    fun setBuilds(builds: List<BuildsBean>) {
        this.builds = builds
    }

    class ObjectAttributesBean {
        @SerializedName("id")
        var id: Int = 0
        @SerializedName("ref")
        var ref: String? = null
        @SerializedName("tag")
        var isTag: Boolean = false
        @SerializedName("sha")
        var sha: String? = null
        @SerializedName("before_sha")
        var beforeSha: String? = null
        @SerializedName("status")
        var status: String? = null
        @SerializedName("created_at")
        var createdAt: String? = null
        @SerializedName("finished_at")
        var finishedAt: String? = null
        @SerializedName("duration")
        var duration: Int = 0
        @SerializedName("stages")
        var stages: List<String>? = null
        @SerializedName("variables")
        var variables: List<VariablesBean>? = null

        class VariablesBean {
            @SerializedName("key")
            var key: String? = null
            @SerializedName("value")
            var value: String? = null
        }
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

    class BuildsBean {
        @SerializedName("id")
        var id: Int = 0
        @SerializedName("stage")
        var stage: String? = null
        @SerializedName("name")
        var name: String? = null
        @SerializedName("status")
        var status: String? = null
        @SerializedName("created_at")
        var createdAt: String? = null
        @SerializedName("started_at")
        var startedAt: Any? = null
        @SerializedName("finished_at")
        var finishedAt: Any? = null
        @SerializedName("when")
        var `when`: String? = null
        @SerializedName("manual")
        var isManual: Boolean = false
        @SerializedName("user")
        var user: UserBeanX? = null
        @SerializedName("runner")
        var runner: Any? = null
        @SerializedName("artifacts_file")
        var artifactsFile: ArtifactsFileBean? = null

        class UserBeanX {
            @SerializedName("name")
            var name: String? = null
            @SerializedName("username")
            var username: String? = null
            @SerializedName("avatar_url")
            var avatarUrl: String? = null
        }

        class ArtifactsFileBean {
            @SerializedName("filename")
            var filename: Any? = null
            @SerializedName("size")
            var size: Any? = null
        }
    }

}