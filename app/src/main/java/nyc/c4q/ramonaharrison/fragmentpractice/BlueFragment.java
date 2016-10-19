package nyc.c4q.ramonaharrison.fragmentpractice;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class BlueFragment extends Fragment
{
    private static final String TAG = "Lifecycle " + BlueFragment.class.getSimpleName();

    EditText editText;

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        Log.d(TAG, "onAttach: ");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_blue, container, false);
        Log.d(TAG, "onCreateView: ");

        editText = (EditText) view.findViewById(R.id.fragment_edit_text);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated: ");
    }

    public void setTextBox(String myString)
    {
        editText.setText(myString);
    }

    @Override
    public void onStart()
    {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    public void onResume()
    {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    public void onStop()
    {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
        Log.d(TAG, "onDetach: ");
    }

    @Override
    public void onDestroyView()
    {
        Log.d(TAG, "onDestroyView: ");
        super.onDestroyView();
    }

    @Override
    public void onDestroy()
    {
        Log.d(TAG, "onDestroy: ");
        super.onDestroy();
    }
}
