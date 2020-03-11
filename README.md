
This example was created using Spring Initializer.

See:
https://spring.io/guides/gs/spring-boot/

Steps to run:
1. Start XAP:
   a. In setenv-overrides.sh, export GS_MANAGER_SERVERS="localhost"
   b. gigaspaces-xap-enterprise-15.0.0/bin/gs.sh host run-agent --manager --gsc=4
   c. Deploy space: ./gs.sh space deploy --partitions=2 --ha mySpace
 

Basic gradle cheatsheet:
gradle clean
gradle build
./gradelw bootRun

gradle -q dependencies
