# springBoot-kotlin-JWT-MySQL

**Features**:
* spring-boot 2.1.1.RELEASE
* kotlin 1.3.41
* MariaDB 10.3.12
* JWT Authentication/Authorization with spring-security
* JPA mySQL


### Install

* **create mysql db**
```sql
CREATE DATABASE demo;
GRANT ALL ON demo.* TO demo@localhost IDENTIFIED BY 'demo';
FLUSH PRIVILEGES
```

* **compile and run**
```console
mvn clean package -DskipTests
mvn spring-boot:run
```

### Test
```console
curl -i -H "Content-Type: application/json" -X POST -d '{ "username": "user", "password": "user"}' http://localhost:8443/login
```

```console
curl  -H "Authorization: ******"  http://localhost:8443/api/verify
```

```console
curl -H "Authorization: Bearer ******" http://localhost:8443/actuator/health
```

### Changelog

* _v0.0.1-SNAPSHOT_: first version
