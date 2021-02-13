package moviedb

class MovieController{

  MovieService movieService

  def index = {
    redirect action: "list"
  }

  def create = {}
  def search = {}
  
  def searchMovie ={
      println "Entering Search"
      def movie = movieService.searchM(params.title)
  
      if(movie == null){
          redirect action: "search"
      }
      else{
          redirect action: "show", id: movie.id
      }
      
   }
  

  def save = {
    println "Entering Save"
    def movie = movieService.saveMovie(params.title, params.genre, params.rating.toInteger())
    redirect action: "show", id: movie.id
  }


  def edit = {
    def movie = movieService.getMovie(params.id.toInteger())
    // def movie = Movie.get(params.id)
    [movie: movie]
  }

  def update ={
    def movie = movieService.updateMovie(params.id.toInteger(), params)
    redirect action: "show", id: movie.id
  }

  def show = {
    def movie = movieService.getMovie(params.id.toInteger())
    // def movie = Movie.get(params.id)
    [movie: movie]
  }

  def list = {
    println "Entering List"
    def movies = movieService.getMovies()
    // def movies = Movie.list()
    [movies: movies]
  }


  def delete = {
   movieService.deleteMovie(params.id.toInteger())
    // def movie = Movie.get(params.id)
    // movie.delete flush: true, failOnError: true
     redirect action: "index"
  }
  


}
