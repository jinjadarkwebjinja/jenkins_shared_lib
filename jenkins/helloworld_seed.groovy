job("$jobname") {
description('this job created by seed job .. dont edit the job ')
steps {
shell('echo Hello World!')
  shell('echo ${USER}')
}
triggers {
cron('*/1 * * * *')
}
}
