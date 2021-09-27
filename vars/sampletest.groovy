def call() {
 
                echo "Build the app"
                sh 'npm install'
                echo 'Build is done guys!'
}
{
                echo "The build number is ${env.BUILD_NUMBER}"
                echo "The job name is ${env.JOB_NAME}"
                echo "The Jenkins URL is ${env.JENKINS_URL}"
                echo "The Build URL is ${env.BUILD_URL}"
                echo "The GIt Branch URL is ${env.GIT_BRANCH}"
                echo "The Jenkins Veedu URL is ${env.JENKINS_HOME}"
                echo "The Jenkins Workspace is ${env.WORKSPACE}"
            }
{
            mail bcc: 'sridhar.vimala@infosys.com', body: ''' Thanks,
Sangi Mangi & Mangi Sangi''', cc: 'jinjajenkinsuser@gmail.com', from: '', replyTo: '', subject: "${env.JOB_NAME}" , to: ''
}
