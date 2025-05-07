pipeline {
    agent any
    stages {
        stage('Pull Docker Image') {
            steps {
                script {
                    // Pull Docker image from Docker Hub
                    sh 'docker pull amolagangawane1992/container:latest'
                }
            }
        }
        stage('Run Docker Container') {
            steps {
                script {
                    // Run the pulled Docker image
                    sh 'docker run -d -p 8888:8888 amolagangawane1992/container:latest'
                }
            }
        }
    }
}
