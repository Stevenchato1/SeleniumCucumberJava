Feature: Navigation bar
    To see the subpages
    Whithout logging in
    I can click the navigation bar links

    Scenario Outline: I can access the subpages through the navigation bar
        Given I navigate to www.freerangertesters.com
        When I go to <section> using the navigation bar
        Examples:
            | section   |
            | Cursos    |
            | Recursos  |
            | Udemy     |




