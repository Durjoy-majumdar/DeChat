package com.tencent.p014mm.plugin.lite.p068ui;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import i22.C8846b;

/* renamed from: com.tencent.mm.plugin.lite.ui.i */
public class C4817i implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ int f19862d;

    /* renamed from: e */
    public final /* synthetic */ WxaLiteAppApiProxyUI f19863e;

    public C4817i(WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i) {
        this.f19863e = wxaLiteAppApiProxyUI;
        this.f19862d = i;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        int i3 = WxaLiteAppApiProxyUI.f19844d;
        Log.m105925i("MicroMsg.WxaLiteAppApiProxyUI", "startActivityForResult: %d %d", Integer.valueOf(i), Integer.valueOf(i2));
        int i4 = this.f19862d;
        C4770c cVar = C8846b.f28086n.get(Integer.valueOf(i4));
        if (cVar != null) {
            cVar.mo5686n(i, i2, intent);
            C8846b.f28086n.remove(Integer.valueOf(i4));
        }
        this.f19863e.finish();
    }
}
