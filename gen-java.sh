#!/bin/bash
# -DapiDocs=false -DmodelDocs=false
# -DapiTests=false -DmodelTests=false
rm -rf src/main/java/* docs/ src/test/java/org/matrix/client/api/
java -jar src/main/resources/swagger-codegen-cli.jar generate -l java -c src/main/resources/config-java.json -i src/main/resources/matrix-new-swagger.json
rm -rf gradle

