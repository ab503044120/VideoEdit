package org.huihui.videoedit;

import android.os.Bundle;
import android.widget.TextView;

import org.huihui.videoedit.databinding.ActivityMainBinding;
import org.huihui.videoedit.mlt.Properties;
import org.huihui.videoedit.mlt.mltJNI;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    // Used to load the 'videoedit' library on application startup.
    static {
        System.loadLibrary("mlt-7");
        System.loadLibrary("mlt++-7");
        System.loadLibrary("videoedit");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(stringFromJNI());
        mltJNI.new_UnsignedCharArray(0);
        new Properties();

    }

    /**
     * A native method that is implemented by the 'videoedit' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}