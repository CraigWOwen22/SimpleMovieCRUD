<html>
    <head>
        <title>List movies</title>
    </head>
    <body>
        <h1>List movies</h1>
        <g:each in="${movies}" var="movie">
            Title: ${movie.title}<br />
            Genre: ${movie.genre}<br />
            Rating: ${movie.rating}<br />
            <g:link action="show"
               id="${movie.id}">Show</g:link><br />
            <g:link action="edit"
               id="${movie.id}">Edit</g:link><br />
            <g:link action="delete"
               id="${movie.id}">Delete</g:link><br /><br />
        </g:each>
        <g:link action="create">Create new movie</g:link>
    </body>
</html>
