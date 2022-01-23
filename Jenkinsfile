pipeline {
    agent any
    tools {
        maven 'mvn36'
    }

    stages {
        stage("Compile") {
            steps {
                sh "mvn clean compile"
            }
        }
        stage("Test") {
            steps {
                sh "mvn test"
            }
        }
        stage("Static Code Analysis") {
            steps {
                withSonarQubeEnv(installationName: 'sonar', credentialsId: 'sonar') {
                    sh "mvn clean sonar:sonar"
                }
            }
        }
        stage("Quality Gate") {
            steps {
                timeout(time: 2, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true, credentialsId: 'sonar'
                }
            }
        }
        stage("Artifact") {
            steps {
                sh "echo 'Artifact'"
            }
        }
    }
    post {
        always {
            sh "echo 'Notification'"
        }
    }
}