package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.sdk.platformtools.Log;
import p576jp.C33610c;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g0 */
public class C105143g0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f312192d;

    /* renamed from: e */
    public final /* synthetic */ C105147h0 f312193e;

    public C105143g0(C105147h0 h0Var, int i) {
        this.f312193e = h0Var;
        this.f312192d = i;
    }

    public void run() {
        C105181w wVar = this.f312193e.f312197a;
        if (wVar.f312381n != C105181w.C85161i.InRoom) {
            Log.m105928w("MicroMsg.OpenVoice.OpenVoiceService", "hy: current not in room");
            C105181w wVar2 = this.f312193e.f312197a;
            wVar2.f312355R = -1;
            wVar2.mo149498e();
            return;
        }
        C85147b<C33610c.C33611a> bVar = wVar.f312391w;
        if (bVar != null) {
            bVar.mo118169a(-10087, this.f312192d, "call end", wVar.f312382o);
        }
        C105181w wVar3 = this.f312193e.f312197a;
        wVar3.f312355R = -1;
        wVar3.f312381n = C105181w.C85161i.NotInRoom;
        wVar3.mo149498e();
    }
}
