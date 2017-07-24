#!/bin/bash
# -DapiDocs=false -DmodelDocs=false
# -DapiTests=false -DmodelTests=false
rm -rf src/main/bash/*
java -jar src/main/resources/swagger-codegen-cli.jar generate -l bash -o src/main/bash/ -c src/main/resources/config-bash.json -i src/main/resources/matrix-new-swagger.json
