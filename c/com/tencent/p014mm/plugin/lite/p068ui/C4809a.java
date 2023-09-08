package com.tencent.p014mm.plugin.lite.p068ui;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import i22.C8846b;

/* renamed from: com.tencent.mm.plugin.lite.ui.a */
public class C4809a implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ int f19846d;

    /* renamed from: e */
    public final /* synthetic */ WxaLiteAppApiProxyUI f19847e;

    public C4809a(WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i, int i2) {
        this.f19847e = wxaLiteAppApiProxyUI;
        this.f19846d = i2;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        if (i == 3345) {
            int i3 = this.f19846d;
            C4770c cVar = C8846b.f28090r.get(Integer.valueOf(i3));
            if (cVar != null) {
                cVar.mo5685m();
                C8846b.f28090r.remove(Integer.valueOf(i3));
            }
            this.f19847e.finish();
        }
    }
}
