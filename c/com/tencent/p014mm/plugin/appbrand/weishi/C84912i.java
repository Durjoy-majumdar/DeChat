package com.tencent.p014mm.plugin.appbrand.weishi;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.appbrand.menu.C83657c0;
import com.tencent.p014mm.plugin.appbrand.menu.C83699y;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.appbrand.weishi.i */
public class C84912i implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f247445d;

    /* renamed from: e */
    public final /* synthetic */ C84909g f247446e;

    public C84912i(C84909g gVar, C83928t1 t1Var) {
        this.f247446e = gVar;
        this.f247445d = t1Var;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            C83699y J0 = this.f247445d.mo116155J0(3);
            Context context = this.f247445d.getContext();
            C83928t1 t1Var = this.f247445d;
            C84240s.m103840f(t1Var.getAppId(), t1Var.mo116162Q0(), 39, "", Util.nowSecond(), 1, 0);
            if (C84905f.m104620a(t1Var.getRuntime())) {
                C83657c0.m102698a(t1Var, J0);
            } else {
                C83657c0.m102699b(context, t1Var, J0, (Runnable) null);
            }
            C84909g.m104627w(this.f247446e);
        }
    }
}
