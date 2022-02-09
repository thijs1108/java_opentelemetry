 #!/bin/bash
export OTEL_EXPORTER_OTLP_ENDPOINT=http://localhost:8200
java -javaagent:blogreader/opentelemetry-javaagent.jar -jar blogreader/target/blogreader-0.0.1-SNAPSHOT.jar 

