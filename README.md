# Maven Port Allocation Tutorial

Examples how to allocate or reserve ports in a Maven build using the maven-port-allocation plugin.

Please feel free to have a look at [my blog] for more detailed information.

## Running different instances

You're able to spawn two instances starting an embedded Jetty running on different ports like this:


    mvn compile exec:java -Dexec.mainClass=com.hascode.tutorial.HttpRunner    
    mvn compile exec:java -Dexec.mainClass=com.hascode.tutorial.HttpRunner


## Sample Web Application

The application is available at the following location:

    http://localhost:**PORT**/app/test

----

**2014 Micha Kops /hasCode.com**

   [my blog]:http://www.hascode.com/