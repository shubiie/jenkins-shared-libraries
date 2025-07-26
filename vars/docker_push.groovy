def call(String Project, String ImageTag, String dockerhubuser) {
    withCredentials([usernamePassword(credentialsId: 'dockerHubCred', passwordVariable: 'DOCKER_PASSWORD', usernameVariable: 'DOCKER_USERNAME')]) {
        sh """
            docker login -u ${DOCKER_USERNAME} -p ${DOCKER_PASSWORD}
            docker push ${DOCKER_USERNAME}/${Project}:${ImageTag}
        """
    }
}
