pipelineJob("$jobname") {
definition { cps { script("""
pipeline {
    agent any 
    tools {
        // Note: this should match with the tool name configured in your jenkins instance (JENKINS_URL/configureTools/)
        maven "maven"
    }
        stages {
            stage ("git code checkout"){
            steps{
                echo "get source code"
                git changelog: false, credentialsId: 'git_creds', poll: false, url: 'https://github.com/jinjadarkwebjinja/petclinic2.git'
                emailext body: 'PFA', recipientProviders: [buildUser()], subject: 'Hi There !', to: 'jinjajenkinsuser@gmail.com'
                echo 'scm is done guys!'
            }
        }
             stage ("Build"){
            steps{
                echo "Build the app"
                sh 'mvn package'
                emailext body: 'PFA', recipientProviders: [buildUser()], subject: 'Hi There !', to: 'jinjajenkinsuser@gmail.com'
                echo 'Build is done guys!'
            }
        }
        }
    }
}
""")
}
}
triggers {
cron('*/1 * * * *')
}
}
