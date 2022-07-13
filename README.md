# operator-sdk-java-sample

Prerequisites
Operator SDK v1.8.0 or newer
Java 11
Maven 3.6.3 or newer

Use the Operator SDK CLI to create a new memcached-quarkus-operator project:
$ operator-sdk init --plugins quarkus --domain rama.com --project-name book

Create a new Custom Resource Definition (CRD) API with group cache, version v1, and Kind Book.
$ operator-sdk create api --plugins quarkus --group cache --version v1 --kind Memcached

Running mvn clean install will invoke the CRD generator extension which will analyze the annotations on the model objects and 
generate the CRD in target/kubernetes.

Run the jar 
java -jar target/quarkus-app/quarkus-run.jar

Apply the sample custom-resource file,now the control will be given to the controller layer.In the controller we can implement our own logic for the operator







