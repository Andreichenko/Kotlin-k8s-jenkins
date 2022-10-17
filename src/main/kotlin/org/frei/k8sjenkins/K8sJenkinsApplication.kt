package org.frei.k8sjenkins

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.Banner

@SpringBootApplication
class K8sJenkinsApplication


fun main(args: Array<String>) {
	runApplication<K8sJenkinsApplication>(*args)
}
