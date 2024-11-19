Feature: Navigation bar
 To see the subpages
 Without logging in
 I can click the navigation bar links
@Courses
Scenario: I can access the subpages through the navigation bar
  Given navegar a free www.freerangetesters.com
  When Seleccionar en el Navigate bar Cursos
  And Seleccionar Fundamentos Testing

@Google
  Scenario: Usuario navega a Google
    Given I navigate to www.freerangetesters.com
    When Selecciona recursos
    And seleccionar el Automation Sandbox