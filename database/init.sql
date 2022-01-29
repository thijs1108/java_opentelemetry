CREATE TABLE IF NOT EXISTS public.blog (
	id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
	writer varchar NOT NULL,
	title varchar NOT NULL,
	"content" varchar NOT NULL,
	CONSTRAINT blog_pk PRIMARY KEY (id)
);

INSERT INTO public.blog
(writer, title, "content")
VALUES('Thijs', 'Eerste blog', 'Welkom');
INSERT INTO public.blog
(writer, title, "content")
VALUES('Teuno', 'Ook welkom', 'Goedendag');

