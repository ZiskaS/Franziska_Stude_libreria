def call(boolean abortPipeline = false, int timeout = 5) {
    timeout = timeout ?: 5 // Set default timeout to 5 minutes
    
    try {
        // Execute SonarQube analysis or echo statement
        sh 'echo "Executing code quality tests"'
        
        // Wait for the result with timeout
        timeout(time: timeout, unit: 'MINUTES') {
            // Evaluate SonarQube Quality Gate and decide whether to abort pipeline
            // You can add your logic here to check SonarQube Quality Gate
            // If Quality Gate fails and abortPipeline is true, abort the pipeline
            // Otherwise, continue with the pipeline execution
            // Example code:
            // if (qualityGateFails && abortPipeline) {
            //     error "SonarQube Quality Gate failed. Aborting the pipeline."
            // }
        }
    } catch (Exception e) {
        // Handle any exceptions that occur during SonarQube analysis
        echo "Error: ${e.message}"
        
        // If abortPipeline is true, abort the pipeline
        if (abortPipeline) {
            error "Error during code quality tests execution. Aborting the pipeline."
        }
    }
}
