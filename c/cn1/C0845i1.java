package cn1;

import android.app.Activity;
import android.content.Context;
import cn1.C0827e1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dn1.C7372a;
import gy3.C87412m;
import jq3.C60905o;
import pm1.C62381d;

/* renamed from: cn1.i1 */
public final class C0845i1 extends C7372a {

    /* renamed from: d */
    public final /* synthetic */ C60905o f1992d;

    /* renamed from: e */
    public final /* synthetic */ C0827e1.C0829b f1993e;

    /* renamed from: f */
    public final /* synthetic */ C0827e1 f1994f;

    public C0845i1(C60905o oVar, C0827e1.C0829b bVar, C0827e1 e1Var) {
        this.f1992d = oVar;
        this.f1993e = bVar;
        this.f1994f = e1Var;
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Context context = this.f1992d.f173499A;
        C87412m.m108593f(context, "holder.context");
        if (mo8543a(activity, context)) {
            Log.m105924i("Finder.SpecialColumnListConvert", "#lifeCallback-onActivityDestroyed autoPlayManager=" + this.f1993e.f1955d);
            this.f1994f.mo755j(this.f1992d);
        }
    }

    public void onActivityPaused(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Context context = this.f1992d.f173499A;
        C87412m.m108593f(context, "holder.context");
        if (mo8543a(activity, context)) {
            Log.m105924i("Finder.SpecialColumnListConvert", "#lifeCallback-onActivityStopped autoPlayManager=" + this.f1993e.f1955d);
            C62381d dVar = this.f1993e.f1955d;
            if (dVar != null) {
                dVar.mo87435n();
            }
            C62381d dVar2 = this.f1993e.f1955d;
            if (dVar2 != null) {
                dVar2.mo11214a();
            }
        }
    }

    public void onActivityResumed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Context context = this.f1992d.f173499A;
        C87412m.m108593f(context, "holder.context");
        if (mo8543a(activity, context)) {
            Log.m105924i("Finder.SpecialColumnListConvert", "#lifeCallback-onActivityStarted autoPlayManager=" + this.f1993e.f1955d);
            C62381d dVar = this.f1993e.f1955d;
            if (dVar != null && !dVar.f177296l) {
                dVar.mo11215b();
            }
        }
    }
}
