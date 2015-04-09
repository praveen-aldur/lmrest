package lmRestApi;
 import java.io.IOException;
 import org.testng.AssertJUnit;
 import org.testng.annotations.AfterClass;
 import org.testng.annotations.Test;
 import org.testng.annotations.AfterMethod;
 import org.testng.annotations.BeforeMethod;
 import org.json.JSONException;

  public class TestCollection extends BaseTasking {
  
  @BeforeMethod
  public void SetUpTest(){
     }
   @Test(dataProvider="MyData",enabled=true)//Test-001
   public void TC01_01(String TcNumber,String Environment,String MethodName,String Parameter1,
     String Parameter1, String OtherParameters,String Execute) throws JSONException, IOException{
    
    super.TCNUM= TcNumber;super.Environment=Environment.trim();super.MethodName=MethodName.trim();super.Parameter1=parameter1.trim();super.Parameter2=Parameter2.trim();super.OtherParameters=OtherParameters.trim();super.Execute=Execute;
    ExecutionCheck();
    String Status[]=CallHttpMethod();
    AssertJUnit.assertTrue(Status[1],Status[0].equalsIgnoreCase("PASS"));
   }
  
   @Test(dataProvider="MyData",enabled=true)//Test-002
   public void TC01_02(String TcNumber,String Environment,String MethodName,String Parameter1,
     String Parameter1, String OtherParameters,String Execute) throws JSONException, IOException{
    
    super.TCNUM= TcNumber;super.Environment=Environment.trim();super.MethodName=MethodName.trim();super.Parameter1=parameter1.trim();super.Parameter2=Parameter2.trim();super.OtherParameters=OtherParameters.trim();super.Execute=Execute;
    ExecutionCheck();
    String Status[]=CallHttpMethod();
    AssertJUnit.assertTrue(Status[1],Status[0].equalsIgnoreCase("PASS"));
   }
   
   @Test(dataProvider="MyData",enabled=true)//Test-003
   public void TC01_03(String TcNumber,String Environment,String MethodName,String Parameter1,
     String Parameter1, String OtherParameters,String Execute) throws JSONException, IOException{
    
    super.TCNUM= TcNumber;super.Environment=Environment.trim();super.MethodName=MethodName.trim();super.Parameter1=parameter1.trim();super.Parameter2=Parameter2.trim();super.OtherParameters=OtherParameters.trim();super.Execute=Execute;
    ExecutionCheck();
    String Status[]=CallHttpMethod();
    AssertJUnit.assertTrue(Status[1],Status[0].equalsIgnoreCase("PASS"));
   }
   
   @Test(dataProvider="MyData",enabled=true)//Test-004
   public void TC01_04(String TcNumber,String Environment,String MethodName,String Parameter1,
     String Parameter1, String OtherParameters,String Execute) throws JSONException, IOException{
    
    super.TCNUM= TcNumber;super.Environment=Environment.trim();super.MethodName=MethodName.trim();super.Parameter1=parameter1.trim();super.Parameter2=Parameter2.trim();super.OtherParameters=OtherParameters.trim();super.Execute=Execute;
    ExecutionCheck();
    String Status[]=CallHttpMethod();
    AssertJUnit.assertTrue(Status[1],Status[0].equalsIgnoreCase("PASS"));
   }
   
   @AfterMethod
   public void TearDown() {
    System.out.println("************************************End of Test"+TCNUM+"************************************\n\n");
   }
   
   @AfterClass
   public static void TearDownTest(){
    System.out.println("Test Complete");
   }
  }
