INSERT into POST (id, title, content, author) VALUES (1, 'MIU','Life is structured in layers','Dean');
INSERT into POST (id, title, content, author) VALUES (2, 'React','React is a good SPA library','Dean');
INSERT into POST (id, title, content, author) VALUES (3, 'Spring','Spring is awesome','Dean');
INSERT into POST (id, title, content, author)  VALUES (4, 'SpringBoot','This is a module that works over spring modules','John');
INSERT into POST (id, title, content, author) VALUES (5, 'fifth','Spring is awesome','Bob');
INSERT into POST (id, title, content, author) VALUES (6, 'sixth','Spring is awesome','Bob');

-- 1234
INSERT into USER (id, name, username, password, IS_Enabled)  VALUES (111, 'Admin','admin','$2a$12$S6yoRZrOwrYS7JVYC231L.Tkac/Z2iYRfVpIpiAcI0ldhmEAVA72i',true);
INSERT into USER (id, name, username, password, IS_Enabled)  VALUES (112, 'User','user','$2a$12$S6yoRZrOwrYS7JVYC231L.Tkac/Z2iYRfVpIpiAcI0ldhmEAVA72i',true);


INSERT into USER_POSTS (USER_ID, POSTS_ID) VALUES (111, 1);
INSERT into USER_POSTS (USER_ID, POSTS_ID) VALUES (111, 2);
INSERT into USER_POSTS (USER_ID, POSTS_ID) VALUES (111, 3);
INSERT into USER_POSTS (USER_ID, POSTS_ID) VALUES (112, 4);
INSERT into USER_POSTS (USER_ID, POSTS_ID) VALUES (112, 5);
INSERT into USER_POSTS (USER_ID, POSTS_ID) VALUES (112, 6);

INSERT INTO ROLE(ROLE_ID, ROLE) VALUES (1, 'USER');
INSERT INTO ROLE(ROLE_ID, ROLE) VALUES (2, 'ADMIN');

insert into USER_ROLES(USER_ID, ROLE_ID) values (111, 2);
insert into USER_ROLES(USER_ID, ROLE_ID) values (112, 1);