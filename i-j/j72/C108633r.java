package j72;

import android.graphics.Point;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.p014mm.plugin.report.service.C115669n;
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
import com.tencent.tav.coremedia.TimeUtil;
import eu3.C58834h;
import eu3.C97749e;
import i72.C108376c;
import i72.C108382h;
import i72.C108388k;
import i72.C108389l;
import j72.C108606e;
import j72.C108607f;
import p375qh.C89658b;

/* renamed from: j72.r */
public class C108633r implements C108607f {

    /* renamed from: A */
    public C108376c f325292A = new C108376c("frameCountCallback");

    /* renamed from: B */
    public VideoTransPara f325293B;

    /* renamed from: C */
    public boolean f325294C = false;

    /* renamed from: D */
    public boolean f325295D = false;

    /* renamed from: E */
    public String f325296E = "";

    /* renamed from: F */
    public boolean f325297F = false;

    /* renamed from: G */
    public int f325298G = 0;

    /* renamed from: H */
    public C108607f.C108608a f325299H;

    /* renamed from: I */
    public Runnable f325300I = null;

    /* renamed from: J */
    public boolean f325301J = false;

    /* renamed from: K */
    public boolean f325302K = true;

    /* renamed from: L */
    public boolean f325303L = false;

    /* renamed from: M */
    public C108382h f325304M = new C108634a();

    /* renamed from: a */
    public final Object f325305a = new Object();

    /* renamed from: b */
    public String f325306b;

    /* renamed from: c */
    public String f325307c = "";

    /* renamed from: d */
    public int f325308d = 0;

    /* renamed from: e */
    public float f325309e = 0.0f;

    /* renamed from: f */
    public int f325310f = -1;

    /* renamed from: g */
    public float f325311g = -1.0f;

    /* renamed from: h */
    public C108606e f325312h;

    /* renamed from: i */
    public volatile C108646x f325313i;

    /* renamed from: j */
    public C108632q f325314j;

    /* renamed from: k */
    public int f325315k = 480;

    /* renamed from: l */
    public int f325316l = 640;

    /* renamed from: m */
    public int f325317m = 1600000;

    /* renamed from: n */
    public int f325318n = 480;

    /* renamed from: o */
    public int f325319o = 640;

    /* renamed from: p */
    public C108650z f325320p;

    /* renamed from: q */
    public int f325321q;

    /* renamed from: r */
    public int f325322r;

    /* renamed from: s */
    public HandlerThread f325323s;

    /* renamed from: t */
    public MMHandler f325324t;

    /* renamed from: u */
    public String f325325u = null;

    /* renamed from: v */
    public boolean f325326v = false;

    /* renamed from: w */
    public boolean f325327w = false;

    /* renamed from: x */
    public String f325328x = null;

    /* renamed from: y */
    public String f325329y = null;

    /* renamed from: z */
    public C108376c f325330z = new C108376c("yuvRecorderWriteData");

    /* renamed from: j72.r$a */
    public class C108634a implements C108382h {
        public C108634a() {
        }

