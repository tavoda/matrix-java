# matrix-java
Purpose of this project is develop Java client for Matrix server (tested agains SYNAPSE). As side effect I would like to improve
matrix-doc swagger specification now available in my forked repository (https://github.com/tavoda/matrix-doc)

Actual 'glued' version of matrix-doc/api/client-server protocol is in
[src/main/resources/matrix-new-swagger.json]('src/main/resources/matrix-new-swagger.json')
You can generate sources from this definition with standard swagger-codegen. Swagger codegen CLI is in src/main/resouces. You can use gen.sh:
```
gen.sh src/main/resources/matrix-new-swagger.json
```
matrix-new-swagger.json is generated by [matrix-swagger-tools](https://github.com/tavoda/matrix-swagger-tools)

### Working on
* Writing tests for api calls
* Resolving inconsistencies (matrix-doc vs. reality of what synapse server returns)

### Waiting tasks

### Done
* Event inheritance and correct event type resolvement (x-discriminator-value)
* Tests for parsing local event files (event examples in src/test/resources)
* Parsing initial /sync response ;-)
* Writing tool for merging files [matrix-swagger-tools](https://github.com/tavoda/matrix-swagger-tools)
* Operation names (operationId)
* swagger-code-gen integration to Maven build process (pom.xml)

## Swagger editor
You can now use Swagger editor for testing. Online editor is available at http://editor.swagger.io/#/

File -> Import URL
```
https://raw.githubusercontent.com/tavoda/matrix-java/master/src/main/resources/matrix-new-swagger.json
```
