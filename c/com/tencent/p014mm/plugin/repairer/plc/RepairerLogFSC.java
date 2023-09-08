package com.tencent.p014mm.plugin.repairer.plc;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import i40.C98597b;
import i40.C98598e;
import oa1.C117731d;
import tf3.C37074r;

/* renamed from: com.tencent.mm.plugin.repairer.plc.RepairerLogFSC */
public final class RepairerLogFSC extends C98597b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepairerLogFSC(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "featureService");
    }

    /* renamed from: d3 */
    public void mo57310d3(Context context) {
        C87412m.m108594g(context, "context");
        new RepairerLogFSC$onAccountInit$1(this, this.f289092d).alive();
        if (C117731d.m166007c().mo182440a(new C37074r()) == 1) {
            Log.setPrintAndroidLog(true);
        } else {
            Log.setPrintAndroidLog(false);
        }
    }

    /* renamed from: f3 */
    public void mo57311f3() {
    }
}
