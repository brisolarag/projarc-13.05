INSERT INTO editora (codigo, nome) VALUES (210, 'Bookman');
INSERT INTO editora (codigo, nome) VALUES (220, 'McGraw-Hill');

INSERT INTO autor (numero, nome, ano_nascimento) VALUES (100, 'Fulano1', 2000);
INSERT INTO autor (numero, nome, ano_nascimento) VALUES (101, 'Fulano2', 2001);
INSERT INTO autor (numero, nome, ano_nascimento) VALUES (102, 'Fulano3', 2002);
INSERT INTO autor (numero, nome, ano_nascimento) VALUES (103, 'Fulano4', 2003);

INSERT INTO livro (id, editora_codigo, titulo, autor_numero, ano) VALUES (110, 210, 'Aprendendo Java', 100, 2015);
INSERT INTO livro (id, editora_codigo, titulo, autor_numero, ano) VALUES (120, 220, 'Spring-Boot', 101, 2020);
INSERT INTO livro (id, editora_codigo, titulo, autor_numero, ano) VALUES (130, 220, 'Principios SOLID', 102, 2023);
INSERT INTO livro (id, editora_codigo, titulo, autor_numero, ano) VALUES (140, 210, 'Padroes de Projeto', 103, 2023);
INSERT INTO livro (id, editora_codigo, titulo, autor_numero, ano) VALUES (150, 210, 'Teste Unitario', 103, 2024);


