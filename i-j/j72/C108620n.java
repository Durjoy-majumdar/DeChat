package j72;

import android.graphics.Point;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C106139e;
import com.tencent.p014mm.plugin.sight.base.C85456b;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import eu3.C58834h;
import eu3.C97749e;
import i72.C108382h;
import i72.C108388k;
import i72.C108389l;
import j72.C108606e;
import j72.C108607f;
import lu3.C88654b;
import p375qh.C89658b;

/* renamed from: j72.n */
public class C108620n implements C108607f {

    /* renamed from: A */
    public VideoTransPara f325225A;

    /* renamed from: B */
    public boolean f325226B = false;

    /* renamed from: C */
    public int f325227C = -1;

    /* renamed from: D */
    public boolean f325228D = false;

    /* renamed from: E */
    public String f325229E = "";

    /* renamed from: F */
    public boolean f325230F = false;

    /* renamed from: G */
    public int f325231G = 0;

    /* renamed from: H */
    public C108607f.C108608a f325232H;

    /* renamed from: I */
    public boolean f325233I = false;

    /* renamed from: J */
    public boolean f325234J = false;

    /* renamed from: K */
    public C108382h f325235K = new C108621a();

    /* renamed from: a */
    public C108606e f325236a;

    /* renamed from: b */
    public C108645w f325237b;

    /* renamed from: c */
    public C108650z f325238c;

    /* renamed from: d */
    public C108626f f325239d = null;

    /* renamed from: e */
    public C108611g f325240e;

    /* renamed from: f */
    public String f325241f;

    /* renamed from: g */
    public String f325242g = "";

    /* renamed from: h */
    public int f325243h = 0;

    /* renamed from: i */
    public float f325244i = 0.0f;

    /* renamed from: j */
    public int f325245j = -1;

    /* renamed from: k */
    public float f325246k = -1.0f;

    /* renamed from: l */
    public int f325247l = 480;

    /* renamed from: m */
    public int f325248m = 640;

    /* renamed from: n */
    public int f325249n = 1600000;

    /* renamed from: o */
    public int f325250o = 480;

    /* renamed from: p */
    public int f325251p = 640;

    /* renamed from: q */
    public int f325252q = 0;

    /* renamed from: r */
    public String f325253r = null;

    /* renamed from: s */
    public HandlerThread f325254s = null;

    /* renamed from: t */
    public MMHandler f325255t = null;

    /* renamed from: u */
    public int f325256u = -1;

    /* renamed from: v */
    public int f325257v = -1;

    /* renamed from: w */
    public boolean f325258w = false;

    /* renamed from: x */
    public String f325259x = null;

    /* renamed from: y */
    public String f325260y = null;

    /* renamed from: z */
    public boolean f325261z = false;

    /* renamed from: j72.n$a */
    public class C108621a implements C108382h {
        public C108621a() {
        }

        /* renamed from: f */
        public boolean mo157927f(byte[] bArr) {
            if (bArr != null && bArr.length > 0) {
                C108620n nVar = C108620n.this;
                if (nVar.f325238c.f325384a == C108607f.C108610c.Start) {
                    if (!nVar.f325261z) {
                        nVar.f325261z = true;
                        byte[] bArr2 = new byte[bArr.length];
                        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                        ThreadPool.post(new C108631p(nVar, bArr2), "BigSightMediaCodecMP4MuxRecorder_saveThumb");
                    }
                    if (C108620n.this.f325255t != null) {
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.obj = bArr;
                        C108620n.this.f325255t.sendMessage(obtain);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: j72.n$b */
    public class C108622b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f325263d;

        public C108622b(Runnable runnable) {
            this.f325263d = runnable;
        }

        public void run() {
            C108620n.m147278A(C108620n.this, this.f325263d);
        }
    }

    /* renamed from: j72.n$c */
    public class C108623c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f325265d;

        public C108623c(Runnable runnable) {
            this.f325265d = runnable;
        }

        public void run() {
            C108620n.m147278A(C108620n.this, this.f325265d);
        }
    }

    /* renamed from: j72.n$d */
    public class C108624d implements C108606e.C98917a {
        public C108624d() {
        }

        /* renamed from: a */
        public void mo138250a() {
            C108620n.this.mo159647C();
        }
    }

    /* renamed from: j72.n$e */
    public class C108625e extends MMHandler {
        public C108625e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C108620n nVar = C108620n.this;
            if (nVar.f325256u == -1) {
                nVar.f325256u = Process.myTid();
                Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "writeCameraTid: %s", Integer.valueOf(C108620n.this.f325256u));
            }
            if (message.what == 1) {
                C108620n.this.f325236a.mo138256d();
                C108620n nVar2 = C108620n.this;
                byte[] bArr = (byte[]) message.obj;
                if (nVar2.f325258w) {
                    nVar2.f325237b.mo159665d(bArr, bArr.length, nVar2.f325250o, nVar2.f325251p);
                } else {
                    C108645w wVar = nVar2.f325237b;
                    int length = bArr.length;
                    int i = nVar2.f325252q;
                    wVar.mo159665d(bArr, length, (i == 0 || i == 180) ? nVar2.f325250o : nVar2.f325251p, (i == 0 || i == 180) ? nVar2.f325251p : nVar2.f325250o);
                }
                C98921l.f289964d.mo138260o(bArr);
                nVar2.f325228D = true;
            }
        }
    }

