package examples.aaronhoskins.com.firstdaydemo;
//the directory

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements IDogCallback {
    TextView tvInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvInfo = findViewById(R.id.tvInfo);

        Dog dog = new Dog(100,
                "Dog",
                true,
                "blonde",
                "large",
                "Husky" ,
                this);
        dog.setAge(2);
        dog.generateDogInfo();
        ArrayList<String> listToPrint = getArrayList();
        for(String s : listToPrint) {
            Log.d("TAG", "onCreate: " + s);
        }

        HashMap<String, Integer> map = getHashMap();

        Log.d("TAG_MAP", "onCreate: " + map.get("valueTwo"));

        for(String key : map.keySet()){
            Log.d("TAG_MAP",
                    "onCreate: key = " + key + " Value = " + map.get(key));
        }
    }


    @Override
    public void getDogInfo(Dog theDogInfo) {
        final String dogInfoString =
                String.format("Breed: %s | age: %d"
                        , theDogInfo.getBreed(), theDogInfo.getAge());

        tvInfo.setText(dogInfoString);
    }

    private ArrayList<String> getArrayList() {
        ArrayList<String> returnList = new ArrayList<>();

        returnList.add("Sam");
        returnList.add("Aaron");
        returnList.add("William");

        return returnList;
    }

    private HashMap<String, Integer> getHashMap() {
        HashMap<String, Integer> returnMap = new HashMap<>();
        returnMap.put("valueOne", 1);
        returnMap.put("valueTwo", 2);
        returnMap.put("valueThree", 3);
        returnMap.put("valueFour", 4);

        return returnMap;
    }
}
