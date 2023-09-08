package z10;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.ImageReader;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.HandlerThread;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import eu3.C58834h;
import eu3.C97749e;
import gy3.C87412m;
import java.nio.Buffer;
import q00.C110264g;
import q00.C62571i;
import w80.C111742d;

/* renamed from: z10.c */
public final class C112562c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112565e f337010d;

    /* renamed from: z10.c$a */
    public static final class C112563a implements ImageReader.OnImageAvailableListener {
        public void onImageAvailable(ImageReader imageReader) {
        }
    }

    public C112562c(C112565e eVar) {
        this.f337010d = eVar;
    }

    public final void run() {
        this.f337010d.getClass();
        Log.m105924i("MicroMsg.FilterRender", "initGL");
        C112565e eVar = this.f337010d;
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("FilterRenderCallbackHandlerThread", 5);
        eVar.getClass();
        eVar.f337015d = a;
        HandlerThread handlerThread = this.f337010d.f337015d;
        if (handlerThread != null) {
            handlerThread.start();
            C112565e eVar2 = this.f337010d;
            HandlerThread handlerThread2 = this.f337010d.f337015d;
            if (handlerThread2 != null) {
                Handler handler = new Handler(handlerThread2.getLooper());
                eVar2.getClass();
                eVar2.f337014c = handler;
                C112565e eVar3 = this.f337010d;
                ImageReader newInstance = ImageReader.newInstance(eVar3.f337022k, eVar3.f337023l, 1, 3);
                C87412m.m108593f(newInstance, "newInstance(curWidth, cu…PixelFormat.RGBA_8888, 3)");
                eVar3.f337016e = newInstance;
                C112565e eVar4 = this.f337010d;
                ImageReader imageReader = eVar4.f337016e;
                if (imageReader != null) {
                    C112563a aVar = new C112563a();
                    Handler handler2 = eVar4.f337014c;
                    if (handler2 != null) {
                        imageReader.setOnImageAvailableListener(aVar, handler2);
                        C112565e eVar5 = this.f337010d;
                        eVar5.getClass();
                        C111742d.C111743a aVar2 = C111742d.f334647a;
                        ImageReader imageReader2 = eVar5.f337016e;
                        if (imageReader2 != null) {
                            eVar5.f337017f = C111742d.C111743a.m152352k(aVar2, imageReader2.getSurface(), (SurfaceTexture) null, 0, 0, (EGLContext) null, 16, (Object) null);
                            C110264g gVar = eVar5.f337021j;
                            if (gVar != null) {
                                gVar.destroy();
                            }
                            C7335d c = C86312j.m106911c(C62571i.class);
                            C87412m.m108593f(c, "getService(IXLabEffectService::class.java)");
                            C110264g eo02 = ((C62571i) c).eo0(1, C110264g.C47730a.APP_VOIP);
                            eVar5.f337021j = eo02;
                            if (eo02 != null) {
                                eo02.mo143224C(eVar5.f337022k, eVar5.f337023l);
                            }
                            C110264g gVar2 = eVar5.f337021j;
                            if (gVar2 != null) {
                                gVar2.mo143233a(false);
                            }
                            eVar5.f337019h = aVar2.mo163468n();
                            eVar5.f337020i = aVar2.mo163468n();
                            Bitmap a2 = eVar5.mo164298a();
                            GLES20.glBindTexture(3553, eVar5.f337019h);
                            GLUtils.texImage2D(3553, 0, a2, 0);
                            GLES20.glBindTexture(3553, 0);
                            int i2 = eVar5.f337020i;
                            int i3 = eVar5.f337022k;
                            int i4 = eVar5.f337023l;
                            GLES20.glBindTexture(3553, i2);
                            GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, i3, i4, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
                            GLES20.glBindTexture(3553, 0);
                            return;
                        }
                        C87412m.m108603p("imageReader");
                        throw null;
                    }
                    C87412m.m108603p("callbackHandler");
                    throw null;
                }
                C87412m.m108603p("imageReader");
                throw null;
            }
            C87412m.m108603p("callbackThread");
            throw null;
        }
        C87412m.m108603p("callbackThread");
        throw null;
    }
}
