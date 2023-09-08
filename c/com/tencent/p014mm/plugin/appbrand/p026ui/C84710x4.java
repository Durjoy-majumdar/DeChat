package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import br0.C79774c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84574p4;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.x4 */
public class C84710x4 implements C84574p4 {

    /* renamed from: d */
    public final AppBrandRuntime f247100d;

    public C84710x4(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "rt");
        this.f247100d = appBrandRuntime;
    }

    /* renamed from: a */
    public final int mo117439a(int i) {
        return mo117440b().getResources().getDimensionPixelSize(i);
    }

    /* renamed from: b */
    public Context mo117440b() {
        Context R = this.f247100d.mo113026R();
        if (R == null) {
            R = this.f247100d.f238141d;
        }
        C87412m.m108593f(R, "rt.context ?: rt.appContext");
        return R;
    }

    /* renamed from: ha */
    public int mo117256ha(C81925i2 i2Var) {
        C79774c.C79777c statusBar;
        C87412m.m108594g(i2Var, "service");
        C79774c cVar = i2Var.f240292z;
        if (cVar == null || (statusBar = cVar.getStatusBar()) == null || 8 == statusBar.f233796b) {
            return 0;
        }
        return statusBar.f233795a;
    }

    public C84574p4.C84575a q80() {
        return new C84574p4.C84575a(0, (mo117439a(C0966R.dimen.f3679b9) - mo117439a(C0966R.dimen.f4071qh)) / 2, mo117439a(C0966R.dimen.f4057q3), 0);
    }
}
