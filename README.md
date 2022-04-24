
# Orange Framework Selenium

This framework it's created for automated test cases for Orange company.
It's based in Java and using the BDD (Behavior Driven Development) as a development process.

### Technologies and dependencies used

1. Maven as a software code building automation system dependencies:

    1. Selenium
    2. Junit
    3. Cucumber for java
    4. Cucumber for Junit

2. You can use this framework in local with (BaseDriverLocal class) or. 
3. You can use with selenium hub with SeleniumHub class.

---

### Code rules

The code must be legible, and the methods classes etc must be documented, use Page object model for create new classes.
The programing and documentation must be in English.
        
---

### How to launch

   1. If you're going to be launch the test cases with "BaseDriverLocalClass" must download and configure the driver like this "C:\Selenium\drivers\chromedriver.exe".
   2. If you're going to be launch the test cases with "SeleniumHub" you must use the grid and the nodeconfig.Json inside this project (src/test/resources/seleniumGrid) with this commands and change the paths if would be necessary.
      1. java -jar selenium-server-standalone-3.141.59.jar -role hub
      2. java -Dwebdriver.chrome.driver=C:/Selenium/drivers/chromedriver.exe -jar selenium-server-standalone-3.141.59.jar -role node -nodeConfig nodeConfig.json --debug

   3. mvn test (execute all features)
   4. From runner class "RunCucumberTest" click in trigger.
   5. You can use tag in specific scenarios like @WIP and execute specific scenario with  mvn test -Dcucumber.options="--tags @tagname" 

### To do in a future / Ideas

* Use Wiremock, always is much better aim to a unit test, isolating front end test, and back end test.
* Connect with another web pages like Opera, Firefox etc... with kubernetes and Jenkinsfile.
* Migrate to Spring Boot.

---

### Authors

Fernando Orea.