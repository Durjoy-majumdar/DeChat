package m90;

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
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eu3.C58834h;
import eu3.C97749e;
import f72.C97842b;
import h81.C32735h;
import i72.C108382h;
import i72.C108388k;
import i72.C108392r;
import j72.C108606e;
import j72.C108607f;
import j72.C108611g;
import j72.C108632q;
import j72.C108645w;
import j72.C108650z;
import j72.C98921l;
import lu3.C88654b;
import lu3.C88656g;
import p1054vg.C90801g;
import p375qh.C89658b;
import zt3.C119157j;

/* renamed from: m90.n */
public class C109582n implements C88716b {

    /* renamed from: A */
    public boolean f328040A = false;

    /* renamed from: B */
    public VideoTransPara f328041B;

    /* renamed from: C */
    public boolean f328042C = false;

    /* renamed from: D */
    public C106139e f328043D = null;

    /* renamed from: E */
    public boolean f328044E = false;

    /* renamed from: F */
    public String f328045F = "";

    /* renamed from: G */
    public boolean f328046G = false;

    /* renamed from: H */
    public int f328047H = 0;

    /* renamed from: I */
    public C108607f.C108608a f328048I;

    /* renamed from: J */
    public boolean f328049J = false;

    /* renamed from: K */
    public long f328050K = 0;

    /* renamed from: L */
    public long f328051L = 0;

    /* renamed from: M */
    public boolean f328052M = false;

    /* renamed from: N */
    public boolean f328053N = false;

    /* renamed from: O */
    public C108382h f328054O = new C109583a();

    /* renamed from: a */
    public C109555a f328055a;

    /* renamed from: b */
    public C108645w f328056b;

    /* renamed from: c */
    public C108650z f328057c;

    /* renamed from: d */
    public C109588f f328058d = null;

    /* renamed from: e */
    public C108611g f328059e;

    /* renamed from: f */
    public String f328060f;

    /* renamed from: g */
    public String f328061g = "";

    /* renamed from: h */
    public int f328062h = 0;

    /* renamed from: i */
    public float f328063i = 0.0f;

    /* renamed from: j */
    public int f328064j = -1;

    /* renamed from: k */
    public float f328065k = -1.0f;

    /* renamed from: l */
    public int f328066l = 480;

    /* renamed from: m */
    public int f328067m = 640;

    /* renamed from: n */
    public int f328068n = 1600000;

    /* renamed from: o */
    public int f328069o = 480;

    /* renamed from: p */
    public int f328070p = 640;

    /* renamed from: q */
    public int f328071q = 0;

    /* renamed from: r */
    public String f328072r = null;

    /* renamed from: s */
    public HandlerThread f328073s = null;

    /* renamed from: t */
    public MMHandler f328074t = null;

    /* renamed from: u */
    public int f328075u = -1;

    /* renamed from: v */
    public int f328076v = -1;

    /* renamed from: w */
    public boolean f328077w = false;

    /* renamed from: x */
    public boolean f328078x = false;

    /* renamed from: y */
    public String f328079y = null;

    /* renamed from: z */
    public String f328080z = null;

    /* renamed from: m90.n$a */
    public class C109583a implements C108382h {
        public C109583a() {
        }

