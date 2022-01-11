package vars.msg
class msg {
   private int StudentID;
   private String StudentName;
	
   void setStudentID(int pID) {
      StudentID = pID;
   }
	
   void setStudentName(String pName) {
      StudentName = pName;
   }
	
   int getStudentID() {
      return this.StudentID;
   }
	
   String getStudentName() {
      return this.StudentName;
   }
	
   /* static void main(String[] args) {
      Student st = new Student();
      st.setStudentID(1);
      st.setStudentName("Joe");
		
      println(st.getStudentID());
      println(st.getStudentName());
   }  */
}

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


    