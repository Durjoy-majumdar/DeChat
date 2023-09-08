package androidx.compose.p002ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import gy3.C8479f0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import p693t1.C36932a;

/* renamed from: androidx.compose.ui.platform.z */
public final class C27938z implements ComponentCallbacks2 {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<Configuration> f77158d;

    /* renamed from: e */
    public final /* synthetic */ C36932a f77159e;

    public C27938z(C8479f0<Configuration> f0Var, C36932a aVar) {
        this.f77158d = f0Var;
        this.f77159e = aVar;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "configuration");
        Configuration configuration2 = (Configuration) this.f77158d.f27484d;
        int updateFrom = configuration2 != null ? configuration2.updateFrom(configuration) : -1;
        Iterator<Map.Entry<C36932a.C36934b, WeakReference<C36932a.C36933a>>> it = this.f77159e.f97984a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<C36932a.C36934b, WeakReference<C36932a.C36933a>> next = it.next();
            C87412m.m108593f(next, "it.next()");
            C36932a.C36933a aVar = (C36932a.C36933a) ((WeakReference) next.getValue()).get();
            if (aVar == null || Configuration.needNewResources(updateFrom, aVar.f97986b)) {
                it.remove();
            }
        }
        this.f77158d.f27484d = configuration;
    }

    public void onLowMemory() {
        this.f77159e.f97984a.clear();
    }

    public void onTrimMemory(int i) {
        this.f77159e.f97984a.clear();
    }
}
