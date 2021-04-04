package com.oscarcasarezruiz.wearsensorfingerprinting.presenter;

public class DisclaimerActivityPresenter {

    private View mView;

    public DisclaimerActivityPresenter(View view){
        this.mView = view;
    }

    public void acceptButtonClicked(){
        mView.navigateToFeatures();
    }

    public interface View {
        void navigateToFeatures();
    }
}
