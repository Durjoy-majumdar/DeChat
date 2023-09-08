package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.plugin.voip.model.C106377r;
import z33.C112597j;

/* renamed from: com.tencent.mm.plugin.voip.model.u */
public class C106396u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f317526d;

    /* renamed from: e */
    public final /* synthetic */ int f317527e;

    /* renamed from: f */
    public final /* synthetic */ int f317528f;

    /* renamed from: g */
    public final /* synthetic */ C106377r.C106386g f317529g;

    public C106396u(C106377r.C106386g gVar, int i, int i2, int i3) {
        this.f317529g = gVar;
        this.f317526d = i;
        this.f317527e = i2;
        this.f317528f = i3;
    }

    public void run() {
        C112597j.m153938c("MicroMsg.Voip.VoipContext", "v2protocal StartConnectChannel relay");
        v2protocal v2protocal = C106377r.this.f317500x;
        int i = v2protocal.f317597Q0;
        int i2 = (((i >> 2) & 3) >> 1) & 1 & ((i & 3) >> 1) & 1;
        int i3 = v2protocal.f317653m;
        long j = (long) v2protocal.f317656n;
        int i4 = v2protocal.f317662p;
        long j2 = v2protocal.f317665q;
        byte[] bArr = v2protocal.f317671s;
        int i5 = v2protocal.f317686x;
        int i6 = v2protocal.f317689y;
        int i7 = v2protocal.f317692z;
        int i8 = v2protocal.f317680v;
        byte[] bArr2 = v2protocal.f317683w;
        String str = "MicroMsg.Voip.VoipContext";
        int length = bArr2 == null ? 0 : bArr2.length;
        int i9 = v2protocal.f317548A;
        int i15 = v2protocal.f317638h;
        byte[] bArr3 = bArr2;
        int i16 = v2protocal.f317619a1;
        byte[] bArr4 = v2protocal.f317622b1;
        int i17 = v2protocal.f317625c1;
        long j3 = j2;
        int i18 = v2protocal.f317551B;
        long j4 = v2protocal.f317554C;
        byte[] bArr5 = v2protocal.f317560E;
        int length2 = bArr5 == null ? 0 : bArr5.length;
        byte[] bArr6 = v2protocal.f317557D;
        long j5 = j4;
        int i19 = i9;
        int configInfo = v2protocal.setConfigInfo(i3, j, i4, 0, j3, bArr, i5, i6, i7, i8, length, bArr3, i19, i2, i15, i16, bArr4, i17, i18, j5, length2, bArr5, bArr6 == null ? 0 : bArr6.length, bArr6, v2protocal.f317628d1, this.f317526d, this.f317527e, this.f317528f, "", "", v2protocal.m143438u());
        if (configInfo < 0) {
            C112597j.m153937b(str, "v2protocal setConfigInfo or connectToPeerRelay failed, ret:" + configInfo);
            C106377r rVar = C106377r.this;
            rVar.f317500x.f317568G1.f317772a = 14;
            rVar.mo152719v(1, -9002, "", -1);
            this.f317529g.f317513a.mo152686a();
            return;
        }
        String str2 = str;
        v2protocal v2protocal2 = C106377r.this.f317500x;
        byte[] bArr7 = v2protocal2.f317664p1;
        if (bArr7 == null) {
            C112597j.m153937b(str2, "relay conns buf null");
            C106377r.this.mo152719v(1, -9002, "", -1);
            this.f317529g.f317513a.mo152686a();
            return;
        }
        int AddNewRelayConns = v2protocal2.AddNewRelayConns(bArr7, bArr7.length, 0, false);
        if (AddNewRelayConns < 0) {
            C112597j.m153937b(str2, "add relayconns err:" + AddNewRelayConns);
            C106377r.this.mo152719v(1, -9002, "", -1);
            this.f317529g.f317513a.mo152686a();
            return;
        }
        C106377r.C106386g gVar = this.f317529g;
        C106377r rVar2 = C106377r.this;
        rVar2.f317478b = true;
        C106401z zVar = rVar2.f317500x.f317568G1;
        zVar.f317779h = 1;
        zVar.f317787p = 1;
        gVar.f317513a.mo152686a();
    }
}
