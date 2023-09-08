package p963fc;

import android.app.Activity;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainer;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI$$b;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84674s4;
import com.tencent.p014mm.plugin.appbrand.task.C84275c0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import p224ra.C89909e;

/* renamed from: fc.e */
public class C86809e extends AppBrandRuntimeContainer<C86812g> {

    /* renamed from: fc.e$a */
    public class C86810a implements Runnable {

        /* renamed from: d */
        public final AtomicBoolean f251960d = new AtomicBoolean(false);

        /* renamed from: e */
        public final /* synthetic */ AppBrandRuntime f251961e;

        /* renamed from: f */
        public final /* synthetic */ AppBrandRuntime f251962f;

        /* renamed from: g */
        public final /* synthetic */ Runnable f251963g;

        public C86810a(AppBrandRuntime appBrandRuntime, AppBrandRuntime appBrandRuntime2, Runnable runnable) {
            this.f251961e = appBrandRuntime;
            this.f251962f = appBrandRuntime2;
            this.f251963g = runnable;
        }

        public void run() {
            if (!this.f251960d.getAndSet(true)) {
                C86809e.super.mo113125e0(this.f251961e, this.f251962f, this.f251963g);
            }
        }
    }

    public C86809e(C84275c0 c0Var, Class<? extends C86812g> cls) {
        super(c0Var, cls);
    }

    /* renamed from: e0 */
    public void mo113125e0(AppBrandRuntime appBrandRuntime, AppBrandRuntime appBrandRuntime2, Runnable runnable) {
        Class cls = C84674s4.class;
        Object[] objArr = new Object[6];
        objArr[0] = appBrandRuntime == null ? "null" : appBrandRuntime.f238147j;
        objArr[1] = appBrandRuntime2.f238147j;
        objArr[2] = Boolean.valueOf(appBrandRuntime2.f238117P);
        objArr[3] = Boolean.valueOf(appBrandRuntime2.mo113061j());
        objArr[4] = Boolean.valueOf(this.f238210r);
        objArr[5] = Integer.valueOf(getStackSize());
        Log.m105925i("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "onRuntimeClose entered, in.appId[%s], out.appId[%s], out.isFinishing[%b], out.canDoCloseAnimation[%b], mIsActivityPaused[%b], stackSize[%d]", objArr);
        C86810a aVar = new C86810a(appBrandRuntime, appBrandRuntime2, runnable);
        if (this.f238210r) {
            appBrandRuntime2.f238136Z = false;
        }
        if (!appBrandRuntime2.f238117P) {
            if (getStackSize() <= 1) {
                mo113151m0(true);
            } else if (appBrandRuntime2.mo113061j()) {
                ((C84674s4) C89909e.m112436a(cls)).mo111335uR(appBrandRuntime, (Runnable) null, appBrandRuntime2, aVar);
            } else {
                aVar.run();
            }
        } else if (!mo113124e(appBrandRuntime2)) {
            aVar.run();
        } else if (getStackSize() <= 1) {
            mo113151m0(false);
        } else if (appBrandRuntime2.mo113061j()) {
            ((C84674s4) C89909e.m112436a(cls)).mo111335uR(appBrandRuntime, (Runnable) null, appBrandRuntime2, aVar);
        } else {
            aVar.run();
        }
    }

    /* renamed from: m0 */
    public void mo113151m0(boolean z) {
        Activity w = mo120548w();
        if (w != null && !w.isFinishing()) {
            boolean l8 = ((AppBrandUI$$b) this.f238207o).f246511a.mo117074l8();
            int stackSize = getStackSize();
            AppBrandInitConfigLU l1 = stackSize > 0 ? ((C86812g) getActiveRuntime()).mo113036W() : null;
            if (!l8 || !z) {
                w.finish();
            } else {
                w.moveTaskToBack(true);
            }
            if (stackSize <= 0) {
                w.overridePendingTransition(0, 0);
            } else {
                ((C84674s4) C89909e.m112436a(C84674s4.class)).mo111334b9(w, l1);
            }
        }
    }

    /* renamed from: n0 */
    public boolean mo113152n0() {
        if (getStackSize() > 0) {
            return false;
        }
        mo113151m0(false);
        return true;
    }
}
