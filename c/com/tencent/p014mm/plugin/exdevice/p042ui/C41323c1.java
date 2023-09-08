package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import f40.C86709a0;
import nj3.C11184p0;
import t71.C48551m;
import tv2.C14096e;
import u71.C52451c;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.c1 */
public class C41323c1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceRankInfoUI f111298d;

    public C41323c1(ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f111298d = exdeviceRankInfoUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        ExdeviceRankInfoUI exdeviceRankInfoUI = this.f111298d;
        if (exdeviceRankInfoUI.f111249v != null && i == 0) {
            exdeviceRankInfoUI.f111229L = true;
            C14096e.m13447a(10);
            C52451c Gx0 = C41166r1.Gx0();
            ExdeviceRankInfoUI exdeviceRankInfoUI2 = this.f111298d;
            String str = exdeviceRankInfoUI2.f111247t;
            String str2 = exdeviceRankInfoUI2.f111249v.field_username;
            Gx0.getClass();
            C86709a0.m107529k().f251779b.mo123460f(new C48551m(str2, str, 3, ""));
        }
    }
}
