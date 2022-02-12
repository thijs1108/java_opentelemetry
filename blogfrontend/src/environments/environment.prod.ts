import { DiagLogLevel } from '@opentelemetry/api';

// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.

export const environment = {
  production: true,
  blogreaderEndpoint: "http://localhost:8081",
  blogwriterEndpoint: "http://localhost:8080",
  opentelemetryConfig: {
    commonConfig: {
      console: true, //(boolean) Display trace on console
      production: false, //(boolean) Send trace with BatchSpanProcessor (true) or SimpleSpanProcessor (false)
      logBody: true, //(boolean) true add body in a log, nothing otherwise
      serviceName: 'blogfrontend', //Service name send in trace
      probabilitySampler: '1', //Samples a configurable percentage of traces, string value between '0' to '1'
      logLevel:DiagLogLevel.ALL //(Enum) DiagLogLevel is an Enum from @opentelemetry/api
    },
    batchSpanProcessorConfig: { //Only if production = true in commonConfig
      maxQueueSize: '2048', // The maximum queue size. After the size is reached spans are dropped.
      maxExportBatchSize: '512', // The maximum batch size of every export. It must be smaller or equal to maxQueueSize.
      scheduledDelayMillis: '5000', // The interval between two consecutive exports
      exportTimeoutMillis: '30000', // How long the export can run before it is cancelled
    },
    otelcolConfig: {
      url: 'http://localhost:55681/v1/trace',// URL of http opentelemetry collector
    }
  }
};
