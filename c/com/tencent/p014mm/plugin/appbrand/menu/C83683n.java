package com.tencent.p014mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import lp0.C88619a;
import nj3.C76874e0;
import om0.C89246b;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.n */
public class C83683n extends C88619a<C83928t1> {
    public C83683n() {
        super(31);
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        if (!((C83928t1) d1Var).mo116155J0(31).f244319c) {
            e0Var.mo107146h(this.f255896a, context.getString(C0966R.string.a75), C0966R.raw.appbrand_menu_sales_driving, context.getResources().getColor(C0966R.color.f3082es));
        }
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        C83928t1 t1Var = (C83928t1) d1Var;
        C84240s.m103840f(str, t1Var.mo116162Q0(), 39, "", Util.nowSecond(), 1, 0);
        C89246b bVar = new C89246b();
        HashMap hashMap = new HashMap();
        bVar.mo115194p(t1Var.mo116160O0());
        Log.m105924i("MicroMsg.OnSalesDrivingMessageJsEvent", "dispatch data");
        bVar.mo115165o(hashMap);
        bVar.mo115158h();
        Log.m105924i("MicroMsg.MenuDelegate_SalesDriving", "performItemClick");
    }
}
