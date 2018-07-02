package core

class BusinessCoreController {

    def index() {
        println "This is index() from BusinessCoreController == BusinessCorePlugin"
        render "This is index() from BusinessCoreController == BusinessCorePlugin"
    }

    def core() {
        println "This is coreBusiness() from BusinessCoreController == core"

        String viewName = 'businessView'
        render view: viewName,  model: [param1: "param1Value", param2: "param2Value"]
    }
}