        /* renamed from: f */
        public boolean mo157927f(byte[] bArr) {
            if (bArr != null && bArr.length > 0) {
                C109582n nVar = C109582n.this;
                if (nVar.f328057c.f325384a == C108607f.C108610c.Start) {
                    if (!nVar.f328040A) {
                        nVar.f328040A = true;
                        byte[] bArr2 = new byte[bArr.length];
                        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                        ((C119157j) C119157j.f356862d).mo183875f(new C109593p(nVar, bArr2));
                    }
                    if (C109582n.this.f328074t != null) {
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.obj = bArr;
                        C109582n.this.f328074t.sendMessage(obtain);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: m90.n$b */
    public class C109584b implements Runnable {
        public C109584b() {
        }

        public void run() {
            C109582n.this.mo160798C();
        }
    }

    /* renamed from: m90.n$c */
    public class C109585c implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ Runnable f328083d;

        public C109585c(Runnable runnable) {
            this.f328083d = runnable;
        }

        public String getKey() {
            return "MMSightFFMpegRecorder_stop";
        }

        public void run() {
            C109588f fVar;
            C109588f fVar2;
            C109582n nVar = C109582n.this;
            Runnable runnable = this.f328083d;
            nVar.f328057c.mo159676a(C108607f.C108610c.WaitStop);
            C108645w wVar = nVar.f328056b;
            if (wVar != null) {
                int i = wVar.f325340a;
                float a = (((float) wVar.f325341b) * 1000.0f) / ((float) nVar.f328056b.mo159662a());
                Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "stop, bufID %d, frameCount %d, duration %dms, %.6ffps", Integer.valueOf(i), Integer.valueOf(nVar.f328056b.f325341b), Long.valueOf(nVar.f328056b.mo159662a()), Float.valueOf(a));
                Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "stop, accumulatePauseTime:%s", Long.valueOf(nVar.f328050K));
                int a2 = (int) nVar.f328056b.mo159662a();
                nVar.f328062h = a2;
                long j = nVar.f328050K;
                if (j > 0) {
                    nVar.f328062h = (int) (((long) a2) - j);
                }
                nVar.f328063i = a;
                nVar.f328056b.mo159664c();
                C109588f fVar3 = nVar.f328058d;
                if (fVar3 != null) {
                    fVar3.f328089g = a;
                    fVar3.f328090h = nVar.f328062h;
                    fVar3.f328096q = runnable;
                    fVar3.f328091i = true;
                    fVar3.mo97819a();
                }
            }
            C109555a aVar = nVar.f328055a;
            if (aVar != null && !nVar.f328049J) {
                aVar.mo138252a(new C109592o(nVar));
            } else if (nVar.f328052M && (fVar2 = nVar.f328058d) != null) {
                fVar2.f328092j = true;
            }
            nVar.f328057c.mo159676a(C108607f.C108610c.Stop);
            nVar.f328045F = C90801g.m113874b(nVar.f328061g);
            if (nVar.f328058d == null) {
                Log.m105920e("MicroMsg.X264YUVMP4MuxRecorder", "encodeRunnable is null!, directly call stopcallback");
                nVar.reset();
                MMHandlerThread.postToMainThread(runnable);
            }
            if (nVar.f328049J && (fVar = nVar.f328058d) != null) {
                fVar.f328092j = true;
            }
        }
    }

    /* renamed from: m90.n$d */
    public class C109586d implements C108606e.C98917a {
        public C109586d() {
        }

        /* renamed from: a */
        public void mo138250a() {
            C109582n.this.mo160797B();
        }
    }

    /* renamed from: m90.n$e */
    public class C109587e extends MMHandler {
        public C109587e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C109582n nVar = C109582n.this;
            if (nVar.f328075u == -1) {
                nVar.f328075u = Process.myTid();
                Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "writeCameraTid: %s", Integer.valueOf(C109582n.this.f328075u));
            }
            if (message.what == 1) {
                C109582n nVar2 = C109582n.this;
                C109555a aVar = nVar2.f328055a;
                if (aVar != null) {
                    aVar.f325202j = true;
                }
                byte[] bArr = (byte[]) message.obj;
                if (nVar2.f328077w) {
                    nVar2.f328056b.mo159665d(bArr, bArr.length, nVar2.f328069o, nVar2.f328070p);
                } else {
                    C108645w wVar = nVar2.f328056b;
                    int length = bArr.length;
                    int i = nVar2.f328071q;
                    wVar.mo159665d(bArr, length, (i == 90 || i == 270) ? nVar2.f328069o : nVar2.f328070p, (i == 90 || i == 270) ? nVar2.f328070p : nVar2.f328069o);
                }
                C98921l.f289964d.mo138260o(bArr);
                nVar2.f328044E = true;
            }
        }
    }

    /* renamed from: m90.n$f */
    public class C109588f extends C88654b {

        /* renamed from: e */
        public int f328087e;

        /* renamed from: f */
        public volatile int f328088f = 0;

        /* renamed from: g */
        public float f328089g;

        /* renamed from: h */
        public int f328090h;

        /* renamed from: i */
        public boolean f328091i = false;

        /* renamed from: j */
        public boolean f328092j = false;

