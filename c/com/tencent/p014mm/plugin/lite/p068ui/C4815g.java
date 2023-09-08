package com.tencent.p014mm.plugin.lite.p068ui;

import com.tencent.p014mm.plugin.lite.api.C4770c;
import i22.C8846b;
import wd3.C78574s0;

/* renamed from: com.tencent.mm.plugin.lite.ui.g */
public class C4815g implements C78574s0 {

    /* renamed from: a */
    public final /* synthetic */ int f19858a;

    /* renamed from: b */
    public final /* synthetic */ WxaLiteAppApiProxyUI f19859b;

    public C4815g(WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i) {
        this.f19859b = wxaLiteAppApiProxyUI;
        this.f19858a = i;
    }

    /* renamed from: a */
    public void mo708a(int i) {
        int i2 = this.f19858a;
        C4770c cVar = C8846b.f28078f.get(Integer.valueOf(i2));
        if (cVar != null) {
            cVar.mo5677e(i);
            C8846b.f28078f.remove(Integer.valueOf(i2));
        }
        this.f19859b.finish();
    }
}
