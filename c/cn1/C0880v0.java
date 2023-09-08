package cn1;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dn1.C7372a;
import gy3.C87412m;
import jq3.C60905o;

/* renamed from: cn1.v0 */
public final class C0880v0 extends C7372a {

    /* renamed from: d */
    public final /* synthetic */ C60905o f2089d;

    /* renamed from: e */
    public final /* synthetic */ C0870s0 f2090e;

    public C0880v0(C60905o oVar, C0870s0 s0Var) {
        this.f2089d = oVar;
        this.f2090e = s0Var;
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Context context = this.f2089d.f173499A;
        C87412m.m108593f(context, "holder.context");
        if (mo8543a(activity, context)) {
            Log.m105924i("Finder.RecentWatchListConvert", "#lifeCallback-onActivityDestroyed");
            this.f2090e.mo774j(this.f2089d);
        }
    }
}
