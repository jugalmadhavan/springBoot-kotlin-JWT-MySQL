package com.jugal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration

@SpringBootApplication(exclude = [(RepositoryRestMvcAutoConfiguration::class)])
class Application : SpringBootServletInitializer() {

  override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
    return application.sources(Application::class.java)
  }

}

fun main(args: Array<String>) {
  configureApplication(SpringApplicationBuilder()).run(*args)
}

fun configureApplication(builder: SpringApplicationBuilder): SpringApplicationBuilder {
  return builder.sources(Application::class.java)
}
