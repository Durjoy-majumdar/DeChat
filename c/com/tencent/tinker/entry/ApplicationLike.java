package com.tencent.tinker.entry;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;

public abstract class ApplicationLike implements ApplicationLifeCycle {
    private final Application application;
    private final long applicationStartElapsedTime;
    private final long applicationStartMillisTime;
    private final int tinkerFlags;
    private final boolean tinkerLoadVerifyFlag;
    private final Intent tinkerResultIntent;

    public ApplicationLike(Application application2, int i, boolean z, long j, long j2, Intent intent) {
        this.application = application2;
        this.tinkerFlags = i;
        this.tinkerLoadVerifyFlag = z;
        this.applicationStartElapsedTime = j;
        this.applicationStartMillisTime = j2;
        this.tinkerResultIntent = intent;
    }

    public Application getApplication() {
        return this.application;
    }

    public long getApplicationStartElapsedTime() {
        return this.applicationStartElapsedTime;
    }

    public long getApplicationStartMillisTime() {
        return this.applicationStartMillisTime;
    }

    public AssetManager getAssets(AssetManager assetManager) {
        return assetManager;
    }

    public Context getBaseContext(Context context) {
        return context;
    }

    public ClassLoader getClassLoader(ClassLoader classLoader) {
        return classLoader;
    }

    public Resources getResources(Resources resources) {
        return resources;
    }

    public Object getSystemService(String str, Object obj) {
        return obj;
    }

    public final int getTinkerFlags() {
        return this.tinkerFlags;
    }

    public final boolean getTinkerLoadVerifyFlag() {
        return this.tinkerLoadVerifyFlag;
    }

    public final Intent getTinkerResultIntent() {
        return this.tinkerResultIntent;
    }

    public int mzNightModeUseOf() {
        return 1;
    }

    public void onBaseContextAttached(Context context) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onCreate() {
    }

    public void onLowMemory() {
    }

    public void onTerminate() {
    }

    public void onTrimMemory(int i) {
    }
}
