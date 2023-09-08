package com.tencent.p014mm.dynamicbackground.view;

import android.content.Context;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import p413ok.C77014c;
import p917pk.C77104b;

/* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView */
public class GameGLSurfaceView extends SurfaceView implements SurfaceHolder.Callback2 {

    /* renamed from: s */
    public static final C68027j f195203s = new C68027j((C77104b) null);

    /* renamed from: d */
    public AtomicBoolean f195204d = new AtomicBoolean(false);

    /* renamed from: e */
    public final WeakReference<GameGLSurfaceView> f195205e = new WeakReference<>(this);

    /* renamed from: f */
    public C68025i f195206f;

    /* renamed from: g */
    public C68030m f195207g;

    /* renamed from: h */
    public boolean f195208h;

    /* renamed from: i */
    public C68022e f195209i;

    /* renamed from: j */
    public C68023f f195210j;

    /* renamed from: n */
    public C68024g f195211n;

    /* renamed from: o */
    public boolean f195212o = false;

    /* renamed from: p */
    public int f195213p;

    /* renamed from: q */
    public int f195214q;

    /* renamed from: r */
    public boolean f195215r;

    /* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$a */
    public abstract class C68019a implements C68022e {

        /* renamed from: a */
        public int[] f195216a;

        public C68019a(GameGLSurfaceView gameGLSurfaceView, int[] iArr) {
            int i = gameGLSurfaceView.f195214q;
            if (i == 2 || i == 3) {
                int length = iArr.length;
                int[] iArr2 = new int[(length + 2)];
                int i2 = length - 1;
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                iArr2[i2] = 12352;
                if (gameGLSurfaceView.f195214q == 2) {
                    iArr2[length] = 4;
                } else {
                    iArr2[length] = 64;
                }
                iArr2[length + 1] = 12344;
                iArr = iArr2;
            }
            this.f195216a = iArr;
        }
    }

    /* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$c */
    public class C68020c implements C68023f {
        public C68020c(C77104b bVar) {
        }
    }

    /* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$d */
    public static class C68021d implements C68024g {
        public C68021d(C77104b bVar) {
        }
    }

    /* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$e */
    public interface C68022e {
    }

    /* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$f */
    public interface C68023f {
    }

    /* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$g */
    public interface C68024g {
    }

    /* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i */
    public static class C68025i extends Thread {

        /* renamed from: A */
        public final Object f195218A = new Object();

        /* renamed from: B */
        public C68033h f195219B;

        /* renamed from: C */
        public WeakReference<GameGLSurfaceView> f195220C;

        /* renamed from: d */
        public Runnable f195221d;

        /* renamed from: e */
        public Runnable f195222e;

        /* renamed from: f */
        public HandlerThread f195223f;

        /* renamed from: g */
        public C68026a f195224g;

        /* renamed from: h */
        public boolean f195225h;

        /* renamed from: i */
        public boolean f195226i;

        /* renamed from: j */
        public boolean f195227j;

        /* renamed from: n */
        public boolean f195228n;

        /* renamed from: o */
        public boolean f195229o;

        /* renamed from: p */
        public boolean f195230p;

        /* renamed from: q */
        public boolean f195231q;

        /* renamed from: r */
        public boolean f195232r;

        /* renamed from: s */
        public boolean f195233s;

        /* renamed from: t */
        public int f195234t = 0;

        /* renamed from: u */
        public int f195235u = 0;

        /* renamed from: v */
        public int f195236v = 1;

        /* renamed from: w */
        public boolean f195237w = true;

        /* renamed from: x */
        public boolean f195238x = false;

        /* renamed from: y */
        public LinkedList<Runnable> f195239y = new LinkedList<>();

        /* renamed from: z */
        public boolean f195240z = true;

