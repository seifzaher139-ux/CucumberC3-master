# Cucumber BDD Practice

A practice project for BDD with Cucumber, Selenium, and TestNG (Java). It was written while learning Cucumber.

## What is covered

- Sauce Demo login (`Login.feature`)
- OrangeHRM login with a data table (`login1.feature`, `login2.feature`, `login3.feature`)
- Tags such as `@smoke`, `@Login`, and `@regression`
- Three TestNG runners (`TestRunner`, `LoginRunner`, `SmokeRunner`); the smoke runner runs only `@smoke` scenarios

## Tools

- Java 17
- Cucumber 7
- Selenium WebDriver
- TestNG
- Maven

## Structure

- `src/test/resources/features`: feature files
- `src/test/java/steps`: step definitions
- `src/test/java/hooks`: browser setup and teardown
- `src/test/java/testRunners`: runners
- `src/main/java/pages`: page objects

## How to run

You need Java 17, Maven, and Chrome. Run a runner class from the IDE, or use Maven:

```
mvn test
```

Note: this is a learning project. Some scenarios are repeated on purpose to practice running tags.
