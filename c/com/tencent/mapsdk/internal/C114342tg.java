package com.tencent.mapsdk.internal;

import android.content.Context;
import android.opengl.GLDebugHelper;
import android.opengl.GLUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.tg */
public class C114342tg extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: a */
    public static final String f342673a = "tms-gl";

    /* renamed from: b */
    public static final int f342674b = 0;

    /* renamed from: c */
    public static final int f342675c = 1;

    /* renamed from: d */
    public static final int f342676d = 1;

    /* renamed from: e */
    public static final int f342677e = 2;

    /* renamed from: f */
    public static final int f342678f = 60;

    /* renamed from: i */
    private static final String f342679i = "GLSurfaceView";

    /* renamed from: j */
    private static final boolean f342680j = false;

    /* renamed from: k */
    private static final boolean f342681k = false;

    /* renamed from: l */
    private static final boolean f342682l = false;

    /* renamed from: m */
    private static final boolean f342683m = false;

    /* renamed from: n */
    private static final boolean f342684n = false;

    /* renamed from: o */
    private static final boolean f342685o = true;

    /* renamed from: p */
    private static final boolean f342686p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final C114352j f342687q = new C114352j((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f342688A;

    /* renamed from: g */
    public boolean f342689g;

    /* renamed from: h */
    public C114351i f342690h;

    /* renamed from: r */
    private final WeakReference<C114342tg> f342691r = new WeakReference<>(this);
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C114354m f342692s;

    /* renamed from: t */
    private boolean f342693t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C114347e f342694u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C114348f f342695v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C114349g f342696w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C114353k f342697x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f342698y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f342699z;

    /* renamed from: com.tencent.mapsdk.internal.tg$l */
    public static class C80355l extends Writer {

        /* renamed from: a */
        private StringBuilder f235227a = new StringBuilder();

        /* renamed from: a */
        private void m97919a() {
            if (this.f235227a.length() > 0) {
                this.f235227a.toString();
                StringBuilder sb = this.f235227a;
                sb.delete(0, sb.length());
            }
        }

        public final void close() {
            m97919a();
        }

        public final void flush() {
            m97919a();
        }

        public final void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == 10) {
                    m97919a();
                } else {
                    this.f235227a.append(c);
                }
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tg$d */
    public static class C114346d implements C114349g {
        private C114346d() {
        }

        public /* synthetic */ C114346d(byte b) {
            this();
        }

        /* renamed from: a */
        public final EGLSurface mo173030a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, (int[]) null);
            } catch (IllegalArgumentException | OutOfMemoryError unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final void mo173031a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tg$e */
    public interface C114347e {
        /* renamed from: a */
        EGLConfig mo173026a(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* renamed from: com.tencent.mapsdk.internal.tg$f */
    public interface C114348f {
        /* renamed from: a */
        EGLContext mo173028a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        /* renamed from: a */
        void mo173029a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* renamed from: com.tencent.mapsdk.internal.tg$g */
    public interface C114349g {
        /* renamed from: a */
        EGLSurface mo173030a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        /* renamed from: a */
        void mo173031a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* renamed from: com.tencent.mapsdk.internal.tg$i */
    public static class C114351i extends Thread {

        /* renamed from: a */
        public boolean f342718a;

        /* renamed from: b */
        public boolean f342719b;

        /* renamed from: c */
        public boolean f342720c;

        /* renamed from: d */
        public boolean f342721d;

        /* renamed from: e */
        public boolean f342722e;

        /* renamed from: f */
        public boolean f342723f;

        /* renamed from: g */
        public boolean f342724g;

        /* renamed from: h */
        public boolean f342725h;

        /* renamed from: i */
        public int f342726i = 0;

        /* renamed from: j */
        public int f342727j = 0;

        /* renamed from: k */
        public int f342728k = 1;

        /* renamed from: l */
        public boolean f342729l = true;

        /* renamed from: m */
        public boolean f342730m;

        /* renamed from: n */
        public ArrayList<Runnable> f342731n = new ArrayList<>();

        /* renamed from: o */
        public boolean f342732o = true;

        /* renamed from: p */
        private long f342733p;

        /* renamed from: q */
        private boolean f342734q;

        /* renamed from: r */
        private boolean f342735r;

        /* renamed from: s */
        private boolean f342736s;

        /* renamed from: t */
        private float f342737t = 60.0f;

        /* renamed from: u */
        private C114350h f342738u;

        /* renamed from: v */
        private WeakReference<C114342tg> f342739v;

        public C114351i(WeakReference<C114342tg> weakReference) {
            this.f342739v = weakReference;
            setName(C114342tg.m160370a("SV"));
        }

        /* renamed from: g */
        private void m160421g() {
            if (this.f342723f) {
                this.f342723f = false;
                this.f342738u.mo173032a();
            }
        }

        /* renamed from: h */
        private void m160422h() {
            if (this.f342722e) {
                this.f342738u.mo173033b();
                this.f342722e = false;
                C114342tg.f342687q.mo173047c(this);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
            r2 = com.tencent.mapsdk.internal.C114342tg.m160381g();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x01f5, code lost:
            if (r7 == null) goto L_0x0200;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
            r7.run();
            r3 = r17;
            r7 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x0200, code lost:
            if (r6 == false) goto L_0x02b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x0202, code lost:
            r0 = r1.f342738u;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x0206, code lost:
            if (r0.f342713b == null) goto L_0x02ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x020a, code lost:
            if (r0.f342714c == null) goto L_0x02a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x020e, code lost:
            if (r0.f342716e == null) goto L_0x029d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x0210, code lost:
            r0.mo173032a();
            r2 = r0.f342712a.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x021b, code lost:
            if (r2 == null) goto L_0x0237;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x021d, code lost:
            r18 = r4;
            r19 = r5;
            r0.f342715d = com.tencent.mapsdk.internal.C114342tg.m160376e(r2).mo173030a(r0.f342713b, r0.f342714c, r0.f342716e, r2.getHolder());
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x0237, code lost:
            r18 = r4;
            r19 = r5;
            r3 = null;
            r0.f342715d = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x023e, code lost:
            r2 = r0.f342715d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x0240, code lost:
            if (r2 == null) goto L_0x0262;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0244, code lost:
            if (r2 != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) goto L_0x0247;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x0251, code lost:
            if (r0.f342713b.eglMakeCurrent(r0.f342714c, r2, r2, r0.f342717f) != false) goto L_0x0260;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x0253, code lost:
            r0.f342713b.eglGetError();
            com.tencent.mapsdk.internal.C114342tg.C114350h.m160407a("EGLHelper", "eglMakeCurrent");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x0260, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x0262, code lost:
            r0 = r0.f342713b.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x026a, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x026b, code lost:
            if (r0 == false) goto L_0x0282;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            m160421g();
            m160422h();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x026d, code lost:
            r2 = com.tencent.mapsdk.internal.C114342tg.m160381g();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x0271, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
            r1.f342724g = true;
            com.tencent.mapsdk.internal.C114342tg.m160381g().notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x027c, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x027d, code lost:
            r6 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x0282, code lost:
            r2 = com.tencent.mapsdk.internal.C114342tg.m160381g();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x0286, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
            r1.f342724g = true;
            r1.f342736s = true;
            com.tencent.mapsdk.internal.C114342tg.m160381g().notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0293, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0294, code lost:
            r3 = r17;
            r4 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x02a4, code lost:
            throw new java.lang.RuntimeException("mEglConfig not initialized");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x02ac, code lost:
            throw new java.lang.RuntimeException("eglDisplay not initialized");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x02b4, code lost:
            throw new java.lang.RuntimeException("egl not initialized");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x02b5, code lost:
            r18 = r4;
            r19 = r5;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x02ba, code lost:
            if (r10 == false) goto L_0x030d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x02bc, code lost:
            r0 = r1.f342738u;
            r2 = r0.f342717f.getGL();
            r0 = r0.f342712a.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x02cc, code lost:
            if (r0 == null) goto L_0x0302;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x02d2, code lost:
            if (com.tencent.mapsdk.internal.C114342tg.m160378f(r0) == null) goto L_0x02dc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x02d4, code lost:
            r2 = com.tencent.mapsdk.internal.C114342tg.m160378f(r0).mo173048a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x02e2, code lost:
            if ((com.tencent.mapsdk.internal.C114342tg.m160380g(r0) & 3) == 0) goto L_0x0302;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x02ea, code lost:
            if ((com.tencent.mapsdk.internal.C114342tg.m160380g(r0) & 1) == 0) goto L_0x02ee;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x02ec, code lost:
            r4 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x02ee, code lost:
            r4 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x02f5, code lost:
            if ((com.tencent.mapsdk.internal.C114342tg.m160380g(r0) & 2) == 0) goto L_0x02fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x02f7, code lost:
            r0 = new com.tencent.mapsdk.internal.C114342tg.C80355l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x02fd, code lost:
            r0 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x02fe, code lost:
            r2 = android.opengl.GLDebugHelper.wrap(r2, r4, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x0302, code lost:
            r2 = (javax.microedition.khronos.opengles.GL10) r2;
            com.tencent.mapsdk.internal.C114342tg.m160381g().mo173043a(r2);
            r8 = r2;
            r10 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x030d, code lost:
            if (r9 == false) goto L_0x0325;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x030f, code lost:
            r0 = r1.f342739v.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x0317, code lost:
            if (r0 == null) goto L_0x0324;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x0319, code lost:
            com.tencent.mapsdk.internal.C114342tg.m160382h(r0).mo172980a(r8, r1.f342738u.f342716e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x0324, code lost:
            r9 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x0325, code lost:
            if (r11 == false) goto L_0x0339;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x0327, code lost:
            r0 = r1.f342739v.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:0x032f, code lost:
            if (r0 == null) goto L_0x0338;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x0331, code lost:
            com.tencent.mapsdk.internal.C114342tg.m160382h(r0).mo172979a(r8, r12, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x0338, code lost:
            r11 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x033f, code lost:
            if (r1.f342733p == 0) goto L_0x0344;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x0341, code lost:
            android.os.SystemClock.elapsedRealtime();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x0344, code lost:
            r1.f342733p = android.os.SystemClock.elapsedRealtime();
            r4 = android.os.SystemClock.elapsedRealtime();
            r0 = r1.f342739v.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0356, code lost:
            if (r0 == null) goto L_0x0361;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x0358, code lost:
            r0 = com.tencent.mapsdk.internal.C114342tg.m160382h(r0).mo172983a(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x0361, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x0362, code lost:
            r4 = android.os.SystemClock.elapsedRealtime() - r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0368, code lost:
            if (r0 == false) goto L_0x03a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x036a, code lost:
            r0 = r1.f342738u;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x0378, code lost:
            if (r0.f342713b.eglSwapBuffers(r0.f342714c, r0.f342715d) != false) goto L_0x0381;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x037a, code lost:
            r0 = r0.f342713b.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x0381, code lost:
            r0 = 12288;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x0383, code lost:
            if (r0 == 12288) goto L_0x03a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x0387, code lost:
            if (r0 == 12302) goto L_0x03a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x0389, code lost:
            com.tencent.mapsdk.internal.C114342tg.C114350h.m160407a(com.tencent.mapsdk.internal.C114342tg.f342673a, "eglSwapBuffers");
            r2 = com.tencent.mapsdk.internal.C114342tg.m160381g();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x0394, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x0395, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
            r1.f342736s = true;
            com.tencent.mapsdk.internal.C114342tg.m160381g().notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x039f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x03a4, code lost:
            r0 = true;
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x03a7, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x03a8, code lost:
            r3 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x03aa, code lost:
            if (r14 == false) goto L_0x03ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:239:0x03ad, code lost:
            r0 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x03af, code lost:
            r2 = (int) ((1000.0f / r1.f342737t) - ((float) r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:241:0x03b7, code lost:
            if (r2 <= 0) goto L_0x03c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x03b9, code lost:
            monitor-enter(r20);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
            wait((long) r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
            monitor-exit(r20);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:253:0x03c5, code lost:
            r4 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:254:0x03c6, code lost:
            r5 = r19;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x01ac */
        /* JADX WARNING: Missing exception handler attribute for start block: B:247:0x03c1 */
        /* JADX WARNING: Removed duplicated region for block: B:293:0x01d5 A[SYNTHETIC] */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m160423i() {
            /*
                r20 = this;
                r1 = r20
                com.tencent.mapsdk.internal.tg$h r0 = new com.tencent.mapsdk.internal.tg$h
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r2 = r1.f342739v
                r0.<init>(r2)
                r1.f342738u = r0
                r0 = 0
                r1.f342722e = r0
                r1.f342723f = r0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
            L_0x001c:
                com.tencent.mapsdk.internal.tg$j r15 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                monitor-enter(r15)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
            L_0x0021:
                boolean r2 = r1.f342734q     // Catch:{ all -> 0x03dd }
                if (r2 == 0) goto L_0x0047
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r0 = r1.f342739v     // Catch:{ all -> 0x03dd }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x03dd }
                com.tencent.mapsdk.internal.tg r0 = (com.tencent.mapsdk.internal.C114342tg) r0     // Catch:{ all -> 0x03dd }
                if (r0 == 0) goto L_0x0036
                com.tencent.mapsdk.internal.tg$m r0 = r0.f342692s     // Catch:{ all -> 0x03dd }
                r0.mo172975T()     // Catch:{ all -> 0x03dd }
            L_0x0036:
                monitor-exit(r15)     // Catch:{ all -> 0x03dd }
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q
                monitor-enter(r2)
                r20.m160421g()     // Catch:{ all -> 0x0044 }
                r20.m160422h()     // Catch:{ all -> 0x0044 }
                monitor-exit(r2)     // Catch:{ all -> 0x0044 }
                return
            L_0x0044:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0044 }
                throw r0
            L_0x0047:
                java.util.ArrayList<java.lang.Runnable> r2 = r1.f342731n     // Catch:{ all -> 0x03dd }
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x03dd }
                if (r2 != 0) goto L_0x005e
                java.util.ArrayList<java.lang.Runnable> r2 = r1.f342731n     // Catch:{ all -> 0x03dd }
                r7 = 0
                java.lang.Object r2 = r2.remove(r7)     // Catch:{ all -> 0x03dd }
                r7 = r2
                java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch:{ all -> 0x03dd }
                r17 = r3
                r3 = 0
                goto L_0x01f4
            L_0x005e:
                boolean r2 = r1.f342719b     // Catch:{ all -> 0x03dd }
                boolean r0 = r1.f342735r     // Catch:{ all -> 0x03dd }
                if (r2 == r0) goto L_0x006e
                r1.f342719b = r0     // Catch:{ all -> 0x03dd }
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03dd }
                r2.notifyAll()     // Catch:{ all -> 0x03dd }
                goto L_0x006f
            L_0x006e:
                r0 = 0
            L_0x006f:
                boolean r2 = r1.f342725h     // Catch:{ all -> 0x03dd }
                if (r2 == 0) goto L_0x007d
                r20.m160421g()     // Catch:{ all -> 0x03dd }
                r20.m160422h()     // Catch:{ all -> 0x03dd }
                r2 = 0
                r1.f342725h = r2     // Catch:{ all -> 0x03dd }
                r5 = 1
            L_0x007d:
                if (r3 == 0) goto L_0x0086
                r20.m160421g()     // Catch:{ all -> 0x03dd }
                r20.m160422h()     // Catch:{ all -> 0x03dd }
                r3 = 0
            L_0x0086:
                if (r0 == 0) goto L_0x008f
                boolean r2 = r1.f342723f     // Catch:{ all -> 0x03dd }
                if (r2 == 0) goto L_0x008f
                r20.m160421g()     // Catch:{ all -> 0x03dd }
            L_0x008f:
                if (r0 == 0) goto L_0x00b7
                boolean r2 = r1.f342722e     // Catch:{ all -> 0x03dd }
                if (r2 == 0) goto L_0x00b7
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r2 = r1.f342739v     // Catch:{ all -> 0x03dd }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x03dd }
                com.tencent.mapsdk.internal.tg r2 = (com.tencent.mapsdk.internal.C114342tg) r2     // Catch:{ all -> 0x03dd }
                if (r2 == 0) goto L_0x00a7
                boolean r2 = r2.f342688A     // Catch:{ all -> 0x03dd }
                if (r2 == 0) goto L_0x00a7
                r2 = 1
                goto L_0x00a8
            L_0x00a7:
                r2 = 0
            L_0x00a8:
                if (r2 == 0) goto L_0x00b4
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03dd }
                boolean r2 = r2.mo173044a()     // Catch:{ all -> 0x03dd }
                if (r2 == 0) goto L_0x00b7
            L_0x00b4:
                r20.m160422h()     // Catch:{ all -> 0x03dd }
            L_0x00b7:
                if (r0 == 0) goto L_0x00c8
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03dd }
                boolean r0 = r0.mo173045b()     // Catch:{ all -> 0x03dd }
                if (r0 == 0) goto L_0x00c8
                com.tencent.mapsdk.internal.tg$h r0 = r1.f342738u     // Catch:{ all -> 0x03dd }
                r0.mo173033b()     // Catch:{ all -> 0x03dd }
            L_0x00c8:
                boolean r0 = r1.f342720c     // Catch:{ all -> 0x03dd }
                if (r0 != 0) goto L_0x00e4
                boolean r0 = r1.f342721d     // Catch:{ all -> 0x03dd }
                if (r0 != 0) goto L_0x00e4
                boolean r0 = r1.f342723f     // Catch:{ all -> 0x03dd }
                if (r0 == 0) goto L_0x00d7
                r20.m160421g()     // Catch:{ all -> 0x03dd }
            L_0x00d7:
                r0 = 1
                r1.f342721d = r0     // Catch:{ all -> 0x03dd }
                r0 = 0
                r1.f342736s = r0     // Catch:{ all -> 0x03dd }
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03dd }
                r0.notifyAll()     // Catch:{ all -> 0x03dd }
            L_0x00e4:
                boolean r0 = r1.f342720c     // Catch:{ all -> 0x03dd }
                if (r0 == 0) goto L_0x00f6
                boolean r0 = r1.f342721d     // Catch:{ all -> 0x03dd }
                if (r0 == 0) goto L_0x00f6
                r0 = 0
                r1.f342721d = r0     // Catch:{ all -> 0x03dd }
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03dd }
                r0.notifyAll()     // Catch:{ all -> 0x03dd }
            L_0x00f6:
                if (r4 == 0) goto L_0x0104
                r0 = 1
                r1.f342730m = r0     // Catch:{ all -> 0x03dd }
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03dd }
                r0.notifyAll()     // Catch:{ all -> 0x03dd }
                r4 = 0
                r14 = 0
            L_0x0104:
                boolean r0 = r20.mo173035a()     // Catch:{ all -> 0x03dd }
                if (r0 == 0) goto L_0x03cb
                boolean r0 = r1.f342722e     // Catch:{ all -> 0x03dd }
                if (r0 != 0) goto L_0x01bf
                if (r5 == 0) goto L_0x0117
                r17 = r3
                r18 = r4
                r5 = 0
                goto L_0x01c3
            L_0x0117:
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03dd }
                boolean r0 = r0.mo173046b(r1)     // Catch:{ all -> 0x03dd }
                if (r0 == 0) goto L_0x01bf
                com.tencent.mapsdk.internal.tg$h r0 = r1.f342738u     // Catch:{ RuntimeException -> 0x01a8 }
                javax.microedition.khronos.egl.EGL r2 = javax.microedition.khronos.egl.EGLContext.getEGL()     // Catch:{ RuntimeException -> 0x01a8 }
                javax.microedition.khronos.egl.EGL10 r2 = (javax.microedition.khronos.egl.EGL10) r2     // Catch:{ RuntimeException -> 0x01a8 }
                r0.f342713b = r2     // Catch:{ RuntimeException -> 0x01a8 }
                java.lang.Object r9 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY     // Catch:{ RuntimeException -> 0x01a8 }
                javax.microedition.khronos.egl.EGLDisplay r2 = r2.eglGetDisplay(r9)     // Catch:{ RuntimeException -> 0x01a8 }
                r0.f342714c = r2     // Catch:{ RuntimeException -> 0x01a8 }
                javax.microedition.khronos.egl.EGLDisplay r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY     // Catch:{ RuntimeException -> 0x01a8 }
                if (r2 == r9) goto L_0x019c
                r17 = r3
                r9 = 2
                int[] r3 = new int[r9]     // Catch:{ RuntimeException -> 0x01aa }
                javax.microedition.khronos.egl.EGL10 r9 = r0.f342713b     // Catch:{ RuntimeException -> 0x01aa }
                boolean r2 = r9.eglInitialize(r2, r3)     // Catch:{ RuntimeException -> 0x01aa }
                if (r2 == 0) goto L_0x0192
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r2 = r0.f342712a     // Catch:{ RuntimeException -> 0x01aa }
                java.lang.Object r2 = r2.get()     // Catch:{ RuntimeException -> 0x01aa }
                com.tencent.mapsdk.internal.tg r2 = (com.tencent.mapsdk.internal.C114342tg) r2     // Catch:{ RuntimeException -> 0x01aa }
                if (r2 != 0) goto L_0x0156
                r3 = 0
                r0.f342716e = r3     // Catch:{ RuntimeException -> 0x01aa }
                r0.f342717f = r3     // Catch:{ RuntimeException -> 0x01aa }
                r18 = r4
                goto L_0x0176
            L_0x0156:
                com.tencent.mapsdk.internal.tg$e r3 = r2.f342694u     // Catch:{ RuntimeException -> 0x01aa }
                javax.microedition.khronos.egl.EGL10 r9 = r0.f342713b     // Catch:{ RuntimeException -> 0x01aa }
                r18 = r4
                javax.microedition.khronos.egl.EGLDisplay r4 = r0.f342714c     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGLConfig r3 = r3.mo173026a(r9, r4)     // Catch:{ RuntimeException -> 0x01ac }
                r0.f342716e = r3     // Catch:{ RuntimeException -> 0x01ac }
                com.tencent.mapsdk.internal.tg$f r2 = r2.f342695v     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGL10 r3 = r0.f342713b     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGLDisplay r4 = r0.f342714c     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGLConfig r9 = r0.f342716e     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGLContext r2 = r2.mo173028a((javax.microedition.khronos.egl.EGL10) r3, (javax.microedition.khronos.egl.EGLDisplay) r4, (javax.microedition.khronos.egl.EGLConfig) r9)     // Catch:{ RuntimeException -> 0x01ac }
                r0.f342717f = r2     // Catch:{ RuntimeException -> 0x01ac }
            L_0x0176:
                javax.microedition.khronos.egl.EGLContext r2 = r0.f342717f     // Catch:{ RuntimeException -> 0x01ac }
                if (r2 == 0) goto L_0x0181
                javax.microedition.khronos.egl.EGLContext r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch:{ RuntimeException -> 0x01ac }
                if (r2 != r3) goto L_0x017f
                goto L_0x0181
            L_0x017f:
                r2 = 0
                goto L_0x018f
            L_0x0181:
                r2 = 0
                r0.f342717f = r2     // Catch:{ RuntimeException -> 0x01ac }
                java.lang.String r2 = "createContext"
                javax.microedition.khronos.egl.EGL10 r3 = r0.f342713b     // Catch:{ RuntimeException -> 0x01ac }
                r3.eglGetError()     // Catch:{ RuntimeException -> 0x01ac }
                com.tencent.mapsdk.internal.C114342tg.C114350h.m160406a(r2)     // Catch:{ RuntimeException -> 0x01ac }
                goto L_0x017f
            L_0x018f:
                r0.f342715d = r2     // Catch:{ RuntimeException -> 0x01ac }
                goto L_0x01b3
            L_0x0192:
                r18 = r4
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x01ac }
                java.lang.String r2 = "eglInitialize failed"
                r0.<init>(r2)     // Catch:{ RuntimeException -> 0x01ac }
                throw r0     // Catch:{ RuntimeException -> 0x01ac }
            L_0x019c:
                r17 = r3
                r18 = r4
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x01ac }
                java.lang.String r2 = "eglGetDisplay failed"
                r0.<init>(r2)     // Catch:{ RuntimeException -> 0x01ac }
                throw r0     // Catch:{ RuntimeException -> 0x01ac }
            L_0x01a8:
                r17 = r3
            L_0x01aa:
                r18 = r4
            L_0x01ac:
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03dd }
                r0.mo173047c(r1)     // Catch:{ all -> 0x03dd }
            L_0x01b3:
                r0 = 1
                r1.f342722e = r0     // Catch:{ all -> 0x03dd }
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03dd }
                r0.notifyAll()     // Catch:{ all -> 0x03dd }
                r9 = 1
                goto L_0x01c3
            L_0x01bf:
                r17 = r3
                r18 = r4
            L_0x01c3:
                boolean r0 = r1.f342722e     // Catch:{ all -> 0x03dd }
                if (r0 == 0) goto L_0x01d1
                boolean r0 = r1.f342723f     // Catch:{ all -> 0x03dd }
                if (r0 != 0) goto L_0x01d1
                r0 = 1
                r1.f342723f = r0     // Catch:{ all -> 0x03dd }
                r6 = 1
                r10 = 1
                r11 = 1
            L_0x01d1:
                boolean r0 = r1.f342723f     // Catch:{ all -> 0x03dd }
                if (r0 == 0) goto L_0x03cf
                boolean r0 = r1.f342732o     // Catch:{ all -> 0x03dd }
                if (r0 == 0) goto L_0x01e6
                int r0 = r1.f342726i     // Catch:{ all -> 0x03dd }
                int r2 = r1.f342727j     // Catch:{ all -> 0x03dd }
                r3 = 0
                r1.f342732o = r3     // Catch:{ all -> 0x03dd }
                r12 = r0
                r13 = r2
                r0 = 1
                r6 = 1
                r14 = 1
                goto L_0x01e8
            L_0x01e6:
                r3 = 0
                r0 = 0
            L_0x01e8:
                r1.f342729l = r3     // Catch:{ all -> 0x03dd }
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03dd }
                r2.notifyAll()     // Catch:{ all -> 0x03dd }
                r11 = r0
                r4 = r18
            L_0x01f4:
                monitor-exit(r15)     // Catch:{ all -> 0x03dd }
                if (r7 == 0) goto L_0x0200
                r7.run()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r3 = r17
                r0 = 0
                r7 = 0
                goto L_0x001c
            L_0x0200:
                if (r6 == 0) goto L_0x02b5
                com.tencent.mapsdk.internal.tg$h r0 = r1.f342738u     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                javax.microedition.khronos.egl.EGL10 r2 = r0.f342713b     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                if (r2 == 0) goto L_0x02ad
                javax.microedition.khronos.egl.EGLDisplay r2 = r0.f342714c     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                if (r2 == 0) goto L_0x02a5
                javax.microedition.khronos.egl.EGLConfig r2 = r0.f342716e     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                if (r2 == 0) goto L_0x029d
                r0.mo173032a()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r2 = r0.f342712a     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                com.tencent.mapsdk.internal.tg r2 = (com.tencent.mapsdk.internal.C114342tg) r2     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                if (r2 == 0) goto L_0x0237
                com.tencent.mapsdk.internal.tg$g r15 = r2.f342696w     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                javax.microedition.khronos.egl.EGL10 r3 = r0.f342713b     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r18 = r4
                javax.microedition.khronos.egl.EGLDisplay r4 = r0.f342714c     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r19 = r5
                javax.microedition.khronos.egl.EGLConfig r5 = r0.f342716e     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                android.view.SurfaceHolder r2 = r2.getHolder()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                javax.microedition.khronos.egl.EGLSurface r2 = r15.mo173030a(r3, r4, r5, r2)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r0.f342715d = r2     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r3 = 0
                goto L_0x023e
            L_0x0237:
                r18 = r4
                r19 = r5
                r3 = 0
                r0.f342715d = r3     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
            L_0x023e:
                javax.microedition.khronos.egl.EGLSurface r2 = r0.f342715d     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                if (r2 == 0) goto L_0x0262
                javax.microedition.khronos.egl.EGLSurface r4 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                if (r2 != r4) goto L_0x0247
                goto L_0x0262
            L_0x0247:
                javax.microedition.khronos.egl.EGL10 r4 = r0.f342713b     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                javax.microedition.khronos.egl.EGLDisplay r5 = r0.f342714c     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                javax.microedition.khronos.egl.EGLContext r15 = r0.f342717f     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                boolean r2 = r4.eglMakeCurrent(r5, r2, r2, r15)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                if (r2 != 0) goto L_0x0260
                java.lang.String r2 = "EGLHelper"
                java.lang.String r4 = "eglMakeCurrent"
                javax.microedition.khronos.egl.EGL10 r0 = r0.f342713b     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r0.eglGetError()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                com.tencent.mapsdk.internal.C114342tg.C114350h.m160407a(r2, r4)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                goto L_0x026a
            L_0x0260:
                r0 = 1
                goto L_0x026b
            L_0x0262:
                javax.microedition.khronos.egl.EGL10 r0 = r0.f342713b     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                int r0 = r0.eglGetError()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r2 = 12299(0x300b, float:1.7235E-41)
            L_0x026a:
                r0 = 0
            L_0x026b:
                if (r0 == 0) goto L_0x0282
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                monitor-enter(r2)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r0 = 1
                r1.f342724g = r0     // Catch:{ all -> 0x027f }
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x027f }
                r0.notifyAll()     // Catch:{ all -> 0x027f }
                monitor-exit(r2)     // Catch:{ all -> 0x027f }
                r6 = 0
                goto L_0x02ba
            L_0x027f:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x027f }
                throw r0     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
            L_0x0282:
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                monitor-enter(r2)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r0 = 1
                r1.f342724g = r0     // Catch:{ all -> 0x029a }
                r1.f342736s = r0     // Catch:{ all -> 0x029a }
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x029a }
                r0.notifyAll()     // Catch:{ all -> 0x029a }
                monitor-exit(r2)     // Catch:{ all -> 0x029a }
                r3 = r17
                r4 = r18
                goto L_0x03c6
            L_0x029a:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x029a }
                throw r0     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
            L_0x029d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                java.lang.String r2 = "mEglConfig not initialized"
                r0.<init>(r2)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                throw r0     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
            L_0x02a5:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                java.lang.String r2 = "eglDisplay not initialized"
                r0.<init>(r2)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                throw r0     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
            L_0x02ad:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                java.lang.String r2 = "egl not initialized"
                r0.<init>(r2)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                throw r0     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
            L_0x02b5:
                r18 = r4
                r19 = r5
                r3 = 0
            L_0x02ba:
                if (r10 == 0) goto L_0x030d
                com.tencent.mapsdk.internal.tg$h r0 = r1.f342738u     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                javax.microedition.khronos.egl.EGLContext r2 = r0.f342717f     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                javax.microedition.khronos.opengles.GL r2 = r2.getGL()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r0 = r0.f342712a     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                com.tencent.mapsdk.internal.tg r0 = (com.tencent.mapsdk.internal.C114342tg) r0     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                if (r0 == 0) goto L_0x0302
                com.tencent.mapsdk.internal.tg$k r4 = r0.f342697x     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                if (r4 == 0) goto L_0x02dc
                com.tencent.mapsdk.internal.tg$k r2 = r0.f342697x     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                javax.microedition.khronos.opengles.GL r2 = r2.mo173048a()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
            L_0x02dc:
                int r4 = r0.f342698y     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r4 = r4 & 3
                if (r4 == 0) goto L_0x0302
                int r4 = r0.f342698y     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r5 = 1
                r4 = r4 & r5
                if (r4 == 0) goto L_0x02ee
                r4 = 1
                goto L_0x02ef
            L_0x02ee:
                r4 = 0
            L_0x02ef:
                int r0 = r0.f342698y     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r5 = 2
                r0 = r0 & r5
                if (r0 == 0) goto L_0x02fd
                com.tencent.mapsdk.internal.tg$l r0 = new com.tencent.mapsdk.internal.tg$l     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r0.<init>()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                goto L_0x02fe
            L_0x02fd:
                r0 = r3
            L_0x02fe:
                javax.microedition.khronos.opengles.GL r2 = android.opengl.GLDebugHelper.wrap(r2, r4, r0)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
            L_0x0302:
                javax.microedition.khronos.opengles.GL10 r2 = (javax.microedition.khronos.opengles.GL10) r2     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r0.mo173043a((javax.microedition.khronos.opengles.GL10) r2)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r8 = r2
                r10 = 0
            L_0x030d:
                if (r9 == 0) goto L_0x0325
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r0 = r1.f342739v     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                com.tencent.mapsdk.internal.tg r0 = (com.tencent.mapsdk.internal.C114342tg) r0     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                if (r0 == 0) goto L_0x0324
                com.tencent.mapsdk.internal.tg$m r0 = r0.f342692s     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                com.tencent.mapsdk.internal.tg$h r2 = r1.f342738u     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                javax.microedition.khronos.egl.EGLConfig r2 = r2.f342716e     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r0.mo172980a(r8, r2)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
            L_0x0324:
                r9 = 0
            L_0x0325:
                if (r11 == 0) goto L_0x0339
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r0 = r1.f342739v     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                com.tencent.mapsdk.internal.tg r0 = (com.tencent.mapsdk.internal.C114342tg) r0     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                if (r0 == 0) goto L_0x0338
                com.tencent.mapsdk.internal.tg$m r0 = r0.f342692s     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r0.mo172979a(r8, r12, r13)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
            L_0x0338:
                r11 = 0
            L_0x0339:
                long r4 = r1.f342733p     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r15 = 0
                int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r0 == 0) goto L_0x0344
                android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
            L_0x0344:
                long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r1.f342733p = r4     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r0 = r1.f342739v     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                com.tencent.mapsdk.internal.tg r0 = (com.tencent.mapsdk.internal.C114342tg) r0     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                if (r0 == 0) goto L_0x0361
                com.tencent.mapsdk.internal.tg$m r0 = r0.f342692s     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                boolean r0 = r0.mo172983a(r8)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                goto L_0x0362
            L_0x0361:
                r0 = 0
            L_0x0362:
                long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                long r4 = r15 - r4
                if (r0 == 0) goto L_0x03a7
                com.tencent.mapsdk.internal.tg$h r0 = r1.f342738u     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                javax.microedition.khronos.egl.EGL10 r2 = r0.f342713b     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                javax.microedition.khronos.egl.EGLDisplay r15 = r0.f342714c     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                javax.microedition.khronos.egl.EGLSurface r3 = r0.f342715d     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                boolean r2 = r2.eglSwapBuffers(r15, r3)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r3 = 12288(0x3000, float:1.7219E-41)
                if (r2 != 0) goto L_0x0381
                javax.microedition.khronos.egl.EGL10 r0 = r0.f342713b     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                int r0 = r0.eglGetError()     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                goto L_0x0383
            L_0x0381:
                r0 = 12288(0x3000, float:1.7219E-41)
            L_0x0383:
                if (r0 == r3) goto L_0x03a7
                r2 = 12302(0x300e, float:1.7239E-41)
                if (r0 == r2) goto L_0x03a4
                java.lang.String r0 = "tms-gl"
                java.lang.String r2 = "eglSwapBuffers"
                com.tencent.mapsdk.internal.C114342tg.C114350h.m160407a(r0, r2)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                monitor-enter(r2)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                r0 = 1
                r1.f342736s = r0     // Catch:{ all -> 0x03a1 }
                com.tencent.mapsdk.internal.tg$j r3 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03a1 }
                r3.notifyAll()     // Catch:{ all -> 0x03a1 }
                monitor-exit(r2)     // Catch:{ all -> 0x03a1 }
                goto L_0x03a8
            L_0x03a1:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x03a1 }
                throw r0     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
            L_0x03a4:
                r0 = 1
                r3 = 1
                goto L_0x03aa
            L_0x03a7:
                r0 = 1
            L_0x03a8:
                r3 = r17
            L_0x03aa:
                if (r14 == 0) goto L_0x03ad
                goto L_0x03af
            L_0x03ad:
                r0 = r18
            L_0x03af:
                r2 = 1148846080(0x447a0000, float:1000.0)
                float r15 = r1.f342737t     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                float r2 = r2 / r15
                float r4 = (float) r4     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                float r2 = r2 - r4
                int r2 = (int) r2     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                if (r2 <= 0) goto L_0x03c5
                monitor-enter(r20)     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
                long r4 = (long) r2
                r1.wait(r4)     // Catch:{ InterruptedException -> 0x03c1 }
                goto L_0x03c1
            L_0x03bf:
                r0 = move-exception
                goto L_0x03c3
            L_0x03c1:
                monitor-exit(r20)     // Catch:{ all -> 0x03bf }
                goto L_0x03c5
            L_0x03c3:
                monitor-exit(r20)     // Catch:{ all -> 0x03bf }
                throw r0     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
            L_0x03c5:
                r4 = r0
            L_0x03c6:
                r5 = r19
                r0 = 0
                goto L_0x001c
            L_0x03cb:
                r17 = r3
                r18 = r4
            L_0x03cf:
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03dd }
                r0.wait()     // Catch:{ all -> 0x03dd }
                r3 = r17
                r4 = r18
                r0 = 0
                goto L_0x0021
            L_0x03dd:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x03dd }
                throw r0     // Catch:{ Exception -> 0x03f1, all -> 0x03e0 }
            L_0x03e0:
                r0 = move-exception
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q
                monitor-enter(r2)
                r20.m160421g()     // Catch:{ all -> 0x03ee }
                r20.m160422h()     // Catch:{ all -> 0x03ee }
                monitor-exit(r2)     // Catch:{ all -> 0x03ee }
                throw r0
            L_0x03ee:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x03ee }
                throw r0
            L_0x03f1:
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q
                monitor-enter(r2)
                r20.m160421g()     // Catch:{ all -> 0x03fe }
                r20.m160422h()     // Catch:{ all -> 0x03fe }
                monitor-exit(r2)     // Catch:{ all -> 0x03fe }
                return
            L_0x03fe:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x03fe }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114342tg.C114351i.m160423i():void");
        }

        /* renamed from: j */
        private boolean m160424j() {
            return this.f342722e && this.f342723f && mo173035a();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|25|20|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0012, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0026 */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m160425k() {
            /*
                r2 = this;
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q
                monitor-enter(r0)
                r1 = 1
                r2.f342720c = r1     // Catch:{ all -> 0x0030 }
                r1 = 0
                r2.f342724g = r1     // Catch:{ all -> 0x0030 }
                com.tencent.mapsdk.internal.tg$j r1 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x0030 }
                r1.notifyAll()     // Catch:{ all -> 0x0030 }
            L_0x0012:
                boolean r1 = r2.f342721d     // Catch:{ all -> 0x0030 }
                if (r1 == 0) goto L_0x002e
                boolean r1 = r2.f342724g     // Catch:{ all -> 0x0030 }
                if (r1 != 0) goto L_0x002e
                boolean r1 = r2.f342718a     // Catch:{ all -> 0x0030 }
                if (r1 != 0) goto L_0x002e
                com.tencent.mapsdk.internal.tg$j r1 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ InterruptedException -> 0x0026 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0026 }
                goto L_0x0012
            L_0x0026:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0030 }
                r1.interrupt()     // Catch:{ all -> 0x0030 }
                goto L_0x0012
            L_0x002e:
                monitor-exit(r0)     // Catch:{ all -> 0x0030 }
                return
            L_0x0030:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0030 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114342tg.C114351i.m160425k():void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|22|18|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x000f, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001f */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m160426l() {
            /*
                r2 = this;
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q
                monitor-enter(r0)
                r1 = 0
                r2.f342720c = r1     // Catch:{ all -> 0x0029 }
                com.tencent.mapsdk.internal.tg$j r1 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x0029 }
                r1.notifyAll()     // Catch:{ all -> 0x0029 }
            L_0x000f:
                boolean r1 = r2.f342721d     // Catch:{ all -> 0x0029 }
                if (r1 != 0) goto L_0x0027
                boolean r1 = r2.f342718a     // Catch:{ all -> 0x0029 }
                if (r1 != 0) goto L_0x0027
                com.tencent.mapsdk.internal.tg$j r1 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ InterruptedException -> 0x001f }
                r1.wait()     // Catch:{ InterruptedException -> 0x001f }
                goto L_0x000f
            L_0x001f:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0029 }
                r1.interrupt()     // Catch:{ all -> 0x0029 }
                goto L_0x000f
            L_0x0027:
                monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                return
            L_0x0029:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114342tg.C114351i.m160426l():void");
        }

        /* renamed from: m */
        private void m160427m() {
            synchronized (C114342tg.f342687q) {
                this.f342725h = true;
                C114342tg.f342687q.notifyAll();
            }
        }

        /* renamed from: b */
        public final int mo173036b() {
            int i;
            synchronized (C114342tg.f342687q) {
                i = this.f342728k;
            }
            return i;
        }

        /* renamed from: c */
        public final void mo173037c() {
            synchronized (C114342tg.f342687q) {
                this.f342729l = true;
                C114342tg.f342687q.notifyAll();
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|22|18|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x000f, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001f */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo173038d() {
            /*
                r2 = this;
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q
                monitor-enter(r0)
                r1 = 1
                r2.f342735r = r1     // Catch:{ all -> 0x0029 }
                com.tencent.mapsdk.internal.tg$j r1 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x0029 }
                r1.notifyAll()     // Catch:{ all -> 0x0029 }
            L_0x000f:
                boolean r1 = r2.f342718a     // Catch:{ all -> 0x0029 }
                if (r1 != 0) goto L_0x0027
                boolean r1 = r2.f342719b     // Catch:{ all -> 0x0029 }
                if (r1 != 0) goto L_0x0027
                com.tencent.mapsdk.internal.tg$j r1 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ InterruptedException -> 0x001f }
                r1.wait()     // Catch:{ InterruptedException -> 0x001f }
                goto L_0x000f
            L_0x001f:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0029 }
                r1.interrupt()     // Catch:{ all -> 0x0029 }
                goto L_0x000f
            L_0x0027:
                monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                return
            L_0x0029:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114342tg.C114351i.mo173038d():void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|25|20|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0014, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0028 */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo173039e() {
            /*
                r3 = this;
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q
                monitor-enter(r0)
                r1 = 0
                r3.f342735r = r1     // Catch:{ all -> 0x0032 }
                r2 = 1
                r3.f342729l = r2     // Catch:{ all -> 0x0032 }
                r3.f342730m = r1     // Catch:{ all -> 0x0032 }
                com.tencent.mapsdk.internal.tg$j r1 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x0032 }
                r1.notifyAll()     // Catch:{ all -> 0x0032 }
            L_0x0014:
                boolean r1 = r3.f342718a     // Catch:{ all -> 0x0032 }
                if (r1 != 0) goto L_0x0030
                boolean r1 = r3.f342719b     // Catch:{ all -> 0x0032 }
                if (r1 == 0) goto L_0x0030
                boolean r1 = r3.f342730m     // Catch:{ all -> 0x0032 }
                if (r1 != 0) goto L_0x0030
                com.tencent.mapsdk.internal.tg$j r1 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ InterruptedException -> 0x0028 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0028 }
                goto L_0x0014
            L_0x0028:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0032 }
                r1.interrupt()     // Catch:{ all -> 0x0032 }
                goto L_0x0014
            L_0x0030:
                monitor-exit(r0)     // Catch:{ all -> 0x0032 }
                return
            L_0x0032:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0032 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114342tg.C114351i.mo173039e():void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|19|16|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x000f, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001b */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo173040f() {
            /*
                r2 = this;
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q
                monitor-enter(r0)
                r1 = 1
                r2.f342734q = r1     // Catch:{ all -> 0x0025 }
                com.tencent.mapsdk.internal.tg$j r1 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x0025 }
                r1.notifyAll()     // Catch:{ all -> 0x0025 }
            L_0x000f:
                boolean r1 = r2.f342718a     // Catch:{ all -> 0x0025 }
                if (r1 != 0) goto L_0x0023
                com.tencent.mapsdk.internal.tg$j r1 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ InterruptedException -> 0x001b }
                r1.wait()     // Catch:{ InterruptedException -> 0x001b }
                goto L_0x000f
            L_0x001b:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0025 }
                r1.interrupt()     // Catch:{ all -> 0x0025 }
                goto L_0x000f
            L_0x0023:
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114342tg.C114351i.mo173040f():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:129:0x01f6, code lost:
            if (r7 == null) goto L_0x0201;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
            r7.run();
            r3 = r17;
            r7 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x0201, code lost:
            if (r6 == false) goto L_0x02b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x0203, code lost:
            r0 = r1.f342738u;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x0207, code lost:
            if (r0.f342713b == null) goto L_0x02ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x020b, code lost:
            if (r0.f342714c == null) goto L_0x02a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x020f, code lost:
            if (r0.f342716e == null) goto L_0x029e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x0211, code lost:
            r0.mo173032a();
            r2 = r0.f342712a.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x021c, code lost:
            if (r2 == null) goto L_0x0238;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x021e, code lost:
            r18 = r4;
            r19 = r5;
            r0.f342715d = com.tencent.mapsdk.internal.C114342tg.m160376e(r2).mo173030a(r0.f342713b, r0.f342714c, r0.f342716e, r2.getHolder());
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x0238, code lost:
            r18 = r4;
            r19 = r5;
            r3 = null;
            r0.f342715d = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x023f, code lost:
            r2 = r0.f342715d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x0241, code lost:
            if (r2 == null) goto L_0x0263;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x0245, code lost:
            if (r2 != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) goto L_0x0248;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x0252, code lost:
            if (r0.f342713b.eglMakeCurrent(r0.f342714c, r2, r2, r0.f342717f) != false) goto L_0x0261;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0254, code lost:
            r0.f342713b.eglGetError();
            com.tencent.mapsdk.internal.C114342tg.C114350h.m160407a("EGLHelper", "eglMakeCurrent");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x0261, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0263, code lost:
            r0 = r0.f342713b.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x026b, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x026c, code lost:
            if (r0 == false) goto L_0x0283;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x026e, code lost:
            r2 = com.tencent.mapsdk.internal.C114342tg.m160381g();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x0272, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
            r1.f342724g = true;
            com.tencent.mapsdk.internal.C114342tg.m160381g().notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r2 = com.tencent.mapsdk.internal.C114342tg.m160381g();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x027d, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x027e, code lost:
            r6 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0283, code lost:
            r2 = com.tencent.mapsdk.internal.C114342tg.m160381g();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0287, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
            r1.f342724g = true;
            r1.f342736s = true;
            com.tencent.mapsdk.internal.C114342tg.m160381g().notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0294, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x0295, code lost:
            r3 = r17;
            r4 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x02a5, code lost:
            throw new java.lang.RuntimeException("mEglConfig not initialized");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x02ad, code lost:
            throw new java.lang.RuntimeException("eglDisplay not initialized");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x02b5, code lost:
            throw new java.lang.RuntimeException("egl not initialized");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x02b6, code lost:
            r18 = r4;
            r19 = r5;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x02bb, code lost:
            if (r10 == false) goto L_0x030e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x02bd, code lost:
            r0 = r1.f342738u;
            r2 = r0.f342717f.getGL();
            r0 = r0.f342712a.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x02cd, code lost:
            if (r0 == null) goto L_0x0303;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x02d3, code lost:
            if (com.tencent.mapsdk.internal.C114342tg.m160378f(r0) == null) goto L_0x02dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x02d5, code lost:
            r2 = com.tencent.mapsdk.internal.C114342tg.m160378f(r0).mo173048a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            m160421g();
            m160422h();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x02e3, code lost:
            if ((com.tencent.mapsdk.internal.C114342tg.m160380g(r0) & 3) == 0) goto L_0x0303;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x02eb, code lost:
            if ((com.tencent.mapsdk.internal.C114342tg.m160380g(r0) & 1) == 0) goto L_0x02ef;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x02ed, code lost:
            r4 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x02ef, code lost:
            r4 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x02f6, code lost:
            if ((com.tencent.mapsdk.internal.C114342tg.m160380g(r0) & 2) == 0) goto L_0x02fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x02f8, code lost:
            r0 = new com.tencent.mapsdk.internal.C114342tg.C80355l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x02fe, code lost:
            r0 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x02ff, code lost:
            r2 = android.opengl.GLDebugHelper.wrap(r2, r4, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x0303, code lost:
            r2 = (javax.microedition.khronos.opengles.GL10) r2;
            com.tencent.mapsdk.internal.C114342tg.m160381g().mo173043a(r2);
            r8 = r2;
            r10 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x030e, code lost:
            if (r9 == false) goto L_0x0326;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x0310, code lost:
            r0 = r1.f342739v.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:0x0318, code lost:
            if (r0 == null) goto L_0x0325;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x031a, code lost:
            com.tencent.mapsdk.internal.C114342tg.m160382h(r0).mo172980a(r8, r1.f342738u.f342716e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x0325, code lost:
            r9 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x0326, code lost:
            if (r11 == false) goto L_0x033a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x0328, code lost:
            r0 = r1.f342739v.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x0330, code lost:
            if (r0 == null) goto L_0x0339;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x0332, code lost:
            com.tencent.mapsdk.internal.C114342tg.m160382h(r0).mo172979a(r8, r12, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0339, code lost:
            r11 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x0340, code lost:
            if (r1.f342733p == 0) goto L_0x0345;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x0342, code lost:
            android.os.SystemClock.elapsedRealtime();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0345, code lost:
            r1.f342733p = android.os.SystemClock.elapsedRealtime();
            r4 = android.os.SystemClock.elapsedRealtime();
            r0 = r1.f342739v.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x0357, code lost:
            if (r0 == null) goto L_0x0362;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x0359, code lost:
            r0 = com.tencent.mapsdk.internal.C114342tg.m160382h(r0).mo172983a(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x0362, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x0363, code lost:
            r4 = android.os.SystemClock.elapsedRealtime() - r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x0369, code lost:
            if (r0 == false) goto L_0x03a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x036b, code lost:
            r0 = r1.f342738u;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x0379, code lost:
            if (r0.f342713b.eglSwapBuffers(r0.f342714c, r0.f342715d) != false) goto L_0x0382;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x037b, code lost:
            r0 = r0.f342713b.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x0382, code lost:
            r0 = 12288;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x0384, code lost:
            if (r0 == 12288) goto L_0x03a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x0388, code lost:
            if (r0 == 12302) goto L_0x03a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x038a, code lost:
            com.tencent.mapsdk.internal.C114342tg.C114350h.m160407a(com.tencent.mapsdk.internal.C114342tg.f342673a, "eglSwapBuffers");
            r2 = com.tencent.mapsdk.internal.C114342tg.m160381g();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x0395, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x0396, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
            r1.f342736s = true;
            com.tencent.mapsdk.internal.C114342tg.m160381g().notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x03a0, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:239:0x03a5, code lost:
            r0 = true;
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x03a8, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:241:0x03a9, code lost:
            r3 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x03ab, code lost:
            if (r14 == false) goto L_0x03ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:244:0x03ae, code lost:
            r0 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:245:0x03b0, code lost:
            r2 = (int) ((1000.0f / r1.f342737t) - ((float) r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:246:0x03b8, code lost:
            if (r2 <= 0) goto L_0x03c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:247:0x03ba, code lost:
            monitor-enter(r20);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
            wait((long) r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:253:?, code lost:
            monitor-exit(r20);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:258:0x03c6, code lost:
            r4 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:259:0x03c7, code lost:
            r5 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:276:0x03ef, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:280:?, code lost:
            throw r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:17:0x003c, B:271:0x03e7, B:295:0x040b] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x01ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:252:0x03c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:295:0x040b */
        /* JADX WARNING: Removed duplicated region for block: B:309:0x01d6 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r20 = this;
                r1 = r20
                com.tencent.mapsdk.internal.tg$h r0 = new com.tencent.mapsdk.internal.tg$h     // Catch:{ InterruptedException -> 0x040b }
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r2 = r1.f342739v     // Catch:{ InterruptedException -> 0x040b }
                r0.<init>(r2)     // Catch:{ InterruptedException -> 0x040b }
                r1.f342738u = r0     // Catch:{ InterruptedException -> 0x040b }
                r0 = 0
                r1.f342722e = r0     // Catch:{ InterruptedException -> 0x040b }
                r1.f342723f = r0     // Catch:{ InterruptedException -> 0x040b }
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
            L_0x001c:
                com.tencent.mapsdk.internal.tg$j r15 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                monitor-enter(r15)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
            L_0x0021:
                boolean r2 = r1.f342734q     // Catch:{ all -> 0x03de }
                if (r2 == 0) goto L_0x0048
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r0 = r1.f342739v     // Catch:{ all -> 0x03de }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x03de }
                com.tencent.mapsdk.internal.tg r0 = (com.tencent.mapsdk.internal.C114342tg) r0     // Catch:{ all -> 0x03de }
                if (r0 == 0) goto L_0x0036
                com.tencent.mapsdk.internal.tg$m r0 = r0.f342692s     // Catch:{ all -> 0x03de }
                r0.mo172975T()     // Catch:{ all -> 0x03de }
            L_0x0036:
                monitor-exit(r15)     // Catch:{ all -> 0x03de }
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ InterruptedException -> 0x040b }
                monitor-enter(r2)     // Catch:{ InterruptedException -> 0x040b }
                r20.m160421g()     // Catch:{ all -> 0x0045 }
                r20.m160422h()     // Catch:{ all -> 0x0045 }
                monitor-exit(r2)     // Catch:{ all -> 0x0045 }
                goto L_0x03fe
            L_0x0045:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0045 }
                throw r0     // Catch:{ InterruptedException -> 0x040b }
            L_0x0048:
                java.util.ArrayList<java.lang.Runnable> r2 = r1.f342731n     // Catch:{ all -> 0x03de }
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x03de }
                if (r2 != 0) goto L_0x005f
                java.util.ArrayList<java.lang.Runnable> r2 = r1.f342731n     // Catch:{ all -> 0x03de }
                r7 = 0
                java.lang.Object r2 = r2.remove(r7)     // Catch:{ all -> 0x03de }
                r7 = r2
                java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch:{ all -> 0x03de }
                r17 = r3
                r3 = 0
                goto L_0x01f5
            L_0x005f:
                boolean r2 = r1.f342719b     // Catch:{ all -> 0x03de }
                boolean r0 = r1.f342735r     // Catch:{ all -> 0x03de }
                if (r2 == r0) goto L_0x006f
                r1.f342719b = r0     // Catch:{ all -> 0x03de }
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03de }
                r2.notifyAll()     // Catch:{ all -> 0x03de }
                goto L_0x0070
            L_0x006f:
                r0 = 0
            L_0x0070:
                boolean r2 = r1.f342725h     // Catch:{ all -> 0x03de }
                if (r2 == 0) goto L_0x007e
                r20.m160421g()     // Catch:{ all -> 0x03de }
                r20.m160422h()     // Catch:{ all -> 0x03de }
                r2 = 0
                r1.f342725h = r2     // Catch:{ all -> 0x03de }
                r5 = 1
            L_0x007e:
                if (r3 == 0) goto L_0x0087
                r20.m160421g()     // Catch:{ all -> 0x03de }
                r20.m160422h()     // Catch:{ all -> 0x03de }
                r3 = 0
            L_0x0087:
                if (r0 == 0) goto L_0x0090
                boolean r2 = r1.f342723f     // Catch:{ all -> 0x03de }
                if (r2 == 0) goto L_0x0090
                r20.m160421g()     // Catch:{ all -> 0x03de }
            L_0x0090:
                if (r0 == 0) goto L_0x00b8
                boolean r2 = r1.f342722e     // Catch:{ all -> 0x03de }
                if (r2 == 0) goto L_0x00b8
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r2 = r1.f342739v     // Catch:{ all -> 0x03de }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x03de }
                com.tencent.mapsdk.internal.tg r2 = (com.tencent.mapsdk.internal.C114342tg) r2     // Catch:{ all -> 0x03de }
                if (r2 == 0) goto L_0x00a8
                boolean r2 = r2.f342688A     // Catch:{ all -> 0x03de }
                if (r2 == 0) goto L_0x00a8
                r2 = 1
                goto L_0x00a9
            L_0x00a8:
                r2 = 0
            L_0x00a9:
                if (r2 == 0) goto L_0x00b5
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03de }
                boolean r2 = r2.mo173044a()     // Catch:{ all -> 0x03de }
                if (r2 == 0) goto L_0x00b8
            L_0x00b5:
                r20.m160422h()     // Catch:{ all -> 0x03de }
            L_0x00b8:
                if (r0 == 0) goto L_0x00c9
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03de }
                boolean r0 = r0.mo173045b()     // Catch:{ all -> 0x03de }
                if (r0 == 0) goto L_0x00c9
                com.tencent.mapsdk.internal.tg$h r0 = r1.f342738u     // Catch:{ all -> 0x03de }
                r0.mo173033b()     // Catch:{ all -> 0x03de }
            L_0x00c9:
                boolean r0 = r1.f342720c     // Catch:{ all -> 0x03de }
                if (r0 != 0) goto L_0x00e5
                boolean r0 = r1.f342721d     // Catch:{ all -> 0x03de }
                if (r0 != 0) goto L_0x00e5
                boolean r0 = r1.f342723f     // Catch:{ all -> 0x03de }
                if (r0 == 0) goto L_0x00d8
                r20.m160421g()     // Catch:{ all -> 0x03de }
            L_0x00d8:
                r0 = 1
                r1.f342721d = r0     // Catch:{ all -> 0x03de }
                r0 = 0
                r1.f342736s = r0     // Catch:{ all -> 0x03de }
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03de }
                r0.notifyAll()     // Catch:{ all -> 0x03de }
            L_0x00e5:
                boolean r0 = r1.f342720c     // Catch:{ all -> 0x03de }
                if (r0 == 0) goto L_0x00f7
                boolean r0 = r1.f342721d     // Catch:{ all -> 0x03de }
                if (r0 == 0) goto L_0x00f7
                r0 = 0
                r1.f342721d = r0     // Catch:{ all -> 0x03de }
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03de }
                r0.notifyAll()     // Catch:{ all -> 0x03de }
            L_0x00f7:
                if (r4 == 0) goto L_0x0105
                r0 = 1
                r1.f342730m = r0     // Catch:{ all -> 0x03de }
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03de }
                r0.notifyAll()     // Catch:{ all -> 0x03de }
                r4 = 0
                r14 = 0
            L_0x0105:
                boolean r0 = r20.mo173035a()     // Catch:{ all -> 0x03de }
                if (r0 == 0) goto L_0x03cc
                boolean r0 = r1.f342722e     // Catch:{ all -> 0x03de }
                if (r0 != 0) goto L_0x01c0
                if (r5 == 0) goto L_0x0118
                r17 = r3
                r18 = r4
                r5 = 0
                goto L_0x01c4
            L_0x0118:
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03de }
                boolean r0 = r0.mo173046b(r1)     // Catch:{ all -> 0x03de }
                if (r0 == 0) goto L_0x01c0
                com.tencent.mapsdk.internal.tg$h r0 = r1.f342738u     // Catch:{ RuntimeException -> 0x01a9 }
                javax.microedition.khronos.egl.EGL r2 = javax.microedition.khronos.egl.EGLContext.getEGL()     // Catch:{ RuntimeException -> 0x01a9 }
                javax.microedition.khronos.egl.EGL10 r2 = (javax.microedition.khronos.egl.EGL10) r2     // Catch:{ RuntimeException -> 0x01a9 }
                r0.f342713b = r2     // Catch:{ RuntimeException -> 0x01a9 }
                java.lang.Object r9 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY     // Catch:{ RuntimeException -> 0x01a9 }
                javax.microedition.khronos.egl.EGLDisplay r2 = r2.eglGetDisplay(r9)     // Catch:{ RuntimeException -> 0x01a9 }
                r0.f342714c = r2     // Catch:{ RuntimeException -> 0x01a9 }
                javax.microedition.khronos.egl.EGLDisplay r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY     // Catch:{ RuntimeException -> 0x01a9 }
                if (r2 == r9) goto L_0x019d
                r17 = r3
                r9 = 2
                int[] r3 = new int[r9]     // Catch:{ RuntimeException -> 0x01ab }
                javax.microedition.khronos.egl.EGL10 r9 = r0.f342713b     // Catch:{ RuntimeException -> 0x01ab }
                boolean r2 = r9.eglInitialize(r2, r3)     // Catch:{ RuntimeException -> 0x01ab }
                if (r2 == 0) goto L_0x0193
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r2 = r0.f342712a     // Catch:{ RuntimeException -> 0x01ab }
                java.lang.Object r2 = r2.get()     // Catch:{ RuntimeException -> 0x01ab }
                com.tencent.mapsdk.internal.tg r2 = (com.tencent.mapsdk.internal.C114342tg) r2     // Catch:{ RuntimeException -> 0x01ab }
                if (r2 != 0) goto L_0x0157
                r3 = 0
                r0.f342716e = r3     // Catch:{ RuntimeException -> 0x01ab }
                r0.f342717f = r3     // Catch:{ RuntimeException -> 0x01ab }
                r18 = r4
                goto L_0x0177
            L_0x0157:
                com.tencent.mapsdk.internal.tg$e r3 = r2.f342694u     // Catch:{ RuntimeException -> 0x01ab }
                javax.microedition.khronos.egl.EGL10 r9 = r0.f342713b     // Catch:{ RuntimeException -> 0x01ab }
                r18 = r4
                javax.microedition.khronos.egl.EGLDisplay r4 = r0.f342714c     // Catch:{ RuntimeException -> 0x01ad }
                javax.microedition.khronos.egl.EGLConfig r3 = r3.mo173026a(r9, r4)     // Catch:{ RuntimeException -> 0x01ad }
                r0.f342716e = r3     // Catch:{ RuntimeException -> 0x01ad }
                com.tencent.mapsdk.internal.tg$f r2 = r2.f342695v     // Catch:{ RuntimeException -> 0x01ad }
                javax.microedition.khronos.egl.EGL10 r3 = r0.f342713b     // Catch:{ RuntimeException -> 0x01ad }
                javax.microedition.khronos.egl.EGLDisplay r4 = r0.f342714c     // Catch:{ RuntimeException -> 0x01ad }
                javax.microedition.khronos.egl.EGLConfig r9 = r0.f342716e     // Catch:{ RuntimeException -> 0x01ad }
                javax.microedition.khronos.egl.EGLContext r2 = r2.mo173028a((javax.microedition.khronos.egl.EGL10) r3, (javax.microedition.khronos.egl.EGLDisplay) r4, (javax.microedition.khronos.egl.EGLConfig) r9)     // Catch:{ RuntimeException -> 0x01ad }
                r0.f342717f = r2     // Catch:{ RuntimeException -> 0x01ad }
            L_0x0177:
                javax.microedition.khronos.egl.EGLContext r2 = r0.f342717f     // Catch:{ RuntimeException -> 0x01ad }
                if (r2 == 0) goto L_0x0182
                javax.microedition.khronos.egl.EGLContext r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch:{ RuntimeException -> 0x01ad }
                if (r2 != r3) goto L_0x0180
                goto L_0x0182
            L_0x0180:
                r2 = 0
                goto L_0x0190
            L_0x0182:
                r2 = 0
                r0.f342717f = r2     // Catch:{ RuntimeException -> 0x01ad }
                java.lang.String r2 = "createContext"
                javax.microedition.khronos.egl.EGL10 r3 = r0.f342713b     // Catch:{ RuntimeException -> 0x01ad }
                r3.eglGetError()     // Catch:{ RuntimeException -> 0x01ad }
                com.tencent.mapsdk.internal.C114342tg.C114350h.m160406a(r2)     // Catch:{ RuntimeException -> 0x01ad }
                goto L_0x0180
            L_0x0190:
                r0.f342715d = r2     // Catch:{ RuntimeException -> 0x01ad }
                goto L_0x01b4
            L_0x0193:
                r18 = r4
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x01ad }
                java.lang.String r2 = "eglInitialize failed"
                r0.<init>(r2)     // Catch:{ RuntimeException -> 0x01ad }
                throw r0     // Catch:{ RuntimeException -> 0x01ad }
            L_0x019d:
                r17 = r3
                r18 = r4
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x01ad }
                java.lang.String r2 = "eglGetDisplay failed"
                r0.<init>(r2)     // Catch:{ RuntimeException -> 0x01ad }
                throw r0     // Catch:{ RuntimeException -> 0x01ad }
            L_0x01a9:
                r17 = r3
            L_0x01ab:
                r18 = r4
            L_0x01ad:
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03de }
                r0.mo173047c(r1)     // Catch:{ all -> 0x03de }
            L_0x01b4:
                r0 = 1
                r1.f342722e = r0     // Catch:{ all -> 0x03de }
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03de }
                r0.notifyAll()     // Catch:{ all -> 0x03de }
                r9 = 1
                goto L_0x01c4
            L_0x01c0:
                r17 = r3
                r18 = r4
            L_0x01c4:
                boolean r0 = r1.f342722e     // Catch:{ all -> 0x03de }
                if (r0 == 0) goto L_0x01d2
                boolean r0 = r1.f342723f     // Catch:{ all -> 0x03de }
                if (r0 != 0) goto L_0x01d2
                r0 = 1
                r1.f342723f = r0     // Catch:{ all -> 0x03de }
                r6 = 1
                r10 = 1
                r11 = 1
            L_0x01d2:
                boolean r0 = r1.f342723f     // Catch:{ all -> 0x03de }
                if (r0 == 0) goto L_0x03d0
                boolean r0 = r1.f342732o     // Catch:{ all -> 0x03de }
                if (r0 == 0) goto L_0x01e7
                int r0 = r1.f342726i     // Catch:{ all -> 0x03de }
                int r2 = r1.f342727j     // Catch:{ all -> 0x03de }
                r3 = 0
                r1.f342732o = r3     // Catch:{ all -> 0x03de }
                r12 = r0
                r13 = r2
                r0 = 1
                r6 = 1
                r14 = 1
                goto L_0x01e9
            L_0x01e7:
                r3 = 0
                r0 = 0
            L_0x01e9:
                r1.f342729l = r3     // Catch:{ all -> 0x03de }
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03de }
                r2.notifyAll()     // Catch:{ all -> 0x03de }
                r11 = r0
                r4 = r18
            L_0x01f5:
                monitor-exit(r15)     // Catch:{ all -> 0x03de }
                if (r7 == 0) goto L_0x0201
                r7.run()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r3 = r17
                r0 = 0
                r7 = 0
                goto L_0x001c
            L_0x0201:
                if (r6 == 0) goto L_0x02b6
                com.tencent.mapsdk.internal.tg$h r0 = r1.f342738u     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                javax.microedition.khronos.egl.EGL10 r2 = r0.f342713b     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                if (r2 == 0) goto L_0x02ae
                javax.microedition.khronos.egl.EGLDisplay r2 = r0.f342714c     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                if (r2 == 0) goto L_0x02a6
                javax.microedition.khronos.egl.EGLConfig r2 = r0.f342716e     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                if (r2 == 0) goto L_0x029e
                r0.mo173032a()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r2 = r0.f342712a     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                com.tencent.mapsdk.internal.tg r2 = (com.tencent.mapsdk.internal.C114342tg) r2     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                if (r2 == 0) goto L_0x0238
                com.tencent.mapsdk.internal.tg$g r15 = r2.f342696w     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                javax.microedition.khronos.egl.EGL10 r3 = r0.f342713b     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r18 = r4
                javax.microedition.khronos.egl.EGLDisplay r4 = r0.f342714c     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r19 = r5
                javax.microedition.khronos.egl.EGLConfig r5 = r0.f342716e     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                android.view.SurfaceHolder r2 = r2.getHolder()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                javax.microedition.khronos.egl.EGLSurface r2 = r15.mo173030a(r3, r4, r5, r2)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r0.f342715d = r2     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r3 = 0
                goto L_0x023f
            L_0x0238:
                r18 = r4
                r19 = r5
                r3 = 0
                r0.f342715d = r3     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
            L_0x023f:
                javax.microedition.khronos.egl.EGLSurface r2 = r0.f342715d     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                if (r2 == 0) goto L_0x0263
                javax.microedition.khronos.egl.EGLSurface r4 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                if (r2 != r4) goto L_0x0248
                goto L_0x0263
            L_0x0248:
                javax.microedition.khronos.egl.EGL10 r4 = r0.f342713b     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                javax.microedition.khronos.egl.EGLDisplay r5 = r0.f342714c     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                javax.microedition.khronos.egl.EGLContext r15 = r0.f342717f     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                boolean r2 = r4.eglMakeCurrent(r5, r2, r2, r15)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                if (r2 != 0) goto L_0x0261
                java.lang.String r2 = "EGLHelper"
                java.lang.String r4 = "eglMakeCurrent"
                javax.microedition.khronos.egl.EGL10 r0 = r0.f342713b     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r0.eglGetError()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                com.tencent.mapsdk.internal.C114342tg.C114350h.m160407a(r2, r4)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                goto L_0x026b
            L_0x0261:
                r0 = 1
                goto L_0x026c
            L_0x0263:
                javax.microedition.khronos.egl.EGL10 r0 = r0.f342713b     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                int r0 = r0.eglGetError()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r2 = 12299(0x300b, float:1.7235E-41)
            L_0x026b:
                r0 = 0
            L_0x026c:
                if (r0 == 0) goto L_0x0283
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                monitor-enter(r2)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r0 = 1
                r1.f342724g = r0     // Catch:{ all -> 0x0280 }
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x0280 }
                r0.notifyAll()     // Catch:{ all -> 0x0280 }
                monitor-exit(r2)     // Catch:{ all -> 0x0280 }
                r6 = 0
                goto L_0x02bb
            L_0x0280:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0280 }
                throw r0     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
            L_0x0283:
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                monitor-enter(r2)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r0 = 1
                r1.f342724g = r0     // Catch:{ all -> 0x029b }
                r1.f342736s = r0     // Catch:{ all -> 0x029b }
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x029b }
                r0.notifyAll()     // Catch:{ all -> 0x029b }
                monitor-exit(r2)     // Catch:{ all -> 0x029b }
                r3 = r17
                r4 = r18
                goto L_0x03c7
            L_0x029b:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x029b }
                throw r0     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
            L_0x029e:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                java.lang.String r2 = "mEglConfig not initialized"
                r0.<init>(r2)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                throw r0     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
            L_0x02a6:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                java.lang.String r2 = "eglDisplay not initialized"
                r0.<init>(r2)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                throw r0     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
            L_0x02ae:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                java.lang.String r2 = "egl not initialized"
                r0.<init>(r2)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                throw r0     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
            L_0x02b6:
                r18 = r4
                r19 = r5
                r3 = 0
            L_0x02bb:
                if (r10 == 0) goto L_0x030e
                com.tencent.mapsdk.internal.tg$h r0 = r1.f342738u     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                javax.microedition.khronos.egl.EGLContext r2 = r0.f342717f     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                javax.microedition.khronos.opengles.GL r2 = r2.getGL()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r0 = r0.f342712a     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                com.tencent.mapsdk.internal.tg r0 = (com.tencent.mapsdk.internal.C114342tg) r0     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                if (r0 == 0) goto L_0x0303
                com.tencent.mapsdk.internal.tg$k r4 = r0.f342697x     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                if (r4 == 0) goto L_0x02dd
                com.tencent.mapsdk.internal.tg$k r2 = r0.f342697x     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                javax.microedition.khronos.opengles.GL r2 = r2.mo173048a()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
            L_0x02dd:
                int r4 = r0.f342698y     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r4 = r4 & 3
                if (r4 == 0) goto L_0x0303
                int r4 = r0.f342698y     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r5 = 1
                r4 = r4 & r5
                if (r4 == 0) goto L_0x02ef
                r4 = 1
                goto L_0x02f0
            L_0x02ef:
                r4 = 0
            L_0x02f0:
                int r0 = r0.f342698y     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r5 = 2
                r0 = r0 & r5
                if (r0 == 0) goto L_0x02fe
                com.tencent.mapsdk.internal.tg$l r0 = new com.tencent.mapsdk.internal.tg$l     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r0.<init>()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                goto L_0x02ff
            L_0x02fe:
                r0 = r3
            L_0x02ff:
                javax.microedition.khronos.opengles.GL r2 = android.opengl.GLDebugHelper.wrap(r2, r4, r0)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
            L_0x0303:
                javax.microedition.khronos.opengles.GL10 r2 = (javax.microedition.khronos.opengles.GL10) r2     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r0.mo173043a((javax.microedition.khronos.opengles.GL10) r2)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r8 = r2
                r10 = 0
            L_0x030e:
                if (r9 == 0) goto L_0x0326
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r0 = r1.f342739v     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                com.tencent.mapsdk.internal.tg r0 = (com.tencent.mapsdk.internal.C114342tg) r0     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                if (r0 == 0) goto L_0x0325
                com.tencent.mapsdk.internal.tg$m r0 = r0.f342692s     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                com.tencent.mapsdk.internal.tg$h r2 = r1.f342738u     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                javax.microedition.khronos.egl.EGLConfig r2 = r2.f342716e     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r0.mo172980a(r8, r2)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
            L_0x0325:
                r9 = 0
            L_0x0326:
                if (r11 == 0) goto L_0x033a
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r0 = r1.f342739v     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                com.tencent.mapsdk.internal.tg r0 = (com.tencent.mapsdk.internal.C114342tg) r0     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                if (r0 == 0) goto L_0x0339
                com.tencent.mapsdk.internal.tg$m r0 = r0.f342692s     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r0.mo172979a(r8, r12, r13)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
            L_0x0339:
                r11 = 0
            L_0x033a:
                long r4 = r1.f342733p     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r15 = 0
                int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r0 == 0) goto L_0x0345
                android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
            L_0x0345:
                long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r1.f342733p = r4     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tg> r0 = r1.f342739v     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                com.tencent.mapsdk.internal.tg r0 = (com.tencent.mapsdk.internal.C114342tg) r0     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                if (r0 == 0) goto L_0x0362
                com.tencent.mapsdk.internal.tg$m r0 = r0.f342692s     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                boolean r0 = r0.mo172983a(r8)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                goto L_0x0363
            L_0x0362:
                r0 = 0
            L_0x0363:
                long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                long r4 = r15 - r4
                if (r0 == 0) goto L_0x03a8
                com.tencent.mapsdk.internal.tg$h r0 = r1.f342738u     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                javax.microedition.khronos.egl.EGL10 r2 = r0.f342713b     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                javax.microedition.khronos.egl.EGLDisplay r15 = r0.f342714c     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                javax.microedition.khronos.egl.EGLSurface r3 = r0.f342715d     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                boolean r2 = r2.eglSwapBuffers(r15, r3)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r3 = 12288(0x3000, float:1.7219E-41)
                if (r2 != 0) goto L_0x0382
                javax.microedition.khronos.egl.EGL10 r0 = r0.f342713b     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                int r0 = r0.eglGetError()     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                goto L_0x0384
            L_0x0382:
                r0 = 12288(0x3000, float:1.7219E-41)
            L_0x0384:
                if (r0 == r3) goto L_0x03a8
                r2 = 12302(0x300e, float:1.7239E-41)
                if (r0 == r2) goto L_0x03a5
                java.lang.String r0 = "tms-gl"
                java.lang.String r2 = "eglSwapBuffers"
                com.tencent.mapsdk.internal.C114342tg.C114350h.m160407a(r0, r2)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                monitor-enter(r2)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                r0 = 1
                r1.f342736s = r0     // Catch:{ all -> 0x03a2 }
                com.tencent.mapsdk.internal.tg$j r3 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03a2 }
                r3.notifyAll()     // Catch:{ all -> 0x03a2 }
                monitor-exit(r2)     // Catch:{ all -> 0x03a2 }
                goto L_0x03a9
            L_0x03a2:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x03a2 }
                throw r0     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
            L_0x03a5:
                r0 = 1
                r3 = 1
                goto L_0x03ab
            L_0x03a8:
                r0 = 1
            L_0x03a9:
                r3 = r17
            L_0x03ab:
                if (r14 == 0) goto L_0x03ae
                goto L_0x03b0
            L_0x03ae:
                r0 = r18
            L_0x03b0:
                r2 = 1148846080(0x447a0000, float:1000.0)
                float r15 = r1.f342737t     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                float r2 = r2 / r15
                float r4 = (float) r4     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                float r2 = r2 - r4
                int r2 = (int) r2     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                if (r2 <= 0) goto L_0x03c6
                monitor-enter(r20)     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
                long r4 = (long) r2
                r1.wait(r4)     // Catch:{ InterruptedException -> 0x03c2 }
                goto L_0x03c2
            L_0x03c0:
                r0 = move-exception
                goto L_0x03c4
            L_0x03c2:
                monitor-exit(r20)     // Catch:{ all -> 0x03c0 }
                goto L_0x03c6
            L_0x03c4:
                monitor-exit(r20)     // Catch:{ all -> 0x03c0 }
                throw r0     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
            L_0x03c6:
                r4 = r0
            L_0x03c7:
                r5 = r19
                r0 = 0
                goto L_0x001c
            L_0x03cc:
                r17 = r3
                r18 = r4
            L_0x03d0:
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x03de }
                r0.wait()     // Catch:{ all -> 0x03de }
                r3 = r17
                r4 = r18
                r0 = 0
                goto L_0x0021
            L_0x03de:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x03de }
                throw r0     // Catch:{ Exception -> 0x03f2, all -> 0x03e1 }
            L_0x03e1:
                r0 = move-exception
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ InterruptedException -> 0x040b }
                monitor-enter(r2)     // Catch:{ InterruptedException -> 0x040b }
                r20.m160421g()     // Catch:{ all -> 0x03ef }
                r20.m160422h()     // Catch:{ all -> 0x03ef }
                monitor-exit(r2)     // Catch:{ all -> 0x03ef }
                throw r0     // Catch:{ InterruptedException -> 0x040b }
            L_0x03ef:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x03ef }
                throw r0     // Catch:{ InterruptedException -> 0x040b }
            L_0x03f2:
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ InterruptedException -> 0x040b }
                monitor-enter(r2)     // Catch:{ InterruptedException -> 0x040b }
                r20.m160421g()     // Catch:{ all -> 0x0406 }
                r20.m160422h()     // Catch:{ all -> 0x0406 }
                monitor-exit(r2)     // Catch:{ all -> 0x0406 }
            L_0x03fe:
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q
                r0.mo173042a((com.tencent.mapsdk.internal.C114342tg.C114351i) r1)
                return
            L_0x0406:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0406 }
                throw r0     // Catch:{ InterruptedException -> 0x040b }
            L_0x0409:
                r0 = move-exception
                goto L_0x0413
            L_0x040b:
                java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0409 }
                r0.interrupt()     // Catch:{ all -> 0x0409 }
                goto L_0x03fe
            L_0x0413:
                com.tencent.mapsdk.internal.tg$j r2 = com.tencent.mapsdk.internal.C114342tg.f342687q
                r2.mo173042a((com.tencent.mapsdk.internal.C114342tg.C114351i) r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114342tg.C114351i.run():void");
        }

        /* renamed from: a */
        public final boolean mo173035a() {
            if (this.f342719b || !this.f342720c || this.f342736s || this.f342726i <= 0 || this.f342727j <= 0) {
                return false;
            }
            return this.f342729l || this.f342728k == 1;
        }

        /* renamed from: a */
        private void m160417a(int i) {
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (C114342tg.f342687q) {
                this.f342728k = i;
                C114342tg.f342687q.notifyAll();
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:26|27|28|29|41|35) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x002b, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0052 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m160418a(int r4, int r5) {
            /*
                r3 = this;
                com.tencent.mapsdk.internal.tg$j r0 = com.tencent.mapsdk.internal.C114342tg.f342687q
                monitor-enter(r0)
                int r1 = r3.f342726i     // Catch:{ all -> 0x005c }
                r2 = 0
                if (r1 != r4) goto L_0x0019
                int r1 = r3.f342727j     // Catch:{ all -> 0x005c }
                if (r1 != r5) goto L_0x0019
                r3.f342732o = r2     // Catch:{ all -> 0x005c }
                com.tencent.mapsdk.internal.tg$j r4 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x005c }
                r4.notifyAll()     // Catch:{ all -> 0x005c }
                monitor-exit(r0)     // Catch:{ all -> 0x005c }
                return
            L_0x0019:
                r3.f342726i = r4     // Catch:{ all -> 0x005c }
                r3.f342727j = r5     // Catch:{ all -> 0x005c }
                r4 = 1
                r3.f342732o = r4     // Catch:{ all -> 0x005c }
                r3.f342729l = r4     // Catch:{ all -> 0x005c }
                r3.f342730m = r2     // Catch:{ all -> 0x005c }
                com.tencent.mapsdk.internal.tg$j r5 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ all -> 0x005c }
                r5.notifyAll()     // Catch:{ all -> 0x005c }
            L_0x002b:
                boolean r5 = r3.f342718a     // Catch:{ all -> 0x005c }
                if (r5 != 0) goto L_0x005a
                boolean r5 = r3.f342719b     // Catch:{ all -> 0x005c }
                if (r5 != 0) goto L_0x005a
                boolean r5 = r3.f342730m     // Catch:{ all -> 0x005c }
                if (r5 != 0) goto L_0x005a
                boolean r5 = r3.f342722e     // Catch:{ all -> 0x005c }
                if (r5 == 0) goto L_0x0047
                boolean r5 = r3.f342723f     // Catch:{ all -> 0x005c }
                if (r5 == 0) goto L_0x0047
                boolean r5 = r3.mo173035a()     // Catch:{ all -> 0x005c }
                if (r5 == 0) goto L_0x0047
                r5 = 1
                goto L_0x0048
            L_0x0047:
                r5 = 0
            L_0x0048:
                if (r5 == 0) goto L_0x005a
                com.tencent.mapsdk.internal.tg$j r5 = com.tencent.mapsdk.internal.C114342tg.f342687q     // Catch:{ InterruptedException -> 0x0052 }
                r5.wait()     // Catch:{ InterruptedException -> 0x0052 }
                goto L_0x002b
            L_0x0052:
                java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x005c }
                r5.interrupt()     // Catch:{ all -> 0x005c }
                goto L_0x002b
            L_0x005a:
                monitor-exit(r0)     // Catch:{ all -> 0x005c }
                return
            L_0x005c:
                r4 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x005c }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114342tg.C114351i.m160418a(int, int):void");
        }

        /* renamed from: a */
        private void m160419a(Runnable runnable) {
            if (runnable != null) {
                synchronized (C114342tg.f342687q) {
                    this.f342731n.add(runnable);
                    C114342tg.f342687q.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }

        /* renamed from: a */
        public final void mo173034a(float f) {
            if (f <= 1.0f) {
                C113889km.m157558e(C0949kl.f2242l, "帧率设置不在有效值范围内");
            } else {
                this.f342737t = f;
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tg$k */
    public interface C114353k {
        /* renamed from: a */
        GL mo173048a();
    }

    /* renamed from: com.tencent.mapsdk.internal.tg$m */
    public interface C114354m {
        /* renamed from: T */
        void mo172975T();

        /* renamed from: a */
        void mo172979a(GL10 gl10, int i, int i2);

        /* renamed from: a */
        void mo172980a(GL10 gl10, EGLConfig eGLConfig);

        /* renamed from: a */
        boolean mo172983a(GL10 gl10);
    }

    /* renamed from: com.tencent.mapsdk.internal.tg$n */
    public class C114355n extends C114344b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C114355n(boolean z) {
            super(0, z ? 16 : 0, 0);
        }
    }

    public C114342tg(Context context) {
        super(context);
        mo171862d();
    }

    /* renamed from: b */
    public void mo173005b() {
        this.f342690h.mo173038d();
    }

    public void finalize() {
        try {
            C114351i iVar = this.f342690h;
            if (iVar != null) {
                iVar.mo173040f();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f342698y;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f342688A;
    }

    public int getRenderMode() {
        return this.f342690h.mo173036b();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f342693t) {
            this.f342690h.mo173039e();
        }
        this.f342693t = false;
    }

    public void onDetachedFromWindow() {
        C114351i iVar = this.f342690h;
        if (iVar != null) {
            iVar.mo173038d();
        }
        this.f342693t = true;
        super.onDetachedFromWindow();
    }

    public void setDebugFlags(int i) {
        this.f342698y = i;
    }

    public void setEGLConfigChooser(C114347e eVar) {
        m160384i();
        this.f342694u = eVar;
    }

    public void setEGLContextClientVersion(int i) {
        m160384i();
        this.f342699z = i;
    }

    public void setEGLContextFactory(C114348f fVar) {
        m160384i();
        this.f342695v = fVar;
    }

    public void setEGLWindowSurfaceFactory(C114349g gVar) {
        m160384i();
        this.f342696w = gVar;
    }

    public void setGLWrapper(C114353k kVar) {
        this.f342697x = kVar;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f342688A = z;
    }

    public void setRenderMode(int i) {
        C114351i iVar = this.f342690h;
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("renderMode");
        }
        C114352j jVar = f342687q;
        synchronized (jVar) {
            iVar.f342728k = i;
            jVar.notifyAll();
        }
    }

    public void setRenderer(C114354m mVar) {
        mo173004a(mVar, 60.0f);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:26|27|28|29|41|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0051, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0023, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceChanged(android.view.SurfaceHolder r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            com.tencent.mapsdk.internal.tg$i r3 = r2.f342690h
            com.tencent.mapsdk.internal.tg$j r4 = f342687q
            monitor-enter(r4)
            int r0 = r3.f342726i     // Catch:{ all -> 0x0052 }
            r1 = 0
            if (r0 != r5) goto L_0x0015
            int r0 = r3.f342727j     // Catch:{ all -> 0x0052 }
            if (r0 != r6) goto L_0x0015
            r3.f342732o = r1     // Catch:{ all -> 0x0052 }
            r4.notifyAll()     // Catch:{ all -> 0x0052 }
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            return
        L_0x0015:
            r3.f342726i = r5     // Catch:{ all -> 0x0052 }
            r3.f342727j = r6     // Catch:{ all -> 0x0052 }
            r5 = 1
            r3.f342732o = r5     // Catch:{ all -> 0x0052 }
            r3.f342729l = r5     // Catch:{ all -> 0x0052 }
            r3.f342730m = r1     // Catch:{ all -> 0x0052 }
            r4.notifyAll()     // Catch:{ all -> 0x0052 }
        L_0x0023:
            boolean r6 = r3.f342718a     // Catch:{ all -> 0x0052 }
            if (r6 != 0) goto L_0x0050
            boolean r6 = r3.f342719b     // Catch:{ all -> 0x0052 }
            if (r6 != 0) goto L_0x0050
            boolean r6 = r3.f342730m     // Catch:{ all -> 0x0052 }
            if (r6 != 0) goto L_0x0050
            boolean r6 = r3.f342722e     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x003f
            boolean r6 = r3.f342723f     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x003f
            boolean r6 = r3.mo173035a()     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x003f
            r6 = 1
            goto L_0x0040
        L_0x003f:
            r6 = 0
        L_0x0040:
            if (r6 == 0) goto L_0x0050
            com.tencent.mapsdk.internal.tg$j r6 = f342687q     // Catch:{ InterruptedException -> 0x0048 }
            r6.wait()     // Catch:{ InterruptedException -> 0x0048 }
            goto L_0x0023
        L_0x0048:
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0052 }
            r6.interrupt()     // Catch:{ all -> 0x0052 }
            goto L_0x0023
        L_0x0050:
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            return
        L_0x0052:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114342tg.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|25|20|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x000e, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceCreated(android.view.SurfaceHolder r3) {
        /*
            r2 = this;
            com.tencent.mapsdk.internal.tg$i r3 = r2.f342690h
            com.tencent.mapsdk.internal.tg$j r0 = f342687q
            monitor-enter(r0)
            r1 = 1
            r3.f342720c = r1     // Catch:{ all -> 0x002a }
            r1 = 0
            r3.f342724g = r1     // Catch:{ all -> 0x002a }
            r0.notifyAll()     // Catch:{ all -> 0x002a }
        L_0x000e:
            boolean r1 = r3.f342721d     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0028
            boolean r1 = r3.f342724g     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            boolean r1 = r3.f342718a     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            com.tencent.mapsdk.internal.tg$j r1 = f342687q     // Catch:{ InterruptedException -> 0x0020 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0020 }
            goto L_0x000e
        L_0x0020:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002a }
            r1.interrupt()     // Catch:{ all -> 0x002a }
            goto L_0x000e
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114342tg.surfaceCreated(android.view.SurfaceHolder):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|22|18|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x000b, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceDestroyed(android.view.SurfaceHolder r3) {
        /*
            r2 = this;
            com.tencent.mapsdk.internal.tg$i r3 = r2.f342690h
            com.tencent.mapsdk.internal.tg$j r0 = f342687q
            monitor-enter(r0)
            r1 = 0
            r3.f342720c = r1     // Catch:{ all -> 0x0023 }
            r0.notifyAll()     // Catch:{ all -> 0x0023 }
        L_0x000b:
            boolean r1 = r3.f342721d     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0021
            boolean r1 = r3.f342718a     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0021
            com.tencent.mapsdk.internal.tg$j r1 = f342687q     // Catch:{ InterruptedException -> 0x0019 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0019 }
            goto L_0x000b
        L_0x0019:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0023 }
            r1.interrupt()     // Catch:{ all -> 0x0023 }
            goto L_0x000b
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114342tg.surfaceDestroyed(android.view.SurfaceHolder):void");
    }

    /* renamed from: com.tencent.mapsdk.internal.tg$c */
    public class C114345c implements C114348f {

        /* renamed from: b */
        private int f342711b;

        private C114345c() {
            this.f342711b = 12440;
        }

        /* renamed from: a */
        public final EGLContext mo173028a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f342711b, C114342tg.this.f342699z, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (C114342tg.this.f342699z == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        public /* synthetic */ C114345c(C114342tg tgVar, byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo173029a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                Objects.toString(eGLDisplay);
                Objects.toString(eGLContext);
                egl10.eglGetError();
                C114350h.m160406a("eglDestroyContex");
            }
        }
    }

    /* renamed from: a */
    public static String m160370a(String str) {
        return "tms-gl." + str + ".3c400fc";
    }

    /* renamed from: d */
    private void mo171862d() {
        getHolder().addCallback(this);
    }

    /* renamed from: e */
    private boolean mo171863e() {
        return this.f342689g;
    }

    /* renamed from: f */
    private void mo147883f() {
        setEGLConfigChooser((C114347e) new C114344b(8, 16, 8));
    }

    /* renamed from: h */
    private void m160383h() {
        this.f342690h.mo173037c();
    }

    /* renamed from: i */
    private void m160384i() {
        if (this.f342690h != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* renamed from: c */
    public void mo173006c() {
        C114351i iVar = this.f342690h;
        if (iVar != null) {
            iVar.mo173040f();
        }
    }

    /* renamed from: a */
    public final void mo173003a(float f) {
        C114351i iVar = this.f342690h;
        if (iVar != null) {
            iVar.mo173034a(f);
            this.f342690h.mo173037c();
        }
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser((C114347e) new C114355n(z));
    }

    /* renamed from: com.tencent.mapsdk.internal.tg$j */
    public static class C114352j {

        /* renamed from: a */
        private static String f342740a = "GLThreadManager";

        /* renamed from: g */
        private static final int f342741g = 131072;

        /* renamed from: h */
        private static final String f342742h = "Q3Dimension MSM7500 ";

        /* renamed from: b */
        private boolean f342743b;

        /* renamed from: c */
        private int f342744c;

        /* renamed from: d */
        private boolean f342745d;

        /* renamed from: e */
        private boolean f342746e;

        /* renamed from: f */
        private boolean f342747f;

        /* renamed from: i */
        private C114351i f342748i;

        private C114352j() {
        }

        public /* synthetic */ C114352j(byte b) {
            this();
        }

        /* renamed from: a */
        public final synchronized void mo173042a(C114351i iVar) {
            boolean unused = iVar.f342718a = true;
            if (this.f342748i == iVar) {
                this.f342748i = null;
            }
            notifyAll();
        }

        /* renamed from: b */
        public final synchronized boolean mo173046b(C114351i iVar) {
            C114351i iVar2 = this.f342748i;
            if (iVar2 != iVar) {
                if (iVar2 != null) {
                    m160435c();
                    if (this.f342746e) {
                        return true;
                    }
                    C114351i iVar3 = this.f342748i;
                    if (iVar3 != null) {
                        synchronized (C114342tg.f342687q) {
                            iVar3.f342725h = true;
                            C114342tg.f342687q.notifyAll();
                        }
                    }
                    return false;
                }
            }
            this.f342748i = iVar;
            notifyAll();
            return true;
        }

        /* renamed from: c */
        public final synchronized void mo173047c(C114351i iVar) {
            if (this.f342748i == iVar) {
                this.f342748i = null;
            }
            notifyAll();
        }

        /* renamed from: c */
        private void m160435c() {
            if (!this.f342743b) {
                this.f342744c = 131072;
                this.f342746e = true;
                this.f342743b = true;
            }
        }

        /* renamed from: a */
        public final synchronized boolean mo173044a() {
            return this.f342747f;
        }

        /* renamed from: a */
        public final synchronized void mo173043a(GL10 gl10) {
            if (!this.f342745d) {
                m160435c();
                String glGetString = gl10.glGetString(7937);
                boolean z = false;
                if (this.f342744c < 131072) {
                    this.f342746e = !glGetString.startsWith(f342742h);
                    notifyAll();
                }
                if (!this.f342746e) {
                    z = true;
                }
                this.f342747f = z;
                this.f342745d = true;
            }
        }

        /* renamed from: b */
        public final synchronized boolean mo173045b() {
            m160435c();
            return !this.f342746e;
        }
    }

    private C114342tg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo171862d();
    }

    /* renamed from: com.tencent.mapsdk.internal.tg$h */
    public static class C114350h {

        /* renamed from: a */
        public WeakReference<C114342tg> f342712a;

        /* renamed from: b */
        public EGL10 f342713b;

        /* renamed from: c */
        public EGLDisplay f342714c;

        /* renamed from: d */
        public EGLSurface f342715d;

        /* renamed from: e */
        public EGLConfig f342716e;

        /* renamed from: f */
        public EGLContext f342717f;

        public C114350h(WeakReference<C114342tg> weakReference) {
            this.f342712a = weakReference;
        }

        /* renamed from: c */
        private void m160410c() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f342713b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f342714c = eglGetDisplay;
            if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
                if (this.f342713b.eglInitialize(eglGetDisplay, new int[2])) {
                    C114342tg tgVar = this.f342712a.get();
                    if (tgVar == null) {
                        this.f342716e = null;
                        this.f342717f = null;
                    } else {
                        this.f342716e = tgVar.f342694u.mo173026a(this.f342713b, this.f342714c);
                        this.f342717f = tgVar.f342695v.mo173028a(this.f342713b, this.f342714c, this.f342716e);
                    }
                    EGLContext eGLContext = this.f342717f;
                    if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                        this.f342717f = null;
                        this.f342713b.eglGetError();
                        m160406a("createContext");
                    }
                    this.f342715d = null;
                    return;
                }
                throw new RuntimeException("eglInitialize failed");
            }
            throw new RuntimeException("eglGetDisplay failed");
        }

        /* renamed from: d */
        private boolean m160411d() {
            if (this.f342713b == null) {
                throw new RuntimeException("egl not initialized");
            } else if (this.f342714c == null) {
                throw new RuntimeException("eglDisplay not initialized");
            } else if (this.f342716e != null) {
                mo173032a();
                C114342tg tgVar = this.f342712a.get();
                if (tgVar != null) {
                    this.f342715d = tgVar.f342696w.mo173030a(this.f342713b, this.f342714c, this.f342716e, tgVar.getHolder());
                } else {
                    this.f342715d = null;
                }
                EGLSurface eGLSurface = this.f342715d;
                if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                    this.f342713b.eglGetError();
                    return false;
                } else if (this.f342713b.eglMakeCurrent(this.f342714c, eGLSurface, eGLSurface, this.f342717f)) {
                    return true;
                } else {
                    this.f342713b.eglGetError();
                    m160407a("EGLHelper", "eglMakeCurrent");
                    return false;
                }
            } else {
                throw new RuntimeException("mEglConfig not initialized");
            }
        }

        /* renamed from: e */
        private GL m160412e() {
            GL gl = this.f342717f.getGL();
            C114342tg tgVar = this.f342712a.get();
            if (tgVar == null) {
                return gl;
            }
            if (tgVar.f342697x != null) {
                gl = tgVar.f342697x.mo173048a();
            }
            if ((tgVar.f342698y & 3) == 0) {
                return gl;
            }
            int i = 0;
            C80355l lVar = null;
            if ((tgVar.f342698y & 1) != 0) {
                i = 1;
            }
            if ((tgVar.f342698y & 2) != 0) {
                lVar = new C80355l();
            }
            return GLDebugHelper.wrap(gl, i, lVar);
        }

        /* renamed from: f */
        private int m160413f() {
            if (!this.f342713b.eglSwapBuffers(this.f342714c, this.f342715d)) {
                return this.f342713b.eglGetError();
            }
            return 12288;
        }

        /* renamed from: g */
        private void m160414g() {
            mo173032a();
        }

        /* renamed from: a */
        public final void mo173032a() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f342715d;
            if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                this.f342713b.eglMakeCurrent(this.f342714c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                C114342tg tgVar = this.f342712a.get();
                if (tgVar != null) {
                    tgVar.f342696w.mo173031a(this.f342713b, this.f342714c, this.f342715d);
                }
                this.f342715d = null;
            }
        }

        /* renamed from: b */
        public final void mo173033b() {
            if (this.f342717f != null) {
                C114342tg tgVar = this.f342712a.get();
                if (tgVar != null) {
                    try {
                        EGL10 egl10 = this.f342713b;
                        EGLDisplay eGLDisplay = this.f342714c;
                        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f342717f)) {
                            GLUtils.getEGLErrorString(this.f342713b.eglGetError());
                        }
                    } catch (Exception e) {
                        Log.getStackTraceString(e);
                    }
                    tgVar.f342695v.mo173029a(this.f342713b, this.f342714c, this.f342717f);
                }
                this.f342717f = null;
            }
            EGLDisplay eGLDisplay2 = this.f342714c;
            if (eGLDisplay2 != null) {
                this.f342713b.eglTerminate(eGLDisplay2);
                this.f342714c = null;
            }
        }

        /* renamed from: a */
        public static void m160406a(String str) {
            throw new RuntimeException(m160409c(str));
        }

        /* renamed from: a */
        public static void m160407a(String str, String str2) {
            m160409c(str2);
        }

        /* renamed from: b */
        private void m160408b(String str) {
            this.f342713b.eglGetError();
            m160406a(str);
        }

        /* renamed from: c */
        private static String m160409c(String str) {
            return str + " failed: ";
        }
    }

    /* renamed from: a */
    public final void mo173004a(C114354m mVar, float f) {
        m160384i();
        if (this.f342694u == null) {
            this.f342694u = new C114355n(true);
        }
        if (this.f342695v == null) {
            this.f342695v = new C114345c(this, (byte) 0);
        }
        if (this.f342696w == null) {
            this.f342696w = new C114346d((byte) 0);
        }
        this.f342692s = mVar;
        C114351i iVar = new C114351i(this.f342691r);
        this.f342690h = iVar;
        iVar.mo173034a(f);
        this.f342690h.start();
    }

    /* renamed from: com.tencent.mapsdk.internal.tg$a */
    public abstract class C114343a implements C114347e {

        /* renamed from: a */
        public int[] f342700a;

        public C114343a(int[] iArr, boolean z) {
            if (z) {
                int[] iArr2 = new int[17];
                System.arraycopy(iArr, 0, iArr2, 0, 12);
                iArr2[12] = 12338;
                iArr2[13] = 1;
                iArr2[14] = 12337;
                iArr2[15] = 4;
                iArr2[16] = 12344;
                iArr = iArr2;
            }
            if (C114342tg.this.f342699z == 2) {
                int length = iArr.length;
                int[] iArr3 = new int[(length + 2)];
                int i = length - 1;
                System.arraycopy(iArr, 0, iArr3, 0, i);
                iArr3[i] = 12352;
                iArr3[length] = 4;
                iArr3[length + 1] = 12344;
                iArr = iArr3;
            }
            this.f342700a = iArr;
        }

        /* renamed from: a */
        private static int[] m160391a(int[] iArr) {
            int length = iArr.length;
            int[] iArr2 = new int[(length + 4)];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12338;
            iArr2[length] = 1;
            iArr2[length + 1] = 12337;
            iArr2[length + 2] = 4;
            iArr2[length + 3] = 12344;
            return iArr2;
        }

        /* renamed from: b */
        private int[] m160392b(int[] iArr) {
            if (C114342tg.this.f342699z != 2) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[(length + 2)];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            iArr2[length] = 4;
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        /* renamed from: a */
        public abstract EGLConfig mo173027a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        /* renamed from: a */
        public final EGLConfig mo173026a(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.f342700a, (EGLConfig[]) null, 0, iArr)) {
                int i = iArr[0];
                if (i > 0) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[i];
                    if (egl10.eglChooseConfig(eGLDisplay, this.f342700a, eGLConfigArr, i, iArr)) {
                        EGLConfig a = mo173027a(egl10, eGLDisplay, eGLConfigArr);
                        if (a != null) {
                            return a;
                        }
                        throw new IllegalArgumentException("No config chosen");
                    }
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                throw new IllegalArgumentException("No configs match configSpec");
            }
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tg$b */
    public class C114344b extends C114343a {

        /* renamed from: c */
        public int f342702c = 8;

        /* renamed from: d */
        public int f342703d = 8;

        /* renamed from: e */
        public int f342704e = 8;

        /* renamed from: f */
        public int f342705f;

        /* renamed from: g */
        public int f342706g;

        /* renamed from: h */
        public int f342707h;

        /* renamed from: j */
        private int[] f342709j = new int[1];

        public C114344b(int i, int i2, int i3) {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, i, 12325, i2, 12326, i3, 12344}, C114342tg.this.f342689g);
            this.f342705f = i;
            this.f342706g = i2;
            this.f342707h = i3;
        }

        /* renamed from: a */
        public final EGLConfig mo173027a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int a = m160395a(egl10, eGLDisplay, eGLConfig, 12325);
                int a2 = m160395a(egl10, eGLDisplay, eGLConfig, 12326);
                if (a >= this.f342706g && a2 >= this.f342707h) {
                    int a3 = m160395a(egl10, eGLDisplay, eGLConfig, 12324);
                    int a4 = m160395a(egl10, eGLDisplay, eGLConfig, 12323);
                    int a5 = m160395a(egl10, eGLDisplay, eGLConfig, 12322);
                    int a6 = m160395a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (a3 == this.f342702c && a4 == this.f342703d && a5 == this.f342704e && a6 == this.f342705f) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        private int m160395a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f342709j)) {
                return this.f342709j[0];
            }
            return 0;
        }
    }

    /* renamed from: a */
    public void mo173002a() {
        this.f342690h.mo173039e();
    }

    /* renamed from: a */
    private void m160371a(Runnable runnable) {
        C114351i iVar = this.f342690h;
        if (runnable != null) {
            C114352j jVar = f342687q;
            synchronized (jVar) {
                iVar.f342731n.add(runnable);
                jVar.notifyAll();
            }
            return;
        }
        throw new IllegalArgumentException("r must not be null");
    }
}
