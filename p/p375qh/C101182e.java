package p375qh;

import android.media.MediaRecorder;
import android.os.Looper;
import android.view.accessibility.AccessibilityManager;
import androidx.exifinterface.media.ExifInterface;
import bd0.C39755e;
import bd0.C92247c;
import bd0.C92249d;
import com.tencent.p014mm.accessibility.uitl.AccUtil;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import p206nj.C76861g;
import p331dj.C75411c;
import p375qh.C101180a;
import p375qh.C110390f;
import p827uh.C102034c;
import p914oj.C100362d;
import zt3.C119157j;

/* renamed from: qh.e */
public class C101182e implements C101180a {

    /* renamed from: x */
    public static final Object f296158x = new Object();

    /* renamed from: y */
    public static final Object f296159y = new Object();

    /* renamed from: a */
    public int f296160a = 0;

    /* renamed from: b */
    public String f296161b = null;

    /* renamed from: c */
    public final Object f296162c = new Object();

    /* renamed from: d */
    public C102034c f296163d = null;

    /* renamed from: e */
    public C101180a.C101181a f296164e;

    /* renamed from: f */
    public C92249d f296165f = null;

    /* renamed from: g */
    public C39755e.C39756a f296166g = null;

    /* renamed from: h */
    public long f296167h = 0;

    /* renamed from: i */
    public long f296168i = 0;

    /* renamed from: j */
    public int f296169j = 0;

    /* renamed from: k */
    public volatile boolean f296170k = false;

    /* renamed from: l */
    public int f296171l = 8000;

    /* renamed from: m */
    public int f296172m = 16000;

    /* renamed from: n */
    public boolean f296173n = false;

    /* renamed from: o */
    public MediaRecorder f296174o;

    /* renamed from: p */
    public C110390f f296175p = null;

    /* renamed from: q */
    public C75411c f296176q;

    /* renamed from: r */
    public C101192f f296177r;

    /* renamed from: s */
    public long f296178s = -1;

    /* renamed from: t */
    public C101189e f296179t = new C101189e(this, 1500);

    /* renamed from: u */
    public C76861g.C47263a f296180u = new C76861g.C47263a();

    /* renamed from: v */
    public C110390f.C89659b f296181v = new C101185c();

    /* renamed from: w */
    public boolean f296182w = false;

    /* renamed from: qh.e$a */
    public class C101183a implements MediaRecorder.OnErrorListener {
        public C101183a() {
        }

        public void onError(MediaRecorder mediaRecorder, int i, int i2) {
            C101180a.C101181a aVar = C101182e.this.f296164e;
            if (aVar != null) {
                aVar.mo127303a();
            }
            try {
                C101182e.this.f296174o.release();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.MMAudioRecorder", e.getMessage());
            }
            C101182e.this.f296177r = C101192f.ERROR;
        }
    }

    /* renamed from: qh.e$b */
    public class C101184b implements Runnable {
        public C101184b() {
        }

        public void run() {
            long currentTicks = Util.currentTicks();
            Log.m105925i("MicroMsg.MMAudioRecorder", "stop try stopRecorder, pcmRecorder:%s", C101182e.this.f296175p);
            synchronized (C101182e.f296158x) {
                C110390f fVar = C101182e.this.f296175p;
                if (fVar != null) {
                    fVar.mo161907l();
                    C101182e eVar = C101182e.this;
                    eVar.f296175p.f330245x = null;
                    eVar.f296175p = null;
                }
            }
            Log.m105925i("MicroMsg.MMAudioRecorder", "stop finish stopRecorder, cost:%s", Long.valueOf(Util.ticksToNow(currentTicks)));
        }
    }

    /* renamed from: qh.e$c */
    public class C101185c implements C110390f.C89659b {

        /* renamed from: qh.e$c$a */
        public class C101186a implements Runnable {
            public C101186a() {
            }

            public void run() {
                C101182e.this.mo140633h();
                C101180a.C101181a aVar = C101182e.this.f296164e;
                if (aVar != null) {
                    aVar.mo127303a();
                }
            }
        }

        /* renamed from: qh.e$c$b */
        public class C101187b implements Runnable {
            public C101187b() {
            }

            public void run() {
                C101182e.this.mo140633h();
                C101180a.C101181a aVar = C101182e.this.f296164e;
                if (aVar != null) {
                    aVar.mo127303a();
                }
            }
        }

