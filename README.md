# Proyecto Automatizacion Web - Serenity BDD

## Descripcion
Automatizacion de pruebas WEB para
Login usando Serenity BDD + Cucumber +
Screenplay.

Pagina: https://automationexercise.com/

## Estructura
- features / login.feature -> Escenarios
- StepDefinitions / LoginStepDefinition.java -> Pasos
- Tasks -> LoginTask
- Questions / LoginExitoso.java -> Validacion de login
- Pages / HomePage.java, LoginPage.java -> Elementos de la pagina

## Escenarios
- CP01: Login exitoso con credenciales validas
- CP02: Login fallido con credenciales invalidas

## Como ejecutar
mvn clean verify

## Reporte
target/site/serenity/index.html