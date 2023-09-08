package m90;

import android.graphics.Point;
import android.opengl.EGLContext;
import android.util.Pair;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C106139e;
import com.tencent.p014mm.plugin.sight.base.C85456b;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import f72.C97842b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import i72.C108376c;
import i72.C108382h;
import j72.C108606e;
import j72.C108607f;
import j72.C108650z;
import j72.C98921l;
import java.util.LinkedList;
import java.util.Objects;
import l80.C109277d;
import n80.C109697b;
import n80.C109704e;
import p375qh.C89658b;
import p509eu.C86681f;
import r80.C110505a;
import r80.C110516d;
import r80.C12961e;
import rx3.C13598b0;
import s80.C110777a;
import w80.C102361h;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: m90.d */
public class C109557d implements C88716b {

    /* renamed from: a0 */
    public static final Object f327934a0 = new Object();

    /* renamed from: A */
    public String f327935A = "";

    /* renamed from: B */
    public boolean f327936B = false;

    /* renamed from: C */
    public int f327937C = 0;

    /* renamed from: D */
    public C108607f.C108608a f327938D;

    /* renamed from: E */
    public Runnable f327939E = null;

    /* renamed from: F */
    public boolean f327940F = false;

    /* renamed from: G */
    public boolean f327941G = false;

    /* renamed from: H */
    public long f327942H = 0;

    /* renamed from: I */
    public C86681f.C86682a f327943I = null;

    /* renamed from: J */
    public C110505a f327944J = null;

    /* renamed from: K */
    public EGLContext f327945K = null;

    /* renamed from: L */
    public int f327946L = -1;

    /* renamed from: M */
    public long f327947M = 0;

    /* renamed from: N */
    public long f327948N = 0;

    /* renamed from: O */
    public boolean f327949O = false;

    /* renamed from: P */
    public double f327950P = 0.0d;

    /* renamed from: Q */
    public long f327951Q = 0;

    /* renamed from: R */
    public long f327952R = 0;

    /* renamed from: S */
    public long f327953S = 0;

    /* renamed from: T */
    public boolean f327954T = false;

    /* renamed from: U */
    public int f327955U;

    /* renamed from: V */
    public int f327956V;

    /* renamed from: W */
    public boolean f327957W;

    /* renamed from: X */
    public C32224a f327958X;

    /* renamed from: Y */
    public Runnable f327959Y;

    /* renamed from: Z */
    public C108382h f327960Z;

    /* renamed from: a */
    public final Object f327961a = new Object();

    /* renamed from: b */
    public String f327962b;

    /* renamed from: c */
    public String f327963c = "";

    /* renamed from: d */
    public int f327964d = 0;

    /* renamed from: e */
    public float f327965e = 0.0f;

    /* renamed from: f */
    public int f327966f = -1;

    /* renamed from: g */
    public float f327967g = -1.0f;

    /* renamed from: h */
    public C109555a f327968h;

    /* renamed from: i */
    public C109697b f327969i;

    /* renamed from: j */
    public int f327970j = 480;

    /* renamed from: k */
    public int f327971k = 640;

    /* renamed from: l */
    public int f327972l = 1600000;

    /* renamed from: m */
    public int f327973m = 480;

    /* renamed from: n */
    public int f327974n = 640;

    /* renamed from: o */
    public C108650z f327975o;

    /* renamed from: p */
    public int f327976p;

    /* renamed from: q */
    public C106139e f327977q = null;

    /* renamed from: r */
    public boolean f327978r = false;

    /* renamed from: s */
    public String f327979s = null;

    /* renamed from: t */
    public String f327980t = null;

    /* renamed from: u */
    public String f327981u = null;

    /* renamed from: v */
    public C108376c f327982v = new C108376c("yuvRecorderWriteData");

    /* renamed from: w */
    public C108376c f327983w = new C108376c("frameCountCallback");

    /* renamed from: x */
    public VideoTransPara f327984x;

    /* renamed from: y */
    public boolean f327985y = false;

    /* renamed from: z */
    public boolean f327986z = false;

