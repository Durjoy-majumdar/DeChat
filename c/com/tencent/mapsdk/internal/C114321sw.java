package com.tencent.mapsdk.internal;

import android.opengl.GLUtils;
import android.os.SystemClock;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;

/* renamed from: com.tencent.mapsdk.internal.sw */
public final class C114321sw extends Thread {

    /* renamed from: e */
    private static float f342497e = 60.0f;

    /* renamed from: n */
    private static final int f342498n = 12440;

    /* renamed from: o */
    private static final int f342499o = 4;

    /* renamed from: q */
    private static int f342500q = 2000;

    /* renamed from: t */
    private static long f342501t = 1500;

    /* renamed from: u */
    private static final String f342502u = "TextureGLRenderThread";

    /* renamed from: a */
    public boolean f342503a;

    /* renamed from: b */
    private WeakReference<C114322sx> f342504b;

    /* renamed from: c */
    private AtomicBoolean f342505c = new AtomicBoolean(true);

    /* renamed from: d */
    private AtomicBoolean f342506d = new AtomicBoolean(false);

    /* renamed from: f */
    private WeakReference<Object> f342507f;

    /* renamed from: g */
    private volatile boolean f342508g = false;

    /* renamed from: h */
    private EGLConfig f342509h = null;

    /* renamed from: i */
    private EGL10 f342510i;

    /* renamed from: j */
    private EGLDisplay f342511j = EGL10.EGL_NO_DISPLAY;

    /* renamed from: k */
    private EGLContext f342512k = EGL10.EGL_NO_CONTEXT;

    /* renamed from: l */
    private EGLSurface f342513l = EGL10.EGL_NO_SURFACE;

    /* renamed from: m */
    private GL f342514m;

    /* renamed from: p */
    private long f342515p;

    /* renamed from: r */
    private volatile long f342516r = 0;

    /* renamed from: s */
    private boolean f342517s = false;

    public C114321sw(C114322sx sxVar) {
        this.f342504b = new WeakReference<>(sxVar);
        setName(C114342tg.m160370a("TR"));
    }

