package cn1;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dn1.C7372a;
import gy3.C87412m;
import jq3.C60905o;

/* renamed from: cn1.j0 */
public final class C0847j0 extends C7372a {

    /* renamed from: d */
    public final /* synthetic */ C60905o f1999d;

    /* renamed from: e */
    public final /* synthetic */ C0843i0 f2000e;

    public C0847j0(C60905o oVar, C0843i0 i0Var) {
        this.f1999d = oVar;
        this.f2000e = i0Var;
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Context context = this.f1999d.f173499A;
        C87412m.m108593f(context, "holder.context");
        if (mo8543a(activity, context)) {
            Log.m105924i("LivingTitleConvert", "#lifeCallback-onActivityDestroyed");
            this.f2000e.mo765j(this.f1999d);
        }
    }
}
