INSERT INTO book(cost, name) values (500, 'Nightcrawling');
INSERT INTO book(cost, name) values (700, '22 Seconds');
INSERT INTO book(cost, name) values (900, 'The Midnight Library');
INSERT INTO book(cost, name) values (1000, 'The Summer Place');
INSERT INTO book(cost, name) values (2000, 'The Last Thing He Told Me');
INSERT INTO book(cost, name) values (3000, 'One Italian Summer');
INSERT INTO book(cost, name) values (4000, 'Dream Town');
INSERT INTO book(cost, name) values (5000, 'The Paris Apartment');

INSERT INTO author(name) values ('Leila Mottley');
INSERT INTO author(name) values ('James Patterson');
INSERT INTO author(name) values ('Maxine Paetro');
INSERT INTO author(name) values ('Matt Haig');
INSERT INTO author(name) values ('Jennifer Weiner');
INSERT INTO author(name) values ('Laura Dave    ');
INSERT INTO author(name) values ('Rebecca Serle');
INSERT INTO author(name) values ('David Baldacci');
INSERT INTO author(name) values ('Lucy Foley');

INSERT INTO book_author(book_id, author_id) values (1, 1);
INSERT INTO book_author(book_id, author_id) values (2, 2);
INSERT INTO book_author(book_id, author_id) values (3, 3);
INSERT INTO book_author(book_id, author_id) values (4, 4);
INSERT INTO book_author(book_id, author_id) values (5, 6);
INSERT INTO book_author(book_id, author_id) values (5, 1);
INSERT INTO book_author(book_id, author_id) values (5, 5);
INSERT INTO book_author(book_id, author_id) values (6, 2);
INSERT INTO book_author(book_id, author_id) values (6, 6);
INSERT INTO book_author(book_id, author_id) values (6 ,8);
INSERT INTO book_author(book_id, author_id) values (7, 7);
INSERT INTO book_author(book_id, author_id) values (7, 8);
INSERT INTO book_author(book_id, author_id) values (7, 9);
INSERT INTO book_author(book_id, author_id) values (8, 8);