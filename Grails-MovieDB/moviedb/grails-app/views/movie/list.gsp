<html>
    <head>
        <title>List movies</title>
         <!--<style>
            th {text-align: left;}
            th, td {border-bottom: 1px solid #ddd;}
            tr:hover {background-color: #f5f5f5;}
        </style>-->
        
        <link rel="stylesheet" href="${resource(dir: 'css', file: 'movieMain.css')}" type="text/css">

    </head>
    <body>
        
        <h1>List movies</h1>
        <table style="width:80%">
            <tr>
                <th>Title</th>
                <th>Genre</th>
                <th>Rating</th>
                <th></th>
            </tr>
            <g:each in="${movies}" var="movie">
            
            <tr>
                <td>${movie.title}</td>
                <td>${movie.genre}</td>
                 <td>${movie.rating}</td>
            
                <td>
                <g:link action="show" id="${movie.id}">   
                    <input type="button" value="show" class="button">
                </g:link>
                <br/>
                <g:link action="edit"
                id="${movie.id}">Edit</g:link><br/>
                <g:link action="delete"
                id="${movie.id}">Delete</g:link><br/><br/>
                </td>
            </tr>
         
        </tr>
        </g:each>
        
        </table>
        
        <g:link action="create">Create new movie</g:link><br />
        <g:link action="search">Search movie</g:link>
        </body>
    </html>
