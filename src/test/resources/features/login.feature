Feature: Login Scenarios for automationexercise website

  @CP1_login @smoke
  Scenario: Login exitoso con usuario comun
    Given el usuario se encuentra en la pagina web de automationexercise
    When inicia sesion con email "cinthia.test2026@test.com" y password "123456"
    Then se encuentra en el home de automationexercise