package sn2;

import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.qafpapi.QAFPNative;
import eb0.C97625j3;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import p206nj.C76861g;
import p375qh.C110390f;
import te3.C49335eu3;

/* renamed from: sn2.b */
public class C22371b implements C11385n {

    /* renamed from: d */
    public byte[] f63423d = new byte[Task.EXTRAS_LIMIT_BYTES];

    /* renamed from: e */
    public int f63424e = 0;

    /* renamed from: f */
    public int f63425f = 0;

    /* renamed from: g */
    public long f63426g = 0;

    /* renamed from: h */
    public int f63427h = 0;

    /* renamed from: i */
    public boolean f63428i = false;

    /* renamed from: j */
    public C48436g f63429j = null;

    /* renamed from: n */
    public Object f63430n = new Object();

    /* renamed from: o */
    public C22375l f63431o = null;

    /* renamed from: p */
    public C110390f f63432p;

    /* renamed from: q */
    public boolean f63433q = false;

    /* renamed from: r */
    public boolean f63434r = false;

    /* renamed from: s */
    public int f63435s = 0;

    /* renamed from: t */
    public int f63436t;

    /* renamed from: u */
    public boolean f63437u = false;

    /* renamed from: v */
    public long f63438v;

    /* renamed from: w */
    public int f63439w;

    /* renamed from: x */
    public boolean f63440x = false;

    /* renamed from: y */
    public C110390f.C89659b f63441y = new C22372a();

    /* renamed from: sn2.b$a */
    public class C22372a implements C110390f.C89659b {
        public C22372a() {
        }

