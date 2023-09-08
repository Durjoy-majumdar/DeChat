package cr0;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import com.tencent.p014mm.plugin.appbrand.utils.C84800z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import rx3.C13598b0;

/* renamed from: cr0.l */
public final class C86117l {

    /* renamed from: g */
    public static final SparseArray<C86117l> f250629g = new SparseArray<>();

    /* renamed from: h */
    public static final AtomicBoolean f250630h = new AtomicBoolean(false);

    /* renamed from: a */
    public final String f250631a = ("MicroMsg.AppBrand.AppBrandOrientationObservable#" + hashCode());

    /* renamed from: b */
    public final Context f250632b;

    /* renamed from: c */
    public C84800z1.C84801a f250633c;

    /* renamed from: d */
    public final Object f250634d;

    /* renamed from: e */
    public C84800z1 f250635e;

    /* renamed from: f */
    public final List<C86118m> f250636f;

    public C86117l(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f250632b = activity.getApplicationContext();
        this.f250633c = C84800z1.C84801a.NONE;
        this.f250634d = new Object();
        this.f250636f = new CopyOnWriteArrayList();
    }

    /* renamed from: b */
    public static final C86117l m106615b(Activity activity) {
        C86117l lVar;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (!f250630h.getAndSet(true)) {
            activity.getApplication().registerActivityLifecycleCallbacks(new C86115j());
        }
        int hashCode = activity.hashCode();
        SparseArray<C86117l> sparseArray = f250629g;
        synchronized (sparseArray) {
            lVar = sparseArray.get(hashCode);
            if (lVar == null) {
                lVar = new C86117l(activity);
                sparseArray.put(hashCode, lVar);
            }
        }
        return lVar;
    }

    /* renamed from: a */
    public final void mo120539a(boolean z) {
        C84800z1 z1Var;
        synchronized (this.f250634d) {
            if (z) {
                if (this.f250635e == null) {
                    this.f250635e = new C84800z1(this.f250632b, new C86116k(this));
                }
                z1Var = this.f250635e;
                C87412m.m108591d(z1Var);
            } else {
                z1Var = this.f250635e;
            }
            if (z1Var != null) {
                z1Var.enable();
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }
}
