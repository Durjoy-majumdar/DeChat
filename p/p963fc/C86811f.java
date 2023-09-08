package p963fc;

import android.app.Activity;
import android.content.Context;
import br0.C79778e;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81812e1;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84674s4;
import com.tencent.p014mm.sdk.platformtools.Log;
import er0.C86645a;
import p224ra.C89909e;

/* renamed from: fc.f */
public class C86811f extends C81812e1<C86812g> {

    /* renamed from: r */
    public C79778e f251965r;

    public C86811f(Context context, Class<? extends C86812g> cls) {
        super(context, cls);
    }

    /* renamed from: b0 */
    public void mo114192b0(AppBrandRuntime appBrandRuntime, AppBrandRuntime appBrandRuntime2, Runnable runnable) {
        Class cls = C84674s4.class;
        Object[] objArr = new Object[2];
        objArr[0] = appBrandRuntime == null ? "null" : appBrandRuntime.f238147j;
        objArr[1] = appBrandRuntime2.f238147j;
        Log.m105925i("Luggage.FULL.AppBrandRuntimeContainerViewImplLu", "onRuntimeClose entered, in.appId[%s], out.appId[%s]", objArr);
        runnable.run();
        if (getStackSize() <= 1 && appBrandRuntime == null) {
            Activity activity = getActivity();
            if (activity == null) {
                Log.m105924i("Luggage.FULL.AppBrandRuntimeContainerViewImplLu", "closeActivity: fail");
            } else if (!activity.isFinishing()) {
                activity.moveTaskToBack(true);
                if (getStackSize() <= 0) {
                    activity.overridePendingTransition(0, 0);
                } else {
                    ((C84674s4) C89909e.m112436a(cls)).mo111332aG(activity);
                }
            }
            Log.m105924i("Luggage.FULL.AppBrandRuntimeContainerViewImplLu", "onRuntimeClose: activity closed");
        } else if (appBrandRuntime2.mo113061j()) {
            ((C84674s4) C89909e.m112436a(cls)).mo111335uR(appBrandRuntime, (Runnable) null, appBrandRuntime2, (Runnable) null);
        }
    }

    public boolean forceLightMode() {
        return false;
    }

    public C79778e getOrientationHandler() {
        if (this.f251965r == null) {
            this.f251965r = new C86645a(this);
        }
        return this.f251965r;
    }
}
