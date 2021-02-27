<html>
    <head>
        <title>Create new movie</title>
    </head>
    <body>
        <h1>Search Movie</h1>
        
        <g:if test="${movieResult == 'failed'}">
       <g:javascript>alert('hello')</g:javascript>
       </g:if>
       
        
        <g:form action="searchMovie">
            Title: <g:textField name="title" /><br />
        <g:actionSubmit value="searchMovie" />
        </g:form>
    </body>
</html>