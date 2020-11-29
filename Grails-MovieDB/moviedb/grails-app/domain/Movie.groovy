package moviedb


class Movie{
  String title
  String genre
  Integer rating

  static constraints = {
        title nullable: false
        genre nullable: false
        rating nullable: false
    }
}
