package com.tencent.p014mm.modelvoiceaddr;

import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.modelvoiceaddr.C17800a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver;
import f40.C86709a0;
import java.util.List;
import md0.C76751a;
import md0.C99846b;
import nd0.C117623b;
import ob0.C11385n;
import ob0.C117747y;
import p156gj.C107835h0;
import p375qh.C101193k;
import p375qh.C110390f;
import p827uh.C102032a;
import p827uh.C102034c;

/* renamed from: com.tencent.mm.modelvoiceaddr.b */
public class C92866b implements C11385n, C17800a {

    /* renamed from: t */
    public static final String f267521t = (C72994y1.f212832a + "voice_temp.silk");

    /* renamed from: u */
    public static int f267522u = 5000;

    /* renamed from: d */
    public int f267523d;

    /* renamed from: e */
    public int f267524e;

    /* renamed from: f */
    public boolean f267525f;

    /* renamed from: g */
    public boolean f267526g;

    /* renamed from: h */
    public int f267527h;

    /* renamed from: i */
    public int f267528i;

    /* renamed from: j */
    public C17800a.C17801a f267529j;

    /* renamed from: n */
    public C110390f f267530n;

    /* renamed from: o */
    public C102032a f267531o;

    /* renamed from: p */
    public C117623b f267532p;

    /* renamed from: q */
    public C76751a f267533q;

    /* renamed from: r */
    public C110390f.C89659b f267534r;

    /* renamed from: s */
    public C117623b.C117625b f267535s;

    /* renamed from: com.tencent.mm.modelvoiceaddr.b$d */
    public interface C68146d extends C17800a.C17801a {
    }

    /* renamed from: com.tencent.mm.modelvoiceaddr.b$a */
    public class C92867a implements C110390f.C89659b {

        /* renamed from: a */
        public short[] f267536a;

        public C92867a() {
        }

