# matrix-java
Purpose of this project is develop Java client for Matrix server (tested agains SYNAPSE). As side effect I would like to improve
matrix-doc swagger specification now in (https://github.com/tavoda/matrix-doc)

Actual 'glued' version of matrix-doc is in 'https://github.com/tavoda/matrix-java/blob/master/src/main/resources/matrix-new-swagger.json'
You can generate sources from this definition with command:
  gen.sh src/main/resources/matrix-new-swagger.json

## Swagger editor
You can now use Swagger editor for testing. Online editor is available at http://editor.swagger.io/#/

File -> Import URL
https://raw.githubusercontent.com/tavoda/matrix-java/master/src/main/resources/matrix-new-swagger.json
