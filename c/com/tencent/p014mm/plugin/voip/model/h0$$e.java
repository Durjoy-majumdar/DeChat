package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import q62.C101048b;
import z33.C112597j;

/* renamed from: com.tencent.mm.plugin.voip.model.h0$$e */
public class h0$$e implements C101048b.C35768a {

    /* renamed from: a */
    public final /* synthetic */ C106350h0 f317362a;

    public h0$$e(C106350h0 h0Var) {
        this.f317362a = h0Var;
    }

    /* renamed from: a */
    public void mo60388a(int i, int i2) {
        int handleCommand;
        Log.m105918d("MicroMsg.Voip.VoipService", "simtype " + i + " reason " + i2);
        if (i2 == 3 && i == 1 && (handleCommand = this.f317362a.f317332a.f317396a.f317500x.handleCommand(2, (byte[]) null, 0)) < 0) {
            C112597j.m153937b("MicroMsg.Voip.VoipService", "v2protocal handlecommand failed ret:" + handleCommand);
        }
    }
}
