pipeline {
    agent any
    stages {
        stage('clean') {
            steps {
                sh "mvn clean"
            }
        }
        stage('test') {
            steps {
                sh "mvn test"
            }
        }
        stage('install') {
            steps {
                sh "mvn install"
            }
        }
        stage('deploy') {
            steps {
                sh "mvn deploy"
            }
        }
    }
}
