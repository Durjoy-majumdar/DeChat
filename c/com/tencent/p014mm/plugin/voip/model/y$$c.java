package com.tencent.p014mm.plugin.voip.model;

import p206nj.C76861g;
import z33.C112597j;

/* renamed from: com.tencent.mm.plugin.voip.model.y$$c */
public final /* synthetic */ class y$$c implements C106333b {

    /* renamed from: a */
    public final /* synthetic */ C106400y f317736a;

    public /* synthetic */ y$$c(C106400y yVar) {
        this.f317736a = yVar;
    }

    /* renamed from: a */
    public final int mo149458a(byte[] bArr, int i) {
        int playCallback;
        C106400y yVar = this.f317736a;
        if (yVar.f317710c == 2) {
            if (1 == yVar.f317721n) {
                yVar.f317721n = 0;
                yVar.f317723p = System.currentTimeMillis();
                C112597j.m153938c("MicroMsg.Voip.VoipDeviceHandler", "amyfwang,first play");
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - yVar.f317723p;
                if (j > 1000) {
                    C112597j.m153938c("MicroMsg.Voip.VoipDeviceHandler", "amyfwang,error,play deltaTime:" + j);
                }
                yVar.f317723p = currentTimeMillis;
            }
            v2protocal v2protocal = yVar.f317711d.f317500x;
            if (!v2protocal.f317580K1 || (playCallback = v2protocal.playCallback(bArr, i)) >= 0) {
                return 0;
            }
            C112597j.m153937b("MicroMsg.Voip.VoipDeviceHandler", C76861g.m92660c() + "protocal.playcallback ret:" + playCallback);
        }
        return -1;
    }
}
