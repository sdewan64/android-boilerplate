package com.shaheed.tourcal.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import com.shaheed.tourcal.data.DataManager;
import com.shaheed.tourcal.data.SyncService;
import com.shaheed.tourcal.data.local.DatabaseHelper;
import com.shaheed.tourcal.data.local.PreferencesHelper;
import com.shaheed.tourcal.data.remote.RibotsService;
import com.shaheed.tourcal.injection.ApplicationContext;
import com.shaheed.tourcal.injection.module.ApplicationModule;
import com.shaheed.tourcal.util.RxEventBus;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    RxEventBus eventBus();

}
