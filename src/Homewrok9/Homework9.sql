CREATE TABLE questions
(
question_id 		SERIAL 			PRIMARY KEY,
question 			VARCHAR(100) 	NOT NULL UNIQUE
);

CREATE TABLE answers
(
answer_id 		SERIAL 		PRIMARY KEY,
answer_text 	TEXT	 	NOT NULL UNIQUE,
correct_answer 	BOOLEAN 	NOT NULL,
question_id 	INTEGER 	REFERENCES questions (Question_id)
);

INSERT INTO questions (question)
VALUES ('Назовите столицу Франции'),
       ('Назовите столицу Мадагаскара'),
       ('Назовите столицу Непала'),
       ('Назовите столицу Казахстана');

INSERT INTO answers (answer_text, correct_answer, question_id)
VALUES ('Берлин', FALSE, 1),
('Париж', TRUE, 1),
    ('Лондон', FALSE, 1),
    ('Рим', FALSE, 1),
    ('Антананариву', TRUE, 2),
    ('Кейптаун', FALSE, 2),
    ('Москва', FALSE, 2),
    ('Каир', FALSE, 2),
    ('Катманду', TRUE, 3),
    ('Дели', FALSE, 3),
    ('Бангкок', FALSE, 3),
    ('Пекин', FALSE, 3),
    ('Астана', TRUE, 4),
    ('Алматы', FALSE, 4),
    ('Ташкент', FALSE, 4),
    ('Нур-Султан', FALSE, 4);
	   
SELECT q.question_id, q.question, a.answer_id, a.answer_text, a.correct_answer
FROM questions AS q
LEFT JOIN answers a ON q.question_id = a.question_id;


