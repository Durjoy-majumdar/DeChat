package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.a */
public class C81577a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAudioOfVideoBackgroundPlayNotificationLogic f239247d;

    public C81577a(AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic) {
        this.f239247d = appBrandAudioOfVideoBackgroundPlayNotificationLogic;
    }

    public void run() {
        this.f239247d.f239199j = false;
        AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = this.f239247d;
        appBrandAudioOfVideoBackgroundPlayNotificationLogic.f239196g.cancel(appBrandAudioOfVideoBackgroundPlayNotificationLogic.mo113825d());
        try {
            AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic2 = this.f239247d;
            appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f239195f.unregisterReceiver(appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f239202p);
        } catch (Exception unused) {
        }
        this.f239247d.f239200n = null;
        this.f239247d.f239201o = null;
    }
}
