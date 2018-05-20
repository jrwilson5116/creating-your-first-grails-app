package org.grails.guides

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/old"(view:"/index")
        "/"(controller:"home")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
