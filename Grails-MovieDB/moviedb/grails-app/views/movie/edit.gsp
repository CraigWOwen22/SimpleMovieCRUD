<html>
    <head>
        <title>Edit movie</title>
    </head>
    <body>
        <h1>Edit movie</h1>
        <g:form action="update" id="${movie.id}">
            Title: <g:textField name="title" value="${movie.title}"/><br />
            Genre: <g:textField name="genre" value="${movie.genre}"/><br />
            Rating: <g:textField name="rating" value="${movie.rating}"/><br />
            <g:actionSubmit value="Update" />
        </g:form>
    </body>
</html>
