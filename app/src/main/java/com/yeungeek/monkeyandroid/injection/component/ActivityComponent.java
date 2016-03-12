package com.yeungeek.monkeyandroid.injection.component;

import com.yeungeek.monkeyandroid.injection.PerActivity;
import com.yeungeek.monkeyandroid.injection.module.ActivityModule;
import com.yeungeek.monkeyandroid.ui.main.MainActivity;
import com.yeungeek.monkeyandroid.ui.sample.SampleActivity;
import com.yeungeek.monkeyandroid.ui.signin.SignInDialogFragment;

import dagger.Component;

/**
 * Created by yeungeek on 2016/1/17.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(SampleActivity sampleActivity);

    void inject(MainActivity mainActivity);


    void inject(SignInDialogFragment signInDialogFragment);
}
