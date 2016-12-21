# spring-boot-webmvc-custom-listener
This example shows how a custom listener can be added to a Stormpath Spring Boot WebMVC App.

In this particular case the listener is only providing custom behavior for authentication events. You can do the same for Logout, Registration and Failed authentication attempts.

# How to run
1. If you have more than one application in Stormpath then add the href of the application you want to use in `src/main/resources/application.properties`
2. `mvn clean compile`
3. `mvn spring-boot:run`
4. Open `http://localhost:8080`
5. Login
6. You will see there is a message like this in your terminal: `Received successful authentication request event: sample@email.com`
