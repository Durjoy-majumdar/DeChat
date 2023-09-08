package com.tencent.p014mm.plugin.api.recordView;

import android.graphics.SurfaceTexture;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: com.tencent.mm.plugin.api.recordView.c */
public class C104725c extends Thread {

    /* renamed from: d */
    public SurfaceTexture f310984d;

    /* renamed from: e */
    public C104726d f310985e;

    /* renamed from: f */
    public EGL10 f310986f;

    /* renamed from: g */
    public EGLDisplay f310987g = EGL10.EGL_NO_DISPLAY;

    /* renamed from: h */
    public EGLContext f310988h = EGL10.EGL_NO_CONTEXT;

    /* renamed from: i */
    public EGLSurface f310989i = EGL10.EGL_NO_SURFACE;

    /* renamed from: j */
    public volatile boolean f310990j;

    public C104725c(SurfaceTexture surfaceTexture, C104726d dVar) {
        this.f310984d = surfaceTexture;
        this.f310985e = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            java.lang.String r0 = "MicroMsg.MMSightRecordTextureViewRenderThread"
            java.lang.String r1 = "start render thread"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r14.f310986f = r0
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r14.f310987g = r0
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            java.lang.String r2 = "MicroMsg.MMSightRecordTextureViewRenderThread"
            r3 = 0
            r4 = -1
            r5 = 3
            r6 = 2
            r7 = 1
            if (r0 != r1) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r7]
            javax.microedition.khronos.egl.EGL10 r1 = r14.f310986f
            int r1 = r1.eglGetError()
            java.lang.String r1 = android.opengl.GLUtils.getEGLErrorString(r1)
            r0[r3] = r1
            java.lang.String r1 = "egl get display error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r0)
            goto L_0x00f1
        L_0x0038:
            int[] r1 = new int[r6]
            javax.microedition.khronos.egl.EGL10 r8 = r14.f310986f
            boolean r0 = r8.eglInitialize(r0, r1)
            if (r0 != 0) goto L_0x0057
            java.lang.Object[] r0 = new java.lang.Object[r7]
            javax.microedition.khronos.egl.EGL10 r1 = r14.f310986f
            int r1 = r1.eglGetError()
            java.lang.String r1 = android.opengl.GLUtils.getEGLErrorString(r1)
            r0[r3] = r1
            java.lang.String r1 = "egl init error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r0)
            goto L_0x00f1
        L_0x0057:
            r0 = 9
            int[] r10 = new int[r0]
            r10 = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344} // fill-array
            int[] r13 = new int[r7]
            javax.microedition.khronos.egl.EGLConfig[] r0 = new javax.microedition.khronos.egl.EGLConfig[r7]
            javax.microedition.khronos.egl.EGL10 r8 = r14.f310986f
            javax.microedition.khronos.egl.EGLDisplay r9 = r14.f310987g
            r12 = 1
            r11 = r0
            boolean r1 = r8.eglChooseConfig(r9, r10, r11, r12, r13)
            if (r1 != 0) goto L_0x0082
            java.lang.Object[] r0 = new java.lang.Object[r7]
            javax.microedition.khronos.egl.EGL10 r1 = r14.f310986f
            int r1 = r1.eglGetError()
            java.lang.String r1 = android.opengl.GLUtils.getEGLErrorString(r1)
            r0[r3] = r1
            java.lang.String r1 = "egl choose config failed: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r0)
            goto L_0x00f1
        L_0x0082:
            int[] r1 = new int[r5]
            r1 = {12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r8 = r14.f310986f
            javax.microedition.khronos.egl.EGLDisplay r9 = r14.f310987g
            r10 = r0[r3]
            javax.microedition.khronos.egl.EGLContext r11 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r1 = r8.eglCreateContext(r9, r10, r11, r1)
            r14.f310988h = r1
            javax.microedition.khronos.egl.EGL10 r1 = r14.f310986f
            javax.microedition.khronos.egl.EGLDisplay r8 = r14.f310987g
            r0 = r0[r3]
            android.graphics.SurfaceTexture r9 = r14.f310984d
            r10 = 0
            javax.microedition.khronos.egl.EGLSurface r0 = r1.eglCreateWindowSurface(r8, r0, r9, r10)
            r14.f310989i = r0
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 == r1) goto L_0x00ce
            javax.microedition.khronos.egl.EGLContext r1 = r14.f310988h
            javax.microedition.khronos.egl.EGLContext r8 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r8) goto L_0x00af
            goto L_0x00ce
        L_0x00af:
            javax.microedition.khronos.egl.EGL10 r8 = r14.f310986f
            javax.microedition.khronos.egl.EGLDisplay r9 = r14.f310987g
            boolean r0 = r8.eglMakeCurrent(r9, r0, r0, r1)
            if (r0 != 0) goto L_0x00cc
            java.lang.Object[] r0 = new java.lang.Object[r7]
            javax.microedition.khronos.egl.EGL10 r1 = r14.f310986f
            int r1 = r1.eglGetError()
            java.lang.String r1 = android.opengl.GLUtils.getEGLErrorString(r1)
            r0[r3] = r1
            java.lang.String r1 = "eglMakeCurrent failed : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r0)
        L_0x00cc:
            r0 = 0
            goto L_0x00f2
        L_0x00ce:
            javax.microedition.khronos.egl.EGL10 r0 = r14.f310986f
            int r0 = r0.eglGetError()
            r1 = 12299(0x300b, float:1.7235E-41)
            if (r0 != r1) goto L_0x00de
            java.lang.String r0 = "eglCreateWindowSurface returned EGL_BAD_NATIVE_WINDOW. "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x00f1
        L_0x00de:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            javax.microedition.khronos.egl.EGL10 r1 = r14.f310986f
            int r1 = r1.eglGetError()
            java.lang.String r1 = android.opengl.GLUtils.getEGLErrorString(r1)
            r0[r3] = r1
            java.lang.String r1 = "eglCreateWindowSurface failed : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r0)
        L_0x00f1:
            r0 = -1
        L_0x00f2:
            if (r0 >= 0) goto L_0x00fc
            java.lang.String r0 = "MicroMsg.MMSightRecordTextureViewRenderThread"
            java.lang.String r1 = "init gl failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return
        L_0x00fc:
            com.tencent.mm.plugin.api.recordView.d r0 = r14.f310985e
            r1 = 0
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r2 = com.tencent.p014mm.plugin.api.recordView.C104726d.f310993j
            monitor-enter(r2)
            java.lang.String r8 = "MicroMsg.MMSightRecordTextureViewRenderer"
            java.lang.String r9 = "init this %s"
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x01bc }
            r10[r3] = r0     // Catch:{ all -> 0x01bc }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r10)     // Catch:{ all -> 0x01bc }
            r8 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glClearColor(r1, r1, r1, r8)     // Catch:{ all -> 0x01bc }
            r8 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glDisable(r8)     // Catch:{ all -> 0x01bc }
            java.lang.String r8 = "attribute vec4 a_position;                         \nattribute vec2 a_texCoord;                         \nvarying vec2 v_texCoord;                           \nuniform mat4 uMatrix;                              \nvoid main() {                                      \n   gl_Position = uMatrix * a_position;             \n   v_texCoord = a_texCoord;                        \n}                                                  \n"
            java.lang.String r9 = "#ifdef GL_ES                                       \nprecision highp float;                             \n#endif                                             \nvarying vec2 v_texCoord;                           \nuniform sampler2D y_texture;                       \nuniform sampler2D uv_texture;                      \nvoid main (void) {                                 \n   float r, g, b, y, u, v;                         \n   y = texture2D(y_texture, v_texCoord).r;         \n   u = texture2D(uv_texture, v_texCoord).a;        \n   v = texture2D(uv_texture, v_texCoord).r;        \n   u = u - 0.5;                                    \n   v = v - 0.5;                                    \n   r = y + 1.370705 * v;                           \n   g = y - 0.337633 * u - 0.698001 * v;            \n   b = y + 1.732446 * u;                           \n   gl_FragColor = vec4(r, g, b, 1.0);              \n}                                                  \n"
            int r8 = com.tencent.p014mm.plugin.api.recordView.C104724b.m140341c(r8, r9)     // Catch:{ all -> 0x01bc }
            r0.f310998e = r8     // Catch:{ all -> 0x01bc }
            if (r8 != 0) goto L_0x012c
            java.lang.String r8 = "MicroMsg.MMSightRecordTextureViewRenderer"
            java.lang.String r9 = "onSurfaceCreated, load program failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r9)     // Catch:{ all -> 0x01bc }
        L_0x012c:
            int r8 = r0.f310998e     // Catch:{ all -> 0x01bc }
            java.lang.String r9 = "a_position"
            android.opengl.GLES20.glGetAttribLocation(r8, r9)     // Catch:{ all -> 0x01bc }
            int r8 = r0.f310998e     // Catch:{ all -> 0x01bc }
            java.lang.String r9 = "a_texCoord"
            android.opengl.GLES20.glGetAttribLocation(r8, r9)     // Catch:{ all -> 0x01bc }
            int r8 = r0.f310998e     // Catch:{ all -> 0x01bc }
            java.lang.String r9 = "y_texture"
            android.opengl.GLES20.glGetUniformLocation(r8, r9)     // Catch:{ all -> 0x01bc }
            int r8 = r0.f310998e     // Catch:{ all -> 0x01bc }
            java.lang.String r9 = "uv_texture"
            android.opengl.GLES20.glGetUniformLocation(r8, r9)     // Catch:{ all -> 0x01bc }
            int r8 = r0.f310998e     // Catch:{ all -> 0x01bc }
            java.lang.String r9 = "uMatrix"
            android.opengl.GLES20.glGetUniformLocation(r8, r9)     // Catch:{ all -> 0x01bc }
            int r8 = com.tencent.p014mm.plugin.api.recordView.C104724b.m140339a()     // Catch:{ all -> 0x01bc }
            r0.f310996c = r8     // Catch:{ all -> 0x01bc }
            int r8 = com.tencent.p014mm.plugin.api.recordView.C104724b.m140339a()     // Catch:{ all -> 0x01bc }
            r0.f310997d = r8     // Catch:{ all -> 0x01bc }
            float[] r8 = com.tencent.p014mm.plugin.api.recordView.C104726d.f310991h     // Catch:{ all -> 0x01bc }
            r9 = 32
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocateDirect(r9)     // Catch:{ all -> 0x01bc }
            java.nio.ByteOrder r11 = java.nio.ByteOrder.nativeOrder()     // Catch:{ all -> 0x01bc }
            java.nio.ByteBuffer r10 = r10.order(r11)     // Catch:{ all -> 0x01bc }
            java.nio.FloatBuffer r10 = r10.asFloatBuffer()     // Catch:{ all -> 0x01bc }
            r0.f310999f = r10     // Catch:{ all -> 0x01bc }
            r10.put(r8)     // Catch:{ all -> 0x01bc }
            java.nio.FloatBuffer r8 = r0.f310999f     // Catch:{ all -> 0x01bc }
            r8.position(r3)     // Catch:{ all -> 0x01bc }
            float[] r8 = com.tencent.p014mm.plugin.api.recordView.C104726d.f310992i     // Catch:{ all -> 0x01bc }
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocateDirect(r9)     // Catch:{ all -> 0x01bc }
            java.nio.ByteOrder r10 = java.nio.ByteOrder.nativeOrder()     // Catch:{ all -> 0x01bc }
            java.nio.ByteBuffer r9 = r9.order(r10)     // Catch:{ all -> 0x01bc }
            java.nio.FloatBuffer r9 = r9.asFloatBuffer()     // Catch:{ all -> 0x01bc }
            r0.f311000g = r9     // Catch:{ all -> 0x01bc }
            r9.put(r8)     // Catch:{ all -> 0x01bc }
            java.nio.FloatBuffer r8 = r0.f311000g     // Catch:{ all -> 0x01bc }
            r8.position(r3)     // Catch:{ all -> 0x01bc }
            java.lang.String r8 = "MicroMsg.MMSightRecordTextureViewRenderer"
            java.lang.String r9 = "onSurfaceCreated, yTextureId: %s, uvTextureId: %s this %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x01bc }
            int r10 = r0.f310996c     // Catch:{ all -> 0x01bc }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01bc }
            r5[r3] = r10     // Catch:{ all -> 0x01bc }
            int r10 = r0.f310997d     // Catch:{ all -> 0x01bc }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01bc }
            r5[r7] = r10     // Catch:{ all -> 0x01bc }
            r5[r6] = r0     // Catch:{ all -> 0x01bc }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r5)     // Catch:{ all -> 0x01bc }
            monitor-exit(r2)     // Catch:{ all -> 0x01bc }
            java.lang.String r0 = "MicroMsg.MMSightRecordTextureViewRenderThread"
            java.lang.String r2 = "init renderer finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x01bf
        L_0x01bc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01bc }
            throw r0
        L_0x01bf:
            boolean r0 = r14.f310990j
            if (r0 == 0) goto L_0x0201
            com.tencent.mm.plugin.api.recordView.d r0 = r14.f310985e
            if (r0 == 0) goto L_0x01f5
            r5 = 10
            java.lang.Thread.sleep(r5)     // Catch:{ InterruptedException -> 0x01cd }
            goto L_0x01d7
        L_0x01cd:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.MMSightRecordTextureViewRenderThread"
            java.lang.String r5 = ""
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r6)
        L_0x01d7:
            com.tencent.mm.plugin.api.recordView.d r0 = r14.f310985e
            r0.getClass()
            com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            android.opengl.GLES20.glClearColor(r1, r1, r1, r1)
            r2 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r2)
            java.lang.Object r2 = com.tencent.p014mm.plugin.api.recordView.C104726d.f310993j
            monitor-enter(r2)
            int r5 = r0.f310998e     // Catch:{ all -> 0x01f2 }
            if (r5 == r4) goto L_0x01f0
            int r0 = r0.f310996c     // Catch:{ all -> 0x01f2 }
        L_0x01f0:
            monitor-exit(r2)     // Catch:{ all -> 0x01f2 }
            goto L_0x01f5
        L_0x01f2:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01f2 }
            throw r0
        L_0x01f5:
            javax.microedition.khronos.egl.EGL10 r0 = r14.f310986f
            if (r0 == 0) goto L_0x01bf
            javax.microedition.khronos.egl.EGLDisplay r2 = r14.f310987g
            javax.microedition.khronos.egl.EGLSurface r5 = r14.f310989i
            r0.eglSwapBuffers(r2, r5)
            goto L_0x01bf
        L_0x0201:
            java.lang.String r0 = "MicroMsg.MMSightRecordTextureViewRenderThread"
            java.lang.String r1 = "finish render loop, start destroy gl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.api.recordView.d r0 = r14.f310985e
            if (r0 == 0) goto L_0x0237
            java.lang.Object r1 = com.tencent.p014mm.plugin.api.recordView.C104726d.f310993j
            monitor-enter(r1)
            int r2 = r0.f310998e     // Catch:{ all -> 0x0234 }
            if (r2 < 0) goto L_0x0218
            android.opengl.GLES20.glDeleteProgram(r2)     // Catch:{ all -> 0x0234 }
            r0.f310998e = r4     // Catch:{ all -> 0x0234 }
        L_0x0218:
            int r2 = r0.f310997d     // Catch:{ all -> 0x0234 }
            if (r2 < 0) goto L_0x0225
            int[] r5 = new int[r7]     // Catch:{ all -> 0x0234 }
            r5[r3] = r2     // Catch:{ all -> 0x0234 }
            android.opengl.GLES20.glDeleteTextures(r7, r5, r3)     // Catch:{ all -> 0x0234 }
            r0.f310997d = r4     // Catch:{ all -> 0x0234 }
        L_0x0225:
            int r2 = r0.f310996c     // Catch:{ all -> 0x0234 }
            if (r2 < 0) goto L_0x0232
            int[] r5 = new int[r7]     // Catch:{ all -> 0x0234 }
            r5[r3] = r2     // Catch:{ all -> 0x0234 }
            android.opengl.GLES20.glDeleteTextures(r7, r5, r3)     // Catch:{ all -> 0x0234 }
            r0.f310996c = r4     // Catch:{ all -> 0x0234 }
        L_0x0232:
            monitor-exit(r1)     // Catch:{ all -> 0x0234 }
            goto L_0x0237
        L_0x0234:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0234 }
            throw r0
        L_0x0237:
            javax.microedition.khronos.egl.EGL10 r0 = r14.f310986f
            if (r0 == 0) goto L_0x0259
            javax.microedition.khronos.egl.EGLContext r1 = r14.f310988h
            if (r1 == 0) goto L_0x0259
            javax.microedition.khronos.egl.EGLSurface r2 = r14.f310989i
            if (r2 == 0) goto L_0x0259
            javax.microedition.khronos.egl.EGLDisplay r2 = r14.f310987g
            r0.eglDestroyContext(r2, r1)
            javax.microedition.khronos.egl.EGL10 r0 = r14.f310986f
            javax.microedition.khronos.egl.EGLDisplay r1 = r14.f310987g
            javax.microedition.khronos.egl.EGLSurface r2 = r14.f310989i
            r0.eglDestroySurface(r1, r2)
            javax.microedition.khronos.egl.EGLContext r0 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            r14.f310988h = r0
            javax.microedition.khronos.egl.EGLSurface r0 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            r14.f310989i = r0
        L_0x0259:
            android.graphics.SurfaceTexture r0 = r14.f310984d
            if (r0 == 0) goto L_0x0260
            r0.release()
        L_0x0260:
            java.lang.String r0 = "MicroMsg.MMSightRecordTextureViewRenderThread"
            java.lang.String r1 = "finish render loop, finish destroy gl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.api.recordView.C104725c.run():void");
    }
}
