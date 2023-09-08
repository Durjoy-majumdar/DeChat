package y13;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.p014mm.mediaplus.VideoSoftDecoderJni;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tav.codec.IMediaCodec;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.tav.core.ExportRuntimeException;
import com.tencent.tav.decoder.RenderContext;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import p206nj.C88957l;
import rw0.C101478s;
import rx3.C13598b0;
import w80.C111749g;
import y13.C112371b;
import yp3.C112478a;

/* renamed from: y13.e */
public final class C112375e implements IMediaCodec {

    /* renamed from: a */
    public final HandlerThread f336474a;

    /* renamed from: b */
    public final Handler f336475b;

    /* renamed from: c */
    public RenderContext f336476c;

    /* renamed from: d */
    public int f336477d;

    /* renamed from: e */
    public int f336478e;

    /* renamed from: f */
    public int f336479f;

    /* renamed from: g */
    public int f336480g;

    /* renamed from: h */
    public int f336481h;

    /* renamed from: i */
    public C112371b f336482i = new C112371b(3, 0, LocaleUtil.INDONESIAN_NEWNAME);

    /* renamed from: j */
    public C112371b f336483j = new C112371b(3, 0, "out");

    /* renamed from: k */
    public C112373c f336484k;

    /* renamed from: l */
    public long f336485l;

    /* renamed from: y13.e$a */
    public static final class C112376a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112375e f336486d;

        /* renamed from: e */
        public final /* synthetic */ Surface f336487e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112376a(C112375e eVar, Surface surface) {
            super(0);
            this.f336486d = eVar;
            this.f336487e = surface;
        }

