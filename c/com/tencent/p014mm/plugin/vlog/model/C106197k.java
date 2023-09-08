package com.tencent.p014mm.plugin.vlog.model;

import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.p014mm.plugin.sight.base.C106139e;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.plugin.vlog.model.TAVKitMuxer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.core.ExportConfig;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.AssetWriterVideoEncoder;
import com.tencent.tav.decoder.RenderContext;
import com.tencent.tav.decoder.muxer.IMediaMuxer;
import com.tencent.xweb.IXWebBroadcastListener;
import eu3.C58834h;
import eu3.C97749e;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.Semaphore;
import rx3.C13598b0;
import u80.C111145g;
import w80.C111742d;

/* renamed from: com.tencent.mm.plugin.vlog.model.k */
public final class C106197k implements AssetWriterVideoEncoder {

    /* renamed from: A */
    public ByteBuffer f316446A = ByteBuffer.allocate(1);

    /* renamed from: B */
    public LinkedList<C85507a> f316447B = new LinkedList<>();

    /* renamed from: C */
    public long f316448C;

    /* renamed from: D */
    public long f316449D = -1;

    /* renamed from: a */
    public RenderContext f316450a;

    /* renamed from: b */
    public IMediaMuxer f316451b;

    /* renamed from: c */
    public int f316452c;

    /* renamed from: d */
    public int f316453d;

    /* renamed from: e */
    public CGSize f316454e;

    /* renamed from: f */
    public MediaFormat f316455f;

    /* renamed from: g */
    public volatile long f316456g;

    /* renamed from: h */
    public volatile boolean f316457h;

    /* renamed from: i */
    public ImageReader f316458i;

    /* renamed from: j */
    public ImageReader f316459j;

    /* renamed from: k */
    public Handler f316460k;

    /* renamed from: l */
    public HandlerThread f316461l = C97749e.m126093a("finder_soft_encode_rgb2yuv_thread", -4);

    /* renamed from: m */
    public volatile boolean f316462m;

    /* renamed from: n */
    public C111145g f316463n;

    /* renamed from: o */
    public C111742d.C65942b f316464o;

    /* renamed from: p */
    public ConditionVariable f316465p = new ConditionVariable();

    /* renamed from: q */
    public int f316466q;

    /* renamed from: r */
    public int f316467r;

    /* renamed from: s */
    public ByteBuffer f316468s;

    /* renamed from: t */
    public C106139e f316469t;

    /* renamed from: u */
    public volatile boolean f316470u;

    /* renamed from: v */
    public final Object f316471v = new Object();

    /* renamed from: w */
    public final Semaphore f316472w = new Semaphore(1);

    /* renamed from: x */
    public volatile int f316473x;

    /* renamed from: y */
    public volatile int f316474y;

    /* renamed from: z */
    public volatile int f316475z;

    /* renamed from: com.tencent.mm.plugin.vlog.model.k$a */
    public static final class C85507a {

        /* renamed from: a */
        public final ByteBuffer f249171a;

        /* renamed from: b */
        public final long f249172b;