    /* renamed from: m90.d$a */
    public class C109558a implements Runnable {

        /* renamed from: m90.d$a$a */
        public class C109559a implements C32224a<C13598b0> {
            public C109559a() {
            }

            public Object invoke() {
                if (C109557d.this.f327969i == null) {
                    return null;
                }
                Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] final frame draw");
                C109557d.this.f327969i.mo160918b();
                C109555a aVar = C109557d.this.f327968h;
                if (aVar != null) {
                    aVar.mo138252a(new C109556c(this));
                }
                C109557d.this.f327944J.mo161976e();
                return null;
            }
        }

        public C109558a() {
        }

        public void run() {
            Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "frame to stop timeout");
            C109557d dVar = C109557d.this;
            dVar.f327975o.f325384a = C108607f.C108610c.WaitStop;
            C110505a aVar = dVar.f327944J;
            C109559a aVar2 = new C109559a();
            aVar.getClass();
            aVar.mo161975d(new C12961e(aVar2));
        }
    }

    /* renamed from: m90.d$b */
    public class C109560b implements C108382h {
        public C109560b() {
        }

        /* renamed from: f */
        public boolean mo157927f(byte[] bArr) {
            C109557d dVar = C109557d.this;
            if (!dVar.mo160783B() || bArr == null || bArr.length == 0) {
                return false;
            }
            dVar.f327944J.mo161977f(bArr, ((Long) dVar.mo160788G().first).longValue(), new C109566e(dVar));
            return false;
        }
    }

    /* renamed from: m90.d$c */
    public class C109561c implements C32226l<C109697b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f327990d;

        public C109561c(long j) {
            this.f327990d = j;
        }

        public Object invoke(Object obj) {
            C109697b bVar = (C109697b) obj;
            C115669n.INSTANCE.idkeyStat(985, 159, 1, false);
            bVar.f328347d = new C109567f(this);
            bVar.f328348e = new C109568g(this);
            return null;
        }
    }

    /* renamed from: m90.d$d */
    public class C109562d implements C32226l<Boolean, C13598b0> {
        public C109562d(C109557d dVar) {
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecGLInitFailed");
                C115669n.INSTANCE.mo175913w(985, 15, 1);
            }
            Object obj2 = C109557d.f327934a0;
            synchronized (obj2) {
                try {
                    obj2.notifyAll();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.Media.MediaCodecMP4MuxRecorder", e, "[" + hashCode() + "] initSurfaceLock notify error", new Object[0]);
                }
            }
            return null;
        }
    }

    /* renamed from: m90.d$e */
    public class C109563e implements C32226l<Boolean, C13598b0> {
        public C109563e() {
        }

        public Object invoke(Object obj) {
            Boolean bool = (Boolean) obj;
            C32224a aVar = C109557d.this.f327958X;
            if (aVar != null) {
                aVar.invoke();
            }
            C109697b bVar = C109557d.this.f327969i;
            if (bVar != null) {
                bVar.mo160917a(0);
            }
            C109557d dVar = C109557d.this;
            if (dVar.f327969i == null || dVar.f327975o.f325384a != C108607f.C108610c.WaitStop) {
                return null;
            }
            Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] final frame draw");
            ((C119157j) C119157j.f356862d).mo183894y("record_stop_timeout");
            C109557d.this.f327969i.mo160918b();
            C109555a aVar2 = C109557d.this.f327968h;
            if (aVar2 != null) {
                aVar2.mo138252a(new C109569h(this));
            }
            C109557d.this.f327944J.mo161976e();
            return null;
        }
    }

    /* renamed from: m90.d$f */
    public class C109564f implements C108606e.C98917a {
        public C109564f() {
        }

        /* renamed from: a */
        public void mo138250a() {
            Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] onPcmReady");
            C108650z zVar = C109557d.this.f327975o;
            if (zVar.f325384a != C108607f.C108610c.Initialized) {
                Log.m105928w("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] not MediaStatus.Initialized, maybe canceled by user");
                return;
            }
            zVar.mo159676a(C108607f.C108610c.Start);
        }
    }

    /* renamed from: m90.d$g */
    public class C109565g implements C108606e.C98918b {
        public C109565g(C109557d dVar) {
        }

        /* renamed from: a */
        public void mo138251a() {
            Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] aac stop finish");
        }
    }

    public C109557d(VideoTransPara videoTransPara, C110777a aVar, EGLContext eGLContext, int i, C86681f.C86682a aVar2) {
        new LinkedList();
        this.f327955U = 0;
        this.f327956V = 0;
        this.f327957W = false;
        this.f327959Y = new C109558a();
        this.f327960Z = new C109560b();
        mo160782A(videoTransPara);
        this.f327943I = aVar2;
        this.f327945K = eGLContext;
        this.f327944J = new C110505a(aVar);
        this.f327946L = i;
        Log.printInfoStack("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] textureId : " + i, new Object[0]);
    }

    /* renamed from: A */
    public final void mo160782A(VideoTransPara videoTransPara) {
        this.f327942H = 0;
        this.f327984x = videoTransPara;
        this.f327970j = videoTransPara.f267166d;
        this.f327971k = videoTransPara.f267167e;
        this.f327975o = new C108650z();
        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecCapture");
        C102361h.f301460b = -1;
        C115669n.INSTANCE.mo175913w(985, 13, 1);
        Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] create MediaCodecMP4MuxRecorder, targetWidth: %s, targetHeight: %s", Integer.valueOf(this.f327970j), Integer.valueOf(this.f327971k));
    }

    /* renamed from: B */
    public boolean mo160783B() {
        C108607f.C108610c cVar = C108607f.C108610c.PrepareStop;
        C108650z zVar = this.f327975o;
        C108607f.C108610c cVar2 = zVar.f325384a;
        if (cVar2 != C108607f.C108610c.Start && cVar2 != cVar) {
            return false;
        }
        if (cVar2 == cVar) {
            zVar.f325384a = C108607f.C108610c.WaitStop;
            Log.printInfoStack("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] forward one more frame", new Object[0]);
        }
        C109555a aVar = this.f327968h;
        if (aVar != null) {
            aVar.f325202j = true;
        }
        this.f327983w.mo158893a(1);
        this.f327982v.mo158893a(1);
        return true;
    }

    /* renamed from: C */
    public final boolean mo160784C(int i) {
        C106139e eVar;
        this.f327957W = false;
        long currentTicks = Util.currentTicks();
        VideoTransPara videoTransPara = this.f327984x;
        this.f327972l = videoTransPara.f267169g;
        C109277d dVar = new C109277d(videoTransPara.f267163J == 1);
        if (dVar.f327166i) {
            Log.m105920e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] encodeConfig  InitError");
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecYUVInitError");
            C115669n.INSTANCE.mo175913w(985, 26, 1);
            return false;
        }
        boolean b = C87412m.m108589b(dVar.f327171n, "video/hevc");
        this.f327978r = b;
        int i2 = this.f327970j;
        int i3 = this.f327971k;
        int i4 = this.f327972l;
        float f = (float) this.f327984x.f267168f;
        boolean a = C85456b.m105448a(false, b);
        synchronized (C106139e.f316166c) {
            eVar = new C106139e(SightVideoJNI.initDataBufferForCapture(i2, i3, false, i4, f, -1, -1, -1, -1.0f, false, false, a, C85456b.m105449b()));
        }
        this.f327977q = eVar;
        Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] init, bufId: %s", this.f327977q);
        C106139e eVar2 = this.f327977q;
        if (eVar2 != null) {
            if (eVar2.f316167a >= 0) {
                this.f327976p = i;
                this.f327971k = C97842b.m126284a(this.f327971k);
                this.f327970j = C97842b.m126284a(this.f327970j);
                if (this.f327978r && dVar.f327171n.equals("video/hevc")) {
                    Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markCaptureUseHwHevc");
                    C115669n.INSTANCE.idkeyStat(985, 181, 1, false);
                }
                Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] mTargetRate " + this.f327972l + "  videoParams.fps: " + this.f327984x.f267168f + " mTargetHeight:" + this.f327971k + " mTargetWidth:" + this.f327970j + ", minQP:" + this.f327984x.f267157D + ", maxQP:" + this.f327984x.f267158E);
                dVar.f327161d = this.f327972l;
                VideoTransPara videoTransPara2 = this.f327984x;
                int i5 = videoTransPara2.f267168f;
                dVar.f327162e = i5;
                dVar.f327160c = this.f327971k;
                dVar.f327159b = this.f327970j;
                dVar.f327169l = videoTransPara2.f267158E;
                dVar.f327168k = videoTransPara2.f267157D;
                try {
                    C109704e eVar3 = new C109704e(dVar, new C109561c((long) (1000 / i5)));
                    this.f327969i = eVar3;
                    this.f327944J.mo161974c(eVar3.mo160919c(), this.f327945K, false, new C109562d(this));
                    Object obj = f327934a0;
                    synchronized (obj) {
                        try {
                            obj.wait(500);
                        } catch (Exception e) {
                            Exception exc = e;
                            Log.printErrStackTrace("MicroMsg.Media.MediaCodecMP4MuxRecorder", exc, "[" + hashCode() + "] initSurfaceLock wait error", new Object[0]);
                        }
                    }
                    this.f327944J.f330442f = new C109563e();
                    mo160786E();
                    VideoTransPara videoTransPara3 = this.f327984x;
                    C109555a aVar = new C109555a(videoTransPara3.f267174o, videoTransPara3.f267173n, videoTransPara3.f267175p, C85456b.m105448a(false, this.f327978r));
                    this.f327968h = aVar;
                    aVar.f325203k = this.f327940F;
                    int n = aVar.mo160781n(this.f327977q, C94555d.m119565a(this.f327963c));
                    Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] initImpl used %sms, ret:%s", Long.valueOf(Util.ticksToNow(currentTicks)), Integer.valueOf(n));
                    if (n == 0) {
                        return true;
                    }
                    Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecAACRecorderInitFailed");
                    C115669n.INSTANCE.mo175913w(985, 16, 1);
                    return false;
                } catch (Exception e2) {
                    mo160785D();
                    Log.printErrStackTrace("MicroMsg.Media.MediaCodecMP4MuxRecorder", e2, "[" + hashCode() + "] init encoder error", new Object[0]);
                    MultiProcessMMKV.getSingleDefault().putBoolean("mediacodec_create_error", true);
                    Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecInitFailed");
                    C115669n.INSTANCE.mo175913w(985, 14, 1);
                    return false;
                }
            }
        }
        Log.m105920e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] init failed!");
        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecInitFailed");
        C115669n.INSTANCE.mo175913w(985, 14, 1);
        return false;
    }

    /* renamed from: D */
    public final void mo160785D() {
        if (!this.f327957W) {
            this.f327957W = true;
            try {
                Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start release recorder");
                this.f327939E = null;
                this.f327975o.mo159676a(C108607f.C108610c.WaitStop);
                synchronized (this.f327961a) {
                    Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start release videoEncoder");
                    C109697b bVar = this.f327969i;
                    if (bVar != null) {
                        bVar.mo160918b();
                        this.f327969i.mo160922f();
                        this.f327969i = null;
                        C115669n.INSTANCE.idkeyStat(985, 160, 1, false);
                    }
                    Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] end release videoEncoder");
                }
                C109555a aVar = this.f327968h;
                if (aVar != null) {
                    aVar.mo138252a(new C109565g(this));
                    this.f327968h.clear();
                    this.f327968h = null;
                }
                Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] release buf-id ? %s", this.f327977q);
                this.f327977q.mo151875c();
                this.f327975o.mo159676a(C108607f.C108610c.Stop);
                C110505a aVar2 = this.f327944J;
                if (aVar2 != null) {
                    aVar2.mo161976e();
                }
                this.f327947M = 0;
                this.f327948N = 0;
                this.f327950P = 0.0d;
                this.f327951Q = 0;
                this.f327952R = 0;
                this.f327953S = 0;
                this.f327949O = false;
                this.f327985y = false;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Media.MediaCodecMP4MuxRecorder", e, "[" + hashCode() + "] clear error: %s", e.getMessage());
            }
        }
    }

    /* renamed from: E */
    public final void mo160786E() {
        int i = this.f327970j;
        int i2 = this.f327971k;
        this.f327944J.f330437a.mo159590t(i, i2);
        C110505a aVar = this.f327944J;
        aVar.f330437a.mo159589r(this.f327976p);
        C110505a aVar2 = this.f327944J;
        aVar2.f330437a.mo159591u(this.f327973m, this.f327974n);
        Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] outputWidth: %s, outputHeight: %s, cameraPreviewWidth: %s, cameraPreviewHeight: %s, getDataRotate: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f327973m), Integer.valueOf(this.f327974n), Integer.valueOf(this.f327976p));
    }

    /* renamed from: F */
    public final void mo160787F(boolean z, boolean z2, boolean z3, long j) {
        if (this.f327946L < 0) {
            return;
        }
        if (mo160783B() || !z2) {
            Pair<Long, Boolean> G = mo160788G();
            if (((Boolean) G.second).booleanValue()) {
                C110505a aVar = this.f327944J;
                int i = this.f327946L;
                long longValue = ((Long) G.first).longValue();
                aVar.getClass();
                aVar.mo161975d(new C110516d(aVar, i, z3, j, z, longValue));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ca  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<java.lang.Long, java.lang.Boolean> mo160788G() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f327952R
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0024
            long r1 = java.lang.System.nanoTime()
            long r5 = r0.f327952R
            long r1 = r1 - r5
            long r5 = r0.f327951Q
            long r5 = r5 + r1
            r0.f327951Q = r5
            long r5 = r0.f327953S
            float r5 = (float) r5
            float r1 = (float) r1
            r2 = 1232348160(0x49742400, float:1000000.0)
            float r1 = r1 / r2
            float r5 = r5 + r1
            long r1 = (long) r5
            r0.f327953S = r1
            r0.f327952R = r3
        L_0x0024:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            int r5 = r17.hashCode()
            r1.append(r5)
            java.lang.String r5 = "] updateCurrentFrameDts, lastPausePtsDiff:%s"
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            long r7 = r0.f327951Q
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 0
            r6[r8] = r7
            java.lang.String r7 = "MicroMsg.Media.MediaCodecMP4MuxRecorder"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r1, r6)
            long r9 = r0.f327948N
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0065
            long r9 = java.lang.System.nanoTime()
            long r11 = r0.f327948N
            long r9 = r9 - r11
            long r11 = r0.f327947M
            long r9 = r9 + r11
            long r11 = r0.f327951Q
            long r9 = r9 - r11
            r0.f327951Q = r3
            goto L_0x0066
        L_0x0065:
            r9 = r3
        L_0x0066:
            boolean r1 = r0.f327949O
            if (r1 == 0) goto L_0x0094
            j72.z r1 = r0.f327975o
            j72.f$c r1 = r1.f325384a
            j72.f$c r6 = j72.C108607f.C108610c.WaitStop
            if (r1 == r6) goto L_0x008b
            long r11 = r0.f327947M
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x008b
            long r11 = r9 - r11
            double r11 = (double) r11
            double r13 = r0.f327950P
            r15 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r13 = r13 * r15
            int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r1 < 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r1 = 0
            goto L_0x009d
        L_0x008b:
            r0.f327947M = r9
            long r11 = java.lang.System.nanoTime()
            r0.f327948N = r11
            goto L_0x009c
        L_0x0094:
            r0.f327947M = r9
            long r11 = java.lang.System.nanoTime()
            r0.f327948N = r11
        L_0x009c:
            r1 = 1
        L_0x009d:
            r11 = 1000(0x3e8, double:4.94E-321)
            long r13 = r9 / r11
            int r6 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x00c2
            int r3 = r0.f327955U
            int r3 = r3 + r5
            r0.f327955U = r3
            com.tencent.mm.plugin.sight.base.e r3 = r0.f327977q
            r4 = 1148846080(0x447a0000, float:1000.0)
            com.tencent.mm.modelcontrol.VideoTransPara r6 = r0.f327984x
            int r6 = r6.f267168f
            float r6 = (float) r6
            float r4 = r4 / r6
            int r4 = java.lang.Math.round(r4)
            int r4 = r4 * -1
            r15 = r9
            long r8 = (long) r4
            long r8 = r8 * r11
            r3.mo151877f(r8)
            goto L_0x00c3
        L_0x00c2:
            r15 = r9
        L_0x00c3:
            int r3 = r0.f327955U
            int r3 = r3 + r5
            r0.f327955U = r3
            if (r1 == 0) goto L_0x00cf
            com.tencent.mm.plugin.sight.base.e r3 = r0.f327977q
            r3.mo151877f(r13)
        L_0x00cf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            int r2 = r17.hashCode()
            r3.append(r2)
            java.lang.String r2 = "] updateCurrentFrameDts ptsNs:%s, dtsMs:%s, lastTexturePts:%s, lastTextureNanoTime:%s, accumulatePauseTime:%s, needDrawFrame:%s"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Long r4 = java.lang.Long.valueOf(r15)
            r6 = 0
            r3[r6] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r3[r5] = r4
            r4 = 2
            long r5 = r0.f327947M
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3[r4] = r5
            r4 = 3
            long r5 = r0.f327948N
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3[r4] = r5
            r4 = 4
            long r5 = r0.f327953S
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3[r4] = r5
            r4 = 5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r3[r4] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r2, r3)
            android.util.Pair r2 = new android.util.Pair
            java.lang.Long r3 = java.lang.Long.valueOf(r15)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.<init>(r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m90.C109557d.mo160788G():android.util.Pair");
    }

    /* renamed from: a */
    public String mo159600a() {
        return this.f327962b;
    }

    /* renamed from: b */
    public String mo159601b() {
        return this.f327980t;
    }

    /* renamed from: c */
    public float mo159602c() {
        return this.f327965e;
    }

    public void cancel() {
        Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] cancel");
        mo160785D();
    }

    public void clear() {
        Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] clear");
        mo160785D();
    }

    /* renamed from: d */
    public void mo159605d(float f) {
        Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] overrideFps: %s", Float.valueOf(f));
        this.f327967g = f;
    }

    /* renamed from: e */
    public void mo159606e(C108607f.C108608a aVar) {
        this.f327938D = aVar;
    }

    /* renamed from: f */
    public boolean mo159607f() {
        return this.f327936B;
    }

    /* renamed from: g */
    public boolean mo159608g() {
        return false;
    }

    public String getFilePath() {
        return this.f327963c;
    }

    public C108382h getFrameDataCallback() {
        return this.f327960Z;
    }

    public String getMd5() {
        return Util.nullAs(this.f327935A, "");
    }

    /* renamed from: h */
    public void mo123149h() {
        mo160787F(true, true, false, 0);
    }

    /* renamed from: i */
    public void mo159612i(int i, int i2, int i3, int i4) {
        Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        if (i3 % 16 != 0) {
            i3 = C97842b.m126284a(i3);
        }
        if (i4 % 16 != 0) {
            i4 = C97842b.m126284a(i4);
        }
        Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] setSize, after align, targetWidth: %d, targetHeight: %d", Integer.valueOf(i3), Integer.valueOf(i4));
        this.f327973m = i;
        this.f327974n = i2;
        C98921l.f289964d.mo126905m(Integer.valueOf(((i * i2) * 3) / 2));
    }

    /* renamed from: j */
    public C108607f.C108610c mo159613j() {
        return this.f327975o.f325384a;
    }

    /* renamed from: k */
    public int mo159614k() {
        return Math.round(((float) this.f327964d) / 1000.0f);
    }

    /* renamed from: l */
    public void mo123150l(boolean z) {
        this.f327949O = z;
    }

    /* renamed from: m */
    public void mo159615m(String str) {
        this.f327963c = str;
    }

    /* renamed from: n */
    public void mo159616n(Runnable runnable) {
        this.f327939E = runnable;
        Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] !!!!!stop, stopCallback: %s !!!", runnable);
        if (this.f327969i == null || (this.f327968h == null && !this.f327941G)) {
            Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] error, yuvRecorder or aacRecorder is null");
            if (runnable != null) {
                MMHandlerThread.postToMainThread(runnable);
                return;
            }
            return;
        }
        C108650z zVar = this.f327975o;
        if (zVar == null || zVar.f325384a != C108607f.C108610c.Stop) {
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecStartWait");
            C102361h.f301460b = Util.currentTicks();
            if (this.f327975o != null) {
                C119179t tVar = C119157j.f356862d;
                Runnable runnable2 = this.f327959Y;
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                Objects.requireNonNull(runnable2);
                jVar.mo183889t(runnable2, 1500, "record_stop_timeout");
                this.f327975o.mo159676a(C108607f.C108610c.PrepareStop);
            }
            if (this.f327952R > 0) {
                this.f327953S = (long) (((float) this.f327953S) + (((float) (System.nanoTime() - this.f327952R)) / 1000000.0f));
            }
            this.f327964d = (int) this.f327969i.mo160920d();
            Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] stop, mDurationMS:%s, accumulatePauseTime:%s", Integer.valueOf(this.f327964d), Long.valueOf(this.f327953S));
            long j = this.f327953S;
            if (j > 0) {
                this.f327964d = (int) (((long) this.f327964d) - j);
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] stop, already in stop videoRecordStatus");
        C109555a aVar = this.f327968h;
        if (aVar != null) {
            aVar.clear();
        }
        if (runnable != null) {
            MMHandlerThread.postToMainThread(runnable);
        }
    }

    /* renamed from: o */
    public void mo159617o(int i) {
        Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] overrideDurationMs: %s", Integer.valueOf(i));
        this.f327966f = i;
    }

    /* renamed from: p */
    public boolean mo159618p(int i) {
        if (this.f327985y) {
            return true;
        }
        Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] preInit, cameraOrientation %d", Integer.valueOf(i));
        boolean C = mo160784C(i);
        this.f327985y = true;
        Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] initImpl result: %s", Boolean.valueOf(C));
        return C;
    }

    public void pause() {
        Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] pause");
        C108650z zVar = this.f327975o;
        if (zVar != null && zVar.f325384a == C108607f.C108610c.Start) {
            zVar.mo159676a(C108607f.C108610c.Pause);
            C109555a aVar = this.f327968h;
            if (aVar != null) {
                aVar.f325202j = false;
                aVar.f325185B = true;
                long currentTicks = Util.currentTicks();
                aVar.f325187D = currentTicks;
                Log.m105925i("MicroMsg.MMSightAACMediaCodecRecorder", "pause, time:%s", Long.valueOf(currentTicks));
            }
            this.f327952R = System.nanoTime();
        }
    }

    /* renamed from: q */
    public void mo159620q(int i, int i2, int i3) {
        Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] resume, cameraOrientation: %s, cameraPreviewWidth:%s, cameraPreviewHeight:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        this.f327976p = i;
        this.f327973m = i2;
        this.f327974n = i3;
        this.f327944J.f330437a.mo159589r(i);
        mo160786E();
        C108650z zVar = this.f327975o;
        if (zVar != null && zVar.f325384a == C108607f.C108610c.Pause) {
            zVar.mo159676a(C108607f.C108610c.Start);
            C109555a aVar = this.f327968h;
            if (aVar != null) {
                Log.m105925i("MicroMsg.MMSightAACMediaCodecRecorder", "resume, pauseTime:%s", Long.valueOf(aVar.f325187D));
                aVar.f325185B = false;
                long j = aVar.f325187D;
                if (j > 0) {
                    aVar.f325186C += Util.ticksToNow(j);
                }
                aVar.f325187D = 0;
                aVar.f325202j = true;
            }
        }
    }

    /* renamed from: r */
    public Point mo159621r() {
        return new Point(this.f327973m, this.f327974n);
    }

    public void reset() {
        Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] reset");
        mo160785D();
    }

    /* renamed from: s */
    public long mo159623s() {
        C109697b bVar = this.f327969i;
        if (bVar != null) {
            return bVar.mo160920d();
        }
        return 0;
    }

    public void setMirror(boolean z) {
        this.f327944J.f330437a.mo159588m(z);
    }

    public void setMute(boolean z) {
        this.f327941G = z;
    }

    /* renamed from: t */
    public C89658b mo159626t() {
        C109555a aVar = this.f327968h;
        if (aVar != null) {
            return aVar.f325192I;
        }
        return null;
    }

    /* renamed from: u */
    public String mo159627u() {
        return this.f327981u;
    }

    /* renamed from: v */
    public void mo159628v(String str) {
        this.f327981u = str;
    }

    /* renamed from: w */
    public void mo159629w(boolean z) {
        this.f327940F = z;
    }

    /* renamed from: x */
    public void mo159630x(String str) {
        this.f327980t = str;
    }

    /* renamed from: y */
    public int mo159631y() {
        return this.f327976p;
    }

    /* renamed from: z */
    public int mo159632z(int i, boolean z, int i2) {
        C109555a aVar;
        Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start, cameraOrientation: %s, isLandscape: %s, degree: %s", Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2));
        this.f327982v.mo158896d();
        this.f327964d = 0;
        this.f327947M = 0;
        this.f327986z = true;
        this.f327983w.mo158896d();
        this.f327936B = z;
        this.f327937C = i2;
        this.f327947M = 0;
        this.f327948N = 0;
        this.f327950P = 0.0d;
        this.f327951Q = 0;
        this.f327952R = 0;
        this.f327953S = 0;
        this.f327950P = (double) (1000.0f / ((float) this.f327984x.f267168f));
        this.f327975o.mo159676a(C108607f.C108610c.WaitStart);
        Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start, checkDropFrameByPts: %s, perFrmaeDuration:%s", Boolean.valueOf(this.f327949O), Double.valueOf(this.f327950P));
        if (Util.isNullOrNil(this.f327963c)) {
            Log.m105920e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start error, mCurRecordPath is null!!");
            return -1;
        }
        try {
            this.f327962b = C86013q1.m106457r(this.f327963c);
            String s = C86013q1.m106458s(this.f327963c);
            if (!s.endsWith("/")) {
                s = s + "/";
            }
            this.f327979s = s + hashCode() + "tempRotate.mp4";
            Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] tempRotateFilePath:" + this.f327979s);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] retrieve file name error: %s", e.getMessage());
        }
        Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] mCurRecordPath: %s, tempRotateFilePath: %s", this.f327963c, this.f327979s);
        this.f327976p = i;
        mo160786E();
        if (!this.f327985y) {
            mo160784C(i);
            this.f327985y = true;
        }
        mo160786E();
        if (this.f327941G || this.f327940F || (aVar = this.f327968h) == null) {
            Log.m105924i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start yuvRecorder with mute");
            this.f327975o.mo159676a(C108607f.C108610c.Start);
            return 0;
        }
        int f = aVar.mo138258f(new C109564f());
        Log.m105925i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start aacRecorder ret: %s", Integer.valueOf(f));
        if (f != 0) {
            this.f327975o.mo159676a(C108607f.C108610c.Error);
        } else {
            this.f327975o.mo159676a(C108607f.C108610c.Initialized);
        }
        return f;
    }

    public C109557d(VideoTransPara videoTransPara, C110777a aVar, EGLContext eGLContext, int i) {
        new LinkedList();
        this.f327955U = 0;
        this.f327956V = 0;
        this.f327957W = false;
        this.f327959Y = new C109558a();
        this.f327960Z = new C109560b();
        mo160782A(videoTransPara);
        this.f327945K = eGLContext;
        this.f327944J = new C110505a(aVar);
        this.f327946L = i;
        Log.printInfoStack("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] textureId : " + i, new Object[0]);
    }
}
