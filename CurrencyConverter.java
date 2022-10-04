import java.util.Scanner;
import java.net.HttpURLConnection;
import java.util.HashMap;
import com.squareup.okhttp.OkHttpClient;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.sbtqa.tag.parsers.JsonParser; 
import java.net.URL;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CurrencyConverter
{
    public static void main(String[] args)
    {
        HashMap<Integer , String> Currencycodes = new HashMap<Integer , String>();
        
        //HashMap<Key, Value> HashmapName = new HashMap<Int, String>()---> Datatypes of input values

        Currencycodes.put(1, "INR");
        Currencycodes.put(2, "USD");
        Currencycodes.put(3, "CAD");
        Currencycodes.put(4, "EUR");
        Currencycodes.put(5, "HKD");

        String fromCode , toCode ;
        double amount;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");

        System.out.println("Currency Converting from?");

        System.out.println("1. INR \t 2. USD \t 3. CAD \t 4. EUR \t 5. HKD");
        fromCode = Currencycodes.get(sc.nextInt());

        System.out.println("Currenct Converting to?");

        System.out.println("1. INR \t 2. USD \t 3. CAD \t 4. EUR \t 5. HKD");
        toCode = Currencycodes.get(sc.nextInt());

        System.out.println("Amount you wish to convert?");
        amount= sc.nextDouble();

        System.out.println("Thanks for using Currency Converter.");
        sendHttpGETRequest(fromCode,toCode,amount);

    }
    private static void sendHttpGETRequest(String fromCode, String toCode, double amount)
    {
        double INR= 81.6;
        double USD= 1;
        double CAD= 1.38;
        double EUR= 1.02;
        double HKD= 7.85;

        switch(fromCode){
            case "USD":
            if(toCode=="INR"){
                double convertedvalue=amount * INR/USD;
                System.out.println(convertedvalue);
            }
            if(toCode=="CAD"){
                double convertedvalue=amount * CAD/USD;
                System.out.println(convertedvalue);
            }
            if(toCode=="EUR"){
                double convertedvalue=amount * EUR/USD;
                System.out.println(convertedvalue);
            }
            if(toCode=="HKD"){
                double convertedvalue=amount * HKD/USD;
                System.out.println(convertedvalue);
            }
            break;
            case "INR":
            if(toCode=="USD"){
                double convertedvalue=amount * USD/INR;
                System.out.println(convertedvalue);
            }
            if(toCode=="CAD"){
                double convertedvalue=amount * CAD/INR;
                System.out.println(convertedvalue);
            }
            if(toCode=="EUR"){
                double convertedvalue=amount * EUR/INR;
                System.out.println(convertedvalue);
            }
            if(toCode=="HKD"){
                double convertedvalue=amount * HKD/INR;
                System.out.println(convertedvalue);
            }
            break;
            //Next Case
            case "CAD":
            if(toCode=="USD"){
                double convertedvalue=amount * USD/CAD;
                System.out.println(convertedvalue);
            }
            if(toCode=="INR"){
                double convertedvalue=amount * INR/CAD;
                System.out.println(convertedvalue);
            }
            if(toCode=="EUR"){
                double convertedvalue=amount * EUR/CAD;
                System.out.println(convertedvalue);
            }
            if(toCode=="HKD"){
                double convertedvalue=amount * HKD/CAD;
                System.out.println(convertedvalue);
            }
            break;
            //Next Case
            case "EUR":
            if(toCode=="HKD"){
                double convertedvalue=amount * HKD/EUR;
                System.out.println(convertedvalue);
            }

            if(toCode=="CAD"){
                double convertedvalue=amount * CAD/EUR;
                System.out.println(convertedvalue);
            }

            if(toCode=="INR"){
                double convertedvalue=amount * INR/EUR;
                System.out.println(convertedvalue);
            }

            if(toCode=="USD"){
                double convertedvalue=amount * USD/EUR;
                System.out.println(convertedvalue);
            }
            break;
            //Next Case
            case "HKD":
            if(toCode=="USD"){
                double convertedvalue=amount * USD/HKD;
                System.out.println(convertedvalue);
            }
            if(toCode=="INR"){
                double convertedvalue=amount * INR/HKD;
                System.out.println(convertedvalue);
            }
            if(toCode=="CAD"){
                double convertedvalue=amount * CAD/HKD;
                System.out.println(convertedvalue);
            }
            if(toCode=="EUR"){
                double convertedvalue=amount * EUR/HKD;
                System.out.println(convertedvalue);
            }
        }
      
    }
}