package com.tencent.p014mm.plugin.api.recordView;

import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.api.recordView.b */
public class C104724b {
    /* renamed from: a */
    public static int m140339a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, Task.EXTRAS_LIMIT_BYTES, 9728);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        return iArr[0];
    }

    /* renamed from: b */
    public static int m140340b(String str, int i) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.m105920e("loadShader error, infoLog: %s", GLES20.glGetShaderInfoLog(glCreateShader));
        return 0;
    }

    /* renamed from: c */
    public static int m140341c(String str, String str2) {
        int[] iArr = new int[1];
        int b = m140340b(str, 35633);
        if (b == 0) {
            Log.m105920e("MicroMsg.MMSightCameraGLUtil", "load vertex shader failed");
            return 0;
        }
        int b2 = m140340b(str2, 35632);
        if (b2 == 0) {
            Log.m105920e("MicroMsg.MMSightCameraGLUtil", "load fragment shader failed");
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, b);
        GLES20.glAttachShader(glCreateProgram, b2);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            Log.m105920e("MicroMsg.MMSightCameraGLUtil", "link program failed");
            return 0;
        }
        GLES20.glDeleteShader(b);
        GLES20.glDeleteShader(b2);
        return glCreateProgram;
    }
}
