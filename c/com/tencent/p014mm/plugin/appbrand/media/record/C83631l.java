package com.tencent.p014mm.plugin.appbrand.media.record;

import android.os.Looper;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.autogen.events.OperateRecordEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice;
import com.tencent.p014mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener;
import com.tencent.p014mm.plugin.appbrand.media.record.C83646t;
import com.tencent.p014mm.plugin.appbrand.media.record.record_imp.RecordParam;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.xweb.IXWebBroadcastListener;
import ip0.C87782b;
import ip0.C87783c;
import java.util.ArrayList;
import jp0.C88008a;
import p375qh.C110390f;

/* renamed from: com.tencent.mm.plugin.appbrand.media.record.l */
public class C83631l {

    /* renamed from: u */
    public static C83631l f244220u;

    /* renamed from: v */
    public static Object f244221v = new Object();

    /* renamed from: a */
    public C88008a f244222a = null;

    /* renamed from: b */
    public boolean f244223b = false;

    /* renamed from: c */
    public Object f244224c = new Object();

    /* renamed from: d */
    public RecordParam f244225d;

    /* renamed from: e */
    public C83639h f244226e = C83639h.INITIALIZING;

    /* renamed from: f */
    public C87783c f244227f = null;

    /* renamed from: g */
    public String f244228g;

    /* renamed from: h */
    public boolean f244229h = false;

    /* renamed from: i */
    public int f244230i = 0;

    /* renamed from: j */
    public MTimerHandler f244231j = null;

    /* renamed from: k */
    public long f244232k = 0;

    /* renamed from: l */
    public long f244233l = 0;

    /* renamed from: m */
    public int f244234m = 0;

    /* renamed from: n */
    public long f244235n = 0;

    /* renamed from: o */
    public MMHandler f244236o;

    /* renamed from: p */
    public boolean f244237p = false;

    /* renamed from: q */
    public boolean f244238q = false;

    /* renamed from: r */
    public C88008a.C88010b f244239r = new C83636e();

    /* renamed from: s */
    public C87783c.C87784a f244240s = new C83637f();

    /* renamed from: t */
    public C83628i f244241t = new C83634c();

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.l$a */
    public class C83632a implements Runnable {
        public C83632a() {
        }

