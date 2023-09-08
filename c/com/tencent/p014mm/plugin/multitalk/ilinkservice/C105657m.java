package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import c82.C104322a;
import c82.C104323b;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.voip.model.C106333b;
import com.tencent.p014mm.plugin.voip.model.C106336d;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import p156gj.C107835h0;
import p375qh.C110390f;
import pu0.C110248b;
import rx3.C13598b0;
import te3.C49918iz;
import te3.C50633o40;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.m */
public class C105657m {

    /* renamed from: a */
    public C105669o f314153a;

    /* renamed from: b */
    public volatile C110390f f314154b;

    /* renamed from: c */
    public C105653l f314155c;

    /* renamed from: d */
    public C104322a f314156d = new C104322a();

    /* renamed from: e */
    public int f314157e = 1;

    /* renamed from: f */
    public int f314158f = 92;

    /* renamed from: g */
    public int f314159g = 1;

    /* renamed from: h */
    public final Object f314160h = new Object();

    /* renamed from: i */
    public int f314161i = 0;

    /* renamed from: j */
    public int f314162j = 0;

    /* renamed from: k */
    public int f314163k = 1;

    /* renamed from: l */
    public long f314164l = 0;

    /* renamed from: m */
    public int f314165m = v2protocal.f317532S1;

    /* renamed from: n */
    public int f314166n = 1;

    /* renamed from: o */
    public int f314167o = 20;

    /* renamed from: p */
    public C110390f.C89659b f314168p = new C105658a();

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.m$a */
    public class C105658a implements C110390f.C89659b {
        public C105658a() {
        }

        /* renamed from: a */
        public void mo35508a(byte[] bArr, int i) {
            synchronized (C105657m.this.f314160h) {
                mo150529c(bArr, i);
            }
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
        }

