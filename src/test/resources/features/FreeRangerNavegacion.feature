Feature: Navigation bar
    To see the subpages
    Whithout logging in
    I can click the navigation bar links

    #Scenario Outline: I can access the subpages through the navigation bar
     #   Given I navigate to www.freerangertesters.com
      #  When I go to <section> using the navigation bar
       # Examples:
        #    | section   |
         #   | Cursos    |
          #  | Recursos  |
           # | Udemy     |


    #Scenario: Courses are presented correctly to potential customers
     #   Given I navigate to www.freerangertesters.com
      #  When I go to Cursos using the navigation bar
       # And I should see the section

    Scenario: Users can select a plan when signing up
        Given I navigate to www.freerangertesters.com
        When I select Elegir plan
        Then I validate dropDown