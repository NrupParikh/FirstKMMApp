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
- ktor : Create HTTP APIs
- SQLDelight : Generates typesafe Kotlin APIs from your SQL statements
- If we want to use the common UI across the platform then we can use Compose Multiplatform 
- Reference : https://www.jetbrains.com/help/kotlin-multiplatform-dev/multiplatform-ktor-sqldelight.html?_gl=1*1gftzu2*_ga*NzU0NTcyNTg2LjE2NTgyMDY4MjM.*_ga_9J976DJZ68*MTcwODQxNzcxMy45Mi4xLjE3MDg0MTg3NTUuNTguMC4w&_ga=2.34358821.548923132.1708336110-754572586.1658206823

### Compose Multiplatform
- Develop stunning shared UIs for Android, iOS, desktop, and web.
- A Kotlin-based declarative UI framework developed by JetBrains
- You can implement the user interface once and then use it for all the platforms you target
- iOS, Android, desktop, and web.
- Reference : https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-getting-started.html

### Multiplatform libraries
- Kotlin Multiplatform is also helpful for library authors. 
- You can create a multiplatform library with common code and its platform-specific implementations for JVM, web, and native platforms. Once published, a multiplatform library can be used as a dependency in other cross-platform projects.
