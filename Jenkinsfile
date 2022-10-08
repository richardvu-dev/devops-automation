pipeline {
    agent {
        docker {
            image 'maven:3.8.6-eclipse-temurin-11-alpine'
            args '-v $HOME/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B'
            }
        }
    }
}