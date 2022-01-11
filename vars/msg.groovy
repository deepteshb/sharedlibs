def call(body){
    def locals = [:]
    body.resolveStrategy = CLOSURE.DELEGATE_FIRST
    body.delegate = locals
    body()

    sh "echo 'This is me.'"


}
