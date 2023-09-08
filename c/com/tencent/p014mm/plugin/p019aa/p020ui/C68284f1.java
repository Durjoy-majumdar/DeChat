package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.DialogInterface;
import android.view.View;
import bg0.C67236j;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import lp3.C88633e;
import lp3.C88643g;
import yf0.C79104i;

/* renamed from: com.tencent.mm.plugin.aa.ui.f1 */
public class C68284f1 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ PaylistAAUI f196297g;

    public C68284f1(PaylistAAUI paylistAAUI) {
        this.f196297g = paylistAAUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.Aa.PaylistAAUI", "click mInstantPayBtn");
        PaylistAAUI paylistAAUI = this.f196297g;
        long j = paylistAAUI.f196246P;
        paylistAAUI.f196251j = C75197d0.m90164e(paylistAAUI, false, (DialogInterface.OnCancelListener) null);
        double d = Util.getDouble(paylistAAUI.f196259u.getText().toString(), 0.0d);
        C67236j.C67237a aVar = paylistAAUI.f196248g.f193067c;
        String str = paylistAAUI.f196264z;
        String str2 = paylistAAUI.f196232A;
        aVar.getClass();
        ((C88633e) C88643g.m110549g(Long.valueOf(j), str, str2)).mo123061d(aVar).mo123062e(new C68291i1(paylistAAUI)).mo123065b(new C68286g1(paylistAAUI));
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(13721, 4, 9, Integer.valueOf(paylistAAUI.f196247Q));
        nVar.mo160131h(13723, 3, Integer.valueOf(C79104i.m95664i(paylistAAUI.f196239H).size()), Integer.valueOf(paylistAAUI.f196243L), Double.valueOf(d * 100.0d), paylistAAUI.f196242K);
    }
}
