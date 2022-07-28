@WIP
Feature: Library app login feature
  User Story: As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: librarian, student, admin
  #It is similar to TestNG @Before Method. Background runs before each scenario
 # Background:For each scenario the user is on the library login page
    #We can add only first running step or steps that is the same in all scenarios


  @Librarian  @student
  Scenario: Login as librarian
    Given user is on the library login page
    #Given user is on the library login page

