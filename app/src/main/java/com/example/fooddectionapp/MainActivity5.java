package com.example.fooddectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static com.example.fooddectionapp.R.id.buttonLoad;

public class MainActivity5 extends AppCompatActivity {
    ImageView imageView;
    Uri imageUri;
    private static final int PICK_IMAGE = 100;
    Button loadGallerybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        imageView = (ImageView) findViewById(R.id.imageView5);
        loadGallerybutton = (Button) findViewById(buttonLoad);
        loadGallerybutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                openGallery();
            }

            private void openGallery() {

                Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                startActivityForResult(gallery, PICK_IMAGE);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == PICK_IMAGE) {
            imageUri = data.getData();
            imageView.setImageURI(imageUri);
            loadGallerybutton.setVisibility(View.GONE);
        }
    }
}