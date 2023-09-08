package cn1;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dn1.C7372a;
import gy3.C87412m;
import jq3.C60905o;

/* renamed from: cn1.s */
public final class C0869s extends C7372a {

    /* renamed from: d */
    public final /* synthetic */ C60905o f2063d;

    /* renamed from: e */
    public final /* synthetic */ C0859p f2064e;

    public C0869s(C60905o oVar, C0859p pVar) {
        this.f2063d = oVar;
        this.f2064e = pVar;
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Context context = this.f2063d.f173499A;
        C87412m.m108593f(context, "holder.context");
        if (mo8543a(activity, context)) {
            Log.m105924i("Finder.HeadLivingListConvert", "#lifeCallback-onActivityDestroyed");
            this.f2064e.mo771j(this.f2063d);
        }
    }
}
