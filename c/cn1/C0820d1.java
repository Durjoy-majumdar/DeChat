package cn1;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dn1.C7372a;
import gy3.C87412m;
import jq3.C60905o;

/* renamed from: cn1.d1 */
public final class C0820d1 extends C7372a {

    /* renamed from: d */
    public final /* synthetic */ C60905o f1922d;

    /* renamed from: e */
    public final /* synthetic */ C0807a1 f1923e;

    public C0820d1(C60905o oVar, C0807a1 a1Var) {
        this.f1922d = oVar;
        this.f1923e = a1Var;
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Context context = this.f1922d.f173499A;
        C87412m.m108593f(context, "holder.context");
        if (mo8543a(activity, context)) {
            Log.m105924i("Finder.Loader", "#lifeCallback-onActivityDestroyed");
            this.f1923e.mo737k(this.f1922d);
        }
    }

    public void onActivityResumed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Context context = this.f1922d.f173499A;
        C87412m.m108593f(context, "holder.context");
        if (mo8543a(activity, context)) {
            Log.m105924i("Finder.Loader", "#lifeCallback-onActivityResumed");
        }
    }
}
