package com.tencent.p014mm.plugin.voip.video;

import com.tencent.p014mm.plugin.voip.video.GLTextureView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: com.tencent.mm.plugin.voip.video.a */
public class C106502a implements GLTextureView.C106489f {

    /* renamed from: b */
    public static int[] f318156b = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};

    /* renamed from: a */
    public int[] f318157a = new int[1];

    public C106502a(int i, int i2, int i3, int i4, int i5, int i6) {
    }

    /* renamed from: a */
    public final int mo153115a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f318157a) ? this.f318157a[0] : i2;
    }

    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr = new int[1];
        int[] iArr2 = f318156b;
        egl10.eglChooseConfig(eGLDisplay, iArr2, (EGLConfig[]) null, 0, iArr);
        int i = iArr[0];
        if (i > 0) {
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            egl10.eglChooseConfig(eGLDisplay, iArr2, eGLConfigArr, i, iArr);
            for (int i2 = 0; i2 < i; i2++) {
                EGLConfig eGLConfig = eGLConfigArr[i2];
                EGL10 egl102 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                EGLConfig eGLConfig2 = eGLConfig;
                int a = mo153115a(egl102, eGLDisplay2, eGLConfig2, 12325, 0);
                int a2 = mo153115a(egl102, eGLDisplay2, eGLConfig2, 12326, 0);
                if (a >= 0 && a2 >= 0) {
                    EGL10 egl103 = egl10;
                    EGLDisplay eGLDisplay3 = eGLDisplay;
                    EGLConfig eGLConfig3 = eGLConfig;
                    int a3 = mo153115a(egl103, eGLDisplay3, eGLConfig3, 12324, 0);
                    int a4 = mo153115a(egl103, eGLDisplay3, eGLConfig3, 12323, 0);
                    int a5 = mo153115a(egl103, eGLDisplay3, eGLConfig3, 12322, 0);
                    int a6 = mo153115a(egl103, eGLDisplay3, eGLConfig3, 12321, 0);
                    if (a3 == 5 && a4 == 6 && a5 == 5 && a6 == 0) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No configs match configSpec");
    }
}
