pipeline {
    agent any

    stages {
        stage("Build") {
            steps {
                sh "echo 'building"
            }
        }
        stage("Test") {
            steps {
                sh "eho 'test"
            }
        }
        stage("SAST") {
            steps {
                sh "echo 'sonar"

            }
        }
        stage("Artifact") {
            steps {
                sh "echo 'Artifact"
            }
        }
    }
    post {
        always {
            sh "echo 'Notification"
        }
    }
}