        public C101185c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0269, code lost:
            if (r0 == 0) goto L_0x026e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x026b, code lost:
            r0 = r3 - r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x026e, code lost:
            r0 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x026f, code lost:
            if (r0 > 0) goto L_0x0273;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0271, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x0273, code lost:
            r0 = r0 / 2;
            r3 = new byte[r0];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0276, code lost:
            if (r10 >= r0) goto L_0x0289;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0278, code lost:
            r4 = r10 * 2;
            r3[r10] = r2[r4];
            r3[r10 + 1] = r2[r4 + 1];
            r10 = r10 + 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0289, code lost:
            r0 = r3.length;
            r2 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x028c, code lost:
            r0 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x028d, code lost:
            mo140636c(r2, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x0290, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0265, code lost:
            if (r0.f296171l != 16000) goto L_0x028c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0267, code lost:
            r0 = r3 % 4;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo35508a(byte[] r18, int r19) {
            /*
                r17 = this;
                r1 = r17
                r2 = r18
                r3 = r19
                dj.c r4 = p331dj.C75411c.SILK
                qh.e$f r5 = p375qh.C101182e.C101192f.STOPPED
                java.lang.String r0 = "MicroMsg.MMAudioRecorder"
                java.lang.String r6 = "onRecPcmDataReady, markStop: %s"
                r7 = 1
                java.lang.Object[] r8 = new java.lang.Object[r7]
                qh.e r9 = p375qh.C101182e.this
                boolean r9 = r9.f296170k
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
                r10 = 0
                r8[r10] = r9
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r8)
                qh.e r0 = p375qh.C101182e.this
                qh.e$f r6 = r0.f296177r
                if (r6 != r5) goto L_0x0033
                boolean r0 = r0.f296170k
                if (r0 != 0) goto L_0x0033
                java.lang.String r0 = "MicroMsg.MMAudioRecorder"
                java.lang.String r2 = "recorder has been stopped"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
                return
            L_0x0033:
                java.lang.Integer[] r0 = p1088th.C101879a.f299973a
                java.lang.String r0 = "data"
                gy3.C87412m.m108594g(r2, r0)
                int r0 = p1088th.C101879a.f299975c
                int r0 = r0 + r7
                p1088th.C101879a.f299975c = r0
                int r0 = r0 % 200
                r6 = 2
                if (r0 == 0) goto L_0x0046
                goto L_0x00d4
            L_0x0046:
                if (r3 == 0) goto L_0x00d4
                int r0 = r3 / 2
                short[] r8 = new short[r0]
                r9 = 0
            L_0x004d:
                if (r9 >= r0) goto L_0x0063
                int r11 = r9 * 2
                byte r12 = r2[r11]
                r12 = r12 & 255(0xff, float:3.57E-43)
                int r11 = r11 + r7
                byte r11 = r2[r11]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << 8
                r11 = r11 | r12
                short r11 = (short) r11
                r8[r9] = r11
                int r9 = r9 + 1
                goto L_0x004d
            L_0x0063:
                r11 = 0
                r9 = 0
            L_0x0066:
                if (r9 >= r0) goto L_0x0071
                short r13 = r8[r9]
                int r13 = r13 * r13
                double r13 = (double) r13
                double r11 = r11 + r13
                int r9 = r9 + 1
                goto L_0x0066
            L_0x0071:
                double r8 = (double) r0
                double r11 = r11 / r8
                double r8 = java.lang.Math.sqrt(r11)
                r11 = 4632233691727265792(0x4049000000000000, double:50.0)
                int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                if (r0 >= 0) goto L_0x008d
                java.lang.Integer[] r0 = p1088th.C101879a.f299973a
                r8 = r0[r10]
                int r8 = r8.intValue()
                int r8 = r8 + r7
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r0[r10] = r8
                goto L_0x00cf
            L_0x008d:
                r11 = 4643985272004935680(0x4072c00000000000, double:300.0)
                int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                if (r0 >= 0) goto L_0x00a6
                java.lang.Integer[] r0 = p1088th.C101879a.f299973a
                r8 = r0[r7]
                int r8 = r8.intValue()
                int r8 = r8 + r7
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r0[r7] = r8
                goto L_0x00cf
            L_0x00a6:
                r11 = 4656510908468559872(0x409f400000000000, double:2000.0)
                int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bf
                java.lang.Integer[] r0 = p1088th.C101879a.f299973a
                r8 = r0[r6]
                int r8 = r8.intValue()
                int r8 = r8 + r7
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r0[r6] = r8
                goto L_0x00cf
            L_0x00bf:
                java.lang.Integer[] r0 = p1088th.C101879a.f299973a
                r8 = 3
                r9 = r0[r8]
                int r9 = r9.intValue()
                int r9 = r9 + r7
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r0[r8] = r9
            L_0x00cf:
                int r0 = p1088th.C101879a.f299974b
                int r0 = r0 + r7
                p1088th.C101879a.f299974b = r0
            L_0x00d4:
                java.lang.Object r8 = p375qh.C101182e.f296159y
                monitor-enter(r8)
                qh.e r0 = p375qh.C101182e.this     // Catch:{ all -> 0x0294 }
                boolean r0 = r0.f296170k     // Catch:{ all -> 0x0294 }
                monitor-exit(r8)     // Catch:{ all -> 0x0294 }
                r9 = 0
                if (r0 == 0) goto L_0x0138
                java.lang.Object r11 = p375qh.C101182e.f296158x
                monitor-enter(r11)
                qh.e r0 = p375qh.C101182e.this     // Catch:{ all -> 0x0135 }
                qh.f r0 = r0.f296175p     // Catch:{ all -> 0x0135 }
                if (r0 == 0) goto L_0x010a
                java.lang.String r0 = "MicroMsg.MMAudioRecorder"
                java.lang.String r12 = "do stop pcm recorder, last frame data: %s, read: %s"
                java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x0135 }
                r13[r10] = r2     // Catch:{ all -> 0x0135 }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x0135 }
                r13[r7] = r14     // Catch:{ all -> 0x0135 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r12, r13)     // Catch:{ all -> 0x0135 }
                qh.e r0 = p375qh.C101182e.this     // Catch:{ all -> 0x0135 }
                qh.f r0 = r0.f296175p     // Catch:{ all -> 0x0135 }
                r0.mo161907l()     // Catch:{ all -> 0x0135 }
                qh.e r0 = p375qh.C101182e.this     // Catch:{ all -> 0x0135 }
                qh.f r12 = r0.f296175p     // Catch:{ all -> 0x0135 }
                r12.f330245x = r9     // Catch:{ all -> 0x0135 }
                r0.f296175p = r9     // Catch:{ all -> 0x0135 }
                r12 = 1
                goto L_0x0113
            L_0x010a:
                java.lang.String r0 = "MicroMsg.MMAudioRecorder"
                java.lang.String r12 = "stop now, but recorder is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)     // Catch:{ all -> 0x0135 }
                r12 = 0
            L_0x0113:
                monitor-exit(r11)     // Catch:{ all -> 0x0135 }
                monitor-enter(r8)
                qh.e r0 = p375qh.C101182e.this     // Catch:{ all -> 0x0132 }
                r0.f296170k = r10     // Catch:{ all -> 0x0132 }
                java.lang.String r0 = "MicroMsg.MMAudioRecorder"
                java.lang.String r11 = "stop finish notify"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)     // Catch:{ all -> 0x0132 }
                r8.notifyAll()     // Catch:{ Exception -> 0x0125 }
                goto L_0x0130
            L_0x0125:
                r0 = move-exception
                r11 = r0
                java.lang.String r0 = "MicroMsg.MMAudioRecorder"
                java.lang.String r13 = ""
                java.lang.Object[] r14 = new java.lang.Object[r10]     // Catch:{ all -> 0x0132 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r11, r13, r14)     // Catch:{ all -> 0x0132 }
            L_0x0130:
                monitor-exit(r8)     // Catch:{ all -> 0x0132 }
                goto L_0x0139
            L_0x0132:
                r0 = move-exception
                monitor-exit(r8)     // Catch:{ all -> 0x0132 }
                throw r0
            L_0x0135:
                r0 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x0135 }
                throw r0
            L_0x0138:
                r12 = 0
            L_0x0139:
                qh.e r0 = p375qh.C101182e.this
                long r13 = r0.f296168i
                long r13 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r13)
                qh.e r0 = p375qh.C101182e.this
                long r7 = r0.f296167h
                r15 = 0
                int r0 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
                if (r0 <= 0) goto L_0x0177
                int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r0 <= 0) goto L_0x0177
                java.lang.String r0 = "MicroMsg.MMAudioRecorder"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Stop now ! expire duration ms:"
                r2.append(r3)
                r2.append(r13)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
                com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r0.<init>((android.os.Looper) r2)
                qh.e$c$a r2 = new qh.e$c$a
                r2.<init>()
                r0.post(r2)
                return
            L_0x0177:
                java.lang.String r0 = "MicroMsg.MMAudioRecorder"
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "read :"
                r7.append(r8)
                r7.append(r3)
                java.lang.String r8 = " time: "
                r7.append(r8)
                qh.e r8 = p375qh.C101182e.this
                nj.g$a r8 = r8.f296180u
                long r13 = r8.mo72288a()
                r7.append(r13)
                java.lang.String r8 = " dataReadedCnt: "
                r7.append(r8)
                qh.e r8 = p375qh.C101182e.this
                int r8 = r8.f296169j
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
                if (r3 >= 0) goto L_0x01cd
                qh.e r0 = p375qh.C101182e.this
                qh.e$f r0 = r0.f296177r
                if (r0 != r5) goto L_0x01bb
                java.lang.String r0 = "MicroMsg.MMAudioRecorder"
                java.lang.String r2 = "recorder has been stopped"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
                goto L_0x01cc
            L_0x01bb:
                com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r0.<init>((android.os.Looper) r2)
                qh.e$c$b r2 = new qh.e$c$b
                r2.<init>()
                r0.post(r2)
            L_0x01cc:
                return
            L_0x01cd:
                java.lang.String r0 = "MicroMsg.MMAudioRecorder"
                java.lang.String r5 = "publish SceneVoiceRcdDataEvent, buf.len %d, len: %d."
                java.lang.Object[] r7 = new java.lang.Object[r6]
                int r8 = r2.length
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r7[r10] = r8
                java.lang.Integer r8 = java.lang.Integer.valueOf(r19)
                r11 = 1
                r7[r11] = r8
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r7)
                com.tencent.mm.autogen.events.SceneVoiceRcdDataEvent r0 = new com.tencent.mm.autogen.events.SceneVoiceRcdDataEvent
                r0.<init>()
                com.tencent.mm.autogen.events.SceneVoiceRcdDataEvent$a r5 = r0.f265096d
                int r7 = r2.length
                byte[] r7 = java.util.Arrays.copyOf(r2, r7)
                r5.f265097a = r7
                com.tencent.mm.autogen.events.SceneVoiceRcdDataEvent$a r5 = r0.f265096d
                r5.f265098b = r3
                r0.publish()
                qh.e r0 = p375qh.C101182e.this
                int r5 = r0.f296169j
                int r5 = r5 + r3
                r0.f296169j = r5
                java.lang.Object r5 = r0.f296162c
                monitor-enter(r5)
                qh.e r0 = p375qh.C101182e.this     // Catch:{ all -> 0x0291 }
                bd0.d r7 = r0.f296165f     // Catch:{ all -> 0x0291 }
                if (r7 != 0) goto L_0x022d
                dj.c r7 = r0.f296176q     // Catch:{ all -> 0x0291 }
                dj.c r8 = p331dj.C75411c.PCM     // Catch:{ all -> 0x0291 }
                if (r7 == r8) goto L_0x0212
                if (r7 != r4) goto L_0x022d
            L_0x0212:
                bd0.e$a r7 = r0.f296166g     // Catch:{ all -> 0x0291 }
                if (r7 == 0) goto L_0x022d
                boolean r7 = r0.f296173n     // Catch:{ all -> 0x0291 }
                if (r7 == 0) goto L_0x022d
                bd0.d r7 = new bd0.d     // Catch:{ all -> 0x0291 }
                r7.<init>()     // Catch:{ all -> 0x0291 }
                r0.f296165f = r7     // Catch:{ all -> 0x0291 }
                qh.e r0 = p375qh.C101182e.this     // Catch:{ all -> 0x0291 }
                bd0.d r7 = r0.f296165f     // Catch:{ all -> 0x0291 }
                int r0 = r0.f296171l     // Catch:{ all -> 0x0291 }
                r8 = 16
                r11 = 1
                r7.mo126245a(r0, r11, r8)     // Catch:{ all -> 0x0291 }
            L_0x022d:
                qh.e r0 = p375qh.C101182e.this     // Catch:{ all -> 0x0291 }
                bd0.d r0 = r0.f296165f     // Catch:{ all -> 0x0291 }
                if (r0 == 0) goto L_0x0236
                r0.mo126246b(r2)     // Catch:{ all -> 0x0291 }
            L_0x0236:
                qh.e r0 = p375qh.C101182e.this     // Catch:{ all -> 0x0291 }
                dj.c r7 = r0.f296176q     // Catch:{ all -> 0x0291 }
                if (r7 != r4) goto L_0x0260
                uh.c r4 = r0.f296163d     // Catch:{ all -> 0x0291 }
                if (r4 != 0) goto L_0x0254
                uh.c r4 = new uh.c     // Catch:{ all -> 0x0291 }
                int r6 = r0.f296171l     // Catch:{ all -> 0x0291 }
                int r7 = r0.f296172m     // Catch:{ all -> 0x0291 }
                r4.<init>(r6, r7)     // Catch:{ all -> 0x0291 }
                r0.f296163d = r4     // Catch:{ all -> 0x0291 }
                qh.e r0 = p375qh.C101182e.this     // Catch:{ all -> 0x0291 }
                uh.c r4 = r0.f296163d     // Catch:{ all -> 0x0291 }
                java.lang.String r0 = r0.f296161b     // Catch:{ all -> 0x0291 }
                r4.mo73537a(r0)     // Catch:{ all -> 0x0291 }
            L_0x0254:
                r17.mo140636c(r18, r19)     // Catch:{ all -> 0x0291 }
                qh.e r0 = p375qh.C101182e.this     // Catch:{ all -> 0x0291 }
                uh.c r0 = r0.f296163d     // Catch:{ all -> 0x0291 }
                r0.mo141542g(r2, r3, r12)     // Catch:{ all -> 0x0291 }
                monitor-exit(r5)     // Catch:{ all -> 0x0291 }
                return
            L_0x0260:
                monitor-exit(r5)     // Catch:{ all -> 0x0291 }
                int r0 = r0.f296171l
                r4 = 16000(0x3e80, float:2.2421E-41)
                if (r0 != r4) goto L_0x028c
                int r0 = r3 % 4
                if (r0 == 0) goto L_0x026e
                int r0 = r3 - r0
                goto L_0x026f
            L_0x026e:
                r0 = r3
            L_0x026f:
                if (r0 > 0) goto L_0x0273
                r3 = r9
                goto L_0x0289
            L_0x0273:
                int r0 = r0 / r6
                byte[] r3 = new byte[r0]
            L_0x0276:
                if (r10 >= r0) goto L_0x0289
                int r4 = r10 * 2
                byte r5 = r2[r4]
                r3[r10] = r5
                int r5 = r10 + 1
                r6 = 1
                int r4 = r4 + r6
                byte r4 = r2[r4]
                r3[r5] = r4
                int r10 = r10 + 2
                goto L_0x0276
            L_0x0289:
                int r0 = r3.length
                r2 = r3
                goto L_0x028d
            L_0x028c:
                r0 = r3
            L_0x028d:
                r1.mo140636c(r2, r0)
                return
            L_0x0291:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0291 }
                throw r0
            L_0x0294:
                r0 = move-exception
                monitor-exit(r8)     // Catch:{ all -> 0x0294 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p375qh.C101182e.C101185c.mo35508a(byte[], int):void");
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
        }

        /* renamed from: c */
        public final void mo140636c(byte[] bArr, int i) {
            for (int i2 = 0; i2 < i / 2; i2++) {
                int i3 = i2 * 2;
                short s = (short) ((bArr[i3 + 1] << 8) | (bArr[i3] & ExifInterface.MARKER));
                C101182e eVar = C101182e.this;
                if (s > eVar.f296160a) {
                    eVar.f296160a = s;
                }
            }
        }
    }

    /* renamed from: qh.e$d */
    public class C101188d implements Runnable {
        public C101188d() {
        }

        public void run() {
            Log.m105925i("MicroMsg.MMAudioRecorder", "start to wait pcmrecorder stop, markStop: %s", Boolean.valueOf(C101182e.this.f296170k));
            Object obj = C101182e.f296159y;
            synchronized (obj) {
                try {
                    obj.wait(300);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MMAudioRecorder", e, "", new Object[0]);
                }
            }
            synchronized (C101182e.f296158x) {
                Log.m105925i("MicroMsg.MMAudioRecorder", "wait pcmrecorder stop, timeout, mPcmRecorder: %s", C101182e.this.f296175p);
                C110390f fVar = C101182e.this.f296175p;
                if (fVar != null) {
                    try {
                        fVar.mo161907l();
                        C101182e eVar = C101182e.this;
                        eVar.f296175p.f330245x = null;
                        eVar.f296175p = null;
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.MMAudioRecorder", e2, "", new Object[0]);
                    }
                }
            }
            Log.m105925i("MicroMsg.MMAudioRecorder", "finish to pcmrecorder stop, markStop: %s", Boolean.valueOf(C101182e.this.f296170k));
        }
    }

    /* renamed from: qh.e$e */
    public class C101189e extends MTimerHandler {

        /* renamed from: a */
        public long f296189a;

        /* renamed from: qh.e$e$a */
        public class C101190a implements MTimerHandler.CallBack {
            public C101190a(C101182e eVar) {
            }

            public boolean onTimerExpired() {
                Log.m105924i("MicroMsg.MMAudioRecorder", "Acc try interrupt read");
                try {
                    ((AccessibilityManager) MMApplicationContext.getContext().getSystemService("accessibility")).interrupt();
                    return true;
                } catch (Throwable unused) {
                    return false;
                }
            }
        }

        /* renamed from: qh.e$e$b */
        public class C101191b implements Runnable {
            public C101191b() {
            }

            public void run() {
                Log.m105924i("MicroMsg.MMAudioRecorder", "auto stop Timer");
                C101189e.this.stopTimer();
            }
        }

        public C101189e(C101182e eVar, long j) {
            super(new C101190a(eVar), true);
            this.f296189a = j;
        }

        public void startTimer(long j, long j2) {
            if (stopped()) {
                long j3 = this.f296189a;
                if (j3 > 0) {
                    postDelayed(new C101191b(), j3);
                }
            }
            super.startTimer(j, j2);
        }

        public void stopTimer() {
            super.stopTimer();
        }
    }

    /* renamed from: qh.e$f */
    public enum C101192f {
        INITIALIZING,
        READY,
        RECORDING,
        ERROR,
        STOPPED
    }

    public C101182e(C75411c cVar) {
        C75411c cVar2 = C75411c.AMR;
        Log.m105924i("MicroMsg.MMAudioRecorder", "MMAudioRecorder recMode: " + cVar);
        this.f296176q = cVar;
        if (!C101195p.f296203b) {
            Log.m105924i("MicroMsg.MMAudioRecorder", "can't use silk encode, force to use amr mode now");
            this.f296176q = cVar2;
        }
        if (this.f296176q == cVar2) {
            this.f296174o = new C100362d();
        } else {
            mo140627b();
        }
        this.f296178s = -1;
        this.f296170k = false;
    }

    /* renamed from: a */
    public int mo140626a() {
        if (this.f296176q == C75411c.AMR) {
            MediaRecorder mediaRecorder = this.f296174o;
            if (mediaRecorder == null) {
                return 0;
            }
            return mediaRecorder.getMaxAmplitude();
        } else if (this.f296177r != C101192f.RECORDING) {
            return 0;
        } else {
            int i = this.f296160a;
            long j = this.f296178s;
            if (j <= 0 || Util.ticksToNow(j) > 500) {
                Log.m105925i("MicroMsg.MMAudioRecorder", "mCurAmplitude:%s", Integer.valueOf(this.f296160a));
                this.f296178s = Util.currentTicks();
            }
            this.f296160a = 0;
            return i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012e, code lost:
        if (r1 == (r6 / 2)) goto L_0x0130;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140627b() {
        /*
            r12 = this;
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            bd0.e$a r1 = bd0.C39755e.C39756a.m42546d()
            r12.f296166g = r1
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0135
            java.lang.String r6 = "EnableSpeexVoiceUpload"
            int r6 = p375qh.C35873j.m40885a(r6, r2)
            if (r4 != r6) goto L_0x0018
            goto L_0x0130
        L_0x0018:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "type "
            r6.append(r7)
            int r7 = bd0.C39755e.f106663g
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "upload"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r6)
            int r6 = bd0.C39755e.f106663g
            if (r6 == 0) goto L_0x0043
            if (r6 == r4) goto L_0x0040
            if (r6 == r3) goto L_0x003d
            int r8 = r1.f106675i
            goto L_0x0045
        L_0x003d:
            int r8 = r1.f106677k
            goto L_0x0045
        L_0x0040:
            int r8 = r1.f106676j
            goto L_0x0045
        L_0x0043:
            int r8 = r1.f106675i
        L_0x0045:
            if (r6 == 0) goto L_0x0054
            if (r6 == r4) goto L_0x0051
            if (r6 == r3) goto L_0x004e
            int r6 = r1.f106670d
            goto L_0x0056
        L_0x004e:
            int r6 = r1.f106672f
            goto L_0x0056
        L_0x0051:
            int r6 = r1.f106671e
            goto L_0x0056
        L_0x0054:
            int r6 = r1.f106670d
        L_0x0056:
            f40.C86709a0.m107528h()
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            r10 = 16646145(0xfe0001, float:2.3326217E-38)
            java.lang.Object r9 = r9.mo119684e(r10, r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "daycount "
            r10.append(r11)
            int r11 = bd0.C39755e.f106663g
            if (r11 == 0) goto L_0x008d
            if (r11 == r4) goto L_0x008a
            if (r11 == r3) goto L_0x0087
            int r11 = r1.f106675i
            goto L_0x008f
        L_0x0087:
            int r11 = r1.f106677k
            goto L_0x008f
        L_0x008a:
            int r11 = r1.f106676j
            goto L_0x008f
        L_0x008d:
            int r11 = r1.f106675i
        L_0x008f:
            r10.append(r11)
            java.lang.String r11 = "  count "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r11 = " rate "
            r10.append(r11)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r10)
            int r9 = r9.intValue()
            if (r9 <= r8) goto L_0x00b1
            goto L_0x0132
        L_0x00b1:
            if (r6 != 0) goto L_0x00b5
            goto L_0x0132
        L_0x00b5:
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r8)
            if (r8 != 0) goto L_0x00c1
            goto L_0x0132
        L_0x00c1:
            f40.C86709a0.m107528h()
            f40.o r8 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r8 = r8.mo121142i()
            r9 = 12290(0x3002, float:1.7222E-41)
            java.lang.Object r8 = r8.mo119684e(r9, r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r8, (int) r2)
            int r9 = r1.f106668b
            if (r9 != 0) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            if (r9 != r8) goto L_0x00e1
        L_0x00df:
            r8 = 1
            goto L_0x00e2
        L_0x00e1:
            r8 = 0
        L_0x00e2:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "fitSex "
            r9.append(r10)
            int r10 = r1.f106668b
            r9.append(r10)
            java.lang.String r10 = " "
            r9.append(r10)
            r9.append(r8)
            r9.append(r10)
            int r10 = r1.f106668b
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r9)
            if (r8 != 0) goto L_0x010b
            goto L_0x0132
        L_0x010b:
            boolean r8 = r1.mo62396c()
            if (r8 != 0) goto L_0x0112
            goto L_0x0132
        L_0x0112:
            java.util.Random r1 = r1.f106678l
            int r1 = r1.nextInt(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "luck "
            r8.append(r9)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)
            int r6 = r6 / r3
            if (r1 != r6) goto L_0x0132
        L_0x0130:
            r1 = 1
            goto L_0x0133
        L_0x0132:
            r1 = 0
        L_0x0133:
            r12.f296173n = r1
        L_0x0135:
            dj.c r1 = r12.f296176q
            dj.c r6 = p331dj.C75411c.SILK
            r7 = 16000(0x3e80, float:2.2421E-41)
            if (r1 != r6) goto L_0x0189
            k40.a r1 = f40.C86709a0.m107533q(r0)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r6 = "VoiceSamplingRate"
            java.lang.String r1 = r1.mo107405c(r6)
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r7)
            r12.f296171l = r6
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r6 = "VoiceRate"
            java.lang.String r0 = r0.mo107405c(r6)
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r7)
            r12.f296172m = r6
            java.lang.String r6 = "MicroMsg.MMAudioRecorder"
            java.lang.String r7 = "initMediaRecorder dynamicSample: %s sampleRate: %d dynamicEncoding: %s audioEncoding: %d"
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r2] = r1
            int r1 = r12.f296171l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8[r4] = r1
            r8[r3] = r0
            r0 = 3
            int r1 = r12.f296172m
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8[r0] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r8)
            goto L_0x01ce
        L_0x0189:
            boolean r0 = r12.f296173n
            r1 = 8000(0x1f40, float:1.121E-41)
            if (r0 == 0) goto L_0x0192
            r12.f296171l = r7
            goto L_0x0194
        L_0x0192:
            r12.f296171l = r1
        L_0x0194:
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.u1 r0 = r0.f251803a
            r3 = 27
            java.lang.Object r0 = r0.mo119660a(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r2)
            java.lang.String r3 = "MicroMsg.MMAudioRecorder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "sampleRate: "
            r6.append(r7)
            int r7 = r12.f296171l
            r6.append(r7)
            java.lang.String r7 = " notSupp16K: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            if (r0 != r4) goto L_0x01ce
            r12.f296171l = r1
        L_0x01ce:
            r12.f296160a = r2
            r12.f296161b = r5
            java.lang.Object r0 = r12.f296162c
            monitor-enter(r0)
            r12.f296165f = r5     // Catch:{ all -> 0x021e }
            r12.f296163d = r5     // Catch:{ all -> 0x021e }
            monitor-exit(r0)     // Catch:{ all -> 0x021e }
            r12.f296169j = r2
            java.lang.Object r0 = f296158x     // Catch:{ Exception -> 0x0201 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0201 }
            qh.f r1 = new qh.f     // Catch:{ all -> 0x01fe }
            int r3 = r12.f296171l     // Catch:{ all -> 0x01fe }
            r1.<init>(r3, r4, r2)     // Catch:{ all -> 0x01fe }
            r12.f296175p = r1     // Catch:{ all -> 0x01fe }
            r1.mo161904i(r4)     // Catch:{ all -> 0x01fe }
            qh.f r1 = r12.f296175p     // Catch:{ all -> 0x01fe }
            r2 = 120(0x78, float:1.68E-43)
            r1.mo161902g(r2)     // Catch:{ all -> 0x01fe }
            qh.f r1 = r12.f296175p     // Catch:{ all -> 0x01fe }
            qh.f$b r2 = r12.f296181v     // Catch:{ all -> 0x01fe }
            r1.f330245x = r2     // Catch:{ all -> 0x01fe }
            monitor-exit(r0)     // Catch:{ all -> 0x01fe }
            qh.e$f r0 = p375qh.C101182e.C101192f.INITIALIZING     // Catch:{ Exception -> 0x0201 }
            r12.f296177r = r0     // Catch:{ Exception -> 0x0201 }
            goto L_0x021d
        L_0x01fe:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01fe }
            throw r1     // Catch:{ Exception -> 0x0201 }
        L_0x0201:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L_0x0212
            java.lang.String r1 = "MicroMsg.MMAudioRecorder"
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x0219
        L_0x0212:
            java.lang.String r0 = "MicroMsg.MMAudioRecorder"
            java.lang.String r1 = "Unknown error occured while initializing recording"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x0219:
            qh.e$f r0 = p375qh.C101182e.C101192f.ERROR
            r12.f296177r = r0
        L_0x021d:
            return
        L_0x021e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x021e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p375qh.C101182e.mo140627b():void");
    }

    /* renamed from: c */
    public void mo140628c() {
        if (this.f296176q == C75411c.AMR) {
            MediaRecorder mediaRecorder = this.f296174o;
            if (mediaRecorder != null) {
                mediaRecorder.prepare();
            }
        } else if (this.f296177r != C101192f.INITIALIZING || this.f296161b == null) {
            this.f296177r = C101192f.ERROR;
            mo140629d();
        } else {
            this.f296177r = C101192f.READY;
        }
    }

    /* renamed from: d */
    public void mo140629d() {
        long currentTicks = Util.currentTicks();
        Log.m105925i("MicroMsg.MMAudioRecorder", "release curState:%s, pcmRecorder:%s", this.f296177r, this.f296175p);
        if (this.f296176q == C75411c.AMR) {
            MediaRecorder mediaRecorder = this.f296174o;
            if (mediaRecorder != null) {
                mediaRecorder.release();
                return;
            }
            return;
        }
        if (this.f296177r == C101192f.RECORDING) {
            mo140633h();
        }
        synchronized (f296159y) {
            this.f296170k = false;
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C101184b());
        Log.m105925i("MicroMsg.MMAudioRecorder", "release finished cost:%s", Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    /* renamed from: e */
    public void mo140630e(C101180a.C101181a aVar) {
        if (this.f296176q == C75411c.AMR) {
            MediaRecorder mediaRecorder = this.f296174o;
            if (mediaRecorder != null) {
                this.f296164e = aVar;
                mediaRecorder.setOnErrorListener(new C101183a());
            }
        } else if (this.f296177r == C101192f.INITIALIZING) {
            this.f296164e = aVar;
        } else {
            Log.m105920e("MicroMsg.MMAudioRecorder", "setOnErrorListener on wrong state");
        }
    }

    /* renamed from: f */
    public void mo140631f(String str) {
        if (this.f296176q == C75411c.AMR) {
            MediaRecorder mediaRecorder = this.f296174o;
            if (mediaRecorder != null) {
                mediaRecorder.setOutputFile(str);
                this.f296161b = str;
            }
        } else if (this.f296177r == C101192f.INITIALIZING) {
            this.f296161b = str;
            C110390f fVar = this.f296175p;
            if (fVar != null) {
                fVar.f330218E = str;
            }
        } else {
            Log.m105920e("MicroMsg.MMAudioRecorder", "set output path on wrong state");
            this.f296177r = C101192f.ERROR;
        }
    }

    /* renamed from: g */
    public void mo140632g() {
        if (this.f296176q == C75411c.AMR) {
            MediaRecorder mediaRecorder = this.f296174o;
            if (mediaRecorder != null) {
                mediaRecorder.start();
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.MMAudioRecorder", "Start record now state: " + this.f296177r + " recMode: " + this.f296176q);
        if (this.f296177r == C101192f.READY) {
            this.f296168i = System.currentTimeMillis();
            this.f296169j = 0;
            this.f296177r = C101192f.RECORDING;
            if (AccUtil.INSTANCE.isAccessibilityEnabled()) {
                this.f296179t.startTimer(0, 300);
            }
            synchronized (f296158x) {
                this.f296175p.mo161906k();
            }
        } else {
            C86709a0.m107528h();
            C86709a0.m107535s().f251803a.mo119664f(27, 1);
            Log.m105920e("MicroMsg.MMAudioRecorder", "start() called on illegal state");
            this.f296177r = C101192f.ERROR;
        }
        this.f296170k = false;
    }

    /* renamed from: h */
    public boolean mo140633h() {
        boolean z;
        if (this.f296176q == C75411c.AMR) {
            Log.m105925i("MicroMsg.MMAudioRecorder", "stop sysMediaRecorder: %s", this.f296174o);
            MediaRecorder mediaRecorder = this.f296174o;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
                this.f296174o.release();
                this.f296174o = null;
            }
            return true;
        }
        C76861g.C47263a aVar = new C76861g.C47263a();
        Log.m105924i("MicroMsg.MMAudioRecorder", "stop now state: " + this.f296177r);
        if (this.f296177r == C101192f.INITIALIZING) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(357, 53, 1, true);
            if (!this.f296182w) {
                nVar.idkeyStat(357, 54, 1, true);
            }
            this.f296182w = true;
        }
        if (this.f296177r != C101192f.RECORDING) {
            Log.m105920e("MicroMsg.MMAudioRecorder", "stop() called on illegal state");
            this.f296177r = C101192f.ERROR;
            return true;
        }
        synchronized (f296158x) {
            if (this.f296175p != null) {
                this.f296170k = true;
            } else {
                this.f296170k = false;
            }
        }
        long a = aVar.mo72288a();
        this.f296177r = C101192f.STOPPED;
        long a2 = aVar.mo72288a();
        synchronized (f296159y) {
            z = this.f296170k;
        }
        if (z) {
            ((C119157j) C119157j.f356862d).mo183875f(new C101188d());
        }
        synchronized (this.f296162c) {
            C102034c cVar = this.f296163d;
            if (cVar != null) {
                cVar.mo73541e();
            }
            C92249d dVar = this.f296165f;
            if (dVar != null) {
                dVar.getClass();
                Log.m105924i("MicroMsg.SpeexEncoderWorker", "stop ");
                new MMHandler(Looper.getMainLooper()).post(new C92247c(dVar));
            }
        }
        long milliSecondsToNow = Util.milliSecondsToNow(this.f296168i);
        Log.m105924i("MicroMsg.MMAudioRecorder", "toNow " + milliSecondsToNow + " startTickCnt: " + this.f296168i + " pcmDataReadedCnt: " + this.f296169j);
        if (milliSecondsToNow > 2000 && this.f296169j == 0) {
            C86709a0.m107528h();
            C86709a0.m107535s().f251803a.mo119664f(27, 1);
            Log.m105924i("MicroMsg.MMAudioRecorder", "16k not suppourt");
        }
        Log.m105924i("MicroMsg.MMAudioRecorder", "Wait Stop Time Media:" + a + " Read:" + a2 + " Thr:" + aVar.mo72288a());
        return false;
    }
}
