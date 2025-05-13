package com.mmsstudio.signature_feature_os;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.mmsstudio.signature_feature_os.Methods.SignatureView;

public class MainActivity extends AppCompatActivity {

    private SignatureView signatureView;
    private ImageView ivSignature;
    private Button btnClear, btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        signatureView = findViewById(R.id.signatureView);
        ivSignature = findViewById(R.id.ivSignature);
        btnClear = findViewById(R.id.btnClear);
        btnDisplay = findViewById(R.id.btnDisplay);

        btnClear.setOnClickListener(v -> {
            signatureView.clear();
            //ivSignature.setImageBitmap(null);
        });

        btnDisplay.setOnClickListener(v -> {
            //Bitmap signatureBitmap = signatureView.getSignatureBitmap();
            ivSignature.setImageBitmap(signatureView.getSignatureBitmap());
        });



    }
}