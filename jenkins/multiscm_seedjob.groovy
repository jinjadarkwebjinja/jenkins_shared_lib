job("$jobname") 

{
    multiscm {
        git {
            remote {
                github('jinjadarkwebjinja/Tic-Tac-Toe')
            }
            extensions {
                relativeTargetDirectory('Tic-Tac-Toe')
            }
        }
        triggers {
    cron('*/1 * * * *')
  }
        git {
            remote {
                github('jinjadarkwebjinja/hello-world-java')
            }
            extensions {
                relativeTargetDirectory('hello-world-java')
            }
        }
            triggers {
    cron('*/1 * * * *')
  }
    }
}
