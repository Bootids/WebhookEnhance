package pers.bootis.webhook.enhance

import org.yaml.snakeyaml.Yaml
import java.util.*

object Config {

    private var yaml = Yaml()
    private var configMap: Map<String, Objects> = yaml.load(
        this.javaClass.classLoader.getResourceAsStream("conf.yml")
    )

    fun getInt(key: String): Int {
        return configMap[key].toString().toInt()
    }

    fun getInt(key: String, default: Int): Int {
        return if (configMap[key] == null) {
            default
        } else {
            configMap[key].toString().toInt()
        }
    }

    fun getString(key: String): String {
        return configMap[key].toString()
    }

    fun getString(key: String, default: String): String {
        return if (configMap[key] == null) {
            default
        } else {
            configMap[key].toString()
        }
    }

}