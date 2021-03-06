package com.shaheed.tourcal.injection.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import com.shaheed.tourcal.data.remote.RibotsService;
import com.shaheed.tourcal.injection.ApplicationContext;

/**
 * Provide application-level dependencies.
 */
@Module
public class ApplicationModule {
    protected final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    RibotsService provideRibotsService() {
        return RibotsService.Creator.newRibotsService();
    }

}
