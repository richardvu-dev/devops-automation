pipeline {
    agent any
    tools{
        maven 'maven_3_8_4'
    }
    stages{
        stage('Build Maven'){
            steps{
                echo 'Build Maven'
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/richardvu-dev/devops-automation']]])
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t richardvuwork123/devops-integration .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                   withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                   
                }
            }
        }
        stage('Deploy to k8s'){
            steps{
                script{
                    
                }
            }
        }
    }
}