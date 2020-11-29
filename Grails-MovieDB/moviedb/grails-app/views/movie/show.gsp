<html>
    <head>
        <title>Show movie</title>
    </head>
    <body>
        <h1>Show movie</h1>
        Title: ${movie.title}<br />
        Genre: ${movie.genre}<br />
        Rating: ${movie.rating}<br />
        <g:link action="edit" id="${movie.id}">Edit</g:link><br />
        <g:link action="delete" id="${movie.id}">Delete</g:link><br />
        <g:link action="list" id="${movie.id}">View All</g:link>
    </body>
</html>
