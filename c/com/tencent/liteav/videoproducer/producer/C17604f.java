package com.tencent.liteav.videoproducer.producer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.TimeUtil;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.common.SnapshotSourceType;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.p1096b.C104516e;
import com.tencent.liteav.videobase.p1096b.C104518g;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.C17253a;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.C17271i;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.consumer.C17272a;
import com.tencent.liteav.videoconsumer.renderer.C17380g;
import com.tencent.liteav.videoconsumer.renderer.C17383i;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;
import com.tencent.liteav.videoproducer.capture.C104533au;
import com.tencent.liteav.videoproducer.capture.C17405ah;
import com.tencent.liteav.videoproducer.capture.C17455s;
import com.tencent.liteav.videoproducer.capture.CameraCaptureParams;
import com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.capture.ScreenCapturer;
import com.tencent.liteav.videoproducer.capture.VirtualCamera;
import com.tencent.liteav.videoproducer.encoder.C17465a;
import com.tencent.liteav.videoproducer.encoder.C17474ah;
import com.tencent.liteav.videoproducer.encoder.C17480al;
import com.tencent.liteav.videoproducer.encoder.C17481am;
import com.tencent.liteav.videoproducer.encoder.C17482an;
import com.tencent.liteav.videoproducer.encoder.C17483ao;
import com.tencent.liteav.videoproducer.encoder.C17488at;
import com.tencent.liteav.videoproducer.encoder.C17493ay;
import com.tencent.liteav.videoproducer.encoder.C17494az;
import com.tencent.liteav.videoproducer.encoder.C17496ba;
import com.tencent.liteav.videoproducer.encoder.VideoEncodeParams;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.preprocessor.BeautyProcessor;
import com.tencent.liteav.videoproducer.preprocessor.C17541ag;
import com.tencent.liteav.videoproducer.preprocessor.VideoPreprocessor;
import com.tencent.liteav.videoproducer.producer.C17600d;
import com.tencent.liteav.videoproducer.producer.C17602e;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;
import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import com.tencent.rtmp.p899ui.C106891a;
import com.tencent.rtmp.p899ui.C106892b;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.wxmm.v2helper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.tencent.liteav.videoproducer.producer.f */
public final class C17604f implements CaptureSourceInterface.C17399a, C17541ag, C17600d.C17601a, C106891a, C106892b {

    /* renamed from: A */
    private final ConcurrentHashMap<VideoProducerDef.StreamType, C17474ah> f47887A;

    /* renamed from: B */
    private DisplayTarget f47888B;

    /* renamed from: C */
    private Rotation f47889C;

    /* renamed from: D */
    private GLConstants.MirrorMode f47890D;

    /* renamed from: E */
    private GLConstants.GLScaleType f47891E;

    /* renamed from: F */
    private volatile VideoRenderListener f47892F;

    /* renamed from: G */
    private C17380g f47893G;

    /* renamed from: H */
    private VideoRenderListener f47894H;

    /* renamed from: I */
    private C17380g f47895I;

    /* renamed from: J */
    private VideoRenderListener f47896J;

    /* renamed from: K */
    private C17572a f47897K;

    /* renamed from: L */
    private final C104507p f47898L;

    /* renamed from: M */
    private final C104507p f47899M;

    /* renamed from: N */
    private final C17602e f47900N;

    /* renamed from: O */
    private boolean f47901O;

    /* renamed from: P */
    private boolean f47902P;

    /* renamed from: Q */
    private boolean f47903Q;

    /* renamed from: R */
    private final C104507p f47904R;

    /* renamed from: a */
    public String f47905a = "VideoProducer";

    /* renamed from: b */
    public final IVideoReporter f47906b;

    /* renamed from: c */
    public final VideoPreprocessor f47907c;

    /* renamed from: d */
    public final BeautyProcessor f47908d;

    /* renamed from: e */
    public C17111b f47909e;

    /* renamed from: f */
    public volatile boolean f47910f = false;

    /* renamed from: g */
    private final Context f47911g;

    /* renamed from: h */
    private C104516e f47912h;

    /* renamed from: i */
    private Object f47913i = null;

    /* renamed from: j */
    private ServerVideoProducerConfig f47914j;

    /* renamed from: k */
    private VideoProducerDef.GSensorMode f47915k = VideoProducerDef.GSensorMode.UI_FIX_LAYOUT;

    /* renamed from: l */
    private Rotation f47916l;

    /* renamed from: m */
    private int f47917m;

    /* renamed from: n */
    private C17600d f47918n;

    /* renamed from: o */
    private boolean f47919o;

    /* renamed from: p */
    private volatile CaptureSourceInterface.SourceType f47920p;

    /* renamed from: q */
    private CaptureSourceInterface f47921q;

    /* renamed from: r */
    private CaptureSourceInterface.CaptureParams f47922r;

    /* renamed from: s */
    private final C17596ax f47923s;

    /* renamed from: t */
    private PixelFrame f47924t;

    /* renamed from: u */
    private final ConcurrentHashMap<VideoProducerDef.StreamType, GLConstants.Orientation> f47925u;

    /* renamed from: v */
    private Rotation f47926v;

    /* renamed from: w */
    private Rotation f47927w;

    /* renamed from: x */
    private boolean f47928x;

    /* renamed from: y */
    private JSONArray f47929y;

    /* renamed from: z */
    private final Map<VideoProducerDef.StreamType, VideoEncoderDef.EncodeStrategy> f47930z;

