package mp0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C1748d;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import kr0.C88267e;
import lp0.C88620b;
import org.json.JSONObject;

/* renamed from: mp0.i */
public class C88803i implements C88620b<C83928t1> {
    /* renamed from: a */
    public void mo115970a(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        C1748d dVar = new C1748d();
        C88267e K1 = t1Var.mo116160O0();
        new JSONObject();
        K1.getRuntime().mo113006E();
        dVar.mo115109j("ok");
        C84240s.m103840f(str, t1Var.mo116162Q0(), 10, "", Util.nowSecond(), 1, 0);
    }

    /* renamed from: b */
    public String mo115971b(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        return context.getString(C0966R.string.f7624lr);
    }

    /* renamed from: c */
    public boolean mo115972c(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        return WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED || C84072q1.m103586a(str).f245471o;
    }
}
