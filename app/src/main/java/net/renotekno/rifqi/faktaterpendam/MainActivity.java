package net.renotekno.rifqi.faktaterpendam;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String FACT_TEXT = "fact_text" ;
    private static final String FACT_COLOR = "fact_color";
    private TextView mFactText;
    private Button mFactButton;
    private RelativeLayout mRelativeLayout;
    private FactObject factObject = new FactObject();;
    private BackgroundColor backgroundColor = new BackgroundColor();
    private String mFact = factObject.facts[8];
    private int color = Color.parseColor(backgroundColor.mColors[8]);

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString(FACT_TEXT, mFactText.getText().toString());
        outState.putInt(FACT_COLOR, color);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mFact = savedInstanceState.getString(FACT_TEXT);
        mFactText.setText(mFact);

        color = savedInstanceState.getInt(FACT_COLOR);
        mRelativeLayout.setBackgroundColor(color);
        mFactButton.setTextColor(color);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFactText = (TextView) findViewById(R.id.textFakta);
        mFactButton = (Button) findViewById(R.id.button);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.factLayout);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                color = backgroundColor.getColor();
                mFactText.setText(factObject.getFact());
                mRelativeLayout.setBackgroundColor(color);
                mFactButton.setTextColor(color);
            }
        };

        mFactButton.setOnClickListener(listener);

    }
}
