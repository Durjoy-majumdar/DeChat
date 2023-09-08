package com.tencent.liteav.videoconsumer.decoder;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.frame.C17234j;
import com.tencent.liteav.videobase.frame.C17237l;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.p1096b.C104516e;
import com.tencent.liteav.videobase.p1096b.C104518g;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.consumer.ServerVideoConsumerConfig;
import com.tencent.liteav.videoconsumer.decoder.C17334au;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.q */
public final class C17359q implements SurfaceTexture.OnFrameAvailableListener, C17334au {

    /* renamed from: a */
    private String f47051a;

    /* renamed from: b */
    private final C104507p f47052b;

    /* renamed from: c */
    private final IVideoReporter f47053c;

    /* renamed from: d */
    private final JSONArray f47054d;

    /* renamed from: e */
    private final String f47055e;

    /* renamed from: f */
    private volatile C17111b f47056f;

    /* renamed from: g */
    private MediaCodec f47057g;

    /* renamed from: h */
    private C17336av f47058h;

    /* renamed from: i */
    private final MediaCodec.BufferInfo f47059i;

    /* renamed from: j */
    private EncodedVideoFrame f47060j;

    /* renamed from: k */
    private boolean f47061k;

    /* renamed from: l */
    private C104516e f47062l;

    /* renamed from: m */
    private int f47063m;

    /* renamed from: n */
    private C17237l f47064n;

    /* renamed from: o */
    private SurfaceTexture f47065o;

    /* renamed from: p */
    private Surface f47066p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public VideoDecoderDef.ConsumerScene f47067q;

    /* renamed from: r */
    private boolean f47068r;

    /* renamed from: s */
    private final C17358p f47069s;

    /* renamed from: t */
    private boolean f47070t;

    /* renamed from: u */
    private MediaFormat f47071u;

    /* renamed from: v */
    private C17234j f47072v;

    /* renamed from: w */
    private C17223e f47073w;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17359q(C104507p pVar, boolean z, JSONArray jSONArray, IVideoReporter iVideoReporter) {
        this(pVar, z ? "video/hevc" : "video/avc", jSONArray, iVideoReporter);
    }

