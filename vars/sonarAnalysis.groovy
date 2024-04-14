def call(boolean abortPipeline = false, int timeout = 5) {
    timeout = timeout ?: 5 // Si no se proporciona un valor para timeout, se establece en 5 minutos por defecto
    try {
        // Simulando la ejecución de las pruebas de calidad de código
        sh 'echo "Ejecución de las pruebas de calidad de código"'

        // Esperar al resultado
        timeout(time: timeout, unit: 'MINUTES') {
            // Lógica para evaluar el QualityGate de SonarQube
            // Si el QualityGate no se pasa y abortPipeline es verdadero, abortar el pipeline
            // De lo contrario, continuar con el pipeline
            // Código de ejemplo:
            // if (qualityGateFails && abortPipeline) {
            //     error "QualityGate de SonarQube no se pasa. Abortando el pipeline."
            // }
        }
    } catch (Exception e) {
        // Si hay alguna excepción, manejarla aquí
        echo "Error: ${e.message}"
        // Si abortPipeline es verdadero, abortar el pipeline
        if (abortPipeline) {
            error "Error durante la ejecución de las pruebas de calidad de código. Abortando el pipeline."
        }
    }
}