        public Object invoke() {
            C112375e eVar = this.f336486d;
            eVar.f336476c = new RenderContext(eVar.f336477d, eVar.f336478e, this.f336487e);
            this.f336486d.f336484k = new C112373c();
            C112375e eVar2 = this.f336486d;
            C112373c cVar = eVar2.f336484k;
            if (cVar != null) {
                int i = eVar2.f336477d;
                int i2 = eVar2.f336478e;
                cVar.f336452a = i;
                cVar.f336453b = i2;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: y13.e$b */
    public static final class C112377b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112375e f336488d;

        /* renamed from: e */
        public final /* synthetic */ int f336489e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112377b(C112375e eVar, int i) {
            super(0);
            this.f336488d = eVar;
            this.f336489e = i;
        }

        public Object invoke() {
            int a = this.f336488d.f336482i.mo164089a(0);
            if (a >= 0) {
                C112371b.C112372a c = this.f336488d.f336482i.mo164091c(a);
                int b = this.f336488d.f336483j.mo164090b(0);
                if (b >= 0) {
                    if (VideoSoftDecoderJni.nDecodeSample(this.f336488d.f336485l, c.f336451b, this.f336489e) > 0) {
                        int nGetLineSize = VideoSoftDecoderJni.nGetLineSize(this.f336488d.f336485l);
                        C112375e eVar = this.f336488d;
                        C112373c cVar = eVar.f336484k;
                        if (cVar != null) {
                            int i = eVar.f336478e;
                            cVar.f336452a = nGetLineSize;
                            cVar.f336453b = i;
                        }
                        eVar.f336483j.f336441b = VideoSoftDecoderJni.nGetOutputBufferSize(eVar.f336485l);
                        C112371b.C112372a c2 = this.f336488d.f336483j.mo164091c(b);
                        ByteBuffer byteBuffer = c2.f336451b;
                        byteBuffer.position(0);
                        int nGetOutputBuffer = VideoSoftDecoderJni.nGetOutputBuffer(this.f336488d.f336485l, byteBuffer);
                        MediaCodec.BufferInfo bufferInfo = c2.f336450a;
                        bufferInfo.presentationTimeUs = c.f336450a.presentationTimeUs;
                        bufferInfo.size = nGetOutputBuffer;
                        byteBuffer.position(0);
                        byteBuffer.limit(nGetOutputBuffer);
                        this.f336488d.f336483j.mo164093e();
                    } else {
                        C112371b bVar = this.f336488d.f336483j;
                        bVar.f336443d.lock();
                        try {
                            bVar.f336446g--;
                            bVar.f336445f.signalAll();
                        } finally {
                            bVar.f336443d.unlock();
                        }
                    }
                    this.f336488d.f336482i.mo164092d();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: y13.e$c */
    public static final class C112378c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112375e f336490d;

        public C112378c(C112375e eVar) {
            this.f336490d = eVar;
        }

        public final void run() {
            C112373c cVar = this.f336490d.f336484k;
            if (cVar != null) {
                GLES20.glDeleteTextures(3, new int[]{cVar.f336461j, cVar.f336462k, cVar.f336463l}, 0);
                GLES20.glDeleteProgram(cVar.f336454c);
            }
            RenderContext renderContext = this.f336490d.f336476c;
            if (renderContext != null) {
                renderContext.release();
            }
            this.f336490d.f336474a.quit();
            VideoSoftDecoderJni.nDestroy(this.f336490d.f336485l);
            this.f336490d.f336485l = 0;
        }
    }

    /* renamed from: y13.e$d */
    public static final class C112379d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112375e f336491d;

        /* renamed from: e */
        public final /* synthetic */ int f336492e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112379d(C112375e eVar, int i) {
            super(0);
            this.f336491d = eVar;
            this.f336492e = i;
        }

        public Object invoke() {
            C112371b.C112372a c = this.f336491d.f336483j.mo164091c(this.f336492e);
            C112373c cVar = this.f336491d.f336484k;
            if (cVar != null) {
                ByteBuffer byteBuffer = c.f336451b;
                C87412m.m108594g(byteBuffer, "buffer");
                C112478a.m153625c("GLRenderProc", "render start", new Object[0]);
                GLES20.glViewport(0, 0, cVar.f336452a, cVar.f336453b);
                GLES20.glUseProgram(cVar.f336454c);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, cVar.f336461j);
                byteBuffer.position(0);
                ByteBuffer byteBuffer2 = byteBuffer;
                C112373c.m153316a(cVar, cVar.f336452a, cVar.f336453b, 6409, byteBuffer2, 0, 0, 48, (Object) null);
                GLES20.glUniform1i(cVar.f336457f, 0);
                cVar.mo164095b("bind y tex");
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, cVar.f336462k);
                byteBuffer.position(cVar.f336452a * cVar.f336453b);
                C112373c.m153316a(cVar, cVar.f336452a / 2, cVar.f336453b / 2, 6409, byteBuffer2, 0, 0, 48, (Object) null);
                GLES20.glUniform1i(cVar.f336458g, 1);
                cVar.mo164095b("bind uv tex");
                GLES20.glActiveTexture(33986);
                GLES20.glBindTexture(3553, cVar.f336463l);
                int i = cVar.f336452a * cVar.f336453b;
                byteBuffer.position(i + (i / 4));
                C112373c.m153316a(cVar, cVar.f336452a / 2, cVar.f336453b / 2, 6409, byteBuffer2, 0, 0, 48, (Object) null);
                GLES20.glUniform1i(cVar.f336459h, 2);
                byteBuffer.position(0);
                GLES20.glUniformMatrix4fv(cVar.f336460i, 1, false, cVar.f336464m, 0);
                cVar.f336466o.position(0);
                GLES20.glVertexAttribPointer(cVar.f336456e, 2, 5126, false, 0, cVar.f336466o);
                GLES20.glEnableVertexAttribArray(cVar.f336456e);
                cVar.f336465n.position(0);
                GLES20.glVertexAttribPointer(cVar.f336455d, 2, 5126, false, 0, cVar.f336465n);
                GLES20.glEnableVertexAttribArray(cVar.f336455d);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glDisableVertexAttribArray(cVar.f336456e);
                GLES20.glDisableVertexAttribArray(cVar.f336455d);
                GLES20.glBindTexture(3553, 0);
                cVar.mo164095b("gl draw");
                C112478a.m153625c("GLRenderProc", "render end", new Object[0]);
            }
            this.f336491d.f336483j.mo164092d();
            RenderContext renderContext = this.f336491d.f336476c;
            if (renderContext != null) {
                renderContext.setPresentationTime(c.f336450a.presentationTimeUs);
            }
            RenderContext renderContext2 = this.f336491d.f336476c;
            if (renderContext2 != null) {
                renderContext2.swapBuffers();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: y13.e$e */
    public static final class C112380e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112375e f336493d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112380e(C112375e eVar) {
            super(0);
            this.f336493d = eVar;
        }

        public Object invoke() {
            this.f336493d.f336483j.mo164092d();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: y13.e$f */
    public static final class C112381f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f336494d;

        public C112381f(C32224a aVar) {
            this.f336494d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f336494d.invoke();
        }
    }

    static {
        C101478s.vx0();
        C88957l.m111078n("mediaplus");
    }

    public C112375e() {
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("video_soft_gl", -4);
        this.f336474a = a;
        a.start();
        this.f336475b = new Handler(a.getLooper());
    }

    /* renamed from: a */
    public final void mo164096a(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "r");
        this.f336475b.post(new C112381f(aVar));
    }

    public void bindSurfaceTexture(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surfaceTexture");
        surfaceTexture.setDefaultBufferSize(this.f336477d, this.f336478e);
    }

    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        if (mediaFormat == null || surface == null) {
            C112478a.m153624b("VideoSoftDecoder", "format:" + mediaFormat + ", surface:" + surface, new Object[0]);
            return;
        }
        this.f336477d = mediaFormat.getInteger("width");
        this.f336478e = mediaFormat.getInteger("height");
        this.f336479f = C111749g.m152381a(mediaFormat, "rotation-degrees", 0);
        this.f336480g = C111749g.m152381a(mediaFormat, "max-input-size", 0);
        C112478a.m153625c("VideoSoftDecoder", "configure [" + this.f336477d + ", " + this.f336478e + "], " + this.f336479f + ", " + this.f336480g + ", " + this.f336481h, new Object[0]);
        if (this.f336480g <= 0) {
            this.f336480g = this.f336477d * this.f336478e;
        }
        this.f336482i = new C112371b(3, this.f336480g, LocaleUtil.INDONESIAN_NEWNAME);
        this.f336483j = new C112371b(5, this.f336481h, "out");
        mo164096a(new C112376a(this, surface));
    }

    public Surface createInputSurface() {
        return null;
    }

    public int dequeueInputBuffer(long j) {
        int b = this.f336482i.mo164090b(j);
        if (b >= 0) {
            return b;
        }
        return -1;
    }

    public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
        C87412m.m108594g(bufferInfo, "info");
        int a = this.f336483j.mo164089a(j);
        if (a < 0) {
            return -1;
        }
        MediaCodec.BufferInfo bufferInfo2 = this.f336483j.mo164091c(a).f336450a;
        bufferInfo.presentationTimeUs = bufferInfo2.presentationTimeUs;
        bufferInfo.size = bufferInfo2.size;
        return a;
    }

    public void flush() {
    }

    public ByteBuffer getInputBuffer(int i) {
        return this.f336482i.mo164091c(i).f336451b;
    }

    public ByteBuffer getOutputBuffer(int i) {
        return this.f336483j.mo164091c(i).f336451b;
    }

    public MediaFormat getOutputFormat() {
        return null;
    }

    public boolean isSoft() {
        return true;
    }

    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        MediaCodec.BufferInfo bufferInfo = this.f336482i.mo164091c(i).f336450a;
        bufferInfo.presentationTimeUs = j;
        bufferInfo.size = i3;
        this.f336482i.mo164093e();
        mo164096a(new C112377b(this, i3));
    }

    public void release() {
        this.f336475b.post(new C112378c(this));
    }

    public void releaseOutputBuffer(int i, boolean z) {
        if (z) {
            mo164096a(new C112379d(this, i));
        } else {
            mo164096a(new C112380e(this));
        }
    }

    public void reset() {
    }

    public void setDataSource(String str) {
        C87412m.m108594g(str, "path");
        long nInit = VideoSoftDecoderJni.nInit(str);
        this.f336485l = nInit;
        int nGetErrCode = VideoSoftDecoderJni.nGetErrCode(nInit);
        this.f336481h = VideoSoftDecoderJni.nGetOutputBufferSize(this.f336485l);
        C112478a.m153625c("VideoSoftDecoder", "init " + this.f336485l + ' ' + this.f336481h + ' ' + nGetErrCode, new Object[0]);
        if (nGetErrCode != 0) {
            throw new ExportRuntimeException(new ExportErrorStatus(-201, (Throwable) null, ""));
        }
    }

    public void signalEndOfInputStream() {
    }

    public void start() {
    }

    public void stop() {
    }
}