        /* renamed from: a */
        public void mo35508a(byte[] bArr, int i) {
            int i2;
            int i3;
            C22371b bVar;
            C76861g.C47263a aVar = new C76861g.C47263a();
            synchronized (C22371b.this.f63430n) {
                if (C22371b.this.f63427h == 408) {
                    Log.m105926v("MicroMsg.MusicFingerPrintRecorder", "shake tv branch, QAFPProcessTV");
                    i2 = QAFPNative.QAFPProcessTV(bArr, i);
                } else {
                    i2 = QAFPNative.QAFPProcess(bArr, i);
                }
            }
            long nowMilliSecond = Util.nowMilliSecond();
            C22371b bVar2 = C22371b.this;
            long j = nowMilliSecond - bVar2.f63438v;
            Log.m105919d("MicroMsg.MusicFingerPrintRecorder", "QAFPProcess clientid:%d pcm:%d ret:%d dur:%d usetime:%d", Integer.valueOf(bVar2.f63435s), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), Long.valueOf(aVar.mo72288a()));
            if (j > ((long) ((C22371b.this.f63439w * 3000) + 4000))) {
                byte[] bArr2 = new byte[Task.EXTRAS_LIMIT_BYTES];
                C76861g.C47263a aVar2 = new C76861g.C47263a();
                if (C22371b.this.f63427h == 408) {
                    Log.m105926v("MicroMsg.MusicFingerPrintRecorder", "shake tv branch, QAFPGetAudioFingerPrintTV");
                    i3 = QAFPNative.QAFPGetAudioFingerPrintTV(bArr2);
                } else {
                    i3 = QAFPNative.QAFPGetAudioFingerPrint(bArr2);
                }
                Log.m105919d("MicroMsg.MusicFingerPrintRecorder", "QAFPGetAudioFingerPrint clientid:%d outLen:%d time:%d", Integer.valueOf(C22371b.this.f63435s), Integer.valueOf(i3), Long.valueOf(aVar2.mo72288a()));
                if (i3 >= 10240 || i3 <= 0) {
                    Log.m105921e("MicroMsg.MusicFingerPrintRecorder", "QAFPGetAudioFingerPrint clientid:%d  out ret:%d  !stop record now", Integer.valueOf(C22371b.this.f63435s), Integer.valueOf(i3));
                    C22371b.this.mo35511c();
                    return;
                }
                synchronized (C22371b.this.f63423d) {
                    System.arraycopy(bArr2, 0, C22371b.this.f63423d, 0, i3);
                    bVar = C22371b.this;
                    bVar.f63424e = i3;
                    bVar.f63434r = bVar.f63439w >= 3;
                    bVar.f63425f = (int) (j / 1000);
                }
                C86709a0.m107525e().postToWorker(new C22374c(bVar));
                C22371b.this.f63439w++;
            }
            C22371b bVar3 = C22371b.this;
            if (bVar3.f63434r) {
                Log.m105929w("MicroMsg.MusicFingerPrintRecorder", "client:%d stop now! duration:%d  ", Integer.valueOf(bVar3.f63435s), Long.valueOf(j));
                C22371b.this.mo35511c();
            }
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
        }
    }

    /* renamed from: sn2.b$b */
    public class C22373b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f63443d;

        /* renamed from: e */
        public final /* synthetic */ boolean f63444e;

        public C22373b(boolean z, boolean z2) {
            this.f63443d = z;
            this.f63444e = z2;
        }

        public void run() {
            if (this.f63443d) {
                C22371b.m26054a(C22371b.this, (C49335eu3) null, -1, this.f63444e);
                return;
            }
            C22371b bVar = C22371b.this;
            if (!bVar.f63428i) {
                Log.m105928w("MicroMsg.MusicFingerPrintRecorder", "tryCallBack netscen not return.");
            } else if (bVar.f63432p != null) {
                Log.m105928w("MicroMsg.MusicFingerPrintRecorder", "tryCallBack device not ready!");
            } else {
                C48436g gVar = bVar.f63429j;
                if (gVar != null) {
                    C49335eu3 j1 = gVar.mo73108j1();
                    C48436g gVar2 = C22371b.this.f63429j;
                    gVar2.getClass();
                    long nowMilliSecond = Util.nowMilliSecond();
                    long j = gVar2.f129615e;
                    if (j > 0 && j < nowMilliSecond) {
                        nowMilliSecond = j;
                    }
                    C22371b.m26054a(bVar, j1, nowMilliSecond, this.f63444e);
                    return;
                }
                C22371b.m26054a(bVar, (C49335eu3) null, -1, this.f63444e);
            }
        }
    }

    /* renamed from: a */
    public static void m26054a(C22371b bVar, C49335eu3 eu32, long j, boolean z) {
        synchronized (bVar) {
            if (!bVar.f63440x) {
                bVar.f63431o.mo35517a(eu32, j, z);
                bVar.f63440x = true;
            } else {
                Log.m105928w("MicroMsg.MusicFingerPrintRecorder", "hy: already call backed to UI");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo35510b() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f63430n
            monitor-enter(r0)
            boolean r1 = r8.f63437u     // Catch:{ all -> 0x002e }
            r2 = 0
            if (r1 == 0) goto L_0x0011
            java.lang.String r1 = "MicroMsg.MusicFingerPrintRecorder"
            java.lang.String r3 = "QAFPInit already inited"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r3)     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return r2
        L_0x0011:
            int r1 = com.tencent.qafpapi.QAFPNative.QAFPInit()     // Catch:{ all -> 0x002e }
            java.lang.String r3 = "MicroMsg.MusicFingerPrintRecorder"
            java.lang.String r4 = "QAFPInit ret:%d"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x002e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x002e }
            r6[r2] = r7     // Catch:{ all -> 0x002e }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r6)     // Catch:{ all -> 0x002e }
            if (r1 < 0) goto L_0x0029
            r8.f63437u = r5     // Catch:{ all -> 0x002e }
        L_0x0029:
            if (r1 < 0) goto L_0x002c
            r2 = 1
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return r2
        L_0x002e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sn2.C22371b.mo35510b():boolean");
    }

    /* renamed from: c */
    public final void mo35511c() {
        Log.m105919d("MicroMsg.MusicFingerPrintRecorder", "reset recorder clientid:%d", Integer.valueOf(this.f63435s));
        C110390f fVar = this.f63432p;
        if (fVar != null) {
            fVar.mo161907l();
            this.f63432p = null;
        }
        mo35513e(false, false);
    }

    /* renamed from: d */
    public boolean mo35512d() {
        Log.m105919d("MicroMsg.MusicFingerPrintRecorder", "stopRecord now clientid:%d", Integer.valueOf(this.f63435s));
        C97625j3.m125815e().mo123470p(367, this);
        C97625j3.m125815e().mo123470p(408, this);
        synchronized (this.f63423d) {
            this.f63424e = 0;
        }
        C110390f fVar = this.f63432p;
        if (fVar != null) {
            fVar.mo161907l();
            this.f63432p = null;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo35513e(boolean z, boolean z2) {
        Log.m105919d("MicroMsg.MusicFingerPrintRecorder", "tryCallBack, directFail = %s", Boolean.valueOf(z));
        MMHandlerThread.postToMainThread(new C22373b(z, z2));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 367 || yVar.getType() == 408) {
            Log.m105919d("MicroMsg.MusicFingerPrintRecorder", "onSceneEnd errType = %s, errCode = %s", Integer.valueOf(i), Integer.valueOf(i2));
            this.f63433q = false;
            C48436g gVar = (C48436g) yVar;
            if (gVar.f129614d) {
                Log.m105919d("MicroMsg.MusicFingerPrintRecorder", "NetSceneShakeMedia isRecogSuccess stop now ! clientid:%d", Integer.valueOf(this.f63435s));
                mo35512d();
                this.f63429j = gVar;
                this.f63428i = true;
                mo35513e(false, false);
            } else if (this.f63424e != 0 || !this.f63434r) {
                Log.m105919d("MicroMsg.MusicFingerPrintRecorder", "NetScene try again clientId:%d", Integer.valueOf(this.f63435s));
                C86709a0.m107525e().postToWorker(new C22374c(this));
            } else {
                Log.m105919d("MicroMsg.MusicFingerPrintRecorder", "recog failed . clientid:%d", Integer.valueOf(this.f63435s));
                this.f63429j = null;
                this.f63428i = true;
                if (i == 0 && i2 == 0) {
                    mo35513e(false, false);
                } else {
                    mo35513e(false, true);
                }
                C97625j3.m125815e().mo123470p(367, this);
                C97625j3.m125815e().mo123470p(408, this);
            }
        }
    }
}