        public C85507a(ByteBuffer byteBuffer, long j) {
            C87412m.m108594g(byteBuffer, "buffer");
            this.f249171a = byteBuffer;
            this.f249172b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C85507a)) {
                return false;
            }
            C85507a aVar = (C85507a) obj;
            return C87412m.m108589b(this.f249171a, aVar.f249171a) && this.f249172b == aVar.f249172b;
        }

        public int hashCode() {
            long j = this.f249172b;
            return (this.f249171a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "PendingYuvBuffer(buffer=" + this.f249171a + ", timestamp=" + this.f249172b + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.model.k$b */
    public static final class C106198b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C106197k f316476d;

        /* renamed from: e */
        public final /* synthetic */ C111742d.C65942b f316477e;

        public C106198b(C106197k kVar, C111742d.C65942b bVar) {
            this.f316476d = kVar;
            this.f316477e = bVar;
        }

        public final void run() {
            C111145g gVar = this.f316476d.f316463n;
            if (gVar != null) {
                gVar.mo158471l();
            }
            C111742d.f334647a.mo163471q(this.f316477e);
        }
    }

    public C106197k() {
        int i = C58834h.f168432b;
    }

    /* renamed from: a */
    public final void mo152129a() {
        if (this.f316469t == null) {
            IMediaMuxer iMediaMuxer = this.f316451b;
            if (iMediaMuxer instanceof TAVKitMuxer.SightVideoJNIMediaMuxer) {
                C87412m.m108592e(iMediaMuxer, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.TAVKitMuxer.SightVideoJNIMediaMuxer");
                if (((TAVKitMuxer.SightVideoJNIMediaMuxer) iMediaMuxer).getSightEncode() != null) {
                    IMediaMuxer iMediaMuxer2 = this.f316451b;
                    C87412m.m108592e(iMediaMuxer2, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.TAVKitMuxer.SightVideoJNIMediaMuxer");
                    this.f316469t = ((TAVKitMuxer.SightVideoJNIMediaMuxer) iMediaMuxer2).getSightEncode();
                    StringBuilder sb = new StringBuilder();
                    sb.append("set bufId:");
                    C106139e eVar = this.f316469t;
                    sb.append(eVar != null ? Integer.valueOf(eVar.f316167a) : null);
                    Log.m105924i("MicroMsg.CompositionSoftwareEncoder", sb.toString());
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo152130b(ByteBuffer byteBuffer, long j) {
        byteBuffer.position(0);
        C106139e eVar = this.f316469t;
        if (eVar != null) {
            SightVideoJNI.writeYuvDataForMMSightEncode(eVar.f316167a, byteBuffer, this.f316452c, this.f316453d);
        }
        IMediaMuxer iMediaMuxer = this.f316451b;
        if (iMediaMuxer != null) {
            int videoTrackIndex = iMediaMuxer.videoTrackIndex();
            ByteBuffer byteBuffer2 = this.f316446A;
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            bufferInfo.presentationTimeUs = this.f316456g;
            C13598b0 b0Var = C13598b0.f38549a;
            iMediaMuxer.writeSampleData(videoTrackIndex, byteBuffer2, bufferInfo);
        }
        Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "writeSampleData timestamp:" + j + ", diff:" + (j - this.f316448C));
        this.f316448C = j;
        this.f316475z = this.f316475z + 1;
    }

    /* renamed from: c */
    public final void mo152131c() {
        Handler handler;
        synchronized (this.f316471v) {
            Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "finishEncode, imageReader:" + this.f316458i + ", isInputEndOfStream:" + this.f316457h);
            this.f316470u = true;
            ImageReader imageReader = this.f316458i;
            if (imageReader != null) {
                imageReader.close();
            }
            ImageReader imageReader2 = this.f316459j;
            if (imageReader2 != null) {
                imageReader2.close();
            }
            C111742d.C65942b bVar = this.f316464o;
            if (!(bVar == null || (handler = this.f316460k) == null)) {
                handler.post(new C106198b(this, bVar));
            }
            C106139e eVar = this.f316469t;
            if (eVar != null) {
                SightVideoJNI.finishVideoEncode(eVar.f316167a);
            }
            this.f316469t = null;
            this.f316461l.quitSafely();
            this.f316460k = null;
            this.f316459j = null;
            this.f316464o = null;
            this.f316458i = null;
            Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "finishEncode, encodeYuvCount:" + this.f316475z + ", writeYuvCount:" + this.f316474y + ", renderYuvCount:" + this.f316473x);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public Surface createInputSurface() {
        Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "createInputSurface");
        ImageReader imageReader = this.f316458i;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    /* renamed from: d */
    public final void mo152133d() {
        this.f316457h = true;
        this.f316456g = -1;
        Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "onInputEndOfStream, renderYuvCount:" + this.f316473x + ", writeYuvCount:" + this.f316474y + ", writeRGBCount:" + 0 + ", rgbAvailableCount:" + 0);
    }

    /* renamed from: e */
    public final boolean mo152134e(int i, int i2, Image.Plane plane, long j) {
        synchronized (this.f316471v) {
            mo152129a();
            int rowStride = plane.getRowStride();
            int pixelStride = plane.getPixelStride();
            long j2 = j / ((long) 1000);
            if (this.f316468s == null) {
                this.f316468s = ByteBuffer.allocateDirect(this.f316466q * this.f316467r * pixelStride);
            }
            ByteBuffer byteBuffer = this.f316468s;
            if (byteBuffer != null) {
                byteBuffer.position(0);
            }
            ByteBuffer buffer = plane.getBuffer();
            buffer.position(0);
            ByteBuffer byteBuffer2 = this.f316468s;
            int i3 = this.f316466q;
            SightVideoJNI.nativeBufferCopy(buffer, byteBuffer2, i3 * pixelStride, this.f316467r, rowStride - (i3 * pixelStride));
            if (this.f316469t != null) {
                long currentTicks = Util.currentTicks();
                Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "processImageYUVBufferToWriteYUVData, width:" + i + ", height:" + i2 + ", videoWidth:" + this.f316452c + ", videoHeight:" + this.f316453d);
                if (!this.f316447B.isEmpty()) {
                    do {
                        C85507a removeFirst = this.f316447B.removeFirst();
                        mo152130b(removeFirst.f249171a, removeFirst.f249172b);
                    } while (!this.f316447B.isEmpty());
                }
                ByteBuffer byteBuffer3 = this.f316468s;
                if (byteBuffer3 != null) {
                    mo152130b(byteBuffer3, j2);
                }
                Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "end processImageYUVBufferToWriteYUVData, cost:" + Util.ticksToNow(currentTicks));
                return true;
            }
            Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "bufId not ready, save to pending list, yuvWidth:" + this.f316466q + ", yuvHeight:" + this.f316467r + ", pixelStride:" + pixelStride);
            ByteBuffer byteBuffer4 = this.f316468s;
            if (byteBuffer4 == null) {
                return false;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f316466q * this.f316467r * pixelStride);
            allocateDirect.put(byteBuffer4);
            this.f316447B.add(new C85507a(allocateDirect, j2));
            return false;
        }
    }

    public void flush() {
    }

    public MediaFormat getEncodeFormat() {
        MediaFormat mediaFormat = this.f316455f;
        C87412m.m108591d(mediaFormat);
        return mediaFormat;
    }

    public long getEncodePresentationTimeUs() {
        return this.f316456g;
    }

    public CGSize getEncodeSize() {
        CGSize cGSize = this.f316454e;
        if (cGSize != null) {
            return cGSize;
        }
        CGSize cGSize2 = CGSize.CGSizeZero;
        C87412m.m108593f(cGSize2, "CGSizeZero");
        return cGSize2;
    }

    public boolean isEncodeToEndOfStream() {
        return this.f316457h;
    }

    public boolean isNeedVideoOutputTexture() {
        return true;
    }

    public boolean prepare(ExportConfig exportConfig, MediaFormat mediaFormat) {
        Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "prepare, outputConfig:" + exportConfig + ", videoFormat:" + mediaFormat);
        if (exportConfig == null) {
            return false;
        }
        this.f316452c = exportConfig.getOutputWidth();
        this.f316453d = exportConfig.getOutputHeight();
        exportConfig.getVideoFrameRate();
        exportConfig.getVideoBitRate();
        this.f316454e = new CGSize((float) this.f316452c, (float) this.f316453d);
        this.f316455f = mediaFormat;
        this.f316458i = ImageReader.newInstance(this.f316452c, this.f316453d, 1, 1);
        return true;
    }

    public void processVideoTexture(TextureInfo textureInfo, CMTime cMTime) {
        C87412m.m108594g(cMTime, "sampleTime");
        if (this.f316462m) {
            this.f316472w.acquire();
            this.f316456g = cMTime.getTimeUs();
            Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "processVideoTexture sampleTime:" + this.f316456g + ", diff:" + (this.f316456g - this.f316449D));
            this.f316449D = this.f316456g;
            if (textureInfo != null) {
                Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "input sample buffer render texture:" + textureInfo + ", sampleTime:" + cMTime.getTimeUs());
                C111145g gVar = this.f316463n;
                if (gVar != null) {
                    gVar.f332852T = textureInfo.textureID;
                }
                if (gVar != null) {
                    gVar.mo143263u(textureInfo.width, textureInfo.height);
                }
                if (this.f316464o != null) {
                    long j = this.f316456g;
                    Handler handler = this.f316460k;
                    if (handler != null) {
                        handler.post(new C106201n(j, this));
                    }
                    if (!this.f316470u) {
                        long currentTicks = Util.currentTicks();
                        Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "wait output yuv data cost:" + Util.ticksToNow(currentTicks));
                        return;
                    }
                    return;
                }
                Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "processVideoTexture not init rgb2yuvEGLEnvironment, sampleTime:" + this.f316456g);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("muxer stared ");
            IMediaMuxer iMediaMuxer = this.f316451b;
            sb.append(iMediaMuxer != null ? Boolean.valueOf(iMediaMuxer.isMuxerStarted()) : null);
            sb.append("; texture:");
            sb.append(textureInfo);
            Log.m105928w("MicroMsg.CompositionSoftwareEncoder", sb.toString());
            return;
        }
        Log.m105920e("MicroMsg.CompositionSoftwareEncoder", "processVideoTexture imageReader not init now");
        throw new Exception("ImageReader not init");
    }

    public void release() {
        Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "release");
        mo152131c();
    }

    public void reset() {
    }

    public void setMediaMuxer(IMediaMuxer iMediaMuxer) {
        this.f316451b = iMediaMuxer;
        Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "setMediaMuxer: " + iMediaMuxer);
        if (iMediaMuxer instanceof TAVKitMuxer.SightVideoJNIMediaMuxer) {
            TAVKitMuxer.SightVideoJNIMediaMuxer sightVideoJNIMediaMuxer = (TAVKitMuxer.SightVideoJNIMediaMuxer) iMediaMuxer;
            sightVideoJNIMediaMuxer.configMuxerToSoftEncode(true);
            sightVideoJNIMediaMuxer.setSoftEncoder(this);
        }
    }

    public void setVideoSampleRenderContext(RenderContext renderContext) {
        this.f316450a = renderContext;
        if (renderContext != null && this.f316464o == null) {
            int i = this.f316452c;
            int i2 = this.f316453d;
            long currentTicks = Util.currentTicks();
            int i3 = i / 4;
            this.f316466q = i3;
            int i4 = (i2 * 3) / 2;
            this.f316467r = i4;
            ImageReader newInstance = ImageReader.newInstance(i3, i4, 1, 1);
            this.f316459j = newInstance;
            if (newInstance != null) {
                this.f316461l.start();
                Handler handler = new Handler(this.f316461l.getLooper());
                this.f316460k = handler;
                newInstance.setOnImageAvailableListener(new C106199l(this), handler);
                Handler handler2 = this.f316460k;
                if (handler2 != null) {
                    handler2.post(new C106200m(newInstance, this));
                }
            }
            this.f316465p.block(1000);
            Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "initRgb2YuvImageReader, yuv size:[" + this.f316466q + 'x' + this.f316467r + "], cost:" + Util.ticksToNow(currentTicks));
        }
    }

    public void signalEndOfInputStream() {
        Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "signalEndOfInputStream");
        mo152133d();
    }

    public boolean start() {
        Log.m105924i("MicroMsg.CompositionSoftwareEncoder", IXWebBroadcastListener.STAGE_START);
        Util.currentTicks();
        return true;
    }

    public void stop() {
        Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "stop");
        mo152131c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        if ((r1 != null && r1.isMuxerStarted()) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean writeVideoSample(com.tencent.tav.coremedia.CMSampleBuffer r6, boolean r7) {
        /*
            r5 = this;
            com.tencent.tav.decoder.muxer.IMediaMuxer r0 = r5.f316451b
            r1 = -1
            if (r0 == 0) goto L_0x000a
            int r0 = r0.videoTrackIndex()
            goto L_0x000b
        L_0x000a:
            r0 = -1
        L_0x000b:
            r2 = 1
            if (r0 != r1) goto L_0x000f
            return r2
        L_0x000f:
            r0 = 0
            if (r6 == 0) goto L_0x0022
            com.tencent.tav.decoder.muxer.IMediaMuxer r1 = r5.f316451b
            if (r1 == 0) goto L_0x001e
            boolean r1 = r1.isMuxerStarted()
            if (r1 != r2) goto L_0x001e
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            java.lang.String r0 = "MicroMsg.CompositionSoftwareEncoder"
            if (r6 == 0) goto L_0x0050
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "writeVideoSample sampleTimeUs:"
            r1.append(r3)
            com.tencent.tav.coremedia.CMTime r3 = r6.getTime()
            long r3 = r3.getTimeUs()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            w80.d$b r1 = r5.f316464o
            if (r1 == 0) goto L_0x0050
            boolean r1 = r5.f316457h
            if (r1 == 0) goto L_0x0050
            r3 = -1
            r5.f316456g = r3
        L_0x0050:
            if (r7 == 0) goto L_0x006a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "writeVideoSample endOfStream, sampleBuffer:"
            r7.append(r1)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            r5.mo152133d()
        L_0x006a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.model.C106197k.writeVideoSample(com.tencent.tav.coremedia.CMSampleBuffer, boolean):boolean");
    }
}
