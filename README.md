
# Orange Framework Selenium

This framework it's created for automated cases for Orange company it's based in Java.

### Technologies and dependencies used

1. Maven as a software code building automation system dependencies:

    1. Selenium
    2. Junit
    3. Cucumber for java
    4. Cucumber for Junit

2. Now you can use this framework in local with (BaseDriverLocal class) or you can use with selenium hub with SeleniumHub class.

---

### Code rules

The code must be legible, and the methods classes etc must be documented, use Page object model for create new classes.
The programing and documentation must be in English.
        
---

### How to launch

   1. mvn test (execute all features)
   2. From runner
   3. You can use tag in specific scenarios like @WIP and execute specific scenario with  mvn test -Dcucumber.options="--tags @tagname" 

### To do in a future / Ideas

* Use Wiremock, always is much better aim to a unit test isolating front end test and back end test.
* Connect with devices farm like a BitBar
* Migrate to Spring Boot

---

### Authors

Fernando Orea.