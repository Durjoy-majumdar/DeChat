package com.tencent.p014mm.plugin.appbrand.jsapi.nfc;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import wl0.C91028g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.f */
public class C82857f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public boolean f242295d = false;

    public C82857f(JsApiNFCStartHCE jsApiNFCStartHCE) {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        Log.m105924i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE onActivityPaused");
        C91028g.f261152l.mo125079d();
        this.f242295d = true;
    }

    public void onActivityResumed(Activity activity) {
        Log.m105924i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE onActivityResumed");
        if (this.f242295d) {
            Log.m105924i("MicroMsg.JsApiNFCStartHCE", "alvinluo onActivityResumed isPaused and do checLogic");
            this.f242295d = false;
            C91028g.f261152l.mo125076a();
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
