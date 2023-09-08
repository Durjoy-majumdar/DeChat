package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.finder.ui.k3 */
public final class C3852k3 implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ FinderSelfQRCodeUI f17390a;

    public C3852k3(FinderSelfQRCodeUI finderSelfQRCodeUI) {
        this.f17390a = finderSelfQRCodeUI;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        C87412m.m108594g(str, "srcPath");
        C87412m.m108594g(str2, "destPath");
        FinderSelfQRCodeUI finderSelfQRCodeUI = this.f17390a;
        C76701a.makeText((Context) finderSelfQRCodeUI, (CharSequence) finderSelfQRCodeUI.getString(C0966R.string.fn4, new Object[]{str2}), 1).show();
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        C87412m.m108594g(str, "srcPath");
        C87412m.m108594g(str2, "destPath");
        FinderSelfQRCodeUI finderSelfQRCodeUI = this.f17390a;
        C76701a.makeText((Context) finderSelfQRCodeUI, (CharSequence) finderSelfQRCodeUI.getString(C0966R.string.iak), 1).show();
    }
}
