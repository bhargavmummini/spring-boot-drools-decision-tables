@predictWealth
Feature: Test integration of Drools

Scenario: predictWealth
    Given url baseUrl + '/predictWealths'
    And request [{ monthlyIncome: 120 }, { monthlyIncome: 512 }, { monthlyIncome: 1112 }]
    When method post
    Then status 200
    And match response == [{ monthlyIncome: 120, predictedWealth: { status : 'MiddleClass' } }, { monthlyIncome: 512, predictedWealth: { status : 'AboveMiddleClass' } }, { monthlyIncome: 1112, predictedWealth: { status : 'RicheRich' } }]
