@US205TC001
Feature:
  Scenario: As a manager, I should be able to search room with valid room data.
    Given User is on Home Page
    And Click on Log in link
    And Click on user name text box and type it "manager2"
    And Click on password name text box and type it "Man1ager2!"
    And Click login button
    And Click on System Management dropdown button
    And Click on the room reservation button
    And Click on ContactNameSurname textbox and type valid name	"ELENI ILIADA"
    And Click on ContactPhone textbox and type valid phone number	"(306) 987-7121"
    And Click on Search button
    Then Verify the message of mail  "eleniiliada@gmail.com"