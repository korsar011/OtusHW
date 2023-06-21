CREATE TABLE questions
(
Question_id 		SERIAL 			PRIMARY KEY,
Question 			VARCHAR(100) 	NOT NULL UNIQUE
);

CREATE TABLE answers
(
Answer_id 		SERIAL 		PRIMARY KEY,
Answer_text 	TEXT [] 	NOT NULL UNIQUE,
Correct_answer 	INTEGER 	NOT NULL,
Question_id 	INTEGER 	REFERENCES questions (Question_id)
);

INSERT INTO questions (question)
VALUES ('Вопрос 1. Назовите столицу Франции'),
       ('Вопрос 2. Назовите столицу Мадагаскара'),
       ('Вопрос 3. Назовите столицу Непала'),
       ('Вопрос 4. Назовите столицу Казахстана');

INSERT INTO answers (answer_text, Correct_answer, question_id)
VALUES ('{1. Берлин, 2. Лондон, 3. Париж, 4. Лиссабон}', 3, 1),
       ('{1. Антананариву, 2. Кейптаун, 3. Каир, 4. Аккра}', 1, 2),
       ('{1. Дели, 2. Бангкок, 3. Катманду, 4. Покхара}', 3, 3),
       ('{1. Алма-Ата, 2. Усть-Каменогорск, 3. Бишкек, 4. Астана}', 4, 4);
	   
SELECT q.question_id, q.question, a.answer_id, a.answer_text, a.correct_answer
FROM questions AS q
LEFT JOIN answers a ON q.question_id = a.question_id;