        /* renamed from: n */
        public boolean f328093n = false;

        /* renamed from: o */
        public boolean f328094o = false;

        /* renamed from: p */
        public final Object f328095p;

        /* renamed from: q */
        public Runnable f328096q;

        /* renamed from: m90.n$f$a */
        public class C109589a implements Runnable {
            public C109589a() {
            }

            public void run() {
                C108607f.C108608a aVar = C109582n.this.f328048I;
                if (aVar != null) {
                    aVar.mo150355d(1);
                }
            }
        }

        /* renamed from: m90.n$f$b */
        public class C109590b implements Runnable {
            public C109590b() {
            }

            public void run() {
                C108607f.C108608a aVar = C109582n.this.f328048I;
                if (aVar != null) {
                    aVar.mo150355d(1);
                }
            }
        }

        /* renamed from: m90.n$f$c */
        public class C109591c implements C88656g {

            /* renamed from: d */
            public final /* synthetic */ String f328100d;

            public C109591c(C109588f fVar, String str) {
                this.f328100d = str;
            }

            public String getKey() {
                return "BigSightFFMpegRecorder_tagRotate_after_process";
            }

            public void run() {
                try {
                    C86013q1.m106447h(this.f328100d);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.X264YUVMP4MuxRecorder", "stop, delete old file error: %s", e.getMessage());
                }
            }
        }

        public C109588f() {
            Object obj = new Object();
            this.f328095p = obj;
            this.f328096q = null;
            synchronized (obj) {
                try {
                    String s = C86013q1.m106458s(C109582n.this.f328061g);
                    if (!s.endsWith("/")) {
                        s = s + "/";
                    }
                    C109582n.this.f328072r = s + "tempRotate.mp4";
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.X264YUVMP4MuxRecorder", "retrieve file name error: %s", e.getMessage());
                }
            }
        }

        public String getKey() {
            return "SightCustomAsyncMediaRecorder_encode";
        }