        /* renamed from: f */
        public boolean mo157927f(byte[] bArr) {
            C108607f.C108610c cVar = C108607f.C108610c.PrepareStop;
            if (bArr == null || bArr.length <= 0) {
                Log.m105920e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "preview callback data is null");
                return false;
            }
            C108650z zVar = C108633r.this.f325320p;
            C108607f.C108610c cVar2 = zVar.f325384a;
            if (cVar2 != C108607f.C108610c.Start && cVar2 != cVar) {
                return false;
            }
            if (cVar2 == cVar) {
                zVar.f325384a = C108607f.C108610c.WaitStop;
                Log.m105926v("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "forward one more frame");
            }
            C108633r.this.f325292A.mo158893a(1);
            C108606e eVar = C108633r.this.f325312h;
            if (eVar != null) {
                eVar.mo138256d();
            }
            C108633r rVar = C108633r.this;
            if (rVar.f325313i != null) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = bArr;
                MMHandler mMHandler = rVar.f325324t;
                if (mMHandler != null) {
                    mMHandler.sendMessage(obtain);
                }
            }
            return true;
        }
    }

    /* renamed from: j72.r$b */
    public class C108635b extends MMHandler {
        public C108635b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr;
            Log.m105924i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "carson：writeYuvData ");
            if (message.what == 1 && (bArr = (byte[]) message.obj) != null && C108633r.this.f325313i != null) {
                C108633r rVar = C108633r.this;
                rVar.getClass();
                Log.m105918d("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "writeYuvDataImpl");
                Log.m105918d("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "yuvRecorder" + rVar.f325313i);
                synchronized (rVar.f325305a) {
                    if (rVar.f325313i != null) {
                        rVar.f325330z.mo158893a(1);
                        long currentTicks = Util.currentTicks();
                        rVar.f325313i.mo159673h(bArr, bArr.length, rVar.f325318n, rVar.f325319o);
                        Log.m105919d("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "writeYuvData used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
                        if (!rVar.f325327w && rVar.f325302K) {
                            rVar.f325327w = true;
                            byte[] bArr2 = new byte[bArr.length];
                            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                            ThreadPool.post(new C108643u(rVar, bArr2), "BigSightMediaCodecMP4MuxRecorder_saveThumb");
                        }
                        rVar.f325295D = true;
                    }
                }
            }
        }
    }

    /* renamed from: j72.r$c */
    public class C108636c implements C108606e.C98917a {
        public C108636c() {
        }

        /* renamed from: a */
        public void mo138250a() {
            Log.m105924i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "onPcmReady");
            C108633r rVar = C108633r.this;
            if (rVar.f325320p.f325384a != C108607f.C108610c.Initialized) {
                Log.m105928w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "not MediaStatus.Initialized, maybe canceled by user");
                return;
            }
            rVar.f325313i.mo159670e();
            C108633r.this.f325320p.mo159676a(C108607f.C108610c.Start);
        }
    }

    /* renamed from: j72.r$d */
    public class C108637d implements C108612h {
        public C108637d() {
        }
    }

    /* renamed from: j72.r$e */
    public class C108638e implements C108606e.C98918b {
        public C108638e(C108633r rVar) {
        }

        /* renamed from: a */
        public void mo138251a() {
            Log.m105924i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "aac stop finish");
        }
    }

    /* renamed from: j72.r$f */
    public class C108639f implements C108606e.C98918b {
        public C108639f(C108633r rVar) {
        }

        /* renamed from: a */
        public void mo138251a() {
            Log.m105924i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "aac stop finish");
        }
    }

    public C108633r(VideoTransPara videoTransPara) {
        this.f325293B = videoTransPara;
        this.f325315k = videoTransPara.f267166d;
        this.f325316l = videoTransPara.f267167e;
        int i = videoTransPara.f267169g;
        this.f325317m = i;
        int i2 = C108388k.f324540d.f324554d;
        if (i2 == -1) {
            this.f325317m = i;
        } else {
            this.f325317m = i2;
        }
        this.f325320p = new C108650z();
        Log.m105919d("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "create MMSightMediaCodecMP4MuxRecorder, targetWidth: %s, targetHeight: %s, targetRate: %s", Integer.valueOf(this.f325315k), Integer.valueOf(this.f325316l), Integer.valueOf(this.f325317m));
    }

    /* renamed from: A */
    public final boolean mo159657A(int i) {
        int i2;
        int i3;
        int i4 = i;
        long currentTicks = Util.currentTicks();
        this.f325326v = C108388k.f324540d.f324555e;
        int i5 = this.f325317m;
        int i6 = this.f325318n;
        int i7 = this.f325319o;
        int i8 = this.f325315k;
        int i9 = this.f325316l;
        VideoTransPara videoTransPara = this.f325293B;
        int initDataBufferForMMSightLock = SightVideoJNI.initDataBufferForMMSightLock(i6, i7, i, i8, i9, (float) videoTransPara.f267168f, i5, videoTransPara.f267177r, 8, videoTransPara.f267176q, 23.0f, false, false, videoTransPara.f267170h, false, false, false);
        this.f325322r = initDataBufferForMMSightLock;
        Log.m105925i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init, bufId: %s", Integer.valueOf(initDataBufferForMMSightLock));
        if (this.f325322r < 0) {
            Log.m105920e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init failed!");
            C108389l.m146843d();
            return false;
        }
        this.f325321q = i4;
        int i15 = this.f325318n;
        int i16 = this.f325319o;
        int i17 = this.f325315k;
        int i18 = this.f325316l;
        int i19 = this.f325317m;
        VideoTransPara videoTransPara2 = this.f325293B;
        this.f325313i = new C108646x(i15, i16, i17, i18, i19, videoTransPara2.f267172j, videoTransPara2.f267168f, this.f325326v);
        C108646x xVar = this.f325313i;
        xVar.f325350F = this.f325322r;
        int i25 = -1;
        try {
            xVar.f325375t = i4;
            i2 = xVar.mo159669d();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMSightYUVMediaCodecRecorder", "init error: %s, try to re-init again", e.getMessage());
            try {
                if (CaptureMMProxy.getInstance() != null) {
                    CaptureMMProxy.getInstance().set(C72994y1.C72995a.USERINFO_MMSIGHT_MEDIACODEC_COLORFORMAT_INT, -1);
                }
                i2 = xVar.mo159669d();
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.MMSightYUVMediaCodecRecorder", "re-init again error: %s", e2.getMessage());
                C108389l.m146845f();
                i2 = -1;
            }
        }
        if (!this.f325303L) {
            if (CaptureMMProxy.getInstance() != null) {
                i25 = CaptureMMProxy.getInstance().getInt(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_AUDIO_RECORDER_TYPE_INT_SYNC, -1);
            }
            if (i25 < 0) {
                VideoTransPara videoTransPara3 = this.f325293B;
                C108613i iVar = new C108613i(videoTransPara3.f267174o, videoTransPara3.f267173n, videoTransPara3.f267175p, C85456b.m105448a(false, videoTransPara3.f267164K == 1));
                this.f325312h = iVar;
                iVar.mo138253b(this.f325301J);
                int c = this.f325312h.mo138254c(this.f325322r, C94555d.m119565a(this.f325307c));
                if (i2 < 0 || c < 0) {
                    Log.m105921e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init yuv or aac recorder error!! %d %d", Integer.valueOf(i2), Integer.valueOf(c));
                    if (c < 0 && i2 >= 0) {
                        Log.m105928w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "aac init error, try mediarecorder now");
                        this.f325312h.clear();
                        VideoTransPara videoTransPara4 = this.f325293B;
                        C98919k kVar = new C98919k(videoTransPara4.f267174o, videoTransPara4.f267173n, videoTransPara4.f267175p);
                        this.f325312h = kVar;
                        kVar.mo138253b(this.f325301J);
                        int c2 = this.f325312h.mo138254c(this.f325322r, C94555d.m119565a(this.f325307c));
                        Log.m105929w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "MMSightAACMediaRecorder init ret: %s", Integer.valueOf(c2));
                        if (c2 >= 0) {
                            return true;
                        }
                    }
                    SightVideoJNI.releaseBigSightDataBufferLock(this.f325322r);
                    C108389l.m146843d();
                    return false;
                }
            } else {
                if (i25 == 1) {
                    VideoTransPara videoTransPara5 = this.f325293B;
                    C108613i iVar2 = new C108613i(videoTransPara5.f267174o, videoTransPara5.f267173n, videoTransPara5.f267175p, C85456b.m105448a(false, videoTransPara5.f267164K == 1));
                    this.f325312h = iVar2;
                    iVar2.mo138253b(this.f325301J);
                    i3 = this.f325312h.mo138254c(this.f325322r, C94555d.m119565a(this.f325307c));
                } else if (i25 == 2) {
                    VideoTransPara videoTransPara6 = this.f325293B;
                    C98919k kVar2 = new C98919k(videoTransPara6.f267174o, videoTransPara6.f267173n, videoTransPara6.f267175p);
                    this.f325312h = kVar2;
                    kVar2.mo138253b(this.f325301J);
                    i3 = this.f325312h.mo138254c(this.f325322r, C94555d.m119565a(this.f325307c));
                } else {
                    i3 = 0;
                }
                if (i2 < 0 || i3 < 0) {
                    Log.m105921e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init yuv or aac recorder error!! %d %d", Integer.valueOf(i2), Integer.valueOf(i3));
                    SightVideoJNI.releaseBigSightDataBufferLock(this.f325322r);
                    C108389l.m146843d();
                    return false;
                }
            }
        } else if (i2 < 0) {
            Log.m105921e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mute init yuv recorder error!! %d %d", Integer.valueOf(i2), 0);
            SightVideoJNI.releaseBigSightDataBufferLock(this.f325322r);
            C108389l.m146843d();
            return false;
        }
        Log.m105925i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "initImpl used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
        return true;
    }

    /* renamed from: a */
    public String mo159600a() {
        return this.f325306b;
    }

    /* renamed from: b */
    public String mo159601b() {
        return this.f325328x;
    }

    /* renamed from: c */
    public float mo159602c() {
        return this.f325309e;
    }

    public void cancel() {
        MMHandler mMHandler;
        Log.m105924i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "cancel record");
        if (this.f325313i == null || (this.f325312h == null && !this.f325303L)) {
            Log.m105920e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
            return;
        }
        this.f325320p.mo159676a(C108607f.C108610c.WaitStop);
        this.f325313i.mo159671f((C108612h) null);
        C108606e eVar = this.f325312h;
        if (eVar != null) {
            eVar.mo138252a(new C108639f(this));
        }
        if (!(this.f325323s == null || (mMHandler = this.f325324t) == null)) {
            mMHandler.removeMessages(0);
            this.f325323s.quit();
            this.f325324t = null;
        }
        SightVideoJNI.releaseBigSightDataBufferLock(this.f325322r);
        this.f325320p.mo159676a(C108607f.C108610c.Stop);
        reset();
    }

    public void clear() {
        try {
            Log.m105924i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "clear");
            C108606e eVar = this.f325312h;
            if (eVar != null) {
                eVar.clear();
            }
            if (this.f325313i != null) {
                C108646x xVar = this.f325313i;
                xVar.getClass();
                Log.m105924i("MicroMsg.MMSightYUVMediaCodecRecorder", "clear");
                xVar.mo159667b();
                SightVideoJNI.releaseBigSightDataBufferLock(xVar.f325350F);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMSightMediaCodecMP4MuxRecorder", e, "clear error: %s", e.getMessage());
        }
    }

    /* renamed from: d */
    public void mo159605d(float f) {
        Log.m105925i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "overrideFps: %s", Float.valueOf(f));
        this.f325311g = f;
    }

    /* renamed from: e */
    public void mo159606e(C108607f.C108608a aVar) {
        this.f325299H = aVar;
    }

    /* renamed from: f */
    public boolean mo159607f() {
        return this.f325297F;
    }

    /* renamed from: g */
    public boolean mo159608g() {
        return this.f325295D;
    }

    public String getFilePath() {
        return this.f325307c;
    }

    public C108382h getFrameDataCallback() {
        return this.f325304M;
    }

    public String getMd5() {
        return Util.nullAs(this.f325296E, "");
    }

    /* renamed from: i */
    public void mo159612i(int i, int i2, int i3, int i4) {
        Log.m105925i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        Log.m105925i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "setSize, after align, targetWidth: %d, targetHeight: %d", Integer.valueOf(i3), Integer.valueOf(i4));
        this.f325315k = i3;
        this.f325316l = i4;
        this.f325318n = i;
        this.f325319o = i2;
        C98921l.f289964d.mo126905m(Integer.valueOf(((i * i2) * 3) / 2));
    }

    /* renamed from: j */
    public C108607f.C108610c mo159613j() {
        return this.f325320p.f325384a;
    }

    /* renamed from: k */
    public int mo159614k() {
        return Math.round(((float) this.f325308d) / 1000.0f);
    }

    /* renamed from: m */
    public void mo159615m(String str) {
        this.f325307c = str;
    }

    /* renamed from: n */
    public void mo159616n(Runnable runnable) {
        this.f325300I = runnable;
        Log.m105925i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "!!!!!stop, stopCallback: %s!!!", runnable);
        if (this.f325313i == null || (this.f325312h == null && !this.f325303L)) {
            Log.m105924i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
            if (runnable != null) {
                MMHandlerThread.postToMainThread(runnable);
                return;
            }
            return;
        }
        C108650z zVar = this.f325320p;
        if (zVar == null || zVar.f325384a != C108607f.C108610c.Stop) {
            this.f325304M = null;
            C108646x xVar = this.f325313i;
            long j = 0;
            if (xVar.f325365j <= 0) {
                Log.m105928w("MicroMsg.MMSightYUVMediaCodecRecorder", "do not start record");
            } else {
                j = (System.nanoTime() - xVar.f325365j) / TimeUtil.SECOND_TO_US;
            }
            this.f325308d = (int) j;
            C108650z zVar2 = this.f325320p;
            if (zVar2 != null) {
                zVar2.mo159676a(C108607f.C108610c.PrepareStop);
            }
            if (this.f325313i != null) {
                this.f325313i.mo159671f(new C108637d());
            }
            C108606e eVar = this.f325312h;
            if (eVar != null) {
                eVar.mo138252a(new C108638e(this));
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, already in stop status");
        C108606e eVar2 = this.f325312h;
        if (eVar2 != null) {
            eVar2.clear();
        }
        if (this.f325313i != null) {
            C108646x xVar2 = this.f325313i;
            xVar2.getClass();
            Log.m105924i("MicroMsg.MMSightYUVMediaCodecRecorder", "clear");
            xVar2.mo159667b();
            SightVideoJNI.releaseBigSightDataBufferLock(xVar2.f325350F);
        }
        if (runnable != null) {
            MMHandlerThread.postToMainThread(runnable);
        }
    }

    /* renamed from: o */
    public void mo159617o(int i) {
        Log.m105925i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "overrideDurationMs: %s", Integer.valueOf(i));
        this.f325310f = i;
    }

    /* renamed from: p */
    public boolean mo159618p(int i) {
        if (this.f325294C) {
            return true;
        }
        Log.m105924i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "preInit, cameraOrientation");
        boolean A = mo159657A(i);
        this.f325294C = true;
        Log.m105925i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "initImpl result: %s", Boolean.valueOf(A));
        return A;
    }

    public void pause() {
        Log.m105924i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "pause");
        C108650z zVar = this.f325320p;
        if (zVar != null && zVar.f325384a == C108607f.C108610c.Start) {
            zVar.mo159676a(C108607f.C108610c.Pause);
        }
    }

    /* renamed from: q */
    public void mo159620q(int i, int i2, int i3) {
        Log.m105925i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "resume, cameraOrientation: %s", Integer.valueOf(i));
        C108650z zVar = this.f325320p;
        if (zVar != null && zVar.f325384a == C108607f.C108610c.Pause) {
            if (this.f325313i != null) {
                C108646x xVar = this.f325313i;
                xVar.f325376u = i;
                xVar.f325377v = i2;
                xVar.f325378w = i3;
                Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "resume, newRotation: %s, newFrameWidth: %s, newFrameHeight: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
            this.f325320p.mo159676a(C108607f.C108610c.Start);
        }
    }

    /* renamed from: r */
    public Point mo159621r() {
        return new Point(this.f325318n, this.f325319o);
    }

    public void reset() {
        Log.m105925i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "reset, yuvRecorder: %s, aacRecorder: %s, muxer: %s", this.f325313i, this.f325312h, this.f325314j);
        synchronized (this.f325305a) {
            this.f325313i = null;
        }
        this.f325312h = null;
        this.f325314j = null;
        this.f325294C = false;
        this.f325295D = false;
    }

    /* renamed from: s */
    public long mo159623s() {
        if (this.f325313i == null) {
            return 0;
        }
        C108646x xVar = this.f325313i;
        if (xVar.f325365j > 0) {
            return (System.nanoTime() - xVar.f325365j) / TimeUtil.SECOND_TO_US;
        }
        Log.m105928w("MicroMsg.MMSightYUVMediaCodecRecorder", "do not start record");
        return 0;
    }

    public void setMute(boolean z) {
        this.f325303L = z;
    }

    /* renamed from: t */
    public C89658b mo159626t() {
        C108606e eVar = this.f325312h;
        if (eVar != null) {
            return eVar.mo138257e();
        }
        return null;
    }

    /* renamed from: u */
    public String mo159627u() {
        return this.f325329y;
    }

    /* renamed from: v */
    public void mo159628v(String str) {
        this.f325329y = str;
    }

    /* renamed from: w */
    public void mo159629w(boolean z) {
        this.f325301J = z;
    }

    /* renamed from: x */
    public void mo159630x(String str) {
        this.f325328x = str;
    }

    /* renamed from: y */
    public int mo159631y() {
        return this.f325321q;
    }

    /* renamed from: z */
    public int mo159632z(int i, boolean z, int i2) {
        Log.m105925i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start, cameraOrientation: %s, isLandscape: %s, degree: %s", Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2));
        this.f325330z.mo158896d();
        this.f325308d = 0;
        this.f325292A.mo158896d();
        this.f325327w = false;
        this.f325297F = z;
        this.f325298G = i2;
        this.f325320p.mo159676a(C108607f.C108610c.WaitStart);
        if (Util.isNullOrNil(this.f325307c)) {
            Log.m105920e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start error, mCurRecordPath is null!!");
            return -1;
        }
        try {
            this.f325306b = C86013q1.m106457r(this.f325307c);
            String s = C86013q1.m106458s(this.f325307c);
            if (!s.endsWith("/")) {
                s = s + "/";
            }
            this.f325325u = s + "tempRotate.mp4";
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "retrieve file name error: %s", e.getMessage());
        }
        Log.m105925i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mCurRecordPath: %s, tempRotateFilePath: %s", this.f325307c, this.f325325u);
        this.f325321q = i;
        int i3 = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("BigSightMediaCodecMP4MuxRecorder_writeYuvData_" + hashCode(), -1);
        this.f325323s = a;
        a.start();
        this.f325324t = new C108635b(this.f325323s.getLooper());
        if (!this.f325294C) {
            mo159657A(i);
            this.f325294C = true;
        }
        if (this.f325303L || this.f325301J) {
            Log.m105924i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start yuvRecorder with mute");
            this.f325313i.mo159670e();
            this.f325320p.mo159676a(C108607f.C108610c.Start);
            this.f325295D = false;
            C108389l.m146840a();
            Log.m105924i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecCapture");
            C115669n.INSTANCE.idkeyStat(440, 2, 1, false);
            return 0;
        }
        int f = this.f325312h.mo138258f(new C108636c());
        Log.m105925i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start aacRecorder ret: %s", Integer.valueOf(f));
        this.f325295D = false;
        if (f != 0) {
            this.f325320p.mo159676a(C108607f.C108610c.Error);
        } else {
            this.f325320p.mo159676a(C108607f.C108610c.Initialized);
        }
        C108389l.m146840a();
        Log.m105924i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecCapture");
        C115669n.INSTANCE.idkeyStat(440, 2, 1, false);
        return f;
    }
}
