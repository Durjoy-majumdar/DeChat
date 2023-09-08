package cn1;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dn1.C7372a;
import gy3.C87412m;
import jq3.C60905o;

/* renamed from: cn1.f0 */
public final class C0833f0 extends C7372a {

    /* renamed from: d */
    public final /* synthetic */ C60905o f1963d;

    /* renamed from: e */
    public final /* synthetic */ C0810b0 f1964e;

    public C0833f0(C60905o oVar, C0810b0 b0Var) {
        this.f1963d = oVar;
        this.f1964e = b0Var;
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Context context = this.f1963d.f173499A;
        C87412m.m108593f(context, "holder.context");
        if (mo8543a(activity, context)) {
            Log.m105924i("Finder.LivingConvert", "#lifeCallback-onActivityDestroyed");
            this.f1964e.mo740k(this.f1963d);
        }
    }

    public void onActivityResumed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Context context = this.f1963d.f173499A;
        C87412m.m108593f(context, "holder.context");
        if (mo8543a(activity, context)) {
            Log.m105924i("Finder.LivingConvert", "#lifeCallback-onActivityResumed");
        }
    }
}
