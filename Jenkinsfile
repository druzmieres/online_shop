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
        stage('verify sonar') {
            steps {
                sh "mvn verify sonar:sonar"
            }
        }
        stage('package') {
            steps {
                sh "mvn package"
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
}
