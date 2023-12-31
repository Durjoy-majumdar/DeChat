package com.tencent.p014mm.app;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import com.tencent.tinker.entry.ApplicationLike;

/* renamed from: com.tencent.mm.app.GPAppInlineFence */
final class GPAppInlineFence extends Handler {
    private final ApplicationLike mAppLike;

    private GPAppInlineFence(ApplicationLike applicationLike) {
        this.mAppLike = applicationLike;
    }

    private static void dummyThrowExceptionMethod() {
        if ((System.currentTimeMillis() & 2147483647L) < 0) {
            throw new RuntimeException();
        }
    }

    private void handleMessageImpl(Message message) {
        switch (message.what) {
            case 1:
                this.mAppLike.onBaseContextAttached((Context) message.obj);
                return;
            case 2:
                this.mAppLike.onCreate();
                return;
            case 3:
                this.mAppLike.onConfigurationChanged((Configuration) message.obj);
                return;
            case 4:
                this.mAppLike.onTrimMemory(((Integer) message.obj).intValue());
                return;
            case 5:
                this.mAppLike.onLowMemory();
                return;
            case 6:
                this.mAppLike.onTerminate();
                return;
            case 7:
                message.obj = this.mAppLike.getClassLoader((ClassLoader) message.obj);
                return;
            case 8:
                message.obj = this.mAppLike.getBaseContext((Context) message.obj);
                return;
            case 9:
                message.obj = this.mAppLike.getAssets((AssetManager) message.obj);
                return;
            case 10:
                message.obj = this.mAppLike.getResources((Resources) message.obj);
                return;
            case 11:
                Object[] objArr = (Object[]) message.obj;
                message.obj = this.mAppLike.getSystemService((String) objArr[0], objArr[1]);
                return;
            case 12:
                message.obj = Integer.valueOf(this.mAppLike.mzNightModeUseOf());
                return;
            default:
                throw new IllegalStateException("Should not be here.");
        }
    }

    private void handleMessage_$noinline$(Message message) {
        try {
            dummyThrowExceptionMethod();
        } finally {
            handleMessageImpl(message);
        }
    }

    public void handleMessage(Message message) {
        handleMessage_$noinline$(message);
    }
}
