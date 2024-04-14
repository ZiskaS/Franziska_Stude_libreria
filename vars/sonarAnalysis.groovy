def call(boolean abortPipeline = false, int timeout = 5) {
    // Implementación de la función sonarAnalysis
    // Puedes reemplazar este bloque con la lógica necesaria para ejecutar el escaneo de SonarQube
    // o mostrar un mensaje de prueba
    echo "Ejecución de las pruebas de calidad de código"
    
    // Simulación de tiempo de espera (timeout)
    sleep time: timeout, unit: 'MINUTES'
    
    // Verificación del parámetro abortPipeline
    if (abortPipeline) {
        error 'El pipeline debe ser abortado según la configuración'
    }
}
