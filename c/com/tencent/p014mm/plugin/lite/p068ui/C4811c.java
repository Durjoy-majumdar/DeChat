package com.tencent.p014mm.plugin.lite.p068ui;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import i22.C8846b;

/* renamed from: com.tencent.mm.plugin.lite.ui.c */
public class C4811c implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ int f19850d;

    /* renamed from: e */
    public final /* synthetic */ WxaLiteAppApiProxyUI f19851e;

    public C4811c(WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i) {
        this.f19851e = wxaLiteAppApiProxyUI;
        this.f19850d = i;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        int i3 = this.f19850d;
        C4770c cVar = C8846b.f28094v.get(Integer.valueOf(i3));
        if (cVar != null) {
            cVar.mo5681i(0, i2, intent);
            C8846b.f28094v.remove(Integer.valueOf(i3));
        }
        this.f19851e.finish();
    }
}
