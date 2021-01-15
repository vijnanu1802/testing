pipeline {
    node any
     
       
    Stages {
       
            stage ('Build') {
             steps {
                batch 'mvn -B -DskipTests clean package'
            }
        }

}
}

