package com.tencent.tav.decoder;

import android.opengl.EGL14;
import android.opengl.GLES20;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.xweb.file.XVFSFile;

public class Program {
    private static final String TAG = "Program";

    public static void checkEglError(String str) {
        StringBuilder sb = new StringBuilder("");
        boolean z = false;
        while (true) {
            int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            Logger.m144643e(TAG, str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
            sb.append(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
            z = true;
        }
        if (z) {
            new RuntimeException("EGL error encountered (see log): " + sb.toString());
        }
    }

    public static synchronized int createProgram(String str, String str2) {
        int createProgram;
        synchronized (Program.class) {
            createProgram = createProgram(str, str2, (int[]) null);
        }
        return createProgram;
    }

    private static synchronized int loadShader(int i, String str) {
        int glCreateShader;
        synchronized (Program.class) {
            glCreateShader = GLES20.glCreateShader(i);
            checkEglError("glCreateShader type=" + i);
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                Logger.m144643e(TAG, "Could not compile shader " + i + XVFSFile.PATH_SEPARATOR);
                StringBuilder sb = new StringBuilder();
                sb.append(" ");
                sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
                Logger.m144643e(TAG, sb.toString());
                GLES20.glDeleteShader(glCreateShader);
                glCreateShader = 0;
            }
        }
        return glCreateShader;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int createProgram(java.lang.String r5, java.lang.String r6, int[] r7) {
        /*
            java.lang.Class<com.tencent.tav.decoder.Program> r0 = com.tencent.tav.decoder.Program.class
            monitor-enter(r0)
            r1 = 3042(0xbe2, float:4.263E-42)
            android.opengl.GLES20.glEnable(r1)     // Catch:{ all -> 0x007f }
            r1 = 32774(0x8006, float:4.5926E-41)
            android.opengl.GLES20.glBlendEquationSeparate(r1, r1)     // Catch:{ all -> 0x007f }
            r1 = 770(0x302, float:1.079E-42)
            r2 = 771(0x303, float:1.08E-42)
            r3 = 1
            android.opengl.GLES20.glBlendFuncSeparate(r1, r2, r3, r2)     // Catch:{ all -> 0x007f }
            r1 = 35633(0x8b31, float:4.9932E-41)
            int r5 = loadShader(r1, r5)     // Catch:{ all -> 0x007f }
            r1 = 0
            if (r5 != 0) goto L_0x0022
            monitor-exit(r0)
            return r1
        L_0x0022:
            r2 = 35632(0x8b30, float:4.9931E-41)
            int r6 = loadShader(r2, r6)     // Catch:{ all -> 0x007f }
            if (r6 != 0) goto L_0x002d
            monitor-exit(r0)
            return r1
        L_0x002d:
            if (r7 == 0) goto L_0x0037
            int r2 = r7.length     // Catch:{ all -> 0x007f }
            r4 = 2
            if (r2 < r4) goto L_0x0037
            r7[r1] = r5     // Catch:{ all -> 0x007f }
            r7[r3] = r6     // Catch:{ all -> 0x007f }
        L_0x0037:
            int r7 = android.opengl.GLES20.glCreateProgram()     // Catch:{ all -> 0x007f }
            java.lang.String r2 = "glCreateProgram"
            checkEglError(r2)     // Catch:{ all -> 0x007f }
            if (r7 != 0) goto L_0x0049
            java.lang.String r2 = "Program"
            java.lang.String r4 = "Could not create program"
            com.tencent.tav.decoder.logger.Logger.m144643e(r2, r4)     // Catch:{ all -> 0x007f }
        L_0x0049:
            android.opengl.GLES20.glAttachShader(r7, r5)     // Catch:{ all -> 0x007f }
            java.lang.String r5 = "glAttachShader"
            checkEglError(r5)     // Catch:{ all -> 0x007f }
            android.opengl.GLES20.glAttachShader(r7, r6)     // Catch:{ all -> 0x007f }
            java.lang.String r5 = "glAttachShader"
            checkEglError(r5)     // Catch:{ all -> 0x007f }
            android.opengl.GLES20.glLinkProgram(r7)     // Catch:{ all -> 0x007f }
            int[] r5 = new int[r3]     // Catch:{ all -> 0x007f }
            r6 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r7, r6, r5, r1)     // Catch:{ all -> 0x007f }
            r5 = r5[r1]     // Catch:{ all -> 0x007f }
            if (r5 == r3) goto L_0x007c
            java.lang.String r5 = "Program"
            java.lang.String r6 = "Could not link program: "
            com.tencent.tav.decoder.logger.Logger.m144643e(r5, r6)     // Catch:{ all -> 0x007f }
            java.lang.String r5 = "Program"
            java.lang.String r6 = android.opengl.GLES20.glGetProgramInfoLog(r7)     // Catch:{ all -> 0x007f }
            com.tencent.tav.decoder.logger.Logger.m144643e(r5, r6)     // Catch:{ all -> 0x007f }
            android.opengl.GLES20.glDeleteProgram(r7)     // Catch:{ all -> 0x007f }
            goto L_0x007d
        L_0x007c:
            r1 = r7
        L_0x007d:
            monitor-exit(r0)
            return r1
        L_0x007f:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.Program.createProgram(java.lang.String, java.lang.String, int[]):int");
    }
}
