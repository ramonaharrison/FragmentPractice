package nyc.c4q.ramonaharrison.fragmentpractice;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private static final String TAG = "Lifecycle " + MainActivity.class.getSimpleName();

    EditText editText;

    Button button;

    BlueFragment blueFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        editText = (EditText) findViewById(R.id.activity_edit_text);
        button = (Button) findViewById(R.id.activity_button);

        addFragment();

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String myText = editText.getText().toString();
                blueFragment.setTextBox(myText);

            }
        });
    }

    public void addFragment() {
        blueFragment = new BlueFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.my_fragment_container, blueFragment);
        transaction.commit();
    }

    @Override
    protected void onStart()
    {
        Log.d(TAG, "onStart: ");
        super.onStart();
    }

    @Override
    protected void onResume()
    {
        Log.d(TAG, "onResume: ");
        super.onResume();
    }

    @Override
    protected void onPause()
    {
        Log.d(TAG, "onPause: ");
        super.onPause();
    }

    @Override
    protected void onStop()
    {
        Log.d(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy()
    {
        Log.d(TAG, "onDestroy: ");
        super.onDestroy();
    }
}

