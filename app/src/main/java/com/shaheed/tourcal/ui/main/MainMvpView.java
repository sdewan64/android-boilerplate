package com.shaheed.tourcal.ui.main;

import java.util.List;

import com.shaheed.tourcal.data.model.Ribot;
import com.shaheed.tourcal.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
