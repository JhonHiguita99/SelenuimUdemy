Feature: Navigation bar
 To see the subpages
 Without logging in
 I can click the navigation bar links
@Courses
Scenario: I can access the subpages through the navigation bar
  Given I navigate to www.freerangetesters.com
  When Seleccionar en el Navigate bar Cursos
  And Seleccionar Funamentos Testing

@Plans
  Scenario: Users can select a plan when signing up
    Given I navigate to www.freerangetesters.com
    When I select Elegir Plan
    Then I can validate the options in the chechout page