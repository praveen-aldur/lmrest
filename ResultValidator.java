package lmRestApi;
 import org.json.JSONArray;
 import org.json.JSONException;
 import org.json.JSONObject;
 
 public class ResultValidator {
  
  public String[] Validate(String testcaseNum, String ActualJson,
          String HeaderMessage, int ActualRespCode ) throws JSONException{
   
   String Flag="Fail";
   String ReportMessage="";
    switch(testcaseNum){ 
    
    
       case TC01_01:
        { 
         /*   
          Logic for validating your Actual results against the expected results.
          use GSON to extract JSON value and use it to compare against the expected values.
          use flags and indicators to set the validation status to 'Pass' or 'Fail'
          
          do not use assertions, instead use if-else to compare the results.
          finally return a 1D string array with
          Str[0] having the value 'Pass'/'Fail'--> Flag
          Str[1] having the error message detailing why the validation failed--> ReportMessage
          
          */
         break;
        }
        
       
        case 2:
        { 
         /*   
          Logic for validating your Actual results against the expected results.
          use GSON to extract JSON value and use it to compare against the expected values.
          use flags and indicators to set the validation status to 'Pass' or 'Fail'
          
          do not use assertions, instead use if-else to compare the results.
          finally return a 1D string array with
          Str[0] having the value 'Pass'/'Fail'--> Flag
          Str[1] having the error message detailing why the validation failed--> ReportMessage
          
          */
         break;
        }
      
        case 3:
        { /*   
          Logic for validating your Actual results against the expected results.
          use GSON to extract JSON value and use it to compare against the expected values.
          use flags and indicators to set the validation status to 'Pass' or 'Fail'
          
          do not use assertions, instead use if-else to compare the results.
          finally return a 1D string array with
          Str[0] having the value 'Pass'/'Fail'--> Flag
          Str[1] having the error message detailing why the validation failed--> ReportMessage
          
          */
         break;
        }
      
        
        
        case 4:
        {/*   
          Logic for validating your Actual results against the expected results.
          use GSON to extract JSON value and use it to compare against the expected values.
          use flags and indicators to set the validation status to 'Pass' or 'Fail'
          
          do not use assertions, instead use if-else to compare the results.
          finally return a 1D string array with
          Str[0] having the value 'Pass'/'Fail'--> Flag
          Str[1] having the error message detailing why the validation failed--> ReportMessage
          
          */
         break;
        }// End of Group-4
        
        default:
          {
           System.out.println("invalid Test case Number");
          }
   
    }//End of Switch
   
    Flags[0]=Flag;
    Flags[1]=ReportMessage;
    
   return  Flags;
  }

  }