    /* renamed from: com.tencent.liteav.videoproducer.producer.f$4 */
    public static /* synthetic */ class C176084 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47933a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tencent.liteav.videoproducer.producer.VideoProducerDef$HomeOrientation[] r0 = com.tencent.liteav.videoproducer.producer.VideoProducerDef.HomeOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47933a = r0
                com.tencent.liteav.videoproducer.producer.VideoProducerDef$HomeOrientation r1 = com.tencent.liteav.videoproducer.producer.VideoProducerDef.HomeOrientation.RIGHT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47933a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.liteav.videoproducer.producer.VideoProducerDef$HomeOrientation r1 = com.tencent.liteav.videoproducer.producer.VideoProducerDef.HomeOrientation.UP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47933a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.liteav.videoproducer.producer.VideoProducerDef$HomeOrientation r1 = com.tencent.liteav.videoproducer.producer.VideoProducerDef.HomeOrientation.LEFT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47933a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.liteav.videoproducer.producer.VideoProducerDef$HomeOrientation r1 = com.tencent.liteav.videoproducer.producer.VideoProducerDef.HomeOrientation.DOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47933a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.liteav.videoproducer.producer.VideoProducerDef$HomeOrientation r1 = com.tencent.liteav.videoproducer.producer.VideoProducerDef.HomeOrientation.UNSET     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.producer.C17604f.C176084.<clinit>():void");
        }
    }

    public C17604f(Context context, boolean z, IVideoReporter iVideoReporter) {
        Rotation rotation = Rotation.NORMAL;
        this.f47916l = rotation;
        this.f47917m = 0;
        this.f47919o = false;
        this.f47920p = CaptureSourceInterface.SourceType.NONE;
        this.f47926v = rotation;
        this.f47927w = rotation;
        this.f47928x = false;
        this.f47929y = null;
        this.f47930z = new HashMap<VideoProducerDef.StreamType, VideoEncoderDef.EncodeStrategy>() {
            {
                VideoProducerDef.StreamType streamType = VideoProducerDef.StreamType.STREAM_TYPE_BIG_VIDEO;
                VideoEncoderDef.EncodeStrategy encodeStrategy = VideoEncoderDef.EncodeStrategy.PREFER_HARDWARE;
                put(streamType, encodeStrategy);
                put(VideoProducerDef.StreamType.STREAM_TYPE_SMALL_VIDEO, VideoEncoderDef.EncodeStrategy.USE_SOFTWARE_ONLY);
                put(VideoProducerDef.StreamType.STREAM_TYPE_SUB_VIDEO, encodeStrategy);
            }
        };
        this.f47889C = rotation;
        this.f47890D = GLConstants.MirrorMode.AUTO;
        this.f47891E = GLConstants.GLScaleType.CENTER_CROP;
        this.f47893G = null;
        this.f47894H = new VideoRenderListener() {
            public final void onRenderFrame(PixelFrame pixelFrame) {
                C17604f.this.m17823a(pixelFrame);
            }

            public final void onRenderTargetSizeChanged(int i, int i2) {
            }
        };
        this.f47895I = null;
        this.f47896J = new VideoRenderListener() {
            public final void onRenderFrame(PixelFrame pixelFrame) {
                C17604f.m17863b(C17604f.this, pixelFrame);
            }

            public final void onRenderTargetSizeChanged(int i, int i2) {
            }
        };
        this.f47898L = new C104507p();
        this.f47899M = new C104507p();
        this.f47900N = new C17602e();
        this.f47901O = false;
        this.f47902P = false;
        this.f47903Q = false;
        this.f47904R = new C104507p(0, 0);
        this.f47911g = context;
        this.f47906b = iVideoReporter;
        BeautyProcessor beautyProcessor = new BeautyProcessor(context, z, iVideoReporter);
        this.f47908d = beautyProcessor;
        this.f47907c = new VideoPreprocessor(context, beautyProcessor, iVideoReporter);
        this.f47887A = new ConcurrentHashMap<>();
        this.f47925u = new ConcurrentHashMap<>();
        this.f47923s = new C17596ax(context);
        this.f47905a += "_" + hashCode();
    }

    /* renamed from: b */
    public static /* synthetic */ void m17864b(C17604f fVar, Rotation rotation) {
        LiteavLog.m16902i(fVar.f47905a, "setEncodeRotation rotation: %s, GSensor mode: %s", rotation, fVar.f47915k);
        if (fVar.f47927w != rotation) {
            fVar.f47927w = rotation;
            fVar.m17884i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        r3.f47907c.uninitialize();
        r3.f47893G = null;
        r3.f47895I = null;
        r3.m17877f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        r0.mo19360a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m17869c(com.tencent.liteav.videoproducer.producer.C17604f r3) {
        /*
            java.lang.String r0 = r3.f47905a
            java.lang.String r1 = "uninitialize"
            com.tencent.liteav.base.util.LiteavLog.m16901i(r0, r1)
            r3.m17868c()
            java.util.concurrent.ConcurrentHashMap<com.tencent.liteav.videoproducer.producer.VideoProducerDef$StreamType, com.tencent.liteav.videoproducer.encoder.ah> r0 = r3.f47887A
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0015:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r0.next()
            com.tencent.liteav.videoproducer.encoder.ah r1 = (com.tencent.liteav.videoproducer.encoder.C17474ah) r1
            if (r1 == 0) goto L_0x0015
            r1.mo20703d()
            r1.mo20704e()
            r1.mo20700b()
            goto L_0x0015
        L_0x002d:
            java.util.concurrent.ConcurrentHashMap<com.tencent.liteav.videoproducer.producer.VideoProducerDef$StreamType, com.tencent.liteav.videoproducer.encoder.ah> r0 = r3.f47887A
            r0.clear()
            com.tencent.liteav.videoproducer.producer.ax r0 = r3.f47923s
            com.tencent.liteav.base.util.p r1 = new com.tencent.liteav.base.util.p
            r1.<init>()
            r0.mo20909b(r1)
            monitor-enter(r3)
            boolean r0 = r3.f47910f     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = r3.f47905a     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "videoproducer already uninitialize."
            com.tencent.liteav.base.util.LiteavLog.m16905w(r0, r1)     // Catch:{ all -> 0x0066 }
            monitor-exit(r3)     // Catch:{ all -> 0x0066 }
            return
        L_0x004b:
            com.tencent.liteav.base.util.b r0 = r3.f47909e     // Catch:{ all -> 0x0066 }
            r1 = 0
            r3.f47909e = r1     // Catch:{ all -> 0x0066 }
            r2 = 0
            r3.f47910f = r2     // Catch:{ all -> 0x0066 }
            monitor-exit(r3)     // Catch:{ all -> 0x0066 }
            com.tencent.liteav.videoproducer.preprocessor.VideoPreprocessor r2 = r3.f47907c
            r2.uninitialize()
            r3.f47893G = r1
            r3.f47895I = r1
            r3.m17877f()
            if (r0 == 0) goto L_0x0065
            r0.mo19360a()
        L_0x0065:
            return
        L_0x0066:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.producer.C17604f.m17869c(com.tencent.liteav.videoproducer.producer.f):void");
    }

    /* renamed from: d */
    public static /* synthetic */ void m17872d(C17604f fVar) {
        fVar.f47907c.initialize();
        fVar.f47893G = new C17383i(fVar.f47909e.getLooper(), fVar.f47906b);
    }

    /* renamed from: e */
    private void m17876e(boolean z) {
        DisplayTarget displayTarget = this.f47888B;
        C17604f fVar = null;
        TXCloudVideoView tXCloudVideoView = displayTarget == null ? null : displayTarget.getTXCloudVideoView();
        if (tXCloudVideoView == null) {
            LiteavLog.m16898e(this.f47905a, "setTouchToFocusEnableInternal mDisplayTarget is null.");
            return;
        }
        try {
            Method declaredMethod = TXCloudVideoView.class.getDeclaredMethod("setTouchToFocusEnabled", new Class[]{Boolean.TYPE, C106891a.class});
            declaredMethod.setAccessible(true);
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(z);
            if (z) {
                fVar = this;
            }
            objArr[1] = fVar;
            declaredMethod.invoke(tXCloudVideoView, objArr);
        } catch (Exception e) {
            LiteavLog.m16898e(this.f47905a, "setTouchToFocusEnableInternal Exception:".concat(String.valueOf(e)));
        }
    }

    /* renamed from: f */
    private void m17879f(boolean z) {
        DisplayTarget displayTarget = this.f47888B;
        C17604f fVar = null;
        TXCloudVideoView tXCloudVideoView = displayTarget == null ? null : displayTarget.getTXCloudVideoView();
        if (tXCloudVideoView == null) {
            LiteavLog.m16898e(this.f47905a, "setZoomEnabledInternal mDisplayTarget is null.");
            return;
        }
        try {
            Method declaredMethod = TXCloudVideoView.class.getDeclaredMethod("setZoomEnabled", new Class[]{Boolean.TYPE, C106892b.class});
            declaredMethod.setAccessible(true);
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(z);
            if (z) {
                fVar = this;
            }
            objArr[1] = fVar;
            declaredMethod.invoke(tXCloudVideoView, objArr);
        } catch (Exception e) {
            LiteavLog.m16898e(this.f47905a, "setZoomEnabledInternal Exception:".concat(String.valueOf(e)));
        }
    }

    /* renamed from: g */
    private void m17880g() {
        int i = ((360 - this.f47917m) + this.f47889C.mValue) % v2helper.VOIP_ENC_HEIGHT_LV1;
        for (C17380g next : m17882h()) {
            if (next != null) {
                next.mo20307a(Rotation.m139836a(i));
            }
        }
    }

    /* renamed from: h */
    private List<C17380g> m17882h() {
        ArrayList arrayList = new ArrayList();
        C17380g gVar = this.f47893G;
        if (gVar != null) {
            arrayList.add(gVar);
        }
        C17380g gVar2 = this.f47895I;
        if (gVar2 != null) {
            arrayList.add(gVar2);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m17884i() {
        for (VideoProducerDef.StreamType b : this.f47887A.keySet()) {
            m17860b(b);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17848a(C17604f fVar, ServerVideoProducerConfig serverVideoProducerConfig) {
        LiteavLog.m16901i(fVar.f47905a, "setServerConfig=".concat(String.valueOf(serverVideoProducerConfig)));
        fVar.f47914j = serverVideoProducerConfig;
        for (C17474ah next : fVar.f47887A.values()) {
            if (next != null) {
                next.mo20695a(serverVideoProducerConfig);
            }
        }
        CameraCaptureSingleton.getInstance().setServerConfig(serverVideoProducerConfig);
    }

    /* renamed from: d */
    public static /* synthetic */ void m17873d(C17604f fVar, boolean z) {
        String str = fVar.f47905a;
        LiteavLog.m16901i(str, "setEncodeMirrorEnabled : " + z + ", old is " + fVar.f47928x);
        if (fVar.f47928x != z) {
            fVar.f47928x = z;
            fVar.m17884i();
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m17862b(C17604f fVar, int i, VideoProducerDef.StreamType streamType) {
        LiteavLog.m16902i(fVar.f47905a, "setRPSIFrameFPS: %d", Integer.valueOf(i));
        C17474ah ahVar = fVar.f47887A.get(streamType);
        if (ahVar == null) {
            LiteavLog.m16906w(fVar.f47905a, "setRPSIFrameFPS with stream type: %s, but can't find matched videoEncodeController.", streamType);
            return;
        }
        ahVar.mo20696a(C17481am.m17623a(ahVar, i), "setRPSIFrameFPS");
    }

    /* renamed from: g */
    public static /* synthetic */ void m17881g(C17604f fVar) {
        LiteavLog.m16901i(fVar.f47905a, "resumeCaptureInternal");
        if (fVar.f47920p == CaptureSourceInterface.SourceType.CUSTOM) {
            LiteavLog.m16905w(fVar.f47905a, "ignore invoking resumeCapture() when using custom input");
            return;
        }
        CaptureSourceInterface captureSourceInterface = fVar.f47921q;
        if (captureSourceInterface != null) {
            captureSourceInterface.resume();
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m17883h(C17604f fVar) {
        if (fVar.f47920p != CaptureSourceInterface.SourceType.NONE) {
            LiteavLog.m16905w(fVar.f47905a, "can't Start when sourceType isn't NONE");
            return;
        }
        LiteavLog.m16901i(fVar.f47905a, "Start custom capture");
        fVar.m17858a(C104533au.m139873a().mo147211b());
        fVar.m17871d();
        fVar.f47923s.mo20907a(VideoProducerDef.ProducerMode.AUTO);
        fVar.f47898L.mo147176a(0, 0);
        fVar.f47920p = CaptureSourceInterface.SourceType.CUSTOM;
        fVar.f47907c.setSourceType(fVar.f47920p);
        fVar.f47900N.mo20921a(fVar.f47920p);
        fVar.f47923s.f47857a = fVar.f47920p;
        fVar.m17826a(fVar.f47893G, fVar.f47894H);
    }

    /* renamed from: a */
    public static /* synthetic */ void m17847a(C17604f fVar, CaptureSourceInterface.SourceType sourceType, VideoProducerDef.ProducerMode producerMode, CaptureSourceInterface.CaptureParams captureParams) {
        CaptureSourceInterface.CaptureParams captureParams2;
        String str = fVar.f47905a;
        LiteavLog.m16901i(str, "setCaptureParams " + sourceType + " ,mode = " + producerMode + " , " + captureParams.toString());
        LiteavLog.m16896d(fVar.f47905a, "setCaptureParamInternal ".concat(String.valueOf(sourceType)));
        if (fVar.f47920p != sourceType) {
            String str2 = fVar.f47905a;
            LiteavLog.m16901i(str2, "setCaptureParamInternal sourcetype not match: " + sourceType + " , current is " + fVar.f47920p);
        } else if (fVar.f47921q == null || (captureParams2 = fVar.f47922r) == null) {
            String str3 = fVar.f47905a;
            LiteavLog.m16901i(str3, "setCaptureParamInternal capturesource is " + fVar.f47921q + ", " + fVar.f47922r);
        } else if (producerMode != fVar.f47923s.f47858b || !captureParams2.equals(captureParams)) {
            fVar.f47908d.setPerformanceMode(producerMode == VideoProducerDef.ProducerMode.PERFORMANCE);
            fVar.f47923s.mo20907a(producerMode);
            fVar.f47923s.mo20906a(new C104507p(captureParams.f47184c, captureParams.f47185d));
            fVar.f47923s.mo20905a(captureParams.f47186e);
            C104507p b = fVar.f47923s.mo20908b();
            captureParams.f47184c = b.f309736a;
            captureParams.f47185d = b.f309737b;
            if (!fVar.f47923s.mo20910c().equals(fVar.f47899M)) {
                fVar.m17874e();
            }
            if (captureParams instanceof CameraCaptureParams) {
                fVar.f47922r = new CameraCaptureParams((CameraCaptureParams) captureParams);
            } else if (captureParams instanceof VirtualCamera.VirtualCameraParams) {
                fVar.f47922r = new VirtualCamera.VirtualCameraParams((VirtualCamera.VirtualCameraParams) captureParams);
            } else if (captureParams instanceof ScreenCapturer.ScreenCaptureParams) {
                fVar.f47922r = new ScreenCapturer.ScreenCaptureParams((ScreenCapturer.ScreenCaptureParams) captureParams);
            } else {
                fVar.f47922r = new CaptureSourceInterface.CaptureParams(captureParams);
            }
            fVar.f47921q.updateParams(fVar.f47922r);
            m17827a(fVar.f47922r);
        }
    }

    /* renamed from: d */
    private void m17871d() {
        CaptureSourceInterface captureSourceInterface = this.f47921q;
        if (captureSourceInterface != null) {
            captureSourceInterface.stop();
            this.f47921q = null;
        }
        this.f47922r = null;
        this.f47924t = null;
    }

    /* renamed from: e */
    private void m17874e() {
        C104507p c = this.f47923s.mo20910c();
        if (!c.equals(this.f47899M)) {
            C104507p b = this.f47923s.mo20908b();
            String str = this.f47905a;
            LiteavLog.m16901i(str, "producer with capture " + b + " preview " + c + " mode:" + this.f47923s.f47858b);
        }
        this.f47899M.mo147176a(c.f309736a, c.f309737b);
        if (this.f47919o) {
            this.f47907c.unregisterVideoProcessedListener(1, this);
            this.f47907c.unregisterVideoProcessedListener(2, this);
        }
        C17253a aVar = new C17253a(c.f309736a, c.f309737b);
        VideoPreprocessor videoPreprocessor = this.f47907c;
        C17253a aVar2 = aVar;
        GLConstants.PixelBufferType pixelBufferType = GLConstants.PixelBufferType.TEXTURE_2D;
        GLConstants.PixelFormatType pixelFormatType = GLConstants.PixelFormatType.RGBA;
        videoPreprocessor.registerVideoProcessedListener(1, aVar2, pixelBufferType, pixelFormatType, true, this);
        this.f47907c.registerVideoProcessedListener(2, aVar2, pixelBufferType, pixelFormatType, false, this);
        this.f47919o = true;
    }

    /* renamed from: f */
    private void m17877f() {
        LiteavLog.m16901i(this.f47905a, "uninitOpenGLComponents");
        C104516e.m139822a(this.f47912h);
        this.f47912h = null;
    }

    /* renamed from: b */
    public static /* synthetic */ void m17861b(C17604f fVar) {
        LiteavLog.m16901i(fVar.f47905a, "Stop custom capture");
        fVar.m17868c();
        fVar.f47920p = CaptureSourceInterface.SourceType.NONE;
        fVar.f47907c.setSourceType(fVar.f47920p);
        fVar.f47900N.mo20921a(fVar.f47920p);
        fVar.f47923s.f47857a = fVar.f47920p;
        fVar.m17877f();
    }

    /* renamed from: f */
    public static /* synthetic */ void m17878f(C17604f fVar) {
        LiteavLog.m16901i(fVar.f47905a, "pauseCaptureInternal");
        if (fVar.f47920p == CaptureSourceInterface.SourceType.CUSTOM) {
            LiteavLog.m16905w(fVar.f47905a, "ignore invoking pauseCapture() when using custom input");
            return;
        }
        CaptureSourceInterface captureSourceInterface = fVar.f47921q;
        if (captureSourceInterface != null) {
            captureSourceInterface.pause();
        }
    }

    /* renamed from: d */
    public final void mo20536d(boolean z) {
        LiteavLog.m16901i(this.f47905a, "onCameraZoomEnable enableZoom:".concat(String.valueOf(z)));
        mo20925a(C17584al.m17782a(this, z));
    }

    /* renamed from: b */
    public final void mo20534b(boolean z) {
        LiteavLog.m16901i(this.f47905a, "onScreenDisplayOrientationChanged isPortrait:".concat(String.valueOf(z)));
        mo20925a(C17582aj.m17780a(this, z));
    }

    /* renamed from: b */
    public static /* synthetic */ void m17867b(C17604f fVar, boolean z) {
        DisplayTarget displayTarget = fVar.f47888B;
        if ((displayTarget != null ? displayTarget.getTXCloudVideoView() : null) != null) {
            fVar.m17876e(z);
        }
    }

    /* renamed from: b */
    private void m17860b(VideoProducerDef.StreamType streamType) {
        C17474ah ahVar = this.f47887A.get(streamType);
        if (ahVar != null) {
            ahVar.mo20698a(this.f47928x);
            ahVar.mo20701b(this.f47915k == VideoProducerDef.GSensorMode.DISABLE ? this.f47927w : Rotation.NORMAL);
            ahVar.mo20692a(m17819a(streamType));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m17868c() {
        LiteavLog.m16901i(this.f47905a, "stopCaptureInternal");
        this.f47919o = false;
        this.f47907c.unregisterVideoProcessedListener(1, this);
        this.f47907c.unregisterVideoProcessedListener(2, this);
        for (C17380g next : m17882h()) {
            if (next != null) {
                next.mo20310a(true);
            }
        }
        m17871d();
        C17600d dVar = this.f47918n;
        if (dVar != null) {
            dVar.disable();
            this.f47918n = null;
        }
        this.f47920p = CaptureSourceInterface.SourceType.NONE;
        this.f47907c.setSourceType(this.f47920p);
        this.f47900N.mo20921a(this.f47920p);
        this.f47923s.f47857a = this.f47920p;
        this.f47923s.mo20906a(new C104507p());
        this.f47923s.mo20905a((Rect) null);
        this.f47902P = false;
        this.f47903Q = false;
        this.f47901O = false;
        m17877f();
    }

    /* renamed from: b */
    public static VideoEncoderDef.EncodeAbility m17859b() {
        return C17465a.C17466a.f47408a.f47406a;
    }

    /* renamed from: b */
    public static /* synthetic */ void m17866b(C17604f fVar, VideoProducerDef.StreamType streamType) {
        C17474ah ahVar = fVar.f47887A.get(streamType);
        if (ahVar != null) {
            ahVar.mo20703d();
            ahVar.mo20704e();
            ahVar.mo20700b();
            fVar.f47887A.remove(streamType);
            if (streamType == VideoProducerDef.StreamType.STREAM_TYPE_BIG_VIDEO) {
                fVar.f47923s.mo20909b(new C104507p());
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m17865b(C17604f fVar, CaptureSourceInterface.SourceType sourceType, VideoProducerDef.ProducerMode producerMode, CaptureSourceInterface.CaptureParams captureParams) {
        String str = fVar.f47905a;
        LiteavLog.m16901i(str, "startCaptureInternal sourceType:" + sourceType + ",mode:" + producerMode + ",captureParams:" + captureParams);
        if (fVar.f47920p != CaptureSourceInterface.SourceType.NONE || fVar.f47920p == CaptureSourceInterface.SourceType.CUSTOM) {
            String str2 = fVar.f47905a;
            LiteavLog.m16905w(str2, "can't Start when sourceType isn't NONE. current is " + fVar.f47920p.name());
            return;
        }
        fVar.m17858a(C104533au.m139873a().mo147211b());
        fVar.f47920p = sourceType;
        fVar.f47922r = captureParams;
        fVar.f47908d.setPerformanceMode(producerMode == VideoProducerDef.ProducerMode.PERFORMANCE);
        fVar.f47907c.setSourceType(fVar.f47920p);
        fVar.f47900N.mo20921a(fVar.f47920p);
        fVar.f47923s.f47857a = fVar.f47920p;
        fVar.f47923s.mo20907a(producerMode);
        fVar.f47923s.mo20905a(fVar.f47922r.f47186e);
        C17596ax axVar = fVar.f47923s;
        CaptureSourceInterface.CaptureParams captureParams2 = fVar.f47922r;
        axVar.mo20906a(new C104507p(captureParams2.f47184c, captureParams2.f47185d));
        C104507p b = fVar.f47923s.mo20908b();
        CaptureSourceInterface.CaptureParams captureParams3 = fVar.f47922r;
        captureParams3.f47184c = b.f309736a;
        captureParams3.f47185d = b.f309737b;
        fVar.m17874e();
        if (sourceType == CaptureSourceInterface.SourceType.CAMERA) {
            fVar.f47921q = new C17405ah(fVar.f47911g, Looper.myLooper(), fVar.f47906b);
            if (fVar.f47918n == null) {
                fVar.f47918n = new C17600d(fVar.f47911g, fVar);
                if (fVar.f47923s.mo20904a() == VideoProducerDef.HomeOrientation.UNSET) {
                    fVar.f47918n.enable();
                }
            }
        } else if (sourceType == CaptureSourceInterface.SourceType.SCREEN) {
            fVar.f47921q = new C17405ah(fVar.f47911g, Looper.myLooper(), fVar.f47906b);
            fVar.f47915k = VideoProducerDef.GSensorMode.DISABLE;
        } else if (sourceType == CaptureSourceInterface.SourceType.VIRTUAL_CAMERA) {
            fVar.f47921q = new VirtualCamera(Looper.myLooper(), fVar.f47906b);
        }
        CaptureSourceInterface captureSourceInterface = fVar.f47921q;
        C104516e eVar = fVar.f47912h;
        captureSourceInterface.start(eVar != null ? eVar.mo147198c() : null, captureParams, fVar);
        fVar.m17825a(fVar.f47888B);
        fVar.m17826a(fVar.f47893G, fVar.f47894H);
        m17827a(fVar.f47922r);
    }

    /* renamed from: a */
    public static /* synthetic */ void m17834a(C17604f fVar, Bitmap bitmap, int i) {
        if (fVar.f47921q != null) {
            int i2 = 64;
            int width = bitmap != null ? bitmap.getWidth() : 64;
            if (bitmap != null) {
                i2 = bitmap.getHeight();
            }
            CaptureSourceInterface captureSourceInterface = fVar.f47921q;
            if (captureSourceInterface instanceof C17405ah) {
                ((C17405ah) captureSourceInterface).mo20562a(bitmap, i, width, i2);
            } else if (captureSourceInterface instanceof VirtualCamera) {
                LiteavLog.m16905w(fVar.f47905a, "setPausedImage in Start param.");
            } else {
                LiteavLog.m16905w(fVar.f47905a, "setPausedImage failed!");
            }
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m17870c(C17604f fVar, boolean z) {
        fVar.f47923s.f47860d = z ? GLConstants.Orientation.PORTRAIT : GLConstants.Orientation.LANDSCAPE;
    }

    /* renamed from: a */
    public static /* synthetic */ void m17846a(C17604f fVar, DisplayTarget displayTarget) {
        if (!CommonUtil.equals(fVar.f47888B, displayTarget)) {
            fVar.m17825a(displayTarget);
        }
    }

    /* renamed from: c */
    public final void mo20535c(boolean z) {
        LiteavLog.m16901i(this.f47905a, "onCameraTouchEnable enableTouch:".concat(String.valueOf(z)));
        mo20925a(C17583ak.m17781a(this, z));
    }

    /* renamed from: a */
    public static /* synthetic */ void m17855a(C17604f fVar, VideoProducerDef.StreamType streamType, VideoEncoderDef.EncodeStrategy encodeStrategy) {
        VideoEncoderDef.EncodeStrategy encodeStrategy2;
        if (streamType != VideoProducerDef.StreamType.STREAM_TYPE_SMALL_VIDEO && (encodeStrategy2 = fVar.f47930z.get(streamType)) != null && encodeStrategy2 != encodeStrategy) {
            String str = fVar.f47905a;
            LiteavLog.m16901i(str, "setEncodeStrategy: " + streamType + " " + encodeStrategy);
            fVar.f47930z.put(streamType, encodeStrategy);
            C17474ah ahVar = fVar.f47887A.get(streamType);
            if (ahVar != null) {
                ahVar.mo20694a(encodeStrategy);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17856a(C17604f fVar, String str) {
        try {
            LiteavLog.m16901i(fVar.f47905a, "setHWEncoderDeviceRelatedParams: ".concat(String.valueOf(str)));
            fVar.f47929y = new JSONArray(str);
        } catch (JSONException e) {
            LiteavLog.m16898e(fVar.f47905a, "setHWEncoderDeviceRelatedParams error ".concat(String.valueOf(e)));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17830a(C17604f fVar, int i, int i2) {
        DisplayTarget displayTarget = fVar.f47888B;
        if (displayTarget != null) {
            C104507p size = displayTarget.getSize();
            fVar.mo20924a(i, i2, size.f309736a, size.f309737b);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17849a(C17604f fVar, VideoProducerDef.GSensorMode gSensorMode) {
        if (fVar.f47920p == CaptureSourceInterface.SourceType.SCREEN) {
            LiteavLog.m16901i(fVar.f47905a, "setGSensorMode has been ignored for screen capturing");
            return;
        }
        fVar.f47915k = gSensorMode;
        LiteavLog.m16902i(fVar.f47905a, "set GSensor mode to %s", gSensorMode);
        fVar.m17884i();
    }

    /* renamed from: a */
    public static /* synthetic */ void m17850a(C17604f fVar, VideoProducerDef.HomeOrientation homeOrientation) {
        if (fVar.f47920p == CaptureSourceInterface.SourceType.SCREEN) {
            LiteavLog.m16901i(fVar.f47905a, "setHomeOrientation has been ignored for screen capturing");
            return;
        }
        C17600d dVar = fVar.f47918n;
        if (dVar != null) {
            dVar.disable();
        }
        fVar.f47923s.f47859c = homeOrientation;
        LiteavLog.m16902i(fVar.f47905a, "set HomeOrientation to %s", homeOrientation);
        if (!fVar.f47923s.mo20910c().equals(fVar.f47899M)) {
            fVar.m17874e();
        }
        fVar.m17884i();
    }

    /* renamed from: b */
    public static /* synthetic */ void m17863b(C17604f fVar, PixelFrame pixelFrame) {
        fVar.m17823a(pixelFrame);
        if (fVar.f47892F != null) {
            PixelFrame pixelFrame2 = new PixelFrame(pixelFrame);
            pixelFrame2.setRotation(Rotation.NORMAL);
            fVar.f47892F.onRenderFrame(pixelFrame2);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17853a(C17604f fVar, VideoProducerDef.StreamType streamType, GLConstants.Orientation orientation, VideoEncodeParams videoEncodeParams) {
        String str = fVar.f47905a;
        LiteavLog.m16901i(str, "setEncodeParams:  streamType:" + streamType + " orientation:" + orientation + " params:" + videoEncodeParams);
        if (orientation != null) {
            fVar.f47925u.put(streamType, orientation);
            fVar.f47923s.f47861e = orientation;
        }
        VideoEncodeParams a = fVar.m17821a(videoEncodeParams);
        if (streamType != VideoProducerDef.StreamType.STREAM_TYPE_SMALL_VIDEO) {
            fVar.m17822a(a.fps);
        }
        C17474ah ahVar = fVar.f47887A.get(streamType);
        if (ahVar != null) {
            ahVar.mo20693a(a);
        }
        fVar.m17860b(streamType);
    }

    /* renamed from: a */
    private VideoEncodeParams m17821a(VideoEncodeParams videoEncodeParams) {
        C104507p d = this.f47923s.mo20911d();
        this.f47923s.mo20909b(new C104507p(videoEncodeParams.width, videoEncodeParams.height));
        C104507p d2 = this.f47923s.mo20911d();
        if (!(videoEncodeParams.width == d2.f309736a && videoEncodeParams.height == d2.f309737b)) {
            String str = this.f47905a;
            LiteavLog.m16901i(str, "update encode size from " + videoEncodeParams.width + "x" + videoEncodeParams.height + " to " + d2.f309736a + "x" + d2.f309737b);
            videoEncodeParams.width = d2.f309736a;
            videoEncodeParams.height = d2.f309737b;
        }
        if (!d.equals(d2)) {
            LiteavLog.m16901i(this.f47905a, "producer with encoder ".concat(String.valueOf(d2)));
        }
        return videoEncodeParams;
    }

    /* renamed from: a */
    private void m17822a(int i) {
        CaptureSourceInterface captureSourceInterface;
        C104507p b = this.f47923s.mo20908b();
        CaptureSourceInterface.CaptureParams captureParams = this.f47922r;
        boolean z = true;
        boolean z2 = false;
        if (captureParams != null) {
            int i2 = b.f309736a;
            if (!(i2 == captureParams.f47184c && b.f309737b == captureParams.f47185d)) {
                captureParams.f47184c = i2;
                captureParams.f47185d = b.f309737b;
                z2 = true;
            }
            if (i > captureParams.f47183b) {
                captureParams.f47183b = i;
            } else {
                z = z2;
            }
        } else {
            LiteavLog.m16905w(this.f47905a, "updateCapturePreviewSizeFromSupervisor mCaptureParams==null!");
            z = false;
        }
        if (z && (captureSourceInterface = this.f47921q) != null) {
            captureSourceInterface.updateParams(this.f47922r);
        }
        if (!this.f47923s.mo20910c().equals(this.f47899M)) {
            m17874e();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17832a(C17604f fVar, int i, VideoProducerDef.StreamType streamType) {
        LiteavLog.m16902i(fVar.f47905a, "setRPSNearestREFSize: %d", Integer.valueOf(i));
        C17474ah ahVar = fVar.f47887A.get(streamType);
        if (ahVar == null) {
            LiteavLog.m16906w(fVar.f47905a, "setRPSNearestREFSize with stream type: %s, but can't find matched videoEncodeController.", streamType);
            return;
        }
        ahVar.mo20696a(C17482an.m17624a(ahVar, i), "setRPSNearestREFSize");
    }

    /* renamed from: a */
    public static /* synthetic */ void m17852a(C17604f fVar, VideoProducerDef.StreamType streamType, int i, int i2) {
        C17474ah ahVar = fVar.f47887A.get(streamType);
        if (ahVar == null) {
            LiteavLog.m16906w(fVar.f47905a, "ackRPSRecvFrameIndex with stream type: %s, but can't find matched videoEncodeController.", streamType);
            return;
        }
        ahVar.mo20696a(C17483ao.m17625a(ahVar, i, i2), "ackRPSRecvFrameIndex");
    }

    /* renamed from: a */
    public static /* synthetic */ void m17851a(C17604f fVar, VideoProducerDef.StreamType streamType) {
        LiteavLog.m16901i(fVar.f47905a, "requestKeyFrame");
        C17474ah ahVar = fVar.f47887A.get(streamType);
        if (ahVar == null) {
            LiteavLog.m16906w(fVar.f47905a, "requestKeyFrame with stream type: %s, but can't find matched videoEncodeController.", streamType);
            return;
        }
        ahVar.mo20696a(C17480al.m17622a(ahVar), "restartIDRFrame");
    }

    /* renamed from: a */
    public static /* synthetic */ void m17837a(C17604f fVar, GLConstants.MirrorMode mirrorMode) {
        LiteavLog.m16902i(fVar.f47905a, "setRenderMirrorMode: %s", mirrorMode.name());
        fVar.f47890D = mirrorMode;
    }

    /* renamed from: a */
    public static /* synthetic */ void m17836a(C17604f fVar, GLConstants.GLScaleType gLScaleType) {
        LiteavLog.m16902i(fVar.f47905a, "setRenderScaleType: %s", gLScaleType.name());
        fVar.f47891E = gLScaleType;
        for (C17380g next : fVar.m17882h()) {
            if (next != null) {
                next.mo20303a(gLScaleType);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17844a(C17604f fVar, Rotation rotation) {
        LiteavLog.m16902i(fVar.f47905a, "setRenderRotation: %s, GSensorMode is %s", rotation.name(), fVar.f47915k.name());
        fVar.f47889C = rotation;
        fVar.m17880g();
    }

    /* renamed from: a */
    public static /* synthetic */ void m17840a(C17604f fVar, SnapshotSourceType snapshotSourceType, TakeSnapshotListener takeSnapshotListener) {
        C17380g gVar;
        String str = fVar.f47905a;
        LiteavLog.m16901i(str, "takeSnapshot sourceType: " + snapshotSourceType + ", listener: " + takeSnapshotListener);
        if (snapshotSourceType == SnapshotSourceType.STREAM) {
            for (C17474ah next : fVar.f47887A.values()) {
                if (next != null) {
                    next.mo20696a(C17488at.m17630a(next, takeSnapshotListener), AppBrandFileCleaner.f238098c);
                    return;
                }
            }
        } else if (snapshotSourceType != SnapshotSourceType.VIEW) {
        } else {
            if (fVar.f47888B == null || (gVar = fVar.f47893G) == null) {
                C17380g gVar2 = fVar.f47895I;
                if (gVar2 != null) {
                    gVar2.mo20305a(takeSnapshotListener);
                    return;
                }
                LiteavLog.m16905w(fVar.f47905a, "takeSnapshot return null, no match render.");
                if (takeSnapshotListener != null) {
                    takeSnapshotListener.onComplete((Bitmap) null);
                    return;
                }
                return;
            }
            gVar.mo20305a(takeSnapshotListener);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17842a(C17604f fVar, PixelFrame pixelFrame, int i, int i2) {
        if (fVar.f47920p != CaptureSourceInterface.SourceType.CUSTOM) {
            pixelFrame.release();
            return;
        }
        if (pixelFrame.getTimestamp() == 0) {
            pixelFrame.setTimestamp(TimeUtil.m16909a());
        }
        boolean z = false;
        fVar.f47906b.updateStatus(C17271i.STATUS_VIDEO_INCOME_FRAME, 0);
        fVar.f47906b.updateStatus(C17271i.STATUS_VIDEO_CAPTURE_FRAME, 0);
        fVar.f47900N.mo20919a(pixelFrame.getTimestamp(), fVar.f47890D);
        fVar.f47900N.mo20920a(pixelFrame.getTimestamp(), fVar.f47928x);
        C104507p pVar = fVar.f47898L;
        if (pVar.f309736a == i && pVar.f309737b == i2) {
            z = true;
        }
        if (!z || !fVar.f47919o) {
            fVar.f47923s.mo20907a(VideoProducerDef.ProducerMode.MANUAL);
            fVar.f47923s.mo20906a(new C104507p(i, i2));
            fVar.m17874e();
            fVar.f47898L.mo147176a(i, i2);
        }
        if (pixelFrame.getGLContext() != null && !CommonUtil.equals(fVar.f47913i, pixelFrame.getGLContext())) {
            fVar.m17877f();
            fVar.m17858a(pixelFrame.getGLContext());
        }
        if (pixelFrame.getGLContext() == null) {
            pixelFrame.setGLContext(fVar.f47912h.mo147198c());
        }
        fVar.f47907c.processFrame(pixelFrame);
        pixelFrame.release();
    }

    /* renamed from: a */
    public static /* synthetic */ void m17838a(C17604f fVar, GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, VideoRenderListener videoRenderListener) {
        String str = fVar.f47905a;
        LiteavLog.m16901i(str, "setCustomRenderListener PixelFormatType = " + pixelFormatType + ",  PixelBufferType = " + pixelBufferType + " listener= " + videoRenderListener);
        fVar.f47892F = videoRenderListener;
        if (fVar.f47892F != null) {
            if (fVar.f47895I == null) {
                C17272a aVar = new C17272a(fVar.f47909e.getLooper());
                fVar.f47895I = aVar;
                fVar.m17826a((C17380g) aVar, fVar.f47896J);
            }
            ((C17272a) fVar.f47895I).mo20304a(pixelFormatType, pixelBufferType);
            return;
        }
        C17380g gVar = fVar.f47895I;
        if (gVar != null) {
            gVar.mo20310a(true);
            fVar.f47895I = null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17839a(C17604f fVar, GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, CustomVideoProcessListener customVideoProcessListener) {
        String str = fVar.f47905a;
        LiteavLog.m16901i(str, "setCustomVideoProcessListener PixelFormatType = " + pixelFormatType + ",  PixelBufferType = " + pixelBufferType + " listener= " + customVideoProcessListener);
        if (fVar.f47897K == null) {
            fVar.f47897K = new C17572a(fVar.f47906b);
        }
        C17572a aVar = fVar.f47897K;
        LiteavLog.m16901i("CustomVideoProcessListenerAdapter", "setCustomVideoProcessListener PixelFormatType = " + pixelFormatType + ",  PixelBufferType = " + pixelBufferType + " listener= " + customVideoProcessListener);
        aVar.f47778b.mo20221a(C17598b.m17808a(aVar, pixelFormatType, pixelBufferType, customVideoProcessListener));
        fVar.f47907c.setInterceptorBeforeWatermark(fVar.f47897K);
    }

    /* renamed from: a */
    private void m17858a(Object obj) {
        LiteavLog.m16901i(this.f47905a, "initOpenGLComponents");
        if (!CommonUtil.equals(this.f47913i, obj)) {
            m17877f();
        }
        if (this.f47912h == null) {
            this.f47913i = obj;
            C104516e eVar = new C104516e();
            this.f47912h = eVar;
            try {
                eVar.mo147196a(obj, (Surface) null, 128, 128);
            } catch (C104518g e) {
                this.f47912h = null;
                LiteavLog.m16899e(this.f47905a, "EGLCore create failed.", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    private static void m17827a(CaptureSourceInterface.CaptureParams captureParams) {
        if (captureParams instanceof CameraCaptureParams) {
            ((CameraCaptureParams) captureParams).f47179a = null;
        }
    }

    /* renamed from: a */
    private void m17825a(DisplayTarget displayTarget) {
        LiteavLog.m16901i(this.f47905a, "setDisplayView ".concat(String.valueOf(displayTarget)));
        this.f47888B = displayTarget;
        if ((displayTarget != null ? displayTarget.getTXCloudVideoView() : null) != null) {
            m17876e(true);
            m17879f(true);
        }
        for (C17380g next : m17882h()) {
            if (next != null) {
                next.mo20308a(this.f47888B, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo20533a(boolean z) {
        LiteavLog.m16901i(this.f47905a, "onStartFinish success:".concat(String.valueOf(z)));
        mo20925a(C17581ai.m17779a(this));
    }

    /* renamed from: a */
    public static /* synthetic */ void m17857a(C17604f fVar, boolean z) {
        DisplayTarget displayTarget = fVar.f47888B;
        if ((displayTarget != null ? displayTarget.getTXCloudVideoView() : null) != null) {
            fVar.m17879f(z);
        }
    }

    /* renamed from: a */
    public final void mo20532a(CaptureSourceInterface captureSourceInterface, PixelFrame pixelFrame) {
        if (pixelFrame != null) {
            pixelFrame.retain();
            if (pixelFrame.getPixelBufferType() == GLConstants.PixelBufferType.TEXTURE_2D || pixelFrame.getPixelBufferType() == GLConstants.PixelBufferType.TEXTURE_OES) {
                GLES20.glFinish();
            }
            if (!mo20925a(C17585am.m17783a(this, pixelFrame, captureSourceInterface))) {
                pixelFrame.release();
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17843a(C17604f fVar, PixelFrame pixelFrame, CaptureSourceInterface captureSourceInterface) {
        int i = 0;
        fVar.f47906b.updateStatus(C17271i.STATUS_VIDEO_CAPTURE_FRAME, 0);
        if (!fVar.f47902P) {
            fVar.f47902P = true;
            fVar.f47906b.notifyEvent(C17263h.C17269b.EVT_VIDEO_CAPTURE_FIRST_FRAME, "capture first frame", new Object[0]);
            LiteavLog.m16896d(fVar.f47905a, "receive first capture frame! ");
        }
        C104507p pVar = fVar.f47923s.f47862f;
        if (!(fVar.f47919o && pVar.f309736a == pixelFrame.getWidth() && pVar.f309737b == pixelFrame.getHeight())) {
            C17596ax axVar = fVar.f47923s;
            axVar.f47862f.mo147177a(new C104507p(pixelFrame.getWidth(), pixelFrame.getHeight()));
            axVar.f47863g.mo147176a(0, 0);
            fVar.m17874e();
            if (fVar.f47920p == CaptureSourceInterface.SourceType.SCREEN) {
                for (C17474ah next : fVar.f47887A.values()) {
                    if (next != null) {
                        VideoEncodeParams a = fVar.m17821a(next.mo20705f());
                        fVar.m17822a(a.fps);
                        next.mo20693a(a);
                    }
                }
            }
        }
        if (m17820a(captureSourceInterface) != null) {
            PixelFrame pixelFrame2 = new PixelFrame(pixelFrame);
            fVar.f47924t = pixelFrame2;
            pixelFrame2.setRotation(CameraCaptureSingleton.getInstance().getCameraRotation());
            fVar.f47900N.mo20918a(pixelFrame.getTimestamp()).f47884a = CameraCaptureSingleton.getInstance().isFrontCamera();
            fVar.f47900N.mo20919a(pixelFrame.getTimestamp(), fVar.f47890D);
            fVar.f47900N.mo20920a(pixelFrame.getTimestamp(), fVar.f47928x);
            Rotation cameraRotation = CameraCaptureSingleton.getInstance().getCameraRotation();
            if (cameraRotation != null) {
                i = cameraRotation.mValue;
            }
            int i2 = C176084.f47933a[fVar.f47923s.mo20904a().ordinal()];
            if (i2 == 1) {
                pixelFrame.setRotation(Rotation.m139836a(360 - i));
                pixelFrame.swapWidthHeight();
            } else if (i2 == 2) {
                pixelFrame.setRotation(Rotation.ROTATION_180);
            } else if (i2 == 3) {
                pixelFrame.setRotation(Rotation.m139836a((540 - i) % v2helper.VOIP_ENC_HEIGHT_LV1));
                pixelFrame.swapWidthHeight();
            }
        }
        if (pixelFrame.getGLContext() == null) {
            pixelFrame.setGLContext(fVar.f47912h.mo147198c());
        }
        fVar.f47907c.processFrame(pixelFrame);
        pixelFrame.release();
    }

    /* renamed from: a */
    public final void mo20531a() {
        LiteavLog.m16901i(this.f47905a, "onCaptureError");
    }

    /* renamed from: a */
    private void m17826a(C17380g gVar, VideoRenderListener videoRenderListener) {
        if (gVar != null) {
            gVar.mo20308a(this.f47888B, true);
            gVar.mo20309a(videoRenderListener);
            gVar.mo20303a(this.f47891E);
        }
        m17880g();
    }

    /* renamed from: a */
    public final void mo20808a(int i, PixelFrame pixelFrame) {
        if (pixelFrame != null) {
            if (!this.f47903Q) {
                this.f47903Q = true;
                LiteavLog.m16896d(this.f47905a, "preprocess first frame out!");
            }
            GLES20.glFinish();
            pixelFrame.retain();
            if (!mo20925a(C17587ao.m17785a(this, i, pixelFrame))) {
                pixelFrame.release();
            }
        }
    }

    /* renamed from: a */
    public final void mo20917a(Rotation rotation, int i) {
        mo20925a(C17588ap.m17786a(this, rotation, i));
    }

    /* renamed from: a */
    public static /* synthetic */ void m17845a(C17604f fVar, Rotation rotation, int i) {
        LiteavLog.m16902i(fVar.f47905a, "onOrientationChanged: %s, displayRotation:%d", rotation, Integer.valueOf(i));
        fVar.f47916l = rotation;
        fVar.f47917m = i;
        C17602e eVar = fVar.f47900N;
        if (rotation == null) {
            rotation = Rotation.NORMAL;
        }
        eVar.f47883d = rotation;
        fVar.m17880g();
        fVar.m17884i();
    }

    /* renamed from: a */
    public final void mo20924a(int i, int i2, int i3, int i4) {
        PixelFrame pixelFrame = this.f47924t;
        if (pixelFrame != null) {
            mo20925a(C17589aq.m17787a(this, OpenGlUtils.reverseMappingPoint(GLConstants.GLScaleType.CENTER_CROP, this.f47924t.getRotation(), new Point(i, i2), new C104507p(i3, i4), new C104507p(pixelFrame.getWidth(), this.f47924t.getHeight())), i, i2, i3, i4));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17835a(C17604f fVar, Point point, int i, int i2, int i3, int i4) {
        C17455s a;
        if (fVar.f47920p == CaptureSourceInterface.SourceType.CAMERA && (a = m17820a(fVar.f47921q)) != null && (!CameraCaptureSingleton.getInstance().isAutoFocusEnabled())) {
            a.mo20614a(point.x, point.y);
            DisplayTarget displayTarget = fVar.f47888B;
            TXCloudVideoView tXCloudVideoView = displayTarget == null ? null : displayTarget.getTXCloudVideoView();
            if (tXCloudVideoView != null) {
                Class<TXCloudVideoView> cls = TXCloudVideoView.class;
                try {
                    Class cls2 = Integer.TYPE;
                    Method declaredMethod = cls.getDeclaredMethod("showFocusView", new Class[]{cls2, cls2, cls2, cls2});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(tXCloudVideoView, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
                } catch (Exception e) {
                    LiteavLog.m16898e(fVar.f47905a, "showFocusViewInternal Exception:".concat(String.valueOf(e)));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20923a(float f) {
        mo20925a(C17590ar.m17788a(this, f));
    }

    /* renamed from: a */
    public static /* synthetic */ void m17829a(C17604f fVar, float f) {
        C17455s a;
        if (fVar.f47920p == CaptureSourceInterface.SourceType.CAMERA && (a = m17820a(fVar.f47921q)) != null) {
            a.mo20613a(f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17823a(PixelFrame pixelFrame) {
        if (!(pixelFrame == null || (pixelFrame.getWidth() == this.f47904R.f309736a && pixelFrame.getHeight() == this.f47904R.f309737b))) {
            this.f47904R.mo147176a(pixelFrame.getWidth(), pixelFrame.getHeight());
            this.f47906b.updateStatus(C17271i.STATUS_VIDEO_RENDER_FRAME_WIDTH, Integer.valueOf(this.f47904R.f309736a));
            this.f47906b.updateStatus(C17271i.STATUS_VIDEO_RENDER_FRAME_HEIGHT, Integer.valueOf(this.f47904R.f309737b));
        }
        if (!this.f47901O) {
            LiteavLog.m16896d(this.f47905a, "rendered first frame!");
            this.f47906b.notifyEvent(C17263h.C17269b.EVT_VIDEO_RENDER_FIRST_FRAME, "rendered first frame", new Object[0]);
            this.f47901O = true;
        }
    }

    /* renamed from: a */
    private void m17824a(PixelFrame pixelFrame, C17380g gVar) {
        Rotation rotation;
        Rotation rotation2;
        if (gVar != null) {
            C17602e eVar = this.f47900N;
            long timestamp = pixelFrame.getTimestamp();
            boolean b = eVar.mo20922b(timestamp);
            CaptureSourceInterface.SourceType sourceType = eVar.f47882c;
            CaptureSourceInterface.SourceType sourceType2 = CaptureSourceInterface.SourceType.CAMERA;
            boolean z = false;
            if (!(sourceType != sourceType2 || (rotation2 = eVar.f47883d) == Rotation.NORMAL || rotation2 == Rotation.ROTATION_180)) {
                C17602e.C17603a aVar = eVar.f47880a.get(timestamp);
                b = aVar != null ? aVar.f47884a : false;
            }
            gVar.mo20311b(b);
            C17602e eVar2 = this.f47900N;
            long timestamp2 = pixelFrame.getTimestamp();
            boolean b2 = eVar2.mo20922b(timestamp2);
            if (!(eVar2.f47882c != sourceType2 || (rotation = eVar2.f47883d) == Rotation.NORMAL || rotation == Rotation.ROTATION_180)) {
                C17602e.C17603a aVar2 = eVar2.f47880a.get(timestamp2);
                if (!(aVar2 != null ? aVar2.f47884a : false)) {
                    z = b2;
                } else if (!b2) {
                    z = true;
                }
            }
            gVar.mo20312c(z);
            gVar.mo20306a(pixelFrame);
        }
    }

    /* renamed from: a */
    public final boolean mo20925a(Runnable runnable) {
        C17111b bVar = this.f47909e;
        if (!this.f47910f || bVar == null) {
            return false;
        }
        if (Looper.myLooper() != bVar.getLooper()) {
            return bVar.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: a */
    private static C17455s m17820a(CaptureSourceInterface captureSourceInterface) {
        if (!(captureSourceInterface instanceof C17405ah)) {
            return null;
        }
        CaptureSourceInterface captureSourceInterface2 = ((C17405ah) captureSourceInterface).f47231c;
        if (!(captureSourceInterface2 instanceof C17455s)) {
            return null;
        }
        return (C17455s) captureSourceInterface2;
    }

    /* renamed from: a */
    private Rotation m17819a(VideoProducerDef.StreamType streamType) {
        int i;
        Rotation rotation = Rotation.NORMAL;
        if (this.f47920p != CaptureSourceInterface.SourceType.CAMERA) {
            return rotation;
        }
        if (this.f47915k == VideoProducerDef.GSensorMode.DISABLE) {
            if (this.f47925u.get(streamType) == GLConstants.Orientation.LANDSCAPE && this.f47923s.mo20904a() == VideoProducerDef.HomeOrientation.UNSET) {
                rotation = CameraCaptureSingleton.getInstance().isFrontCamera() ? Rotation.ROTATION_90 : Rotation.ROTATION_270;
            }
            this.f47926v = rotation;
            return rotation;
        } else if (this.f47916l == null) {
            return rotation;
        } else {
            if (CameraCaptureSingleton.getInstance().isFrontCamera()) {
                i = (360 - this.f47916l.mValue) % v2helper.VOIP_ENC_HEIGHT_LV1;
            } else {
                i = this.f47916l.mValue;
            }
            Rotation a = Rotation.m139836a(i);
            this.f47926v = a;
            return a;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17831a(C17604f fVar, int i, PixelFrame pixelFrame) {
        if (fVar.f47912h != null) {
            if (pixelFrame.getGLContext() != null) {
                pixelFrame.setGLContext(fVar.f47912h.mo147198c());
            }
            if (i == 1) {
                for (C17474ah next : fVar.f47887A.values()) {
                    if (next != null) {
                        C17602e.C17603a aVar = fVar.f47900N.f47880a.get(pixelFrame.getTimestamp());
                        next.mo20698a(aVar != null ? aVar.f47886c : false);
                        if (pixelFrame.getGLContext() != null) {
                            GLES20.glFinish();
                        }
                        next.mo20696a(C17494az.m17636a(next), "");
                        if (!next.f47425c) {
                            next.f47424b.mo20218a(pixelFrame);
                            if (!next.mo20702c()) {
                                next.mo20696a(C17496ba.m17638a(next), "encodeFrameInternal");
                            }
                        }
                    }
                }
            } else if (i == 2) {
                fVar.m17824a(pixelFrame, fVar.f47893G);
                fVar.m17824a(pixelFrame, fVar.f47895I);
                C17602e eVar = fVar.f47900N;
                long timestamp = pixelFrame.getTimestamp();
                long j = eVar.f47881b;
                if (j != -1) {
                    eVar.f47880a.remove(j);
                }
                eVar.f47881b = timestamp;
            }
        }
        pixelFrame.release();
    }

    /* renamed from: a */
    public static /* synthetic */ void m17854a(C17604f fVar, VideoProducerDef.StreamType streamType, VideoEncodeParams videoEncodeParams, VideoEncoderDef.VideoEncoderDataListener videoEncoderDataListener) {
        if (fVar.f47887A.get(streamType) != null) {
            LiteavLog.m16906w(fVar.f47905a, "%s video encoder is started", streamType.toString());
            return;
        }
        String str = fVar.f47905a;
        LiteavLog.m16901i(str, "startEncodeStreamInternal: " + streamType + "; " + videoEncodeParams);
        VideoEncodeParams a = fVar.m17821a(videoEncodeParams);
        if (streamType != VideoProducerDef.StreamType.STREAM_TYPE_SMALL_VIDEO) {
            fVar.m17822a(a.fps);
        }
        a.mediaCodecDeviceRelatedParams = fVar.f47929y;
        C17474ah ahVar = new C17474ah(fVar.f47906b, streamType, a.isTranscodingMode());
        synchronized (ahVar) {
            if (ahVar.f47427e) {
                LiteavLog.m16901i(ahVar.f47423a, "already initialzied");
            } else {
                LiteavLog.m16901i(ahVar.f47423a, "initialzie");
                HandlerThread handlerThread = new HandlerThread("video-encoder");
                handlerThread.start();
                ahVar.f47426d = new C17111b(handlerThread.getLooper());
                ahVar.f47427e = true;
            }
        }
        ahVar.mo20695a(fVar.f47914j);
        ahVar.mo20694a(fVar.f47930z.get(streamType));
        ahVar.mo20692a(fVar.f47926v);
        ahVar.mo20701b(fVar.f47927w);
        ahVar.mo20698a(fVar.f47928x);
        ahVar.mo20696a(C17493ay.m17635a(ahVar, a, videoEncoderDataListener), "Start");
        fVar.f47887A.put(streamType, ahVar);
    }
}
