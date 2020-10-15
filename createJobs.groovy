pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('key-value-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/siyile/key-value.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}