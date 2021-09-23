job("$jobname") {
description('this job created by seed job .. dont edit the job ')
steps {
helloWorld()
}
triggers {
cron('*/1 * * * *')
}
}
