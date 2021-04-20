package LoginSteps;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public
class LoginSteps {
    @Given ( "I navigate to the login page" )
    public
    void iNavigateToTheLoginPage ( ) {
        System.out.println ( "hello world" );
    }

    @And ( "I click login button" )
    public
    void iClickLoginButton ( ) {
        System.out.println ( "hello world" );
    }

    @Then ( "I should see the userform page" )
    public
    void iShouldSeeTheUserformPage ( ) {
        System.out.println ( "hello world" );
    }


    @And ( "I enter the following for Login" )
    public
    void iEnterTheFollowingForLogin(DataTable table) {
      List<List<String>> data = table.asLists ();
        System.out.println("The Value is : " + data.get(0).get(0));
        System.out.println("The Value is : " + data.get(0).get(1));

    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public
    void iEnterUsernameAndPassword (String username , String password  ) {
        System.out.println("UserName is : " + username);
        System.out.println("Password is : " + password);
    }


}