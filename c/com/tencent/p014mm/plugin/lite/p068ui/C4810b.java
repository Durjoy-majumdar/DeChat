package com.tencent.p014mm.plugin.lite.p068ui;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$g;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import i22.C8846b;

/* renamed from: com.tencent.mm.plugin.lite.ui.b */
public class C4810b implements MMFragmentActivity$$g {

    /* renamed from: a */
    public final /* synthetic */ int f19848a;

    /* renamed from: b */
    public final /* synthetic */ WxaLiteAppApiProxyUI f19849b;

    public C4810b(WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i) {
        this.f19849b = wxaLiteAppApiProxyUI;
        this.f19848a = i;
    }

    /* renamed from: a */
    public void mo5702a(int i, Intent intent) {
        int i2 = this.f19848a;
        C4770c cVar = C8846b.f28092t.get(Integer.valueOf(i2));
        if (cVar != null) {
            cVar.mo5679g(0, i, intent);
            C8846b.f28092t.remove(Integer.valueOf(i2));
        }
        this.f19849b.finish();
    }
}
