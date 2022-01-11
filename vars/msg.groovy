def call(){
    node{
    stage('build'){
        sh "echo 'Build'"

    }
    stage('sendnotification'){
             sh "echo 'Notify'"
            }

     stage('deploy'){

         sh "echo 'Deploy'"

            }
    }
    }
