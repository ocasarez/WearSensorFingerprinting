package com.oscarcasarezruiz.wearsensorfingerprinting.presenter;

import com.oscarcasarezruiz.wearsensorfingerprinting.models.SensorTrace;

public class InstructionsActivityPresenter {

    private View mView;
    private float mZAccelerometerData;

    public InstructionsActivityPresenter (View view){
        mView = view;
    }

    public void saveFirstTrace(float trace){
        mZAccelerometerData = trace;
        mView.showFirstTrace(String.format("%f", trace));
    }


    public void collectTraceButtonClicked(){
        mView.collectTrace();
    }

    public void sensorFingerprintResultsButtonClicked(){
        mView.navigateToSensorFingerprintResult();
    }

    public float getFirstTrace() {
        return mZAccelerometerData;
    }

    public interface View {
        void showFirstTrace(String s);
        void collectTrace();
        void navigateToSensorFingerprintResult();
    }
}
