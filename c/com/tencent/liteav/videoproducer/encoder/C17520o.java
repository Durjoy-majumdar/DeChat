package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.frame.C17234j;
import com.tencent.liteav.videobase.p1096b.C104514c;
import com.tencent.liteav.videobase.p1096b.C104515d;
import com.tencent.liteav.videobase.p1096b.C104516e;
import com.tencent.liteav.videobase.p1096b.C104518g;
import com.tencent.liteav.videobase.utils.C17251j;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.encoder.C17501bf;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;
import com.tencent.tavkit.component.TAVExporter;
import com.tencent.xweb.IXWebBroadcastListener;

/* renamed from: com.tencent.liteav.videoproducer.encoder.o */
public final class C17520o implements C17501bf, C17501bf.C17502a {

    /* renamed from: a */
    private final String f47557a;

    /* renamed from: b */
    private final IVideoReporter f47558b;

    /* renamed from: c */
    private final C104507p f47559c = new C104507p(0, 0);

    /* renamed from: d */
    private final C17529w f47560d;

    /* renamed from: e */
    private Surface f47561e;

    /* renamed from: f */
    private C104516e f47562f;

    /* renamed from: g */
    private C17234j f47563g;

    /* renamed from: h */
    private VideoEncodeParams f47564h;

    /* renamed from: i */
    private long f47565i = 0;

    /* renamed from: j */
    private volatile Handler f47566j;

    /* renamed from: k */
    private volatile C17501bf.C17502a f47567k;

    /* renamed from: l */
    private C104514c f47568l;

    /* renamed from: m */
    private final C17251j f47569m;

    public C17520o(Bundle bundle, IVideoReporter iVideoReporter, VideoProducerDef.StreamType streamType) {
        this.f47560d = new C17529w(bundle, iVideoReporter, streamType);
        this.f47558b = iVideoReporter;
        this.f47569m = new C17251j("hwEn" + hashCode());
        this.f47557a = "HardwareVideoEncoder_" + streamType + "_" + hashCode();
    }

    /* renamed from: a */
    private boolean m17690a(Object obj, Surface surface) {
        if (surface == null) {
            LiteavLog.m16905w(this.f47557a, "init opengl: surface is null.");
            return false;
        }
        LiteavLog.m16896d(this.f47557a, "initOpenGLComponents");
        C104516e eVar = new C104516e();
        this.f47562f = eVar;
        try {
            C104507p pVar = this.f47559c;
            eVar.mo147196a(obj, surface, pVar.f309736a, pVar.f309737b);
            this.f47569m.mo20231a((C17223e) null);
            C17251j jVar = this.f47569m;
            C104507p pVar2 = this.f47559c;
            jVar.mo20229a(pVar2.f309736a, pVar2.f309737b);
            C104507p pVar3 = this.f47559c;
            this.f47563g = new C17234j(pVar3.f309736a, pVar3.f309737b);
            return true;
        } catch (C104518g e) {
            IVideoReporter iVideoReporter = this.f47558b;
            C17263h.C17270c cVar = C17263h.C17270c.WARNING_VIDEO_ENCODE_EGL_CORE_CREATE_FAILED;
            iVideoReporter.notifyWarning(cVar, "VideoEncode: create EGLCore failed, EGLCode:" + e.mErrorCode + " message:" + e.getMessage(), new Object[0]);
            this.f47560d.mo20745a(e.getMessage());
            LiteavLog.m16899e(this.f47557a, "create EGLCore failed.", (Throwable) e);
            this.f47562f = null;
            return false;
        }
    }

    /* renamed from: b */
    private void m17691b() {
        if (this.f47562f != null) {
            LiteavLog.m16896d(this.f47557a, "uninitOpenGLComponents");
            try {
                this.f47562f.mo147195a();
                C17234j jVar = this.f47563g;
                if (jVar != null) {
                    jVar.mo20209a();
                    this.f47563g = null;
                }
                this.f47569m.mo20228a();
            } catch (C104518g e) {
                LiteavLog.m16899e(this.f47557a, "makeCurrent failed.", (Throwable) e);
            }
            C104516e.m139822a(this.f47562f);
            this.f47562f = null;
        }
    }

    /* renamed from: a */
    public final void mo20699a(boolean z, int i) {
    }

