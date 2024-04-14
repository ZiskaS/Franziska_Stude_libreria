def call(boolean abortPipeline = false, int timeout = 5) {
    // Ejecutar el escaneo de SonarQube (o mostrar un mensaje de prueba)
    echo "Ejecución de las pruebas de calidad de código"
    
    // Esperar durante el tiempo especificado (en minutos) con un timeout
    timeout(time: timeout, unit: 'MINUTES') {
        // Evaluar el QualityGate de SonarQube y determinar si se debe abortar el pipeline
        if (abortPipeline) {
            error "QualityGate de SonarQube ha fallado. Se aborta el pipeline."
        } else {
            echo "QualityGate de SonarQube ha pasado. Se continúa con el pipeline."
        }
    }
}
