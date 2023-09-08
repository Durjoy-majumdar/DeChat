package com.tencent.p014mm.plugin.api.recordView;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import com.tencent.p014mm.plugin.api.recordView.C104733i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import javax.microedition.khronos.opengles.GL10;
import org.webrtc.EglBase;

/* renamed from: com.tencent.mm.plugin.api.recordView.f */
public class C104729f {

    /* renamed from: a */
    public HandlerThread f311005a = C97749e.m126093a("YUVDateRenderToRBGBufferThread", 5);

    /* renamed from: b */
    public MMHandler f311006b;

    /* renamed from: c */
    public C104733i f311007c;

    /* renamed from: d */
    public C104733i.C104734a f311008d = null;

    /* renamed from: e */
    public int f311009e;

    /* renamed from: f */
    public int f311010f;

    /* renamed from: g */
    public int f311011g;

    /* renamed from: h */
    public int f311012h;

    /* renamed from: i */
    public int f311013i;

    /* renamed from: j */
    public boolean f311014j = false;

    /* renamed from: k */
    public int[] f311015k = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};

    /* renamed from: l */
    public EGLDisplay f311016l = null;

    /* renamed from: m */
    public EGLSurface f311017m = null;

    /* renamed from: n */
    public EGLContext f311018n = null;

    /* renamed from: com.tencent.mm.plugin.api.recordView.f$a */
    public class C104730a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EGLContext f311019d;

        public C104730a(EGLContext eGLContext) {
            this.f311019d = eGLContext;
        }

        public void run() {
            C104729f fVar = C104729f.this;
            EGLContext eGLContext = this.f311019d;
            int i = fVar.f311009e;
            int i2 = fVar.f311010f;
            fVar.getClass();
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            fVar.f311016l = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    EGL14.eglChooseConfig(fVar.f311016l, fVar.f311015k, 0, eGLConfigArr, 0, 1, new int[1], 0);
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (eGLConfig != null) {
                        EGLContext eglCreateContext = EGL14.eglCreateContext(fVar.f311016l, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
                        fVar.f311018n = eglCreateContext;
                        if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                            fVar.mo148399a("eglCreateContext");
                            int[] iArr2 = {12375, i, 12374, i2, 12344};
                            fVar.f311017m = null;
                            try {
                                fVar.f311017m = EGL14.eglCreatePbufferSurface(fVar.f311016l, eGLConfigArr[0], iArr2, 0);
                            } catch (IllegalArgumentException e) {
                                Log.m105921e("MicroMsg.YUVDateRenderToRBGBufferThread", "eglCreateWindowSurface", e);
                            }
                            fVar.mo148399a("eglCreatePbufferSurface");
                            EGLSurface eGLSurface = fVar.f311017m;
                            if ((eGLSurface == null || eGLSurface == EGL14.EGL_NO_SURFACE) && EGL14.eglGetError() == 12299) {
                                Log.m105920e("MicroMsg.YUVDateRenderToRBGBufferThread", "makeMyEGLCurrentSurface:returned EGL_BAD_NATIVE_WINDOW.");
                            }
                            EGLDisplay eGLDisplay = fVar.f311016l;
                            EGLSurface eGLSurface2 = fVar.f311017m;
                            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, fVar.f311018n)) {
                                Log.m105928w("MicroMsg.YUVDateRenderToRBGBufferThread", "eglMakeCurrent:" + EGL14.eglGetError());
                            }
                            C104729f fVar2 = C104729f.this;
                            int i3 = fVar2.f311009e;
                            int i4 = fVar2.f311010f;
                            int i5 = fVar2.f311012h;
                            int i6 = fVar2.f311013i;
                            fVar2.getClass();
                            C104733i iVar = new C104733i(i3, i4, i5, i6);
                            fVar2.f311007c = iVar;
                            iVar.onSurfaceCreated((GL10) null, (javax.microedition.khronos.egl.EGLConfig) null);
                            fVar2.f311007c.onSurfaceChanged((GL10) null, i5, i6);
                            C104733i.C104734a aVar = fVar2.f311008d;
                            if (aVar != null) {
                                fVar2.f311007c.f311049w = aVar.getBuffer();
                                return;
                            }
                            return;
                        }
                        throw new RuntimeException("EGL error " + EGL14.eglGetError());
                    }
                    throw new RuntimeException("chooseConfig failed");
                }
                fVar.f311016l = null;
                throw new RuntimeException("eglInitialize failed");
            }
            throw new RuntimeException("unable to get EGL14 display");
        }
    }

    public C104729f() {
        int i = C58834h.f168432b;
    }

    /* renamed from: a */
    public final boolean mo148399a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return false;
        }
        Log.printInfoStack("MicroMsg.YUVDateRenderToRBGBufferThread", str + ": EGL error: 0x" + Integer.toHexString(eglGetError), new Object[0]);
        return true;
    }

    /* renamed from: b */
    public void mo148400b(EGLContext eGLContext) {
        Log.m105918d("MicroMsg.YUVDateRenderToRBGBufferThread", "start context : " + eGLContext + "  hasStart : " + this.f311014j);
        if (!this.f311014j && eGLContext != null) {
            this.f311014j = true;
            this.f311005a.start();
            this.f311006b = new MMHandler(this.f311005a.getLooper());
            C104730a aVar = new C104730a(eGLContext);
            if (this.f311005a.isAlive()) {
                this.f311006b.post(aVar);
            }
        }
    }
}
