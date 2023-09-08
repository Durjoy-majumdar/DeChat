package com.tencent.p014mm.plugin.lite.p068ui;

import android.content.Intent;
import i22.C8846b;
import wd3.C65953v0;

/* renamed from: com.tencent.mm.plugin.lite.ui.k */
public class C4819k implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ int f19866a;

    /* renamed from: b */
    public final /* synthetic */ WxaLiteAppApiProxyUI f19867b;

    public C4819k(WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i) {
        this.f19867b = wxaLiteAppApiProxyUI;
        this.f19866a = i;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        Intent intent = new Intent();
        intent.putExtra("Select_Conv_User", this.f19867b.getIntent().getStringExtra("Select_Conv_User"));
        intent.putExtra("custom_send_text", str);
        C8846b.m8676c(this.f19866a, 1, -1, intent);
        this.f19867b.finish();
    }
}