    /* renamed from: e */
    private boolean m160152e() {
        try {
            WeakReference<Object> weakReference = this.f342507f;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    Object obj = this.f342507f.get();
                    EGL10 egl10 = (EGL10) EGLContext.getEGL();
                    this.f342510i = egl10;
                    EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                    this.f342511j = eglGetDisplay;
                    if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                        C113889km.m157553d(f342502u, "eglGetdisplay failed,mEglDisplay == EGL10.EGL_NO_DISPLAY,errorDetail:" + GLUtils.getEGLErrorString(this.f342510i.eglGetError()));
                        return false;
                    }
                    if (!this.f342510i.eglInitialize(eglGetDisplay, new int[2])) {
                        C113889km.m157553d(f342502u, "eglInitialize failed,errorDetail:" + GLUtils.getEGLErrorString(this.f342510i.eglGetError()));
                        return false;
                    }
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f342510i.eglChooseConfig(this.f342511j, this.f342503a ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 8, 12338, 1, 12337, 4, 12352, 4, 12344} : new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 8, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
                        C113889km.m157553d(f342502u, "eglChooseConfig failed,errorDetail:" + GLUtils.getEGLErrorString(this.f342510i.eglGetError()));
                        return false;
                    }
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.f342509h = eGLConfig;
                    EGLSurface eglCreateWindowSurface = this.f342510i.eglCreateWindowSurface(this.f342511j, eGLConfig, obj, (int[]) null);
                    this.f342513l = eglCreateWindowSurface;
                    if (eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                        C113889km.m157553d(f342502u, "eglCreateWindowSurface failed,mEglSurface == EGL10.EGL_NO_SURFACE,errorDetail:" + GLUtils.getEGLErrorString(this.f342510i.eglGetError()));
                        return false;
                    }
                    EGLContext eglCreateContext = this.f342510i.eglCreateContext(this.f342511j, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, new int[]{f342498n, 2, 12344});
                    this.f342512k = eglCreateContext;
                    if (eglCreateContext == EGL10.EGL_NO_CONTEXT) {
                        C113889km.m157553d(f342502u, "eglCreateContext failed,mEglContext == EGL10.EGL_NO_CONTEXT,errorDetail:" + GLUtils.getEGLErrorString(this.f342510i.eglGetError()));
                        return false;
                    }
                    EGL10 egl102 = this.f342510i;
                    EGLDisplay eGLDisplay = this.f342511j;
                    EGLSurface eGLSurface = this.f342513l;
                    if (!egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eglCreateContext)) {
                        C113889km.m157553d(f342502u, "eglMakeCurrent failed,errorDetail:" + GLUtils.getEGLErrorString(this.f342510i.eglGetError()));
                        return false;
                    }
                    this.f342514m = this.f342512k.getGL();
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C113889km.m157553d(f342502u, "initializeGLContext failed,errorDetail:" + Log.getStackTraceString(th));
        }
    }

    /* renamed from: f */
    private void m160153f() {
        while (this.f342505c.get() && !this.f342506d.get() && SystemClock.elapsedRealtime() - this.f342515p <= ((long) f342500q)) {
            m160154g();
            try {
                WeakReference<Object> weakReference = this.f342507f;
                if (weakReference == null) {
                    return;
                }
                if (weakReference.get() != null) {
                    EGLSurface eglCreateWindowSurface = this.f342510i.eglCreateWindowSurface(this.f342511j, this.f342509h, this.f342507f.get(), (int[]) null);
                    this.f342513l = eglCreateWindowSurface;
                    if (eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                        C113889km.m157553d(f342502u, "eglCreateWindowSurface failed,errorDetail:" + GLUtils.getEGLErrorString(this.f342510i.eglGetError()));
                    } else if (!this.f342510i.eglMakeCurrent(this.f342511j, eglCreateWindowSurface, eglCreateWindowSurface, this.f342512k)) {
                        C113889km.m157553d(f342502u, "eglMakeCurrent failed,errorDetail:" + GLUtils.getEGLErrorString(this.f342510i.eglGetError()));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                C113889km.m157553d(f342502u, "updateSurface failed,errorDetail:" + Log.getStackTraceString(th));
            }
        }
    }

    /* renamed from: g */
    private void m160154g() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f342513l;
        if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            C113889km.m157553d(C0949kl.f2242l, "the EglSurface is null or status is EGL_NO_SURFACE");
            return;
        }
        this.f342510i.eglMakeCurrent(this.f342511j, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        this.f342510i.eglDestroySurface(this.f342511j, this.f342513l);
        this.f342513l = EGL10.EGL_NO_SURFACE;
    }

    /* renamed from: h */
    private void m160155h() {
        EGLContext eGLContext = this.f342512k;
        if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
            C113889km.m157553d(C0949kl.f2242l, "the EglContext is null or status is EGL_NO_CONTEXT");
            return;
        }
        this.f342510i.eglDestroyContext(this.f342511j, eGLContext);
        this.f342512k = EGL10.EGL_NO_CONTEXT;
    }

    /* renamed from: i */
    private void m160156i() {
        EGLDisplay eGLDisplay = this.f342511j;
        if (eGLDisplay == null || eGLDisplay == EGL10.EGL_NO_DISPLAY) {
            C113889km.m157553d(C0949kl.f2242l, "the EglDisplay is null or status is EGL_NO_DISPLAY");
            return;
        }
        this.f342510i.eglTerminate(eGLDisplay);
        this.f342511j = EGL10.EGL_NO_DISPLAY;
    }

    /* renamed from: j */
    private void m160157j() {
        m160154g();
        EGLContext eGLContext = this.f342512k;
        if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
            C113889km.m157553d(C0949kl.f2242l, "the EglContext is null or status is EGL_NO_CONTEXT");
        } else {
            this.f342510i.eglDestroyContext(this.f342511j, eGLContext);
            this.f342512k = EGL10.EGL_NO_CONTEXT;
        }
        EGLDisplay eGLDisplay = this.f342511j;
        if (eGLDisplay == null || eGLDisplay == EGL10.EGL_NO_DISPLAY) {
            C113889km.m157553d(C0949kl.f2242l, "the EglDisplay is null or status is EGL_NO_DISPLAY");
            return;
        }
        this.f342510i.eglTerminate(eGLDisplay);
        this.f342511j = EGL10.EGL_NO_DISPLAY;
    }

    /* renamed from: a */
    public final void mo172968a() {
        this.f342506d.set(true);
        synchronized (this) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void mo172970b() {
        this.f342506d.set(false);
        synchronized (this) {
            notifyAll();
        }
    }

    /* renamed from: c */
    public final void mo172971c() {
        this.f342505c.set(false);
        this.f342506d.set(false);
        synchronized (this) {
            notifyAll();
        }
        interrupt();
    }

    /* renamed from: d */
    public final void mo172972d() {
        this.f342517s = true;
        this.f342516r = SystemClock.elapsedRealtime();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r8 = this;
            super.run()
            java.lang.ref.WeakReference<com.tencent.mapsdk.internal.sx> r0 = r8.f342504b
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.tencent.mapsdk.internal.sx> r0 = r8.f342504b
            java.lang.Object r0 = r0.get()
            com.tencent.mapsdk.internal.sx r0 = (com.tencent.mapsdk.internal.C114322sx) r0
            r0.mo171540D()
        L_0x0018:
            r0 = 0
            r1 = 0
        L_0x001a:
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f342505c
            boolean r2 = r2.get()
            r3 = 0
            if (r2 == 0) goto L_0x01a3
        L_0x0023:
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f342505c
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x0040
            java.lang.ref.WeakReference<java.lang.Object> r2 = r8.f342507f
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0040
        L_0x0035:
            monitor-enter(r8)
            r8.wait()     // Catch:{ InterruptedException -> 0x003c }
            goto L_0x003c
        L_0x003a:
            r0 = move-exception
            goto L_0x003e
        L_0x003c:
            monitor-exit(r8)     // Catch:{ all -> 0x003a }
            goto L_0x0023
        L_0x003e:
            monitor-exit(r8)     // Catch:{ all -> 0x003a }
            throw r0
        L_0x0040:
            if (r1 != 0) goto L_0x0046
            boolean r1 = r8.m160152e()
        L_0x0046:
            if (r1 == 0) goto L_0x001a
            monitor-enter(r8)     // Catch:{ all -> 0x017d }
        L_0x0049:
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f342505c     // Catch:{ all -> 0x017a }
            boolean r2 = r2.get()     // Catch:{ all -> 0x017a }
            if (r2 == 0) goto L_0x005d
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f342506d     // Catch:{ all -> 0x017a }
            boolean r2 = r2.get()     // Catch:{ all -> 0x017a }
            if (r2 == 0) goto L_0x005d
            r8.wait()     // Catch:{ all -> 0x017a }
            goto L_0x0049
        L_0x005d:
            monitor-exit(r8)     // Catch:{ all -> 0x017a }
            boolean r2 = r8.f342508g     // Catch:{ all -> 0x017d }
            if (r2 == 0) goto L_0x0116
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x017d }
            r8.f342515p = r4     // Catch:{ all -> 0x017d }
        L_0x0068:
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f342505c     // Catch:{ all -> 0x017d }
            boolean r2 = r2.get()     // Catch:{ all -> 0x017d }
            if (r2 == 0) goto L_0x010e
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f342506d     // Catch:{ all -> 0x017d }
            boolean r2 = r2.get()     // Catch:{ all -> 0x017d }
            if (r2 != 0) goto L_0x010e
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x017d }
            long r6 = r8.f342515p     // Catch:{ all -> 0x017d }
            long r4 = r4 - r6
            int r2 = f342500q     // Catch:{ all -> 0x017d }
            long r6 = (long) r2     // Catch:{ all -> 0x017d }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x010e
            r8.m160154g()     // Catch:{ all -> 0x017d }
            java.lang.ref.WeakReference<java.lang.Object> r2 = r8.f342507f     // Catch:{ all -> 0x00f4 }
            if (r2 == 0) goto L_0x010e
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00f4 }
            if (r2 != 0) goto L_0x0095
            goto L_0x010e
        L_0x0095:
            javax.microedition.khronos.egl.EGL10 r2 = r8.f342510i     // Catch:{ all -> 0x00f4 }
            javax.microedition.khronos.egl.EGLDisplay r4 = r8.f342511j     // Catch:{ all -> 0x00f4 }
            javax.microedition.khronos.egl.EGLConfig r5 = r8.f342509h     // Catch:{ all -> 0x00f4 }
            java.lang.ref.WeakReference<java.lang.Object> r6 = r8.f342507f     // Catch:{ all -> 0x00f4 }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x00f4 }
            javax.microedition.khronos.egl.EGLSurface r2 = r2.eglCreateWindowSurface(r4, r5, r6, r3)     // Catch:{ all -> 0x00f4 }
            r8.f342513l = r2     // Catch:{ all -> 0x00f4 }
            javax.microedition.khronos.egl.EGLSurface r4 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch:{ all -> 0x00f4 }
            if (r2 != r4) goto L_0x00c9
            java.lang.String r2 = "TextureGLRenderThread"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f4 }
            java.lang.String r5 = "eglCreateWindowSurface failed,errorDetail:"
            r4.<init>(r5)     // Catch:{ all -> 0x00f4 }
            javax.microedition.khronos.egl.EGL10 r5 = r8.f342510i     // Catch:{ all -> 0x00f4 }
            int r5 = r5.eglGetError()     // Catch:{ all -> 0x00f4 }
            java.lang.String r5 = android.opengl.GLUtils.getEGLErrorString(r5)     // Catch:{ all -> 0x00f4 }
            r4.append(r5)     // Catch:{ all -> 0x00f4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00f4 }
            com.tencent.mapsdk.internal.C113889km.m157553d((java.lang.String) r2, (java.lang.String) r4)     // Catch:{ all -> 0x00f4 }
            goto L_0x0068
        L_0x00c9:
            javax.microedition.khronos.egl.EGL10 r4 = r8.f342510i     // Catch:{ all -> 0x00f4 }
            javax.microedition.khronos.egl.EGLDisplay r5 = r8.f342511j     // Catch:{ all -> 0x00f4 }
            javax.microedition.khronos.egl.EGLContext r6 = r8.f342512k     // Catch:{ all -> 0x00f4 }
            boolean r2 = r4.eglMakeCurrent(r5, r2, r2, r6)     // Catch:{ all -> 0x00f4 }
            if (r2 != 0) goto L_0x010e
            java.lang.String r2 = "TextureGLRenderThread"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f4 }
            java.lang.String r5 = "eglMakeCurrent failed,errorDetail:"
            r4.<init>(r5)     // Catch:{ all -> 0x00f4 }
            javax.microedition.khronos.egl.EGL10 r5 = r8.f342510i     // Catch:{ all -> 0x00f4 }
            int r5 = r5.eglGetError()     // Catch:{ all -> 0x00f4 }
            java.lang.String r5 = android.opengl.GLUtils.getEGLErrorString(r5)     // Catch:{ all -> 0x00f4 }
            r4.append(r5)     // Catch:{ all -> 0x00f4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00f4 }
            com.tencent.mapsdk.internal.C113889km.m157553d((java.lang.String) r2, (java.lang.String) r4)     // Catch:{ all -> 0x00f4 }
            goto L_0x0068
        L_0x00f4:
            r2 = move-exception
            java.lang.String r4 = "TextureGLRenderThread"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x017d }
            java.lang.String r6 = "updateSurface failed,errorDetail:"
            r5.<init>(r6)     // Catch:{ all -> 0x017d }
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)     // Catch:{ all -> 0x017d }
            r5.append(r2)     // Catch:{ all -> 0x017d }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x017d }
            com.tencent.mapsdk.internal.C113889km.m157553d((java.lang.String) r4, (java.lang.String) r2)     // Catch:{ all -> 0x017d }
            goto L_0x0068
        L_0x010e:
            r2 = 1
            r8.f342517s = r2     // Catch:{ all -> 0x017d }
            r8.f342508g = r0     // Catch:{ all -> 0x017d }
            r8.mo172972d()     // Catch:{ all -> 0x017d }
        L_0x0116:
            java.lang.ref.WeakReference<com.tencent.mapsdk.internal.sx> r2 = r8.f342504b     // Catch:{ all -> 0x017d }
            if (r2 == 0) goto L_0x001a
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x017d }
            if (r2 == 0) goto L_0x001a
            java.lang.ref.WeakReference<com.tencent.mapsdk.internal.sx> r2 = r8.f342504b     // Catch:{ all -> 0x017d }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x017d }
            com.tencent.mapsdk.internal.sx r2 = (com.tencent.mapsdk.internal.C114322sx) r2     // Catch:{ all -> 0x017d }
            boolean r3 = r8.f342517s     // Catch:{ all -> 0x017d }
            if (r3 == 0) goto L_0x013f
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x017d }
            long r5 = r8.f342516r     // Catch:{ all -> 0x017d }
            long r3 = r3 - r5
            long r5 = f342501t     // Catch:{ all -> 0x017d }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x013f
            if (r2 == 0) goto L_0x0145
            r2.mo171544H()     // Catch:{ all -> 0x017d }
            goto L_0x0145
        L_0x013f:
            r8.f342517s = r0     // Catch:{ all -> 0x017d }
            r3 = 0
            r8.f342516r = r3     // Catch:{ all -> 0x017d }
        L_0x0145:
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x017d }
            if (r2 == 0) goto L_0x015e
            javax.microedition.khronos.opengles.GL r5 = r8.f342514m     // Catch:{ all -> 0x017d }
            javax.microedition.khronos.opengles.GL10 r5 = (javax.microedition.khronos.opengles.GL10) r5     // Catch:{ all -> 0x017d }
            boolean r2 = r2.mo172983a((javax.microedition.khronos.opengles.GL10) r5)     // Catch:{ all -> 0x017d }
            if (r2 == 0) goto L_0x015e
            javax.microedition.khronos.egl.EGL10 r2 = r8.f342510i     // Catch:{ all -> 0x017d }
            javax.microedition.khronos.egl.EGLDisplay r5 = r8.f342511j     // Catch:{ all -> 0x017d }
            javax.microedition.khronos.egl.EGLSurface r6 = r8.f342513l     // Catch:{ all -> 0x017d }
            r2.eglSwapBuffers(r5, r6)     // Catch:{ all -> 0x017d }
        L_0x015e:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x017d }
            long r5 = r5 - r3
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r3 = f342497e     // Catch:{ all -> 0x017d }
            float r2 = r2 / r3
            float r3 = (float) r5     // Catch:{ all -> 0x017d }
            float r2 = r2 - r3
            int r2 = (int) r2     // Catch:{ all -> 0x017d }
            if (r2 <= 0) goto L_0x001a
            monitor-enter(r8)     // Catch:{ all -> 0x017d }
            long r2 = (long) r2
            r8.wait(r2)     // Catch:{ InterruptedException -> 0x0175 }
            goto L_0x0175
        L_0x0173:
            r2 = move-exception
            goto L_0x0178
        L_0x0175:
            monitor-exit(r8)     // Catch:{ all -> 0x0173 }
            goto L_0x001a
        L_0x0178:
            monitor-exit(r8)     // Catch:{ all -> 0x0173 }
            throw r2     // Catch:{ all -> 0x017d }
        L_0x017a:
            r2 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x017a }
            throw r2     // Catch:{ all -> 0x017d }
        L_0x017d:
            r2 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r3 = r8.f342505c
            boolean r3 = r3.get()
            if (r3 != 0) goto L_0x018a
            boolean r3 = r2 instanceof java.lang.InterruptedException
            if (r3 != 0) goto L_0x001a
        L_0x018a:
            java.lang.String r3 = "TextureGLRenderThread"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "TextureGLRenderThread Render Exception:"
            r4.<init>(r5)
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.mapsdk.internal.C113889km.m157553d((java.lang.String) r3, (java.lang.String) r2)
            goto L_0x001a
        L_0x01a3:
            java.lang.ref.WeakReference<com.tencent.mapsdk.internal.sx> r0 = r8.f342504b
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x01ba
            java.lang.ref.WeakReference<com.tencent.mapsdk.internal.sx> r0 = r8.f342504b
            java.lang.Object r0 = r0.get()
            com.tencent.mapsdk.internal.sx r0 = (com.tencent.mapsdk.internal.C114322sx) r0
            r0.mo171541E()
            r8.f342504b = r3
        L_0x01ba:
            r8.m160154g()
            javax.microedition.khronos.egl.EGLContext r0 = r8.f342512k
            if (r0 == 0) goto L_0x01d2
            javax.microedition.khronos.egl.EGLContext r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r0 != r1) goto L_0x01c6
            goto L_0x01d2
        L_0x01c6:
            javax.microedition.khronos.egl.EGL10 r1 = r8.f342510i
            javax.microedition.khronos.egl.EGLDisplay r2 = r8.f342511j
            r1.eglDestroyContext(r2, r0)
            javax.microedition.khronos.egl.EGLContext r0 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            r8.f342512k = r0
            goto L_0x01d9
        L_0x01d2:
            java.lang.String r0 = "TRD"
            java.lang.String r1 = "the EglContext is null or status is EGL_NO_CONTEXT"
            com.tencent.mapsdk.internal.C113889km.m157553d((java.lang.String) r0, (java.lang.String) r1)
        L_0x01d9:
            javax.microedition.khronos.egl.EGLDisplay r0 = r8.f342511j
            if (r0 == 0) goto L_0x01ec
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            if (r0 != r1) goto L_0x01e2
            goto L_0x01ec
        L_0x01e2:
            javax.microedition.khronos.egl.EGL10 r1 = r8.f342510i
            r1.eglTerminate(r0)
            javax.microedition.khronos.egl.EGLDisplay r0 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r8.f342511j = r0
            return
        L_0x01ec:
            java.lang.String r0 = "TRD"
            java.lang.String r1 = "the EglDisplay is null or status is EGL_NO_DISPLAY"
            com.tencent.mapsdk.internal.C113889km.m157553d((java.lang.String) r0, (java.lang.String) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114321sw.run():void");
    }

    /* renamed from: a */
    public final void mo172969a(Object obj) {
        WeakReference<Object> weakReference = this.f342507f;
        if (!(weakReference == null || weakReference.get() == null)) {
            this.f342508g = true;
        }
        this.f342507f = new WeakReference<>(obj);
        synchronized (this) {
            notifyAll();
        }
    }

    /* renamed from: a */
    public static void m160150a(float f) {
        if (f <= 0.0f) {
            C113889km.m157558e(C0949kl.f2242l, "帧率设置不在有效值范围内");
        } else {
            f342497e = f;
        }
    }

    /* renamed from: a */
    private void m160151a(boolean z) {
        this.f342503a = z;
    }
}
