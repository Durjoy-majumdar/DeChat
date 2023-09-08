package m90;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C106139e;
import com.tencent.p014mm.plugin.sight.base.C85456b;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.coremedia.TimeUtil;
import f72.C97842b;
import fy3.C32226l;
import i72.C108376c;
import i72.C108382h;
import i72.C108389l;
import j72.C108606e;
import j72.C108607f;
import j72.C108632q;
import j72.C108650z;
import j72.C98921l;
import java.io.IOException;
import n80.C109715i;
import p375qh.C89658b;
import p80.C110194c;
import r80.C110505a;
import r80.C110512b;
import r80.C110516d;
import rx3.C13598b0;
import s80.C110777a;
import w80.C111742d;

/* renamed from: m90.k */
public class C109572k implements C88716b {

    /* renamed from: A */
    public boolean f327998A = false;

    /* renamed from: B */
    public C108607f.C108608a f327999B;

    /* renamed from: C */
    public Runnable f328000C = null;

    /* renamed from: D */
    public boolean f328001D = false;

    /* renamed from: E */
    public boolean f328002E = false;

    /* renamed from: F */
    public C110505a f328003F = null;

    /* renamed from: G */
    public EGLContext f328004G = null;

    /* renamed from: H */
    public C110777a f328005H = null;

    /* renamed from: I */
    public int f328006I = -1;

    /* renamed from: J */
    public boolean f328007J = false;

    /* renamed from: K */
    public C108382h f328008K = new C109573a();

    /* renamed from: a */
    public final Object f328009a = new Object();

    /* renamed from: b */
    public String f328010b;

    /* renamed from: c */
    public String f328011c = "";

    /* renamed from: d */
    public int f328012d = 0;

    /* renamed from: e */
    public float f328013e = 0.0f;

    /* renamed from: f */
    public int f328014f = -1;

    /* renamed from: g */
    public float f328015g = -1.0f;

    /* renamed from: h */
    public C109555a f328016h;

    /* renamed from: i */
    public C109715i f328017i;

    /* renamed from: j */
    public long f328018j;

    /* renamed from: k */
    public int f328019k = 480;

    /* renamed from: l */
    public int f328020l = 640;

    /* renamed from: m */
    public int f328021m = 1600000;

    /* renamed from: n */
    public int f328022n = 480;

    /* renamed from: o */
    public int f328023o = 640;

    /* renamed from: p */
    public C108650z f328024p;

    /* renamed from: q */
    public int f328025q;

    /* renamed from: r */
    public C106139e f328026r = null;

    /* renamed from: s */
    public String f328027s = null;

    /* renamed from: t */
    public String f328028t = null;

    /* renamed from: u */
    public String f328029u = null;

    /* renamed from: v */
    public C108376c f328030v = new C108376c("yuvRecorderWriteData");

    /* renamed from: w */
    public C108376c f328031w = new C108376c("frameCountCallback");

    /* renamed from: x */
    public VideoTransPara f328032x;

    /* renamed from: y */
    public boolean f328033y = false;

    /* renamed from: z */
    public String f328034z = "";

    /* renamed from: m90.k$a */
    public class C109573a implements C108382h {

        /* renamed from: m90.k$a$a */
        public class C109574a implements C32226l<byte[], C13598b0> {
            public C109574a(C109573a aVar) {
            }

            public Object invoke(Object obj) {
                C98921l.f289964d.mo138260o((byte[]) obj);
                return null;
            }
        }

        public C109573a() {
        }

