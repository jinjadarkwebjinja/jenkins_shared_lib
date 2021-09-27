def String call() {
  def commit = null
  def changeLogSets = currentBuild.changeSets
  if(changeLogSets.size()>0 && changeLogSets.items.size() > 0){
    commit = changeLogSets[0].items[0]
  }
  return commit
}
def call() {
 
                echo "Build the app"
                sh 'npm install'
                echo 'Build is done guys!'
}