        public void run() {
            C83631l.this.mo115951o();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.l$b */
    public class C83633b implements Runnable {
        public C83633b() {
        }

        public void run() {
            C83631l.this.mo115951o();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.l$c */
    public class C83634c implements C83628i {
        public C83634c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.l$d */
    public class C83635d implements C83646t.C83648b {
        /* renamed from: a */
        public void mo115954a(ArrayList<IDKey> arrayList, boolean z) {
            C115669n.INSTANCE.mo160124a(arrayList, z);
        }

        public void idkeyStat(long j, long j2, long j3, boolean z) {
            C115669n.INSTANCE.idkeyStat(j, j2, j3, z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.l$e */
    public class C83636e implements C88008a.C88010b {
        public C83636e() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.l$f */
    public class C83637f implements C87783c.C87784a {
        public C83637f() {
        }

        /* renamed from: a */
        public void mo115956a(byte[] bArr, int i, boolean z) {
            C83631l lVar = C83631l.this;
            lVar.getClass();
            Log.m105925i("MicroMsg.Record.AudioRecordMgr", "onFrameRecorded  buffSize:%d, isLastFrameL:%b", Integer.valueOf(i), Boolean.valueOf(z));
            OperateRecordEvent operateRecordEvent = new OperateRecordEvent();
            OperateRecordEvent.C80732a aVar = operateRecordEvent.f236248d;
            aVar.f236251c = "frameRecorded";
            RecordParam recordParam = lVar.f244225d;
            if (recordParam != null) {
                aVar.f236258j = recordParam.f244270p;
            }
            aVar.f236249a = 5;
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            OperateRecordEvent.C80732a aVar2 = operateRecordEvent.f236248d;
            aVar2.f236254f = bArr2;
            aVar2.f236255g = z;
            operateRecordEvent.asyncPublish(Looper.getMainLooper());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.l$g */
    public class C83638g implements Runnable {
        public C83638g() {
        }

        public void run() {
            synchronized (C83631l.this.f244224c) {
                C83631l.this.mo115941b();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.l$h */
    public enum C83639h {
        INITIALIZING,
        START,
        RESUME,
        PAUSE,
        STOP,
        ERROR
    }

    static {
        C83646t.f244273a = new C83635d();
    }

    /* renamed from: c */
    public static void m102665c(C83631l lVar) {
        lVar.getClass();
        try {
            Log.m105924i("MicroMsg.Record.AudioRecordMgr", "_start in runnable");
            if (!lVar.mo115943f()) {
                lVar.mo115944h(2);
                Log.m105920e("MicroMsg.Record.AudioRecordMgr", "init encoder fail");
                return;
            }
            lVar.f244229h = false;
            lVar.f244230i = 0;
            lVar.mo115948l();
            if (lVar.mo115949m()) {
                C87783c cVar = lVar.f244227f;
                C110390f fVar = lVar.f244222a.f254618a;
                int c = fVar != null ? fVar.mo161898c() : 0;
                C87782b bVar = (C87782b) cVar;
                Log.m105925i("MicroMsg.Record.AudioEncoder", "mMinBufferSize:%d", Integer.valueOf(bVar.f254146b));
                bVar.f254146b = c;
                C87783c cVar2 = lVar.f244227f;
                double d = lVar.f244225d.f244268n;
                C87782b bVar2 = (C87782b) cVar2;
                bVar2.f254147c = (int) (1024.0d * d);
                Log.m105925i("MicroMsg.Record.AudioEncoder", "setEncodeBuffFrameSize frameKbSize:%b frameByteSize:%d", Double.valueOf(d), Integer.valueOf(bVar2.f254147c));
                bVar2.f254148d = new byte[bVar2.f254147c];
                lVar.f244234m = 0;
                lVar.f244232k = (long) lVar.f244225d.f244261d;
                lVar.f244235n = System.currentTimeMillis();
                long j = lVar.f244232k;
                lVar.f244233l = j;
                Log.m105925i("MicroMsg.Record.AudioRecordMgr", "mDuration:%d, mCurrentTime:%d", Long.valueOf(j), Long.valueOf(lVar.f244235n));
                lVar.mo115942e().post(new C83644q(lVar));
                lVar.mo115947k();
                Log.m105924i("MicroMsg.Record.AudioRecordMgr", "start record success");
                return;
            }
            lVar.mo115944h(6);
            Log.m105920e("MicroMsg.Record.AudioRecordMgr", "start record fail");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Record.AudioRecordMgr", e, "_start", new Object[0]);
            lVar.mo115944h(4);
        }
    }

    /* renamed from: d */
    public static void m102666d(C83631l lVar) {
        lVar.getClass();
        try {
            Log.m105924i("MicroMsg.Record.AudioRecordMgr", "_resume in runnable");
            if (lVar.f244227f == null) {
                lVar.mo115944h(3);
                Log.m105920e("MicroMsg.Record.AudioRecordMgr", "resume record fail");
            } else if (lVar.f244233l <= 0) {
                lVar.mo115941b();
                Log.m105920e("MicroMsg.Record.AudioRecordMgr", "resume record fail, record time reach max time, to stop record");
            } else if (lVar.mo115949m()) {
                lVar.f244235n = System.currentTimeMillis();
                Log.m105925i("MicroMsg.Record.AudioRecordMgr", "mLimitTime:%d, currentTime:%d", Long.valueOf(lVar.f244233l), Long.valueOf(lVar.f244235n));
                lVar.mo115942e().post(new C83630k(lVar));
                lVar.mo115946j();
                Log.m105924i("MicroMsg.Record.AudioRecordMgr", "resume record success");
            } else {
                lVar.mo115944h(7);
                Log.m105920e("MicroMsg.Record.AudioRecordMgr", "resume record fail");
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Record.AudioRecordMgr", e, "_resume", new Object[0]);
            lVar.mo115944h(5);
        }
    }

    /* renamed from: g */
    public static C83631l m102667g() {
        C83631l lVar;
        synchronized (f244221v) {
            if (f244220u == null) {
                f244220u = new C83631l();
            }
            lVar = f244220u;
        }
        return lVar;
    }

    /* renamed from: a */
    public void mo115940a() {
        boolean z;
        C83629j jVar;
        C83639h hVar = C83639h.PAUSE;
        Log.m105924i("MicroMsg.Record.AudioRecordMgr", "pause record in runnable");
        try {
            if (this.f244226e == hVar) {
                Log.m105920e("MicroMsg.Record.AudioRecordMgr", "is paused, don't pause again");
                return;
            }
            C88008a aVar = this.f244222a;
            if (aVar != null) {
                z = aVar.mo122457a();
                this.f244222a = null;
            } else {
                z = false;
            }
            RecordParam recordParam = this.f244225d;
            if (!(recordParam == null || (jVar = recordParam.f244272r) == null)) {
                boolean a = ((AudioRecordVoIPInterruptListener) jVar).mo115931a();
                Log.m105925i("MicroMsg.Record.AudioRecordMgr", "isInterrupted:%b, interrupted:%b", Boolean.valueOf(this.f244238q), Boolean.valueOf(a));
                if (a && !this.f244238q) {
                    mo115945i();
                }
            }
            mo115942e().post(new C83632a());
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.f244235n;
            Log.m105925i("MicroMsg.Record.AudioRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", Long.valueOf(currentTimeMillis), Long.valueOf(j), Integer.valueOf(this.f244234m));
            int i = (int) (((long) this.f244234m) + j);
            this.f244234m = i;
            long j2 = this.f244232k - ((long) i);
            this.f244233l = j2;
            Log.m105925i("MicroMsg.Record.AudioRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", Long.valueOf(j2), Integer.valueOf(this.f244234m));
            Log.m105925i("MicroMsg.Record.AudioRecordMgr", "stop:%b", Boolean.valueOf(z));
            if (z) {
                Log.m105924i("MicroMsg.Record.AudioRecordMgr", "onPause");
                this.f244226e = hVar;
                this.f244223b = false;
                OperateRecordEvent operateRecordEvent = new OperateRecordEvent();
                OperateRecordEvent.C80732a aVar2 = operateRecordEvent.f236248d;
                aVar2.f236249a = 3;
                aVar2.f236251c = "pause";
                RecordParam recordParam2 = this.f244225d;
                if (recordParam2 != null) {
                    aVar2.f236258j = recordParam2.f244270p;
                }
                operateRecordEvent.asyncPublish(Looper.getMainLooper());
                Log.m105924i("MicroMsg.Record.AudioRecordMgr", "pause record success");
                return;
            }
            mo115944h(8);
            Log.m105920e("MicroMsg.Record.AudioRecordMgr", "pause record fail");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Record.AudioRecordMgr", e, "_pause", new Object[0]);
            z = false;
        }
    }

    /* renamed from: b */
    public final void mo115941b() {
        boolean z;
        long j;
        C83639h hVar = C83639h.STOP;
        Log.m105924i("MicroMsg.Record.AudioRecordMgr", "stop record in runnable");
        try {
            if (this.f244226e == hVar) {
                Log.m105920e("MicroMsg.Record.AudioRecordMgr", "is stopped, don't stop again");
                return;
            }
            C88008a aVar = this.f244222a;
            if (aVar != null) {
                z = aVar.mo122457a();
                this.f244222a = null;
            } else {
                Log.m105920e("MicroMsg.Record.AudioRecordMgr", "mRecorder is null, has stop record!");
                z = true;
            }
            this.f244229h = true;
            Log.m105925i("MicroMsg.Record.AudioRecordMgr", "mPcmDuration:%d", Integer.valueOf(this.f244230i));
            C87783c cVar = this.f244227f;
            if (cVar != null) {
                cVar.flush();
                this.f244227f.close();
                this.f244227f = null;
            }
            mo115942e().post(new C83633b());
            if (this.f244226e == C83639h.PAUSE) {
                Log.m105920e("MicroMsg.Record.AudioRecordMgr", "don't calculate time again if it is pause state");
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                long currentTimeMillis2 = System.currentTimeMillis() - this.f244235n;
                Log.m105925i("MicroMsg.Record.AudioRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis2), Integer.valueOf(this.f244234m));
                int i = (int) (((long) this.f244234m) + currentTimeMillis2);
                this.f244234m = i;
                long j2 = this.f244232k - ((long) i);
                this.f244233l = j2;
                Log.m105925i("MicroMsg.Record.AudioRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", Long.valueOf(j2), Integer.valueOf(this.f244234m));
            }
            Log.m105925i("MicroMsg.Record.AudioRecordMgr", "stop:%b", Boolean.valueOf(z));
            if (z) {
                Log.m105924i("MicroMsg.Record.AudioRecordMgr", "onStop");
                this.f244226e = hVar;
                this.f244223b = false;
                OperateRecordEvent operateRecordEvent = new OperateRecordEvent();
                OperateRecordEvent.C80732a aVar2 = operateRecordEvent.f236248d;
                aVar2.f236249a = 2;
                aVar2.f236251c = "stop";
                RecordParam recordParam = this.f244225d;
                if (recordParam != null) {
                    aVar2.f236258j = recordParam.f244270p;
                }
                Log.m105925i("MicroMsg.Record.AudioRecordMgr", "mPcmDuration:%d, mRealRecordedTime%d", Integer.valueOf(this.f244230i), Integer.valueOf(this.f244234m));
                operateRecordEvent.f236248d.f236250b = Math.min(this.f244230i, this.f244234m);
                OperateRecordEvent.C80732a aVar3 = operateRecordEvent.f236248d;
                String str = this.f244228g;
                aVar3.f236252d = str;
                C86009m1 m1Var = new C86009m1(str);
                if (m1Var.mo119967g()) {
                    Log.m105924i("MicroMsg.Record.AudioRecordUtil", "exist audio file");
                    j = m1Var.mo119980r();
                } else {
                    Log.m105925i("MicroMsg.Record.AudioRecordUtil", "audio file not exit, path:%s", str);
                    j = -1;
                }
                aVar3.f236253e = (int) j;
                operateRecordEvent.asyncPublish(Looper.getMainLooper());
                Log.m105924i("MicroMsg.Record.AudioRecordMgr", "stop record success");
            } else {
                mo115944h(9);
                Log.m105920e("MicroMsg.Record.AudioRecordMgr", "stop record fail");
            }
            this.f244225d = null;
            Long l = C29596h.f80523a;
            long currentTimeMillis3 = System.currentTimeMillis();
            if (currentTimeMillis3 - C29596h.f80525c <= C29596h.f80524b.longValue()) {
                Log.m105920e("MicroMsg.Record.AudioRecordCacheClean", "The last clean time is in AUDIO_RECORD_NO_SCAN_TIME time");
                return;
            }
            Log.m105924i("MicroMsg.Record.AudioRecordCacheClean", "start clean audio record file");
            C29596h.f80525c = currentTimeMillis3;
            ThreadPool.post(new C29595g(), "AudioRecordCacheClean");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Record.AudioRecordMgr", e, "_stop", new Object[0]);
            z = false;
        }
    }

    /* renamed from: e */
    public final MMHandler mo115942e() {
        if (this.f244236o == null) {
            this.f244236o = new MMHandler(Looper.getMainLooper());
        }
        return this.f244236o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013c A[SYNTHETIC, Splitter:B:53:0x013c] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo115943f() {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.Record.AudioRecordMgr"
            java.lang.String r1 = "initEncode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            ip0.c r1 = r11.f244227f
            r2 = 0
            if (r1 == 0) goto L_0x0011
            r1.close()
            r11.f244227f = r2
        L_0x0011:
            com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam r1 = r11.f244225d
            java.lang.String r3 = r1.f244265h
            java.lang.String r1 = r1.f244266i
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1
            java.lang.String r5 = a70.C112760b.m154195C()
            java.lang.String r6 = "AudioRecord"
            r4.<init>((java.lang.String) r5, (java.lang.String) r6)
            boolean r5 = r4.mo119967g()
            if (r5 != 0) goto L_0x002b
            r4.mo119987x()
        L_0x002b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "audio"
            r5.append(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = ""
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r1)
            r5.append(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r6 = "wav"
            java.lang.String r8 = "mp3"
            java.lang.String r9 = "aac"
            if (r1 == 0) goto L_0x005b
            goto L_0x0075
        L_0x005b:
            boolean r1 = r9.equalsIgnoreCase(r3)
            if (r1 == 0) goto L_0x0064
            java.lang.String r7 = ".m4a"
            goto L_0x0075
        L_0x0064:
            boolean r1 = r8.equalsIgnoreCase(r3)
            if (r1 == 0) goto L_0x006d
            java.lang.String r7 = ".mp3"
            goto L_0x0075
        L_0x006d:
            boolean r1 = r6.equalsIgnoreCase(r3)
            if (r1 == 0) goto L_0x0075
            java.lang.String r7 = ".wav"
        L_0x0075:
            r5.append(r7)
            java.lang.String r1 = r5.toString()
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            r3.<init>((com.tencent.p014mm.vfs.C86009m1) r4, (java.lang.String) r1)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r1
            com.tencent.mm.vfs.m1 r1 = r3.mo119969h()
            r7 = 1
            r4[r7] = r1
            java.lang.String r1 = "MicroMsg.Record.AudioRecordUtil"
            java.lang.String r10 = "getAudioFilePath audio name %s path %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r10, r4)
            java.lang.String r3 = r3.mo119971i()
            r11.f244228g = r3
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r5] = r3
            java.lang.String r3 = "mFilePath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)
            com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam r3 = r11.f244225d
            java.lang.String r3 = r3.f244265h
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r5] = r3
            java.lang.String r7 = "MicroMsg.Record.AudioEncodeFactory"
            java.lang.String r10 = "createEncodeByType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r4)
            boolean r4 = com.tencent.p014mm.plugin.appbrand.media.record.C29597r.m38828a(r3)
            if (r4 != 0) goto L_0x00ba
            goto L_0x00ec
        L_0x00ba:
            boolean r4 = r9.equalsIgnoreCase(r3)
            if (r4 == 0) goto L_0x00c6
            ip0.a r2 = new ip0.a
            r2.<init>()
            goto L_0x00ec
        L_0x00c6:
            boolean r4 = r8.equalsIgnoreCase(r3)
            if (r4 == 0) goto L_0x00d2
            ip0.d r2 = new ip0.d
            r2.<init>()
            goto L_0x00ec
        L_0x00d2:
            boolean r4 = r6.equalsIgnoreCase(r3)
            if (r4 == 0) goto L_0x00de
            ip0.f r2 = new ip0.f
            r2.<init>()
            goto L_0x00ec
        L_0x00de:
            java.lang.String r4 = "pcm"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00ec
            ip0.e r2 = new ip0.e
            r2.<init>()
        L_0x00ec:
            r11.f244227f = r2
            if (r2 == 0) goto L_0x015d
            java.lang.String r2 = r11.f244228g
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            r3.<init>((java.lang.String) r2)
            boolean r2 = r3.mo119967g()
            java.lang.String r4 = "prepareCacheFile"
            if (r2 != 0) goto L_0x0118
            java.lang.String r2 = "new audio file"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ IOException -> 0x0111, Exception -> 0x010a }
            boolean r1 = r3.mo119964e()     // Catch:{ IOException -> 0x0111, Exception -> 0x010a }
            goto L_0x0133
        L_0x010a:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r4, r3)
            goto L_0x0132
        L_0x0111:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r4, r3)
            goto L_0x0132
        L_0x0118:
            java.lang.String r2 = "delete audio file"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r3.mo119966f()
            boolean r1 = r3.mo119964e()     // Catch:{ IOException -> 0x012c, Exception -> 0x0125 }
            goto L_0x0133
        L_0x0125:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r4, r3)
            goto L_0x0132
        L_0x012c:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r4, r3)
        L_0x0132:
            r1 = 0
        L_0x0133:
            if (r1 != 0) goto L_0x013c
            java.lang.String r2 = "prepare cache file fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            return r1
        L_0x013c:
            ip0.c r1 = r11.f244227f     // Catch:{ Exception -> 0x014d }
            java.lang.String r2 = r11.f244228g     // Catch:{ Exception -> 0x014d }
            com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam r3 = r11.f244225d     // Catch:{ Exception -> 0x014d }
            int r4 = r3.f244262e     // Catch:{ Exception -> 0x014d }
            int r6 = r3.f244263f     // Catch:{ Exception -> 0x014d }
            int r3 = r3.f244264g     // Catch:{ Exception -> 0x014d }
            boolean r5 = r1.init(r2, r4, r6, r3)     // Catch:{ Exception -> 0x014d }
            goto L_0x0155
        L_0x014d:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r3 = "init encoder fail"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r1, r3, r2)
        L_0x0155:
            ip0.c r0 = r11.f244227f
            ip0.c$a r1 = r11.f244240s
            ip0.b r0 = (ip0.C87782b) r0
            r0.f254145a = r1
        L_0x015d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.media.record.C83631l.mo115943f():boolean");
    }

    /* renamed from: h */
    public void mo115944h(int i) {
        Log.m105925i("MicroMsg.Record.AudioRecordMgr", "onError errType:%d", Integer.valueOf(i));
        C83639h hVar = this.f244226e;
        C83639h hVar2 = C83639h.ERROR;
        if (hVar != hVar2) {
            ArrayList arrayList = new ArrayList();
            IDKey iDKey = new IDKey();
            iDKey.SetID(689);
            iDKey.SetKey(1);
            iDKey.SetValue(1);
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(689);
            iDKey2.SetKey(C29600s.m38829a(i));
            iDKey2.SetValue(1);
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            C83646t.f244273a.mo115954a(arrayList, true);
        }
        this.f244226e = hVar2;
        this.f244223b = false;
        OperateRecordEvent operateRecordEvent = new OperateRecordEvent();
        OperateRecordEvent.C80732a aVar = operateRecordEvent.f236248d;
        aVar.f236249a = 4;
        aVar.f236251c = "error";
        RecordParam recordParam = this.f244225d;
        if (recordParam != null) {
            aVar.f236258j = recordParam.f244270p;
        }
        aVar.f236256h = i;
        StringBuilder sb = new StringBuilder();
        sb.append("errType:" + i + ", err:");
        switch (i) {
            case 1:
                sb.append("error PCM record callback");
                break;
            case 2:
                sb.append("init encoder fail, occur exception");
                break;
            case 3:
                sb.append("encoder un initial occur exception");
                break;
            case 4:
                sb.append("start record occur exception");
                break;
            case 5:
                sb.append("resume record occur exception");
                break;
            case 6:
                sb.append("fail to start record");
                break;
            case 7:
                sb.append("fail to resume record");
                break;
            case 8:
                sb.append("fail to pause record");
                break;
            case 9:
                sb.append("fail to stop record");
                break;
            default:
                switch (i) {
                    case 15:
                        sb.append("check param invalid");
                        break;
                    case 16:
                        sb.append("not support format type");
                        break;
                    case 17:
                        sb.append("fail to init mp3 encoder");
                        break;
                    case 18:
                        sb.append("mp3 file not found exception");
                        break;
                    case 19:
                        sb.append("mp3 encode exception");
                        break;
                    case 20:
                        sb.append("mp3 write buffer exception");
                        break;
                    case 21:
                        sb.append("fail to init aac encoder");
                        break;
                    case 22:
                        sb.append("fail to create mp4 file");
                        break;
                    case 23:
                        sb.append("aac encode exception");
                        break;
                    case 24:
                        sb.append("create cache file fail");
                        break;
                    case 25:
                        sb.append("init encoder fail");
                        break;
                    case 26:
                        sb.append("not support sample rate");
                        break;
                    default:
                        sb.append("unknow error");
                        break;
                }
        }
        aVar.f236257i = sb.toString();
        operateRecordEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: i */
    public void mo115945i() {
        this.f244238q = true;
        Log.m105924i("MicroMsg.Record.AudioRecordMgr", "onInterruptionBegin");
        OperateRecordEvent operateRecordEvent = new OperateRecordEvent();
        OperateRecordEvent.C80732a aVar = operateRecordEvent.f236248d;
        aVar.f236249a = 6;
        aVar.f236251c = "interruptionBegin";
        RecordParam recordParam = this.f244225d;
        if (recordParam != null) {
            aVar.f236258j = recordParam.f244270p;
        }
        operateRecordEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: j */
    public void mo115946j() {
        Log.m105924i("MicroMsg.Record.AudioRecordMgr", "onResume");
        this.f244226e = C83639h.RESUME;
        this.f244223b = true;
        OperateRecordEvent operateRecordEvent = new OperateRecordEvent();
        OperateRecordEvent.C80732a aVar = operateRecordEvent.f236248d;
        aVar.f236249a = 1;
        aVar.f236251c = "resume";
        RecordParam recordParam = this.f244225d;
        if (recordParam != null) {
            aVar.f236258j = recordParam.f244270p;
        }
        operateRecordEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: k */
    public void mo115947k() {
        Log.m105924i("MicroMsg.Record.AudioRecordMgr", "onStart");
        this.f244226e = C83639h.START;
        this.f244223b = true;
        OperateRecordEvent operateRecordEvent = new OperateRecordEvent();
        OperateRecordEvent.C80732a aVar = operateRecordEvent.f236248d;
        aVar.f236249a = 0;
        aVar.f236251c = IXWebBroadcastListener.STAGE_START;
        RecordParam recordParam = this.f244225d;
        if (recordParam != null) {
            aVar.f236258j = recordParam.f244270p;
        }
        operateRecordEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: l */
    public final void mo115948l() {
        C83629j jVar;
        if (!this.f244237p) {
            this.f244237p = true;
            RecordParam recordParam = this.f244225d;
            if (recordParam != null && (jVar = recordParam.f244272r) != null) {
                ((AudioRecordVoIPInterruptListener) jVar).f244199a = this.f244241t;
                AudioRecordVoIPInterruptListener audioRecordVoIPInterruptListener = (AudioRecordVoIPInterruptListener) jVar;
                C83628i iVar = audioRecordVoIPInterruptListener.f244199a;
                if (iVar == null) {
                    Log.m105920e("MicroMsg.Record.AudioRecordVoIPInterruptListener", "callback is invalid");
                    return;
                }
                if (audioRecordVoIPInterruptListener.f244201c == null) {
                    audioRecordVoIPInterruptListener.f244201c = new AudioRecordVoIPInterruptListener.StartInterruptEventListenTask(iVar);
                }
                audioRecordVoIPInterruptListener.f244203e = true;
                audioRecordVoIPInterruptListener.f244201c.mo114395c();
            }
        }
    }

    /* renamed from: m */
    public final boolean mo115949m() {
        Log.m105924i("MicroMsg.Record.AudioRecordMgr", "startRecordInternal");
        C88008a aVar = this.f244222a;
        if (aVar != null) {
            aVar.mo122457a();
            this.f244222a = null;
            Log.m105924i("MicroMsg.Record.AudioRecordMgr", "mRecorder is not null, stop it, and not callback stop event");
        }
        if (this.f244222a == null) {
            C88008a aVar2 = new C88008a(this.f244225d);
            this.f244222a = aVar2;
            aVar2.f254623f = this.f244239r;
        }
        C88008a aVar3 = this.f244222a;
        aVar3.getClass();
        Log.m105924i("MicroMsg.Record.AppBrandRecorder", JsApiStartRecordVoice.NAME);
        C110390f fVar = aVar3.f254618a;
        if (fVar != null) {
            fVar.mo161907l();
            aVar3.f254618a = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        aVar3.f254622e = currentTimeMillis;
        Log.m105925i("MicroMsg.Record.AppBrandRecorder", "start time ticket:%d", Long.valueOf(currentTimeMillis));
        aVar3.f254618a = new C110390f(aVar3.f254620c, aVar3.f254621d, aVar3.f254624g);
        if (FileReaderHelper.MP3_EXT.equalsIgnoreCase(aVar3.f254619b.f244265h)) {
            aVar3.f254618a.mo161902g(40);
        } else {
            aVar3.f254618a.mo161902g(20);
        }
        aVar3.f254618a.mo161904i(false);
        C110390f fVar2 = aVar3.f254618a;
        fVar2.f330245x = aVar3.f254625h;
        fVar2.mo161900e(aVar3.f254619b.f244271q.f244215d);
        boolean k = aVar3.f254618a.mo161906k();
        Log.m105925i("MicroMsg.Record.AudioRecordMgr", "record start:%b", Boolean.valueOf(k));
        return k;
    }

    /* renamed from: n */
    public boolean mo115950n() {
        Log.m105924i("MicroMsg.Record.AudioRecordMgr", JsApiStopRecordVoice.NAME);
        if (this.f244222a == null && this.f244227f == null) {
            Log.m105920e("MicroMsg.Record.AudioRecordMgr", "mRecord is null and mAudioEncoder is null, stop fail");
            return false;
        }
        ThreadPool.post(new C83638g(), "app_brand_stop_record");
        return true;
    }

    /* renamed from: o */
    public final void mo115951o() {
        Log.m105924i("MicroMsg.Record.AudioRecordMgr", "stopTimer");
        MTimerHandler mTimerHandler = this.f244231j;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        this.f244231j = null;
    }
}
