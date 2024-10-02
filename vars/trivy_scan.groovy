def call() {
  withEnv([
    'TRIVY_AUTH_URL=https://ghcr.io',
    'TRIVY_TOKEN=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' // Replace <your_github_token> with your actual token or use a Jenkins secret variable
  ]) {
    try {
      // Run Trivy scan
      sh "trivy fs ."
    } catch (Exception e) {
      // Handle any errors that occur during the Trivy scan
      echo "Error occurred while running Trivy scan: ${e}"
    }
  }
}

