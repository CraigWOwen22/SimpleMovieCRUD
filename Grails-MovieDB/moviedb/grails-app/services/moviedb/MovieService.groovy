package moviedb

import grails.gorm.transactions.Transactional

@Transactional
class MovieService {

    def saveMovie(String title, String genre, Integer rating) {
      Movie movie = new Movie()
      movie.title = title
      movie.genre = genre
      movie.rating = rating
      movie.save(flush: true)
      return movie
    }

    def deleteMovie(Integer id){
      Movie movie = Movie.get(id)
      movie.delete(flush: true)
    }

    def updateMovie(Integer id, params){
      Movie movie = Movie.get(id)
      movie.properties = params
      movie.save(flush: true)
      return movie
    }

    def getMovie(Integer id){
      Movie movie = Movie.get(id)
    }

    def getMovies(){
      Movie.list()
    }
    
    def searchM(String movieTitle){
      Movie movie = Movie.find("from Movie as m where m.title='" + movieTitle + "'")
      println "MOVIE: $movie"
      println "movietitle" + movieTitle
       
      return movie
        
    }
    
    
    
    






}
