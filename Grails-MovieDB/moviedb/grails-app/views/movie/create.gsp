<html>
    <head>
        <title>Create new movie</title>
    </head>
    <body>
        <h1>Create new movie</h1>
        <g:form action="save">
            Title: <g:textField name="title" /><br />
            Genre: <g:textField name="genre" /><br />
            Rating: <g:textField name="rating" /><br />
            <g:actionSubmit value="Save" />
        </g:form>
    </body>
</html>
