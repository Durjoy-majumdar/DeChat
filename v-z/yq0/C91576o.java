package yq0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gt0.C87362k;
import gy3.C87412m;

/* renamed from: yq0.o */
public final class C91576o {
    /* renamed from: a */
    public static final void m114916a(C81879g gVar) {
        C87412m.m108594g(gVar, "mComponent");
        MultiProcessMMKV multiProcessMMKV = MultiProcessMMKV.getDefault();
        if (!multiProcessMMKV.getBoolean("has_ever_show_wmpf_voip_call_in_scope_auth_notify_bottom_sheet", false)) {
            C87362k kVar = gVar.getRuntime().f238157v;
            Context context = gVar.getContext();
            C87412m.m108593f(context, "mComponent.context");
            kVar.mo121778b(new C91573n(context));
            multiProcessMMKV.putBoolean("has_ever_show_wmpf_voip_call_in_scope_auth_notify_bottom_sheet", true);
        }
    }
}
