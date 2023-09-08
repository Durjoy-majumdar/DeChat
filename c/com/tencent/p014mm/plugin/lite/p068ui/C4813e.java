package com.tencent.p014mm.plugin.lite.p068ui;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.sdk.platformtools.Log;
import i22.C8846b;

/* renamed from: com.tencent.mm.plugin.lite.ui.e */
public class C4813e implements MMFragmentActivity$$f {

    /* renamed from: a */
    public final /* synthetic */ int f19854a;

    /* renamed from: b */
    public final /* synthetic */ WxaLiteAppApiProxyUI f19855b;

    public C4813e(WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i) {
        this.f19855b = wxaLiteAppApiProxyUI;
        this.f19854a = i;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        int i3 = WxaLiteAppApiProxyUI.f19844d;
        Log.m105925i("MicroMsg.WxaLiteAppApiProxyUI", "startAppActivityForResult %d %d", Integer.valueOf(i), Integer.valueOf(i2));
        C8846b.m8676c(this.f19854a, i, i2, intent);
        this.f19855b.finish();
    }
}
