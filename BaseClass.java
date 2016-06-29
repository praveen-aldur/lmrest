package lmRestApi;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.Properties;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;


public class BaseClass {
 
 static DefaultHttpClient httpClient;
 BufferedReader br=null;
 HttpResponse response=null;
 String URL=null;
 String AuthenticationKey=null;
 
 String TCNUM=null; 
 String Environment=null;
 String MethodName=null;
 String Parameter1=null;
 String Parameter2=null;
 String OtherParameters=null;
 public static String Execute=null;
 
 /* This is to identify feature * / 
 @BeforeSuite
 public static void SetUpSuite(){ 
  /*Action to be performed before running the suite, ex: DataSetup*/
 }
 
 @AfterSuite
 public static void TearupSuite(){
  /*Action to be performed after running the suite, ex: Files closing*/
 }
 
  
 @DataProvider(name = "MyData")
 public static Object[][] dataProvider(Method meth) throws IOException {
  
  /*
   call the Excel Reader class and get the test input data for the calling test case.
   
   Use 'TCNUM'(TestCase number) as the Key and map it to the row number in the excel sheet uniquely to get the correct data for the test case.
   
   Use Java Reflections to return data to the calling test method based on the test method name.
   refer this link for more info for the logic: http://www.mkyong.com/unittest/testng-tutorial-6-parameterized-test/
   
   return a single record of type Object[][]
   
   return  Object[][];
 }
 
  
 /*Execution Check*/
 public void ExecutionCheck(){
  if(Execute.equalsIgnoreCase("N"))
   throw new SkipException("Skipping - This Test case was aksed to be SKIPPED ");
 }
 
 
 /*TestMethod logic implementation*/
 
 public String[] CallHttpMethod(){
  /*
   1) construct the URI string using the parameters(ServerAddress, MethodName,Parameters1,Parameter2 and OtherParameters)
    by calling 'getURL' method.
   2) Add Headers (Authentication Key, Accept)
   3) Call Apache 'GET'/'POST'/'PUT'/'DELETE' passing the created URI.
   4) Read the JSON response.
   5) Pass the JSON response to the 'ResultValidator' class.
   6) Get the Validation results back with error message if Failed.
    
  
   return ValidationResults;
   
   */
 }// 
 
  
 
  public String getURL(){
   int option=0;
   String CompleteURL=null;
   if(MethodName.equalsIgnoreCase("Method1")) option=1;
   else if(MethodName.equalsIgnoreCase("Method2")) option=2;
   else if(MethodName.equalsIgnoreCase("Method3")) option=3;
   
   switch(option){
   case 1:  
     CompleteURL="http://"+"xx.xx.xx.xxx:80"+"/v1/meth1/getMydupe/"+Parameter1+"?"+"Ids="+Parameter2+"&"+OtherParameters;
     break;
     
   case 2: CompleteURL="http://"+"xx.xx.xx.xxx:85"+"/v2/meth2/getMydupe/"+Parameter1+"?"+"Ids="+Parameter2+"&"+OtherParameters;
     break;
        
   case 3: CompleteURL="http://"+"xx.xx.xx.xxx:80"+"/v3/meth3/getMydupe/"+Parameter1+"?"+"Ids="+Parameter2+"&"+OtherParameters;
     break;   
       
   }
   
   return CompleteURL;
  }
 
 }
