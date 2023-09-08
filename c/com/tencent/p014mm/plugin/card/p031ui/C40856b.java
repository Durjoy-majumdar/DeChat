package com.tencent.p014mm.plugin.card.p031ui;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gz0.C45988h;
import hz0.C46153l0;
import vz0.C22819h;
import vz0.C53050p;
import wz0.C53247c;
import wz0.C53267r;

/* renamed from: com.tencent.mm.plugin.card.ui.b */
public class C40856b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public int f109854d = 0;

    /* renamed from: com.tencent.mm.plugin.card.ui.b$a */
    public class C40857a implements Runnable {
        public C40857a(C40856b bVar) {
        }

        public void run() {
            Log.m105924i("MicroMsg.CardAcitivityLifecycleListener", "CardAcitivityLifecycleListener on activity from background to foreground！doUpdateOfflineDynamicCard!");
            C45988h zx02 = C46153l0.zx0();
            if (zx02 != null) {
                zx02.mo71391h(C53267r.EN_DYNAMIC_CODE_SCENE_ENTER_FOREGROUND);
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        C22819h hVar;
        if (this.f109854d < 0) {
            if (activity == null || !(activity instanceof CardDetailUI)) {
                C86709a0.m107525e().postToWorker(new C40857a(this));
            } else {
                CardDetailUI cardDetailUI = (CardDetailUI) activity;
                CardDetailUIContoller cardDetailUIContoller = cardDetailUI.f51747e;
                if (!(cardDetailUIContoller == null || (hVar = cardDetailUIContoller.f51805p) == null || !(hVar instanceof C53050p))) {
                    Log.m105924i("MicroMsg.CardAcitivityLifecycleListener", "CardAcitivityLifecycleListener on activity from background to foreground！is showing CardDetailUI,updateCodeView!");
                    cardDetailUI.f51747e.f51805p.mo35966l(C53247c.CARDCODEREFRESHACTION_ENTERFOREGROUND);
                }
            }
        }
        this.f109854d++;
    }

    public void onActivityStopped(Activity activity) {
        this.f109854d--;
    }
}
