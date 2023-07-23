
Feature: Home Page
  As user I want to search the job in cv library website

@smoke
  Scenario Outline: User should navigate to Login page successfully
    Given I am on homepage
    When I  enter job title "<jobTitle>"
    And I  enter Location "<location>"
    And I select distance "<distance>"
    And  I click on moreSearchOptionsLink
    And I  enter salaryMin "<salaryMin>"
    And  I enter salaryMax "<salaryMax>"
    And I select salaryType "<salaryType>"
    And I select jobType "<jobType>"
    And I click on Find job button
    Then I should see the result "<result>"
    Examples:
      |jobTitle   |location   |distance   |salaryMin  |salaryMax  |salaryType | jobType         |result   |
      |Tester     | Harrow    |5 miles    | 30000     | 50000     | Per annum | Permanent       |Permanent Tester jobs in Harrow |
      |Tester     | Dublin    | 10 miles  | 4500      | 5500      |Per month  | Contract        |Contract Tester jobs in Dublin  |
      |Tester     | London    | 15 miles  | 100       | 200       |Per week   | Part Time       |Part Time Tester jobs in London |
      |Tester     | Derby     | 25 miles  | 180       | 200       |Per day    |Temporary        |Temporary Tester jobs in Derby  |
      |Tester     |Bradford   |35 miles   |20         | 25        | Per hour  | Apprenticeship  |Apprenticeship Tester jobs in Bradford|
      |Tester     | Belfast   | 50 miles  |45000      | 55000     | Per annum | Permanent       |Permanent Tester jobs in Belfast      |