## KMM

- Kotlin Multiplatform Mobile
- Supports cross platform application development
- Write business logic once and share across the cross platforms.
- Business logics such as 
  - networking
  - data storage
  - data validation
  - analytics
  - computation and other logics just once and share the code on multiple platform
- Reduce the time spent writing and maintaining the same code on different platform
- Give benefit of native programing
- Example. The business logic and data access layer will implemented only once in the shared module
  while the UI of both applications will be native.

### Ktor and SQLDelight

### What is ktor ? [Server]
- Open-source framework for building asynchronous server-side and client-side application in Kotlin. 
- It is a multiplatform HTTP client which allow you to share networking logic across platform in KMM project.
- Ex. You can write network request once and is able to use for different platform like Android, iOS, Web app

#### Advantages of Ktor
- Code sharing : It reduce code duplication by writing networking logic once in your shared KMM module
- Consistent API calls : Send and Receive network call across the platform.
- Asynchronous : It use Kotlin coroutine for efficient and non-blocking network operations.
- Ktor server support various engines such as, Jetty,Netty,Tomcat, CIO etc.

### SQLDelight [Database]
- Generates typesafe Kotlin APIs from your SQL statements
- [Reference Link](https://www.jetbrains.com/help/kotlin-multiplatform-dev/multiplatform-ktor-sqldelight.html?_gl=1*1gftzu2*_ga*NzU0NTcyNTg2LjE2NTgyMDY4MjM.*_ga_9J976DJZ68*MTcwODQxNzcxMy45Mi4xLjE3MDg0MTg3NTUuNTguMC4w&_ga=2.34358821.548923132.1708336110-754572586.1658206823)

### Netty [Engine]
- The Netty engine is the default server engine used by Ktor for creating asynchronous servers.
- To run a Ktor server application, you need to create and configure a server first
- This server configuration includes an Engine, Host, Port, SSL settings etc.
- It runs on JVM platform
 
#### Compose Multiplatform
- A Kotlin-based declarative UI framework developed by JetBrains
- If we want to use the common UI across the platform then we can use Compose Multiplatform
- You can implement the user interface once and then use it for all the platforms you target
- iOS, Android, desktop, and web.
- [Reference Link](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-getting-started.html)

#### Multiplatform libraries
- Kotlin Multiplatform is also helpful for library authors. 
- You can create a multiplatform library with common code and its platform-specific implementations for JVM, web, and native platforms. Once published, a multiplatform library can be used as a dependency in other cross-platform projects.

#### Sample App : Compose Multiplatform
- [Reference Link](https://github.com/JetBrains/compose-multiplatform/github.com/JetBrains/compose-multiplatform)