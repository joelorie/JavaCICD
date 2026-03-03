pipeline {
    agent any

    triggers {
        githubPush()
    }

    stages {

        stage('Build') {
            steps {
                echo "Running Maven build..."
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                echo "Running Maven tests..."
                sh 'mvn test'
            }
        }

        stage('Archive .jar') {
            steps {
                sh '''
                    mkdir -p built
                    cp target/*.jar built/
                '''
                archiveArtifacts artifacts: 'built/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo "Build & Test successful. .jar stored in built/"
        }
        failure {
            echo "Build or Tests failed!"
        }
    }
}