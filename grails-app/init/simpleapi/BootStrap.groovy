package simpleapi

class BootStrap {

    def init = { servletContext ->
        Post post = new Post(title: "json server", author: "typicode")
        post.save()
    }
    def destroy = {
    }
}
