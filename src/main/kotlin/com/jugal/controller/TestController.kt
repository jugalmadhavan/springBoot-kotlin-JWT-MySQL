package com.jugal.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderController() {
  @GetMapping("/support")
  fun support() = "Support user"

  @GetMapping("/admin")
  fun admin() = "Admin user"

}
