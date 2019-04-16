package pers.bootis.webhook.enhance.db

import io.vertx.core.Vertx
import io.vertx.ext.asyncsql.AsyncSQLClient
import io.vertx.ext.asyncsql.PostgreSQLClient
import io.vertx.kotlin.core.json.json
import io.vertx.kotlin.core.json.obj

class JdbcUtil private constructor(vertx: Vertx) {

    private var postgreSQLClient: AsyncSQLClient

    init {
        val postgreSQLClientConfig = json {
            obj(
                "host" to "192.168.23.100",
                "port" to 5432,
                "username" to "webhook",
                "password" to "webhook",
                "database" to "webhook",
                "chartset" to "utf-8",
                "connectTimeout" to 3000,
                "queryTimeout" to 1000,
                "maxConnectionRetries" to 20,
                "connectionRetryDelay" to 10000
            )
        }
        this.postgreSQLClient = PostgreSQLClient.createNonShared(vertx, postgreSQLClientConfig)
    }

    companion object {
        private var jdbcUtil: JdbcUtil? = null
        fun create(vertx: Vertx): JdbcUtil {
            if (jdbcUtil == null) {
                this.jdbcUtil = JdbcUtil(vertx)
            }
            return jdbcUtil!!
        }

        fun getClient(): AsyncSQLClient {
            assert(jdbcUtil != null) { println("you should create before use this") }
            return jdbcUtil!!.postgreSQLClient
        }

        fun closeClient() {
            jdbcUtil!!.postgreSQLClient.close()
        }
    }

}