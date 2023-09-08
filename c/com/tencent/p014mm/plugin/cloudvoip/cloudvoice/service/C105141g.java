package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.plugin.voip.model.C106336d;
import com.tencent.p014mm.sdk.platformtools.Log;
import p375qh.C110390f;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g */
public class C105141g {

    /* renamed from: a */
    public C105149i f312174a = new C105149i();

    /* renamed from: b */
    public volatile C110390f f312175b;

    /* renamed from: c */
    public C105139f f312176c = new C105139f();

    /* renamed from: d */
    public int f312177d = 1;

    /* renamed from: e */
    public int f312178e = 92;

    /* renamed from: f */
    public int f312179f = 1;

    /* renamed from: g */
    public final Object f312180g = new Object();

    /* renamed from: h */
    public int f312181h = 0;

    /* renamed from: i */
    public int f312182i = 0;

    /* renamed from: j */
    public int f312183j = 1;

    /* renamed from: k */
    public long f312184k = 0;

    /* renamed from: l */
    public boolean f312185l = false;

    /* renamed from: m */
    public boolean f312186m = false;

    /* renamed from: n */
    public int f312187n = 16000;

    /* renamed from: o */
    public int f312188o = 1;

    /* renamed from: p */
    public int f312189p = 30;

    /* renamed from: q */
    public C110390f.C89659b f312190q = new C105142a();

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g$a */
    public class C105142a implements C110390f.C89659b {
        public C105142a() {
        }

        /* renamed from: a */
        public void mo35508a(byte[] bArr, int i) {
            synchronized (C105141g.this.f312180g) {
                mo149454c(bArr, i);
            }
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
        }

        /* renamed from: c */
        public final void mo149454c(byte[] bArr, int i) {
            C105141g gVar = C105141g.this;
            int i2 = gVar.f312182i + 1;
            gVar.f312182i = i2;
            if (i2 % 50 == 0) {
                gVar.f312182i = 0;
                Log.m105927v("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "hy: syncOnRecPcmDataReady pcm raw length: %d, given len; %d", Integer.valueOf(bArr.length), Integer.valueOf(i));
            }
            C105141g gVar2 = C105141g.this;
            if (gVar2.f312177d == 2) {
                C106336d dVar = gVar2.f312174a.f312216c.f327637m;
                if (dVar != null) {
                    if (gVar2.f312178e <= 10) {
                        gVar2.f312178e = 92;
                    }
                    int i3 = -1;
                    int a = dVar != null ? dVar.mo152542a() : -1;
                    C105141g gVar3 = C105141g.this;
                    int i4 = ((gVar3.f312178e * 3) + (a + 24)) / 4;
                    gVar3.f312178e = i4;
                    if (gVar3.f312179f == 1) {
                        C106336d dVar2 = gVar3.f312174a.f312216c.f327637m;
                        if (dVar2 != null) {
                            i3 = (dVar2.f317187J / dVar2.f317209n) * dVar2.f317208m;
                        }
                        if (i3 >= i4) {
                            i3 -= i4;
                        }
                        gVar3.f312178e = i3;
                        gVar3.f312179f = 0;
                    } else {
                        gVar3.f312178e = 0;
                    }
                    if (1 == gVar3.f312183j) {
                        gVar3.f312183j = 0;
                        gVar3.f312184k = System.currentTimeMillis();
                        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "amyfwang,first record");
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = currentTimeMillis - C105141g.this.f312184k;
                        if (j > 1000) {
                            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "amyfwang,error,deltaTime:" + j);
                        }
                        C105141g.this.f312184k = currentTimeMillis;
                    }
                    C105181w wVar = C105181w.INSTANCE;
                    int length = bArr.length;
                    int i5 = C105141g.this.f312178e;
                    wVar.getClass();
                    C105172s.f312297c.SendAudioData(bArr, length, i5);
                }
            }
        }
    }

    public C105141g(C105165o oVar) {
    }
}
