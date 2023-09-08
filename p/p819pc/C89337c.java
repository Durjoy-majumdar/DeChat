package p819pc;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import gy3.C87412m;
import lp0.C88620b;
import p1044ub.C90630c;
import p194lc.C88435b0;
import qo3.C77407n;

/* renamed from: pc.c */
public final class C89337c implements C88620b<C90630c> {
    /* renamed from: a */
    public void mo115970a(Context context, C83780d1 d1Var, String str) {
        C90630c cVar = (C90630c) d1Var;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "pageView");
        if (str != null) {
            C77407n nVar = new C77407n(context, 1, false);
            nVar.f225771i = C89331a.f257301d;
            nVar.f225782p = new C89332b(str, context, cVar);
            nVar.mo107573q();
        }
    }

    /* renamed from: b */
    public String mo115971b(Context context, C83780d1 d1Var, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g((C90630c) d1Var, "pageView");
        return "Switch Render";
    }

    /* renamed from: c */
    public boolean mo115972c(Context context, C83780d1 d1Var, String str) {
        C90630c cVar = (C90630c) d1Var;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "pageView");
        C88435b0 b0Var = (C88435b0) cVar.getRuntime().mo113021O(C88435b0.class, false);
        return (WeChatEnvironment.hasDebugger() || BuildInfo.DEBUG || C81289m.C81290a.m99663a(cVar.getRuntime().f238149o.f239365g)) && (b0Var != null ? b0Var.f255443e : false);
    }
}
