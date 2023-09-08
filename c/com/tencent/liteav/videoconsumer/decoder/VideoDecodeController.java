package com.tencent.liteav.videoconsumer.decoder;

import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.C113473t;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.TimeUtil;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.p1096b.C104516e;
import com.tencent.liteav.videobase.p1096b.C104518g;
import com.tencent.liteav.videobase.utils.C17250i;
import com.tencent.liteav.videobase.utils.C17251j;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.C17271i;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.consumer.ServerVideoConsumerConfig;
import com.tencent.liteav.videoconsumer.decoder.C17334au;
import com.tencent.liteav.videoconsumer.decoder.C17337b;
import com.tencent.liteav.videoconsumer.decoder.C17340d;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;

public final class VideoDecodeController implements C17336av {

    /* renamed from: a */
    public String f46893a = "VideoDecodeController";

    /* renamed from: b */
    public final IVideoReporter f46894b;

    /* renamed from: c */
    public final C17340d f46895c;

    /* renamed from: d */
    public final C17330as f46896d;

    /* renamed from: e */
    public final boolean f46897e;

    /* renamed from: f */
    public C17111b f46898f;

    /* renamed from: g */
    public C113473t f46899g;

    /* renamed from: h */
    public C17311a f46900h;

    /* renamed from: i */
    public Object f46901i;

    /* renamed from: j */
    public C104516e f46902j;

    /* renamed from: k */
    public boolean f46903k = false;

    /* renamed from: l */
    public C17334au f46904l;

    /* renamed from: m */
    public JSONArray f46905m;

    /* renamed from: n */
    public VideoDecoderDef.ConsumerScene f46906n = VideoDecoderDef.ConsumerScene.UNKNOWN;

    /* renamed from: o */
    public final Deque<EncodedVideoFrame> f46907o = new LinkedList();

    /* renamed from: p */
    public final AtomicInteger f46908p = new AtomicInteger(0);

    /* renamed from: q */
    public final C17250i f46909q = new C17250i(1);

    /* renamed from: r */
    public ServerVideoConsumerConfig f46910r;

    /* renamed from: s */
    public final C17251j f46911s;

    /* renamed from: t */
    private final C17340d.C17345d f46912t;

