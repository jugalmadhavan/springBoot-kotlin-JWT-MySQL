package com.jugal.domain

import javax.persistence.*

@Entity
@Table(name = "v_app_users")
class User(
  @Column(name = "username")
  var username: String? = null,
  @Column(name = "password")
  var password: String? = null,
  @Column(name = "first_name")
  var firstName: String? = null,
  @Column(name = "last_name")
  var lastName: String? = null,
  @Column(name = "type")
  var type: String,
  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(
    name = "v_app_users_roles",
    joinColumns = [JoinColumn(name = "user_id", referencedColumnName = "id")],
    inverseJoinColumns = [JoinColumn(name = "role_id", referencedColumnName = "id")]
  )
  var roles: Collection<Role>? = null
) : AbstractJpaPersistable<Long>()