        /* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i$a */
        public class C68026a extends Handler {
            public C68026a(Looper looper) {
                super(looper);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0150, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void handleMessage(android.os.Message r10) {
                /*
                    r9 = this;
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r0 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s
                    monitor-enter(r0)
                    int r1 = r10.what     // Catch:{ all -> 0x0151 }
                    r2 = 1
                    r3 = 0
                    switch(r1) {
                        case 0: goto L_0x0127;
                        case 1: goto L_0x0100;
                        case 2: goto L_0x00da;
                        case 3: goto L_0x00af;
                        case 4: goto L_0x0069;
                        case 5: goto L_0x0033;
                        case 6: goto L_0x000c;
                        default: goto L_0x000a;
                    }     // Catch:{ all -> 0x0151 }
                L_0x000a:
                    goto L_0x014f
                L_0x000c:
                    java.lang.String r10 = "MicroMsg.GLThread"
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0151 }
                    r1.<init>()     // Catch:{ all -> 0x0151 }
                    java.lang.String r4 = "requestRender tid="
                    r1.append(r4)     // Catch:{ all -> 0x0151 }
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i r4 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.this     // Catch:{ all -> 0x0151 }
                    long r4 = r4.getId()     // Catch:{ all -> 0x0151 }
                    r1.append(r4)     // Catch:{ all -> 0x0151 }
                    java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0151 }
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0151 }
                    p413ok.C77014c.m92922b(r10, r1, r3)     // Catch:{ all -> 0x0151 }
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i r10 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.this     // Catch:{ all -> 0x0151 }
                    r10.f195237w = r2     // Catch:{ all -> 0x0151 }
                    r0.notifyAll()     // Catch:{ all -> 0x0151 }
                    goto L_0x014f
                L_0x0033:
                    java.lang.String r10 = "MicroMsg.GLThread"
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0151 }
                    r1.<init>()     // Catch:{ all -> 0x0151 }
                    java.lang.String r4 = "requestExitAndWaitForDestroy tid="
                    r1.append(r4)     // Catch:{ all -> 0x0151 }
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i r4 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.this     // Catch:{ all -> 0x0151 }
                    long r4 = r4.getId()     // Catch:{ all -> 0x0151 }
                    r1.append(r4)     // Catch:{ all -> 0x0151 }
                    java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0151 }
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0151 }
                    p413ok.C77014c.m92922b(r10, r1, r3)     // Catch:{ all -> 0x0151 }
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i r10 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.this     // Catch:{ all -> 0x0151 }
                    r10.f195225h = r2     // Catch:{ all -> 0x0151 }
                    java.lang.ref.WeakReference<com.tencent.mm.dynamicbackground.view.GameGLSurfaceView> r10 = r10.f195220C     // Catch:{ all -> 0x0151 }
                    java.lang.Object r10 = r10.get()     // Catch:{ all -> 0x0151 }
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView r10 = (com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView) r10     // Catch:{ all -> 0x0151 }
                    if (r10 == 0) goto L_0x0064
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$m r10 = r10.f195207g     // Catch:{ all -> 0x0151 }
                    r10.mo93424c()     // Catch:{ all -> 0x0151 }
                L_0x0064:
                    r0.notifyAll()     // Catch:{ all -> 0x0151 }
                    goto L_0x014f
                L_0x0069:
                    int r1 = r10.arg1     // Catch:{ all -> 0x0151 }
                    int r10 = r10.arg2     // Catch:{ all -> 0x0151 }
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i r4 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.this     // Catch:{ all -> 0x0151 }
                    int r5 = r4.f195234t     // Catch:{ all -> 0x0151 }
                    if (r5 != r1) goto L_0x0079
                    int r4 = r4.f195235u     // Catch:{ all -> 0x0151 }
                    if (r4 != r10) goto L_0x0079
                    monitor-exit(r0)     // Catch:{ all -> 0x0151 }
                    return
                L_0x0079:
                    java.lang.String r4 = "MicroMsg.GLThread"
                    java.lang.String r5 = "windowResize w:%d h:%d tid="
                    r6 = 3
                    java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0151 }
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0151 }
                    r6[r3] = r7     // Catch:{ all -> 0x0151 }
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0151 }
                    r6[r2] = r3     // Catch:{ all -> 0x0151 }
                    r3 = 2
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i r7 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.this     // Catch:{ all -> 0x0151 }
                    long r7 = r7.getId()     // Catch:{ all -> 0x0151 }
                    java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0151 }
                    r6[r3] = r7     // Catch:{ all -> 0x0151 }
                    p413ok.C77014c.m92922b(r4, r5, r6)     // Catch:{ all -> 0x0151 }
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i r3 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.this     // Catch:{ all -> 0x0151 }
                    r3.f195234t = r1     // Catch:{ all -> 0x0151 }
                    r3.f195235u = r10     // Catch:{ all -> 0x0151 }
                    r3.f195240z = r2     // Catch:{ all -> 0x0151 }
                    r3.f195237w = r2     // Catch:{ all -> 0x0151 }
                    r3.getClass()     // Catch:{ all -> 0x0151 }
                    r0.notifyAll()     // Catch:{ all -> 0x0151 }
                    goto L_0x014f
                L_0x00af:
                    java.lang.String r10 = "MicroMsg.GLThread"
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0151 }
                    r1.<init>()     // Catch:{ all -> 0x0151 }
                    java.lang.String r4 = "onResume tid="
                    r1.append(r4)     // Catch:{ all -> 0x0151 }
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i r4 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.this     // Catch:{ all -> 0x0151 }
                    long r4 = r4.getId()     // Catch:{ all -> 0x0151 }
                    r1.append(r4)     // Catch:{ all -> 0x0151 }
                    java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0151 }
                    java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0151 }
                    p413ok.C77014c.m92922b(r10, r1, r4)     // Catch:{ all -> 0x0151 }
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i r10 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.this     // Catch:{ all -> 0x0151 }
                    r10.f195226i = r3     // Catch:{ all -> 0x0151 }
                    r10.f195237w = r2     // Catch:{ all -> 0x0151 }
                    r10.getClass()     // Catch:{ all -> 0x0151 }
                    r0.notifyAll()     // Catch:{ all -> 0x0151 }
                    goto L_0x014f
                L_0x00da:
                    java.lang.String r10 = "MicroMsg.GLThread"
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0151 }
                    r1.<init>()     // Catch:{ all -> 0x0151 }
                    java.lang.String r4 = "onPause tid="
                    r1.append(r4)     // Catch:{ all -> 0x0151 }
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i r4 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.this     // Catch:{ all -> 0x0151 }
                    long r4 = r4.getId()     // Catch:{ all -> 0x0151 }
                    r1.append(r4)     // Catch:{ all -> 0x0151 }
                    java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0151 }
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0151 }
                    p413ok.C77014c.m92922b(r10, r1, r3)     // Catch:{ all -> 0x0151 }
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i r10 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.this     // Catch:{ all -> 0x0151 }
                    r10.f195226i = r2     // Catch:{ all -> 0x0151 }
                    r0.notifyAll()     // Catch:{ all -> 0x0151 }
                    goto L_0x014f
                L_0x0100:
                    java.lang.String r10 = "MicroMsg.GLThread"
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0151 }
                    r1.<init>()     // Catch:{ all -> 0x0151 }
                    java.lang.String r2 = "surfaceDestroyed tid="
                    r1.append(r2)     // Catch:{ all -> 0x0151 }
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i r2 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.this     // Catch:{ all -> 0x0151 }
                    long r4 = r2.getId()     // Catch:{ all -> 0x0151 }
                    r1.append(r4)     // Catch:{ all -> 0x0151 }
                    java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0151 }
                    java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x0151 }
                    p413ok.C77014c.m92922b(r10, r1, r2)     // Catch:{ all -> 0x0151 }
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i r10 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.this     // Catch:{ all -> 0x0151 }
                    r10.f195228n = r3     // Catch:{ all -> 0x0151 }
                    r0.notifyAll()     // Catch:{ all -> 0x0151 }
                    goto L_0x014f
                L_0x0127:
                    java.lang.String r10 = "MicroMsg.GLThread"
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0151 }
                    r1.<init>()     // Catch:{ all -> 0x0151 }
                    java.lang.String r4 = "surfaceCreated tid="
                    r1.append(r4)     // Catch:{ all -> 0x0151 }
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i r4 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.this     // Catch:{ all -> 0x0151 }
                    long r4 = r4.getId()     // Catch:{ all -> 0x0151 }
                    r1.append(r4)     // Catch:{ all -> 0x0151 }
                    java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0151 }
                    java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0151 }
                    p413ok.C77014c.m92922b(r10, r1, r4)     // Catch:{ all -> 0x0151 }
                    com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$i r10 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.this     // Catch:{ all -> 0x0151 }
                    r10.f195228n = r2     // Catch:{ all -> 0x0151 }
                    r10.f195233s = r3     // Catch:{ all -> 0x0151 }
                    r0.notifyAll()     // Catch:{ all -> 0x0151 }
                L_0x014f:
                    monitor-exit(r0)     // Catch:{ all -> 0x0151 }
                    return
                L_0x0151:
                    r10 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0151 }
                    throw r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.C68026a.handleMessage(android.os.Message):void");
            }
        }

        public C68025i(WeakReference<GameGLSurfaceView> weakReference) {
            HandlerThread handlerThread = new HandlerThread("MicroMsg.GLCommandThread" + getId());
            this.f195223f = handlerThread;
            handlerThread.start();
            this.f195224g = new C68026a(this.f195223f.getLooper());
            this.f195220C = weakReference;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:118:0x0271, code lost:
            if (r11 == null) goto L_0x027a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
            r11.run();
            r0 = 0;
            r11 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x027a, code lost:
            if (r3 == false) goto L_0x02d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x027c, code lost:
            p413ok.C77014c.m92924d("MicroMsg.GLThread", "egl createSurface", new java.lang.Object[0]);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x028c, code lost:
            if (r1.f195219B.mo93479a() == false) goto L_0x02b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x028e, code lost:
            r3 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x0290, code lost:
            monitor-enter(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
            r1.f195233s = true;
            r3.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x0297, code lost:
            monitor-exit(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x0298, code lost:
            if (r2 != false) goto L_0x02b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
            p413ok.C77014c.m92922b("MicroMsg.GLThread", "notifyOnEglSurfaceChanged", new java.lang.Object[0]);
            r0 = r1.f195220C.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x02ac, code lost:
            if (r0 == null) goto L_0x02b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x02ae, code lost:
            r0.f195207g.mo93422a(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x02b3, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x02b9, code lost:
            p413ok.C77014c.m92921a("MicroMsg.GLThread", "egl createSurface error", new java.lang.Object[0]);
            r13 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x02c5, code lost:
            monitor-enter(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
            r1.f195233s = true;
            r1.f195229o = true;
            r13.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x02ce, code lost:
            monitor-exit(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x02cf, code lost:
            r16 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x02d6, code lost:
            if (r7 == false) goto L_0x0317;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x02d8, code lost:
            p413ok.C77014c.m92924d("MicroMsg.GLThread", "createGLInterface", new java.lang.Object[0]);
            r0 = r1.f195219B;
            r6 = r0.f195256g.getGL();
            r0 = r0.f195251b.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x02f2, code lost:
            if (r0 == null) goto L_0x0313;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x02f4, code lost:
            r0.getClass();
            r0 = r0.f195213p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x02fb, code lost:
            if ((r0 & 3) == 0) goto L_0x0313;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x02ff, code lost:
            if ((r0 & 1) == 0) goto L_0x0303;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0301, code lost:
            r7 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x0303, code lost:
            r7 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0306, code lost:
            if ((r0 & 2) == 0) goto L_0x030e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0308, code lost:
            r0 = new com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68029l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x030e, code lost:
            r0 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x030f, code lost:
            r6 = android.opengl.GLDebugHelper.wrap(r6, r7, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0313, code lost:
            r6 = (javax.microedition.khronos.opengles.GL10) r6;
            r7 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0317, code lost:
            if (r2 == false) goto L_0x0321;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x0319, code lost:
            r0 = r1.f195220C.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x0321, code lost:
            if (r2 == false) goto L_0x034f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0323, code lost:
            p413ok.C77014c.m92924d("MicroMsg.GLThread", "createEglContext", new java.lang.Object[0]);
            r0 = r1.f195220C.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x0335, code lost:
            if (r0 == null) goto L_0x0341;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x0337, code lost:
            r0.f195207g.mo93423b(r6, r1.f195219B.f195255f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x0341, code lost:
            p413ok.C77014c.m92921a("MicroMsg.GLThread", "alvinluo GLSurfaceView null", new java.lang.Object[0]);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x034b, code lost:
            r0 = 0;
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x034f, code lost:
            if (r8 == false) goto L_0x039e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x0351, code lost:
            p413ok.C77014c.m92924d("MicroMsg.GLThread", "onSurfaceChanged(" + r9 + ", " + r10 + ")", new java.lang.Object[0]);
            r0 = r1.f195220C.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x037f, code lost:
            if (r0 == null) goto L_0x039d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
            r0.f195207g.mo93425d(r6, r9, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
            p413ok.C77014c.m92921a("MicroMsg.GLThread", "GLThread#sizeChanged out synchronized", new java.lang.Object[0]);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x039d, code lost:
            r8 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x039e, code lost:
            r0 = r1.f195220C.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x03a6, code lost:
            if (r0 == null) goto L_0x0416;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
            java.lang.Thread.sleep(r0.f195207g.mo93426e());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:?, code lost:
            p413ok.C77014c.m92924d("MicroMsg.GLThread", "sleep exception", new java.lang.Object[0]);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x0416, code lost:
            r16 = r2;
            r17 = r3;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo93467a() {
            /*
                r19 = this;
                r1 = r19
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$h r0 = new com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$h
                java.lang.ref.WeakReference<com.tencent.mm.dynamicbackground.view.GameGLSurfaceView> r2 = r1.f195220C
                r0.<init>(r2)
                r1.f195219B = r0
                r0 = 0
                r1.f195231q = r0
                r1.f195232r = r0
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r2 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s
                monitor-enter(r2)
                r1.f195238x = r0     // Catch:{ all -> 0x04ce }
                monitor-exit(r2)     // Catch:{ all -> 0x04ce }
                java.lang.Runnable r2 = r1.f195222e
                if (r2 == 0) goto L_0x001d
                r2.run()
            L_0x001d:
                r2 = 0
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
            L_0x0028:
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r13 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s     // Catch:{ all -> 0x04b1 }
                monitor-enter(r13)     // Catch:{ all -> 0x04b1 }
            L_0x002b:
                boolean r14 = r1.f195225h     // Catch:{ all -> 0x04ae }
                if (r14 == 0) goto L_0x0038
                java.lang.Runnable r0 = r1.f195221d     // Catch:{ all -> 0x04ae }
                if (r0 == 0) goto L_0x0036
                r0.run()     // Catch:{ all -> 0x04ae }
            L_0x0036:
                monitor-exit(r13)     // Catch:{ all -> 0x04ae }
                return
            L_0x0038:
                boolean r14 = r1.f195227j     // Catch:{ all -> 0x04ae }
                if (r14 != 0) goto L_0x0053
                boolean r14 = r1.f195233s     // Catch:{ all -> 0x04ae }
                if (r14 == 0) goto L_0x0053
                java.util.LinkedList<java.lang.Runnable> r14 = r1.f195239y     // Catch:{ all -> 0x04ae }
                boolean r14 = r14.isEmpty()     // Catch:{ all -> 0x04ae }
                if (r14 != 0) goto L_0x0053
                java.util.LinkedList<java.lang.Runnable> r11 = r1.f195239y     // Catch:{ all -> 0x04ae }
                java.lang.Object r0 = r11.remove(r0)     // Catch:{ all -> 0x04ae }
                java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x04ae }
                r11 = r0
                goto L_0x0270
            L_0x0053:
                boolean r0 = r1.f195227j     // Catch:{ all -> 0x04ae }
                boolean r14 = r1.f195226i     // Catch:{ all -> 0x04ae }
                if (r0 == r14) goto L_0x00ad
                r1.f195227j = r14     // Catch:{ all -> 0x04ae }
                if (r14 == 0) goto L_0x006d
                java.lang.ref.WeakReference<com.tencent.mm.dynamicbackground.view.GameGLSurfaceView> r0 = r1.f195220C     // Catch:{ all -> 0x04ae }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x04ae }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView r0 = (com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView) r0     // Catch:{ all -> 0x04ae }
                if (r0 == 0) goto L_0x007c
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$m r0 = r0.f195207g     // Catch:{ all -> 0x04ae }
                r0.onPause()     // Catch:{ all -> 0x04ae }
                goto L_0x007c
            L_0x006d:
                java.lang.ref.WeakReference<com.tencent.mm.dynamicbackground.view.GameGLSurfaceView> r0 = r1.f195220C     // Catch:{ all -> 0x04ae }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x04ae }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView r0 = (com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView) r0     // Catch:{ all -> 0x04ae }
                if (r0 == 0) goto L_0x007c
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$m r0 = r0.f195207g     // Catch:{ all -> 0x04ae }
                r0.onResume()     // Catch:{ all -> 0x04ae }
            L_0x007c:
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r0 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s     // Catch:{ all -> 0x04ae }
                r0.notifyAll()     // Catch:{ all -> 0x04ae }
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ae }
                r15.<init>()     // Catch:{ all -> 0x04ae }
                r16 = r2
                java.lang.String r2 = "mPaused is now "
                r15.append(r2)     // Catch:{ all -> 0x04ae }
                boolean r2 = r1.f195227j     // Catch:{ all -> 0x04ae }
                r15.append(r2)     // Catch:{ all -> 0x04ae }
                java.lang.String r2 = " tid="
                r15.append(r2)     // Catch:{ all -> 0x04ae }
                r17 = r3
                long r2 = r19.getId()     // Catch:{ all -> 0x04ae }
                r15.append(r2)     // Catch:{ all -> 0x04ae }
                java.lang.String r2 = r15.toString()     // Catch:{ all -> 0x04ae }
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x04ae }
                p413ok.C77014c.m92922b(r0, r2, r3)     // Catch:{ all -> 0x04ae }
                goto L_0x00b2
            L_0x00ad:
                r16 = r2
                r17 = r3
                r14 = 0
            L_0x00b2:
                if (r4 == 0) goto L_0x00c2
                boolean r0 = r1.f195232r     // Catch:{ all -> 0x04ae }
                if (r0 == 0) goto L_0x00bd
                r0 = 0
                r1.f195232r = r0     // Catch:{ all -> 0x04ae }
                r1.f195233s = r0     // Catch:{ all -> 0x04ae }
            L_0x00bd:
                r19.mo93469c()     // Catch:{ all -> 0x04ae }
                r0 = 0
                r4 = 0
            L_0x00c2:
                if (r14 == 0) goto L_0x00ef
                boolean r0 = r1.f195232r     // Catch:{ all -> 0x04ae }
                if (r0 == 0) goto L_0x00ef
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ae }
                r2.<init>()     // Catch:{ all -> 0x04ae }
                java.lang.String r3 = "releasing EGL surface because paused tid="
                r2.append(r3)     // Catch:{ all -> 0x04ae }
                r15 = r4
                long r3 = r19.getId()     // Catch:{ all -> 0x04ae }
                r2.append(r3)     // Catch:{ all -> 0x04ae }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x04ae }
                r3 = 0
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x04ae }
                p413ok.C77014c.m92922b(r0, r2, r4)     // Catch:{ all -> 0x04ae }
                boolean r0 = r1.f195232r     // Catch:{ all -> 0x04ae }
                if (r0 == 0) goto L_0x00f0
                r1.f195232r = r3     // Catch:{ all -> 0x04ae }
                r1.f195233s = r3     // Catch:{ all -> 0x04ae }
                goto L_0x00f0
            L_0x00ef:
                r15 = r4
            L_0x00f0:
                if (r14 == 0) goto L_0x0126
                boolean r0 = r1.f195231q     // Catch:{ all -> 0x04ae }
                if (r0 == 0) goto L_0x0126
                java.lang.ref.WeakReference<com.tencent.mm.dynamicbackground.view.GameGLSurfaceView> r0 = r1.f195220C     // Catch:{ all -> 0x04ae }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x04ae }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView r0 = (com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView) r0     // Catch:{ all -> 0x04ae }
                if (r0 != 0) goto L_0x0102
                r0 = 0
                goto L_0x0104
            L_0x0102:
                boolean r0 = r0.f195215r     // Catch:{ all -> 0x04ae }
            L_0x0104:
                if (r0 != 0) goto L_0x0126
                r19.mo93469c()     // Catch:{ all -> 0x04ae }
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ae }
                r2.<init>()     // Catch:{ all -> 0x04ae }
                java.lang.String r3 = "releasing EGL context because paused tid="
                r2.append(r3)     // Catch:{ all -> 0x04ae }
                long r3 = r19.getId()     // Catch:{ all -> 0x04ae }
                r2.append(r3)     // Catch:{ all -> 0x04ae }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x04ae }
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x04ae }
                p413ok.C77014c.m92922b(r0, r2, r3)     // Catch:{ all -> 0x04ae }
            L_0x0126:
                boolean r0 = r1.f195228n     // Catch:{ all -> 0x04ae }
                if (r0 != 0) goto L_0x0160
                boolean r0 = r1.f195230p     // Catch:{ all -> 0x04ae }
                if (r0 != 0) goto L_0x0160
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ae }
                r2.<init>()     // Catch:{ all -> 0x04ae }
                java.lang.String r3 = "noticed surfaceView surface lost tid="
                r2.append(r3)     // Catch:{ all -> 0x04ae }
                long r3 = r19.getId()     // Catch:{ all -> 0x04ae }
                r2.append(r3)     // Catch:{ all -> 0x04ae }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x04ae }
                r3 = 0
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x04ae }
                p413ok.C77014c.m92922b(r0, r2, r4)     // Catch:{ all -> 0x04ae }
                boolean r0 = r1.f195232r     // Catch:{ all -> 0x04ae }
                if (r0 == 0) goto L_0x0155
                if (r0 == 0) goto L_0x0155
                r1.f195232r = r3     // Catch:{ all -> 0x04ae }
                r1.f195233s = r3     // Catch:{ all -> 0x04ae }
            L_0x0155:
                r0 = 1
                r1.f195230p = r0     // Catch:{ all -> 0x04ae }
                r0 = 0
                r1.f195229o = r0     // Catch:{ all -> 0x04ae }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r0 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s     // Catch:{ all -> 0x04ae }
                r0.notifyAll()     // Catch:{ all -> 0x04ae }
            L_0x0160:
                boolean r0 = r1.f195228n     // Catch:{ all -> 0x04ae }
                if (r0 == 0) goto L_0x018c
                boolean r0 = r1.f195230p     // Catch:{ all -> 0x04ae }
                if (r0 == 0) goto L_0x018c
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ae }
                r2.<init>()     // Catch:{ all -> 0x04ae }
                java.lang.String r3 = "noticed surfaceView surface acquired tid="
                r2.append(r3)     // Catch:{ all -> 0x04ae }
                long r3 = r19.getId()     // Catch:{ all -> 0x04ae }
                r2.append(r3)     // Catch:{ all -> 0x04ae }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x04ae }
                r3 = 0
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x04ae }
                p413ok.C77014c.m92922b(r0, r2, r4)     // Catch:{ all -> 0x04ae }
                r1.f195230p = r3     // Catch:{ all -> 0x04ae }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r0 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s     // Catch:{ all -> 0x04ae }
                r0.notifyAll()     // Catch:{ all -> 0x04ae }
            L_0x018c:
                if (r5 == 0) goto L_0x01b9
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ae }
                r2.<init>()     // Catch:{ all -> 0x04ae }
                java.lang.String r3 = "sending render notification tid="
                r2.append(r3)     // Catch:{ all -> 0x04ae }
                long r3 = r19.getId()     // Catch:{ all -> 0x04ae }
                r2.append(r3)     // Catch:{ all -> 0x04ae }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x04ae }
                r3 = 0
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x04ae }
                p413ok.C77014c.m92922b(r0, r2, r4)     // Catch:{ all -> 0x04ae }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$h r0 = r1.f195219B     // Catch:{ all -> 0x04ae }
                r0.getClass()     // Catch:{ all -> 0x04ae }
                r1.f195238x = r3     // Catch:{ all -> 0x04ae }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r0 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s     // Catch:{ all -> 0x04ae }
                r0.notifyAll()     // Catch:{ all -> 0x04ae }
                r0 = 0
                r5 = 0
            L_0x01b9:
                boolean r0 = r1.f195231q     // Catch:{ all -> 0x04ae }
                if (r0 != 0) goto L_0x01e2
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.String r2 = "not HaveEglContext"
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x04ae }
                p413ok.C77014c.m92922b(r0, r2, r3)     // Catch:{ all -> 0x04ae }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$h r0 = r1.f195219B     // Catch:{ RuntimeException -> 0x01db }
                r0.mo93482e()     // Catch:{ RuntimeException -> 0x01db }
                r0 = 1
                r1.f195231q = r0     // Catch:{ all -> 0x04ae }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r0 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s     // Catch:{ all -> 0x04ae }
                r0.notifyAll()     // Catch:{ all -> 0x04ae }
                r0 = 1
                r4 = r15
                r3 = r17
                r2 = 1
                goto L_0x0270
            L_0x01db:
                r0 = move-exception
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r2 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s     // Catch:{ all -> 0x04ae }
                r2.notifyAll()     // Catch:{ all -> 0x04ae }
                throw r0     // Catch:{ all -> 0x04ae }
            L_0x01e2:
                boolean r0 = r19.mo93468b()     // Catch:{ all -> 0x04ae }
                if (r0 == 0) goto L_0x049f
                boolean r0 = r1.f195231q     // Catch:{ all -> 0x04ae }
                if (r0 != 0) goto L_0x020c
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.String r2 = "not HaveEglContext"
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x04ae }
                p413ok.C77014c.m92922b(r0, r2, r3)     // Catch:{ all -> 0x04ae }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$h r0 = r1.f195219B     // Catch:{ RuntimeException -> 0x0205 }
                r0.mo93482e()     // Catch:{ RuntimeException -> 0x0205 }
                r0 = 1
                r1.f195231q = r0     // Catch:{ all -> 0x04ae }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r0 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s     // Catch:{ all -> 0x04ae }
                r0.notifyAll()     // Catch:{ all -> 0x04ae }
                r2 = 1
                goto L_0x020e
            L_0x0205:
                r0 = move-exception
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r2 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s     // Catch:{ all -> 0x04ae }
                r2.notifyAll()     // Catch:{ all -> 0x04ae }
                throw r0     // Catch:{ all -> 0x04ae }
            L_0x020c:
                r2 = r16
            L_0x020e:
                boolean r0 = r1.f195231q     // Catch:{ all -> 0x04ae }
                if (r0 == 0) goto L_0x0227
                boolean r0 = r1.f195232r     // Catch:{ all -> 0x04ae }
                if (r0 != 0) goto L_0x0227
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.String r3 = "Have EglContext but no EglSurface"
                r4 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x04ae }
                p413ok.C77014c.m92922b(r0, r3, r4)     // Catch:{ all -> 0x04ae }
                r0 = 1
                r1.f195232r = r0     // Catch:{ all -> 0x04ae }
                r3 = 1
                r7 = 1
                r8 = 1
                goto L_0x0229
            L_0x0227:
                r3 = r17
            L_0x0229:
                boolean r0 = r1.f195232r     // Catch:{ all -> 0x04ae }
                if (r0 == 0) goto L_0x0493
                boolean r0 = r1.f195240z     // Catch:{ all -> 0x04ae }
                if (r0 == 0) goto L_0x025c
                int r9 = r1.f195234t     // Catch:{ all -> 0x04ae }
                int r10 = r1.f195235u     // Catch:{ all -> 0x04ae }
                r0 = 1
                r1.f195238x = r0     // Catch:{ all -> 0x04ae }
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ae }
                r3.<init>()     // Catch:{ all -> 0x04ae }
                java.lang.String r4 = "noticing that we want render notification tid="
                r3.append(r4)     // Catch:{ all -> 0x04ae }
                r14 = r5
                long r4 = r19.getId()     // Catch:{ all -> 0x04ae }
                r3.append(r4)     // Catch:{ all -> 0x04ae }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x04ae }
                r4 = 0
                java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x04ae }
                p413ok.C77014c.m92922b(r0, r3, r5)     // Catch:{ all -> 0x04ae }
                r1.f195240z = r4     // Catch:{ all -> 0x04ae }
                r0 = 0
                r3 = 1
                r8 = 1
                goto L_0x025e
            L_0x025c:
                r14 = r5
                r0 = 0
            L_0x025e:
                r1.f195237w = r0     // Catch:{ all -> 0x04ae }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r0 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s     // Catch:{ all -> 0x04ae }
                r0.notifyAll()     // Catch:{ all -> 0x04ae }
                boolean r0 = r1.f195238x     // Catch:{ all -> 0x04ae }
                if (r0 == 0) goto L_0x026e
                r0 = 1
                r5 = r14
                r4 = r15
                r12 = 1
                goto L_0x0270
            L_0x026e:
                r5 = r14
                r4 = r15
            L_0x0270:
                monitor-exit(r13)     // Catch:{ all -> 0x04ae }
                if (r11 == 0) goto L_0x027a
                r11.run()     // Catch:{ all -> 0x04b1 }
                r0 = 0
                r11 = 0
                goto L_0x0028
            L_0x027a:
                if (r3 == 0) goto L_0x02d6
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.String r13 = "egl createSurface"
                r14 = 0
                java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ all -> 0x04b1 }
                p413ok.C77014c.m92924d(r0, r13, r14)     // Catch:{ all -> 0x04b1 }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$h r0 = r1.f195219B     // Catch:{ all -> 0x04b1 }
                boolean r0 = r0.mo93479a()     // Catch:{ all -> 0x04b1 }
                if (r0 == 0) goto L_0x02b9
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r3 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s     // Catch:{ all -> 0x04b1 }
                monitor-enter(r3)     // Catch:{ all -> 0x04b1 }
                r0 = 1
                r1.f195233s = r0     // Catch:{ all -> 0x02b6 }
                r3.notifyAll()     // Catch:{ all -> 0x02b6 }
                monitor-exit(r3)     // Catch:{ all -> 0x02b6 }
                if (r2 != 0) goto L_0x02b3
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x04b1 }
                java.lang.String r3 = "MicroMsg.GLThread"
                java.lang.String r13 = "notifyOnEglSurfaceChanged"
                p413ok.C77014c.m92922b(r3, r13, r0)     // Catch:{ all -> 0x04b1 }
                java.lang.ref.WeakReference<com.tencent.mm.dynamicbackground.view.GameGLSurfaceView> r0 = r1.f195220C     // Catch:{ all -> 0x04b1 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x04b1 }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView r0 = (com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView) r0     // Catch:{ all -> 0x04b1 }
                if (r0 == 0) goto L_0x02b3
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$m r0 = r0.f195207g     // Catch:{ all -> 0x04b1 }
                r0.mo93422a(r6)     // Catch:{ all -> 0x04b1 }
            L_0x02b3:
                r0 = 0
                r3 = 0
                goto L_0x02d6
            L_0x02b6:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x02b6 }
                throw r0     // Catch:{ all -> 0x04b1 }
            L_0x02b9:
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.String r13 = "egl createSurface error"
                r14 = 0
                java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ all -> 0x04b1 }
                p413ok.C77014c.m92921a(r0, r13, r14)     // Catch:{ all -> 0x04b1 }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r13 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s     // Catch:{ all -> 0x04b1 }
                monitor-enter(r13)     // Catch:{ all -> 0x04b1 }
                r0 = 1
                r1.f195233s = r0     // Catch:{ all -> 0x02d3 }
                r1.f195229o = r0     // Catch:{ all -> 0x02d3 }
                r13.notifyAll()     // Catch:{ all -> 0x02d3 }
                monitor-exit(r13)     // Catch:{ all -> 0x02d3 }
                r16 = r2
                goto L_0x048e
            L_0x02d3:
                r0 = move-exception
                monitor-exit(r13)     // Catch:{ all -> 0x02d3 }
                throw r0     // Catch:{ all -> 0x04b1 }
            L_0x02d6:
                if (r7 == 0) goto L_0x0317
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.String r6 = "createGLInterface"
                r7 = 0
                java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x04b1 }
                p413ok.C77014c.m92924d(r0, r6, r7)     // Catch:{ all -> 0x04b1 }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$h r0 = r1.f195219B     // Catch:{ all -> 0x04b1 }
                javax.microedition.khronos.egl.EGLContext r6 = r0.f195256g     // Catch:{ all -> 0x04b1 }
                javax.microedition.khronos.opengles.GL r6 = r6.getGL()     // Catch:{ all -> 0x04b1 }
                java.lang.ref.WeakReference<com.tencent.mm.dynamicbackground.view.GameGLSurfaceView> r0 = r0.f195251b     // Catch:{ all -> 0x04b1 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x04b1 }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView r0 = (com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView) r0     // Catch:{ all -> 0x04b1 }
                if (r0 == 0) goto L_0x0313
                r0.getClass()     // Catch:{ all -> 0x04b1 }
                int r0 = r0.f195213p     // Catch:{ all -> 0x04b1 }
                r7 = r0 & 3
                if (r7 == 0) goto L_0x0313
                r7 = r0 & 1
                if (r7 == 0) goto L_0x0303
                r7 = 1
                goto L_0x0304
            L_0x0303:
                r7 = 0
            L_0x0304:
                r0 = r0 & 2
                if (r0 == 0) goto L_0x030e
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$l r0 = new com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$l     // Catch:{ all -> 0x04b1 }
                r0.<init>()     // Catch:{ all -> 0x04b1 }
                goto L_0x030f
            L_0x030e:
                r0 = 0
            L_0x030f:
                javax.microedition.khronos.opengles.GL r6 = android.opengl.GLDebugHelper.wrap(r6, r7, r0)     // Catch:{ all -> 0x04b1 }
            L_0x0313:
                javax.microedition.khronos.opengles.GL10 r6 = (javax.microedition.khronos.opengles.GL10) r6     // Catch:{ all -> 0x04b1 }
                r0 = 0
                r7 = 0
            L_0x0317:
                if (r2 == 0) goto L_0x0321
                java.lang.ref.WeakReference<com.tencent.mm.dynamicbackground.view.GameGLSurfaceView> r0 = r1.f195220C     // Catch:{ all -> 0x04b1 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x04b1 }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView r0 = (com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView) r0     // Catch:{ all -> 0x04b1 }
            L_0x0321:
                if (r2 == 0) goto L_0x034f
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.String r2 = "createEglContext"
                r13 = 0
                java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x04b1 }
                p413ok.C77014c.m92924d(r0, r2, r13)     // Catch:{ all -> 0x04b1 }
                java.lang.ref.WeakReference<com.tencent.mm.dynamicbackground.view.GameGLSurfaceView> r0 = r1.f195220C     // Catch:{ all -> 0x04b1 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x04b1 }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView r0 = (com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView) r0     // Catch:{ all -> 0x04b1 }
                if (r0 == 0) goto L_0x0341
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$m r0 = r0.f195207g     // Catch:{ all -> 0x04b1 }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$h r2 = r1.f195219B     // Catch:{ all -> 0x04b1 }
                javax.microedition.khronos.egl.EGLConfig r2 = r2.f195255f     // Catch:{ all -> 0x04b1 }
                r0.mo93423b(r6, r2)     // Catch:{ all -> 0x04b1 }
                goto L_0x034b
            L_0x0341:
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.String r2 = "alvinluo GLSurfaceView null"
                r13 = 0
                java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x04b1 }
                p413ok.C77014c.m92921a(r0, r2, r13)     // Catch:{ all -> 0x04b1 }
            L_0x034b:
                r0 = 0
                r2 = 0
                goto L_0x0028
            L_0x034f:
                if (r8 == 0) goto L_0x039e
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x04b1 }
                r8.<init>()     // Catch:{ all -> 0x04b1 }
                java.lang.String r13 = "onSurfaceChanged("
                r8.append(r13)     // Catch:{ all -> 0x04b1 }
                r8.append(r9)     // Catch:{ all -> 0x04b1 }
                java.lang.String r13 = ", "
                r8.append(r13)     // Catch:{ all -> 0x04b1 }
                r8.append(r10)     // Catch:{ all -> 0x04b1 }
                java.lang.String r13 = ")"
                r8.append(r13)     // Catch:{ all -> 0x04b1 }
                java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x04b1 }
                r13 = 0
                java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x04b1 }
                p413ok.C77014c.m92924d(r0, r8, r13)     // Catch:{ all -> 0x04b1 }
                java.lang.ref.WeakReference<com.tencent.mm.dynamicbackground.view.GameGLSurfaceView> r0 = r1.f195220C     // Catch:{ all -> 0x04b1 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x04b1 }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView r0 = (com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView) r0     // Catch:{ all -> 0x04b1 }
                if (r0 == 0) goto L_0x039d
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$m r0 = r0.f195207g     // Catch:{ all -> 0x0391 }
                r0.mo93425d(r6, r9, r10)     // Catch:{ all -> 0x0391 }
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.String r8 = "GLThread#sizeChanged out synchronized"
                r13 = 0
                java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x04b1 }
                p413ok.C77014c.m92921a(r0, r8, r13)     // Catch:{ all -> 0x04b1 }
                goto L_0x039d
            L_0x0391:
                r0 = move-exception
                java.lang.String r2 = "MicroMsg.GLThread"
                java.lang.String r3 = "GLThread#sizeChanged out synchronized"
                r4 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x04b1 }
                p413ok.C77014c.m92921a(r2, r3, r4)     // Catch:{ all -> 0x04b1 }
                throw r0     // Catch:{ all -> 0x04b1 }
            L_0x039d:
                r8 = 0
            L_0x039e:
                java.lang.ref.WeakReference<com.tencent.mm.dynamicbackground.view.GameGLSurfaceView> r0 = r1.f195220C     // Catch:{ all -> 0x04b1 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x04b1 }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView r0 = (com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView) r0     // Catch:{ all -> 0x04b1 }
                if (r0 == 0) goto L_0x0416
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$m r13 = r0.f195207g     // Catch:{ Exception -> 0x03b2 }
                long r13 = r13.mo93426e()     // Catch:{ Exception -> 0x03b2 }
                java.lang.Thread.sleep(r13)     // Catch:{ Exception -> 0x03b2 }
                goto L_0x03bc
            L_0x03b2:
                java.lang.String r13 = "MicroMsg.GLThread"
                java.lang.String r14 = "sleep exception"
                r15 = 0
                java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ all -> 0x04b1 }
                p413ok.C77014c.m92924d(r13, r14, r15)     // Catch:{ all -> 0x04b1 }
            L_0x03bc:
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r13 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s     // Catch:{ all -> 0x04b1 }
                monitor-enter(r13)     // Catch:{ all -> 0x04b1 }
                java.lang.Object r14 = r1.f195218A     // Catch:{ all -> 0x0413 }
                monitor-enter(r14)     // Catch:{ all -> 0x0413 }
                boolean r15 = r19.mo93468b()     // Catch:{ all -> 0x0410 }
                if (r15 == 0) goto L_0x03d7
                boolean r15 = r1.f195226i     // Catch:{ all -> 0x0410 }
                if (r15 != 0) goto L_0x03d7
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$m r0 = r0.f195207g     // Catch:{ all -> 0x0410 }
                r15 = 0
                r0.mo93427f(r6, r15)     // Catch:{ all -> 0x0410 }
                r16 = r2
                r17 = r3
                goto L_0x040d
            L_0x03d7:
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.String r15 = "not ready to draw now %b %b %b %b"
                r16 = r2
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0410 }
                r17 = r3
                boolean r3 = r1.f195226i     // Catch:{ all -> 0x0410 }
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0410 }
                r18 = 0
                r2[r18] = r3     // Catch:{ all -> 0x0410 }
                boolean r3 = r1.f195227j     // Catch:{ all -> 0x0410 }
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0410 }
                r18 = 1
                r2[r18] = r3     // Catch:{ all -> 0x0410 }
                boolean r3 = r1.f195228n     // Catch:{ all -> 0x0410 }
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0410 }
                r18 = 2
                r2[r18] = r3     // Catch:{ all -> 0x0410 }
                boolean r3 = r1.f195229o     // Catch:{ all -> 0x0410 }
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0410 }
                r18 = 3
                r2[r18] = r3     // Catch:{ all -> 0x0410 }
                p413ok.C77014c.m92922b(r0, r15, r2)     // Catch:{ all -> 0x0410 }
            L_0x040d:
                monitor-exit(r14)     // Catch:{ all -> 0x0410 }
                monitor-exit(r13)     // Catch:{ all -> 0x0413 }
                goto L_0x041a
            L_0x0410:
                r0 = move-exception
                monitor-exit(r14)     // Catch:{ all -> 0x0410 }
                throw r0     // Catch:{ all -> 0x0413 }
            L_0x0413:
                r0 = move-exception
                monitor-exit(r13)     // Catch:{ all -> 0x0413 }
                throw r0     // Catch:{ all -> 0x04b1 }
            L_0x0416:
                r16 = r2
                r17 = r3
            L_0x041a:
                java.lang.ref.WeakReference<com.tencent.mm.dynamicbackground.view.GameGLSurfaceView> r0 = r1.f195220C     // Catch:{ all -> 0x04b1 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x04b1 }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView r0 = (com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView) r0     // Catch:{ all -> 0x04b1 }
                java.lang.ref.WeakReference<com.tencent.mm.dynamicbackground.view.GameGLSurfaceView> r0 = r1.f195220C     // Catch:{ all -> 0x04b1 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x04b1 }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView r0 = (com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView) r0     // Catch:{ all -> 0x04b1 }
                if (r0 == 0) goto L_0x0431
                boolean r2 = r0.getIsSwapNow()     // Catch:{ all -> 0x04b1 }
                goto L_0x0432
            L_0x0431:
                r2 = 1
            L_0x0432:
                r3 = 12288(0x3000, float:1.7219E-41)
                if (r2 == 0) goto L_0x043d
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$h r2 = r1.f195219B     // Catch:{ all -> 0x04b1 }
                int r2 = r2.mo93483f()     // Catch:{ all -> 0x04b1 }
                goto L_0x043f
            L_0x043d:
                r2 = 12288(0x3000, float:1.7219E-41)
            L_0x043f:
                if (r0 == 0) goto L_0x0445
                r13 = 1
                r0.setSwapNow(r13)     // Catch:{ all -> 0x04b1 }
            L_0x0445:
                if (r2 == r3) goto L_0x0487
                r0 = 12302(0x300e, float:1.7239E-41)
                if (r2 == r0) goto L_0x0467
                java.lang.String r0 = "GLThread"
                java.lang.String r3 = "eglSwapBuffers"
                java.lang.String r2 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68033h.m80354d(r3, r2)     // Catch:{ all -> 0x04b1 }
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x04b1 }
                p413ok.C77014c.m92924d(r0, r2, r3)     // Catch:{ all -> 0x04b1 }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r2 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s     // Catch:{ all -> 0x04b1 }
                monitor-enter(r2)     // Catch:{ all -> 0x04b1 }
                r0 = 1
                r1.f195229o = r0     // Catch:{ all -> 0x0464 }
                r2.notifyAll()     // Catch:{ all -> 0x0464 }
                monitor-exit(r2)     // Catch:{ all -> 0x0464 }
                goto L_0x0488
            L_0x0464:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0464 }
                throw r0     // Catch:{ all -> 0x04b1 }
            L_0x0467:
                r0 = 1
                java.lang.String r2 = "MicroMsg.GLThread"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x04b1 }
                r3.<init>()     // Catch:{ all -> 0x04b1 }
                java.lang.String r4 = "egl context lost tid="
                r3.append(r4)     // Catch:{ all -> 0x04b1 }
                long r13 = r19.getId()     // Catch:{ all -> 0x04b1 }
                r3.append(r13)     // Catch:{ all -> 0x04b1 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x04b1 }
                r4 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x04b1 }
                p413ok.C77014c.m92922b(r2, r3, r4)     // Catch:{ all -> 0x04b1 }
                r4 = 1
                goto L_0x0488
            L_0x0487:
                r0 = 1
            L_0x0488:
                if (r12 == 0) goto L_0x048c
                r12 = 0
                r5 = r0
            L_0x048c:
                r3 = r17
            L_0x048e:
                r0 = 0
                r2 = r16
                goto L_0x0028
            L_0x0493:
                r14 = r5
                java.lang.String r0 = "MicroMsg.GLThread"
                java.lang.String r4 = "readyToDraw but not haveEglSurface"
                r5 = 0
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x04ae }
                p413ok.C77014c.m92921a(r0, r4, r5)     // Catch:{ all -> 0x04ae }
                goto L_0x04a4
            L_0x049f:
                r14 = r5
                r2 = r16
                r3 = r17
            L_0x04a4:
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r0 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s     // Catch:{ all -> 0x04ae }
                r0.wait()     // Catch:{ all -> 0x04ae }
                r0 = 0
                r5 = r14
                r4 = r15
                goto L_0x002b
            L_0x04ae:
                r0 = move-exception
                monitor-exit(r13)     // Catch:{ all -> 0x04ae }
                throw r0     // Catch:{ all -> 0x04b1 }
            L_0x04b1:
                r0 = move-exception
                java.lang.String r2 = "MicroMsg.GLThread"
                java.lang.String r3 = "alvinluo guardedRun exception"
                r4 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x04cc }
                p413ok.C77014c.m92923c(r2, r0, r3, r4)     // Catch:{ all -> 0x04cc }
                java.lang.ref.WeakReference<com.tencent.mm.dynamicbackground.view.GameGLSurfaceView> r2 = r1.f195220C     // Catch:{ all -> 0x04cc }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x04cc }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView r2 = (com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView) r2     // Catch:{ all -> 0x04cc }
                if (r2 == 0) goto L_0x04cb
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$m r2 = r2.f195207g     // Catch:{ all -> 0x04cc }
                r2.onError(r0)     // Catch:{ all -> 0x04cc }
            L_0x04cb:
                return
            L_0x04cc:
                r0 = move-exception
                throw r0
            L_0x04ce:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x04ce }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.mo93467a():void");
        }

        /* renamed from: b */
        public final boolean mo93468b() {
            return !this.f195227j && this.f195228n && !this.f195229o && this.f195234t > 0 && this.f195235u > 0 && (this.f195237w || this.f195236v == 1);
        }

        /* renamed from: c */
        public final void mo93469c() {
            if (this.f195231q) {
                this.f195231q = false;
                GameGLSurfaceView.f195203s.notifyAll();
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x003c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "MicroMsg.GLThread"
                r0.append(r1)
                long r2 = r6.getId()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r6.setName(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "starting tid="
                r0.append(r2)
                long r2 = r6.getId()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                p413ok.C77014c.m92922b(r1, r0, r3)
                int r0 = android.os.Process.myTid()     // Catch:{ Exception -> 0x003c }
                r3 = -8
                android.os.Process.setThreadPriority(r0, r3)     // Catch:{ Exception -> 0x003c }
            L_0x003c:
                r6.mo93467a()     // Catch:{ InterruptedException -> 0x0064, all -> 0x0045 }
            L_0x003f:
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r0 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s
                r0.mo93472a(r6)
                goto L_0x006f
            L_0x0045:
                r0 = move-exception
                java.lang.String r3 = "alvinluo GLThread#run() stack = [%s]"
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0070 }
                java.lang.String r5 = android.util.Log.getStackTraceString(r0)     // Catch:{ all -> 0x0070 }
                r4[r2] = r5     // Catch:{ all -> 0x0070 }
                p413ok.C77014c.m92921a(r1, r3, r4)     // Catch:{ all -> 0x0070 }
                java.lang.ref.WeakReference<com.tencent.mm.dynamicbackground.view.GameGLSurfaceView> r1 = r6.f195220C     // Catch:{ all -> 0x0070 }
                java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0070 }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView r1 = (com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView) r1     // Catch:{ all -> 0x0070 }
                if (r1 == 0) goto L_0x003f
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$m r1 = r1.f195207g     // Catch:{ all -> 0x0070 }
                r1.onError(r0)     // Catch:{ all -> 0x0070 }
                goto L_0x003f
            L_0x0064:
                r0 = move-exception
                java.lang.String r3 = "InterruptedException"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0070 }
                p413ok.C77014c.m92923c(r1, r0, r3, r2)     // Catch:{ all -> 0x0070 }
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r0 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s
                goto L_0x003f
            L_0x006f:
                return
            L_0x0070:
                r0 = move-exception
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j r1 = com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.f195203s
                r1.mo93472a(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView.C68025i.run():void");
        }
    }

    /* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$j */
    public static class C68027j {
        public C68027j(C77104b bVar) {
        }

        /* renamed from: a */
        public synchronized void mo93472a(C68025i iVar) {
            C77014c.m92922b("MicroMsg.GLThread", "exiting tid=" + iVar.getId(), new Object[0]);
            GameGLSurfaceView gameGLSurfaceView = iVar.f195220C.get();
            if (gameGLSurfaceView != null) {
                gameGLSurfaceView.f195207g.onDestroy();
            } else {
                C77014c.m92922b("MicroMsg.GLThread", "onFinalize:view = null", new Object[0]);
            }
            C68033h hVar = iVar.f195219B;
            hVar.getClass();
            C77014c.m92924d("MicroMsg.GLThread", "destroySurface()  tid=" + Thread.currentThread().getId(), new Object[0]);
            hVar.mo93480b();
            if (iVar.f195232r) {
                iVar.f195232r = false;
                iVar.f195233s = false;
            }
            iVar.mo93469c();
            try {
                iVar.f195219B.mo93481c();
            } catch (Throwable th) {
                C77014c.m92921a("GLThreadManager", "alvinluo GLThread#threadExiting finish stack = [%s]", Log.getStackTraceString(th));
                if (gameGLSurfaceView != null) {
                    gameGLSurfaceView.f195207g.onError(th);
                }
            }
            iVar.f195223f.quit();
            notifyAll();
        }
    }

    /* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$k */
    public interface C68028k {
        /* renamed from: a */
        GL mo93473a(GL gl);
    }

    /* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$l */
    public static class C68029l extends Writer {

        /* renamed from: d */
        public StringBuilder f195242d = new StringBuilder();

        /* renamed from: a */
        public final void mo93474a() {
            if (this.f195242d.length() > 0) {
                String sb = this.f195242d.toString();
                Object[] objArr = new Object[0];
                if (C77014c.f225001a != null) {
                    String format = String.format(sb, objArr);
                    if (format == null) {
                        format = "";
                    }
                    C77014c.f225001a.mo59897v("GLSurfaceView", format);
                }
                StringBuilder sb4 = this.f195242d;
                sb4.delete(0, sb4.length());
            }
        }

        public void close() {
            mo93474a();
        }

        public void flush() {
            mo93474a();
        }

        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == 10) {
                    mo93474a();
                } else {
                    this.f195242d.append(c);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$m */
    public interface C68030m {
        /* renamed from: a */
        void mo93422a(GL10 gl10);

        /* renamed from: b */
        void mo93423b(GL10 gl10, EGLConfig eGLConfig);

        /* renamed from: c */
        void mo93424c();

        /* renamed from: d */
        void mo93425d(GL10 gl10, int i, int i2);

        /* renamed from: e */
        long mo93426e();

        /* renamed from: f */
        void mo93427f(GL10 gl10, boolean z);

        void onDestroy();

        void onError(Throwable th);

        void onPause();

        void onResume();
    }

    /* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$n */
    public class C68031n extends C68032b {
        public C68031n(GameGLSurfaceView gameGLSurfaceView, boolean z) {
            super(gameGLSurfaceView, 8, 8, 8, 8, 16, 8);
        }
    }

    /* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$b */
    public class C68032b extends C68019a {

        /* renamed from: b */
        public int[] f195243b = new int[1];

        /* renamed from: c */
        public int f195244c;

        /* renamed from: d */
        public int f195245d;

        /* renamed from: e */
        public int f195246e;

        /* renamed from: f */
        public int f195247f;

        /* renamed from: g */
        public int f195248g;

        /* renamed from: h */
        public int f195249h;

        public C68032b(GameGLSurfaceView gameGLSurfaceView, int i, int i2, int i3, int i4, int i5, int i6) {
            super(gameGLSurfaceView, new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.f195244c = i;
            this.f195245d = i2;
            this.f195246e = i3;
            this.f195247f = i4;
            this.f195248g = i5;
            this.f195249h = i6;
        }

        /* renamed from: a */
        public final int mo93478a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f195243b) ? this.f195243b[0] : i2;
        }
    }

    /* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView$h */
    public static class C68033h {

        /* renamed from: a */
        public long f195250a = -1;

        /* renamed from: b */
        public WeakReference<GameGLSurfaceView> f195251b;

        /* renamed from: c */
        public EGL10 f195252c;

        /* renamed from: d */
        public EGLDisplay f195253d;

        /* renamed from: e */
        public EGLSurface f195254e;

        /* renamed from: f */
        public EGLConfig f195255f;

        /* renamed from: g */
        public EGLContext f195256g;

        /* renamed from: h */
        public EGLSurface f195257h;

        public C68033h(WeakReference<GameGLSurfaceView> weakReference) {
            this.f195251b = weakReference;
        }

        /* renamed from: d */
        public static String m80354d(String str, int i) {
            String str2;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" failed: ");
            switch (i) {
                case 12288:
                    str2 = "EGL_SUCCESS";
                    break;
                case 12289:
                    str2 = "EGL_NOT_INITIALIZED";
                    break;
                case 12290:
                    str2 = "EGL_BAD_ACCESS";
                    break;
                case 12291:
                    str2 = "EGL_BAD_ALLOC";
                    break;
                case 12292:
                    str2 = "EGL_BAD_ATTRIBUTE";
                    break;
                case 12293:
                    str2 = "EGL_BAD_CONFIG";
                    break;
                case 12294:
                    str2 = "EGL_BAD_CONTEXT";
                    break;
                case 12295:
                    str2 = "EGL_BAD_CURRENT_SURFACE";
                    break;
                case 12296:
                    str2 = "EGL_BAD_DISPLAY";
                    break;
                case 12297:
                    str2 = "EGL_BAD_MATCH";
                    break;
                case 12298:
                    str2 = "EGL_BAD_NATIVE_PIXMAP";
                    break;
                case 12299:
                    str2 = "EGL_BAD_NATIVE_WINDOW";
                    break;
                case 12300:
                    str2 = "EGL_BAD_PARAMETER";
                    break;
                case 12301:
                    str2 = "EGL_BAD_SURFACE";
                    break;
                case 12302:
                    str2 = "EGL_CONTEXT_LOST";
                    break;
                default:
                    str2 = "0x" + Integer.toHexString(i);
                    break;
            }
            sb.append(str2);
            return sb.toString();
        }

        /* renamed from: g */
        public static void m80355g(String str, int i) {
            String d = m80354d(str, i);
            C77014c.m92921a("MicroMsg.GLThread", "throwEglException tid=" + Thread.currentThread().getId() + " " + d, new Object[0]);
            throw new RuntimeException(d);
        }

        /* renamed from: a */
        public boolean mo93479a() {
            EGLSurface eGLSurface;
            C77014c.m92924d("MicroMsg.GLThread", "createSurface()  tid=" + Thread.currentThread().getId(), new Object[0]);
            if (this.f195252c == null) {
                throw new RuntimeException("egl not initialized");
            } else if (this.f195253d == null) {
                throw new RuntimeException("eglDisplay not initialized");
            } else if (this.f195255f != null) {
                mo93480b();
                GameGLSurfaceView gameGLSurfaceView = this.f195251b.get();
                if (gameGLSurfaceView != null) {
                    C68024g gVar = gameGLSurfaceView.f195211n;
                    EGL10 egl10 = this.f195252c;
                    EGLDisplay eGLDisplay = this.f195253d;
                    EGLConfig eGLConfig = this.f195255f;
                    SurfaceHolder holder = gameGLSurfaceView.getHolder();
                    ((C68021d) gVar).getClass();
                    try {
                        eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, holder, (int[]) null);
                    } catch (IllegalArgumentException e) {
                        C77014c.m92921a("MicroMsg.GameGLSurfaceView", "eglCreateWindowSurface", e);
                        eGLSurface = null;
                    }
                    this.f195254e = eGLSurface;
                } else {
                    this.f195254e = null;
                }
                EGLSurface eGLSurface2 = this.f195254e;
                if (eGLSurface2 == null || eGLSurface2 == EGL10.EGL_NO_SURFACE) {
                    if (this.f195252c.eglGetError() == 12299) {
                        C77014c.m92921a("MicroMsg.GLThread", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.", new Object[0]);
                    }
                    return false;
                } else if (!this.f195252c.eglMakeCurrent(this.f195253d, eGLSurface2, eGLSurface2, this.f195256g)) {
                    C77014c.m92924d("EGLHelper", m80354d("eglMakeCurrent", this.f195252c.eglGetError()), new Object[0]);
                    return false;
                } else {
                    EGLSurface eGLSurface3 = this.f195257h;
                    if (eGLSurface3 != null) {
                        this.f195252c.eglDestroySurface(this.f195253d, eGLSurface3);
                        this.f195257h = null;
                    }
                    return true;
                }
            } else {
                throw new RuntimeException("mEglConfig not initialized");
            }
        }

        /* renamed from: b */
        public final void mo93480b() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f195254e;
            if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                this.f195252c.eglMakeCurrent(this.f195253d, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                GameGLSurfaceView gameGLSurfaceView = this.f195251b.get();
                if (gameGLSurfaceView != null) {
                    C68024g gVar = gameGLSurfaceView.f195211n;
                    EGL10 egl10 = this.f195252c;
                    EGLDisplay eGLDisplay = this.f195253d;
                    EGLSurface eGLSurface3 = this.f195254e;
                    ((C68021d) gVar).getClass();
                    egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
                }
                this.f195254e = null;
            }
        }

