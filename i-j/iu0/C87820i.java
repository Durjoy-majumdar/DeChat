package iu0;

import com.tencent.p014mm.plugin.appbrand.app.AppBrandProcessSuicideLogic;
import com.tencent.p014mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$$b;
import com.tencent.xweb.IXWebBroadcastListener;
import java.util.concurrent.atomic.AtomicBoolean;
import zt3.C119157j;

/* renamed from: iu0.i */
public final class C87820i implements IXWebBroadcastListener {

    /* renamed from: a */
    public static final C87820i f254225a = new C87820i();

    public void onMainCfgUpdated() {
    }

    public void onPluginCfgUpdated() {
    }

    public void onUpdateFinished(int i) {
        if (i == 0) {
            AtomicBoolean atomicBoolean = AppBrandProcessSuicideLogic.f238430g;
            ((C119157j) C119157j.f356862d).mo183871b(new AppBrandProcessSuicideLogic$$b(), "MicroMsg.AppBrandProcessSuicideLogic");
        }
    }

    public void onUpdateProgressed(int i) {
    }

    public void onUpdateStart(int i) {
    }
}
