# Setup

```
gradle build
java -jar build/libs/gobiiQCNotification.jar 
```

Receives QCNotification payloads from a KDCompute server configured to send QCNotification to your machine.
This is done by the following field in *application.properties*:

```
gobii.context.path.notification=http://<YOUR MACHINE'S IP>:8080/brapi/v1/instructions/qualitycontrol
```
