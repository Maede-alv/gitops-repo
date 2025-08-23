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
            scriptPath('Jenkinsfile') // Jenkinsfile داخل ریپوی سرویس
        }
    }
    triggers {
        scm('H/5 * * * *') // هر 5 دقیقه برای چک کردن تغییرات (یا میشه webhook بذاری)
    }
}
