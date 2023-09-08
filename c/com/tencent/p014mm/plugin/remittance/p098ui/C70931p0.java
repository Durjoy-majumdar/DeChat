package com.tencent.p014mm.plugin.remittance.p098ui;

import a63.C67008a;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import ie3.C76328d;
import p281yz.C79173v;

/* renamed from: com.tencent.mm.plugin.remittance.ui.p0 */
public class C70931p0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ RemittanceDetailUI f205377g;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.p0$a */
    public class C70932a implements C67008a.C67019k {
        public C70932a() {
        }

        public boolean run(int i, int i2, String str, boolean z) {
            Log.m105925i("MicroMsg.RemittanceDetailUI", "resultCode :%s", Integer.valueOf(i));
            if (i == 2) {
                C70931p0.this.f205377g.mo97377K7();
                return true;
            }
            if (i == 0 && z) {
                C70931p0.this.f205377g.mo97377K7();
            }
            return true;
        }
    }

    public C70931p0(RemittanceDetailUI remittanceDetailUI) {
        this.f205377g = remittanceDetailUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.RemittanceDetailUI", "click reveive btn");
        if (!Util.isNullOrNil(this.f205377g.f204754i1)) {
            C75228t.m90257l0(this.f205377g.getContext(), this.f205377g.f204754i1, (C75228t.C75238m) null);
            return;
        }
        ((C76328d) C86312j.m106911c(C76328d.class)).mo106561my(this.f205377g, 9, 4);
        RemittanceDetailUI remittanceDetailUI = this.f205377g;
        ((C79173v) C86312j.m106911c(C79173v.class)).f232485t.mo90979g(remittanceDetailUI, 2, remittanceDetailUI.mNetSceneMgr, new C70932a(), false, 1008, true);
        Log.m105925i("MicroMsg.RemittanceDetailUI", "click reveive btn，ret :%s", Boolean.FALSE);
        this.f205377g.mo97377K7();
    }
}
