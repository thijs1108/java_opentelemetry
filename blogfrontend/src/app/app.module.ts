import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BloglistComponent } from './component/bloglist/bloglist.component';
import { HttpClientModule } from '@angular/common/http';
import { BlogFormComponent } from './component/blog-form/blog-form.component';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { CompositePropagatorModule, OpenTelemetryInterceptorModule, OtelColExporterModule } from '@jufab/opentelemetry-angular-interceptor';
import { environment } from 'src/environments/environment';

@NgModule({
  declarations: [
    AppComponent,
    BloglistComponent,
    BlogFormComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    OpenTelemetryInterceptorModule.forRoot(environment.opentelemetryConfig),
    OtelColExporterModule,
    CompositePropagatorModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
