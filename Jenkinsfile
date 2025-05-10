pipeline {
    agent any
    tools {
            maven 'maven'  // This name must match what you set in the UI
        }
    stages {

    stage('Build with Maven') {
                steps {
                    sh 'mvn clean install'
                }
            }

        stage('Pull Docker Image') {
            steps {
                script {
                    // Pull Docker image from Docker Hub
                    sh '/usr/bin/docker pull amolagangawane1992/container:latest'
                }
            }
        }
        stage('Run Docker Container') {
            steps {
                script {
                    // Run the pulled Docker image
                    sh '/usr/bin/docker run -d -p 8888:8888 amolagangawane1992/container:latest'
                }
            }
        }
    }
}
