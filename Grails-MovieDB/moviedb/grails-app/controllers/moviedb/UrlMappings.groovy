package moviedb

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        
        
//        "/" ( controller:'MovieController', action:'/create' )
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}


