package com.tencent.p014mm.plugin.voip.model;

import z33.C112597j;

/* renamed from: com.tencent.mm.plugin.voip.model.v */
public class C106397v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C106377r f317530d;

    public C106397v(C106377r rVar) {
        this.f317530d = rVar;
    }

    public void run() {
        C106377r rVar = this.f317530d;
        int i = rVar.f317476a;
        if (i != 4 && i != 5 && i != 6) {
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "startConnectDirect status fail, status:" + this.f317530d.f317476a);
        } else if (rVar.f317479c) {
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "can not startConnectDirect again");
        } else {
            rVar.f317479c = true;
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "v2protocal StartConnectChannel direct");
            v2protocal v2protocal = this.f317530d.f317500x;
            byte[] bArr = v2protocal.f317667q1;
            if (bArr == null) {
                C112597j.m153937b("MicroMsg.Voip.VoipContext", "direct conns buf null");
                return;
            }
            int AddNewDirectConns = v2protocal.AddNewDirectConns(bArr, bArr.length, 0);
            if (AddNewDirectConns < 0) {
                C112597j.m153937b("MicroMsg.Voip.VoipContext", "v2protocal connectToPeerDirect failed, ret:" + AddNewDirectConns);
                return;
            }
            this.f317530d.mo152712o();
        }
    }
}
