import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Blog } from 'src/app/model/blog';
import { BlogService } from 'src/app/service/blog.service';

@Component({
  selector: 'app-bloglist',
  templateUrl: './bloglist.component.html',
  styleUrls: ['./bloglist.component.css']
})
export class BloglistComponent implements OnInit {

  blogs: Array<Blog>

  constructor(private blogservice: BlogService) { }

  ngOnInit(): void {
     this.blogservice.getBlogs().subscribe(blogs => this.blogs=blogs)
  }

}
