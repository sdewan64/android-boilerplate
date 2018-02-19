package com.shaheed.tourcal.injection.component;

import dagger.Subcomponent;
import com.shaheed.tourcal.injection.PerActivity;
import com.shaheed.tourcal.injection.module.ActivityModule;
import com.shaheed.tourcal.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
