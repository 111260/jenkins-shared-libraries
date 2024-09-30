def call(String Project, String ImageTag, String dockerhubuser) {
  withCredentials([usernamePassword(credentialsId: 'dockerhub-cred', passwordVariable: 'DOCKERHUB_PASS', usernameVariable: 'DOCKERHUB_USER')]) {
      // Here, use the secured environment variables provided by withCredentials
      sh "docker login -u ${DOCKERHUB_USER} -p ${DOCKERHUB_PASS}"
  }
  // Pushing the image using the function's dockerhubuser parameter
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}

