def call(standardPipeline){
    node{
        stage('example'){
            sh "echo this is my step"
        }

        stage('envoy'){
            mail(subject: 'This is heading', body: 'This is my Body', to: 'deeptesh_b@persistent.com')
        }

        stage('deploy'){
            sh "echo this is my step"
        }
    }
}

def setNotificationRoom(room){
    def roomname = room
    sh "echo ${roomname}"
    return roomname
}


    