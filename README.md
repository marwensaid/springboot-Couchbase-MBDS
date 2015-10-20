# springboot-Couchbase-MBDS
tutorial using Couchbase with spring boot for MBDS student Nice

# Couchbase Java Spring-Boot Application
This is a sample application for getting started with Couchbase Server 4.0. The application runs a single page UI for
demonstrating SQL for Documents (N1QL) querying capabilities. It uses Couchbase Server 4.0 (developer preview or later) 
together with Spring Boot, Angular and Bootstrap.

## Prerequisites
The following pieces need to be in place in order to run the application.

1. Couchbase Server 4.0 with the `travel-sample` bucket (default).
2. Java 7 or later
3. Maven 3 or later
4. Intellij Idea (recommended)

## Running the Application

clone the repository:

```
$ https://github.com/marwensaid/springboot-Couchbase-MBDS.git
```

Now change into the directory (`$ cd springboot-Couchbase-MBDS`) and then run the following maven command.

```
mvn spring-boot:run
```

If all goes well, this will start a web server on `127.0.0.1:8080`. 
couchbase-server will run on `127.0.0.1:8091`.

## Custom Options
By default it will connect to the `travel-sample` bucket on `127.0.0.1`. You can conveniently change those options through
the command line on bootstrap:

```
$ mvn spring-boot:run -Dhostname=127.0.0.1 -Dbucket=travel-sample -Dpassword=
```