        /* renamed from: c */
        public final void mo150529c(byte[] bArr, int i) {
            int i2;
            C105657m mVar = C105657m.this;
            int i3 = mVar.f314162j + 1;
            mVar.f314162j = i3;
            if (i3 % 50 == 0) {
                mVar.f314162j = 0;
                Log.m105927v("MicroMsg.Multitalk.ILinkAudioMgr", "hy: syncOnRecPcmDataReady pcm raw length: %d, given len; %d", Integer.valueOf(bArr.length), Integer.valueOf(i));
            }
            C105657m mVar2 = C105657m.this;
            if (mVar2.f314157e == 2) {
                if (mVar2.f314153a.f314187c != null) {
                    if (mVar2.f314158f <= 10) {
                        mVar2.f314158f = 92;
                    }
                    C104323b bVar = C105851w0.zx0().f314469K;
                    int i4 = -1;
                    if (bVar != null) {
                        C106336d dVar = bVar.f308783l;
                        i2 = dVar != null ? dVar.mo152542a() : -1;
                    } else {
                        i2 = 0;
                    }
                    C105657m mVar3 = C105657m.this;
                    mVar3.f314158f = ((mVar3.f314158f * 3) + (i2 + 24)) / 4;
                    if (mVar3.f314159g == 1) {
                        mVar3.f314153a.getClass();
                        C104323b bVar2 = C105851w0.zx0().f314469K;
                        if (bVar2 != null) {
                            C106336d dVar2 = bVar2.f308783l;
                            if (dVar2 != null) {
                                i4 = (dVar2.f317187J / dVar2.f317209n) * dVar2.f317208m;
                            }
                        } else {
                            i4 = 0;
                        }
                        C105657m mVar4 = C105657m.this;
                        int i5 = mVar4.f314158f;
                        if (i4 >= i5) {
                            i4 -= i5;
                        }
                        mVar4.f314158f = i4;
                        mVar4.f314159g = 0;
                    } else {
                        mVar3.f314158f = 0;
                    }
                    C105657m mVar5 = C105657m.this;
                    if (1 == mVar5.f314163k) {
                        mVar5.f314163k = 0;
                        mVar5.f314164l = System.currentTimeMillis();
                        Log.m105924i("MicroMsg.Multitalk.ILinkAudioMgr", "amyfwang,first record");
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = currentTimeMillis - C105657m.this.f314164l;
                        if (j > 1000) {
                            Log.m105924i("MicroMsg.Multitalk.ILinkAudioMgr", "amyfwang,error,deltaTime:" + j);
                        }
                        C105657m.this.f314164l = currentTimeMillis;
                    }
                    C105724z zVar = C105724z.INSTANCE;
                    int length = bArr.length;
                    int i6 = C105657m.this.f314158f;
                    zVar.getClass();
                    C105714w.f314302c.SendAudioData(bArr, length, i6);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.m$b */
    public class C105659b implements C106333b {
        public C105659b() {
        }

        /* renamed from: a */
        public int mo149458a(byte[] bArr, int i) {
            if (C105657m.this.f314157e != 2) {
                return -1;
            }
            C105724z.INSTANCE.getClass();
            int GetAudioData = C105714w.f314302c.GetAudioData(bArr, i);
            C105657m.this.getClass();
            return GetAudioData < 0 ? -1 : 0;
        }
    }

    public C105657m(C105689s sVar) {
        C105851w0.zx0().f314469K = this.f314156d;
        this.f314155c = new C105653l();
        this.f314153a = new C105669o();
    }

    /* renamed from: a */
    public int mo150523a() {
        C104323b bVar;
        C106336d dVar;
        if (this.f314153a == null || (bVar = C105851w0.zx0().f314469K) == null || (dVar = bVar.f308783l) == null) {
            return 0;
        }
        return dVar.mo152549h();
    }

    /* renamed from: b */
    public void mo150524b() {
        if (this.f314157e == 2) {
            Log.m105920e("MicroMsg.Multitalk.ILinkAudioMgr", "dev start already...");
            return;
        }
        this.f314153a.getClass();
        MMHandlerThread.postToMainThread(C105665n.f314180d);
        Log.m105924i("MicroMsg.Multitalk.ILinkAudioMgr", "start device......");
        this.f314157e = 2;
        this.f314155c.getClass();
        C107835h0.f322846c.mo158230d();
        this.f314155c.mo150519a();
        int i = this.f314158f;
        if (i <= 10) {
            if (i <= 0) {
                this.f314161i = 1;
            }
            this.f314158f = 92;
        }
        this.f314154b = new C110390f(this.f314165m, this.f314166n, 1);
        this.f314154b.mo161902g(this.f314167o);
        this.f314154b.mo161905j(true);
        this.f314154b.mo161901f(true);
        this.f314154b.f330234m = -19;
        this.f314154b.mo161903h(1, false);
        this.f314154b.mo161904i(true);
        this.f314154b.f330245x = this.f314168p;
    }

    /* renamed from: c */
    public void mo150525c() {
        this.f314156d = null;
        C105669o oVar = this.f314153a;
        if (oVar != null) {
            synchronized (oVar.f314185a) {
                Log.m105925i("MicroMsg.Multitalk.ILinkAudioPlayer", "stopPlay, isStart: %s %s", Boolean.valueOf(oVar.f314186b), Integer.valueOf(oVar.hashCode()));
                if (oVar.f314186b) {
                    C106336d dVar = oVar.f314187c;
                    if (dVar != null) {
                        dVar.mo152546e();
                        C106336d dVar2 = oVar.f314187c;
                        C87412m.m108591d(dVar2);
                        dVar2.mo152547f();
                        oVar.f314187c = null;
                        C104323b bVar = C105851w0.zx0().f314469K;
                        if (bVar != null) {
                            bVar.f308783l = null;
                        }
                    }
                    C104323b bVar2 = C105851w0.zx0().f314469K;
                    if (bVar2 != null) {
                        bVar2.mo146011B();
                    }
                    oVar.f314188d.mo72289b();
                    Log.m105924i("MicroMsg.Multitalk.ILinkAudioPlayer", "stopPlaying cost: " + oVar.f314188d.mo72288a());
                    oVar.f314186b = false;
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        C105851w0.xx0().mo150829i();
        Log.m105924i("MicroMsg.Multitalk.ILinkAudioMgr", "stopRecord.");
        if (this.f314154b != null) {
            this.f314154b.mo161907l();
            this.f314154b = null;
            Log.m105924i("MicroMsg.Multitalk.ILinkAudioMgr", "finish pauseRecord");
        }
        C105724z.INSTANCE.mo150613w(false);
        this.f314157e = 3;
        if (this.f314153a != null) {
            C104323b bVar3 = C105851w0.zx0().f314469K;
            if (bVar3 != null) {
                bVar3.mo146011B();
            }
            this.f314153a.getClass();
            if (C105851w0.zx0().f314469K != null) {
                C110248b.f329777h.mo161670o("multitalke");
            }
        }
        C105851w0.xx0().mo150829i();
    }

    /* renamed from: d */
    public void mo150526d(C49918iz izVar) {
        if (izVar != null) {
            C50633o40 o402 = izVar.f135764e;
            this.f314165m = o402.f138945d;
            this.f314166n = o402.f138947f;
            this.f314167o = o402.f138946e;
        }
    }

    /* renamed from: e */
    public boolean mo150527e() {
        C105669o oVar;
        int i;
        if (this.f314157e != 2 || (oVar = this.f314153a) == null) {
            Log.m105920e("MicroMsg.Multitalk.ILinkAudioMgr", "hy: error not init when startplay, devStatus:" + this.f314157e);
            return false;
        }
        C105659b bVar = new C105659b();
        int i2 = this.f314165m;
        int i3 = this.f314166n;
        int i4 = this.f314167o;
        oVar.getClass();
        Log.m105927v("MicroMsg.Multitalk.ILinkAudioPlayer", "hy: start play with %d, %d, %d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        synchronized (oVar.f314185a) {
            if (oVar.f314186b) {
                Log.m105918d("MicroMsg.Multitalk.ILinkAudioPlayer", "startPlay, already start");
                i = -1;
            } else {
                Log.m105925i("MicroMsg.Multitalk.ILinkAudioPlayer", "startPlay %s", Integer.valueOf(oVar.hashCode()));
                int a = oVar.mo150536a(bVar, i2, i3, i4);
                C104323b bVar2 = C105851w0.zx0().f314469K;
                if (bVar2 != null) {
                    bVar2.f308783l = oVar.f314187c;
                }
                oVar.f314188d.mo72289b();
                Log.m105924i("MicroMsg.Multitalk.ILinkAudioPlayer", "startPlaying cost: " + oVar.f314188d.mo72288a());
                Log.m105924i("MicroMsg.Multitalk.ILinkAudioPlayer", "set start play");
                oVar.f314186b = true;
                Log.m105925i("MicroMsg.Multitalk.ILinkAudioPlayer", "finish start play: %s", Integer.valueOf(a));
                C13598b0 b0Var = C13598b0.f38549a;
                i = a;
            }
        }
        if (i <= 0) {
            this.f314161i = 1;
            return false;
        }
        C105851w0.xx0().mo150828h();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        r0 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE;
        r0.mo150613w(r7);
        r0.f314407p1 = r7;
        r7 = !r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r6.f314154b == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r6.f314154b.mo161909n(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105918d("MicroMsg.Multitalk.ILinkAudioMgr", "VoipDeivceHandler.m_iAudioDevErr:" + r6.f314161i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        return true;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo150528f(boolean r7) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.Multitalk.ILinkAudioMgr"
            java.lang.String r1 = "hy: trigger startrecord, isMicEnable:%b"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            r5 = 0
            r3[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)
            int r0 = r6.f314157e
            r1 = 2
            if (r0 != r1) goto L_0x0060
            qh.f r0 = r6.f314154b
            if (r0 != 0) goto L_0x001b
            goto L_0x0060
        L_0x001b:
            java.lang.Object r0 = r6.f314160h
            monitor-enter(r0)
            qh.f r1 = r6.f314154b     // Catch:{ all -> 0x005d }
            boolean r1 = r1.mo161906k()     // Catch:{ all -> 0x005d }
            if (r1 != 0) goto L_0x0032
            qh.f r7 = r6.f314154b     // Catch:{ all -> 0x005d }
            int r7 = r7.f330222a     // Catch:{ all -> 0x005d }
            r1 = 13
            if (r7 == r1) goto L_0x0030
            r6.f314161i = r2     // Catch:{ all -> 0x005d }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            return r5
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            com.tencent.mm.plugin.multitalk.ilinkservice.z r0 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE
            r0.mo150613w(r7)
            r0.f314407p1 = r7
            r7 = r7 ^ r2
            qh.f r0 = r6.f314154b
            if (r0 == 0) goto L_0x0044
            qh.f r0 = r6.f314154b
            r0.mo161909n(r7)
        L_0x0044:
            java.lang.String r7 = "MicroMsg.Multitalk.ILinkAudioMgr"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VoipDeivceHandler.m_iAudioDevErr:"
            r0.append(r1)
            int r1 = r6.f314161i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r0)
            return r2
        L_0x005d:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            throw r7
        L_0x0060:
            java.lang.String r7 = "MicroMsg.Multitalk.ILinkAudioMgr"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "hy: not init when startrecord! devStatus:"
            r0.append(r1)
            int r1 = r6.f314157e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.ilinkservice.C105657m.mo150528f(boolean):boolean");
    }
}
