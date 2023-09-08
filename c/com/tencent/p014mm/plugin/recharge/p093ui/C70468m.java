package com.tencent.p014mm.plugin.recharge.p093ui;

import com.tencent.p014mm.plugin.recharge.p093ui.C70455e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import y43.C79037y;

/* renamed from: com.tencent.mm.plugin.recharge.ui.m */
public class C70468m implements C70455e.C70457b {

    /* renamed from: a */
    public final /* synthetic */ PhoneRechargeUI f203661a;

    public C70468m(PhoneRechargeUI phoneRechargeUI) {
        this.f203661a = phoneRechargeUI;
    }

    /* renamed from: a */
    public void mo97088a(C79037y yVar) {
        if (yVar == null) {
            Log.m105920e("MicroMsg.PhoneRechargeUI", "hy: no product item");
        } else if (PhoneRechargeUI.m82986J7(this.f203661a, yVar.f232112r, yVar.f232113s, yVar.f232102e, yVar.f232103f)) {
        } else {
            if (!Util.isNullOrNil(yVar.f232105h)) {
                PhoneRechargeUI.m82988L7(this.f203661a, PhoneRechargeUI.m82987K7(this.f203661a, yVar.f232105h), yVar.f232102e, yVar.f232103f);
            } else if (PhoneRechargeUI.m82984H7(this.f203661a, yVar)) {
                PhoneRechargeUI.m82985I7(this.f203661a, yVar);
            }
        }
    }
}
