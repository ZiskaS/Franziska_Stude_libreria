pipeline {
    agent any
    stages {
        stage('SonarQube Analysis') {
            steps {
                script {
                    sonarAnalysis(abortPipeline: true, timeout: 5)
                }
            }
        }
    }
}
