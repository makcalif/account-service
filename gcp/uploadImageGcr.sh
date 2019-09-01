#!/bin/bash
cd ..
chmod 755 gradlew
./gradlew clean bootJar
cd gcp
docker build -t gcr.io/sparkarabic-251004/account-service:latest ..
docker push gcr.io/sparkarabic-251004/account-service:latest
