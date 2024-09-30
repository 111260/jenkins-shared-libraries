def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'dockerhub-cred', passwordVariable: 'dDOCKERHUB_PASS', usernameVariable: 'DOCKERHUB_USER')]) {
      sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
