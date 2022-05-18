package com.example.koin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MyApp)
            modules(appModule)
        }

    }
    val appModule = module {
        single<DomainRepository>{
            DomainRepositoryImpl()
        }

        factory {
            DomainPresenter(get())
        }
    }
}