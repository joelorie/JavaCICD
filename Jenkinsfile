pipeline {
    agent any

    triggers {
        githubPush()
    }

    environment {
        PROJECT_DIR = "JavaCICD"
        REPO_URL = "https://github.com/joelorie/JavaCICD.git"
        BRANCH = "main"
        BUILD_DIR = "built"
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: "${BRANCH}",
                    credentialsId: 'github-creds',
                    url: "${REPO_URL}"
            }
        }

        stage('Build') {
            steps {
                    echo "Running Maven build..."
                    sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                dir("${PROJECT_DIR}") {
                    echo "Running Maven tests..."
                    sh 'mvn test'
                }
            }
        }

        stage('Archive .jar') {
            steps {
                sh '''
                    mkdir -p ${BUILD_DIR}
                    cp ${PROJECT_DIR}/target/*.jar ${BUILD_DIR}/
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