        /* renamed from: c */
        public void mo93481c() {
            C77014c.m92924d("MicroMsg.GLThread", "finish() tid=" + Thread.currentThread().getId(), new Object[0]);
            if (this.f195256g != null) {
                GameGLSurfaceView gameGLSurfaceView = this.f195251b.get();
                if (gameGLSurfaceView != null) {
                    C68023f fVar = gameGLSurfaceView.f195210j;
                    EGL10 egl10 = this.f195252c;
                    EGLDisplay eGLDisplay = this.f195253d;
                    EGLContext eGLContext = this.f195256g;
                    ((C68020c) fVar).getClass();
                    C77014c.m92922b("MicroMsg.GLThread", " destroyContext tid=" + Thread.currentThread().getId(), new Object[0]);
                    if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                        C77014c.m92921a("MicroMsg.GLThread", "display:" + eGLDisplay + " context: " + eGLContext, new Object[0]);
                        m80355g("eglDestroyContex", egl10.eglGetError());
                        throw null;
                    }
                }
                this.f195256g = null;
            }
            EGLDisplay eGLDisplay2 = this.f195253d;
            if (eGLDisplay2 != null) {
                this.f195252c.eglTerminate(eGLDisplay2);
                this.f195253d = null;
            }
        }

        /* renamed from: e */
        public void mo93482e() {
            EGLConfig eGLConfig;
            int i;
            C77014c.m92924d("MicroMsg.GLThread", "start() tid=" + Thread.currentThread().getId(), new Object[0]);
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f195252c = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f195253d = eglGetDisplay;
            if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
                if (this.f195252c.eglInitialize(eglGetDisplay, new int[2])) {
                    GameGLSurfaceView gameGLSurfaceView = this.f195251b.get();
                    if (gameGLSurfaceView == null) {
                        this.f195255f = null;
                        this.f195256g = null;
                        C77014c.m92924d("MicroMsg.GameGLSurfaceView", "alvinluo EglHelper start but view is null and set mEglConfig = null, mEglContext = null", new Object[0]);
                    } else {
                        C68022e eVar = gameGLSurfaceView.f195209i;
                        EGL10 egl102 = this.f195252c;
                        EGLDisplay eGLDisplay = this.f195253d;
                        C68019a aVar = (C68019a) eVar;
                        int[] iArr = new int[1];
                        EGLDisplay eGLDisplay2 = eGLDisplay;
                        if (egl102.eglChooseConfig(eGLDisplay, aVar.f195216a, (EGLConfig[]) null, 0, iArr)) {
                            int i2 = iArr[0];
                            if (i2 > 0) {
                                EGLConfig[] eGLConfigArr = new EGLConfig[i2];
                                EGLConfig[] eGLConfigArr2 = eGLConfigArr;
                                int i3 = i2;
                                if (egl102.eglChooseConfig(eGLDisplay2, aVar.f195216a, eGLConfigArr, i2, iArr)) {
                                    C68032b bVar = (C68032b) aVar;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= i3) {
                                            eGLConfig = null;
                                            break;
                                        }
                                        EGLConfig eGLConfig2 = eGLConfigArr2[i4];
                                        C68032b bVar2 = bVar;
                                        EGL10 egl103 = egl102;
                                        EGLDisplay eGLDisplay3 = eGLDisplay2;
                                        EGLConfig eGLConfig3 = eGLConfig2;
                                        int i5 = i4;
                                        int a = bVar2.mo93478a(egl103, eGLDisplay3, eGLConfig3, 12325, 0);
                                        int a2 = bVar2.mo93478a(egl103, eGLDisplay3, eGLConfig3, 12326, 0);
                                        if (a >= bVar.f195248g && a2 >= bVar.f195249h) {
                                            C68032b bVar3 = bVar;
                                            EGL10 egl104 = egl102;
                                            EGLDisplay eGLDisplay4 = eGLDisplay2;
                                            EGLConfig eGLConfig4 = eGLConfig2;
                                            int a3 = bVar3.mo93478a(egl104, eGLDisplay4, eGLConfig4, 12324, 0);
                                            int a4 = bVar3.mo93478a(egl104, eGLDisplay4, eGLConfig4, 12323, 0);
                                            i = i3;
                                            int a5 = bVar3.mo93478a(egl104, eGLDisplay4, eGLConfig4, 12322, 0);
                                            int a6 = bVar3.mo93478a(egl104, eGLDisplay4, eGLConfig4, 12321, 0);
                                            if (a3 == bVar.f195244c && a4 == bVar.f195245d && a5 == bVar.f195246e && a6 == bVar.f195247f) {
                                                eGLConfig = eGLConfig2;
                                                break;
                                            }
                                        } else {
                                            i = i3;
                                        }
                                        i4 = i5 + 1;
                                        i3 = i;
                                    }
                                    if (eGLConfig != null) {
                                        this.f195255f = eGLConfig;
                                        C77014c.m92922b("MicroMsg.GameGLSurfaceView", "alvinluo EglHelper start chooseConfig end config: %s, display: %s", Integer.valueOf(eGLConfig.hashCode()), Integer.valueOf(this.f195253d.hashCode()));
                                        C68023f fVar = gameGLSurfaceView.f195210j;
                                        EGL10 egl105 = this.f195252c;
                                        EGLDisplay eGLDisplay5 = this.f195253d;
                                        EGLConfig eGLConfig5 = this.f195255f;
                                        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                                        C68020c cVar = (C68020c) fVar;
                                        cVar.getClass();
                                        C77014c.m92922b("MicroMsg.GLThread", "createContext", new Object[0]);
                                        int i6 = GameGLSurfaceView.this.f195214q;
                                        int[] iArr2 = {12440, i6, 12344};
                                        if (i6 == 0) {
                                            iArr2 = null;
                                        }
                                        this.f195256g = egl105.eglCreateContext(eGLDisplay5, eGLConfig5, eGLContext, iArr2);
                                        C77014c.m92922b("MicroMsg.GameGLSurfaceView", "alvinluo EglHelper start createContext end", new Object[0]);
                                    } else {
                                        throw new IllegalArgumentException("No config chosen");
                                    }
                                } else {
                                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                                }
                            } else {
                                throw new IllegalArgumentException("No configs match configSpec");
                            }
                        } else {
                            throw new IllegalArgumentException("eglChooseConfig failed");
                        }
                    }
                    EGLContext eGLContext2 = this.f195256g;
                    if (eGLContext2 == null || eGLContext2 == EGL10.EGL_NO_CONTEXT) {
                        this.f195256g = null;
                        m80355g("createContext", this.f195252c.eglGetError());
                        throw null;
                    }
                    C77014c.m92924d("MicroMsg.GLThread", "createContext " + this.f195256g + " tid=" + Thread.currentThread().getId(), new Object[0]);
                    EGLSurface eglCreatePbufferSurface = this.f195252c.eglCreatePbufferSurface(this.f195253d, this.f195255f, new int[]{12375, 16, 12374, 16, 12344});
                    this.f195257h = eglCreatePbufferSurface;
                    this.f195252c.eglMakeCurrent(this.f195253d, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f195256g);
                    this.f195250a = EGL14.eglGetCurrentContext().getNativeHandle();
                    this.f195254e = null;
                    return;
                }
                throw new RuntimeException("eglInitialize failed");
            }
            throw new RuntimeException("eglGetDisplay failed");
        }

        /* renamed from: f */
        public int mo93483f() {
            EGLSurface eGLSurface;
            EGLDisplay eGLDisplay = this.f195253d;
            if (eGLDisplay == null || eGLDisplay == EGL10.EGL_NO_DISPLAY || (eGLSurface = this.f195254e) == null || eGLSurface == EGL10.EGL_NO_SURFACE || this.f195252c.eglSwapBuffers(eGLDisplay, eGLSurface)) {
                return 12288;
            }
            return this.f195252c.eglGetError();
        }
    }

    public GameGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getHolder().addCallback(this);
    }

    /* renamed from: a */
    public final void mo93445a() {
        if (this.f195206f != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* renamed from: b */
    public void mo93446b() {
        C68025i iVar = this.f195206f;
        iVar.getClass();
        C77014c.m92922b("MicroMsg.GLThread", "onPause before ui lock tid=" + iVar.getId(), new Object[0]);
        synchronized (iVar.f195218A) {
            C77014c.m92922b("MicroMsg.GLThread", "onPause ui lock tid=" + iVar.getId(), new Object[0]);
            iVar.f195226i = true;
        }
        C77014c.m92922b("MicroMsg.GLThread", "onPause send command tid=" + iVar.getId(), new Object[0]);
        if (iVar.f195223f.isAlive()) {
            iVar.f195224g.sendEmptyMessage(2);
        }
    }

    public int getDebugFlags() {
        return this.f195213p;
    }

    public EGLContext getEGLContext() {
        return this.f195206f.f195219B.f195256g;
    }

    public long getEGLContextNativeHandle() {
        return this.f195206f.f195219B.f195250a;
    }

    public boolean getIsSwapNow() {
        return this.f195212o;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f195215r;
    }

    public int getRenderMode() {
        int i;
        C68025i iVar = this.f195206f;
        iVar.getClass();
        synchronized (f195203s) {
            i = iVar.f195236v;
        }
        return i;
    }

    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        C77014c.m92922b("MicroMsg.GameGLSurfaceView", "onAttachedToWindow reattach =" + this.f195208h, new Object[0]);
        if (this.f195208h && this.f195207g != null) {
            C68025i iVar = this.f195206f;
            if (iVar != null) {
                synchronized (f195203s) {
                    i = iVar.f195236v;
                }
            } else {
                i = 1;
            }
            C68025i iVar2 = new C68025i(this.f195205e);
            this.f195206f = iVar2;
            if (i != 1) {
                if (i < 0 || i > 1) {
                    throw new IllegalArgumentException("renderMode");
                }
                C68027j jVar = f195203s;
                synchronized (jVar) {
                    iVar2.f195236v = i;
                    jVar.notifyAll();
                }
            }
            this.f195206f.start();
        }
        this.f195208h = false;
    }

    public void onDetachedFromWindow() {
        C77014c.m92922b("MicroMsg.GameGLSurfaceView", "onDetachedFromWindow", new Object[0]);
        C68025i iVar = this.f195206f;
        if (iVar != null && iVar.f195223f.isAlive()) {
            iVar.f195224g.sendEmptyMessage(5);
        }
        this.f195208h = true;
        super.onDetachedFromWindow();
    }

    public void setDebugFlags(int i) {
        this.f195213p = i;
    }

    public void setEGLConfigChooser(C68022e eVar) {
        mo93445a();
        this.f195209i = eVar;
    }

    public void setEGLContextClientVersion(int i) {
        mo93445a();
        this.f195214q = i;
    }

    public void setEGLContextFactory(C68023f fVar) {
        mo93445a();
        this.f195210j = fVar;
    }

    public void setEGLWindowSurfaceFactory(C68024g gVar) {
        mo93445a();
        this.f195211n = gVar;
    }

    public void setFps(int i) {
    }

    public void setGLWrapper(C68028k kVar) {
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f195215r = z;
    }

    public void setRenderMode(int i) {
        C68025i iVar = this.f195206f;
        iVar.getClass();
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("renderMode");
        }
        C68027j jVar = f195203s;
        synchronized (jVar) {
            iVar.f195236v = i;
            jVar.notifyAll();
        }
    }

    public void setRenderer(C68030m mVar) {
        mo93445a();
        if (this.f195209i == null) {
            this.f195209i = new C68031n(this, true);
        }
        if (this.f195210j == null) {
            this.f195210j = new C68020c((C77104b) null);
        }
        if (this.f195211n == null) {
            this.f195211n = new C68021d((C77104b) null);
        }
        this.f195207g = mVar;
    }

    public void setSwapNow(boolean z) {
        this.f195212o = z;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C68025i iVar = this.f195206f;
        if (iVar.f195223f.isAlive()) {
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.arg1 = i2;
            obtain.arg2 = i3;
            iVar.f195224g.sendMessage(obtain);
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        C77014c.m92922b("MicroMsg.GameGLSurfaceView", "alvinluo GameGLSurfaceView surfaceCreated", new Object[0]);
        C68025i iVar = this.f195206f;
        if (iVar.f195223f.isAlive()) {
            iVar.f195224g.sendEmptyMessage(0);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C68025i iVar = this.f195206f;
        if (iVar.f195223f.isAlive()) {
            iVar.f195224g.sendEmptyMessage(1);
        }
    }

    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        C77014c.m92922b("MicroMsg.GameGLSurfaceView", "surfaceRedrawNeeded", new Object[0]);
        C68025i iVar = this.f195206f;
        if (iVar != null && iVar.f195223f.isAlive()) {
            iVar.f195224g.sendEmptyMessage(6);
        }
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser((C68022e) new C68031n(this, z));
    }

    public GameGLSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getHolder().addCallback(this);
    }
}
