pipeline {
    agent { any
          }
       
    stages {
        stage ('Git Checkout') {
            steps { 
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'git \'https://github.com/vijnanu1802/testing.git\'']]])
            }
            stage ('Build') {
             steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }

}
}
}
