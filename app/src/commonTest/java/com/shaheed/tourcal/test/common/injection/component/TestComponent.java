package com.shaheed.tourcal.test.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import com.shaheed.tourcal.injection.component.ApplicationComponent;
import com.shaheed.tourcal.test.common.injection.module.ApplicationTestModule;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}
