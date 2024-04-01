pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Harshytha/assessment4.git'
            }
        }
        stage('Build') {
            steps {
                script {
                    
                    bat 'javac -cp ".;task1/assessment-iv/0.0.1-SNAPSHOT.jar" src/**/*.java -d target/classes'
                }
            }
        }
        stage('Run Tests') {
            steps {
                script {
                    
                    bat 'java -cp ".;task1/assessment-iv/0.0.1-SNAPSHOT.jar;target/classes" org.junit.runner.JUnitCore CalculatorTest'
                }
            }
        }
        stage('Publish Test Results') {
            steps {
                script {
                    junit 'test-results.xml'
                }
            }
        }
    }
}
