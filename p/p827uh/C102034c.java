package p827uh;

import android.net.Uri;
import com.tencent.p014mm.modelvoice.MediaRecorder;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import h81.C32735h;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kd0.C99124m;
import lu3.C117478d;
import lu3.C88656g;
import p156gj.C107842p;
import p375qh.C101193k;
import p827uh.C102032a;
import qe3.C89625d;

/* renamed from: uh.c */
public class C102034c implements C102032a {

    /* renamed from: o */
    public static C102032a.C102033a f300469o = new C102032a.C102033a();

    /* renamed from: a */
    public BlockingQueue<C101193k.C101194a> f300470a = new ArrayBlockingQueue(1024);

    /* renamed from: b */
    public boolean f300471b = false;

    /* renamed from: c */
    public String f300472c;

    /* renamed from: d */
    public int f300473d = 0;

    /* renamed from: e */
    public byte[] f300474e = null;

    /* renamed from: f */
    public int f300475f;

    /* renamed from: g */
    public int f300476g;

    /* renamed from: h */
    public Object f300477h = new Object();

    /* renamed from: i */
    public C102036b f300478i = null;

    /* renamed from: j */
    public boolean f300479j = false;

    /* renamed from: k */
    public volatile OutputStream f300480k;

    /* renamed from: l */
    public int f300481l;

    /* renamed from: m */
    public boolean f300482m = false;

    /* renamed from: n */
    public C99124m f300483n;

    /* renamed from: uh.c$b */
    public final class C102036b implements C88656g, C117478d {

        /* renamed from: d */
        public Future<?> f300484d;

        public C102036b(C102035a aVar) {
        }

        /* renamed from: g */
        public void mo121152g(Future<?> future) {
            this.f300484d = future;
        }

        public String getKey() {
            return "SilkWriter_run";
        }

        public void run() {
            boolean z;
            int i;
            Log.m105924i("MicroMsg.SilkWriter", "Silk Thread start run");
            while (true) {
                synchronized (C102034c.this) {
                    z = C102034c.this.f300471b;
                }
                Log.m105918d("MicroMsg.SilkWriter", "ThreadSilk in :" + z + " cnt :" + ((ArrayBlockingQueue) C102034c.this.f300470a).size());
                if (!z || !C102034c.this.f300470a.isEmpty()) {
                    try {
                        C101193k.C101194a aVar = (C101193k.C101194a) ((ArrayBlockingQueue) C102034c.this.f300470a).poll(200, TimeUnit.MILLISECONDS);
                        if (aVar == null) {
                            Log.m105924i("MicroMsg.SilkWriter", "poll byte null file:" + C102034c.this.f300472c);
                        } else {
                            int size = ((ArrayBlockingQueue) C102034c.this.f300470a).size();
                            int i2 = 0;
                            if (size > 10 || z) {
                                Log.m105928w("MicroMsg.SilkWriter", "speed up silkcodec queue:" + size + " stop:" + z);
                                i = 0;
                            } else {
                                i = 1;
                            }
                            C102032a.C102033a aVar2 = C102034c.f300469o;
                            if (aVar2.f300467a < 10 || aVar2.f300468b <= 240) {
                                i2 = i;
                            }
                            C102034c.this.mo73538b(aVar, i2);
                        }
                    } catch (InterruptedException unused) {
                        Log.m105924i("MicroMsg.SilkWriter", "ThreadAmr poll null");
                    }
                } else {
                    return;
                }
            }
            while (true) {
            }
        }
    }

    public C102034c(int i, int i2) {
        this.f300475f = i;
        this.f300476g = i2;
    }

