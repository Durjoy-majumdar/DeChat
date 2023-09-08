package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import android.app.NotificationManager;
import android.graphics.Bitmap;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.b */
public class C81578b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f239248d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandAudioOfVideoBackgroundPlayNotificationLogic f239249e;

    public C81578b(AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic, Bitmap bitmap) {
        this.f239249e = appBrandAudioOfVideoBackgroundPlayNotificationLogic;
        this.f239248d = bitmap;
    }

    public void run() {
        AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = this.f239249e;
        NotificationManager notificationManager = appBrandAudioOfVideoBackgroundPlayNotificationLogic.f239196g;
        int d = appBrandAudioOfVideoBackgroundPlayNotificationLogic.mo113825d();
        AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic2 = this.f239249e;
        notificationManager.notify(d, appBrandAudioOfVideoBackgroundPlayNotificationLogic2.mo113827k(appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f239195f, appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f239199j, this.f239248d));
    }
}
