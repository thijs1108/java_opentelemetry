import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { BlogService } from 'src/app/service/blog.service';

@Component({
  selector: 'app-blog-form',
  templateUrl: './blog-form.component.html',
  styleUrls: ['./blog-form.component.css']
})
export class BlogFormComponent implements OnInit {

  blogForm

  constructor(
    private formBuilder: FormBuilder,
    private blogService: BlogService
  ) {
    this.blogForm = this.formBuilder.group({
      writer: "",
      title: "",
      content: ""
    })
   }

  ngOnInit(): void {
    
  }

  onSubmit(blog): void {
    this.blogService.createBlog(blog)
  }

}
