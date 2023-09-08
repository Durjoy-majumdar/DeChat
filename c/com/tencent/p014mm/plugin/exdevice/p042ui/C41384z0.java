package com.tencent.p014mm.plugin.exdevice.p042ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.z0 */
public class C41384z0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceRankInfoUI f111415d;

    public C41384z0(ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f111415d = exdeviceRankInfoUI;
    }

    public void run() {
        C89779i0 i0Var = this.f111415d.f111241n;
        if (i0Var != null && i0Var.isShowing()) {
            this.f111415d.f111241n.dismiss();
            this.f111415d.f111241n = null;
            Log.m105918d("MicroMsg.Sport.ExdeviceRankInfoUI", "dismiss tips dialog.");
        }
    }
}