    /* renamed from: com.tencent.liteav.videoconsumer.decoder.VideoDecodeController$1 */
    public static /* synthetic */ class C173101 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46913a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tencent.liteav.videoconsumer.decoder.d$c[] r0 = com.tencent.liteav.videoconsumer.decoder.C17340d.C17344c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46913a = r0
                com.tencent.liteav.videoconsumer.decoder.d$c r1 = com.tencent.liteav.videoconsumer.decoder.C17340d.C17344c.DROP_FRAME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46913a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.liteav.videoconsumer.decoder.d$c r1 = com.tencent.liteav.videoconsumer.decoder.C17340d.C17344c.CONTINUE_DECODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46913a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.liteav.videoconsumer.decoder.d$c r1 = com.tencent.liteav.videoconsumer.decoder.C17340d.C17344c.SWITCH_TO_HARDWARE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46913a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.liteav.videoconsumer.decoder.d$c r1 = com.tencent.liteav.videoconsumer.decoder.C17340d.C17344c.SWITCH_TO_SOFTWARE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46913a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.liteav.videoconsumer.decoder.d$c r1 = com.tencent.liteav.videoconsumer.decoder.C17340d.C17344c.RESTART_DECODER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46913a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tencent.liteav.videoconsumer.decoder.d$c r1 = com.tencent.liteav.videoconsumer.decoder.C17340d.C17344c.REQUEST_KEY_FRAME     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46913a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tencent.liteav.videoconsumer.decoder.d$c r1 = com.tencent.liteav.videoconsumer.decoder.C17340d.C17344c.REPORT_DECODE_ERROR     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoconsumer.decoder.VideoDecodeController.C173101.<clinit>():void");
        }
    }

    public enum DecodeStrategy {
        PREFER_HARDWARE(0),
        PREFER_SOFTWARE(1),
        USE_HARDWARE_ONLY(2),
        USE_SOFTWARE_ONLY(3),
        PREFER_STRONG_HARDWARE(4);
        

        /* renamed from: f */
        private static final DecodeStrategy[] f46919f = null;
        private final int mValue;

        /* access modifiers changed from: public */
        static {
            f46919f = values();
        }

        private DecodeStrategy(int i) {
            this.mValue = i;
        }

        /* renamed from: a */
        public static DecodeStrategy m17241a(int i) {
            for (DecodeStrategy decodeStrategy : f46919f) {
                if (decodeStrategy.mValue == i) {
                    return decodeStrategy;
                }
            }
            return PREFER_HARDWARE;
        }
    }

    /* renamed from: com.tencent.liteav.videoconsumer.decoder.VideoDecodeController$a */
    public interface C17311a extends C17336av {
    }

    public VideoDecodeController(IVideoReporter iVideoReporter) {
        C17340d.C17345d a = C17368y.m17334a();
        this.f46912t = a;
        this.f46894b = iVideoReporter;
        this.f46897e = false;
        C17337b unused = C17337b.C17338a.f46985a;
        boolean a2 = ExternalDecodeFactoryManager.m17221a();
        C17337b unused2 = C17337b.C17338a.f46985a;
        this.f46895c = new C17340d(a, iVideoReporter, a2, C17337b.m17268b());
        this.f46896d = new C17330as(iVideoReporter);
        this.f46893a += "_" + hashCode();
        this.f46911s = new C17251j("decoder" + hashCode());
        LiteavLog.m16901i(this.f46893a, "mIsTranscodingMode=" + false);
    }

    /* renamed from: b */
    private void m17224b(EncodedVideoFrame encodedVideoFrame) {
        synchronized (this) {
            this.f46907o.remove(encodedVideoFrame);
        }
    }

    /* renamed from: a */
    public final void mo20375a(Object obj) {
        LiteavLog.m16901i(this.f46893a, "setSharedEGLContext");
        mo20376a(C17324am.m17250a(this, obj));
    }

    /* renamed from: c */
    public final void mo20337c() {
        mo20376a(C17321aj.m17247a(this));
    }

    /* renamed from: d */
    public final void mo20338d() {
        mo20376a(C17322ak.m17248a(this));
    }

    /* renamed from: e */
    public final void mo20339e() {
        mo20376a(C17323al.m17249a(this));
    }

    /* renamed from: f */
    public final void mo20377f() {
        LiteavLog.m16901i(this.f46893a, "initializeEGLCoreInternal()");
        C104516e eVar = new C104516e();
        this.f46902j = eVar;
        try {
            eVar.mo147196a(this.f46901i, (Surface) null, 128, 128);
            this.f46911s.mo20231a((C17223e) null);
        } catch (C104518g e) {
            LiteavLog.m16899e(this.f46893a, "create egl core failed.", (Throwable) e);
            this.f46894b.notifyWarning(C17263h.C17270c.WARNING_VIDEO_DECODE_EGL_CORE_CREATE_FAILED, "VideoDecode: create EGLCore failed", new Object[0]);
            this.f46902j = null;
        }
    }

    /* renamed from: g */
    public final void mo20378g() {
        LiteavLog.m16901i(this.f46893a, "uninitializeEGLCoreInternal()");
        if (this.f46902j != null) {
            this.f46911s.mo20228a();
            C104516e.m139822a(this.f46902j);
            this.f46902j = null;
        }
    }

    /* renamed from: h */
    public final void mo20379h() {
        EncodedVideoFrame peekFirst;
        EncodedVideoFrame peekLast;
        int size;
        C17340d.C17344c cVar;
        C17340d.C17344c cVar2;
        synchronized (this) {
            peekFirst = this.f46907o.peekFirst();
            peekLast = this.f46907o.peekLast();
            size = this.f46907o.size();
        }
        if (peekFirst != null) {
            if (peekFirst.isEosFrame) {
                m17222a(peekFirst);
                return;
            }
            peekFirst.updateNALTypeAccordingNALHeader();
            if (peekLast != null && !this.f46897e) {
                C17340d dVar = this.f46895c;
                long j = peekLast.pts - peekFirst.pts;
                if (j >= 0 && size >= 0) {
                    dVar.f47014z = j;
                    dVar.f46987A = size;
                }
            }
            C17340d dVar2 = this.f46895c;
            long j2 = dVar2.f46999k;
            if (j2 == 0 || peekFirst.pts != j2) {
                if (dVar2.f47010v == 0) {
                    dVar2.f47010v = peekFirst.pts;
                    dVar2.f47011w.f339519a = SystemClock.elapsedRealtime();
                }
                if (dVar2.f47011w.mo169948a()) {
                    dVar2.f47012x = Math.min(((float) (peekFirst.pts - dVar2.f47010v)) / 1000.0f, 3.0f);
                    dVar2.f47010v = peekFirst.pts;
                }
                if (peekFirst.isIDRFrame()) {
                    if (!dVar2.f47003o) {
                        dVar2.f47003o = true;
                    }
                    C17340d.C17343b bVar = null;
                    for (C17340d.C17342a a : Arrays.asList(new C17340d.C17342a[]{new C17347e(dVar2), new C17348f(dVar2), new C17349g(dVar2), new C17350h(dVar2), new C17351i(dVar2), new C17352j(dVar2), new C17353k(dVar2), new C17354l(dVar2), new C17355m(dVar2)})) {
                        C17340d.C17343b a2 = a.mo20419a(peekFirst);
                        if (a2 != null) {
                            if (bVar != null) {
                                if (!(a2.f47016a.mPriority > bVar.f47016a.mPriority || (a2.f47016a.mPriority == bVar.f47016a.mPriority && a2.f47017b.mPriority > bVar.f47017b.mPriority))) {
                                }
                            }
                            bVar = a2;
                        }
                    }
                    if (!(bVar == null || bVar.f47016a == C17340d.C17344c.CONTINUE_DECODE)) {
                        LiteavLog.m16905w(dVar2.f46989a, bVar + ", mUsingDecoderType = " + dVar2.f46996h + ", mSwitchReason = " + dVar2.f46998j);
                    }
                    if (bVar == null) {
                        bVar = new C17340d.C17343b(C17340d.C17344c.CONTINUE_DECODE, C17340d.C17346e.NONE);
                    }
                    C17340d.C17344c cVar3 = bVar.f47016a;
                    if (cVar3 == C17340d.C17344c.SWITCH_TO_HARDWARE) {
                        C17334au.C17335a aVar = dVar2.f46996h;
                        C17334au.C17335a aVar2 = C17334au.C17335a.HARDWARE;
                        if (aVar != aVar2) {
                            C17340d.C17346e eVar = bVar.f47017b;
                            if (eVar.mPriority >= dVar2.f46998j.mPriority) {
                                dVar2.f46998j = eVar;
                                dVar2.f46996h = aVar2;
                                dVar2.f46991c.notifyEvent(C17263h.C17269b.EVT_VIDEO_DECODE_TYPE_CHANGE, "UsingDecoderType:" + dVar2.f46996h, new Object[0]);
                            }
                        }
                        cVar = C17340d.C17344c.CONTINUE_DECODE;
                    } else if (cVar3 == C17340d.C17344c.SWITCH_TO_SOFTWARE) {
                        C17334au.C17335a aVar3 = dVar2.f46996h;
                        C17334au.C17335a aVar4 = C17334au.C17335a.SOFTWARE;
                        if (aVar3 != aVar4) {
                            C17340d.C17346e eVar2 = bVar.f47017b;
                            if (eVar2.mPriority >= dVar2.f46998j.mPriority) {
                                dVar2.f46998j = eVar2;
                                dVar2.f46996h = aVar4;
                                dVar2.f46991c.notifyEvent(C17263h.C17269b.EVT_VIDEO_DECODE_TYPE_CHANGE, "UsingDecoderType:" + dVar2.f46996h, new Object[0]);
                            }
                        }
                        cVar = C17340d.C17344c.CONTINUE_DECODE;
                    }
                    cVar = bVar.f47016a;
                } else {
                    if (!dVar2.f46988B) {
                        if (dVar2.f47003o) {
                            cVar = C17340d.C17344c.CONTINUE_DECODE;
                        } else {
                            int i = dVar2.f47004p + 1;
                            dVar2.f47004p = i;
                            if (i > 40) {
                                LiteavLog.m16905w(dVar2.f46989a, "decoding too many frame(>40) without output! request key frame now.");
                                dVar2.f47004p = 0;
                                cVar = C17340d.C17344c.REQUEST_KEY_FRAME;
                            }
                        }
                    }
                    cVar = C17340d.C17344c.DROP_FRAME;
                }
            } else {
                cVar = C17340d.C17344c.CONTINUE_DECODE;
            }
            C17340d.C17344c cVar4 = C17340d.C17344c.CONTINUE_DECODE;
            if (cVar == cVar4) {
                if (dVar2.f47013y == 0 || TimeUtil.m16909a() - dVar2.f47013y < 1500) {
                    cVar = cVar4;
                } else if (!peekFirst.isIDRFrame()) {
                    cVar = C17340d.C17344c.DROP_FRAME;
                } else {
                    C17334au.C17335a aVar5 = dVar2.f46996h;
                    C17334au.C17335a aVar6 = C17334au.C17335a.HARDWARE;
                    if (aVar5 == aVar6 && dVar2.mo20418b(peekFirst)) {
                        dVar2.f46996h = C17334au.C17335a.SOFTWARE;
                        dVar2.f46998j = C17340d.C17346e.DECODE_ERROR;
                        dVar2.f46991c.notifyEvent(C17263h.C17269b.EVT_VIDEO_DECODE_TYPE_CHANGE, "UsingDecoderType:" + dVar2.f46996h, new Object[0]);
                        cVar2 = C17340d.C17344c.SWITCH_TO_SOFTWARE;
                    } else if (dVar2.f46996h != C17334au.C17335a.SOFTWARE || !dVar2.mo20416a(peekFirst)) {
                        cVar2 = C17340d.C17344c.RESTART_DECODER;
                    } else {
                        dVar2.f46996h = aVar6;
                        dVar2.f46998j = C17340d.C17346e.DECODE_ERROR;
                        dVar2.f46991c.notifyEvent(C17263h.C17269b.EVT_VIDEO_DECODE_TYPE_CHANGE, "UsingDecoderType:" + dVar2.f46996h, new Object[0]);
                        cVar2 = C17340d.C17344c.SWITCH_TO_HARDWARE;
                    }
                    LiteavLog.m16901i(dVar2.f46989a, "decoder thread stuck, switch decode type, instruction:".concat(String.valueOf(cVar)));
                }
            }
            int i2 = C17340d.C173411.f47015a[cVar.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                dVar2.f47005q = 1;
                dVar2.f46997i = peekFirst.isH265();
                dVar2.f47013y = 0;
            } else if (i2 == 4) {
                if (dVar2.f46999k != peekFirst.pts) {
                    dVar2.f47005q++;
                    dVar2.f47013y = 0;
                } else if (dVar2.f47013y == 0) {
                    dVar2.f47013y = TimeUtil.m16909a();
                }
            }
            dVar2.f46999k = peekFirst.pts;
            switch (C173101.f46913a[cVar.ordinal()]) {
                case 1:
                    this.f46894b.updateStatus(C17271i.STATUS_VIDEO_DROP_FRAME, 0);
                    m17224b(peekFirst);
                    peekFirst.release();
                    return;
                case 2:
                    m17222a(peekFirst);
                    return;
                case 3:
                    m17223a(peekFirst, C17334au.C17335a.HARDWARE);
                    m17222a(peekFirst);
                    return;
                case 4:
                    m17223a(peekFirst, C17334au.C17335a.SOFTWARE);
                    m17222a(peekFirst);
                    return;
                case 5:
                    C17334au.C17335a j3 = mo20381j();
                    if (j3 != null) {
                        m17223a(peekFirst, j3);
                        m17222a(peekFirst);
                        return;
                    }
                    return;
                case 6:
                    m17224b(peekFirst);
                    peekFirst.release();
                    C17311a aVar7 = this.f46900h;
                    if (aVar7 != null) {
                        aVar7.mo20336b();
                        return;
                    }
                    return;
                case 7:
                    m17224b(peekFirst);
                    peekFirst.release();
                    C17311a aVar8 = this.f46900h;
                    if (aVar8 != null) {
                        aVar8.mo20333a();
                        this.f46894b.notifyWarning(C17263h.C17270c.WARNING_VIDEO_DECODE_FATAL_ERROR, "decoder error", new Object[0]);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: i */
    public final int mo20380i() {
        int size;
        synchronized (this) {
            size = this.f46907o.size();
        }
        return size;
    }

    /* renamed from: j */
    public final C17334au.C17335a mo20381j() {
        C17334au auVar = this.f46904l;
        if (auVar == null) {
            return null;
        }
        return auVar.getDecoderType();
    }

    /* renamed from: k */
    public final void mo20382k() {
        C17334au auVar = this.f46904l;
        if (auVar != null) {
            auVar.stop();
            this.f46904l.uninitialize();
            this.f46904l = null;
        }
        this.f46909q.mo20219b();
    }

    /* renamed from: l */
    public final boolean mo20383l() {
        try {
            this.f46902j.mo147195a();
            return true;
        } catch (C104518g e) {
            LiteavLog.m16899e(this.f46893a, "make current failed.", (Throwable) e);
            return false;
        }
    }

    /* renamed from: a */
    private void m17223a(EncodedVideoFrame encodedVideoFrame, C17334au.C17335a aVar) {
        if (this.f46902j == null) {
            LiteavLog.m16898e(this.f46893a, "updateDecoderType mEGLCore is null");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        mo20382k();
        SpsInfo a = this.f46912t.mo20421a(encodedVideoFrame.isH265(), encodedVideoFrame.data);
        if (aVar == C17334au.C17335a.SOFTWARE) {
            this.f46904l = new SoftwareVideoDecoder(this.f46894b);
        } else {
            MediaFormat mediaFormat = encodedVideoFrame.videoFormat;
            if (mediaFormat != null) {
                this.f46904l = new C17359q(mediaFormat, this.f46905m, this.f46894b);
            } else {
                this.f46904l = new C17359q(new C104507p(a.width, a.height), encodedVideoFrame.isH265(), this.f46905m, this.f46894b);
            }
        }
        this.f46904l.initialize();
        this.f46904l.setServerConfig(this.f46910r);
        this.f46904l.setScene(this.f46906n);
        this.f46904l.start(this.f46902j.mo147198c(), this);
        this.f46908p.set(0);
        String str = this.f46893a;
        LiteavLog.m16901i(str, "open decoder cost time: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + ",update decoder type to " + aVar + ", video " + a);
        this.f46896d.mo20409a(this.f46904l.getDecoderType(), encodedVideoFrame.isH265());
    }

    /* renamed from: b */
    public final void mo20336b() {
        mo20376a(C17320ai.m17246a(this));
    }

    /* renamed from: a */
    private void m17222a(EncodedVideoFrame encodedVideoFrame) {
        C17334au auVar = this.f46904l;
        if (auVar == null) {
            LiteavLog.m16898e(this.f46893a, "video decoder is null!");
        } else if (auVar.decode(encodedVideoFrame)) {
            m17224b(encodedVideoFrame);
            if (!encodedVideoFrame.isEosFrame) {
                this.f46896d.mo20408a(encodedVideoFrame);
                this.f46908p.incrementAndGet();
                this.f46894b.updateStatus(C17271i.STATUS_VIDEO_DECODER_CACHE, Integer.valueOf(this.f46908p.get() + mo20380i()));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo20376a(Runnable runnable) {
        boolean z;
        C17111b bVar = this.f46898f;
        if (bVar == null || !bVar.getLooper().getThread().isAlive()) {
            z = false;
        } else if (Looper.myLooper() == bVar.getLooper()) {
            runnable.run();
            z = true;
        } else {
            z = bVar.post(runnable);
        }
        if (!z) {
            String str = this.f46893a;
            LiteavLog.m16905w(str, "runnable:" + runnable + " is failed to post, handler:" + bVar);
        }
        return z;
    }

    /* renamed from: a */
    public final void mo20334a(long j) {
        this.f46908p.decrementAndGet();
        mo20376a(C17316ae.m17243a(this, j));
    }

    /* renamed from: a */
    public final void mo20335a(PixelFrame pixelFrame, long j) {
        this.f46909q.mo20218a(pixelFrame);
        if (!mo20376a(C17317af.m17244a(this, j))) {
            this.f46909q.mo20226b(pixelFrame);
        }
    }

    /* renamed from: a */
    public final void mo20333a() {
        mo20376a(C17319ah.m17245a(this));
    }
}
