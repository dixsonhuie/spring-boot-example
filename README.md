
This example was created using Spring Initializer.

See:
https://spring.io/guides/gs/spring-boot/

#### Steps to run:
##### Start XAP
  1. In setenv-overrides.sh, export GS_MANAGER_SERVERS="localhost"
  1. gigaspaces-xap-enterprise-15.0.0/bin/gs.sh host run-agent --manager --gsc=4
  1. Deploy space: ./gs.sh space deploy --partitions=2 --ha mySpace
##### Run Spring Boot
  1. ./gradlew bootRun
##### View in browser
  1. Open a browser to http://localhost:8080

#### Basic gradle cheatsheet:
 * gradle clean
 * gradle build
 * ./gradelw bootRun

 * gradle -q dependencies
