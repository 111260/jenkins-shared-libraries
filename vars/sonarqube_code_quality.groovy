def call(){
  timeout(time: 20, unit: "MINUTES") {
      echo "Waiting for SonarQube quality gate..."
      waitForQualityGate abortPipeline: true
      echo "Quality gate check completed."
  }
}
