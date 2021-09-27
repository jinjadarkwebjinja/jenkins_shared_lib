
def call() {
 
                echo "Build the app"
                sh 'npm install'
                echo 'Build is done guys!'
}
{
   Date date = new Date()
   return date.format('yyyyMMddHHmmss',TimeZone.getTimeZone('PST')) as String
}
return this
