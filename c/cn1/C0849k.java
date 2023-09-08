package cn1;

import android.app.Activity;
import android.content.Context;
import cn1.C0821e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dn1.C7372a;
import gy3.C87412m;
import jq3.C60905o;
import pm1.C62381d;

/* renamed from: cn1.k */
public final class C0849k extends C7372a {

    /* renamed from: d */
    public final /* synthetic */ C60905o f2004d;

    /* renamed from: e */
    public final /* synthetic */ C0821e.C0823b f2005e;

    /* renamed from: f */
    public final /* synthetic */ C0821e f2006f;

    public C0849k(C60905o oVar, C0821e.C0823b bVar, C0821e eVar) {
        this.f2004d = oVar;
        this.f2005e = bVar;
        this.f2006f = eVar;
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Context context = this.f2004d.f173499A;
        C87412m.m108593f(context, "holder.context");
        if (mo8543a(activity, context)) {
            Log.m105924i("BigBannerListConvert", "#lifeCallback-onActivityDestroyed autoPlayManager=" + this.f2005e.f1936f);
            this.f2006f.mo751j(this.f2004d);
        }
    }

    public void onActivityPaused(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Context context = this.f2004d.f173499A;
        C87412m.m108593f(context, "holder.context");
        if (mo8543a(activity, context)) {
            Log.m105924i("BigBannerListConvert", "#lifeCallback-onActivityStopped autoPlayManager=" + this.f2005e.f1936f);
            C62381d dVar = this.f2005e.f1936f;
            if (dVar != null) {
                dVar.mo87435n();
            }
            C62381d dVar2 = this.f2005e.f1936f;
            if (dVar2 != null) {
                dVar2.mo11214a();
            }
        }
    }

    public void onActivityResumed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Context context = this.f2004d.f173499A;
        C87412m.m108593f(context, "holder.context");
        if (mo8543a(activity, context)) {
            Log.m105924i("BigBannerListConvert", "#lifeCallback-onActivityStarted autoPlayManager=" + this.f2005e.f1936f);
            C62381d dVar = this.f2005e.f1936f;
            if (dVar != null && !dVar.f177296l) {
                dVar.mo11215b();
            }
        }
    }
}
