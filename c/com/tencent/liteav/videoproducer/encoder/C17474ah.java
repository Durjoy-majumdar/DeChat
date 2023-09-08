package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.liteav.base.util.C113473t;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.common.C17205a;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.C17243b;
import com.tencent.liteav.videobase.utils.C17246e;
import com.tencent.liteav.videobase.utils.C17249g;
import com.tencent.liteav.videobase.utils.C17250i;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.C17271i;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.encoder.C17465a;
import com.tencent.liteav.videoproducer.encoder.C17501bf;
import com.tencent.liteav.videoproducer.encoder.C17503c;
import com.tencent.liteav.videoproducer.encoder.C17527v;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.tencent.liteav.videoproducer.encoder.ah */
public final class C17474ah implements C113473t.C113474a, C17501bf.C17502a {

    /* renamed from: f */
    private static final PixelFrame f47422f = new PixelFrame();

    /* renamed from: a */
    public final String f47423a;

    /* renamed from: b */
    public final C17249g f47424b;

    /* renamed from: c */
    public boolean f47425c = false;

    /* renamed from: d */
    public C17111b f47426d;

    /* renamed from: e */
    public boolean f47427e;

    /* renamed from: g */
    private final Bundle f47428g = new Bundle();

    /* renamed from: h */
    private C113473t f47429h;

    /* renamed from: i */
    private C17501bf f47430i;

    /* renamed from: j */
    private VideoEncoderDef.VideoEncoderDataListener f47431j;

    /* renamed from: k */
    private Rotation f47432k;

    /* renamed from: l */
    private Rotation f47433l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f47434m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ServerVideoProducerConfig f47435n;

    /* renamed from: o */
    private long f47436o;

    /* renamed from: p */
    private long f47437p;

    /* renamed from: q */
    private long f47438q;

    /* renamed from: r */
    private long f47439r;

    /* renamed from: s */
    private boolean f47440s;

    /* renamed from: t */
    private boolean f47441t;

    /* renamed from: u */
    private final IVideoReporter f47442u;

    /* renamed from: v */
    private final C17503c f47443v;

    /* renamed from: w */
    private final C17246e f47444w;

    /* renamed from: x */
    private final C17500be f47445x;

    /* renamed from: y */
    private final VideoProducerDef.StreamType f47446y;

    /* renamed from: z */
    private final boolean f47447z;

