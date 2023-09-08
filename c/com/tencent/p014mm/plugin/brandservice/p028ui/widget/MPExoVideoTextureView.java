package com.tencent.p014mm.plugin.brandservice.p028ui.widget;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C106595z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPExoVideoTextureView */
public class MPExoVideoTextureView extends MMTextureView {

    /* renamed from: h */
    public int f312088h;

    /* renamed from: i */
    public int f312089i;

    /* renamed from: j */
    public C106595z1 f312090j;

    public MPExoVideoTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: E */
    public final void mo149406E(SurfaceTexture surfaceTexture) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eglGetDisplay, (int[]) null);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        egl10.eglChooseConfig(eglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344}, eGLConfigArr, 1, new int[1]);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        EGLSurface eglCreateWindowSurface = egl10.eglCreateWindowSurface(eglGetDisplay, eGLConfig, surfaceTexture, new int[]{12344});
        egl10.eglMakeCurrent(eglGetDisplay, eglCreateWindowSurface, eglCreateWindowSurface, eglCreateContext);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        egl10.eglSwapBuffers(eglGetDisplay, eglCreateWindowSurface);
        egl10.eglDestroySurface(eglGetDisplay, eglCreateWindowSurface);
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        egl10.eglDestroyContext(eglGetDisplay, eglCreateContext);
        egl10.eglTerminate(eglGetDisplay);
    }

    /* renamed from: F */
    public void mo149407F() {
        try {
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            if (surfaceTexture != null) {
                Log.m105925i("MicroMsg.MPExoVideoTextureView", "%d releaseSurface", Integer.valueOf(hashCode()));
                mo149406E(surfaceTexture);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MPExoVideoTextureView", e, "release surface", new Object[0]);
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f312088h == 0 || this.f312089i == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        this.f312090j.mo153321a(View.getDefaultSize(1, i), View.getDefaultSize(1, i2), this.f312088h, this.f312089i);
        C106595z1 z1Var = this.f312090j;
        setMeasuredDimension(z1Var.f318524g, z1Var.f318525h);
    }

    public void setScaleType(C96814a.C96817e eVar) {
        this.f312090j.mo153324d(eVar);
        requestLayout();
    }

    public MPExoVideoTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f312090j = new C106595z1();
        this.f312088h = 0;
        this.f312089i = 0;
    }
}
