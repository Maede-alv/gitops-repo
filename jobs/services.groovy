pipelineJob('service-A') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/Maede-alv/demoApp.git')
                        credentials('github-token')
                    }
                    branch('*/master')
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
    triggers {
        scm('H/2 * * * *')
    }
}