    /* renamed from: com.tencent.liteav.videoproducer.encoder.ah$2 */
    public static /* synthetic */ class C174762 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47449a;

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
                com.tencent.liteav.videoproducer.encoder.c$d[] r0 = com.tencent.liteav.videoproducer.encoder.C17503c.C17507d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47449a = r0
                com.tencent.liteav.videoproducer.encoder.c$d r1 = com.tencent.liteav.videoproducer.encoder.C17503c.C17507d.CONTINUE_ENCODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47449a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.liteav.videoproducer.encoder.c$d r1 = com.tencent.liteav.videoproducer.encoder.C17503c.C17507d.RESTART_ENCODER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47449a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.liteav.videoproducer.encoder.c$d r1 = com.tencent.liteav.videoproducer.encoder.C17503c.C17507d.USE_HARDWARE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47449a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.liteav.videoproducer.encoder.c$d r1 = com.tencent.liteav.videoproducer.encoder.C17503c.C17507d.USE_SOFTWARE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47449a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.liteav.videoproducer.encoder.c$d r1 = com.tencent.liteav.videoproducer.encoder.C17503c.C17507d.REPORT_ENCODE_FAILED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.encoder.C17474ah.C174762.<clinit>():void");
        }
    }

    public C17474ah(IVideoReporter iVideoReporter, VideoProducerDef.StreamType streamType, boolean z) {
        Rotation rotation = Rotation.NORMAL;
        this.f47432k = rotation;
        this.f47433l = rotation;
        this.f47434m = false;
        this.f47439r = 0;
        this.f47440s = false;
        this.f47441t = false;
        this.f47427e = false;
        this.f47423a = "VideoEncodeController_" + streamType + "_" + hashCode();
        this.f47442u = iVideoReporter;
        C17465a unused = C17465a.C17466a.f47408a;
        boolean a = C17465a.m17554a();
        C17465a unused2 = C17465a.C17466a.f47408a;
        this.f47443v = new C17503c(a, iVideoReporter, streamType);
        this.f47444w = new C17246e("VideoEncodeController", 2000, new C17477ai(this));
        this.f47445x = new C17500be(iVideoReporter, streamType);
        this.f47446y = streamType;
        this.f47447z = z;
        this.f47424b = z ? new C17243b() : new C17250i(2);
    }

    /* renamed from: f */
    public static /* synthetic */ void m17589f(C17474ah ahVar) {
        if (!ahVar.f47440s) {
            LiteavLog.m16901i(ahVar.f47423a, "encoder receive first frame");
            ahVar.f47439r = SystemClock.elapsedRealtime();
            if (ahVar.mo20702c()) {
                ahVar.m17601m();
            }
            ahVar.f47440s = true;
        }
        ahVar.f47444w.mo20222a();
    }

    /* renamed from: l */
    private VideoEncoderDef.ReferenceStrategy m17600l() {
        C17501bf bfVar = this.f47430i;
        if (bfVar == null) {
            return null;
        }
        return bfVar.getEncodeParams().referenceStrategy;
    }

    /* renamed from: m */
    private void m17601m() {
        C17111b bVar;
        if (this.f47429h != null) {
            LiteavLog.m16901i(this.f47423a, "timer is not null before start.");
            return;
        }
        synchronized (this) {
            bVar = this.f47426d;
        }
        if (bVar == null) {
            LiteavLog.m16901i(this.f47423a, "startInternal handler is null.");
            return;
        }
        C113473t tVar = new C113473t(bVar.getLooper(), this);
        this.f47429h = tVar;
        tVar.mo169974a(0, 15);
        VideoEncodeParams b = this.f47443v.mo20733b();
        if (b.fps != 0) {
            this.f47436o = SystemClock.elapsedRealtime() + (TimeUnit.SECONDS.toMillis(1) / ((long) b.fps));
        } else {
            this.f47436o = SystemClock.elapsedRealtime() + (TimeUnit.SECONDS.toMillis(1) / 20);
        }
    }

    /* renamed from: n */
    private void m17602n() {
        C113473t tVar = this.f47429h;
        if (tVar != null) {
            tVar.mo169973a();
            this.f47429h = null;
        }
    }

    /* renamed from: a_ */
    public final void mo20405a_() {
        if (SystemClock.elapsedRealtime() >= this.f47436o) {
            VideoEncodeParams b = this.f47443v.mo20733b();
            if (b.fps != 0) {
                this.f47436o += TimeUnit.SECONDS.toMillis(1) / ((long) b.fps);
                m17590g();
                return;
            }
            LiteavLog.m16905w(this.f47423a, "onTimeout: encode param is null.");
        }
    }

    /* renamed from: b */
    public final void mo20700b() {
        mo20696a((Runnable) new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
                r0.mo19360a();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
                if (r0 == null) goto L_?;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r2 = this;
                    monitor-enter(r2)
                    com.tencent.liteav.videoproducer.encoder.ah r0 = com.tencent.liteav.videoproducer.encoder.C17474ah.this     // Catch:{ all -> 0x0039 }
                    boolean r0 = r0.f47427e     // Catch:{ all -> 0x0039 }
                    if (r0 != 0) goto L_0x0016
                    com.tencent.liteav.videoproducer.encoder.ah r0 = com.tencent.liteav.videoproducer.encoder.C17474ah.this     // Catch:{ all -> 0x0039 }
                    java.lang.String r0 = r0.f47423a     // Catch:{ all -> 0x0039 }
                    java.lang.String r1 = "not initialized."
                    com.tencent.liteav.base.util.LiteavLog.m16901i(r0, r1)     // Catch:{ all -> 0x0039 }
                    monitor-exit(r2)     // Catch:{ all -> 0x0039 }
                    return
                L_0x0016:
                    com.tencent.liteav.videoproducer.encoder.ah r0 = com.tencent.liteav.videoproducer.encoder.C17474ah.this     // Catch:{ all -> 0x0039 }
                    java.lang.String r0 = r0.f47423a     // Catch:{ all -> 0x0039 }
                    java.lang.String r1 = "uninitialize"
                    com.tencent.liteav.base.util.LiteavLog.m16896d(r0, r1)     // Catch:{ all -> 0x0039 }
                    com.tencent.liteav.videoproducer.encoder.ah r0 = com.tencent.liteav.videoproducer.encoder.C17474ah.this     // Catch:{ all -> 0x0039 }
                    com.tencent.liteav.base.util.b r0 = r0.f47426d     // Catch:{ all -> 0x0039 }
                    com.tencent.liteav.videoproducer.encoder.ah r1 = com.tencent.liteav.videoproducer.encoder.C17474ah.this     // Catch:{ all -> 0x0039 }
                    boolean unused = r1.f47427e = false     // Catch:{ all -> 0x0039 }
                    com.tencent.liteav.videoproducer.encoder.ah r1 = com.tencent.liteav.videoproducer.encoder.C17474ah.this     // Catch:{ all -> 0x0039 }
                    com.tencent.liteav.base.util.C17111b unused = r1.f47426d = null     // Catch:{ all -> 0x0039 }
                    monitor-exit(r2)     // Catch:{ all -> 0x0039 }
                    if (r0 == 0) goto L_0x0038
                    r0.mo19360a()
                L_0x0038:
                    return
                L_0x0039:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch:{ all -> 0x0039 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.encoder.C17474ah.C174751.run():void");
            }
        }, "uninitialize");
    }

    /* renamed from: c */
    public final boolean mo20702c() {
        return !this.f47447z;
    }

    /* renamed from: d */
    public final void mo20703d() {
        this.f47425c = true;
        this.f47424b.mo20218a(f47422f);
    }

    public final void onEncodedFail(C17263h.C17268a aVar) {
        mo20696a(C17491aw.m17633a(this, aVar), "onEncodedFail");
    }

    public final void onEncodedNAL(EncodedVideoFrame encodedVideoFrame, boolean z) {
        if (encodedVideoFrame == null) {
            LiteavLog.m16896d(this.f47423a, "onEncodedNAL encoded frame is null.");
            return;
        }
        synchronized (this) {
            if (!this.f47427e) {
                LiteavLog.m16896d(this.f47423a, "onEncodedNAL called when uninitialized!");
            } else {
                mo20696a(C17490av.m17632a(this, z, encodedVideoFrame), "");
            }
        }
    }

    public final void onOutputFormatChanged(MediaFormat mediaFormat) {
        LiteavLog.m16901i(this.f47423a, "onOutputFormatChanged: ".concat(String.valueOf(mediaFormat)));
        VideoEncoderDef.VideoEncoderDataListener videoEncoderDataListener = this.f47431j;
        if (videoEncoderDataListener != null) {
            videoEncoderDataListener.onOutputFormatChanged(mediaFormat);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17571a(C17474ah ahVar, TakeSnapshotListener takeSnapshotListener) {
        C17501bf bfVar = ahVar.f47430i;
        if (bfVar != null) {
            bfVar.takeSnapshot(takeSnapshotListener);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m17585b(C17474ah ahVar, Rotation rotation) {
        LiteavLog.m16901i(ahVar.f47423a, "setCaptureRotation: ".concat(String.valueOf(rotation)));
        if (rotation != null) {
            ahVar.f47433l = rotation;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m17586c(C17474ah ahVar) {
        C17501bf bfVar = ahVar.f47430i;
        if (bfVar != null) {
            bfVar.restartIDRFrame();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m17590g() {
        PixelFrame a = this.f47424b.mo20217a();
        if (a != null) {
            C17500be beVar = this.f47445x;
            if (beVar.f47497f == null) {
                C113473t tVar = new C113473t(Looper.myLooper(), beVar);
                beVar.f47497f = tVar;
                tVar.mo169974a(0, 1000);
            }
            if (beVar.f47494c.containsKey(Long.valueOf(a.getTimestamp()))) {
                String str = beVar.f47492a;
                LiteavLog.m16901i(str, "Duplicate timestamp!" + a.getTimestamp());
            }
            beVar.f47494c.put(Long.valueOf(a.getTimestamp()), Long.valueOf(SystemClock.elapsedRealtime()));
            int i = C174762.f47449a[this.f47443v.mo20729a(a).ordinal()];
            if (i == 1) {
                m17565a(a);
            } else if (i == 2) {
                m17593h();
                m17565a(a);
            } else if (i == 3) {
                m17566a(VideoEncoderDef.C17464a.HARDWARE);
                m17565a(a);
            } else if (i == 4) {
                m17566a(VideoEncoderDef.C17464a.SOFTWARE);
                m17565a(a);
            } else if (i != 5) {
                if (a != f47422f) {
                    a.release();
                }
                LiteavLog.m16901i(this.f47423a, "encode ask instruction return default.");
            } else {
                if (a != f47422f) {
                    C17500be beVar2 = this.f47445x;
                    if (beVar2.f47494c.containsKey(Long.valueOf(a.getTimestamp()))) {
                        beVar2.f47494c.remove(Long.valueOf(a.getTimestamp()));
                    }
                    a.release();
                }
                onEncodedFail(C17263h.C17268a.ERR_VIDEO_ENCODE_FAIL);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m17593h() {
        VideoEncoderDef.C17464a j = m17596j();
        if (j != null) {
            m17566a(j);
        }
    }

    /* renamed from: i */
    private void m17595i() {
        C17501bf bfVar = this.f47430i;
        if (bfVar != null) {
            bfVar.stop();
            this.f47430i.uninitialize();
            this.f47430i = null;
            this.f47442u.notifyEvent(C17263h.C17269b.EVT_VIDEO_ENCODE_STOP_SUCCESS, "stop encoder success", new Object[0]);
        }
    }

    /* renamed from: j */
    private VideoEncoderDef.C17464a m17596j() {
        C17501bf bfVar = this.f47430i;
        if (bfVar == null) {
            return null;
        }
        return bfVar.getEncoderType();
    }

    /* renamed from: k */
    private CodecType m17599k() {
        C17501bf bfVar = this.f47430i;
        if (bfVar == null) {
            return null;
        }
        return bfVar.getEncodeParams().codecType;
    }

    /* renamed from: e */
    public final void mo20704e() {
        mo20696a(C17497bb.m17639a(this), "Stop");
    }

    /* renamed from: d */
    public static /* synthetic */ void m17587d(C17474ah ahVar) {
        LiteavLog.m16896d(ahVar.f47423a, "stop");
        ahVar.m17602n();
        ahVar.m17595i();
        ahVar.f47424b.mo20219b();
        ahVar.f47440s = false;
        ahVar.f47441t = false;
        ahVar.f47444w.mo20223b();
        C17503c cVar = ahVar.f47443v;
        cVar.mo20734c();
        cVar.f47516o = null;
        cVar.f47517p = null;
        cVar.f47504c = 0;
        cVar.f47505d = 0.0f;
        cVar.f47506e = 0.0f;
        cVar.f47507f = 0.0f;
        cVar.f47508g = 0.0d;
        cVar.f47509h = false;
        cVar.f47511j = VideoEncoderDef.EncodeStrategy.PREFER_HARDWARE;
        cVar.f47510i = false;
        cVar.f47512k = null;
        cVar.f47513l = C17503c.C17508e.NONE;
        cVar.f47514m = 0;
        cVar.f47515n = 0;
        cVar.f47518q = false;
        cVar.f47519r = 0;
        C17500be beVar = ahVar.f47445x;
        beVar.f47494c.clear();
        beVar.f47496e = 0;
        beVar.f47495d = 0;
    }

    /* renamed from: b */
    public final void mo20701b(Rotation rotation) {
        mo20696a(C17478aj.m17620a(this, rotation), "setEncodeRotation");
    }

    /* renamed from: b */
    public static /* synthetic */ void m17584b(C17474ah ahVar, int i) {
        C17501bf bfVar = ahVar.f47430i;
        if (bfVar != null) {
            bfVar.setRPSIFrameFPS(i);
        }
    }

    /* renamed from: a */
    public final void mo20695a(ServerVideoProducerConfig serverVideoProducerConfig) {
        mo20696a(C17492ax.m17634a(this, serverVideoProducerConfig), "setServerConfig");
    }

    /* renamed from: a */
    private void m17565a(PixelFrame pixelFrame) {
        if (pixelFrame == f47422f) {
            C17501bf bfVar = this.f47430i;
            if (bfVar != null) {
                bfVar.signalEndOfStream();
                return;
            }
            return;
        }
        C17501bf bfVar2 = this.f47430i;
        if (bfVar2 != null) {
            bfVar2.encodeFrame(m17582b(pixelFrame));
        }
        if (pixelFrame != null) {
            pixelFrame.release();
        }
    }

    /* renamed from: b */
    private PixelFrame m17582b(PixelFrame pixelFrame) {
        PixelFrame pixelFrame2 = new PixelFrame(pixelFrame);
        pixelFrame2.postRotate(this.f47433l);
        pixelFrame2.postRotate(this.f47432k);
        if (!this.f47434m) {
            return pixelFrame2;
        }
        Rotation rotation = this.f47433l;
        if (rotation == Rotation.ROTATION_90 || rotation == Rotation.ROTATION_270) {
            pixelFrame2.setMirrorVertical(!pixelFrame2.isMirrorVertical());
        } else {
            pixelFrame2.setMirrorHorizontal(!pixelFrame2.isMirrorHorizontal());
        }
        return pixelFrame2;
    }

    /* renamed from: f */
    public final VideoEncodeParams mo20705f() {
        VideoEncodeParams videoEncodeParams;
        FutureTask futureTask = new FutureTask(C17485aq.m17627a(this));
        mo20696a((Runnable) futureTask, "getEncodeParams");
        try {
            videoEncodeParams = (VideoEncodeParams) futureTask.get(500, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            if (e instanceof TimeoutException) {
                LiteavLog.m16905w(this.f47423a, "getEncodeParams future task timeout:".concat(String.valueOf(e)));
            } else {
                LiteavLog.m16905w(this.f47423a, "getEncodeParams future task error: ".concat(String.valueOf(e)));
            }
            synchronized (this) {
                videoEncodeParams = this.f47443v.mo20733b();
            }
        }
        if (videoEncodeParams != null) {
            return new VideoEncodeParams(videoEncodeParams);
        }
        return null;
    }

    /* renamed from: a */
    private void m17566a(VideoEncoderDef.C17464a aVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        VideoEncoderDef.C17464a j = m17596j();
        CodecType k = m17599k();
        VideoEncoderDef.ReferenceStrategy l = m17600l();
        m17595i();
        ServerVideoProducerConfig serverVideoProducerConfig = this.f47435n;
        if (!(serverVideoProducerConfig == null || serverVideoProducerConfig.isHardwareEncoderAllowed()) || VideoEncoderDef.C17464a.HARDWARE != aVar) {
            this.f47430i = new SoftwareVideoEncoder(this.f47442u, this.f47446y);
            LiteavLog.m16901i(this.f47423a, "create SoftwareVideoEncoder");
        } else {
            this.f47430i = new C17520o(this.f47428g, this.f47442u, this.f47446y);
            LiteavLog.m16901i(this.f47423a, "create HardwareVideoEncoder");
        }
        this.f47430i.initialize();
        this.f47430i.setServerConfig(this.f47435n);
        VideoEncodeParams b = this.f47443v.mo20733b();
        b.baseGopIndex = this.f47438q + 1;
        b.baseFrameIndex = this.f47437p + 20;
        if (this.f47430i.start(b, this)) {
            this.f47442u.notifyEvent(C17263h.C17269b.EVT_VIDEO_ENCODE_START_SUCCESS, "start encoder success.", new Object[0]);
        } else {
            this.f47443v.f47509h = true;
        }
        if (!(aVar == j && b.codecType == k && b.referenceStrategy == l)) {
            this.f47442u.updateStatus(C17271i.STATUS_VIDEO_ENCODER_TYPE, this.f47446y.mValue, new VideoEncoderDef.EncoderProperty(aVar, b.isEnablesRps() ? VideoEncoderDef.ReferenceStrategy.RPS : VideoEncoderDef.ReferenceStrategy.FIX_GOP, b.codecType));
        }
        String str = this.f47423a;
        LiteavLog.m16901i(str, "open encoder cost time: " + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    /* renamed from: b */
    public static /* synthetic */ VideoEncodeParams m17583b(C17474ah ahVar) {
        return new VideoEncodeParams(ahVar.f47443v.mo20733b());
    }

    /* renamed from: a */
    public final void mo20694a(VideoEncoderDef.EncodeStrategy encodeStrategy) {
        mo20696a(C17498bc.m17640a(this, encodeStrategy), "setEncodeStrategy");
    }

    /* renamed from: a */
    public static /* synthetic */ void m17576a(C17474ah ahVar, VideoEncoderDef.EncodeStrategy encodeStrategy) {
        LiteavLog.m16901i(ahVar.f47423a, "setEncodeStrategy ".concat(String.valueOf(encodeStrategy)));
        if (encodeStrategy != null) {
            C17503c cVar = ahVar.f47443v;
            LiteavLog.m16901i(cVar.f47502a, "strategy = ".concat(String.valueOf(encodeStrategy)));
            if (cVar.f47511j != encodeStrategy) {
                cVar.f47511j = encodeStrategy;
                cVar.f47512k = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo20692a(Rotation rotation) {
        mo20696a(C17499bd.m17641a(this, rotation), "setCameraRotation");
    }

    /* renamed from: a */
    public static /* synthetic */ void m17572a(C17474ah ahVar, Rotation rotation) {
        LiteavLog.m16901i(ahVar.f47423a, "setEncodeRotation: ".concat(String.valueOf(rotation)));
        if (rotation != null) {
            ahVar.f47432k = rotation;
        }
    }

    /* renamed from: a */
    public final void mo20698a(boolean z) {
        mo20696a(C17479ak.m17621a(this, z), "enableEncodeMirror");
    }

    /* renamed from: a */
    public static /* synthetic */ void m17569a(C17474ah ahVar, int i) {
        C17501bf bfVar = ahVar.f47430i;
        if (bfVar != null) {
            bfVar.setRPSNearestREFSize(i);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17570a(C17474ah ahVar, int i, int i2) {
        C17501bf bfVar = ahVar.f47430i;
        if (bfVar != null) {
            bfVar.ackRPSRecvFrameIndex(i, i2);
        }
    }

    /* renamed from: a */
    private void m17564a(long j, long j2) {
        this.f47437p = j;
        this.f47438q = j2;
    }

    /* renamed from: a */
    public final void mo20693a(VideoEncodeParams videoEncodeParams) {
        mo20696a(C17484ap.m17626a(this, videoEncodeParams), "reconfig");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        com.tencent.liteav.base.util.LiteavLog.m16905w(r2.f47423a, "ignore runnable: ".concat(java.lang.String.valueOf(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (android.os.Looper.myLooper() != r0.getLooper()) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r3.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r0.post(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r0 != null) goto L_0x002b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20696a(java.lang.Runnable r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f47427e     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x0016
            java.lang.String r3 = r2.f47423a     // Catch:{ all -> 0x003d }
            java.lang.String r0 = "runOnEncodeThread before initialize! "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x003d }
            java.lang.String r4 = r0.concat(r4)     // Catch:{ all -> 0x003d }
            com.tencent.liteav.base.util.LiteavLog.m16905w(r3, r4)     // Catch:{ all -> 0x003d }
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            return
        L_0x0016:
            com.tencent.liteav.base.util.b r0 = r2.f47426d     // Catch:{ all -> 0x003d }
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x002b
            java.lang.String r3 = r2.f47423a
            java.lang.String r0 = "ignore runnable: "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r0.concat(r4)
            com.tencent.liteav.base.util.LiteavLog.m16905w(r3, r4)
            return
        L_0x002b:
            android.os.Looper r4 = android.os.Looper.myLooper()
            android.os.Looper r1 = r0.getLooper()
            if (r4 != r1) goto L_0x0039
            r3.run()
            return
        L_0x0039:
            r0.post(r3)
            return
        L_0x003d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.encoder.C17474ah.mo20696a(java.lang.Runnable, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo20691a() {
        LiteavLog.m16901i(this.f47423a, "onRequestRestart");
        mo20696a(C17486ar.m17628a(this), "restartEncoder");
    }

    /* renamed from: a */
    public final void mo20697a(String str) {
        mo20696a(C17487as.m17629a(this, str), "onEncodeError");
    }

    /* renamed from: a */
    public static /* synthetic */ void m17578a(C17474ah ahVar, String str) {
        LiteavLog.m16901i(ahVar.f47423a, "onEncodeError: ".concat(String.valueOf(str)));
        ahVar.f47443v.f47509h = true;
    }

    /* renamed from: a */
    public final void mo20699a(boolean z, int i) {
        mo20696a(C17489au.m17631a(this, z, i), "onRpsFrameRateChanged");
    }

    /* renamed from: a */
    public static /* synthetic */ void m17580a(C17474ah ahVar, boolean z, int i) {
        C17503c cVar = ahVar.f47443v;
        cVar.f47518q = z;
        cVar.f47519r = i;
    }

    /* renamed from: a */
    public static /* synthetic */ void m17581a(C17474ah ahVar, boolean z, EncodedVideoFrame encodedVideoFrame) {
        C17474ah ahVar2 = ahVar;
        boolean z2 = z;
        EncodedVideoFrame encodedVideoFrame2 = encodedVideoFrame;
        boolean z3 = true;
        if (!ahVar2.f47441t) {
            ahVar2.f47441t = true;
            LiteavLog.m16901i(ahVar2.f47423a, "encode first frame cost time: " + (SystemClock.elapsedRealtime() - ahVar2.f47439r));
        }
        if (!z2) {
            ahVar2.m17564a(encodedVideoFrame2.frameIndex, encodedVideoFrame2.gopIndex);
            C17503c cVar = ahVar2.f47443v;
            cVar.f47503b++;
            C17527v vVar = cVar.f47520s;
            if (encodedVideoFrame2.data == null) {
                LiteavLog.m16905w(vVar.f47582a, "encodedVideoFrame is null.");
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = vVar.f47584c;
                if (elapsedRealtime <= ((long) vVar.f47590i) + j) {
                    vVar.f47585d++;
                } else {
                    double d = (((double) vVar.f47585d) * 1000.0d) / ((double) (elapsedRealtime - j));
                    vVar.f47583b = d;
                    vVar.f47585d = 1;
                    vVar.f47584c = elapsedRealtime;
                    C17527v.C17528a aVar = vVar.f47589h;
                    if (aVar != null) {
                        aVar.mo20730a(d);
                    }
                }
                if (encodedVideoFrame2.nalType != C17205a.IDR) {
                    z3 = false;
                }
                long remaining = (long) encodedVideoFrame2.data.remaining();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (z3) {
                    long j2 = vVar.f47587f;
                    if (elapsedRealtime2 > ((long) vVar.f47591j) + j2) {
                        long j3 = (long) (((((double) vVar.f47588g) * 8000.0d) / ((double) (elapsedRealtime2 - j2))) / 1024.0d);
                        vVar.f47586e = j3;
                        vVar.f47588g = 0;
                        vVar.f47587f = elapsedRealtime2;
                        C17527v.C17528a aVar2 = vVar.f47589h;
                        if (aVar2 != null) {
                            aVar2.mo20731a(j3);
                        }
                    }
                }
                vVar.f47588g += remaining;
            }
            C17500be beVar = ahVar2.f47445x;
            if (beVar.f47494c.containsKey(Long.valueOf(encodedVideoFrame2.dts))) {
                long elapsedRealtime3 = SystemClock.elapsedRealtime() - beVar.f47494c.remove(Long.valueOf(encodedVideoFrame2.dts)).longValue();
                beVar.f47496e++;
                beVar.f47495d += elapsedRealtime3;
                beVar.f47493b.updateStatus(C17271i.STATUS_VIDEO_ENCODER_COST, Long.valueOf(elapsedRealtime3));
            }
        } else {
            LiteavLog.m16901i(ahVar2.f47423a, "got eos");
        }
        VideoEncoderDef.VideoEncoderDataListener videoEncoderDataListener = ahVar2.f47431j;
        if (videoEncoderDataListener != null) {
            videoEncoderDataListener.onEncodedNAL(encodedVideoFrame2, z2);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17573a(C17474ah ahVar, C17263h.C17268a aVar) {
        LiteavLog.m16901i(ahVar.f47423a, "onEncodedFail: ".concat(String.valueOf(aVar)));
        ahVar.f47442u.notifyError(C17263h.C17268a.ERR_VIDEO_ENCODE_FATALERROR, "encode fail:".concat(String.valueOf(aVar)), new Object[0]);
        VideoEncoderDef.VideoEncoderDataListener videoEncoderDataListener = ahVar.f47431j;
        if (videoEncoderDataListener != null) {
            videoEncoderDataListener.onEncodedFail(aVar);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17574a(C17474ah ahVar, VideoEncodeParams videoEncodeParams) {
        LiteavLog.m16901i(ahVar.f47423a, "reconfig: ".concat(String.valueOf(videoEncodeParams)));
        if (videoEncodeParams != null) {
            VideoEncodeParams b = ahVar.f47443v.mo20733b();
            ahVar.f47443v.mo20732a(videoEncodeParams);
            VideoEncodeParams b2 = ahVar.f47443v.mo20733b();
            C17501bf bfVar = ahVar.f47430i;
            if (bfVar != null) {
                bfVar.setFps(b2.fps);
                ahVar.f47430i.setBitrate(b2.bitrate);
                if (ahVar.mo20702c() && b2.fps != b.fps) {
                    ahVar.m17602n();
                    ahVar.m17601m();
                }
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17575a(C17474ah ahVar, VideoEncodeParams videoEncodeParams, VideoEncoderDef.VideoEncoderDataListener videoEncoderDataListener) {
        if (videoEncodeParams == null || videoEncodeParams.width == 0 || videoEncodeParams.height == 0 || videoEncodeParams.fps == 0 || videoEncodeParams.gop == 0 || videoEncodeParams.bitrate == 0) {
            LiteavLog.m16898e(ahVar.f47423a, "invalid params, Start failed.");
            return;
        }
        ahVar.f47431j = videoEncoderDataListener;
        ahVar.f47443v.mo20732a(videoEncodeParams);
        ahVar.m17564a(videoEncodeParams.baseFrameIndex, videoEncodeParams.baseGopIndex);
        if (ahVar.mo20702c()) {
            ahVar.m17601m();
        } else {
            ahVar.m17602n();
        }
    }
}
