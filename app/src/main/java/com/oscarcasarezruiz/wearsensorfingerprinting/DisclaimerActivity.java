package com.oscarcasarezruiz.wearsensorfingerprinting;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;


import com.oscarcasarezruiz.wearsensorfingerprinting.presenter.DisclaimerActivityPresenter;

public class DisclaimerActivity extends WearableActivity implements DisclaimerActivityPresenter.View, View.OnClickListener {

    private DisclaimerActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);
        initViews();

        // Disclaimer Presenter
        presenter = new DisclaimerActivityPresenter(this);
    }

    private void initViews(){
        findViewById(R.id.disclaimer_activity_btn_accept).setOnClickListener(this);
    }

    @Override
    public void navigateToFeatures() {
        Intent intent = new Intent(this, com.oscarcasarezruiz.wearsensorfingerprinting.FeatureActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.disclaimer_activity_btn_accept){
            presenter.acceptButtonClicked();
        }
    }
}