def call(){
  timeout(time: 30, unit: "MINUTES") {
      echo "Waiting for SonarQube quality gate..."
      waitForQualityGate abortPipeline: true
      echo "Quality gate check completed."
  }
}