    /* renamed from: b */
    private boolean m17325b() {
        try {
            C104516e eVar = this.f47062l;
            if (eVar == null) {
                return true;
            }
            eVar.mo147195a();
            return true;
        } catch (C104518g e) {
            LiteavLog.m16899e(this.f47051a, "makeCurrent failed.", (Throwable) e);
            return false;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m17326c(C17359q qVar) {
        EncodedVideoFrame encodedVideoFrame;
        LiteavLog.m16901i(qVar.f47051a, "Stop internal");
        MediaCodec mediaCodec = qVar.f47057g;
        if (mediaCodec != null) {
            qVar.m17313a(mediaCodec);
            qVar.f47057g = null;
        }
        synchronized (qVar) {
            encodedVideoFrame = qVar.f47060j;
            qVar.f47060j = null;
        }
        m17314a(encodedVideoFrame);
        LiteavLog.m16901i(qVar.f47051a, "uninitialize gl components");
        if (qVar.m17325b()) {
            C17237l lVar = qVar.f47064n;
            if (lVar != null) {
                lVar.mo20205b();
            }
            Surface surface = qVar.f47066p;
            if (surface != null) {
                surface.release();
                qVar.f47066p = null;
            }
            SurfaceTexture surfaceTexture = qVar.f47065o;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                qVar.f47065o = null;
            }
            C17223e eVar = qVar.f47073w;
            if (eVar != null) {
                eVar.mo20187b();
                qVar.f47073w = null;
            }
            C17234j jVar = qVar.f47072v;
            if (jVar != null) {
                jVar.mo20209a();
                qVar.f47072v = null;
            }
            OpenGlUtils.deleteTexture(qVar.f47063m);
            qVar.f47063m = -1;
            C104516e.m139822a(qVar.f47062l);
            qVar.f47062l = null;
        }
        qVar.f47061k = true;
    }

    public final boolean decode(EncodedVideoFrame encodedVideoFrame) {
        synchronized (this) {
            if (this.f47060j == null) {
                if (encodedVideoFrame != null) {
                    this.f47060j = encodedVideoFrame;
                    m17321a(C17364u.m17330a(this));
                    return true;
                }
            }
            m17321a(C17363t.m17329a(this));
            return false;
        }
    }

    public final C17334au.C17335a getDecoderType() {
        return C17334au.C17335a.HARDWARE;
    }

    public final void initialize() {
        HandlerThread handlerThread = new HandlerThread("HardwareVideoDecoder_" + hashCode());
        handlerThread.start();
        this.f47056f = new C17111b(handlerThread.getLooper());
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        m17321a(C17367x.m17333a(this, surfaceTexture));
    }

    public final void setScene(VideoDecoderDef.ConsumerScene consumerScene) {
        m17321a(C17361r.m17327a(this, consumerScene));
    }

    public final void setServerConfig(ServerVideoConsumerConfig serverVideoConsumerConfig) {
        m17321a(C17366w.m17332a(this, serverVideoConsumerConfig));
    }

    public final void start(Object obj, C17336av avVar) {
        m17321a(C17362s.m17328a(this, obj, avVar));
    }

    public final void stop() {
        m17321a(C17365v.m17331a(this));
    }

    public final void uninitialize() {
        if (this.f47056f != null) {
            LiteavLog.m16901i(this.f47051a, "uninitialize quitLooper");
            this.f47056f.mo19360a();
        }
    }

    public C17359q(MediaFormat mediaFormat, JSONArray jSONArray, IVideoReporter iVideoReporter) {
        this(new C104507p(mediaFormat.getInteger("width"), mediaFormat.getInteger("height")), mediaFormat.getString("mime"), jSONArray, iVideoReporter);
        this.f47071u = mediaFormat;
    }

    /* renamed from: a */
    private boolean m17323a(Object obj) {
        C104516e eVar = new C104516e();
        this.f47062l = eVar;
        try {
            eVar.mo147196a(obj, (Surface) null, 128, 128);
            this.f47062l.mo147195a();
            this.f47063m = OpenGlUtils.generateTextureOES();
            this.f47064n = new C17237l();
            try {
                this.f47065o = new SurfaceTexture(this.f47063m);
                this.f47066p = new Surface(this.f47065o);
                this.f47065o.setOnFrameAvailableListener(this);
                LiteavLog.m16901i(this.f47051a, "initialize gl components");
                return true;
            } catch (Surface.OutOfResourcesException e) {
                LiteavLog.m16899e(this.f47051a, "create SurfaceTexture failed.", (Throwable) e);
                C17263h.C17270c cVar = C17263h.C17270c.WARNING_VIDEO_DECODE_START_FAILED_INSUFFICIENT_RESOURCE;
                m17315a(cVar, "VideoDecode: insufficient resource, Start decoder failed:" + e.getMessage(), new Object[0]);
                return false;
            }
        } catch (C104518g e2) {
            LiteavLog.m16899e(this.f47051a, "create EGLCore failed.", (Throwable) e2);
            C17263h.C17270c cVar2 = C17263h.C17270c.WARNING_VIDEO_DECODE_EGL_CORE_CREATE_FAILED;
            m17315a(cVar2, "VideoDecode: create EGLCore failed errorCode:" + e2.mErrorCode, new Object[0]);
            return false;
        }
    }

    /* renamed from: com.tencent.liteav.videoconsumer.decoder.q$a */
    public static class C17360a {

        /* renamed from: a */
        public MediaCodec f47074a;

        /* renamed from: b */
        public C17263h.C17270c f47075b;

        /* renamed from: c */
        public String f47076c;

        /* renamed from: d */
        public Exception f47077d;

        private C17360a() {
            this.f47074a = null;
            this.f47075b = null;
            this.f47076c = null;
            this.f47077d = null;
        }

        public /* synthetic */ C17360a(byte b) {
            this();
        }
    }

    private C17359q(C104507p pVar, String str, JSONArray jSONArray, IVideoReporter iVideoReporter) {
        this.f47051a = "HardwareVideoDecoder";
        this.f47057g = null;
        this.f47059i = new MediaCodec.BufferInfo();
        this.f47060j = null;
        this.f47061k = true;
        this.f47063m = -1;
        this.f47067q = VideoDecoderDef.ConsumerScene.UNKNOWN;
        this.f47068r = false;
        this.f47069s = new C17358p();
        this.f47070t = false;
        this.f47052b = new C104507p(pVar);
        this.f47055e = str;
        this.f47053c = iVideoReporter;
        this.f47054d = jSONArray;
        String str2 = this.f47051a + "_" + hashCode();
        this.f47051a = str2;
        LiteavLog.m16901i(str2, "create decoder format: " + this.f47071u + " , params: " + jSONArray);
    }

    /* renamed from: a */
    private void m17313a(MediaCodec mediaCodec) {
        if (mediaCodec != null) {
            try {
                LiteavLog.m16901i(this.f47051a, "mediaCodec stop");
                mediaCodec.stop();
                try {
                    LiteavLog.m16901i(this.f47051a, "mediaCodec release");
                    mediaCodec.release();
                } catch (Exception e) {
                    LiteavLog.m16899e(this.f47051a, "release MediaCodec failed.", (Throwable) e);
                }
            } catch (Exception e2) {
                String str = this.f47051a;
                LiteavLog.m16898e(str, "Stop MediaCodec failed." + e2.getMessage());
                LiteavLog.m16901i(this.f47051a, "mediaCodec release");
                mediaCodec.release();
            } catch (Throwable th) {
                try {
                    LiteavLog.m16901i(this.f47051a, "mediaCodec release");
                    mediaCodec.release();
                } catch (Exception e3) {
                    LiteavLog.m16899e(this.f47051a, "release MediaCodec failed.", (Throwable) e3);
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0282 A[Catch:{ Exception -> 0x0297 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0283 A[Catch:{ Exception -> 0x0297 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0110 A[Catch:{ Exception -> 0x0297 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0118 A[Catch:{ Exception -> 0x0297 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m17312a() {
        /*
            r18 = this;
            r1 = r18
            android.media.MediaCodec r0 = r1.f47057g
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r1.f47051a
            java.lang.String r2 = "MediaCodec is stopped."
            com.tencent.liteav.base.util.LiteavLog.m16905w(r0, r2)
            return
        L_0x000e:
            r2 = 0
            monitor-enter(r18)     // Catch:{ Exception -> 0x0297 }
            com.tencent.liteav.videobase.common.EncodedVideoFrame r3 = r1.f47060j     // Catch:{ all -> 0x0294 }
            monitor-exit(r18)     // Catch:{ all -> 0x0294 }
            r0 = -1
            r4 = 3
            r5 = 1
            if (r3 == 0) goto L_0x00e6
            r6 = 0
        L_0x0019:
            if (r6 >= r4) goto L_0x00e6
            android.media.MediaCodec r7 = r1.f47057g     // Catch:{ Exception -> 0x0297 }
            android.media.MediaCodec$BufferInfo r8 = r1.f47059i     // Catch:{ Exception -> 0x0297 }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0297 }
            r10 = 10
            long r9 = r9.toMicros(r10)     // Catch:{ Exception -> 0x0297 }
            int r7 = r7.dequeueOutputBuffer(r8, r9)     // Catch:{ Exception -> 0x0297 }
            if (r7 == r0) goto L_0x00e6
            r8 = -3
            if (r7 != r8) goto L_0x0038
            java.lang.String r7 = r1.f47051a     // Catch:{ Exception -> 0x0297 }
            java.lang.String r8 = "on output buffers changed"
            com.tencent.liteav.base.util.LiteavLog.m16901i(r7, r8)     // Catch:{ Exception -> 0x0297 }
            goto L_0x00a4
        L_0x0038:
            r8 = -2
            r9 = 4
            if (r7 != r8) goto L_0x00a8
            android.media.MediaCodec r7 = r1.f47057g     // Catch:{ Exception -> 0x0297 }
            android.media.MediaFormat r7 = r7.getOutputFormat()     // Catch:{ Exception -> 0x0297 }
            java.lang.String r8 = r1.f47051a     // Catch:{ Exception -> 0x0297 }
            java.lang.String r10 = "decode output format changed: "
            java.lang.String r11 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x0297 }
            java.lang.String r10 = r10.concat(r11)     // Catch:{ Exception -> 0x0297 }
            com.tencent.liteav.base.util.LiteavLog.m16901i(r8, r10)     // Catch:{ Exception -> 0x0297 }
            java.lang.String r8 = "crop-right"
            int r8 = r7.getInteger(r8)     // Catch:{ Exception -> 0x0297 }
            java.lang.String r10 = "crop-left"
            int r10 = r7.getInteger(r10)     // Catch:{ Exception -> 0x0297 }
            int r8 = r8 - r10
            int r8 = java.lang.Math.abs(r8)     // Catch:{ Exception -> 0x0297 }
            int r8 = r8 + r5
            java.lang.String r10 = "crop-bottom"
            int r10 = r7.getInteger(r10)     // Catch:{ Exception -> 0x0297 }
            java.lang.String r11 = "crop-top"
            int r11 = r7.getInteger(r11)     // Catch:{ Exception -> 0x0297 }
            int r10 = r10 - r11
            int r10 = java.lang.Math.abs(r10)     // Catch:{ Exception -> 0x0297 }
            int r10 = r10 + r5
            java.lang.String r11 = "width"
            int r11 = r7.getInteger(r11)     // Catch:{ Exception -> 0x0297 }
            java.lang.String r12 = "height"
            int r7 = r7.getInteger(r12)     // Catch:{ Exception -> 0x0297 }
            java.lang.String r12 = r1.f47051a     // Catch:{ Exception -> 0x0297 }
            java.lang.String r13 = "cropWidth: %d, cropHeight: %d, frameWidth: %d, frameHeight: %d"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0297 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0297 }
            r9[r2] = r8     // Catch:{ Exception -> 0x0297 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0297 }
            r9[r5] = r8     // Catch:{ Exception -> 0x0297 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0297 }
            r10 = 2
            r9[r10] = r8     // Catch:{ Exception -> 0x0297 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0297 }
            r9[r4] = r7     // Catch:{ Exception -> 0x0297 }
            com.tencent.liteav.base.util.LiteavLog.m16902i(r12, r13, r9)     // Catch:{ Exception -> 0x0297 }
        L_0x00a4:
            int r6 = r6 + 1
            goto L_0x0019
        L_0x00a8:
            if (r7 < 0) goto L_0x00d7
            r1.f47061k = r2     // Catch:{ Exception -> 0x0297 }
            android.media.MediaCodec r6 = r1.f47057g     // Catch:{ Exception -> 0x0297 }
            r6.releaseOutputBuffer(r7, r5)     // Catch:{ Exception -> 0x0297 }
            android.media.MediaCodec$BufferInfo r6 = r1.f47059i     // Catch:{ Exception -> 0x0297 }
            int r6 = r6.flags     // Catch:{ Exception -> 0x0297 }
            r6 = r6 & r9
            if (r6 == 0) goto L_0x00c8
            java.lang.String r6 = r1.f47051a     // Catch:{ Exception -> 0x0297 }
            java.lang.String r7 = "meet end of stream."
            com.tencent.liteav.base.util.LiteavLog.m16901i(r6, r7)     // Catch:{ Exception -> 0x0297 }
            com.tencent.liteav.videoconsumer.decoder.av r6 = r1.f47058h     // Catch:{ Exception -> 0x0297 }
            if (r6 == 0) goto L_0x00c6
            r6.mo20339e()     // Catch:{ Exception -> 0x0297 }
        L_0x00c6:
            r1.f47061k = r5     // Catch:{ Exception -> 0x0297 }
        L_0x00c8:
            com.tencent.liteav.videoconsumer.decoder.av r6 = r1.f47058h     // Catch:{ Exception -> 0x0297 }
            if (r6 == 0) goto L_0x00e6
            android.media.MediaCodec$BufferInfo r7 = r1.f47059i     // Catch:{ Exception -> 0x0297 }
            long r7 = r7.presentationTimeUs     // Catch:{ Exception -> 0x0297 }
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            r6.mo20334a(r7)     // Catch:{ Exception -> 0x0297 }
            goto L_0x00e6
        L_0x00d7:
            java.lang.String r6 = r1.f47051a     // Catch:{ Exception -> 0x0297 }
            java.lang.String r8 = "dequeueOutputBuffer get invalid index: %d"
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0297 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0297 }
            r9[r2] = r7     // Catch:{ Exception -> 0x0297 }
            com.tencent.liteav.base.util.LiteavLog.m16897d(r6, r8, r9)     // Catch:{ Exception -> 0x0297 }
        L_0x00e6:
            if (r3 == 0) goto L_0x0293
            boolean r6 = r3.isEosFrame     // Catch:{ Exception -> 0x0297 }
            if (r6 != 0) goto L_0x00ff
            java.nio.ByteBuffer r6 = r3.data     // Catch:{ Exception -> 0x0297 }
            if (r6 == 0) goto L_0x00f6
            int r6 = r6.remaining()     // Catch:{ Exception -> 0x0297 }
            if (r6 != 0) goto L_0x00ff
        L_0x00f6:
            java.lang.String r0 = r1.f47051a     // Catch:{ Exception -> 0x0297 }
            java.lang.String r4 = "receive empty buffer."
            com.tencent.liteav.base.util.LiteavLog.m16905w(r0, r4)     // Catch:{ Exception -> 0x0297 }
            goto L_0x027f
        L_0x00ff:
            android.media.MediaCodec r6 = r1.f47057g     // Catch:{ Exception -> 0x0297 }
            java.nio.ByteBuffer[] r6 = r6.getInputBuffers()     // Catch:{ Exception -> 0x0297 }
            if (r6 == 0) goto L_0x010d
            int r8 = r6.length     // Catch:{ Exception -> 0x0297 }
            if (r8 != 0) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            r8 = 0
            goto L_0x010e
        L_0x010d:
            r8 = 1
        L_0x010e:
            if (r8 == 0) goto L_0x0118
            java.lang.String r0 = r1.f47051a     // Catch:{ Exception -> 0x0297 }
            java.lang.String r4 = "get invalid input buffers."
            com.tencent.liteav.base.util.LiteavLog.m16898e(r0, r4)     // Catch:{ Exception -> 0x0297 }
            goto L_0x0122
        L_0x0118:
            android.media.MediaCodec r8 = r1.f47057g     // Catch:{ Exception -> 0x0297 }
            r9 = 10000(0x2710, double:4.9407E-320)
            int r12 = r8.dequeueInputBuffer(r9)     // Catch:{ Exception -> 0x0297 }
            if (r12 >= 0) goto L_0x0125
        L_0x0122:
            r5 = 0
            goto L_0x0280
        L_0x0125:
            boolean r8 = r3.isEosFrame     // Catch:{ Exception -> 0x0297 }
            if (r8 != 0) goto L_0x026d
            boolean r8 = r3.isIDRFrame()     // Catch:{ Exception -> 0x0297 }
            if (r8 == 0) goto L_0x0248
            com.tencent.liteav.videobase.common.CodecType r8 = r3.codecType     // Catch:{ Exception -> 0x0297 }
            com.tencent.liteav.videobase.common.CodecType r9 = com.tencent.liteav.videobase.common.CodecType.H264     // Catch:{ Exception -> 0x0297 }
            if (r8 != r9) goto L_0x0248
            boolean r8 = r1.f47068r     // Catch:{ Exception -> 0x0297 }
            if (r8 == 0) goto L_0x0248
            com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef$ConsumerScene r8 = r1.f47067q     // Catch:{ Exception -> 0x0297 }
            com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef$ConsumerScene r9 = com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef.ConsumerScene.RTC     // Catch:{ Exception -> 0x0297 }
            if (r8 == r9) goto L_0x0141
            goto L_0x0248
        L_0x0141:
            java.nio.ByteBuffer r8 = r3.data     // Catch:{ Exception -> 0x0297 }
            int r8 = r8.remaining()     // Catch:{ Exception -> 0x0297 }
            byte[] r9 = new byte[r8]     // Catch:{ Exception -> 0x0297 }
            java.nio.ByteBuffer r10 = r3.data     // Catch:{ Exception -> 0x0297 }
            r10.get(r9)     // Catch:{ Exception -> 0x0297 }
            java.nio.ByteBuffer r10 = r3.data     // Catch:{ Exception -> 0x0297 }
            r10.rewind()     // Catch:{ Exception -> 0x0297 }
            int[] r10 = new int[r5]     // Catch:{ Exception -> 0x0297 }
            r10[r2] = r0     // Catch:{ Exception -> 0x0297 }
            r0 = 0
        L_0x0158:
            int r11 = r0 + 4
            if (r11 >= r8) goto L_0x016f
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.wrap(r9)     // Catch:{ Exception -> 0x0297 }
            int r0 = com.tencent.liteav.videobase.common.EncodedVideoFrame.getNextNALHeaderPos(r0, r11)     // Catch:{ Exception -> 0x0297 }
            if (r0 < 0) goto L_0x016f
            byte r11 = r9[r0]     // Catch:{ Exception -> 0x0297 }
            r11 = r11 & 31
            r13 = 7
            if (r11 != r13) goto L_0x0158
            r10[r2] = r0     // Catch:{ Exception -> 0x0297 }
        L_0x016f:
            r0 = r10[r2]     // Catch:{ Exception -> 0x0297 }
            if (r0 >= 0) goto L_0x0175
            r11 = 0
            goto L_0x01ad
        L_0x0175:
            int r11 = r8 - r0
        L_0x0177:
            int r13 = r0 + 3
            if (r13 >= r8) goto L_0x01a5
            byte r14 = r9[r0]     // Catch:{ Exception -> 0x0297 }
            if (r14 != 0) goto L_0x018b
            int r15 = r0 + 1
            byte r15 = r9[r15]     // Catch:{ Exception -> 0x0297 }
            if (r15 != 0) goto L_0x018b
            int r15 = r0 + 2
            byte r15 = r9[r15]     // Catch:{ Exception -> 0x0297 }
            if (r15 == r5) goto L_0x019d
        L_0x018b:
            if (r14 != 0) goto L_0x01a2
            int r14 = r0 + 1
            byte r14 = r9[r14]     // Catch:{ Exception -> 0x0297 }
            if (r14 != 0) goto L_0x01a2
            int r14 = r0 + 2
            byte r14 = r9[r14]     // Catch:{ Exception -> 0x0297 }
            if (r14 != 0) goto L_0x01a2
            byte r13 = r9[r13]     // Catch:{ Exception -> 0x0297 }
            if (r13 != r5) goto L_0x01a2
        L_0x019d:
            r11 = r10[r2]     // Catch:{ Exception -> 0x0297 }
            int r11 = r0 - r11
            goto L_0x01a5
        L_0x01a2:
            int r0 = r0 + 1
            goto L_0x0177
        L_0x01a5:
            byte[] r0 = new byte[r11]     // Catch:{ Exception -> 0x0297 }
            r13 = r10[r2]     // Catch:{ Exception -> 0x0297 }
            java.lang.System.arraycopy(r9, r13, r0, r2, r11)     // Catch:{ Exception -> 0x0297 }
            r11 = r0
        L_0x01ad:
            if (r11 == 0) goto L_0x0248
            r0 = r10[r2]     // Catch:{ Exception -> 0x0297 }
            if (r0 >= 0) goto L_0x01b5
            goto L_0x0248
        L_0x01b5:
            com.tencent.liteav.videoconsumer.decoder.p r0 = r1.f47069s     // Catch:{ Exception -> 0x0213 }
            int r13 = r11.length     // Catch:{ Exception -> 0x0213 }
            byte[] r13 = new byte[r13]     // Catch:{ Exception -> 0x0213 }
            r14 = 0
            r15 = 0
        L_0x01bc:
            int r5 = r11.length     // Catch:{ Exception -> 0x0213 }
            if (r14 >= r5) goto L_0x01f0
            int r5 = r11.length     // Catch:{ Exception -> 0x0213 }
            int r5 = r5 - r4
            if (r14 >= r5) goto L_0x01e5
            byte r5 = r11[r14]     // Catch:{ Exception -> 0x0213 }
            if (r5 != 0) goto L_0x01e5
            int r16 = r14 + 1
            byte r17 = r11[r16]     // Catch:{ Exception -> 0x0213 }
            if (r17 != 0) goto L_0x01e5
            int r17 = r14 + 2
            byte r7 = r11[r17]     // Catch:{ Exception -> 0x0213 }
            if (r7 != r4) goto L_0x01e5
            int r7 = r14 + 3
            byte r2 = r11[r7]     // Catch:{ Exception -> 0x0213 }
            if (r2 > r4) goto L_0x01e5
            int r2 = r15 + 1
            r13[r15] = r5     // Catch:{ Exception -> 0x0213 }
            int r15 = r2 + 1
            byte r5 = r11[r16]     // Catch:{ Exception -> 0x0213 }
            r13[r2] = r5     // Catch:{ Exception -> 0x0213 }
            r14 = r7
            goto L_0x01ee
        L_0x01e5:
            int r2 = r15 + 1
            byte r5 = r11[r14]     // Catch:{ Exception -> 0x0213 }
            r13[r15] = r5     // Catch:{ Exception -> 0x0213 }
            int r14 = r14 + 1
            r15 = r2
        L_0x01ee:
            r2 = 0
            goto L_0x01bc
        L_0x01f0:
            int r2 = r11.length     // Catch:{ Exception -> 0x0213 }
            if (r15 == r2) goto L_0x01fa
            byte[] r2 = new byte[r15]     // Catch:{ Exception -> 0x0213 }
            r4 = 0
            java.lang.System.arraycopy(r13, r4, r2, r4, r15)     // Catch:{ Exception -> 0x0213 }
            goto L_0x01fb
        L_0x01fa:
            r2 = 0
        L_0x01fb:
            if (r2 == 0) goto L_0x01ff
            r4 = 1
            goto L_0x0201
        L_0x01ff:
            r2 = r11
            r4 = 0
        L_0x0201:
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0213 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x0213 }
            byte[] r0 = r0.mo20435a((java.io.InputStream) r5)     // Catch:{ Exception -> 0x0213 }
            if (r0 == 0) goto L_0x021c
            if (r4 == 0) goto L_0x021c
            byte[] r0 = com.tencent.liteav.videoconsumer.decoder.C17358p.m17309a((byte[]) r0)     // Catch:{ Exception -> 0x0213 }
            goto L_0x021c
        L_0x0213:
            r0 = move-exception
            java.lang.String r2 = r1.f47051a     // Catch:{ Exception -> 0x0297 }
            java.lang.String r4 = "modify dec buffer error "
            com.tencent.liteav.base.util.LiteavLog.m16899e((java.lang.String) r2, (java.lang.String) r4, (java.lang.Throwable) r0)     // Catch:{ Exception -> 0x0297 }
            r0 = 0
        L_0x021c:
            if (r0 == 0) goto L_0x0248
            int r2 = r11.length     // Catch:{ Exception -> 0x0297 }
            int r2 = r8 - r2
            int r4 = r0.length     // Catch:{ Exception -> 0x0297 }
            int r2 = r2 + r4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)     // Catch:{ Exception -> 0x0297 }
            r3.data = r2     // Catch:{ Exception -> 0x0297 }
            r4 = 0
            r5 = r10[r4]     // Catch:{ Exception -> 0x0297 }
            if (r5 <= 0) goto L_0x0231
            r2.put(r9, r4, r5)     // Catch:{ Exception -> 0x0297 }
        L_0x0231:
            java.nio.ByteBuffer r2 = r3.data     // Catch:{ Exception -> 0x0297 }
            r2.put(r0)     // Catch:{ Exception -> 0x0297 }
            java.nio.ByteBuffer r0 = r3.data     // Catch:{ Exception -> 0x0297 }
            r2 = 0
            r4 = r10[r2]     // Catch:{ Exception -> 0x0297 }
            int r2 = r11.length     // Catch:{ Exception -> 0x0297 }
            int r2 = r2 + r4
            int r8 = r8 - r4
            int r4 = r11.length     // Catch:{ Exception -> 0x0297 }
            int r8 = r8 - r4
            r0.put(r9, r2, r8)     // Catch:{ Exception -> 0x0297 }
            java.nio.ByteBuffer r0 = r3.data     // Catch:{ Exception -> 0x0297 }
            r0.rewind()     // Catch:{ Exception -> 0x0297 }
        L_0x0248:
            java.nio.ByteBuffer r0 = r3.data     // Catch:{ Exception -> 0x0297 }
            int r14 = r0.remaining()     // Catch:{ Exception -> 0x0297 }
            r0 = r6[r12]     // Catch:{ Exception -> 0x0297 }
            java.nio.ByteBuffer r2 = r3.data     // Catch:{ Exception -> 0x0297 }
            r0.put(r2)     // Catch:{ Exception -> 0x0297 }
            android.media.MediaCodec r11 = r1.f47057g     // Catch:{ Exception -> 0x0297 }
            r13 = 0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0297 }
            long r4 = r3.pts     // Catch:{ Exception -> 0x0297 }
            long r15 = r0.toMicros(r4)     // Catch:{ Exception -> 0x0297 }
            r17 = 0
            r11.queueInputBuffer(r12, r13, r14, r15, r17)     // Catch:{ Exception -> 0x0297 }
            com.tencent.liteav.videoconsumer.decoder.av r0 = r1.f47058h     // Catch:{ Exception -> 0x0297 }
            if (r0 == 0) goto L_0x027f
            r0.mo20338d()     // Catch:{ Exception -> 0x0297 }
            goto L_0x027f
        L_0x026d:
            java.lang.String r0 = r1.f47051a     // Catch:{ Exception -> 0x0297 }
            java.lang.String r2 = "feedDataToMediaCodec BUFFER_FLAG_END_OF_STREAM"
            com.tencent.liteav.base.util.LiteavLog.m16901i(r0, r2)     // Catch:{ Exception -> 0x0297 }
            android.media.MediaCodec r11 = r1.f47057g     // Catch:{ Exception -> 0x0297 }
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 4
            r11.queueInputBuffer(r12, r13, r14, r15, r17)     // Catch:{ Exception -> 0x0297 }
        L_0x027f:
            r5 = 1
        L_0x0280:
            if (r5 != 0) goto L_0x0283
            goto L_0x0293
        L_0x0283:
            monitor-enter(r18)     // Catch:{ Exception -> 0x0297 }
            com.tencent.liteav.videobase.common.EncodedVideoFrame r0 = r1.f47060j     // Catch:{ all -> 0x0290 }
            if (r0 != r3) goto L_0x028b
            r2 = 0
            r1.f47060j = r2     // Catch:{ all -> 0x0290 }
        L_0x028b:
            monitor-exit(r18)     // Catch:{ all -> 0x0290 }
            m17314a((com.tencent.liteav.videobase.common.EncodedVideoFrame) r3)     // Catch:{ Exception -> 0x0297 }
            return
        L_0x0290:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x0290 }
            throw r0     // Catch:{ Exception -> 0x0297 }
        L_0x0293:
            return
        L_0x0294:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x0294 }
            throw r0     // Catch:{ Exception -> 0x0297 }
        L_0x0297:
            r0 = move-exception
            java.lang.String r2 = r1.f47051a
            java.lang.String r3 = "decode failed."
            com.tencent.liteav.base.util.LiteavLog.m16899e((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r0)
            com.tencent.liteav.videobase.videobase.h$c r2 = com.tencent.liteav.videobase.videobase.C17263h.C17270c.WARNING_VIDEO_DECODE_RESTART_WHEN_DECODE_ERROR
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "VideoDecode: decode error, restart decoder message:"
            r3.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1.m17315a((com.tencent.liteav.videobase.videobase.C17263h.C17270c) r2, (java.lang.String) r0, (java.lang.Object[]) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoconsumer.decoder.C17359q.m17312a():void");
    }

    /* renamed from: a */
    private static void m17314a(EncodedVideoFrame encodedVideoFrame) {
        if (encodedVideoFrame != null) {
            encodedVideoFrame.release();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17318a(C17359q qVar, ServerVideoConsumerConfig serverVideoConsumerConfig) {
        if (serverVideoConsumerConfig != null) {
            qVar.f47068r = serverVideoConsumerConfig.enableVui;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17317a(C17359q qVar, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = qVar.f47065o;
        if (surfaceTexture2 == null || surfaceTexture != surfaceTexture2) {
            String str = qVar.f47051a;
            LiteavLog.m16901i(str, "mSurfaceTexture= " + qVar.f47065o + " ,surfaceTexture= " + surfaceTexture);
            return;
        }
        qVar.m17325b();
        C17237l.C17239b bVar = null;
        try {
            bVar = (C17237l.C17239b) qVar.f47064n.mo20203a();
        } catch (InterruptedException unused) {
            LiteavLog.m16905w(qVar.f47051a, "textureholderpool obtain interrupted.");
        }
        int i = qVar.f47063m;
        C104507p pVar = qVar.f47052b;
        bVar.mo20215a(36197, i, pVar.f309736a, pVar.f309737b);
        PixelFrame a = bVar.mo20196a(qVar.f47062l.mo147198c());
        if (a.getMatrix() == null) {
            a.setMatrix(new float[16]);
        }
        try {
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(a.getMatrix());
        } catch (Exception e) {
            LiteavLog.m16905w(qVar.f47051a, "updateTexImage exception: ".concat(String.valueOf(e)));
        }
        qVar.f47061k = true;
        long millis = TimeUnit.NANOSECONDS.toMillis(surfaceTexture.getTimestamp());
        if (millis == 0) {
            millis = TimeUnit.MICROSECONDS.toMillis(qVar.f47059i.presentationTimeUs);
        }
        if (LiteavSystemInfo.getSystemOSVersionInt() <= 22) {
            a = qVar.m17311a(a);
        }
        a.setTimestamp(millis);
        qVar.f47058h.mo20335a(a, millis);
        bVar.release();
        a.release();
        if (qVar.f47070t) {
            C17336av avVar = qVar.f47058h;
            if (avVar != null) {
                avVar.mo20337c();
            }
            qVar.f47070t = false;
        }
    }

    /* renamed from: a */
    private PixelFrame m17311a(PixelFrame pixelFrame) {
        int width = pixelFrame.getWidth();
        int height = pixelFrame.getHeight();
        C17234j jVar = this.f47072v;
        if (jVar != null) {
            C104507p pVar = new C104507p(jVar.f46590a, jVar.f46591b);
            if (!(pVar.f309736a == width && pVar.f309737b == height)) {
                this.f47072v.mo20209a();
                this.f47072v = null;
            }
        }
        if (this.f47072v == null) {
            this.f47072v = new C17234j(width, height);
        }
        if (this.f47073w == null) {
            this.f47073w = new C17223e();
        }
        OpenGlUtils.glViewport(0, 0, width, height);
        C17222d a = this.f47073w.mo20199a(width, height);
        this.f47072v.mo20210a(pixelFrame, GLConstants.GLScaleType.CENTER_CROP, a);
        PixelFrame a2 = a.mo20196a(this.f47062l.mo147198c());
        GLES20.glFinish();
        a.release();
        pixelFrame.release();
        return a2;
    }

    /* renamed from: a */
    private void m17315a(C17263h.C17270c cVar, String str, Object... objArr) {
        this.f47053c.notifyWarning(cVar, str, objArr);
        C17336av avVar = this.f47058h;
        if (avVar != null) {
            avVar.mo20333a();
        }
    }

    /* renamed from: a */
    private void m17321a(Runnable runnable) {
        C17111b bVar = this.f47056f;
        if (bVar == null) {
            return;
        }
        if (bVar.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            bVar.post(runnable);
        }
    }

    /* renamed from: a */
    private boolean m17322a(C17360a aVar, boolean z) {
        String str;
        MediaFormat mediaFormat = this.f47071u;
        if (mediaFormat == null) {
            String str2 = this.f47055e;
            C104507p pVar = this.f47052b;
            mediaFormat = MediaFormat.createVideoFormat(str2, pVar.f309736a, pVar.f309737b);
        }
        if (z && this.f47067q == VideoDecoderDef.ConsumerScene.RTC) {
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 26 && LiteavSystemInfo.getHardware().toLowerCase().contains("qcom")) {
                mediaFormat.setInteger("vendor.qti-ext-dec-low-latency.enable", 1);
                mediaFormat.setInteger("vendor.qti-ext-dec-picture-order.enable", 1);
            } else if (LiteavSystemInfo.getSystemOSVersionInt() >= 29 && LiteavSystemInfo.getHardware().toLowerCase().contains("kirin")) {
                mediaFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", 1);
                mediaFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", -1);
            } else if (LiteavSystemInfo.getSystemOSVersionInt() >= 26 && LiteavSystemInfo.getHardware().toLowerCase().contains("exynos")) {
                mediaFormat.setInteger("vendor.rtc-ext-dec-low-latency.enable", 1);
            }
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 30) {
                mediaFormat.setInteger("low-latency", 1);
            }
        }
        JSONArray jSONArray = this.f47054d;
        if (jSONArray != null) {
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    mediaFormat.setInteger(jSONObject.optString("key"), jSONObject.optInt("value"));
                    i++;
                } catch (JSONException e) {
                    LiteavLog.m16899e("HardwareVideoDecoder", "set MediaCodec device related params failed.", (Throwable) e);
                }
            }
        }
        LiteavLog.m16901i(this.f47051a, "mediaFormat:".concat(String.valueOf(mediaFormat)));
        try {
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
            aVar.f47074a = createDecoderByType;
            createDecoderByType.configure(mediaFormat, this.f47066p, (MediaCrypto) null, 0);
            aVar.f47074a.setVideoScalingMode(1);
            aVar.f47074a.start();
            LiteavLog.m16901i(this.f47051a, "Start MediaCodec success.");
            return true;
        } catch (Exception e2) {
            LiteavLog.m16899e(this.f47051a, "Start MediaCodec failed.", (Throwable) e2);
            m17313a(aVar.f47074a);
            aVar.f47074a = null;
            C17263h.C17270c cVar = C17263h.C17270c.WARNING_VIDEO_DECODE_START_FAILED;
            if (e2 instanceof IllegalArgumentException) {
                cVar = C17263h.C17270c.WARNING_VIDEO_DECODE_START_FAILED_ILLEGAL_ARGUMENT;
                str = "VideoDecode: illegal argument, Start decoder failed";
            } else if (e2 instanceof IllegalStateException) {
                cVar = C17263h.C17270c.WARNING_VIDEO_DECODE_START_FAILED_ILLEGAL_STATE;
                str = "VideoDecode: illegal state, Start decoder failed";
            } else {
                str = "VideoDecode: Start decoder failed";
            }
            aVar.f47075b = cVar;
            aVar.f47076c = str;
            aVar.f47077d = e2;
            return false;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17320a(C17359q qVar, Object obj, C17336av avVar) {
        LiteavLog.m16901i(qVar.f47051a, "Start internal");
        if (qVar.f47062l != null) {
            LiteavLog.m16905w(qVar.f47051a, "Decoder already started.");
            return;
        }
        qVar.f47058h = avVar;
        if (qVar.m17323a(obj)) {
            C17360a aVar = new C17360a((byte) 0);
            if (qVar.m17322a(aVar, true) || qVar.m17322a(aVar, false)) {
                qVar.f47057g = aVar.f47074a;
                qVar.f47053c.notifyEvent(C17263h.C17269b.EVT_VIDEO_DECODE_START_SUCCESS, "Start decoder success", new Object[0]);
                return;
            }
            C17263h.C17270c cVar = aVar.f47075b;
            qVar.m17315a(cVar, "decoder config fail, message:" + aVar.f47076c + " exception:" + aVar.f47077d.getMessage(), new Object[0]);
        }
    }
}
