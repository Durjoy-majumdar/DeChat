package p1066yc;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr0.C86117l;
import cr0.C86118m;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: yc.b */
public class C91396b implements C82531i.C82534c {

    /* renamed from: d */
    public final /* synthetic */ C91398c f262099d;

    public C91396b(C91398c cVar) {
        this.f262099d = cVar;
    }

    public void onDestroy() {
        Log.m105918d("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onDestroy");
        WeakReference<C83780d1> weakReference = this.f262099d.f262103c;
        if (weakReference == null) {
            Log.m105928w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onDestroy, mPageViewRef is null");
            return;
        }
        C83780d1 d1Var = weakReference.get();
        if (d1Var == null) {
            Log.m105928w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onDestroy, thePageView is null");
            return;
        }
        Activity A0 = d1Var.mo116146A0();
        if (A0 == null) {
            Log.m105928w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onDestroy, null == activity");
            return;
        }
        C86117l b = C86117l.m106615b(A0);
        C86118m mVar = this.f262099d.f262107g;
        C87412m.m108594g(mVar, "orientationObserver");
        Log.m105918d(b.f250631a, "removeOrientationObserver");
        ((CopyOnWriteArrayList) b.f250636f).remove(mVar);
        d1Var.mo114867r(this.f262099d.f262108h);
    }
}
