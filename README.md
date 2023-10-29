# task2.1
**Задача:**
2.1 API-автотесты
Написать API - автотесты для сайта https://petstore.swagger.io/ по одному методу из любых блоков (GET,PUT,POST,DELETE). 

Ожидаем выполнение данной задачи со следующим стеком технологий:

Java
Junit
Maven
Rest Assured
Allure

**Структура проекта:**
файл с самим тестом(PetstoreApiTest.java) должен лежать в папке: *название проекта*\src\main\java (обусловленно тем что язык java имеет строгую структуру директориий)
pom.xml- файл описания зависимостей для JUnit, Rest Assured и Allure
settings.xml- файл с настройками

Обратите внимание, что в коде выполняется GET-запрос для получения информации о животном с ID=1.

**Запуск теста и создание отчета:**
Выполните следующие команды в командной строке для запуска теста и создания отчета с использованием Allure:

_mvn clean test
mvn allure:serve_

После выполнения этих команд, вы увидите отчет Allure с результатами вашего автотеста.
