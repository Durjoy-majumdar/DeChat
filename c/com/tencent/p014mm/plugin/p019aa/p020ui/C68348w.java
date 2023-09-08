package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.DialogInterface;
import android.view.View;
import bg0.C67236j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import lp3.C88633e;
import lp3.C88643g;

/* renamed from: com.tencent.mm.plugin.aa.ui.w */
public class C68348w extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ AARemittanceUI f196376g;

    public C68348w(AARemittanceUI aARemittanceUI) {
        this.f196376g = aARemittanceUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        AARemittanceUI aARemittanceUI = this.f196376g;
        aARemittanceUI.f195979w = Util.getDouble(aARemittanceUI.f195971o.getText(), 0.0d);
        if (!this.f196376g.f195971o.mo105094l()) {
            AARemittanceUI aARemittanceUI2 = this.f196376g;
            AARemittanceUI.m80590K7(aARemittanceUI2, aARemittanceUI2.getString(C0966R.string.kmc));
            return;
        }
        AARemittanceUI aARemittanceUI3 = this.f196376g;
        if (aARemittanceUI3.f195979w < 0.01d) {
            AARemittanceUI.m80590K7(aARemittanceUI3, aARemittanceUI3.getString(C0966R.string.hzn));
            return;
        }
        aARemittanceUI3.hideWcKb();
        AARemittanceUI aARemittanceUI4 = this.f196376g;
        aARemittanceUI4.getClass();
        aARemittanceUI4.f195962G = C75197d0.m90164e(aARemittanceUI4, false, (DialogInterface.OnCancelListener) null);
        long Y = C75228t.m90232Y(aARemittanceUI4.f195971o.getText(), "100");
        aARemittanceUI4.f195959D = Y;
        String str = aARemittanceUI4.f195980x;
        C67236j.C67237a aVar = aARemittanceUI4.f195963H.f193067c;
        String str2 = aARemittanceUI4.f195961F;
        aVar.getClass();
        ((C88633e) C88643g.m110549g(Long.valueOf(Y), str, str2)).mo123061d(aVar).mo123062e(new C68322q(aARemittanceUI4)).mo123065b(new C68304n(aARemittanceUI4));
        C115669n.INSTANCE.mo160131h(13721, 4, 11, 4);
    }
}
