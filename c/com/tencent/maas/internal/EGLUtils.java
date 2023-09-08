package com.tencent.maas.internal;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

class EGLUtils {
    public static Object getCurrentEGLContext() {
        return ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
    }
}
