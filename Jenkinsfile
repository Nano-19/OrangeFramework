pipeline {
    agent {
        kubernetes {
            yaml """
                kind: Pod
                metadata:
                    name: Orange automatization
                spec:
                  volumes:
                    - name: dshm
                      emptyDir:
                        medium: Memory
                  containers:
                    - name: maven
                      image: maven:3.8.1-jdk-8-slim
                      imagePullPolicy: Always
                      ports:
                          - containerPort: 5555
                      volumeMounts:
                          - mountPath: /dev/shm
                            name: dshm
                      command:
                        - /bin/cat
                      tty: true
                    - name: selenium-hub
                      image: selenium/hub:3.141.59
                      env:
                        - name: SE_OPTS
                          value: "-debug"
                      imagePullPolicy: Always
                    - name: selenium-node-chrome
                      image: selenium/node-chrome:3.141.59
                      env:
                        - name: HUB_HOST
                          value: "localhost"
                        - name: HUB_PORT
                          value: "4444"
                        - name: SE_OPTS
                          value: "-debug"
                      imagePullPolicy: Always
                      tty: true
            """.stripIndent()
        }
    }
    stages {
        stage('checkoutTests') {
            steps {
                checkout ([$class:'GitSCM',
                    branches:[[name: '*/main']],
                    userRemoteConfigs:[[url: 'https://github.com/Nano-19/OrangeFramework.git', credentialsId:'']],
                    extensions:[[$class:'RelativeTargetDirectory', relativeTargetDir: 'Tests']]
                ])
            }
        }
        stage('launchtests')
            steps{
                container('maven'){
                    dir('Tests')
                        sh 'mvn test'
                }
            }
    }
}
