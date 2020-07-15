package com.jugal.repository

import org.springframework.data.repository.CrudRepository
import com.jugal.domain.User
import java.util.*

interface UserRepository : CrudRepository<User, Long> {
  fun findByUsername(username: String): Optional<User>
}