        /* renamed from: a */
        public void mo35508a(byte[] bArr, int i) {
            int i2;
            Log.m105919d("MicroMsg.SceneVoiceInputAddr", "OnRecPcmDataReady len: %s time: %s", Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()));
            short[] sArr = this.f267536a;
            if (sArr == null || sArr.length < i / 2) {
                this.f267536a = new short[(i / 2)];
            }
            int i3 = 0;
            while (true) {
                i2 = i / 2;
                if (i3 >= i2) {
                    break;
                }
                int i4 = i3 * 2;
                this.f267536a[i3] = (short) ((bArr[i4 + 1] << 8) | (bArr[i4] & ExifInterface.MARKER));
                i3++;
            }
            C92866b bVar = C92866b.this;
            short[] sArr2 = this.f267536a;
            for (int i5 = 0; i5 < i2; i5++) {
                bVar.getClass();
                short s = sArr2[i5];
                if (s > bVar.f267523d) {
                    bVar.f267523d = s;
                }
            }
            Log.m105919d("MicroMsg.SceneVoiceInputAddr", "setCurAmplitude mMaxAmpSinceLastCall = %s", Integer.valueOf(bVar.f267523d));
            C92866b bVar2 = C92866b.this;
            C117623b bVar3 = bVar2.f267532p;
            if (bVar3 != null) {
                bVar3.mo182348b(this.f267536a, i2);
                return;
            }
            bVar2.mo127257a(9, -1, -1);
            Log.m105920e("MicroMsg.SceneVoiceInputAddr", "mVoiceSilentDetectAPI is null");
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
            Log.m105921e("MicroMsg.SceneVoiceInputAddr", "onRecError state = %s detailState = %s", Integer.valueOf(i), Integer.valueOf(i2));
            C92866b.this.mo127257a(10, -1, -1);
        }
    }

    /* renamed from: com.tencent.mm.modelvoiceaddr.b$b */
    public class C92868b implements C117623b.C117625b {

        /* renamed from: a */
        public byte[] f267538a;

        /* renamed from: com.tencent.mm.modelvoiceaddr.b$b$a */
        public class C92869a implements Runnable {
            public C92869a() {
            }

            public void run() {
                Log.m105925i("MicroMsg.SceneVoiceInputAddr", "run NetSceneNewVoiceInput mWroteBytesCnt %s time %s", Integer.valueOf(C92866b.this.f267524e), Long.valueOf(System.currentTimeMillis()));
                C92866b bVar = C92866b.this;
                if (bVar.f267526g || bVar.f267533q == null || bVar.f267524e == 0) {
                    Log.m105928w("MicroMsg.SceneVoiceInputAddr", "WorkerThread too busy can not do work");
                    return;
                }
                C86709a0.m107524d().mo123455a(235, C92866b.this);
                if (!((C99846b) C92866b.this.f267533q).mo139200q1() || !C86709a0.m107524d().mo123461g(C92866b.this.f267533q, 0)) {
                    C92866b.this.mo127257a(13, 131, -1);
                }
            }
        }

        public C92868b() {
        }

        /* renamed from: a */
        public void mo127259a() {
            Log.m105925i("MicroMsg.SceneVoiceInputAddr", "Silent enough to finish time %s", Long.valueOf(System.currentTimeMillis()));
            C92866b.this.stop(false);
        }

        /* renamed from: b */
        public void mo127260b(short[] sArr, int i) {
            if (sArr != null) {
                byte[] bArr = this.f267538a;
                if (bArr == null || bArr.length < i * 2) {
                    this.f267538a = new byte[(i * 2)];
                }
                for (int i2 = 0; i2 < i; i2++) {
                    byte[] bArr2 = this.f267538a;
                    int i3 = i2 * 2;
                    short s = sArr[i2];
                    bArr2[i3] = (byte) (s & 255);
                    bArr2[i3 + 1] = (byte) ((65280 & s) >> 8);
                }
                C102032a aVar = C92866b.this.f267531o;
                int d = aVar != null ? aVar.mo73540d(new C101193k.C101194a(this.f267538a, i * 2), 0, true) : -1;
                if (-1 == d) {
                    C92866b.this.mo127257a(4, -1, -1);
                    Log.m105920e("MicroMsg.SceneVoiceInputAddr", "write to file failed");
                    return;
                }
                C92866b bVar = C92866b.this;
                int i4 = bVar.f267524e + d;
                bVar.f267524e = i4;
                if (!bVar.f267526g && i4 > 200 && !bVar.f267525f) {
                    C86709a0.m107525e().postToWorker(new C92869a());
                    C92866b.this.f267525f = true;
                }
            }
        }

        /* renamed from: c */
        public void mo127261c(long j) {
            Log.m105924i("MicroMsg.SceneVoiceInputAddr", "onSpeakToSilent");
            C92866b bVar = C92866b.this;
            if (bVar.f267533q instanceof C99846b) {
                bVar.getClass();
                try {
                    ((C99846b) C92866b.this.f267533q).mo139198o1((int) C86013q1.m106451l(C92866b.f267521t));
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.SceneVoiceInputAddr", e, "cutShortSentence error", new Object[0]);
                    C92866b.this.mo127257a(6, -1, -1);
                }
            }
        }

        /* renamed from: d */
        public void mo127262d(long j) {
            Log.m105924i("MicroMsg.SceneVoiceInputAddr", "onSilentToSpeak");
            C76751a aVar = C92866b.this.f267533q;
            if (aVar instanceof C99846b) {
                try {
                    ((C99846b) aVar).f292559g.mo139202b();
                    if (!C92866b.this.f267531o.mo73539c()) {
                        C92866b.this.mo127257a(5, -1, -1);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.SceneVoiceInputAddr", e, "createShortSentence error", new Object[0]);
                    C92866b.this.mo127257a(6, -1, -1);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.modelvoiceaddr.b$c */
    public class C92870c implements Runnable {
        public C92870c(C92867a aVar) {
        }

        /* renamed from: a */
        public void mo127264a() {
            Log.m105925i("MicroMsg.SceneVoiceInputAddr", "initDeviceInLock time %s", Long.valueOf(System.currentTimeMillis()));
            long nanoTime = System.nanoTime() & Util.MAX_32BIT_VALUE;
            if (nanoTime < 0) {
                nanoTime = Math.abs(nanoTime);
            }
            String valueOf = String.valueOf(nanoTime);
            try {
                String str = C92866b.f267521t;
                Uri n = C116299g2.m163858n(str);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
                    if (l2.mo177810a()) {
                        l2.f348991a.mo119937g(l2.f348992b);
                    }
                }
                C92866b.this.getClass();
                C86009m1 m1Var = new C86009m1(str);
                if (!m1Var.mo119967g()) {
                    m1Var.mo119964e();
                }
                m1Var.mo119966f();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SceneVoiceInputAddr", e, "delete file failed", new Object[0]);
            }
            C92866b.this.f267530n = new C110390f(16000, 1, 3);
            C110390f fVar = C92866b.this.f267530n;
            fVar.f330234m = -19;
            fVar.mo161904i(false);
            C92866b.this.f267531o = new C102034c(16000, 23900);
            C92866b bVar = C92866b.this;
            C102032a aVar = bVar.f267531o;
            bVar.getClass();
            String str2 = C92866b.f267521t;
            if (!aVar.mo73537a(str2)) {
                Log.m105920e("MicroMsg.SceneVoiceInputAddr", "init speex writer failed");
                C92866b.this.f267531o.mo73541e();
                C92866b bVar2 = C92866b.this;
                bVar2.f267531o = null;
                bVar2.mo127257a(5, -1, -1);
                return;
            }
            int i = C107835h0.f322856m.f322906m;
            if (i > 0) {
                C92866b.this.f267530n.mo161903h(i, true);
            } else {
                C92866b.this.f267530n.mo161903h(5, false);
            }
            C92866b.this.f267530n.mo161902g(50);
            C92866b.this.f267530n.mo161905j(false);
            try {
                C92866b.this.f267532p = new C117623b(NetworkMonitorReceiver.MSG_DELAY_TIME, 16000, true, true);
                C92866b bVar3 = C92866b.this;
                bVar3.f267532p.f351866l = bVar3.f267535s;
                bVar3.getClass();
                String valueOf2 = String.valueOf(0);
                C92866b bVar4 = C92866b.this;
                bVar3.f267533q = new C99846b(str2, valueOf, valueOf2, bVar4.f267528i, bVar4.f267527h);
                C92866b bVar5 = C92866b.this;
                C110390f fVar2 = bVar5.f267530n;
                fVar2.f330245x = bVar5.f267534r;
                if (!fVar2.mo161906k()) {
                    Log.m105920e("MicroMsg.SceneVoiceInputAddr", "start record failed");
                    C92866b.this.mo127257a(8, -1, -1);
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.SceneVoiceInputAddr", th, "init VoiceDetectAPI failed", new Object[0]);
                C92866b.this.mo127257a(7, -1, -1);
            }
        }

        public void run() {
            synchronized (C92866b.this) {
                mo127264a();
            }
        }
    }

    public C92866b() {
        this.f267523d = 0;
        this.f267524e = 0;
        this.f267525f = false;
        this.f267526g = false;
        this.f267527h = 0;
        this.f267528i = 1;
        this.f267529j = null;
        this.f267533q = null;
        this.f267534r = new C92867a();
        this.f267535s = new C92868b();
    }

    /* renamed from: a */
    public void mo127257a(int i, int i2, int i3) {
        Log.m105925i("MicroMsg.SceneVoiceInputAddr", "error localCode = %s,errType = %s,errCode = %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        C17800a.C17801a aVar = this.f267529j;
        if (aVar != null) {
            aVar.mo21935c(i, i2, i3, -1);
        }
        mo127258b(false, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a8, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo127258b(boolean r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.SceneVoiceInputAddr"
            java.lang.String r1 = "reset keepNetScene = %s,sendLastScene = %s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            r4 = 0
            r2[r4] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            r5 = 1
            r2[r5] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            monitor-enter(r7)
            r7.f267526g = r5     // Catch:{ all -> 0x00a9 }
            qh.f r0 = r7.f267530n     // Catch:{ all -> 0x00a9 }
            r1 = 0
            if (r0 == 0) goto L_0x0026
            r0.mo161907l()     // Catch:{ all -> 0x00a9 }
            r7.f267530n = r1     // Catch:{ all -> 0x00a9 }
        L_0x0026:
            uh.a r0 = r7.f267531o     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x002f
            r0.mo73541e()     // Catch:{ all -> 0x00a9 }
            r7.f267531o = r1     // Catch:{ all -> 0x00a9 }
        L_0x002f:
            nd0.b r0 = r7.f267532p     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0044
            r0.mo182350d()     // Catch:{ Exception -> 0x0039 }
            r7.f267532p = r1     // Catch:{ Exception -> 0x0039 }
            goto L_0x0044
        L_0x0039:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.SceneVoiceInputAddr"
            java.lang.String r3 = "mVoiceSilentDetectAPI.release error"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x00a9 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r6)     // Catch:{ all -> 0x00a9 }
        L_0x0044:
            r7.f267524e = r4     // Catch:{ all -> 0x00a9 }
            md0.a r0 = r7.f267533q     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0070
            boolean r2 = r0 instanceof md0.C99846b     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x0070
            r0.mo72192n1()     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = f267521t     // Catch:{ all -> 0x00a9 }
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)     // Catch:{ all -> 0x00a9 }
            int r0 = (int) r2
            md0.a r2 = r7.f267533q     // Catch:{ Exception -> 0x0060 }
            md0.b r2 = (md0.C99846b) r2     // Catch:{ Exception -> 0x0060 }
            r2.mo139198o1(r0)     // Catch:{ Exception -> 0x0060 }
            goto L_0x0070
        L_0x0060:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.SceneVoiceInputAddr"
            java.lang.String r3 = "reset cutShortSentence error"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x00a9 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r6)     // Catch:{ all -> 0x00a9 }
            r0 = 6
            r2 = -1
            r7.mo127257a(r0, r2, r2)     // Catch:{ all -> 0x00a9 }
        L_0x0070:
            if (r8 != 0) goto L_0x00a7
            boolean r8 = r7.f267525f     // Catch:{ all -> 0x00a9 }
            if (r8 != 0) goto L_0x0077
            goto L_0x00a7
        L_0x0077:
            md0.a r8 = r7.f267533q     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x00a1
            boolean r8 = r8 instanceof md0.C99846b     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x00a1
            java.lang.String r8 = "MicroMsg.SceneVoiceInputAddr"
            java.lang.String r0 = "reset call stop() sendLastScene:%s"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x00a9 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x00a9 }
            r2[r4] = r3     // Catch:{ all -> 0x00a9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r2)     // Catch:{ all -> 0x00a9 }
            if (r9 == 0) goto L_0x0098
            md0.a r8 = r7.f267533q     // Catch:{ all -> 0x00a9 }
            md0.b r8 = (md0.C99846b) r8     // Catch:{ all -> 0x00a9 }
            r8.mo139199p1()     // Catch:{ all -> 0x00a9 }
        L_0x0098:
            ob0.b0 r8 = f40.C86709a0.m107524d()     // Catch:{ all -> 0x00a9 }
            r9 = 235(0xeb, float:3.3E-43)
            r8.mo123470p(r9, r7)     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            r7.f267533q = r1     // Catch:{ all -> 0x00a9 }
            r7.f267525f = r4     // Catch:{ all -> 0x00a9 }
            monitor-exit(r7)     // Catch:{ all -> 0x00a9 }
            return
        L_0x00a7:
            monitor-exit(r7)     // Catch:{ all -> 0x00a9 }
            return
        L_0x00a9:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00a9 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelvoiceaddr.C92866b.mo127258b(boolean, boolean):void");
    }

    public void cancel(boolean z) {
        Log.m105925i("MicroMsg.SceneVoiceInputAddr", "cancel fromUI = %s", Boolean.valueOf(z));
        this.f267529j = null;
        mo127258b(false, z);
    }

    public int getMaxAmplitudeRate() {
        int i = this.f267523d;
        this.f267523d = 0;
        if (i > f267522u) {
            f267522u = i;
        }
        return (i * 100) / f267522u;
    }

    public void init(int i, int i2, C17800a.C17801a aVar) {
        this.f267528i = i;
        this.f267529j = aVar;
        this.f267527h = i2;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2 = str;
        C117747y yVar2 = yVar;
        C76751a aVar = (C76751a) yVar2;
        String[] k1 = aVar.mo72189k1();
        aVar.mo72190l1();
        List<String> m1 = aVar.mo72191m1();
        Object[] objArr = new Object[6];
        objArr[0] = Long.valueOf(System.currentTimeMillis());
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        int i3 = -1;
        objArr[3] = Integer.valueOf(k1 == null ? -1 : k1.length);
        objArr[4] = Integer.valueOf(yVar.hashCode());
        C76751a aVar2 = this.f267533q;
        if (aVar2 != null) {
            i3 = aVar2.hashCode();
        }
        objArr[5] = Integer.valueOf(i3);
        Log.m105919d("MicroMsg.SceneVoiceInputAddr", "onSceneEnd time %s errType:%s errCode:%s list:%s scene.hashCode():%s,this.hashCode():%s", objArr);
        if (this.f267533q == null || yVar.hashCode() != this.f267533q.hashCode()) {
            Log.m105918d("MicroMsg.SceneVoiceInputAddr", "onSceneEnd scene.hashCode() != mVoiceRecogScene.hashCode()");
            return;
        }
        C17800a.C17801a aVar3 = this.f267529j;
        if (aVar3 == null) {
            return;
        }
        if (i2 == 0 && i == 0) {
            aVar3.mo21934b(k1, m1);
            if ((yVar2 instanceof C99846b) && this.f267524e == 0 && ((C99846b) yVar2).f292559g.mo139205e()) {
                this.f267529j.mo21933a();
                cancel(false);
                return;
            }
            return;
        }
        if (str2 != null && str2.equalsIgnoreCase("SecurityCheckError")) {
            this.f267529j.mo21935c(13, 132, -1, -1);
        } else if (str2 == null || !str2.equalsIgnoreCase("ReadFileLengthError")) {
            this.f267529j.mo21935c(11, i, i2, (long) ((C76751a) yVar2).mo72188j1());
        } else {
            this.f267529j.mo21935c(13, 133, -1, -1);
        }
        cancel(false);
    }

    public void start() {
        Log.m105924i("MicroMsg.SceneVoiceInputAddr", "start record");
        ThreadPool.post((Runnable) new C92870c((C92867a) null), "SceneVoiceInputAddr_record", 10);
    }

    public void stop(boolean z) {
        C17800a.C17801a aVar;
        Log.m105925i("MicroMsg.SceneVoiceInputAddr", "stop fromUI = %s", Boolean.valueOf(z));
        if (!z && (aVar = this.f267529j) != null) {
            aVar.mo21936d();
        }
        mo127258b(true, true);
    }

    public C92866b(int i, int i2, C17800a.C17801a aVar) {
        this.f267523d = 0;
        this.f267524e = 0;
        this.f267525f = false;
        this.f267526g = false;
        this.f267533q = null;
        this.f267534r = new C92867a();
        this.f267535s = new C92868b();
        this.f267528i = i;
        this.f267529j = aVar;
        this.f267527h = i2;
    }
}