        /* renamed from: f */
        public boolean mo157927f(byte[] bArr) {
            C108607f.C108610c cVar = C108607f.C108610c.PrepareStop;
            if (bArr == null || bArr.length <= 0) {
                Log.m105920e("MicroMsg.Media.X264MP4MuxRecorder", "preview callback data is null");
                return false;
            }
            C108650z zVar = C109572k.this.f328024p;
            C108607f.C108610c cVar2 = zVar.f325384a;
            if (cVar2 != C108607f.C108610c.Start && cVar2 != cVar) {
                return false;
            }
            if (cVar2 == cVar) {
                zVar.f325384a = C108607f.C108610c.WaitStop;
                Log.m105926v("MicroMsg.Media.X264MP4MuxRecorder", "forward one more frame");
            }
            C109572k.this.f328031w.mo158893a(1);
            C109572k kVar = C109572k.this;
            C109555a aVar = kVar.f328016h;
            if (aVar != null) {
                aVar.f325202j = true;
            }
            kVar.f328003F.mo161977f(bArr, System.nanoTime(), new C109574a(this));
            C109572k.this.f328030v.mo158893a(1);
            return true;
        }
    }

    /* renamed from: m90.k$b */
    public class C109575b implements C32226l<Boolean, C13598b0> {
        public C109575b(C109572k kVar) {
        }

        public Object invoke(Object obj) {
            Boolean bool = (Boolean) obj;
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markX264GLInitFailed");
            C115669n.INSTANCE.mo175913w(985, 32, 1);
            return null;
        }
    }

    /* renamed from: m90.k$c */
    public class C109576c implements C32226l<Boolean, C13598b0> {
        public C109576c() {
        }