        public void run() {
            C109582n nVar = C109582n.this;
            if (nVar.f328076v == -1) {
                nVar.f328076v = Process.myTid();
                Process.setThreadPriority(Process.myTid(), -2);
                Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "encodeTid: %s", Integer.valueOf(C109582n.this.f328076v));
            }
            synchronized (this.f328095p) {
                while (!this.f328092j) {
                    long currentTicks = Util.currentTicks();
                    int triggerEncode = SightVideoJNI.triggerEncode(this.f328087e, Math.max(0, this.f328088f), false);
                    Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "ing: trgger encode use %dms, Encode index[%d, %d), threadId: %s", Long.valueOf(Util.ticksToNow(currentTicks)), Integer.valueOf(this.f328088f), Integer.valueOf(triggerEncode), Long.valueOf(Thread.currentThread().getId()));
                    if (Math.abs(triggerEncode - this.f328088f) <= 5) {
                        try {
                            Thread.sleep(100);
                        } catch (Exception unused) {
                            Log.m105920e("MicroMsg.X264YUVMP4MuxRecorder", "thread sleep error");
                        }
                    }
                    this.f328088f = triggerEncode;
                }
                long currentTicks2 = Util.currentTicks();
                if (!this.f328093n) {
                    this.f328088f = SightVideoJNI.triggerEncode(this.f328087e, this.f328088f, true);
                }
                Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "end: trgger encode use %dms, curEncode index %d, markCancel %B, threadId: %s", Long.valueOf(Util.ticksToNow(currentTicks2)), Integer.valueOf(this.f328088f), Boolean.valueOf(this.f328093n), Long.valueOf(Thread.currentThread().getId()));
                if (!this.f328093n) {
                    int max = Math.max(1000, this.f328090h);
                    C109582n nVar2 = C109582n.this;
                    int i = nVar2.f328064j;
                    int i2 = i > 0 ? i : max;
                    float f = this.f328089g;
                    float f2 = nVar2.f328065k;
                    float f3 = f2 > 0.0f ? f2 : f;
                    C106139e eVar = nVar2.f328043D;
                    String str = nVar2.f328061g;
                    int i3 = nVar2.f328068n;
                    VideoTransPara videoTransPara = nVar2.f328041B;
                    nVar2.f328059e = new C108632q(eVar, str, f3, i3, i2, videoTransPara.f267174o, nVar2.f328052M, true, videoTransPara.f267164K == 1);
                    long currentTicks3 = Util.currentTicks();
                    C109582n nVar3 = C109582n.this;
                    boolean a = ((C108632q) nVar3.f328059e).mo159656a(nVar3.f328053N);
                    Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "mux used %sms, success: %s", Long.valueOf(Util.ticksToNow(currentTicks3)), Boolean.valueOf(a));
                    if (!a) {
                        Log.m105920e("MicroMsg.X264YUVMP4MuxRecorder", "mux failed!");
                        SightVideoJNI.releaseBigSightDataBufferLock(this.f328087e);
                        MMHandlerThread.postToMainThread(new C109589a());
                        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureFailed");
                        C115669n.INSTANCE.mo175913w(985, 37, 1);
                        return;
                    }
                    Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureSuccess");
                    C115669n.INSTANCE.mo175913w(985, 39, 1);
                    C109582n nVar4 = C109582n.this;
                    boolean z = nVar4.f328046G;
                    if ((z && nVar4.f328077w) || ((!nVar4.f328077w && !z) || ((z && Math.abs(nVar4.f328071q - nVar4.f328047H) == 0) || C109582n.this.f328047H == 180))) {
                        long currentTicks4 = Util.currentTicks();
                        C109582n nVar5 = C109582n.this;
                        boolean z2 = nVar5.f328077w;
                        int i4 = (z2 || nVar5.f328046G) ? z2 ? nVar5.f328047H : 180 : nVar5.f328071q;
                        if (nVar5.f328047H == 180 && !z2 && (i4 = i4 + 180) > 360) {
                            i4 -= 360;
                        }
                        if (i4 > 0) {
                            SightVideoJNI.tagRotateVideoVFS(nVar5.f328061g, nVar5.f328072r, i4);
                            Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "tagRotateVideo used %sms, cameraOrientation: %s, isLandscape: %s, deviceDegree: %s, rotateDegree: %s", Long.valueOf(Util.ticksToNow(currentTicks4)), Integer.valueOf(C109582n.this.f328071q), Boolean.valueOf(C109582n.this.f328046G), Integer.valueOf(C109582n.this.f328047H), Integer.valueOf(i4));
                            C109582n nVar6 = C109582n.this;
                            String str2 = nVar6.f328072r;
                            try {
                                C86013q1.m106442c(str2, nVar6.f328061g);
                                ((C119157j) C119157j.f356862d).mo183875f(new C109591c(this, str2));
                                Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "tag rotate used %sms", Long.valueOf(Util.ticksToNow(currentTicks4)));
                                try {
                                    C94554a c = C94555d.m119567c(C109582n.this.f328061g, true);
                                    if (c != null) {
                                        int i5 = c.f273444b;
                                        int i6 = c.f273447e;
                                        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureResult, bitrate:" + i5 + ", fps:" + i6);
                                        C115669n nVar7 = C115669n.INSTANCE;
                                        nVar7.mo175913w(985, 38, (long) i5);
                                        nVar7.mo175913w(985, 41, (long) i6);
                                    }
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                                Log.m105920e("MicroMsg.X264YUVMP4MuxRecorder", "stop, copy file error");
                                SightVideoJNI.releaseBigSightDataBufferLock(this.f328087e);
                                MMHandlerThread.postToMainThread(new C109590b());
                                return;
                            }
                        }
                    }
                }
                SightVideoJNI.releaseBigSightDataBufferLock(this.f328087e);
                Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "all finish, callback: %s", this.f328096q);
                C109582n.this.reset();
                MMHandlerThread.postToMainThread(this.f328096q);
                this.f328094o = true;
                C109582n nVar8 = C109582n.this;
                nVar8.f328076v = -1;
                nVar8.f328075u = -1;
            }
        }
    }

    public C109582n(VideoTransPara videoTransPara) {
        boolean z;
        this.f328041B = videoTransPara;
        this.f328066l = videoTransPara.f267166d;
        this.f328067m = videoTransPara.f267167e;
        this.f328068n = videoTransPara.f267169g;
        this.f328057c = new C108650z();
        this.f328042C = false;
        if (this.f328041B.f267164K == 1) {
            Log.m105924i("MicroMsg.WechatSight.PacketMuxerController", "x264YUVMP4MuxRecorderUseFFMpeg hevc");
            z = true;
        } else {
            z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_face_use_ffmpeg_muxer, false);
            Log.m105925i("MicroMsg.WechatSight.PacketMuxerController", "x264YUVMP4MuxRecorderUseFFMpeg:%s", Boolean.valueOf(z));
        }
        this.f328053N = z;
        Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "create X264YUVMP4MuxRecorder, targetWidth: %s, targetHeight: %s, targetRate: %s, enableHevc:%s", Integer.valueOf(this.f328066l), Integer.valueOf(this.f328067m), Integer.valueOf(this.f328068n), Integer.valueOf(videoTransPara.f267164K));
        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markX264Capture");
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(985, 30, 1);
        if (videoTransPara.f267164K == 1) {
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markCaptureUseSwHevc");
            nVar.idkeyStat(985, 182, 1, false);
        }
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* renamed from: A */
    public final boolean mo160796A(int i) {
        int i2;
        int i3;
        ? r7;
        int i4 = i;
        long currentTicks = Util.currentTicks();
        C108392r rVar = C108388k.f324540d;
        if (rVar != null) {
            this.f328077w = rVar.f324555e;
        }
        this.f328071q = i4;
        if (!this.f328077w) {
            i3 = (i4 == 90 || i4 == 270) ? this.f328067m : this.f328066l;
            i2 = (i4 == 90 || i4 == 270) ? this.f328066l : this.f328067m;
        } else {
            i3 = (i4 == 90 || i4 == 270) ? this.f328066l : this.f328067m;
            i2 = (i4 == 90 || i4 == 270) ? this.f328067m : this.f328066l;
        }
        int i5 = this.f328068n;
        int a = C97842b.m126284a(i3);
        int a2 = C97842b.m126284a(i2);
        Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "real width:%d, height:%d", Integer.valueOf(a), Integer.valueOf(a2));
        VideoTransPara videoTransPara = this.f328041B;
        C106139e a3 = C106139e.m142773a(a, a2, i5, (float) videoTransPara.f267168f, videoTransPara.f267164K == 1, this.f328053N);
        if (a3.f316167a < 0) {
            Log.m105920e("MicroMsg.X264YUVMP4MuxRecorder", "init failed!");
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markX264InitFailed");
            C115669n.INSTANCE.mo175913w(985, 31, 1);
            return false;
        }
        this.f328043D = a3;
        String str = "MicroMsg.X264YUVMP4MuxRecorder";
        C108645w wVar = new C108645w(this.f328077w, i, a, a2, this.f328078x);
        this.f328056b = wVar;
        int i6 = a3.f316167a;
        if (i6 < 0) {
            Log.m105920e("MicroMsg.MMSightX264YUVRecorder", "init error, yuv buffer id error");
        } else {
            wVar.f325340a = i6;
            synchronized (C108645w.class) {
                wVar.f325341b = 0;
            }
            wVar.f325342c = 0;
        }
        if (CaptureMMProxy.getInstance() != null) {
            CaptureMMProxy.getInstance().getInt(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_AUDIO_RECORDER_TYPE_INT_SYNC, -1);
        }
        if (!this.f328052M) {
            VideoTransPara videoTransPara2 = this.f328041B;
            r7 = 1;
            C109555a aVar = new C109555a(videoTransPara2.f267174o, videoTransPara2.f267173n, videoTransPara2.f267175p, C85456b.m105448a(true, videoTransPara2.f267164K == 1));
            this.f328055a = aVar;
            aVar.f325203k = this.f328049J;
            if (aVar.mo160781n(a3, C94555d.m119565a(this.f328061g)) < 0) {
                Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markX264AACRecorderInitFailed");
                C115669n.INSTANCE.mo175913w(985, 33, 1);
            }
        } else {
            r7 = 1;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Long.valueOf(Util.ticksToNow(currentTicks));
        objArr[r7] = Integer.valueOf(a3.f316167a);
        Log.m105925i(str, "initImpl used %sms, bufferId:%s", objArr);
        return r7;
    }

    /* renamed from: B */
    public final void mo160797B() {
        Log.m105924i("MicroMsg.X264YUVMP4MuxRecorder", "ashutest::pcm ready");
        C109588f fVar = this.f328058d;
        if (fVar != null && !fVar.f328094o) {
            Log.m105921e("MicroMsg.X264YUVMP4MuxRecorder", "ashutest::OnPcmReady, last encode thread[%s] status error!!! MUST NOT BE HERE", fVar);
            synchronized (this.f328058d.f328095p) {
                mo160799D(this.f328058d.f328087e);
            }
        }
        C108650z zVar = this.f328057c;
        if (zVar.f325384a != C108607f.C108610c.Initialized) {
            Log.m105928w("MicroMsg.X264YUVMP4MuxRecorder", "ashutest::not MediaStatus.Initialized, maybe canceled by user");
            return;
        }
        zVar.mo159676a(C108607f.C108610c.Start);
        C109588f fVar2 = new C109588f();
        this.f328058d = fVar2;
        fVar2.f328087e = this.f328043D.f316167a;
        ((C119157j) C119157j.f356862d).mo183875f(fVar2);
    }

    /* renamed from: C */
    public final void mo160798C() {
        int i;
        C108645w wVar = this.f328056b;
        if (wVar != null) {
            i = wVar.f325340a;
            if (i < 0) {
                Log.m105926v("MicroMsg.X264YUVMP4MuxRecorder", "call clear, but bufID error");
                return;
            }
            wVar.mo159664c();
        } else {
            i = -1;
        }
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Boolean.valueOf(this.f328058d == null);
        C109588f fVar = this.f328058d;
        if (fVar != null && fVar.f328093n) {
            z = true;
        }
        objArr[2] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "ashutest::clear bufID %d, encodeRunnable null ? %B, markCancel %B", objArr);
        if (i >= 0 && !mo160799D(i)) {
            SightVideoJNI.releaseRecorderBufferRefLock("clear");
            SightVideoJNI.releaseBigSightDataBufferLock(i);
        }
        C109555a aVar = this.f328055a;
        if (aVar != null) {
            aVar.mo138252a((C108606e.C98918b) null);
        }
        HandlerThread handlerThread = this.f328073s;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    /* renamed from: D */
    public final boolean mo160799D(int i) {
        C109588f fVar = this.f328058d;
        if (fVar == null || fVar.f328094o) {
            return false;
        }
        if (!fVar.f328091i) {
            fVar.f328096q = null;
            fVar.f328093n = true;
            fVar.f328092j = true;
            fVar.mo97819a();
        }
        synchronized (this.f328058d.f328095p) {
            SightVideoJNI.releaseBigSightDataBufferLock(i);
            int i2 = this.f328058d.f328087e;
            if (i2 != i) {
                SightVideoJNI.releaseBigSightDataBufferLock(i2);
            }
        }
        return true;
    }

    /* renamed from: a */
    public String mo159600a() {
        return this.f328060f;
    }

    /* renamed from: b */
    public String mo159601b() {
        return this.f328079y;
    }

    /* renamed from: c */
    public float mo159602c() {
        return this.f328063i;
    }

    public void cancel() {
        Log.printInfoStack("MicroMsg.X264YUVMP4MuxRecorder", "cancel", new Object[0]);
        this.f328057c.mo159676a(C108607f.C108610c.WaitStop);
        MMHandler mMHandler = this.f328074t;
        if (mMHandler != null) {
            mMHandler.removeMessages(1);
        }
        clear();
        this.f328057c.mo159676a(C108607f.C108610c.Stop);
    }

    public void clear() {
        Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "clear, hasWriteCameraData:%s", Boolean.valueOf(this.f328044E));
        if (this.f328044E) {
            ((C119157j) C119157j.f356862d).mo183875f(new C109584b());
        } else {
            mo160798C();
        }
        this.f328050K = 0;
        this.f328051L = 0;
    }

    /* renamed from: d */
    public void mo159605d(float f) {
        Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "overrideFps: %s", Float.valueOf(f));
        this.f328065k = f;
    }

    /* renamed from: e */
    public void mo159606e(C108607f.C108608a aVar) {
        this.f328048I = aVar;
    }

    /* renamed from: f */
    public boolean mo159607f() {
        return this.f328046G;
    }

    /* renamed from: g */
    public boolean mo159608g() {
        return this.f328044E;
    }

    public String getFilePath() {
        return this.f328061g;
    }

    public C108382h getFrameDataCallback() {
        return this.f328054O;
    }

    public String getMd5() {
        return Util.nullAs(this.f328045F, "");
    }

    /* renamed from: h */
    public void mo123149h() {
    }

    /* renamed from: i */
    public void mo159612i(int i, int i2, int i3, int i4) {
        Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        this.f328069o = i;
        this.f328070p = i2;
        C98921l.f289964d.mo126905m(Integer.valueOf(((i * i2) * 3) / 2));
    }

    /* renamed from: j */
    public C108607f.C108610c mo159613j() {
        return this.f328057c.f325384a;
    }

    /* renamed from: k */
    public int mo159614k() {
        return Math.round(((float) this.f328062h) / 1000.0f);
    }

    /* renamed from: l */
    public void mo123150l(boolean z) {
    }

    /* renamed from: m */
    public void mo159615m(String str) {
        this.f328061g = str;
    }

    /* renamed from: n */
    public void mo159616n(Runnable runnable) {
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(this.f328058d == null);
        C109588f fVar = this.f328058d;
        objArr[1] = Boolean.valueOf(fVar != null && fVar.f328091i);
        C109588f fVar2 = this.f328058d;
        objArr[2] = Boolean.valueOf(fVar2 != null && fVar2.f328092j);
        Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "stop, encodeThread null ? %B, has trigger finish ? %B, has finish callback ? %B", objArr);
        C109588f fVar3 = this.f328058d;
        if (fVar3 == null || !fVar3.f328091i) {
            Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "stopOnCameraDataThread: %s, writeCameraDataHandler: %s", Boolean.FALSE, this.f328074t);
            ((C119157j) C119157j.f356862d).mo183875f(new C109585c(runnable));
            return;
        }
        synchronized (fVar3.f328095p) {
            reset();
            MMHandlerThread.postToMainThread(runnable);
        }
    }

    /* renamed from: o */
    public void mo159617o(int i) {
        Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "overrideDurationMs: %s", Integer.valueOf(i));
        this.f328064j = i;
    }

    /* renamed from: p */
    public boolean mo159618p(int i) {
        if (this.f328042C) {
            return true;
        }
        Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "preInit, cameraOrientation: %s", Integer.valueOf(i));
        boolean A = mo160796A(i);
        this.f328042C = true;
        Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "initImpl result: %s", Boolean.valueOf(A));
        return A;
    }

    public void pause() {
        Log.m105924i("MicroMsg.X264YUVMP4MuxRecorder", "pause");
        C108650z zVar = this.f328057c;
        if (zVar != null && zVar.f325384a == C108607f.C108610c.Start) {
            zVar.mo159676a(C108607f.C108610c.Pause);
            this.f328051L = System.currentTimeMillis();
        }
    }

    /* renamed from: q */
    public void mo159620q(int i, int i2, int i3) {
        Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "resume, cameraOrientation: %s, lastPauseTimeMs:%s", Integer.valueOf(i), Long.valueOf(this.f328051L));
        C108650z zVar = this.f328057c;
        if (zVar != null && zVar.f325384a == C108607f.C108610c.Pause) {
            C108645w wVar = this.f328056b;
            if (wVar != null) {
                wVar.mo159663b(i, i2, i3);
            }
            this.f328057c.mo159676a(C108607f.C108610c.Start);
            if (this.f328051L > 0) {
                this.f328050K += System.currentTimeMillis() - this.f328051L;
            }
        }
    }

    /* renamed from: r */
    public Point mo159621r() {
        return new Point(this.f328069o, this.f328070p);
    }

    public void reset() {
        Log.m105924i("MicroMsg.X264YUVMP4MuxRecorder", "reset");
        this.f328057c.f325384a = C108607f.C108610c.Stop;
        MMHandler mMHandler = this.f328074t;
        if (mMHandler != null) {
            mMHandler.removeMessages(1);
        }
        C109555a aVar = this.f328055a;
        if (aVar != null) {
            aVar.clear();
        }
        C108645w wVar = this.f328056b;
        if (wVar != null) {
            SightVideoJNI.releaseBigSightDataBufferLock(wVar.f325340a);
            wVar.f325340a = -1;
            synchronized (C108645w.class) {
                wVar.f325341b = 0;
            }
            wVar.f325342c = 0;
        }
        clear();
        this.f328044E = false;
    }

    /* renamed from: s */
    public long mo159623s() {
        return this.f328056b.mo159662a();
    }

    public void setMirror(boolean z) {
        this.f328078x = z;
        C108645w wVar = this.f328056b;
        if (wVar != null) {
            wVar.f325347h = z;
        }
    }

    public void setMute(boolean z) {
        Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "setMute:%s", Boolean.valueOf(z));
        this.f328052M = z;
    }

    /* renamed from: t */
    public C89658b mo159626t() {
        C109555a aVar = this.f328055a;
        if (aVar != null) {
            return aVar.f325192I;
        }
        return null;
    }

    /* renamed from: u */
    public String mo159627u() {
        return this.f328080z;
    }

    /* renamed from: v */
    public void mo159628v(String str) {
        this.f328080z = str;
    }

    /* renamed from: w */
    public void mo159629w(boolean z) {
        this.f328049J = z;
    }

    /* renamed from: x */
    public void mo159630x(String str) {
        this.f328079y = str;
    }

    /* renamed from: y */
    public int mo159631y() {
        return this.f328071q;
    }

    /* renamed from: z */
    public int mo159632z(int i, boolean z, int i2) {
        C109555a aVar;
        Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "request start, last status %s, cameraOrientation: %s, isLandscape: %s, degree: %s, bufId:%S", this.f328057c.f325384a, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), this.f328043D);
        this.f328046G = z;
        this.f328050K = 0;
        this.f328051L = 0;
        this.f328062h = 0;
        this.f328047H = i2;
        this.f328057c.mo159676a(C108607f.C108610c.WaitStart);
        Object[] objArr = new Object[3];
        objArr[0] = this.f328061g;
        objArr[1] = Boolean.valueOf(this.f328058d == null);
        C109588f fVar = this.f328058d;
        objArr[2] = Boolean.valueOf(fVar == null || fVar.f328094o);
        Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "initialize: filePath[%s], encodeThread null[%B], encodeThreadFinish[%B]", objArr);
        C109588f fVar2 = this.f328058d;
        if (fVar2 != null && !fVar2.f328094o) {
            Log.m105928w("MicroMsg.X264YUVMP4MuxRecorder", "ERROR, status, wait last encode thread finish!!! MUST NOT BE HERE");
            return -1;
        } else if (Util.isNullOrNil(this.f328061g)) {
            Log.m105920e("MicroMsg.X264YUVMP4MuxRecorder", "start error, mCurRecordPath is null!!");
            return -1;
        } else {
            this.f328060f = C86013q1.m106457r(this.f328061g);
            Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "mCurRecordPath: %s", this.f328061g);
            this.f328071q = i;
            Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "start, cameraOrientation: %s, mute:%s", Integer.valueOf(i), Boolean.valueOf(this.f328052M));
            if (!this.f328042C) {
                mo160796A(i);
                this.f328042C = true;
            }
            C108645w wVar = this.f328056b;
            if (0 == wVar.f325342c) {
                wVar.f325342c = System.currentTimeMillis();
            }
            int f = (this.f328049J || (aVar = this.f328055a) == null) ? 0 : aVar.mo138258f(new C109586d());
            Log.m105925i("MicroMsg.X264YUVMP4MuxRecorder", "start aac recorder ret: %d", Integer.valueOf(f));
            int i3 = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a("BigSightWriteCameraData", 5);
            this.f328073s = a;
            a.start();
            this.f328074t = new C109587e(this.f328073s.getLooper());
            this.f328044E = false;
            if (f != 0) {
                this.f328057c.mo159676a(C108607f.C108610c.Error);
            } else {
                this.f328057c.mo159676a(C108607f.C108610c.Initialized);
            }
            if (this.f328049J || this.f328052M) {
                mo160797B();
            }
            return f;
        }
    }
}
