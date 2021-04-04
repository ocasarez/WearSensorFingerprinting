package com.oscarcasarezruiz.wearsensorfingerprinting;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;


import com.oscarcasarezruiz.wearsensorfingerprinting.presenter.FeatureActivityPresenter;

public class FeatureActivity extends WearableActivity implements FeatureActivityPresenter.View, View.OnClickListener {

    private FeatureActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature);
        initViews();

        //Features Presenter
        presenter = new FeatureActivityPresenter(this);
    }

    private void initViews(){
        findViewById(R.id.feature_activity_btn_sensordata).setOnClickListener(this);
        findViewById(R.id.feature_activity_btn_sensorfingerprint_1trace).setOnClickListener(this);
        findViewById(R.id.feature_activity_btn_identifyDevice).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.feature_activity_btn_sensordata:
                presenter.sensorDataButtonClicked();
                break;
            case R.id.feature_activity_btn_sensorfingerprint_1trace:
                presenter.sensorFingerprintButtonClicked();
                break;
            case R.id.feature_activity_btn_identifyDevice:
                presenter.sensorIdentifyDeviceButtonClicked();
                break;
        }
    }

    @Override
    public void navigateToSensorDate() {
        Intent intent = new Intent(this, SensorDataActivity.class);
        startActivity(intent);
    }

    @Override
    public void navigateToSensorFingerprint() {
        Intent intent = new Intent(this, InstructionsActivity.class);
        intent.putExtra("Identify", false);
        startActivity(intent);
    }

    @Override
    public void navigateToIdentifyDevice() {
        Intent intent = new Intent(this, InstructionsActivity.class);
        intent.putExtra("Identify", true);
        startActivity(intent);
    }
}