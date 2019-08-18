import org.testng.annotations.Test;

public class TestNG {
    @Test
    public void Preconditions(){
        System.out.println("Precondition");
  }
    @Test(priority = 1)
    public void MyText(){
        System.out.println("Running Test");
   }
    @Test(priority = 2)
    public void CloseConnection(){
       System.out.println("Close test");
    }
    @Test(priority = 0)
    public void login(){
        System.out.println("Login");
    }

    @Test
    public void searchProduct(){
        System.out.println("Search Product");
    }

    @Test(dependsOnMethods = "searchProduct")
    public void addToCart(){
        System.out.println("Add to Cart");
    }

    @Test(dependsOnMethods = "addToCart")
    public void checkOutCart(){
        System.out.println("Check Our Cart");
    }

    @Test(priority = 1)
    public void connect(){
        System.out.println("Connect to payment gateway");
    }
}
