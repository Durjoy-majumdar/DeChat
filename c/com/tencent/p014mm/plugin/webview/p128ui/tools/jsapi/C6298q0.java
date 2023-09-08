package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import ad0.C0033t;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.q0 */
public class C6298q0 implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ C0033t f23133d;

    public C6298q0(MsgHandler msgHandler, C0033t tVar) {
        this.f23133d = tVar;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105919d("MicroMsg.MsgHandler", "onGYNetEnd oreh errType:%d errCode:%d msg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (!(i == 0 && i2 == 0)) {
            Log.m105924i("MicroMsg.MsgHandler", "report oreh logbuffer(13927)");
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(13927, this.f23133d);
            nVar.idkeyStat(457, 0, 1, false);
        }
        return 0;
    }
}