    /* renamed from: j72.n$f */
    public class C108626f extends C88654b {

        /* renamed from: e */
        public int f325269e;

        /* renamed from: f */
        public volatile int f325270f = 0;

        /* renamed from: g */
        public float f325271g;

        /* renamed from: h */
        public int f325272h;

        /* renamed from: i */
        public boolean f325273i = false;

        /* renamed from: j */
        public boolean f325274j = false;

        /* renamed from: n */
        public boolean f325275n = false;

        /* renamed from: o */
        public boolean f325276o = false;

        /* renamed from: p */
        public final Object f325277p;

        /* renamed from: q */
        public Runnable f325278q;

        /* renamed from: j72.n$f$a */
        public class C108627a implements Runnable {
            public C108627a() {
            }

            public void run() {
                C108607f.C108608a aVar = C108620n.this.f325232H;
                if (aVar != null) {
                    aVar.mo150355d(1);
                }
            }
        }

        /* renamed from: j72.n$f$b */
        public class C108628b implements Runnable {
            public C108628b() {
            }

            public void run() {
                C108607f.C108608a aVar = C108620n.this.f325232H;
                if (aVar != null) {
                    aVar.mo150355d(1);
                }
            }
        }

        /* renamed from: j72.n$f$c */
        public class C108629c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f325282d;

            public C108629c(C108626f fVar, String str) {
                this.f325282d = str;
            }

            public void run() {
                try {
                    C86013q1.m106447h(this.f325282d);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.MMSightFFMpegRecorder", "stop, delete old file error: %s", e.getMessage());
                }
            }
        }

        public C108626f() {
            Object obj = new Object();
            this.f325277p = obj;
            this.f325278q = null;
            synchronized (obj) {
                try {
                    String s = C86013q1.m106458s(C108620n.this.f325242g);
                    if (!s.endsWith("/")) {
                        s = s + "/";
                    }
                    C108620n.this.f325253r = s + "tempRotate.mp4";
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.MMSightFFMpegRecorder", "retrieve file name error: %s", e.getMessage());
                }
            }
        }

        public String getKey() {
            return "MicroMsg.MMSightFFMpegRecorder";
        }

