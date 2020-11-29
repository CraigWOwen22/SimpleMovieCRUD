package moviedb

class MovieController{

  MovieService movieService

  def index = {
    redirect action: "list"
  }

  def create = {}

  def save = {

    def movie = movieService.saveMovie(params.title, params.genre, params.rating.toInteger())
    redirect action: "show", id: movie.id
  }

  def edit = {
    def movie = Movie.get(params.id)
    [movie:movie]
  }

  def update ={
    def movie = movieService.updateMovie(params.id.toInteger(), params)
    redirect action: "show", id: movie.id
  }

  // def update = {
  // def movie = Movie.get(params.id)
  // movie.properties = params
  // movie.save flush: true, failOnError: true
  // redirect action: "show", id: params.id
  // }

  def show = {
    def movie = Movie.get(params.id)
    [movie: movie]
  }

  def list = {
    def movies = Movie.list()
    [movies: movies]
  }


  def delete = {
   movieService.deleteMovie(params.id.toInteger())
    // def movie = Movie.get(params.id)
    // movie.delete flush: true, failOnError: true
     redirect action: "index"
  }

}
