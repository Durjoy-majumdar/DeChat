package n80;

import android.media.Image;
import android.media.ImageReader;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.p014mm.plugin.sight.base.C106139e;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import eu3.C58834h;
import eu3.C97749e;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;
import rx3.C13598b0;
import u80.C111145g;
import w80.C111742d;

/* renamed from: n80.i */
public final class C109715i {

    /* renamed from: a */
    public final C106139e f328397a;

    /* renamed from: b */
    public final int f328398b;

    /* renamed from: c */
    public final int f328399c;

    /* renamed from: d */
    public ByteBuffer f328400d;

    /* renamed from: e */
    public ImageReader f328401e;

    /* renamed from: f */
    public Handler f328402f;

    /* renamed from: g */
    public HandlerThread f328403g = C97749e.m126093a("X264TransImageReaderEncoder_rgb2yuv_thread", -4);

    /* renamed from: h */
    public C111145g f328404h;

    /* renamed from: i */
    public C111742d.C65942b f328405i;

    /* renamed from: j */
    public int f328406j;

    /* renamed from: k */
    public int f328407k;

    /* renamed from: l */
    public volatile boolean f328408l;

    /* renamed from: m */
    public final Object f328409m = new Object();

    /* renamed from: n */
    public volatile int f328410n;

    /* renamed from: o */
    public volatile int f328411o;

    /* renamed from: p */
    public final Semaphore f328412p = new Semaphore(1);

    /* renamed from: n80.i$a */
    public static final class C109716a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109715i f328413d;

        /* renamed from: e */
        public final /* synthetic */ long f328414e;

        public C109716a(C109715i iVar, long j) {
            this.f328413d = iVar;
            this.f328414e = j;
        }

        public final void run() {
            if (this.f328413d.f328408l) {
                Log.m105924i("MicroMsg.X264TransImageReaderEncoder", "render gpu rgb2yuv, already stop");
            } else if (this.f328413d.f328405i == null) {
                Log.m105924i("MicroMsg.X264TransImageReaderEncoder", "render gpu rgb2yuv, rgb2yuvEGLEnvironment already relase");
            } else {
                Log.m105924i("MicroMsg.X264TransImageReaderEncoder", "render gpu rgb2yuv, timestamp:" + this.f328414e);
                C111145g gVar = this.f328413d.f328404h;
                if (gVar != null) {
                    gVar.mo162879m();
                }
                C111742d.C65942b bVar = this.f328413d.f328405i;
                EGLSurface eGLSurface = null;
                EGLExt.eglPresentationTimeANDROID(bVar != null ? bVar.f189591a : null, bVar != null ? bVar.f189592b : null, this.f328414e);
                C111742d.C111743a aVar = C111742d.f334647a;
                C111742d.C65942b bVar2 = this.f328413d.f328405i;
                EGLDisplay eGLDisplay = bVar2 != null ? bVar2.f189591a : null;
                if (bVar2 != null) {
                    eGLSurface = bVar2.f189592b;
                }
                aVar.mo163474t(eGLDisplay, eGLSurface);
                this.f328413d.f328410n++;
            }
        }
    }

    public C109715i(C106139e eVar, int i, int i2) {
        this.f328397a = eVar;
        this.f328398b = i;
        this.f328399c = i2;
        int i3 = C58834h.f168432b;
        Log.m105924i("MicroMsg.X264TransImageReaderEncoder", "create X264TransImageReaderEncoder, width:" + i + ", height:" + i2);
        SightVideoJNI.setI420Format(eVar != null ? eVar.f316167a : -1, true);
    }

    /* renamed from: a */
    public static final boolean m149038a(C109715i iVar, int i, int i2, Image.Plane plane) {
        synchronized (iVar.f328409m) {
            C106139e eVar = iVar.f328397a;
            if (eVar != null) {
                if (eVar.f316167a >= 0) {
                    long currentTicks = Util.currentTicks();
                    Log.m105924i("MicroMsg.X264TransImageReaderEncoder", "processImageYUVBufferToWriteYUVData, width:" + i + ", height:" + i2 + ", videoWidth:" + iVar.f328398b + ", videoHeight:" + iVar.f328399c);
                    int rowStride = plane.getRowStride();
                    int pixelStride = plane.getPixelStride();
                    if (iVar.f328400d == null) {
                        iVar.f328400d = ByteBuffer.allocateDirect(iVar.f328406j * iVar.f328407k * pixelStride);
                    }
                    ByteBuffer byteBuffer = iVar.f328400d;
                    if (byteBuffer != null) {
                        byteBuffer.position(0);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.position(0);
                    ByteBuffer byteBuffer2 = iVar.f328400d;
                    int i3 = iVar.f328406j * pixelStride;
                    SightVideoJNI.nativeBufferCopy(buffer, byteBuffer2, i3, iVar.f328407k, rowStride - i3);
                    SightVideoJNI.writeYuvDataForMMSightEncode(iVar.f328397a.f316167a, iVar.f328400d, iVar.f328398b, iVar.f328399c);
                    Log.m105924i("MicroMsg.X264TransImageReaderEncoder", "end processImageYUVBufferToWriteYUVData, cost:" + Util.ticksToNow(currentTicks));
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo160944b(long j) {
        Log.m105924i("MicroMsg.X264TransImageReaderEncoder", "requestEncode:" + j);
        Handler handler = this.f328402f;
        if (handler != null) {
            handler.post(new C109716a(this, j));
        }
        this.f328412p.acquire();
    }

    /* renamed from: c */
    public final void mo160945c(C111742d.C65942b bVar, int i, int i2, int i3) {
        C87412m.m108594g(bVar, "videoDataRenderEnvironment");
        Log.m105924i("MicroMsg.X264TransImageReaderEncoder", IXWebBroadcastListener.STAGE_START);
        Util.currentTicks();
        int i4 = this.f328398b / 4;
        this.f328406j = i4;
        int i5 = (this.f328399c * 3) / 2;
        this.f328407k = i5;
        ImageReader newInstance = ImageReader.newInstance(i4, i5, 1, 1);
        this.f328401e = newInstance;
        if (newInstance != null) {
            this.f328403g.start();
            Handler handler = new Handler(this.f328403g.getLooper());
            this.f328402f = handler;
            newInstance.setOnImageAvailableListener(new C109717j(this), handler);
            Handler handler2 = this.f328402f;
            if (handler2 != null) {
                handler2.post(new C109718k(this, newInstance, bVar, i, i2, i3));
            }
        }
        Log.m105924i("MicroMsg.X264TransImageReaderEncoder", "initRgb2YuvImageReader, yuv size:[" + this.f328406j + 'x' + this.f328407k + ']');
    }

    /* renamed from: d */
    public final void mo160946d() {
        Handler handler;
        Log.m105924i("MicroMsg.X264TransImageReaderEncoder", "stop");
        synchronized (this.f328409m) {
            Log.m105924i("MicroMsg.X264TransImageReaderEncoder", "finishEncode, renderYuvCount:" + this.f328410n + ", writeYuvCount:" + this.f328411o);
            this.f328408l = true;
            ImageReader imageReader = this.f328401e;
            if (imageReader != null) {
                imageReader.close();
            }
            C111742d.C65942b bVar = this.f328405i;
            if (!(bVar == null || (handler = this.f328402f) == null)) {
                handler.post(new C109714h(this, bVar));
            }
            C106139e eVar = this.f328397a;
            if (eVar != null) {
                SightVideoJNI.finishVideoEncode(eVar.f316167a);
            }
            this.f328403g.quitSafely();
            this.f328401e = null;
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
