package com.tencent.liteav.videobase.utils;

import android.opengl.GLES20;

/* renamed from: com.tencent.liteav.videobase.utils.h */
public final class C104521h {

    /* renamed from: a */
    public final String f309806a;

    /* renamed from: b */
    public final String f309807b;

    public C104521h(String str, String str2) {
        this.f309806a = str;
        this.f309807b = str2;
    }

    /* renamed from: a */
    public static int m139838a(String str, int i) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        OpenGlUtils.checkGlError("glCompileShader");
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
