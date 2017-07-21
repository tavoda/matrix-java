#!/bin/bash
# -DapiDocs=false -DmodelDocs=false
# -DapiTests=false -DmodelTests=false
rm -rf src/main/java/* docs/ src/test/java/org/matrix/client/api/
java -jar ~/opt/swagger-codegen-cli.jar generate -l java -c src/main/resources/config-java.json -i $1
rm -rf gradle