        public Object invoke(Object obj) {
            Boolean bool = (Boolean) obj;
            synchronized (C109572k.this.f328009a) {
                if (C109572k.this.f328017i != null) {
                    GLES20.glFinish();
                    C109572k kVar = C109572k.this;
                    kVar.f328017i.mo160944b(Util.ticksToNow(kVar.f328018j) * TimeUtil.SECOND_TO_US);
                }
                C109572k kVar2 = C109572k.this;
                C109715i iVar = kVar2.f328017i;
                if (iVar != null && kVar2.f328024p.f325384a == C108607f.C108610c.WaitStop) {
                    iVar.mo160946d();
                    C109555a aVar = C109572k.this.f328016h;
                    if (aVar != null) {
                        aVar.mo138252a(new C109579l(this));
                    }
                    C109572k.this.f328003F.mo161976e();
                    C109572k kVar3 = C109572k.this;
                    kVar3.getClass();
                    Log.printInfoStack("MicroMsg.Media.X264MP4MuxRecorder", "stopImpl", new Object[0]);
                    ThreadPool.post(new C109580m(kVar3), "X264MP4MuxRecorder_stop");
                    C108650z zVar = C109572k.this.f328024p;
                    if (zVar != null) {
                        zVar.mo159676a(C108607f.C108610c.Stop);
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: m90.k$d */
    public class C109577d implements C108606e.C98917a {
        public C109577d() {
        }

        /* renamed from: a */
        public void mo138250a() {
            Log.m105924i("MicroMsg.Media.X264MP4MuxRecorder", "onPcmReady");
            C108650z zVar = C109572k.this.f328024p;
            if (zVar.f325384a != C108607f.C108610c.Initialized) {
                Log.m105928w("MicroMsg.Media.X264MP4MuxRecorder", "not MediaStatus.Initialized, maybe canceled by user");
            } else {
                zVar.mo159676a(C108607f.C108610c.Start);
            }
        }
    }

    /* renamed from: m90.k$e */
    public class C109578e implements C108606e.C98918b {
        public C109578e(C109572k kVar) {
        }

        /* renamed from: a */
        public void mo138251a() {
            Log.m105924i("MicroMsg.Media.X264MP4MuxRecorder", "aac stop finish");
        }
    }

    public C109572k(VideoTransPara videoTransPara, C110777a aVar, EGLContext eGLContext, int i) {
        this.f328032x = videoTransPara;
        this.f328019k = videoTransPara.f267166d;
        this.f328020l = videoTransPara.f267167e;
        this.f328024p = new C108650z();
        Log.m105919d("MicroMsg.Media.X264MP4MuxRecorder", "create X264MP4MuxRecorder, targetWidth: %s, targetHeight: %s", Integer.valueOf(this.f328019k), Integer.valueOf(this.f328020l));
        this.f328004G = eGLContext;
        this.f328005H = aVar;
        this.f328006I = i;
        this.f328003F = new C110505a(aVar);
        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markX264Capture");
        C115669n.INSTANCE.mo175913w(985, 30, 1);
    }

    /* renamed from: A */
    public static boolean m148829A(C109572k kVar) {
        C109572k kVar2 = kVar;
        kVar.getClass();
        long currentTicks = Util.currentTicks();
        C109715i iVar = kVar2.f328017i;
        if (iVar == null) {
            return false;
        }
        int i = iVar.f328411o;
        kVar2.f328013e = (((float) i) * 1000.0f) / ((float) kVar2.f328012d);
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "stop, frameCount: %s, fps: %s, duration: %s, file: %s handlerrunning %s, overrideDurationMs: %s, overrideFps: %s", Integer.valueOf(i), Float.valueOf(kVar2.f328013e), Integer.valueOf(kVar2.f328012d), kVar2.f328011c, Long.valueOf(Util.ticksToNow(currentTicks)), Integer.valueOf(kVar2.f328014f), Float.valueOf(kVar2.f328015g));
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "frameCountCallback %s", kVar2.f328031w.mo158895c());
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "yuvRecorderWriteDataCallback %s", kVar2.f328030v.mo158895c());
        String str = null;
        if (CaptureMMProxy.getInstance() != null) {
            str = CaptureMMProxy.getInstance().getAccVideoPath();
        } else if (!Util.isNullOrNil(kVar2.f328011c)) {
            str = new C86009m1(kVar2.f328011c).mo119974l().mo119971i();
        }
        String m = !Util.isNullOrNil(str) ? C97842b.m126296m(str) : kVar2.f328011c;
        int i2 = kVar2.f328012d;
        int i3 = kVar2.f328014f;
        int i4 = i3 > 0 ? i3 : i2;
        float f = kVar2.f328013e;
        float f2 = kVar2.f328015g;
        float f3 = f2 > 0.0f ? f2 : f;
        Log.m105924i("MicroMsg.Media.X264MP4MuxRecorder", "muxResultPath : " + m);
        C108632q qVar = new C108632q(kVar2.f328026r, m, f3, kVar2.f328021m, i4, kVar2.f328032x.f267174o, kVar2.f328002E, true, false);
        long currentTicks2 = Util.currentTicks();
        boolean a = qVar.mo159656a(kVar2.f328007J);
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "mux used %sms, success: %s", Long.valueOf(Util.ticksToNow(currentTicks2)), Boolean.valueOf(a));
        if (!a) {
            Log.m105920e("MicroMsg.Media.X264MP4MuxRecorder", "mux failed!");
            C108389l.m146844e();
            return false;
        }
        kVar2.f328026r.mo151875c();
        kVar2.f328024p.mo159676a(C108607f.C108610c.Stop);
        kVar2.f328034z = C86013q1.m106456q(m);
        if (!Util.isNullOrNil(m) && !m.equals(kVar2.f328011c)) {
            C86013q1.m106463x(m, kVar2.f328011c);
            C86013q1.m106447h(m);
        }
        return true;
    }

