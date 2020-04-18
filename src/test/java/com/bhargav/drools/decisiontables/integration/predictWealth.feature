@predictWealth
Feature: Test integration of Drools

Scenario: predictWealth
    Given url baseUrl + '/predictWealth'
    And request { monthlyIncome: 120 }
    When method post
    Then status 200
    And match response == { monthlyIncome : 120, predictedWealth: { status : 'MiddleClass' } }