        public void run() {
            C108620n nVar = C108620n.this;
            if (nVar.f325257v == -1) {
                nVar.f325257v = Process.myTid();
                Process.setThreadPriority(Process.myTid(), -2);
                Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "encodeTid: %s", Integer.valueOf(C108620n.this.f325257v));
            }
            synchronized (this.f325277p) {
                while (!this.f325274j) {
                    long currentTicks = Util.currentTicks();
                    int triggerEncode = SightVideoJNI.triggerEncode(this.f325269e, Math.max(0, this.f325270f), false);
                    Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "ing: trgger encode use %dms, Encode index[%d, %d), threadId: %s", Long.valueOf(Util.ticksToNow(currentTicks)), Integer.valueOf(this.f325270f), Integer.valueOf(triggerEncode), Long.valueOf(Thread.currentThread().getId()));
                    if (Math.abs(triggerEncode - this.f325270f) <= 5) {
                        try {
                            Thread.sleep(100);
                        } catch (Exception unused) {
                            Log.m105920e("MicroMsg.MMSightFFMpegRecorder", "thread sleep error");
                        }
                    }
                    this.f325270f = triggerEncode;
                }
                long currentTicks2 = Util.currentTicks();
                if (!this.f325275n) {
                    this.f325270f = SightVideoJNI.triggerEncode(this.f325269e, this.f325270f, true);
                }
                Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "end: trgger encode use %dms, curEncode index %d, markCancel %B, threadId: %s", Long.valueOf(Util.ticksToNow(currentTicks2)), Integer.valueOf(this.f325270f), Boolean.valueOf(this.f325275n), Long.valueOf(Thread.currentThread().getId()));
                if (!this.f325275n) {
                    int max = Math.max(1000, this.f325272h);
                    C108620n nVar2 = C108620n.this;
                    int i = nVar2.f325245j;
                    int i2 = i > 0 ? i : max;
                    float f = this.f325271g;
                    float f2 = nVar2.f325246k;
                    float f3 = f2 > 0.0f ? f2 : f;
                    C106139e eVar = new C106139e(this.f325269e);
                    C108620n nVar3 = C108620n.this;
                    nVar2.f325240e = new C108632q(eVar, nVar3.f325242g, f3, nVar3.f325249n, i2, nVar3.f325225A.f267174o, false, true, false);
                    long currentTicks3 = Util.currentTicks();
                    C108620n nVar4 = C108620n.this;
                    C108611g gVar = nVar4.f325240e;
                    nVar4.getClass();
                    boolean a = ((C108632q) gVar).mo159656a(false);
                    Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "mux used %sms, success: %s", Long.valueOf(Util.ticksToNow(currentTicks3)), Boolean.valueOf(a));
                    if (!a) {
                        Log.m105920e("MicroMsg.MMSightFFMpegRecorder", "mux failed!");
                        SightVideoJNI.releaseBigSightDataBufferLock(this.f325269e);
                        MMHandlerThread.postToMainThread(new C108627a());
                        Log.m105924i("MicroMsg.MMSightRecorderIDKeyStat", "markFFMpegCaptureMuxError");
                        C115669n.INSTANCE.idkeyStat(440, 30, 1, false);
                        return;
                    }
                    C108620n nVar5 = C108620n.this;
                    boolean z = nVar5.f325230F;
                    if ((z && nVar5.f325258w) || ((!nVar5.f325258w && !z) || ((z && Math.abs(nVar5.f325252q - nVar5.f325231G) == 0) || C108620n.this.f325231G == 180))) {
                        long currentTicks4 = Util.currentTicks();
                        C108620n nVar6 = C108620n.this;
                        boolean z2 = nVar6.f325258w;
                        int i3 = (z2 || nVar6.f325230F) ? z2 ? nVar6.f325231G : 180 : nVar6.f325252q;
                        if (nVar6.f325231G == 180 && !z2 && (i3 = i3 + 180) > 360) {
                            i3 -= 360;
                        }
                        if (i3 > 0) {
                            SightVideoJNI.tagRotateVideoVFS(nVar6.f325242g, nVar6.f325253r, i3);
                            Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "tagRotateVideo used %sms, cameraOrientation: %s, isLandscape: %s, deviceDegree: %s, rotateDegree: %s", Long.valueOf(Util.ticksToNow(currentTicks4)), Integer.valueOf(C108620n.this.f325252q), Boolean.valueOf(C108620n.this.f325230F), Integer.valueOf(C108620n.this.f325231G), Integer.valueOf(i3));
                            C108620n nVar7 = C108620n.this;
                            String str = nVar7.f325253r;
                            try {
                                C86013q1.m106442c(str, nVar7.f325242g);
                                ThreadPool.post(new C108629c(this, str), "BigSightFFMpegRecorder_tagRotate_after_process");
                                Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "tag rotate used %sms", Long.valueOf(Util.ticksToNow(currentTicks4)));
                            } catch (Exception unused2) {
                                Log.m105920e("MicroMsg.MMSightFFMpegRecorder", "stop, copy file error");
                                SightVideoJNI.releaseBigSightDataBufferLock(this.f325269e);
                                MMHandlerThread.postToMainThread(new C108628b());
                                return;
                            }
                        }
                    }
                }
                SightVideoJNI.releaseBigSightDataBufferLock(this.f325269e);
                Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "all finish, callback: %s", this.f325278q);
                C108620n.this.reset();
                MMHandlerThread.postToMainThread(this.f325278q);
                this.f325276o = true;
                C108620n nVar8 = C108620n.this;
                nVar8.f325257v = -1;
                nVar8.f325256u = -1;
            }
        }
    }

    public C108620n(VideoTransPara videoTransPara) {
        this.f325225A = videoTransPara;
        this.f325247l = videoTransPara.f267166d;
        this.f325248m = videoTransPara.f267167e;
        int i = videoTransPara.f267169g;
        this.f325249n = i;
        int i2 = C108388k.f324540d.f324554d;
        if (i2 == -1) {
            this.f325249n = i;
        } else {
            this.f325249n = i2;
        }
        this.f325238c = new C108650z();
        this.f325226B = false;
        Log.m105919d("MicroMsg.MMSightFFMpegRecorder", "create MMSightFFMpegRecorder, targetWidth: %s, targetHeight: %s, targetRate: %s,  defaultRate: %s", Integer.valueOf(this.f325247l), Integer.valueOf(this.f325248m), Integer.valueOf(this.f325249n), Integer.valueOf(i2));
    }

    /* renamed from: A */
    public static void m147278A(C108620n nVar, Runnable runnable) {
        C108626f fVar;
        nVar.f325238c.mo159676a(C108607f.C108610c.WaitStop);
        C108645w wVar = nVar.f325237b;
        if (wVar != null) {
            int i = wVar.f325340a;
            float a = (((float) wVar.f325341b) * 1000.0f) / ((float) nVar.f325237b.mo159662a());
            Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "stop, bufID %d, frameCount %d, duration %dms, %.6ffps", Integer.valueOf(i), Integer.valueOf(nVar.f325237b.f325341b), Long.valueOf(nVar.f325237b.mo159662a()), Float.valueOf(a));
            nVar.f325243h = (int) nVar.f325237b.mo159662a();
            nVar.f325244i = a;
            nVar.f325237b.mo159664c();
            C108626f fVar2 = nVar.f325239d;
            if (fVar2 != null) {
                fVar2.f325271g = a;
                fVar2.f325272h = nVar.f325243h;
                fVar2.f325278q = runnable;
                fVar2.f325273i = true;
                fVar2.mo97819a();
            }
        }
        C108606e eVar = nVar.f325236a;
        if (eVar != null && !nVar.f325233I) {
            eVar.mo138252a(new C108630o(nVar));
        }
        nVar.f325238c.mo159676a(C108607f.C108610c.Stop);
        nVar.f325229E = C86013q1.m106456q(nVar.f325242g);
        if (nVar.f325239d == null) {
            Log.m105920e("MicroMsg.MMSightFFMpegRecorder", "encodeRunnable is null!, directly call stopcallback");
            nVar.reset();
            MMHandlerThread.postToMainThread(runnable);
        }
        if (nVar.f325233I && (fVar = nVar.f325239d) != null) {
            fVar.f325274j = true;
        }
    }

    /* renamed from: B */
    public final boolean mo159646B(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        long currentTicks = Util.currentTicks();
        boolean z = C108388k.f324540d.f324555e;
        this.f325258w = z;
        this.f325252q = i8;
        if (!z) {
            int i9 = (i8 == 0 || i8 == 180) ? this.f325250o : this.f325251p;
            int i15 = (i8 == 0 || i8 == 180) ? this.f325251p : this.f325250o;
            i3 = this.f325247l;
            i2 = this.f325248m;
            int i16 = i9;
            i4 = i15;
            i5 = i16;
        } else {
            int i17 = (i8 == 0 || i8 == 180) ? this.f325250o : this.f325251p;
            int i18 = (i8 == 0 || i8 == 180) ? this.f325251p : this.f325250o;
            int i19 = (i8 == 0 || i8 == 180) ? this.f325247l : this.f325248m;
            i2 = (i8 == 0 || i8 == 180) ? this.f325248m : this.f325247l;
            i5 = i17;
            i4 = i18;
            i3 = i19;
        }
        int i25 = this.f325249n;
        VideoTransPara videoTransPara = this.f325225A;
        int initDataBufferForMMSightLock = SightVideoJNI.initDataBufferForMMSightLock(i5, i4, i, i3, i2, (float) videoTransPara.f267168f, i25, videoTransPara.f267177r, 8, videoTransPara.f267176q, 23.0f, z, true, videoTransPara.f267170h, false, false, false);
        if (initDataBufferForMMSightLock < 0) {
            Log.m105920e("MicroMsg.MMSightFFMpegRecorder", "init failed!");
            C108389l.m146842c();
            return false;
        }
        this.f325227C = initDataBufferForMMSightLock;
        C108645w wVar = new C108645w(this.f325258w, i, i3, i2, false);
        this.f325237b = wVar;
        int i26 = -1;
        if (initDataBufferForMMSightLock < 0) {
            Log.m105920e("MicroMsg.MMSightX264YUVRecorder", "init error, yuv buffer id error");
            i6 = -1;
        } else {
            wVar.f325340a = initDataBufferForMMSightLock;
            synchronized (C108645w.class) {
                wVar.f325341b = 0;
            }
            wVar.f325342c = 0;
            i6 = 0;
        }
        if (CaptureMMProxy.getInstance() != null) {
            i26 = CaptureMMProxy.getInstance().getInt(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_AUDIO_RECORDER_TYPE_INT_SYNC, -1);
        }
        if (i26 < 0) {
            VideoTransPara videoTransPara2 = this.f325225A;
            C108613i iVar = new C108613i(videoTransPara2.f267174o, videoTransPara2.f267173n, videoTransPara2.f267175p, C85456b.m105448a(true, videoTransPara2.f267164K == 1));
            this.f325236a = iVar;
            iVar.f325203k = this.f325233I;
            int c = iVar.mo138254c(initDataBufferForMMSightLock, C94555d.m119565a(this.f325242g));
            if (i6 < 0 || c < 0) {
                Log.m105921e("MicroMsg.MMSightFFMpegRecorder", "init yuv or aac recorder error!! %d %d", Integer.valueOf(i6), Integer.valueOf(c));
                if (c < 0 && i6 >= 0) {
                    Log.m105928w("MicroMsg.MMSightFFMpegRecorder", "aac init error, try mediarecorder now");
                    this.f325236a.clear();
                    VideoTransPara videoTransPara3 = this.f325225A;
                    C98919k kVar = new C98919k(videoTransPara3.f267174o, videoTransPara3.f267173n, videoTransPara3.f267175p);
                    this.f325236a = kVar;
                    kVar.f289958c = this.f325233I;
                    int c2 = kVar.mo138254c(initDataBufferForMMSightLock, C94555d.m119565a(this.f325242g));
                    Log.m105929w("MicroMsg.MMSightFFMpegRecorder", "MMSightAACMediaRecorder init ret: %s", Integer.valueOf(c2));
                    if (c2 >= 0) {
                        return true;
                    }
                }
                SightVideoJNI.releaseBigSightDataBufferLock(initDataBufferForMMSightLock);
                C108389l.m146842c();
                return false;
            }
        } else {
            if (i26 == 1) {
                VideoTransPara videoTransPara4 = this.f325225A;
                C108613i iVar2 = new C108613i(videoTransPara4.f267174o, videoTransPara4.f267173n, videoTransPara4.f267175p, C85456b.m105448a(true, videoTransPara4.f267164K == 1));
                this.f325236a = iVar2;
                iVar2.f325203k = this.f325233I;
                i7 = iVar2.mo138254c(initDataBufferForMMSightLock, C94555d.m119565a(this.f325242g));
            } else if (i26 == 2) {
                VideoTransPara videoTransPara5 = this.f325225A;
                C98919k kVar2 = new C98919k(videoTransPara5.f267174o, videoTransPara5.f267173n, videoTransPara5.f267175p);
                this.f325236a = kVar2;
                kVar2.f289958c = this.f325233I;
                i7 = kVar2.mo138254c(initDataBufferForMMSightLock, C94555d.m119565a(this.f325242g));
            } else {
                i7 = 0;
            }
            if (i6 < 0 || i7 < 0) {
                Log.m105921e("MicroMsg.MMSightFFMpegRecorder", "init yuv or aac recorder error!! %d %d", Integer.valueOf(i6), Integer.valueOf(i7));
                SightVideoJNI.releaseBigSightDataBufferLock(initDataBufferForMMSightLock);
                C108389l.m146842c();
                return false;
            }
        }
        Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "initImpl used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
        return true;
    }

    /* renamed from: C */
    public final void mo159647C() {
        Log.m105924i("MicroMsg.MMSightFFMpegRecorder", "ashutest::pcm ready");
        C108626f fVar = this.f325239d;
        if (fVar != null && !fVar.f325276o) {
            Log.m105921e("MicroMsg.MMSightFFMpegRecorder", "ashutest::OnPcmReady, last encode thread[%s] status error!!! MUST NOT BE HERE", fVar);
            synchronized (this.f325239d.f325277p) {
                mo159648D(this.f325239d.f325269e);
            }
        }
        C108650z zVar = this.f325238c;
        if (zVar.f325384a != C108607f.C108610c.Initialized) {
            Log.m105928w("MicroMsg.MMSightFFMpegRecorder", "ashutest::not MediaStatus.Initialized, maybe canceled by user");
            return;
        }
        zVar.mo159676a(C108607f.C108610c.Start);
        C108626f fVar2 = new C108626f();
        this.f325239d = fVar2;
        fVar2.f325269e = this.f325227C;
        ThreadPool.post((Runnable) fVar2, "SightCustomAsyncMediaRecorder_encode_" + Util.currentTicks(), 5);
    }

    /* renamed from: D */
    public final boolean mo159648D(int i) {
        C108626f fVar = this.f325239d;
        if (fVar == null || fVar.f325276o) {
            return false;
        }
        if (!fVar.f325273i) {
            fVar.f325278q = null;
            fVar.f325275n = true;
            fVar.f325274j = true;
            fVar.mo97819a();
        }
        synchronized (this.f325239d.f325277p) {
            SightVideoJNI.releaseBigSightDataBufferLock(i);
            int i2 = this.f325239d.f325269e;
            if (i2 != i) {
                SightVideoJNI.releaseBigSightDataBufferLock(i2);
            }
        }
        return true;
    }

    /* renamed from: a */
    public String mo159600a() {
        return this.f325241f;
    }

    /* renamed from: b */
    public String mo159601b() {
        return this.f325259x;
    }

    /* renamed from: c */
    public float mo159602c() {
        return this.f325244i;
    }

    public void cancel() {
        Log.m105924i("MicroMsg.MMSightFFMpegRecorder", "cancel");
        this.f325238c.mo159676a(C108607f.C108610c.WaitStop);
        clear();
        this.f325238c.mo159676a(C108607f.C108610c.Stop);
    }

    public void clear() {
        int i;
        C108645w wVar = this.f325237b;
        if (wVar != null) {
            i = wVar.f325340a;
            if (i < 0) {
                Log.m105926v("MicroMsg.MMSightFFMpegRecorder", "call clear, but bufID error");
                return;
            }
            wVar.mo159664c();
        } else {
            i = -1;
        }
        C108606e eVar = this.f325236a;
        if (eVar != null) {
            eVar.mo138252a((C108606e.C98918b) null);
        }
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Boolean.valueOf(this.f325239d == null);
        C108626f fVar = this.f325239d;
        if (fVar != null && fVar.f325275n) {
            z = true;
        }
        objArr[2] = Boolean.valueOf(z);
        Log.m105927v("MicroMsg.MMSightFFMpegRecorder", "ashutest::clear bufID %d, encodeRunnable null ? %B, markCancel %B", objArr);
        if (i >= 0 && !mo159648D(i)) {
            SightVideoJNI.releaseRecorderBufferRef("clear");
            SightVideoJNI.releaseBigSightDataBufferLock(i);
        }
        HandlerThread handlerThread = this.f325254s;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    /* renamed from: d */
    public void mo159605d(float f) {
        Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "overrideFps: %s", Float.valueOf(f));
        this.f325246k = f;
    }

    /* renamed from: e */
    public void mo159606e(C108607f.C108608a aVar) {
        this.f325232H = aVar;
    }

    /* renamed from: f */
    public boolean mo159607f() {
        return this.f325230F;
    }

    /* renamed from: g */
    public boolean mo159608g() {
        return this.f325228D;
    }

    public String getFilePath() {
        return this.f325242g;
    }

    public C108382h getFrameDataCallback() {
        return this.f325235K;
    }

    public String getMd5() {
        return Util.nullAs(this.f325229E, "");
    }

    /* renamed from: i */
    public void mo159612i(int i, int i2, int i3, int i4) {
        Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "setSize, width: %s, height: %s", Integer.valueOf(i), Integer.valueOf(i2));
        this.f325247l = i3;
        this.f325248m = i4;
        this.f325250o = i;
        this.f325251p = i2;
        C98921l.f289964d.mo126905m(Integer.valueOf(((i * i2) * 3) / 2));
    }

    /* renamed from: j */
    public C108607f.C108610c mo159613j() {
        return this.f325238c.f325384a;
    }

    /* renamed from: k */
    public int mo159614k() {
        return Math.round(((float) this.f325243h) / 1000.0f);
    }

    /* renamed from: m */
    public void mo159615m(String str) {
        this.f325242g = str;
    }

    /* renamed from: n */
    public void mo159616n(Runnable runnable) {
        MMHandler mMHandler;
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(this.f325239d == null);
        C108626f fVar = this.f325239d;
        objArr[1] = Boolean.valueOf(fVar != null && fVar.f325273i);
        C108626f fVar2 = this.f325239d;
        objArr[2] = Boolean.valueOf(fVar2 != null && fVar2.f325274j);
        Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "stop, encodeThread null ? %B, has trigger finish ? %B, has finish callback ? %B", objArr);
        C108626f fVar3 = this.f325239d;
        if (fVar3 == null || !fVar3.f325273i) {
            Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "stopOnCameraDataThread: %s, writeCameraDataHandler: %s", Boolean.valueOf(this.f325234J), this.f325255t);
            if (!this.f325234J || (mMHandler = this.f325255t) == null) {
                ThreadPool.post(new C108623c(runnable), "MMSightFFMpegRecorder_stop");
            } else {
                mMHandler.post(new C108622b(runnable));
            }
        } else {
            synchronized (fVar3.f325277p) {
                reset();
                MMHandlerThread.postToMainThread(runnable);
            }
        }
    }

    /* renamed from: o */
    public void mo159617o(int i) {
        Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "overrideDurationMs: %s", Integer.valueOf(i));
        this.f325245j = i;
    }

    /* renamed from: p */
    public boolean mo159618p(int i) {
        if (this.f325226B) {
            return true;
        }
        Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "preInit, cameraOrientation: %s", Integer.valueOf(i));
        boolean B = mo159646B(i);
        this.f325226B = true;
        Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "initImpl result: %s", Boolean.valueOf(B));
        return B;
    }

    public void pause() {
        Log.m105924i("MicroMsg.MMSightFFMpegRecorder", "pause");
        C108650z zVar = this.f325238c;
        if (zVar != null && zVar.f325384a == C108607f.C108610c.Start) {
            zVar.mo159676a(C108607f.C108610c.Pause);
        }
    }

    /* renamed from: q */
    public void mo159620q(int i, int i2, int i3) {
        Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "resume, cameraOrientation: %s", Integer.valueOf(i));
        C108650z zVar = this.f325238c;
        if (zVar != null && zVar.f325384a == C108607f.C108610c.Pause) {
            C108645w wVar = this.f325237b;
            if (wVar != null) {
                wVar.mo159663b(i, i2, i3);
            }
            this.f325238c.mo159676a(C108607f.C108610c.Start);
        }
    }

    /* renamed from: r */
    public Point mo159621r() {
        return new Point(this.f325250o, this.f325251p);
    }

    public void reset() {
        Log.m105924i("MicroMsg.MMSightFFMpegRecorder", "reset");
        this.f325238c.f325384a = C108607f.C108610c.Stop;
        this.f325228D = false;
        C108606e eVar = this.f325236a;
        if (eVar != null) {
            eVar.clear();
        }
        C108645w wVar = this.f325237b;
        if (wVar != null) {
            SightVideoJNI.releaseBigSightDataBufferLock(wVar.f325340a);
            wVar.f325340a = -1;
            synchronized (C108645w.class) {
                wVar.f325341b = 0;
            }
            wVar.f325342c = 0;
        }
        clear();
    }

    /* renamed from: s */
    public long mo159623s() {
        return this.f325237b.mo159662a();
    }

    public void setMute(boolean z) {
    }

    /* renamed from: t */
    public C89658b mo159626t() {
        C108606e eVar = this.f325236a;
        if (eVar != null) {
            return eVar.mo138257e();
        }
        return null;
    }

    /* renamed from: u */
    public String mo159627u() {
        return this.f325260y;
    }

    /* renamed from: v */
    public void mo159628v(String str) {
        this.f325260y = str;
    }

    /* renamed from: w */
    public void mo159629w(boolean z) {
        this.f325233I = z;
    }

    /* renamed from: x */
    public void mo159630x(String str) {
        this.f325259x = str;
    }

    /* renamed from: y */
    public int mo159631y() {
        return this.f325252q;
    }

    /* renamed from: z */
    public int mo159632z(int i, boolean z, int i2) {
        Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "request start, last status %s, cameraOrientation: %s, isLandscape: %s, degree: %s", this.f325238c.f325384a, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2));
        this.f325230F = z;
        this.f325243h = 0;
        this.f325231G = i2;
        this.f325238c.mo159676a(C108607f.C108610c.WaitStart);
        Object[] objArr = new Object[3];
        objArr[0] = this.f325242g;
        objArr[1] = Boolean.valueOf(this.f325239d == null);
        C108626f fVar = this.f325239d;
        objArr[2] = Boolean.valueOf(fVar == null || fVar.f325276o);
        Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "initialize: filePath[%s], encodeThread null[%B], encodeThreadFinish[%B]", objArr);
        C108626f fVar2 = this.f325239d;
        if (fVar2 != null && !fVar2.f325276o) {
            Log.m105928w("MicroMsg.MMSightFFMpegRecorder", "ERROR, status, wait last encode thread finish!!! MUST NOT BE HERE");
            return -1;
        } else if (Util.isNullOrNil(this.f325242g)) {
            Log.m105920e("MicroMsg.MMSightFFMpegRecorder", "start error, mCurRecordPath is null!!");
            return -1;
        } else {
            this.f325241f = C86013q1.m106457r(this.f325242g);
            Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "mCurRecordPath: %s", this.f325242g);
            this.f325252q = i;
            Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "start, cameraOrientation: %s", Integer.valueOf(i));
            if (!this.f325226B) {
                mo159646B(i);
                this.f325226B = true;
            }
            C108645w wVar = this.f325237b;
            if (0 == wVar.f325342c) {
                wVar.f325342c = System.currentTimeMillis();
            }
            int f = !this.f325233I ? this.f325236a.mo138258f(new C108624d()) : 0;
            Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "start aac recorder ret: %d", Integer.valueOf(f));
            int i3 = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a("BigSightWriteCameraData", 0);
            this.f325254s = a;
            a.start();
            this.f325255t = new C108625e(this.f325254s.getLooper());
            this.f325228D = false;
            if (f != 0) {
                this.f325238c.mo159676a(C108607f.C108610c.Error);
            } else {
                this.f325238c.mo159676a(C108607f.C108610c.Initialized);
            }
            C108389l.m146840a();
            Log.m105924i("MicroMsg.MMSightRecorderIDKeyStat", "markFFMpegCapture");
            C115669n.INSTANCE.idkeyStat(440, 1, 1, false);
            if (this.f325233I) {
                mo159647C();
            }
            return f;
        }
    }
}
