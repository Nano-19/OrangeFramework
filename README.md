
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

### Deliverables in this project:

1. The front end framework (Selenium + Java +Junit + Cucumber) fully functional and with 3 test cases. 
2. Word document testplan. 
3. JenkinsFile. 
4. Docker File:

I have tried to make the DockerFile as requested by the test, but (in my opinion) technically the optimal way to solve it would be with the jenkinsfile (since it uses Kubernetes as container orchestrator) that is done above, in order to make a dockerfile with the complexity of dependencies (Grid and Selenium Nodes mainly), I have not had enough time to develop it and perform trial and error.

But the ways I can think of to develop dockerfile would be two...

1. Start from an ubuntu image and prepare all the dependencies (maven, the grid and chrome node...) based on that build the image and push it to docker hub. with that image with all the dependencies I could create a dockerfile in this way to add the git repository and launch the tests.

DockerFile:

    FROM imageTestOrange:latest
    MAINTAINER fernando orea
    
    RUN apt-get update -y && apt-get upgrade -y &&&&
    apt install git -y
    
    RUN git clone https://github.com/Nano-19/OrangeFramework.git
    WORKDIR /OrangeFramework
    RUN cd /OrangeFramework
    RUN mvn test
    
    ENTRYPOINT ["/bin/sh"] 

2. With a docker-compose.yml you could have the selenium grid with the respective nodes to launch the testcases, but you would have to cover the maven dependency and add the framework to get the full abstraction.
3. (I do not know if it is possible since I have never done it) But it seems that I could make a DockerFile with several FROM $Image and from there create the custom image directly putting the Framework.

---

### More info

Inside this project you can found a "Plan de pruebas Orange.doc" with a little test plan.
JenkinsFile inside this project.
Selenium grid and drivers

---

### Authors

Fernando Orea.
