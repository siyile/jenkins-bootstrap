pipelineJob('facus-api-job-aws') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/siyile/facus-api.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-aws')
                }
            }
        }
    }
}