class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/api/product/$format"(controller:"product"){
            action = [GET:"show"]
        }
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