    public final void ackRPSRecvFrameIndex(int i, int i2) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032 A[SYNTHETIC, Splitter:B:15:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0071 A[Catch:{ g -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a A[Catch:{ g -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void encodeFrame(com.tencent.liteav.videobase.frame.PixelFrame r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            com.tencent.liteav.videobase.b.c r0 = r6.f47568l
            java.lang.Object r1 = r7.getGLContext()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x000f
        L_0x000d:
            r0 = 1
            goto L_0x001c
        L_0x000f:
            java.lang.Object r4 = r0.f309778c
            boolean r4 = com.tencent.liteav.base.util.CommonUtil.equals(r4, r1)
            r4 = r4 ^ r2
            r0.f309778c = r1
            if (r4 != 0) goto L_0x001b
            goto L_0x000d
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 != 0) goto L_0x0021
            r6.m17691b()
        L_0x0021:
            com.tencent.liteav.videobase.b.e r0 = r6.f47562f
            if (r0 != 0) goto L_0x0032
            java.lang.Object r0 = r7.getGLContext()
            android.view.Surface r1 = r6.f47561e
            boolean r0 = r6.m17690a((java.lang.Object) r0, (android.view.Surface) r1)
            if (r0 != 0) goto L_0x0032
            return
        L_0x0032:
            com.tencent.liteav.videobase.b.e r0 = r6.f47562f     // Catch:{ g -> 0x00d5 }
            r0.mo147195a()     // Catch:{ g -> 0x00d5 }
            com.tencent.liteav.videobase.utils.j r0 = r6.f47569m     // Catch:{ g -> 0x00d5 }
            r0.mo20230a((com.tencent.liteav.videobase.frame.PixelFrame) r7)     // Catch:{ g -> 0x00d5 }
            com.tencent.liteav.videobase.utils.Rotation r0 = r7.getRotation()     // Catch:{ g -> 0x00d5 }
            com.tencent.liteav.videobase.utils.Rotation r1 = com.tencent.liteav.videobase.utils.Rotation.ROTATION_90     // Catch:{ g -> 0x00d5 }
            if (r0 == r1) goto L_0x0059
            com.tencent.liteav.videobase.utils.Rotation r0 = r7.getRotation()     // Catch:{ g -> 0x00d5 }
            com.tencent.liteav.videobase.utils.Rotation r1 = com.tencent.liteav.videobase.utils.Rotation.ROTATION_270     // Catch:{ g -> 0x00d5 }
            if (r0 != r1) goto L_0x004d
            goto L_0x0059
        L_0x004d:
            boolean r0 = r7.isMirrorVertical()     // Catch:{ g -> 0x00d5 }
            if (r0 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            r7.setMirrorVertical(r2)     // Catch:{ g -> 0x00d5 }
            goto L_0x0064
        L_0x0059:
            boolean r0 = r7.isMirrorHorizontal()     // Catch:{ g -> 0x00d5 }
            if (r0 != 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            r7.setMirrorHorizontal(r2)     // Catch:{ g -> 0x00d5 }
        L_0x0064:
            com.tencent.liteav.base.util.p r0 = r6.f47559c     // Catch:{ g -> 0x00d5 }
            int r1 = r0.f309736a     // Catch:{ g -> 0x00d5 }
            int r0 = r0.f309737b     // Catch:{ g -> 0x00d5 }
            com.tencent.liteav.videobase.utils.OpenGlUtils.glViewport(r3, r3, r1, r0)     // Catch:{ g -> 0x00d5 }
            com.tencent.liteav.videobase.frame.j r0 = r6.f47563g     // Catch:{ g -> 0x00d5 }
            if (r0 == 0) goto L_0x0077
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r1 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP     // Catch:{ g -> 0x00d5 }
            r2 = 0
            r0.mo20210a((com.tencent.liteav.videobase.frame.PixelFrame) r7, (com.tencent.liteav.videobase.base.GLConstants.GLScaleType) r1, (com.tencent.liteav.videobase.frame.C17222d) r2)     // Catch:{ g -> 0x00d5 }
        L_0x0077:
            com.tencent.liteav.videoproducer.encoder.w r0 = r6.f47560d     // Catch:{ g -> 0x00d5 }
            long r1 = r7.getTimestamp()     // Catch:{ g -> 0x00d5 }
            r0.mo20743a((long) r1)     // Catch:{ g -> 0x00d5 }
            long r0 = r7.getTimestamp()     // Catch:{ g -> 0x00d5 }
            long r4 = r6.f47565i     // Catch:{ g -> 0x00d5 }
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ac
            java.lang.String r0 = r6.f47557a     // Catch:{ g -> 0x00d5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ g -> 0x00d5 }
            java.lang.String r2 = "timestamp is not increase. pre: "
            r1.<init>(r2)     // Catch:{ g -> 0x00d5 }
            long r4 = r6.f47565i     // Catch:{ g -> 0x00d5 }
            r1.append(r4)     // Catch:{ g -> 0x00d5 }
            java.lang.String r2 = ", cur: "
            r1.append(r2)     // Catch:{ g -> 0x00d5 }
            long r4 = r7.getTimestamp()     // Catch:{ g -> 0x00d5 }
            r1.append(r4)     // Catch:{ g -> 0x00d5 }
            java.lang.String r1 = r1.toString()     // Catch:{ g -> 0x00d5 }
            com.tencent.liteav.base.util.LiteavLog.m16898e(r0, r1)     // Catch:{ g -> 0x00d5 }
        L_0x00ac:
            long r0 = r7.getTimestamp()     // Catch:{ g -> 0x00d5 }
            r6.f47565i = r0     // Catch:{ g -> 0x00d5 }
            com.tencent.liteav.videobase.b.e r0 = r6.f47562f     // Catch:{ g -> 0x00d5 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ g -> 0x00d5 }
            long r4 = r7.getTimestamp()     // Catch:{ g -> 0x00d5 }
            long r1 = r1.toNanos(r4)     // Catch:{ g -> 0x00d5 }
            com.tencent.liteav.videobase.b.h<?> r7 = r0.f309784a     // Catch:{ g -> 0x00d5 }
            if (r7 == 0) goto L_0x00cf
            boolean r0 = r7 instanceof com.tencent.liteav.videobase.p1096b.C104513b     // Catch:{ g -> 0x00d5 }
            if (r0 == 0) goto L_0x00cf
            com.tencent.liteav.videobase.b.b r7 = (com.tencent.liteav.videobase.p1096b.C104513b) r7     // Catch:{ g -> 0x00d5 }
            android.opengl.EGLDisplay r0 = r7.f309770a     // Catch:{ g -> 0x00d5 }
            android.opengl.EGLSurface r7 = r7.f309771b     // Catch:{ g -> 0x00d5 }
            android.opengl.EGLExt.eglPresentationTimeANDROID(r0, r7, r1)     // Catch:{ g -> 0x00d5 }
        L_0x00cf:
            com.tencent.liteav.videobase.b.e r7 = r6.f47562f     // Catch:{ g -> 0x00d5 }
            r7.mo147197b()     // Catch:{ g -> 0x00d5 }
            return
        L_0x00d5:
            r7 = move-exception
            com.tencent.liteav.videobase.videobase.IVideoReporter r0 = r6.f47558b
            com.tencent.liteav.videobase.videobase.h$c r1 = com.tencent.liteav.videobase.videobase.C17263h.C17270c.WARNING_VIDEO_ENCODE_SWAP_BUFFER
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "VideoEncode: swapBuffer error, EGLCode:"
            r2.<init>(r4)
            int r4 = r7.mErrorCode
            r2.append(r4)
            java.lang.String r4 = " message:"
            r2.append(r4)
            java.lang.String r4 = r7.getMessage()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0.notifyWarning(r1, r2, r3)
            com.tencent.liteav.videoproducer.encoder.w r0 = r6.f47560d
            java.lang.String r1 = r7.getMessage()
            r0.mo20745a((java.lang.String) r1)
            java.lang.String r0 = r6.f47557a
            java.lang.String r1 = "makeCurrent failed."
            com.tencent.liteav.base.util.LiteavLog.m16899e((java.lang.String) r0, (java.lang.String) r1, (java.lang.Throwable) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.encoder.C17520o.encodeFrame(com.tencent.liteav.videobase.frame.PixelFrame):void");
    }

    public final VideoEncodeParams getEncodeParams() {
        return new VideoEncodeParams(this.f47564h);
    }

    public final VideoEncoderDef.C17464a getEncoderType() {
        return VideoEncoderDef.C17464a.HARDWARE;
    }

    public final void initialize() {
        LiteavLog.m16896d(this.f47557a, "initialize");
        this.f47566j = new Handler(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f47568l = new C104514c(this.f47566j.getLooper());
        C17529w wVar = this.f47560d;
        LiteavLog.m16896d(wVar.f47603a, "initialize");
        HandlerThread handlerThread = new HandlerThread("hw-video-encoder");
        handlerThread.start();
        wVar.f47605c = new C17111b(handlerThread.getLooper());
    }

    public final void onEncodedFail(C17263h.C17268a aVar) {
        m17689a(C17525t.m17699a(this, aVar));
    }

    public final void onEncodedNAL(EncodedVideoFrame encodedVideoFrame, boolean z) {
        m17689a(C17524s.m17698a(this, encodedVideoFrame, z));
    }

    public final void onOutputFormatChanged(MediaFormat mediaFormat) {
        m17689a(C17523r.m17697a(this, mediaFormat));
    }

    public final void restartIDRFrame() {
    }

    public final void setBitrate(int i) {
        LiteavLog.m16901i(this.f47557a, "SetBitrate ".concat(String.valueOf(i)));
        VideoEncodeParams videoEncodeParams = this.f47564h;
        if (videoEncodeParams != null) {
            videoEncodeParams.bitrate = i;
        }
        C17529w wVar = this.f47560d;
        wVar.f47605c.post(C17470ad.m17560a(wVar, i));
    }

    public final void setFps(int i) {
    }

    public final void setRPSIFrameFPS(int i) {
    }

    public final void setRPSNearestREFSize(int i) {
    }

    public final void setServerConfig(ServerVideoProducerConfig serverVideoProducerConfig) {
        C17529w wVar = this.f47560d;
        wVar.f47605c.post(C17467aa.m17557a(wVar, serverVideoProducerConfig));
    }

    public final void signalEndOfStream() {
        C17529w wVar = this.f47560d;
        wVar.f47605c.post(C17471ae.m17561a(wVar));
    }

    public final boolean start(VideoEncodeParams videoEncodeParams, C17501bf.C17502a aVar) {
        if (this.f47561e != null) {
            LiteavLog.m16898e(this.f47557a, "Encoder has started");
            return false;
        }
        LiteavLog.m16902i(this.f47557a, "Start hw video encoder. %s", videoEncodeParams);
        this.f47567k = aVar;
        C17529w wVar = this.f47560d;
        LiteavLog.m16896d(wVar.f47603a, IXWebBroadcastListener.STAGE_START);
        Surface[] surfaceArr = new Surface[1];
        LiteavLog.m16901i(wVar.f47603a, "startCodecInternal success: ".concat(String.valueOf(wVar.f47605c.mo19362a(C17468ab.m17558a(wVar, this, surfaceArr, videoEncodeParams), (long) FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION))));
        C104507p pVar = new C104507p(TAVExporter.VIDEO_EXPORT_WIDTH, 1280);
        VideoEncodeParams videoEncodeParams2 = wVar.f47608f;
        if (videoEncodeParams2 != null) {
            pVar.mo147176a(videoEncodeParams2.width, videoEncodeParams2.height);
        }
        Pair pair = new Pair(surfaceArr[0], pVar);
        this.f47561e = (Surface) pair.first;
        this.f47559c.mo147177a((C104507p) pair.second);
        this.f47564h = new VideoEncodeParams(videoEncodeParams);
        return this.f47561e != null;
    }

    public final void stop() {
        LiteavLog.m16896d(this.f47557a, "stop");
        m17691b();
        Surface surface = this.f47561e;
        if (surface != null) {
            surface.release();
            this.f47561e = null;
        }
        C17529w wVar = this.f47560d;
        LiteavLog.m16896d(wVar.f47603a, "stop");
        wVar.f47605c.post(C17473ag.m17563a(wVar));
        this.f47567k = null;
    }

    public final void takeSnapshot(TakeSnapshotListener takeSnapshotListener) {
        this.f47569m.f46629a = takeSnapshotListener;
    }

    public final void uninitialize() {
        LiteavLog.m16896d(this.f47557a, "uninitialize");
        C17529w wVar = this.f47560d;
        LiteavLog.m16896d(wVar.f47603a, "uninitialize");
        wVar.f47605c.mo19360a();
        C104514c cVar = this.f47568l;
        cVar.f309776a.post(C104515d.m139821a(cVar));
        this.f47566j = null;
    }

    /* renamed from: a */
    private void m17689a(Runnable runnable) {
        Handler handler = this.f47566j;
        if (handler == null) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    /* renamed from: a */
    public final void mo20691a() {
        m17689a(C17521p.m17695a(this));
    }

    /* renamed from: a */
    public static /* synthetic */ void m17684a(C17520o oVar) {
        C17501bf.C17502a aVar = oVar.f47567k;
        if (aVar != null) {
            aVar.mo20691a();
        }
    }

    /* renamed from: a */
    public final void mo20697a(String str) {
        m17689a(C17522q.m17696a(this, str));
    }

    /* renamed from: a */
    public static /* synthetic */ void m17688a(C17520o oVar, String str) {
        C17501bf.C17502a aVar = oVar.f47567k;
        if (aVar != null) {
            aVar.mo20697a(str);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17685a(C17520o oVar, MediaFormat mediaFormat) {
        C17501bf.C17502a aVar = oVar.f47567k;
        if (aVar != null) {
            aVar.onOutputFormatChanged(mediaFormat);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17686a(C17520o oVar, EncodedVideoFrame encodedVideoFrame, boolean z) {
        C17501bf.C17502a aVar = oVar.f47567k;
        if (aVar != null) {
            aVar.onEncodedNAL(encodedVideoFrame, z);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17687a(C17520o oVar, C17263h.C17268a aVar) {
        C17501bf.C17502a aVar2 = oVar.f47567k;
        if (aVar2 != null) {
            aVar2.onEncodedFail(aVar);
        }
    }
}
