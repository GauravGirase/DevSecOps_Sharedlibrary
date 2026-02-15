def call() {
    timeout(time: 3, unit: 'MINUTES') {
        def qualityGate = waitForQualityGate()
        
        echo "Quality Gate Status: ${qualityGate.status}"
        
        if (qualityGate.status != 'OK') {
            error "Pipeline aborted due to SonarQube Quality Gate failure: ${qualityGate.status}"
        }
    }
}
