package com.tencent.tinker.entry;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;

public class DefaultApplicationLike extends ApplicationLike {
    private static final String TAG = "Tinker.DefaultAppLike";

    public DefaultApplicationLike(Application application, int i, boolean z, long j, long j2, Intent intent) {
        super(application, i, z, j, j2, intent);
    }

    public void onBaseContextAttached(Context context) {
        ShareTinkerLog.m106530d(TAG, "onBaseContextAttached:", new Object[0]);
    }

    public void onConfigurationChanged(Configuration configuration) {
        ShareTinkerLog.m106530d(TAG, "onConfigurationChanged:" + configuration.toString(), new Object[0]);
    }

    public void onCreate() {
        ShareTinkerLog.m106530d(TAG, "onCreate", new Object[0]);
    }

    public void onLowMemory() {
        ShareTinkerLog.m106530d(TAG, "onLowMemory", new Object[0]);
    }

    public void onTerminate() {
        ShareTinkerLog.m106530d(TAG, "onTerminate", new Object[0]);
    }

    public void onTrimMemory(int i) {
        ShareTinkerLog.m106530d(TAG, "onTrimMemory level:" + i, new Object[0]);
    }
}
