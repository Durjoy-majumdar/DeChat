package com.tencent.p014mm.plugin.exdevice.p042ui;

import com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceRankInfoUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.v0 */
public class C41378v0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceRankInfoUI.C41303l f111408d;

    public C41378v0(ExdeviceRankInfoUI.C41303l lVar) {
        this.f111408d = lVar;
    }

    public void run() {
        C89779i0 i0Var = ExdeviceRankInfoUI.this.f111241n;
        if (i0Var != null && i0Var.isShowing()) {
            ExdeviceRankInfoUI.this.f111241n.dismiss();
            ExdeviceRankInfoUI.this.f111241n = null;
            Log.m105918d("MicroMsg.Sport.ExdeviceRankInfoUI", "dismiss tips dialog.");
        }
    }
}
