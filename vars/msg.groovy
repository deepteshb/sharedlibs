def call(){
    node{
        stage('example'){
            sh "echo this is my step"
        }

        stage('envoy'){
            sh "echo this is my step"
        }

        stage('deploy'){
            sh "echo this is my step"
        }
    }
     }


    