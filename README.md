# matrix-java
Purpose of this project is develop Java client for Matrix server (tested agains SYNAPSE). As side effect I would like to improve
matrix-doc swagger specification now available in my forked repository (https://github.com/tavoda/matrix-doc)

Actual 'glued' version of matrix-doc/client-server protocol is in
[src/main/resources/matrix-new-swagger.json]('src/main/resources/matrix-new-swagger.json')
You can generate sources from this definition with command:
```
gen.sh src/main/resources/matrix-new-swagger.json
```
matrix-new-swagger.json is generated by [matrix-swagger-tools](https://github.com/tavoda/matrix-swagger-tools)

### Working ON
* Operation names (operationId)
* Resolving inconsistencies (matrix-doc vs. reality of what synapse server returns)
* Writing tests for api calls

### Waiting tasks
* swagger-code-gen integration to Maven build process (pom.xml)

### Done
* Event inheritance and correct event type resolvement (x-discriminator-value)
* Tests for parsing local event files [src/test/resources]
* Parsing initial /sync response ;-)
* Writing tool for merging files [matrix-swagger-tools](https://github.com/tavoda/matrix-swagger-tools)

## How to build
## Swagger editor
You can now use Swagger editor for testing. Online editor is available at http://editor.swagger.io/#/

File -> Import URL
```
https://raw.githubusercontent.com/tavoda/matrix-java/master/src/main/resources/matrix-new-swagger.json
```
