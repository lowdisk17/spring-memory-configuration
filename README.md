# spring-cache
A simple project to kickstart your spring boot and heap memory fine tuning journey

Note: In testing
1. Run the application by using any idea of your choice (example VSCode)
   - When running spring boot app you can set heap memory allocation by using -> mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Xms2048m -Xmx4096m"
   - Xms is your initial memory and Xmx is your maximum memory
   - You can also override the current Xms and Xmx configuration in pom.xml and no need to use jvmArguments when you decided to use pom for this configuration
3. By using postman or any other testing application you can check the validity of the application. Paste the following info accordingly
   Endpoint :
     - GET http://localhost:8080/service
4. Sample Response
   - heap size, max heap size and free heap size
