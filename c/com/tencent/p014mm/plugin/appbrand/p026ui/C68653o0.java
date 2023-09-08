package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.view.MenuItem;
import c00.C0406o;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import u73.C101982p;
import u73.C14134p0;
import u73.C14135q;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.o0 */
public class C68653o0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandLauncherUI f197206d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.o0$a */
    public class C68654a implements Runnable {
        public C68654a() {
        }

        public void run() {
            C14134p0 p0Var = new C14134p0();
            p0Var.f39545b = 201;
            p0Var.f39546c = 262208;
            p0Var.f39565v = !((C0406o) C86312j.m106911c(C0406o.class)).yv0(201, 262208);
            ((C101982p) C86312j.m106911c(C101982p.class)).mo6883yJ(C68653o0.this.f197206d, p0Var);
        }
    }

    public C68653o0(AppBrandLauncherUI appBrandLauncherUI) {
        this.f197206d = appBrandLauncherUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        ((C14135q) C86312j.m106911c(C14135q.class)).mo13549kN(MMApplicationContext.getContext(), new C68654a());
        return true;
    }
}
