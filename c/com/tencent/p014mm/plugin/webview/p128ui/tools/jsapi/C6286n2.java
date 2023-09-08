package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.autogen.events.ExDeviceGetTicketEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.n2 */
public class C6286n2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExDeviceGetTicketEvent f23109d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23110e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f23111f;

    public C6286n2(MsgHandler msgHandler, ExDeviceGetTicketEvent exDeviceGetTicketEvent, C13851h1 h1Var) {
        this.f23111f = msgHandler;
        this.f23109d = exDeviceGetTicketEvent;
        this.f23110e = h1Var;
    }

    public void run() {
        Log.m105925i("MicroMsg.MsgHandler", "ExDeviceGetTicketEvent isOk[%s], ticket[%s]", Boolean.valueOf(this.f23109d.f9096e.f9101a), this.f23109d.f9096e.f9102b);
        ExDeviceGetTicketEvent.C1017b bVar = this.f23109d.f9096e;
        if (!bVar.f9101a) {
            return;
        }
        if (!Util.isNullOrNil(bVar.f9102b)) {
            HashMap hashMap = new HashMap();
            Log.m105925i("MicroMsg.MsgHandler", "ticket %s", this.f23109d.f9096e.f9102b);
            hashMap.put("ticket", this.f23109d.f9096e.f9102b);
            this.f23111f.mo7210k5(this.f23110e, "getWXDeviceTicket:ok", hashMap);
            return;
        }
        this.f23111f.mo7210k5(this.f23110e, "getWXDeviceTicket:fail", (Map<String, Object>) null);
    }
}
