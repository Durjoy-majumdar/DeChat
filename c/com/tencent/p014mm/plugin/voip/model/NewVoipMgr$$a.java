package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.voip.model.NewVoipMgr$$a */
public final /* synthetic */ class NewVoipMgr$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NewVoipMgr f317134d;

    public /* synthetic */ NewVoipMgr$$a(NewVoipMgr newVoipMgr) {
        this.f317134d = newVoipMgr;
    }

    public final void run() {
        NewVoipMgr newVoipMgr = this.f317134d;
        newVoipMgr.getClass();
        C77398g gVar = null;
        try {
            gVar = C76879j.m92754y(newVoipMgr.f317093h.mo152927i3(), newVoipMgr.f317093h.mo152927i3().getString(C0966R.string.mzf), (String) null, newVoipMgr.f317093h.mo152927i3().getString(C0966R.string.f8028zq), new NewVoipMgr$$i(newVoipMgr));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Voip.NewVoipMgr", e, "failed to show alert", new Object[0]);
        }
        if (gVar == null) {
            Log.m105920e("MicroMsg.Voip.NewVoipMgr", "new dialog failed");
            return;
        }
        gVar.setCancelable(false);
        gVar.setCanceledOnTouchOutside(false);
        gVar.show();
        newVoipMgr.f317054D = true;
    }
}
