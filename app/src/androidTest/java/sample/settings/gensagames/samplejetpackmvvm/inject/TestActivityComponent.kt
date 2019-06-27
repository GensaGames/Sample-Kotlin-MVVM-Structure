package sample.settings.gensagames.samplejetpackmvvm.inject

import dagger.Component
import dagger.android.AndroidInjectionModule
import sample.settings.gensagames.samplejetpackmvvm.MainActivityTest
import sample.settings.gensagames.samplejetpackmvvm.view.inject.ActivityComponent
import javax.inject.Singleton

/**
 * It makes no sense to mock injected object only for one element in Activity,
 * However, this is just an example for using it here.
 */
@Singleton
@Component(modules = [AndroidInjectionModule::class, TestActivityModule::class])
interface TestActivityComponent : ActivityComponent {

    fun inject(test: MainActivityTest)
}