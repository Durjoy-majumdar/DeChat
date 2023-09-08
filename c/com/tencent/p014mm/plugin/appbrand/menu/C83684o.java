package com.tencent.p014mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import jl0.C9463c;
import kr0.C88267e;
import lp0.C88619a;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.o */
public class C83684o extends C88619a<C83928t1> {

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.o$a */
    public static final class C83685a extends C82926s {
        private static final int CTRL_INDEX = 904;
        public static final String NAME = "onStartHandoff";
    }

    public C83684o() {
        super(29);
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        if (C9463c.m9140a("MicroMsg.MenuDelegate_SendHandoff", t1Var.getAppId(), t1Var.getRuntime().mo121254q1()) == 0) {
            e0Var.mo107146h(29, context.getString(C0966R.string.a77), C0966R.raw.icons_outlined_colorful_handoff, 0);
            C84240s.m103840f(str, t1Var.mo116162Q0(), 45, "", Util.nowSecond(), 1, 0);
        }
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        C83928t1 t1Var = (C83928t1) d1Var;
        Log.m105924i("MicroMsg.MenuDelegate_SendHandoff", "performItemClick");
        C83685a aVar = new C83685a();
        aVar.mo115195q((C88267e) t1Var.getRuntime().f238150p, t1Var.getComponentId());
        aVar.f242407f = "";
        aVar.mo115158h();
        C84240s.m103840f(str, t1Var.mo116162Q0(), 46, "", Util.nowSecond(), 1, 0);
    }
}