    /* renamed from: a */
    public boolean mo73537a(String str) {
        String str2 = str;
        Log.m105924i("MicroMsg.SilkWriter", "initWriter path: " + str2);
        if (str2 == null) {
            Log.m105920e("MicroMsg.SilkWriter", "path is null");
            return false;
        }
        OutputStream outputStream = null;
        try {
            C86009m1 m1Var = new C86009m1(str2);
            C86009m1 m1Var2 = new C86009m1(str2);
            String substring = str2.substring(0, str2.lastIndexOf("/") + 1);
            Uri n = C116299g2.m163858n(substring);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            Log.m105921e("MicroMsg.SilkWriter", "[carl] !!!! VFS parent! exists(ret %s). Parent dir(%s)", Boolean.valueOf(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)), substring);
            if (!m1Var.mo119974l().mo119967g()) {
                Log.m105921e("MicroMsg.SilkWriter", "[carl] ???? Dir not created! Do mkdirs(ret %s). Parent dir(%s)", Boolean.valueOf(m1Var.mo119974l().mo119987x()), m1Var.mo119974l().mo119971i());
                C115669n.INSTANCE.mo175913w(357, 58, 1);
            } else if (!m1Var2.mo119974l().mo119967g()) {
                Log.m105921e("MicroMsg.SilkWriter", "[carl] !!!! VFS not created dir! Do mkdirs(ret %s). Parent dir(%s)", Boolean.valueOf(m1Var2.mo119974l().mo119987x()), m1Var.mo119974l().mo119971i());
                C115669n.INSTANCE.mo175913w(357, 57, 1);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.SilkWriter", th, "Check out file dir error.", new Object[0]);
        }
        try {
            outputStream = C86013q1.m106429K(str2, false);
        } catch (Exception e) {
            Exception exc = e;
            Log.printErrStackTrace("MicroMsg.SilkWriter", exc, "initWriter openWrite failed: %s", exc.getMessage());
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(357, 55, 1);
            if (C89625d.f257845k) {
                HashMap hashMap = new HashMap();
                hashMap.put("stack", exc.getMessage());
                nVar.mo160135k("Record", "Write failed", hashMap);
            }
        }
        if (outputStream != null) {
            try {
                return mo141541f(str2, outputStream);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.SilkWriter", "initWriter FileOutputStream error:%s", e2.getMessage());
                return false;
            }
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public int mo73538b(C101193k.C101194a aVar, int i) {
        return mo73540d(aVar, i, false);
    }

    /* renamed from: c */
    public boolean mo73539c() {
        Log.m105924i("MicroMsg.SilkWriter", "resetWriter");
        synchronized (this.f300477h) {
            try {
                C99124m mVar = this.f300483n;
                if (mVar != null) {
                    MediaRecorder.SilkEncUnInit(mVar.f290640a);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        C99124m mVar2 = new C99124m(this.f300475f, this.f300476g, this.f300481l);
        this.f300483n = mVar2;
        if (0 != mVar2.f290640a) {
            return true;
        }
        Log.m105920e("MicroMsg.SilkWriter", "resetWriter SilkEncoderInit Error");
        this.f300483n = null;
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [short, int] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x025b A[SYNTHETIC, Splitter:B:120:0x025b] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x017b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f1 A[Catch:{ all -> 0x022b }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010e A[Catch:{ all -> 0x0229 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ae  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo73540d(p375qh.C101193k.C101194a r28, int r29, boolean r30) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            r2 = r29
            nj.g$a r3 = new nj.g$a
            r3.<init>()
            int r4 = r1.f300475f
            int r4 = r4 * 20
            r5 = 2
            int r4 = r4 * 2
            int r4 = r4 / 1000
            short r4 = (short) r4
            int r6 = r1.f300473d
            int r7 = r0.f296200b
            int r6 = r6 + r7
            int r7 = r7 / r4
            byte[] r13 = new byte[r4]
            boolean r7 = r1.f300482m
            r15 = 1
            if (r7 == 0) goto L_0x0024
            r7 = 6
            goto L_0x0025
        L_0x0024:
            r7 = 1
        L_0x0025:
            int r11 = r4 * r7
            byte[] r12 = new byte[r11]
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            r10 = 0
            if (r7 == 0) goto L_0x0051
            java.lang.Class<lc3.b> r7 = lc3.C10485b.class
            k40.a r7 = f40.C86709a0.m107533q(r7)
            lc3.b r7 = (lc3.C10485b) r7
            pj.f r7 = r7.vh0()
            java.lang.String r8 = "VoiceNoiseSuppression"
            java.lang.String r7 = r7.mo107405c(r8)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 != 0) goto L_0x0051
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r15)
            if (r7 != r15) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r7 = 0
            goto L_0x0052
        L_0x0051:
            r7 = 1
        L_0x0052:
            if (r30 == 0) goto L_0x0057
            r16 = 0
            goto L_0x0059
        L_0x0057:
            r16 = r7
        L_0x0059:
            java.lang.String r7 = "MicroMsg.SilkWriter"
            java.lang.String r8 = "noise suppression: %b"
            java.lang.Object[] r9 = new java.lang.Object[r15]
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r16)
            r9[r10] = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r8, r9)
            r7 = 0
            r17 = 0
        L_0x006c:
            r18 = -1
            r8 = 3
            if (r6 < r4) goto L_0x0255
            int r9 = r1.f300473d
            if (r9 <= 0) goto L_0x00af
            byte[] r14 = r1.f300474e     // Catch:{ Exception -> 0x008b }
            java.lang.System.arraycopy(r14, r10, r13, r10, r9)     // Catch:{ Exception -> 0x008b }
            byte[] r9 = r0.f296199a     // Catch:{ Exception -> 0x008b }
            int r14 = r1.f300473d     // Catch:{ Exception -> 0x008b }
            int r5 = r4 - r14
            java.lang.System.arraycopy(r9, r10, r13, r14, r5)     // Catch:{ Exception -> 0x008b }
            int r5 = r1.f300473d
            int r5 = r4 - r5
            int r7 = r7 + r5
            r1.f300473d = r10
            goto L_0x00b5
        L_0x008b:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.SilkWriter"
            java.lang.String r3 = "writeSilkFile SilkEncode arraycopy failed, leftBufSize:%d copySize:%d error:%s"
            java.lang.Object[] r5 = new java.lang.Object[r8]
            int r6 = r1.f300473d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r10] = r6
            int r6 = r1.f300473d
            int r4 = r4 - r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r15] = r4
            java.lang.String r0 = r0.getMessage()
            r4 = 2
            r5[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r5)
            return r18
        L_0x00af:
            byte[] r5 = r0.f296199a     // Catch:{ Exception -> 0x0234 }
            java.lang.System.arraycopy(r5, r7, r13, r10, r4)     // Catch:{ Exception -> 0x0234 }
            int r7 = r7 + r4
        L_0x00b5:
            r5 = r7
            int r14 = r6 - r4
            short[] r9 = new short[r15]
            java.lang.Object r7 = r1.f300477h
            monitor-enter(r7)
            boolean r6 = r1.f300482m     // Catch:{ all -> 0x022b }
            if (r6 == 0) goto L_0x00ea
            r6 = 201(0xc9, float:2.82E-43)
            if (r14 >= r4) goto L_0x00dd
            boolean r8 = r0.f296201c     // Catch:{ all -> 0x022b }
            if (r8 == 0) goto L_0x00dd
            kd0.m r8 = r1.f300483n     // Catch:{ all -> 0x022b }
            r22 = r11
            if (r8 == 0) goto L_0x00d4
            long r10 = r8.f290640a     // Catch:{ all -> 0x022b }
            com.tencent.p014mm.modelvoice.MediaRecorder.SetVoiceSilkControl(r6, r15, r10)     // Catch:{ all -> 0x022b }
        L_0x00d4:
            java.lang.String r6 = "MicroMsg.SilkWriter"
            java.lang.String r8 = "silk do encode mark last frame"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)     // Catch:{ all -> 0x022b }
            goto L_0x00ec
        L_0x00dd:
            r22 = r11
            kd0.m r8 = r1.f300483n     // Catch:{ all -> 0x022b }
            if (r8 == 0) goto L_0x00ec
            long r10 = r8.f290640a     // Catch:{ all -> 0x022b }
            r8 = 0
            com.tencent.p014mm.modelvoice.MediaRecorder.SetVoiceSilkControl(r6, r8, r10)     // Catch:{ all -> 0x022b }
            goto L_0x00ed
        L_0x00ea:
            r22 = r11
        L_0x00ec:
            r8 = 0
        L_0x00ed:
            kd0.m r6 = r1.f300483n     // Catch:{ all -> 0x022b }
            if (r6 == 0) goto L_0x010e
            long r10 = r6.f290640a     // Catch:{ all -> 0x022b }
            r6 = r13
            r23 = r7
            r7 = r4
            r21 = 0
            r8 = r12
            r19 = r9
            r24 = r10
            r11 = 0
            r10 = r16
            r15 = r12
            r26 = r22
            r22 = r5
            r5 = 0
            r11 = r24
            int r10 = com.tencent.p014mm.modelvoice.MediaRecorder.SilkDoEnc(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0229 }
            goto L_0x0119
        L_0x010e:
            r23 = r7
            r19 = r9
            r15 = r12
            r26 = r22
            r22 = r5
            r5 = 0
            r10 = 0
        L_0x0119:
            monitor-exit(r23)     // Catch:{ all -> 0x0229 }
            if (r30 == 0) goto L_0x0175
            short r6 = r19[r5]
            r7 = 10
            if (r6 < r7) goto L_0x0175
            byte r6 = r15[r5]
            r7 = 2
            if (r6 != r7) goto L_0x0175
            r6 = 1
            byte r8 = r15[r6]
            r6 = 35
            if (r8 != r6) goto L_0x0175
            byte r6 = r15[r7]
            r7 = 33
            if (r6 != r7) goto L_0x0175
            r8 = 3
            byte r6 = r15[r8]
            r7 = 83
            if (r6 != r7) goto L_0x0173
            r9 = 4
            byte r6 = r15[r9]
            r7 = 73
            if (r6 != r7) goto L_0x0171
            r6 = 5
            byte r6 = r15[r6]
            r7 = 76
            if (r6 != r7) goto L_0x0171
            r6 = 6
            byte r7 = r15[r6]
            r11 = 75
            if (r7 != r11) goto L_0x0178
            r7 = 7
            byte r7 = r15[r7]
            r11 = 95
            if (r7 != r11) goto L_0x0178
            r7 = 8
            byte r7 = r15[r7]
            r11 = 86
            if (r7 != r11) goto L_0x0178
            r7 = 9
            byte r7 = r15[r7]
            r11 = 51
            if (r7 != r11) goto L_0x0178
            java.lang.String r7 = "MicroMsg.SilkWriter"
            java.lang.String r11 = "writeSilkFile deleteHead & bDeleteHead true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            r7 = 1
            goto L_0x0179
        L_0x0171:
            r6 = 6
            goto L_0x0178
        L_0x0173:
            r6 = 6
            goto L_0x0177
        L_0x0175:
            r6 = 6
            r8 = 3
        L_0x0177:
            r9 = 4
        L_0x0178:
            r7 = 0
        L_0x0179:
            if (r10 == 0) goto L_0x01ae
            r1.f300473d = r5
            java.lang.String r0 = "MicroMsg.SilkWriter"
            java.lang.String r2 = "writeSilkFile SilkEncode failed, ret:%d"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r4[r5] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r4)
            boolean r0 = r1.f300479j
            if (r0 != 0) goto L_0x01ad
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 357(0x165, double:1.764E-321)
            r5 = 56
            r7 = 1
            r2 = r0
            r2.mo175913w(r3, r5, r7)
            r2 = 1
            r1.f300479j = r2
            boolean r2 = qe3.C89625d.f257845k
            if (r2 == 0) goto L_0x01ad
            java.lang.String r2 = "Record"
            java.lang.String r3 = "Encode failed"
            r4 = 0
            r0.mo160135k(r2, r3, r4)
        L_0x01ad:
            return r18
        L_0x01ae:
            java.lang.String r10 = "MicroMsg.SilkWriter"
            java.lang.String r11 = "encoutdatalen: %s, framelen: %s, lastframe: %s, byteBuf.len: %s"
            java.lang.Object[] r9 = new java.lang.Object[r9]
            short r12 = r19[r5]
            java.lang.Short r12 = java.lang.Short.valueOf(r12)
            r9[r5] = r12
            java.lang.Short r12 = java.lang.Short.valueOf(r4)
            r20 = 1
            r9[r20] = r12
            boolean r12 = r0.f296201c
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r20 = 2
            r9[r20] = r12
            int r12 = r0.f296200b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r9[r8] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r10, r11, r9)
            short r8 = r19[r5]     // Catch:{ IOException -> 0x0219 }
            r9 = r26
            if (r8 >= r9) goto L_0x020f
            if (r8 <= 0) goto L_0x020f
            java.io.OutputStream r8 = r1.f300480k     // Catch:{ IOException -> 0x0219 }
            if (r8 == 0) goto L_0x020f
            if (r30 == 0) goto L_0x0204
            if (r7 == 0) goto L_0x0204
            java.lang.String r7 = "MicroMsg.SilkWriter"
            java.lang.String r8 = "writeSilkFile bDeleteHead copyOfRange"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)     // Catch:{ IOException -> 0x0219 }
            r7 = 1
            byte[] r8 = java.util.Arrays.copyOfRange(r15, r7, r9)     // Catch:{ IOException -> 0x0219 }
            java.io.OutputStream r10 = r1.f300480k     // Catch:{ IOException -> 0x0219 }
            short r11 = r19[r5]     // Catch:{ IOException -> 0x0219 }
            int r11 = r11 - r7
            r10.write(r8, r5, r11)     // Catch:{ IOException -> 0x0219 }
            short r8 = r19[r5]     // Catch:{ IOException -> 0x0219 }
            int r8 = r8 - r7
            int r17 = r17 + r8
            goto L_0x020f
        L_0x0204:
            java.io.OutputStream r7 = r1.f300480k     // Catch:{ IOException -> 0x0219 }
            short r8 = r19[r5]     // Catch:{ IOException -> 0x0219 }
            r7.write(r15, r5, r8)     // Catch:{ IOException -> 0x0219 }
            short r7 = r19[r5]     // Catch:{ IOException -> 0x0219 }
            int r17 = r17 + r7
        L_0x020f:
            r11 = r9
            r6 = r14
            r12 = r15
            r7 = r22
            r5 = 2
            r10 = 0
            r15 = 1
            goto L_0x006c
        L_0x0219:
            java.lang.String r0 = "MicroMsg.SilkWriter"
            java.lang.String r2 = "writeSilkFile Write File Error file:%s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r1.f300472c
            r3[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r3)
            return r18
        L_0x0229:
            r0 = move-exception
            goto L_0x022e
        L_0x022b:
            r0 = move-exception
            r23 = r7
        L_0x022e:
            r7 = r23
        L_0x0230:
            monitor-exit(r7)     // Catch:{ all -> 0x0232 }
            throw r0
        L_0x0232:
            r0 = move-exception
            goto L_0x0230
        L_0x0234:
            r0 = move-exception
            r5 = 0
            java.lang.String r2 = "MicroMsg.SilkWriter"
            java.lang.String r3 = "writeSilkFile SilkEncode arraycopy failed, offset:%d framelen:%d error:%s"
            java.lang.Object[] r6 = new java.lang.Object[r8]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r5] = r7
            java.lang.Short r4 = java.lang.Short.valueOf(r4)
            r5 = 1
            r6[r5] = r4
            java.lang.String r0 = r0.getMessage()
            r4 = 2
            r6[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r6)
            return r18
        L_0x0255:
            r5 = 0
            r9 = 4
            java.io.OutputStream r4 = r1.f300480k
            if (r4 == 0) goto L_0x0271
            java.io.OutputStream r4 = r1.f300480k     // Catch:{ IOException -> 0x0261 }
            r4.flush()     // Catch:{ IOException -> 0x0261 }
            goto L_0x0271
        L_0x0261:
            java.lang.String r0 = "MicroMsg.SilkWriter"
            java.lang.String r2 = "writeSilkFile flush File Error file:%s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r1.f300472c
            r3[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r3)
            return r18
        L_0x0271:
            byte[] r0 = r0.f296199a     // Catch:{ Exception -> 0x02cd }
            byte[] r4 = r1.f300474e     // Catch:{ Exception -> 0x02cd }
            int r10 = r1.f300473d     // Catch:{ Exception -> 0x02cd }
            java.lang.System.arraycopy(r0, r7, r4, r10, r6)     // Catch:{ Exception -> 0x02cd }
            int r0 = r1.f300473d     // Catch:{ Exception -> 0x02cd }
            int r0 = r0 + r6
            r1.f300473d = r0     // Catch:{ Exception -> 0x02cd }
            long r3 = r3.mo72288a()
            r5 = 1
            if (r2 != r5) goto L_0x0297
            uh.a$a r0 = f300469o
            long r6 = r0.f300468b
            int r8 = r0.f300467a
            long r9 = (long) r8
            long r6 = r6 * r9
            long r6 = r6 + r3
            int r8 = r8 + r5
            long r9 = (long) r8
            long r6 = r6 / r9
            r0.f300468b = r6
            r0.f300467a = r8
        L_0x0297:
            java.lang.String r0 = "MicroMsg.SilkWriter"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "writeSilkFile append2silkfile silkTime:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " useFloat:"
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = " avg:"
            r5.append(r2)
            uh.a$a r2 = f300469o
            long r3 = r2.f300468b
            r5.append(r3)
            java.lang.String r3 = " cnt:"
            r5.append(r3)
            int r2 = r2.f300467a
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
            return r17
        L_0x02cd:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.SilkWriter"
            java.lang.String r3 = "writeSilkFile SilkEncode arraycopy failed, offset:%d leftBufSize:%d leftSize:%d error:%s"
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4[r5] = r7
            int r5 = r1.f300473d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 1
            r4[r7] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r6 = 2
            r4[r6] = r5
            java.lang.String r0 = r0.getMessage()
            r4[r8] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r4)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: p827uh.C102034c.mo73540d(qh.k$a, int, boolean):int");
    }

    /* renamed from: e */
    public void mo73541e() {
        Log.m105924i("MicroMsg.SilkWriter", "waitStop");
        synchronized (this) {
            this.f300471b = true;
        }
        C102036b bVar = this.f300478i;
        if (bVar != null) {
            try {
                Future<?> future = bVar.f300484d;
                if (future != null) {
                    future.get();
                }
            } catch (InterruptedException e) {
                Log.m105921e("MicroMsg.SilkWriter", "exception:%s", Util.stackTraceToString(e));
            } catch (ExecutionException e2) {
                Log.m105921e("MicroMsg.SilkWriter", "exception:%s", Util.stackTraceToString(e2));
            }
        }
        synchronized (this.f300477h) {
            try {
                C99124m mVar = this.f300483n;
                if (mVar != null) {
                    MediaRecorder.SilkEncUnInit(mVar.f290640a);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        Log.m105924i("MicroMsg.SilkWriter", "finish Thread file:" + this.f300472c);
        if (this.f300480k != null) {
            try {
                this.f300480k.close();
            } catch (Exception e3) {
                Log.m105920e("MicroMsg.SilkWriter", "close silk file:" + this.f300472c + "msg:" + e3.getMessage());
            }
            this.f300480k = null;
        }
    }

    /* renamed from: f */
    public boolean mo141541f(String str, OutputStream outputStream) {
        this.f300472c = str;
        this.f300480k = outputStream;
        this.f300479j = false;
        int a = C107842p.m146108a();
        if ((a & 1024) != 0) {
            this.f300481l = 4;
        } else if ((a & 512) != 0) {
            this.f300481l = 2;
        } else {
            Log.m105920e("MicroMsg.SilkWriter", "initWriter cpuType error! silk don't support arm_v5!!!!");
            return false;
        }
        C99124m mVar = new C99124m(this.f300475f, this.f300476g, this.f300481l);
        this.f300483n = mVar;
        if (0 == mVar.f290640a) {
            Log.m105920e("MicroMsg.SilkWriter", "initWriter SilkEncoderInit Error");
            this.f300483n = null;
            return false;
        }
        this.f300474e = new byte[(((this.f300475f * 20) * 2) / 1000)];
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_msg_voice_silk_opt, -1);
        if (1 == Qe) {
            this.f300482m = true;
        }
        if (Qe == 0) {
            this.f300482m = false;
        }
        if (this.f300482m) {
            C99124m mVar2 = this.f300483n;
            if (mVar2 != null) {
                MediaRecorder.SetVoiceSilkControl(200, 1, mVar2.f290640a);
            }
            Log.m105924i("MicroMsg.SilkWriter", "Voice Message Compression Optimization is Open !");
        } else {
            C99124m mVar3 = this.f300483n;
            if (mVar3 != null) {
                MediaRecorder.SetVoiceSilkControl(200, 0, mVar3.f290640a);
            }
            Log.m105924i("MicroMsg.SilkWriter", "Voice Message Compression Optimization is Close !");
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r7.f300478i != null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r0 = new p827uh.C102034c.C102036b(r7, (p827uh.C102034c.C102035a) null);
        r7.f300478i = r0;
        ((zt3.C119157j) zt3.C119157j.f356862d).mo183875f(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        r0 = r7.f300470a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        ((java.util.concurrent.ArrayBlockingQueue) r0).add(new p375qh.C101193k.C101194a(r8, r9, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.SilkWriter", r8, "pushBuf add queue error:%s", r8.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141542g(byte[] r8, int r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.SilkWriter"
            java.lang.String r1 = "pushBuf queueLen:%d bufLen:%d len:%d, lastFrame: %s"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.util.concurrent.BlockingQueue<qh.k$a> r3 = r7.f300470a
            r4 = -1
            if (r3 != 0) goto L_0x000f
            r3 = -1
            goto L_0x0015
        L_0x000f:
            java.util.concurrent.ArrayBlockingQueue r3 = (java.util.concurrent.ArrayBlockingQueue) r3
            int r3 = r3.size()
        L_0x0015:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r2[r5] = r3
            if (r8 != 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            int r4 = r8.length
        L_0x0020:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r4 = 1
            r2[r4] = r3
            r3 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r2[r3] = r6
            r3 = 3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)
            r2[r3] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            if (r9 > 0) goto L_0x003b
            return
        L_0x003b:
            monitor-enter(r7)
            boolean r0 = r7.f300471b     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x0049
            java.lang.String r8 = "MicroMsg.SilkWriter"
            java.lang.String r9 = "already stop"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r9)     // Catch:{ all -> 0x007e }
            monitor-exit(r7)     // Catch:{ all -> 0x007e }
            return
        L_0x0049:
            monitor-exit(r7)     // Catch:{ all -> 0x007e }
            uh.c$b r0 = r7.f300478i
            if (r0 != 0) goto L_0x005d
            uh.c$b r0 = new uh.c$b
            r1 = 0
            r0.<init>(r1)
            r7.f300478i = r0
            zt3.t r1 = zt3.C119157j.f356862d
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183875f(r0)
        L_0x005d:
            java.util.concurrent.BlockingQueue<qh.k$a> r0 = r7.f300470a
            if (r0 == 0) goto L_0x007d
            qh.k$a r1 = new qh.k$a     // Catch:{ Exception -> 0x006c }
            r1.<init>(r8, r9, r10)     // Catch:{ Exception -> 0x006c }
            java.util.concurrent.ArrayBlockingQueue r0 = (java.util.concurrent.ArrayBlockingQueue) r0     // Catch:{ Exception -> 0x006c }
            r0.add(r1)     // Catch:{ Exception -> 0x006c }
            goto L_0x007d
        L_0x006c:
            r8 = move-exception
            java.lang.String r9 = "MicroMsg.SilkWriter"
            java.lang.String r10 = "pushBuf add queue error:%s"
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = r8.getMessage()
            r0[r5] = r1
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r8, r10, r0)
        L_0x007d:
            return
        L_0x007e:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x007e }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p827uh.C102034c.mo141542g(byte[], int, boolean):void");
    }
}
