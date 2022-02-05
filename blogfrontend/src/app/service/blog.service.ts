import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Blog } from '../model/blog';

@Injectable({
  providedIn: 'root'
})
export class BlogService {

  constructor(private http: HttpClient) { }

  getBlogs(): Observable<Array<Blog>> {
    return this.http.get<Blog[]>(environment.blogreaderEndpoint+"/blog")
  }

  createBlog(blog) {
    this.http.post(environment.blogwriterEndpoint+"/blog", blog).subscribe()
  }
}
