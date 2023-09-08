package com.tencent.p014mm.plugin.lite.p068ui;

import android.content.DialogInterface;
import android.content.Intent;
import i22.C8846b;

/* renamed from: com.tencent.mm.plugin.lite.ui.m */
public class C4821m implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ int f19868d;

    /* renamed from: e */
    public final /* synthetic */ WxaLiteAppApiProxyUI f19869e;

    public C4821m(WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i) {
        this.f19869e = wxaLiteAppApiProxyUI;
        this.f19868d = i;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C8846b.m8676c(this.f19868d, 1, 0, new Intent());
        this.f19869e.finish();
    }
}
