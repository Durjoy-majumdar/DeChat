package com.tencent.p014mm.plugin.appbrand.p026ui.autofill;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import ob0.C47350c;
import wr0.b$$a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.g */
public class C115279g implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ AppBrandIDCardUI.C115267a f345489a;

    public C115279g(AppBrandIDCardUI.C115267a aVar) {
        this.f345489a = aVar;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        AppBrandIDCardUI.this.runOnUiThread(new b$$a(this, i, i2, cVar, str));
    }
}
