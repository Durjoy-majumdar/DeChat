package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import p333e8.C20528a;
import p333e8.C20551y;

public final class DummySurface extends Surface {

    /* renamed from: f */
    public static boolean f309030f;

    /* renamed from: g */
    public static boolean f309031g;

    /* renamed from: d */
    public final C104388b f309032d;

    /* renamed from: e */
    public boolean f309033e;

    /* renamed from: com.google.android.exoplayer2.video.DummySurface$b */
    public static class C104388b extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

        /* renamed from: d */
        public final int[] f309034d = new int[1];

        /* renamed from: e */
        public EGLDisplay f309035e;

        /* renamed from: f */
        public EGLContext f309036f;

        /* renamed from: g */
        public EGLSurface f309037g;

        /* renamed from: h */
        public Handler f309038h;

        /* renamed from: i */
        public SurfaceTexture f309039i;

        /* renamed from: j */
        public Error f309040j;

        /* renamed from: n */
        public RuntimeException f309041n;

        /* renamed from: o */
        public DummySurface f309042o;

        public C104388b() {
            super("dummySurface");
        }

        /* renamed from: a */
        public final void mo146090a(boolean z) {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.f309035e = eglGetDisplay;
            C20528a.m22241e(eglGetDisplay != null, "eglGetDisplay failed");
            int[] iArr = new int[2];
            C20528a.m22241e(EGL14.eglInitialize(this.f309035e, iArr, 0, iArr, 1), "eglInitialize failed");
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            C20528a.m22241e(EGL14.eglChooseConfig(this.f309035e, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eglCreateContext = EGL14.eglCreateContext(this.f309035e, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
            this.f309036f = eglCreateContext;
            C20528a.m22241e(eglCreateContext != null, "eglCreateContext failed");
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f309035e, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            this.f309037g = eglCreatePbufferSurface;
            C20528a.m22241e(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
            EGLDisplay eGLDisplay = this.f309035e;
            EGLSurface eGLSurface = this.f309037g;
            C20528a.m22241e(EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f309036f), "eglMakeCurrent failed");
            GLES20.glGenTextures(1, this.f309034d, 0);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f309034d[0]);
            this.f309039i = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            this.f309042o = new DummySurface(this, this.f309039i, z, (C104387a) null);
        }

        /* renamed from: b */
        public final void mo146091b() {
            try {
                SurfaceTexture surfaceTexture = this.f309039i;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, this.f309034d, 0);
                }
            } finally {
                EGLSurface eGLSurface = this.f309037g;
                if (eGLSurface != null) {
                    EGL14.eglDestroySurface(this.f309035e, eGLSurface);
                }
                EGLContext eGLContext = this.f309036f;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(this.f309035e, eGLContext);
                }
                this.f309037g = null;
                this.f309036f = null;
                this.f309035e = null;
                this.f309042o = null;
                this.f309039i = null;
            }
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    mo146090a(message.arg1 != 0);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    this.f309041n = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        this.f309040j = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i == 2) {
                this.f309039i.updateTexImage();
                return true;
            } else if (i != 3) {
                return true;
            } else {
                try {
                    mo146091b();
                } catch (Throwable unused) {
                }
                quit();
                return true;
            }
        }

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            this.f309038h.sendEmptyMessage(2);
        }
    }

    public DummySurface(C104388b bVar, SurfaceTexture surfaceTexture, boolean z, C104387a aVar) {
        super(surfaceTexture);
        this.f309032d = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m139412a(android.content.Context r7) {
        /*
            java.lang.Class<com.google.android.exoplayer2.video.DummySurface> r0 = com.google.android.exoplayer2.video.DummySurface.class
            monitor-enter(r0)
            boolean r1 = f309031g     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x004c
            int r1 = p333e8.C20551y.f57835a     // Catch:{ all -> 0x0050 }
            r2 = 0
            r3 = 24
            r4 = 1
            if (r1 < r3) goto L_0x0048
            android.opengl.EGLDisplay r5 = android.opengl.EGL14.eglGetDisplay(r2)     // Catch:{ all -> 0x0050 }
            r6 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r5 = android.opengl.EGL14.eglQueryString(r5, r6)     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x0044
            java.lang.String r6 = "EGL_EXT_protected_content"
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x0050 }
            if (r5 != 0) goto L_0x0024
            goto L_0x0044
        L_0x0024:
            if (r1 != r3) goto L_0x0031
            java.lang.String r3 = p333e8.C20551y.f57837c     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = "samsung"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x0031
            goto L_0x0044
        L_0x0031:
            r3 = 26
            if (r1 >= r3) goto L_0x0042
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r7 = r7.hasSystemFeature(r1)     // Catch:{ all -> 0x0050 }
            if (r7 != 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r7 = 1
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r7 == 0) goto L_0x0048
            r2 = 1
        L_0x0048:
            f309030f = r2     // Catch:{ all -> 0x0050 }
            f309031g = r4     // Catch:{ all -> 0x0050 }
        L_0x004c:
            boolean r7 = f309030f     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)
            return r7
        L_0x0050:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.DummySurface.m139412a(android.content.Context):boolean");
    }

    /* renamed from: b */
    public static DummySurface m139413b(Context context, boolean z) {
        if (C20551y.f57835a >= 17) {
            boolean z2 = false;
            C20528a.m22240d(!z || m139412a(context));
            C104388b bVar = new C104388b();
            bVar.start();
            bVar.f309038h = new Handler(bVar.getLooper(), bVar);
            synchronized (bVar) {
                bVar.f309038h.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
                while (bVar.f309042o == null && bVar.f309041n == null && bVar.f309040j == null) {
                    try {
                        bVar.wait();
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = bVar.f309041n;
            if (runtimeException == null) {
                Error error = bVar.f309040j;
                if (error == null) {
                    return bVar.f309042o;
                }
                throw error;
            }
            throw runtimeException;
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    public void release() {
        super.release();
        synchronized (this.f309032d) {
            if (!this.f309033e) {
                this.f309032d.f309038h.sendEmptyMessage(3);
                this.f309033e = true;
            }
        }
    }
}
