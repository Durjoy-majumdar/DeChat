package com.tencent.p014mm.plugin.api.recordView;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import com.tencent.p014mm.sdk.platformtools.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView */
public class MMSightCameraGLSurfaceView extends GLSurfaceView {

    /* renamed from: d */
    public EGLContext f310971d;

    /* renamed from: e */
    public C104722c f310972e;

    /* renamed from: com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView$a */
    public class C24273a implements GLSurfaceView.EGLConfigChooser {

        /* renamed from: a */
        public int[] f69684a = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};

        /* renamed from: b */
        public int[] f69685b = new int[1];

        public C24273a(MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView, int i, int i2, int i3, int i4, int i5, int i6) {
        }

        /* renamed from: a */
        public final int mo41032a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f69685b) ? this.f69685b[0] : i2;
        }

        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            egl10.eglChooseConfig(eGLDisplay, this.f69684a, (EGLConfig[]) null, 0, iArr);
            int i = iArr[0];
            if (i > 0) {
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                egl10.eglChooseConfig(eGLDisplay, this.f69684a, eGLConfigArr, i, iArr);
                Log.m105924i("GLConfigChooser", String.format("%d configurations", new Object[]{Integer.valueOf(i)}));
                for (int i2 = 0; i2 < i; i2++) {
                    Log.m105924i("GLConfigChooser", String.format("Configuration %d:\n", new Object[]{Integer.valueOf(i2)}));
                    EGLConfig eGLConfig = eGLConfigArr[i2];
                    int[] iArr2 = {12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336, 12337, 12338, 12339, 12340, 12343, 12342, 12341, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, 12354};
                    String[] strArr = {"EGL_BUFFER_SIZE", "EGL_ALPHA_SIZE", "EGL_BLUE_SIZE", "EGL_GREEN_SIZE", "EGL_RED_SIZE", "EGL_DEPTH_SIZE", "EGL_STENCIL_SIZE", "EGL_CONFIG_CAVEAT", "EGL_CONFIG_ID", "EGL_LEVEL", "EGL_MAX_PBUFFER_HEIGHT", "EGL_MAX_PBUFFER_PIXELS", "EGL_MAX_PBUFFER_WIDTH", "EGL_NATIVE_RENDERABLE", "EGL_NATIVE_VISUAL_ID", "EGL_NATIVE_VISUAL_TYPE", "EGL_PRESERVED_RESOURCES", "EGL_SAMPLES", "EGL_SAMPLE_BUFFERS", "EGL_SURFACE_TYPE", "EGL_TRANSPARENT_TYPE", "EGL_TRANSPARENT_RED_VALUE", "EGL_TRANSPARENT_GREEN_VALUE", "EGL_TRANSPARENT_BLUE_VALUE", "EGL_BIND_TO_TEXTURE_RGB", "EGL_BIND_TO_TEXTURE_RGBA", "EGL_MIN_SWAP_INTERVAL", "EGL_MAX_SWAP_INTERVAL", "EGL_LUMINANCE_SIZE", "EGL_ALPHA_MASK_SIZE", "EGL_COLOR_BUFFER_TYPE", "EGL_RENDERABLE_TYPE", "EGL_CONFORMANT"};
                    int[] iArr3 = new int[1];
                    for (int i3 = 0; i3 < 33; i3++) {
                        int i4 = iArr2[i3];
                        String str = strArr[i3];
                        egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i4, iArr3);
                    }
                    EGL10 egl102 = egl10;
                    EGLDisplay eGLDisplay2 = eGLDisplay;
                }
                EGL10 egl103 = egl10;
                EGLDisplay eGLDisplay3 = eGLDisplay;
                int i5 = 0;
                while (i5 < i) {
                    EGLConfig eGLConfig2 = eGLConfigArr[i5];
                    EGL10 egl104 = egl10;
                    EGLDisplay eGLDisplay4 = eGLDisplay;
                    EGLConfig eGLConfig3 = eGLConfig2;
                    int a = mo41032a(egl104, eGLDisplay4, eGLConfig3, 12325, 0);
                    int a2 = mo41032a(egl104, eGLDisplay4, eGLConfig3, 12326, 0);
                    if (a >= 0 && a2 >= 0) {
                        EGL10 egl105 = egl10;
                        EGLDisplay eGLDisplay5 = eGLDisplay;
                        EGLConfig eGLConfig4 = eGLConfig2;
                        int a3 = mo41032a(egl105, eGLDisplay5, eGLConfig4, 12324, 0);
                        int a4 = mo41032a(egl105, eGLDisplay5, eGLConfig4, 12323, 0);
                        int a5 = mo41032a(egl105, eGLDisplay5, eGLConfig4, 12322, 0);
                        int a6 = mo41032a(egl105, eGLDisplay5, eGLConfig4, 12321, 0);
                        if (a3 == 5 && a4 == 6 && a5 == 5 && a6 == 0) {
                            return eGLConfig2;
                        }
                    }
                    i5++;
                }
                return null;
            }
            throw new IllegalArgumentException("No configs match configSpec");
        }
    }

    /* renamed from: com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView$b */
    public class C104721b implements GLSurfaceView.EGLContextFactory {
        public C104721b(MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView) {
        }

        public javax.microedition.khronos.egl.EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            Log.m105928w("MicroMsg.MMSightCameraGLSurfaceView", "creating OpenGL ES 2.0 context");
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        }

        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLContext eGLContext) {
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }

    /* renamed from: com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView$c */
    public interface C104722c {
        /* renamed from: a */
        void mo148384a();
    }

    public MMSightCameraGLSurfaceView(Context context) {
        super(context);
        mo148373a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo148373a() {
        /*
            r10 = this;
            android.view.SurfaceHolder r0 = r10.getHolder()
            r0.addCallback(r10)
            r0 = 0
            android.view.SurfaceHolder r1 = r10.getHolder()     // Catch:{ Exception -> 0x0011 }
            r2 = 2
            r1.setType(r2)     // Catch:{ Exception -> 0x0011 }
            goto L_0x0021
        L_0x0011:
            android.view.SurfaceHolder r1 = r10.getHolder()     // Catch:{ Exception -> 0x001a }
            r2 = 1
            r1.setType(r2)     // Catch:{ Exception -> 0x001a }
            goto L_0x0021
        L_0x001a:
            android.view.SurfaceHolder r1 = r10.getHolder()     // Catch:{ Exception -> 0x0021 }
            r1.setType(r0)     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
            com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView$b r1 = new com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView$b
            r1.<init>(r10)
            r10.setEGLContextFactory(r1)
            com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView$a r1 = new com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView$a
            r4 = 5
            r5 = 6
            r6 = 5
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r1
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.setEGLConfigChooser(r1)
            com.tencent.mm.plugin.api.recordView.a r1 = new com.tencent.mm.plugin.api.recordView.a
            r1.<init>()
            r10.setRenderer(r1)
            r10.setRenderMode(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.api.recordView.MMSightCameraGLSurfaceView.mo148373a():void");
    }

    public EGLContext getEglContext() {
        return this.f310971d;
    }

    public int getFrameHeight() {
        return 0;
    }

    public int getFrameRotate() {
        return 0;
    }

    public int getFrameWidth() {
        return 0;
    }

    public void setOnEglEnableListener(C104722c cVar) {
        this.f310972e = cVar;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        super.surfaceChanged(surfaceHolder, i, i2, i3);
        Log.m105925i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceChanged, format: %s, w: %s, h: %s this: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), this);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        Log.m105925i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceCreated: %s this: %s %s", surfaceHolder, this, Integer.valueOf(getId()));
        this.f310971d = EGL14.eglGetCurrentContext();
        C104722c cVar = this.f310972e;
        if (cVar != null) {
            cVar.mo148384a();
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        Log.m105925i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceDestroyed: %s this: %s", surfaceHolder, this);
    }

    public MMSightCameraGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo148373a();
    }
}