    /* renamed from: B */
    public static void m148830B(C109572k kVar, Bitmap bitmap) {
        kVar.getClass();
        if (bitmap == null) {
            Log.m105920e("MicroMsg.Media.X264MP4MuxRecorder", "saveVideoThumbImpl with null bitmap");
            return;
        }
        try {
            BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.JPEG, kVar.f328028t, true);
            Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "saveVideoThumb to: %s, cameraOrientation: %s, width: %s, height: %s %s", kVar.f328028t, Integer.valueOf(kVar.f328025q), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Long.valueOf(C86013q1.m106451l(kVar.f328028t)));
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.Media.X264MP4MuxRecorder", e, "", new Object[0]);
        }
    }

    /* renamed from: C */
    public final boolean mo160792C(int i) {
        long currentTicks = Util.currentTicks();
        this.f328021m = this.f328032x.f267169g;
        int i2 = this.f328019k;
        if (i2 % 2 != 0) {
            this.f328019k = i2 + 1;
        }
        int i3 = this.f328020l;
        if (i3 % 2 != 0) {
            this.f328020l = i3 + 1;
        }
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "real width:%d, height:%d", Integer.valueOf(this.f328019k), Integer.valueOf(this.f328020l));
        boolean a = C85456b.m105448a(true, this.f328032x.f267164K == 1);
        this.f328007J = a;
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "init useFFmpeg muxer:%s", Boolean.valueOf(a));
        int i4 = this.f328019k;
        int i5 = this.f328020l;
        int i6 = this.f328021m;
        VideoTransPara videoTransPara = this.f328032x;
        C106139e a2 = C106139e.m142773a(i4, i5, i6, (float) videoTransPara.f267168f, videoTransPara.f267164K == 1, this.f328007J);
        this.f328026r = a2;
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "init, bufId: %s", a2);
        C106139e eVar = this.f328026r;
        if (eVar == null || eVar.f316167a < 0) {
            Log.m105920e("MicroMsg.Media.X264MP4MuxRecorder", "init failed!");
            return false;
        }
        this.f328025q = i;
        Log.m105924i("MicroMsg.Media.X264MP4MuxRecorder", "mTargetRate " + this.f328021m + "  videoParams.fps: " + this.f328032x.f267168f + " mTargetHeight:" + this.f328020l + " mTargetWidth:" + this.f328019k);
        this.f328017i = new C109715i(this.f328026r, this.f328019k, this.f328020l);
        C110505a aVar = this.f328003F;
        EGLContext eGLContext = this.f328004G;
        int i7 = this.f328019k;
        int i8 = this.f328020l;
        C109575b bVar = new C109575b(this);
        String str = aVar.f330438b;
        Log.m105924i(str, aVar.hashCode() + " initWithSize, eglContext: " + eGLContext + ", callback: " + false + ", width:" + i7 + ", height:" + i8);
        aVar.mo161975d(new C110512b(eGLContext, aVar, i7, i8, bVar));
        this.f328003F.f330442f = new C109576c();
        mo160793D();
        VideoTransPara videoTransPara2 = this.f328032x;
        C109555a aVar2 = new C109555a(videoTransPara2.f267174o, videoTransPara2.f267173n, videoTransPara2.f267175p, C85456b.m105448a(true, videoTransPara2.f267164K == 1));
        this.f328016h = aVar2;
        aVar2.f325203k = this.f328001D;
        int n = aVar2.mo160781n(this.f328026r, C94555d.m119565a(this.f328011c));
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "initImpl used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
        if (n == 0) {
            return true;
        }
        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markX264AACRecorderInitFailed");
        C115669n.INSTANCE.mo175913w(985, 33, 1);
        return false;
    }

    /* renamed from: D */
    public final void mo160793D() {
        int i = this.f328019k;
        int i2 = this.f328020l;
        this.f328003F.f330437a.mo159590t(i, i2);
        C110505a aVar = this.f328003F;
        aVar.f330437a.mo159589r(this.f328025q);
        C110505a aVar2 = this.f328003F;
        aVar2.f330437a.mo159591u(this.f328022n, this.f328023o);
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "outputWidth: %s, outputHeight: %s, cameraPreviewWidth: %s, cameraPreviewHeight: %s, getDataRotate: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f328022n), Integer.valueOf(this.f328023o), Integer.valueOf(this.f328025q));
    }

    /* renamed from: a */
    public String mo159600a() {
        return this.f328010b;
    }

    /* renamed from: b */
    public String mo159601b() {
        return this.f328028t;
    }

    /* renamed from: c */
    public float mo159602c() {
        return this.f328013e;
    }

    public void cancel() {
        Log.m105924i("MicroMsg.Media.X264MP4MuxRecorder", "cancel record");
        synchronized (this.f328009a) {
            if (this.f328017i != null) {
                if (this.f328016h != null || this.f328002E) {
                    this.f328024p.mo159676a(C108607f.C108610c.WaitStop);
                    this.f328017i.mo160946d();
                    C109555a aVar = this.f328016h;
                    if (aVar != null) {
                        aVar.mo138252a(new C109578e(this));
                    }
                    this.f328026r.mo151875c();
                    this.f328024p.mo159676a(C108607f.C108610c.Stop);
                    reset();
                    return;
                }
            }
            Log.m105920e("MicroMsg.Media.X264MP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
        }
    }

    public void clear() {
        try {
            Log.m105924i("MicroMsg.Media.X264MP4MuxRecorder", "clear");
            C109555a aVar = this.f328016h;
            if (aVar != null) {
                aVar.clear();
            }
            C110505a aVar2 = this.f328003F;
            if (aVar2 != null) {
                aVar2.mo161976e();
            }
            this.f328026r.mo151875c();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Media.X264MP4MuxRecorder", e, "clear error: %s", e.getMessage());
        }
    }

    /* renamed from: d */
    public void mo159605d(float f) {
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "overrideFps: %s", Float.valueOf(f));
        this.f328015g = f;
    }

    /* renamed from: e */
    public void mo159606e(C108607f.C108608a aVar) {
        this.f327999B = aVar;
    }

    /* renamed from: f */
    public boolean mo159607f() {
        return this.f327998A;
    }

    /* renamed from: g */
    public boolean mo159608g() {
        return false;
    }

    public String getFilePath() {
        return this.f328011c;
    }

    public C108382h getFrameDataCallback() {
        return this.f328008K;
    }

    public String getMd5() {
        return Util.nullAs(this.f328034z, "");
    }

    /* renamed from: h */
    public void mo123149h() {
        C108607f.C108610c cVar = C108607f.C108610c.PrepareStop;
        if (this.f328006I >= 0) {
            C108650z zVar = this.f328024p;
            C108607f.C108610c cVar2 = zVar.f325384a;
            if (cVar2 == C108607f.C108610c.Start || cVar2 == cVar) {
                if (cVar2 == cVar) {
                    zVar.f325384a = C108607f.C108610c.WaitStop;
                    Log.m105926v("MicroMsg.Media.X264MP4MuxRecorder", "forward one more frame");
                }
                this.f328031w.mo158893a(1);
                C109555a aVar = this.f328016h;
                if (aVar != null) {
                    aVar.f325202j = true;
                }
                C110505a aVar2 = this.f328003F;
                int i = this.f328006I;
                long nanoTime = System.nanoTime();
                aVar2.getClass();
                aVar2.mo161975d(new C110516d(aVar2, i, false, 0, false, nanoTime));
                this.f328030v.mo158893a(1);
            }
        }
    }

    /* renamed from: i */
    public void mo159612i(int i, int i2, int i3, int i4) {
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        if (i3 % 16 != 0) {
            i3 = C97842b.m126284a(i3);
        }
        if (i4 % 16 != 0) {
            i4 = C97842b.m126284a(i4);
        }
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "setSize, after align, targetWidth: %d, targetHeight: %d", Integer.valueOf(i3), Integer.valueOf(i4));
        this.f328022n = i;
        this.f328023o = i2;
    }

    /* renamed from: j */
    public C108607f.C108610c mo159613j() {
        return this.f328024p.f325384a;
    }

    /* renamed from: k */
    public int mo159614k() {
        return Math.round(((float) this.f328012d) / 1000.0f);
    }

    /* renamed from: l */
    public void mo123150l(boolean z) {
    }

    /* renamed from: m */
    public void mo159615m(String str) {
        this.f328011c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo159616n(java.lang.Runnable r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f328009a
            monitor-enter(r0)
            r5.f328000C = r6     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "MicroMsg.Media.X264MP4MuxRecorder"
            java.lang.String r2 = "!!!!!stop, stopCallback: %s!!!"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0078 }
            r4 = 0
            r3[r4] = r6     // Catch:{ all -> 0x0078 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)     // Catch:{ all -> 0x0078 }
            n80.i r1 = r5.f328017i     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x006a
            m90.a r1 = r5.f328016h     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x001f
            boolean r1 = r5.f328002E     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x001f
            goto L_0x006a
        L_0x001f:
            j72.z r1 = r5.f328024p     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x003e
            j72.f$c r1 = r1.f325384a     // Catch:{ all -> 0x0078 }
            j72.f$c r2 = j72.C108607f.C108610c.Stop     // Catch:{ all -> 0x0078 }
            if (r1 != r2) goto L_0x003e
            java.lang.String r1 = "MicroMsg.Media.X264MP4MuxRecorder"
            java.lang.String r2 = "stop, already in stop videoRecordStatus"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x0078 }
            m90.a r1 = r5.f328016h     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x0037
            r1.clear()     // Catch:{ all -> 0x0078 }
        L_0x0037:
            if (r6 == 0) goto L_0x003c
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r6)     // Catch:{ all -> 0x0078 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            return
        L_0x003e:
            r6 = 0
            r5.f328008K = r6     // Catch:{ all -> 0x0078 }
            long r1 = r5.f328018j     // Catch:{ all -> 0x0078 }
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x0050
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)     // Catch:{ all -> 0x0078 }
            int r6 = (int) r1     // Catch:{ all -> 0x0078 }
            r5.f328012d = r6     // Catch:{ all -> 0x0078 }
        L_0x0050:
            j72.z r6 = r5.f328024p     // Catch:{ all -> 0x0078 }
            if (r6 == 0) goto L_0x0068
            java.lang.String r6 = "MicroMsg.MediaEditorIDKeyStat"
            java.lang.String r1 = "markX264StartWait"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)     // Catch:{ all -> 0x0078 }
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ all -> 0x0078 }
            w80.C102361h.f301460b = r1     // Catch:{ all -> 0x0078 }
            j72.z r6 = r5.f328024p     // Catch:{ all -> 0x0078 }
            j72.f$c r1 = j72.C108607f.C108610c.PrepareStop     // Catch:{ all -> 0x0078 }
            r6.mo159676a(r1)     // Catch:{ all -> 0x0078 }
        L_0x0068:
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            return
        L_0x006a:
            java.lang.String r1 = "MicroMsg.Media.X264MP4MuxRecorder"
            java.lang.String r2 = "error, yuvRecorder or aacRecorder is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x0078 }
            if (r6 == 0) goto L_0x0076
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r6)     // Catch:{ all -> 0x0078 }
        L_0x0076:
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            return
        L_0x0078:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m90.C109572k.mo159616n(java.lang.Runnable):void");
    }

    /* renamed from: o */
    public void mo159617o(int i) {
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "overrideDurationMs: %s", Integer.valueOf(i));
        this.f328014f = i;
    }

    /* renamed from: p */
    public boolean mo159618p(int i) {
        if (!this.f328033y) {
            Log.m105924i("MicroMsg.Media.X264MP4MuxRecorder", "preInit, cameraOrientation");
            boolean C = mo160792C(i);
            this.f328033y = true;
            Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "initImpl result: %s", Boolean.valueOf(C));
            return C;
        }
        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markX264InitFailed");
        C115669n.INSTANCE.mo175913w(985, 31, 1);
        return true;
    }

    public void pause() {
        Log.m105924i("MicroMsg.Media.X264MP4MuxRecorder", "pause");
        C108650z zVar = this.f328024p;
        if (zVar != null && zVar.f325384a == C108607f.C108610c.Start) {
            zVar.mo159676a(C108607f.C108610c.Pause);
        }
    }

    /* renamed from: q */
    public void mo159620q(int i, int i2, int i3) {
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "resume, cameraOrientation: %s", Integer.valueOf(i));
        this.f328025q = i;
        this.f328022n = i2;
        this.f328023o = i3;
        this.f328003F.f330437a.mo159589r(i);
        mo160793D();
        C108650z zVar = this.f328024p;
        if (zVar != null && zVar.f325384a == C108607f.C108610c.Pause) {
            zVar.mo159676a(C108607f.C108610c.Start);
        }
    }

    /* renamed from: r */
    public Point mo159621r() {
        return new Point(this.f328022n, this.f328023o);
    }

    public void reset() {
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "reset, yuvRecorder: %s, aacRecorder: %s, muxer: %s", this.f328017i, this.f328016h, null);
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "reset, yuvRecorder: %s, aacRecorder: %s", this.f328017i, this.f328016h);
        synchronized (this.f328009a) {
            this.f328017i = null;
        }
        this.f328016h = null;
        this.f328033y = false;
    }

    /* renamed from: s */
    public long mo159623s() {
        synchronized (this.f328009a) {
            long j = this.f328018j;
            if (j <= 0) {
                return 0;
            }
            long ticksToNow = Util.ticksToNow(j);
            return ticksToNow;
        }
    }

    public void setMirror(boolean z) {
    }

    public void setMute(boolean z) {
        this.f328002E = z;
    }

    /* renamed from: t */
    public C89658b mo159626t() {
        C109555a aVar = this.f328016h;
        if (aVar != null) {
            return aVar.f325192I;
        }
        return null;
    }

    /* renamed from: u */
    public String mo159627u() {
        return this.f328029u;
    }

    /* renamed from: v */
    public void mo159628v(String str) {
        this.f328029u = str;
    }

    /* renamed from: w */
    public void mo159629w(boolean z) {
        this.f328001D = z;
    }

    /* renamed from: x */
    public void mo159630x(String str) {
        this.f328028t = str;
    }

    /* renamed from: y */
    public int mo159631y() {
        return this.f328025q;
    }

    /* renamed from: z */
    public int mo159632z(int i, boolean z, int i2) {
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "start, cameraOrientation: %s, isLandscape: %s, degree: %s", Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2));
        this.f328030v.mo158896d();
        this.f328012d = 0;
        this.f328031w.mo158896d();
        this.f327998A = z;
        this.f328024p.mo159676a(C108607f.C108610c.WaitStart);
        if (Util.isNullOrNil(this.f328011c)) {
            Log.m105920e("MicroMsg.Media.X264MP4MuxRecorder", "start error, mCurRecordPath is null!!");
            return -1;
        }
        try {
            this.f328010b = C86013q1.m106457r(this.f328011c);
            String s = C86013q1.m106458s(this.f328011c);
            if (!s.endsWith("/")) {
                s = s + "/";
            }
            this.f328027s = s + "tempRotate.mp4";
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Media.X264MP4MuxRecorder", "retrieve file name error: %s", e.getMessage());
        }
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "mCurRecordPath: %s, tempRotateFilePath: %s", this.f328011c, this.f328027s);
        this.f328025q = i;
        if (!this.f328033y) {
            mo160792C(i);
            this.f328033y = true;
        }
        synchronized (this.f328009a) {
            C111742d.C65942b bVar = this.f328003F.f330441e;
            C110194c g = this.f328005H.mo157953g();
            Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "start videoEncoder, environment:%s, videoTexture:%s", bVar, Integer.valueOf(this.f328006I));
            if (!(bVar == null || g == null)) {
                this.f328017i.mo160945c(bVar, g.f329652e, this.f328019k, this.f328020l);
            }
            this.f328018j = Util.currentTicks();
        }
        if (this.f328002E || this.f328001D) {
            Log.m105924i("MicroMsg.Media.X264MP4MuxRecorder", "start yuvRecorder with mute");
            this.f328024p.mo159676a(C108607f.C108610c.Start);
            return 0;
        }
        int f = this.f328016h.mo138258f(new C109577d());
        Log.m105925i("MicroMsg.Media.X264MP4MuxRecorder", "start aacRecorder ret: %s", Integer.valueOf(f));
        if (f != 0) {
            this.f328024p.mo159676a(C108607f.C108610c.Error);
        } else {
            this.f328024p.mo159676a(C108607f.C108610c.Initialized);
        }
        return f;
    }
}
