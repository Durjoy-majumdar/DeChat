package com.tencent.p014mm.plugin.voip.model;

import p375qh.C110390f;
import z33.C112597j;

/* renamed from: com.tencent.mm.plugin.voip.model.y$$d */
public class y$$d implements C110390f.C89659b {

    /* renamed from: a */
    public final /* synthetic */ C106400y f317737a;

    public y$$d(C106400y yVar) {
        this.f317737a = yVar;
    }

    /* renamed from: a */
    public void mo35508a(byte[] bArr, int i) {
        synchronized (this.f317737a.f317715h) {
            mo152867c(bArr, i);
        }
    }

    /* renamed from: b */
    public void mo35509b(int i, int i2) {
        if (i2 == 4 || i2 == 3 || i2 == 2) {
            this.f317737a.f317711d.f317502z.mo152422C0();
        }
    }

    /* renamed from: c */
    public final void mo152867c(byte[] bArr, int i) {
        C106336d dVar = this.f317737a.f317708a;
        C106400y yVar = this.f317737a;
        if (yVar.f317710c == 2 && dVar != null) {
            if (yVar.f317714g == 1) {
                yVar.f317712e = System.currentTimeMillis();
                C106400y yVar2 = this.f317737a;
                yVar2.f317713f = yVar2.f317712e;
                yVar2.f317714g = 0;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                C106400y yVar3 = this.f317737a;
                long j = yVar3.f317713f;
                yVar3.f317712e = currentTimeMillis;
            }
            C106400y yVar4 = this.f317737a;
            if (1 == yVar4.f317720m) {
                yVar4.f317720m = 0;
                yVar4.f317722o = System.currentTimeMillis();
                C112597j.m153938c("MicroMsg.Voip.VoipDeviceHandler", "amyfwang,first record");
            } else {
                long currentTimeMillis2 = System.currentTimeMillis();
                long j2 = currentTimeMillis2 - this.f317737a.f317722o;
                if (j2 > 1000) {
                    C112597j.m153938c("MicroMsg.Voip.VoipDeviceHandler", "amyfwang,error,record deltaTime:" + j2);
                }
                this.f317737a.f317722o = currentTimeMillis2;
            }
            C110390f fVar = this.f317737a.f317709b;
            if (fVar != null) {
                this.f317737a.f317711d.f317500x.f317639h0 = fVar.mo161898c();
                this.f317737a.f317711d.f317500x.recordCallback(bArr, i);
            }
        }
    }
}
