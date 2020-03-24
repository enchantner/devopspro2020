multibranchPipelineJob('test-myproject') {
    branchSources {
        github {
            id("myproject")
            scanCredentialsId('devopspro_github_token_login')
            repoOwner('my_username')
            repository('myproject')
            buildOriginPRMerge(true)
            buildForkPRMerge(true)
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}