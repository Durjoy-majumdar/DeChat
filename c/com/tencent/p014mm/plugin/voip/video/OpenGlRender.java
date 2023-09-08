package com.tencent.p014mm.plugin.voip.video;

import ac3.C103355g1;
import android.opengl.GLES20;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105175u;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.plugin.voip.video.GLTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import e43.C107224b;
import f43.C107474b;
import f43.C107476d;
import f43.C107479f;
import h81.C32735h;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p206nj.C88957l;
import w80.C111744e;

/* renamed from: com.tencent.mm.plugin.voip.video.OpenGlRender */
public final class OpenGlRender implements GLTextureView.C106495n {

    /* renamed from: B */
    public static int f318118B;

    /* renamed from: C */
    public static final Object f318119C = new Object();

    /* renamed from: D */
    public static final Object f318120D = new Object();

    /* renamed from: E */
    public static final Object f318121E = new Object();

    /* renamed from: F */
    public static boolean f318122F;

    /* renamed from: A */
    public boolean f318123A = false;

    /* renamed from: a */
    public boolean f318124a = false;

    /* renamed from: b */
    public boolean f318125b = false;

    /* renamed from: c */
    public int f318126c = 0;

    /* renamed from: d */
    public int f318127d = 0;

    /* renamed from: e */
    public WeakReference<OpenGlView> f318128e;

    /* renamed from: f */
    public int f318129f = 0;

    /* renamed from: g */
    public byte[] f318130g = null;

    /* renamed from: h */
    public int[] f318131h = null;

    /* renamed from: i */
    public int f318132i;

    /* renamed from: j */
    public int f318133j;

    /* renamed from: k */
    public int f318134k;

    /* renamed from: l */
    public C107224b f318135l = null;

    /* renamed from: m */
    public C107479f f318136m;

    /* renamed from: n */
    public C103355g1 f318137n = null;

    /* renamed from: o */
    public byte[] f318138o;

    /* renamed from: p */
    public int f318139p;

    /* renamed from: q */
    public int f318140q;

    /* renamed from: r */
    public boolean f318141r = false;

    /* renamed from: s */
    public int f318142s;

    /* renamed from: t */
    public int f318143t;

    /* renamed from: u */
    public boolean f318144u;

    /* renamed from: v */
    public int f318145v;

    /* renamed from: w */
    public int f318146w = 0;

    /* renamed from: x */
    public int f318147x = 0;

    /* renamed from: y */
    public int f318148y = 0;

    /* renamed from: z */
    public boolean f318149z = false;

    /* renamed from: com.tencent.mm.plugin.voip.video.OpenGlRender$a */
    public class C106497a implements Runnable {
        public C106497a() {
        }

        public void run() {
            OpenGlRender openGlRender = OpenGlRender.this;
            if (openGlRender.f318123A) {
                openGlRender.f318136m.mo157903e();
                OpenGlRender openGlRender2 = OpenGlRender.this;
                openGlRender2.f318123A = false;
                openGlRender2.f318130g = null;
                openGlRender2.f318131h = null;
                int i = OpenGlRender.f318118B;
                Log.m105924i("OpenGlRender", "detach finish");
            }
            Object obj = OpenGlRender.f318119C;
            synchronized (obj) {
                try {
                    obj.notifyAll();
                } catch (Exception e) {
                    int i2 = OpenGlRender.f318118B;
                    Log.printErrStackTrace("OpenGlRender", e, "", new Object[0]);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.OpenGlRender$b */
    public class C106498b implements Runnable {
        public C106498b() {
        }

        public void run() {
            OpenGlRender.this.f318136m.mo157903e();
            OpenGlRender openGlRender = OpenGlRender.this;
            openGlRender.f318123A = false;
            openGlRender.f318130g = null;
            openGlRender.f318131h = null;
            int i = OpenGlRender.f318118B;
            Log.m105924i("OpenGlRender", "detach finish");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.OpenGlRender$c */
    public class C106499c implements Runnable {
        public C106499c() {
        }

        public void run() {
            if (OpenGlRender.this.f318149z) {
                int i = OpenGlRender.f318118B;
                Log.m105924i("OpenGlRender", "attachGLContext");
                OpenGlRender openGlRender = OpenGlRender.this;
                openGlRender.f318149z = !openGlRender.f318136m.mo157899a();
                OpenGlRender openGlRender2 = OpenGlRender.this;
                openGlRender2.f318130g = null;
                openGlRender2.f318131h = null;
                Log.m105924i("OpenGlRender", "attach finish");
            }
            Object obj = OpenGlRender.f318120D;
            synchronized (obj) {
                try {
                    obj.notifyAll();
                } catch (Exception e) {
                    int i2 = OpenGlRender.f318118B;
                    Log.printErrStackTrace("OpenGlRender", e, "", new Object[0]);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.OpenGlRender$d */
    public class C106500d extends MMHandler {
        public C106500d(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            OpenGlRender.this.mo153109j();
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.OpenGlRender$e */
    public interface C106501e {
    }

    public OpenGlRender(OpenGlView openGlView, C106501e eVar, int i) {
        Class cls = C32735h.class;
        if (!f318122F) {
            C88957l.m111079o("mm_gl_disp", OpenGlRender.class.getClassLoader());
            f318122F = true;
        }
        this.f318129f = i;
        this.f318128e = new WeakReference<>(openGlView);
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            new C106500d(myLooper);
        } else {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                new C106500d(mainLooper);
            }
        }
        if (eVar != null) {
            new WeakReference(eVar);
        }
        if (m143736e() == 2) {
            this.f318135l = new C107224b();
        }
        this.f318136m = new C107479f();
        this.f318142s = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.wevis_android_ilink_voip_skin_smooth_weight, 0);
        this.f318143t = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.wevis_android_ilink_voip_skin_bright_weight, 0);
        Log.m105919d("OpenGlRender", "WeEffect face beauty skin smooth param %d", Integer.valueOf(this.f318142s));
        Log.m105919d("OpenGlRender", "WeEffect face beauty skin bright param %d", Integer.valueOf(this.f318143t));
        if (this.f318142s < 0) {
            this.f318142s = 0;
        }
        if (this.f318142s >= 100) {
            this.f318142s = 100;
        }
        if (this.f318143t < 0) {
            this.f318143t = 0;
        }
        if (this.f318143t >= 100) {
            this.f318143t = 100;
        }
        if (!(this.f318142s == 0 || this.f318143t == 0)) {
            this.f318141r = true;
        }
        this.f318130g = null;
    }

    private native void Init(int i, Object obj, int i2);

    private native void Uninit(int i);

    /* renamed from: e */
    public static int m143736e() {
        if (f318118B == 0) {
            f318118B = 2;
            Log.m105925i("OpenGlRender", "init gl version: %s", 2);
        }
        return f318118B;
    }

    private native void render32(int[] iArr, int i, int i2, int i3, int i4);

    private native void render8(byte[] bArr, int i, int i2, int i3, int i4);

    private native void setMode(int i, int i2, int i3, int i4);

    private native void setParam(float f, float f2, float f3, int i);

    /* renamed from: a */
    public final void mo153101a(boolean z) {
        WeakReference<OpenGlView> weakReference = this.f318128e;
        if (weakReference != null && weakReference.get() != null) {
            if (!z) {
                OpenGlView openGlView = this.f318128e.get();
                Log.m105925i("OpenGlRender", "attachGLContext:%s", openGlView);
                openGlView.mo153056b(new C106499c());
                Object obj = f318120D;
                synchronized (obj) {
                    try {
                        obj.wait(100);
                        Log.m105925i("OpenGlRender", "attachGLContext wait finish, bNeedAttach:%s", Boolean.valueOf(this.f318149z));
                    } catch (Exception e) {
                        Log.printErrStackTrace("OpenGlRender", e, "", new Object[0]);
                    }
                }
            } else if (this.f318149z) {
                Log.m105924i("OpenGlRender", "attachGLContext");
                this.f318149z = !this.f318136m.mo157899a();
                this.f318130g = null;
                this.f318131h = null;
                Log.m105924i("OpenGlRender", "attach finish");
            }
        }
    }

    /* renamed from: b */
    public final void mo153102b(boolean z) {
        WeakReference<OpenGlView> weakReference = this.f318128e;
        if (weakReference == null || weakReference.get() == null) {
            if (this.f318123A) {
                this.f318128e.get().mo153056b(new C106498b());
            }
        } else if (!z) {
            OpenGlView openGlView = this.f318128e.get();
            Log.m105925i("OpenGlRender", "detachGLContext:%s", openGlView);
            openGlView.mo153056b(new C106497a());
            Object obj = f318119C;
            synchronized (obj) {
                try {
                    obj.wait(100);
                    Log.m105925i("OpenGlRender", "detachGLContext wait finish, bNeedDetach:%s", Boolean.valueOf(this.f318123A));
                } catch (Exception e) {
                    Log.printErrStackTrace("OpenGlRender", e, "", new Object[0]);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo153103c(byte[] bArr, int i, int i2, int i3, boolean z, int i4) {
        if (this.f318124a && this.f318130g == null) {
            this.f318132i = i;
            this.f318133j = i2;
            this.f318134k = i3;
            this.f318130g = bArr;
            this.f318144u = z;
            this.f318145v = i4;
            mo153109j();
        }
    }

    /* renamed from: d */
    public void mo153104d(int[] iArr, int i, int i2, int i3, boolean z) {
        if (this.f318124a && this.f318131h == null) {
            this.f318132i = i;
            this.f318133j = i2;
            this.f318134k = i3;
            this.f318131h = iArr;
            this.f318144u = z;
            mo153109j();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x02d7 A[Catch:{ all -> 0x020e }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo153105f(javax.microedition.khronos.opengles.GL10 r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            int r2 = r1.f318146w
            r4 = 1
            r5 = 3
            r6 = 2
            r7 = 0
            if (r2 != 0) goto L_0x0372
            boolean r2 = r1.f318125b
            if (r2 == 0) goto L_0x0349
            boolean r2 = r1.f318124a
            if (r2 == 0) goto L_0x0349
            java.lang.ref.WeakReference<com.tencent.mm.plugin.voip.video.OpenGlView> r2 = r1.f318128e
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x001e
            goto L_0x0349
        L_0x001e:
            byte[] r2 = r1.f318130g
            if (r2 == 0) goto L_0x039b
            com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            boolean r2 = r1.f318144u
            f43.f r8 = r1.f318136m
            if (r8 == 0) goto L_0x0345
            r8.mo157904f(r7)
            f43.f r2 = r1.f318136m
            int r8 = r1.f318132i
            int r9 = r1.f318133j
            int r10 = r1.f318126c
            int r11 = r1.f318127d
            int r12 = r1.f318145v
            int r13 = r1.f318134k
            r2.getClass()
            r14 = 4
            if (r8 <= 0) goto L_0x01bb
            if (r9 <= 0) goto L_0x01bb
            int r15 = r13 >> 2
            r15 = r15 & r5
            int r13 = r13 >> r14
            r13 = r13 & r4
            if (r13 != r4) goto L_0x004d
            r13 = 1
            goto L_0x004e
        L_0x004d:
            r13 = 0
        L_0x004e:
            r2.f321578s = r7
            r2.f321579t = r7
            int r3 = r2.f321564e
            if (r8 != r3) goto L_0x0072
            int r3 = r2.f321565f
            if (r9 != r3) goto L_0x0072
            int r3 = r2.f321562c
            if (r10 != r3) goto L_0x0072
            int r3 = r2.f321563d
            if (r11 != r3) goto L_0x0072
            int r3 = r2.f321577r
            if (r3 != r15) goto L_0x0072
            boolean r3 = r2.f321576q
            if (r3 != r13) goto L_0x0072
            int r3 = r2.f321570k
            if (r3 != r12) goto L_0x0072
            int r3 = r2.f321559C
            if (r3 == 0) goto L_0x01bb
        L_0x0072:
            r2.f321577r = r15
            r2.f321576q = r13
            r2.f321570k = r12
            r2.f321559C = r7
            java.lang.String r3 = "MicroMsg.VoipRenderer"
            java.lang.String r13 = "setYUVDataSize mDataType is %s, mAngle is %s, mMirror is %s, width is %s, height is %s, screenWidth: %s, mScreenHeight: %s, renderType:%s, mSoftDrawCnt:%d, mHardDrawCnt:%d, mBeautyParam:%d,rotate is %s"
            r15 = 12
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r12)
            r15[r7] = r16
            int r7 = r2.f321577r
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r15[r4] = r7
            boolean r7 = r2.f321576q
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r15[r6] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r15[r5] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r15[r14] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r17 = 5
            r15[r17] = r7
            r7 = 6
            java.lang.Integer r17 = java.lang.Integer.valueOf(r11)
            r15[r7] = r17
            r7 = 7
            int r6 = r2.f321568i
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r15[r7] = r6
            r6 = 8
            int r7 = r2.f321557A
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r15[r6] = r7
            r6 = 9
            int r7 = r2.f321558B
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r15[r6] = r7
            r6 = 10
            r7 = 0
            java.lang.Integer r18 = java.lang.Integer.valueOf(r7)
            r15[r6] = r18
            r6 = 11
            int r7 = r2.f321559C
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r15[r6] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r13, r15)
            r2.f321564e = r8
            r2.f321565f = r9
            r2.f321562c = r10
            r2.f321563d = r11
            int r3 = r2.f321559C
            r2.mo157902d(r8, r9, r3)
            int r3 = r8 * r9
            int r6 = r3 / 4
            monitor-enter(r2)
            int r7 = r6 * 2
            int r10 = r3 + r7
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r10)     // Catch:{ all -> 0x01b8 }
            r2.f321571l = r10     // Catch:{ all -> 0x01b8 }
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)     // Catch:{ all -> 0x01b8 }
            r2.f321572m = r3     // Catch:{ all -> 0x01b8 }
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r6)     // Catch:{ all -> 0x01b8 }
            r2.f321573n = r3     // Catch:{ all -> 0x01b8 }
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r6)     // Catch:{ all -> 0x01b8 }
            r2.f321574o = r3     // Catch:{ all -> 0x01b8 }
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r7)     // Catch:{ all -> 0x01b8 }
            r2.f321575p = r3     // Catch:{ all -> 0x01b8 }
            monitor-exit(r2)     // Catch:{ all -> 0x01b8 }
            f43.c r3 = r2.f321560a
            if (r3 == 0) goto L_0x01bb
            if (r12 != r5) goto L_0x01bb
            f43.c r2 = r2.f321560a
            r2.getClass()
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r7 = 0
            r3[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r3[r4] = r6
            int r6 = r2.f321543q
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 2
            r3[r7] = r6
            int r6 = r2.f321544r
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r5] = r6
            java.lang.String r6 = "MicroMsg.VoipGLSProgram"
            java.lang.String r7 = "onOutputSizeChanged, width: %s, height: %s, outputWidth: %s, outputHeight: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r3)
            int r3 = r2.f321543q
            if (r8 != r3) goto L_0x0155
            int r3 = r2.f321544r
            if (r3 == r9) goto L_0x01bb
        L_0x0155:
            r2.f321543q = r8
            r2.f321544r = r9
            f43.a r3 = r2.f321532f
            r3.getClass()
            java.lang.Object[] r7 = new java.lang.Object[r14]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r11 = 0
            r7[r11] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r7[r4] = r10
            int r10 = r3.f321503d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 2
            r7[r11] = r10
            int r10 = r3.f321504e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7[r5] = r10
            java.lang.String r10 = "onOutputSizeChanged: %s %s, surfaceWidth:%s, surfaceHeight:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r7)
            if (r8 <= 0) goto L_0x01b2
            if (r9 > 0) goto L_0x0188
            goto L_0x01b2
        L_0x0188:
            int r7 = r3.f321505f
            if (r7 != r8) goto L_0x0190
            int r7 = r3.f321506g
            if (r7 == r9) goto L_0x01b2
        L_0x0190:
            r3.f321505f = r8
            r3.f321506g = r9
            r7 = 2
            java.lang.Object[] r10 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r11 = 0
            r10[r11] = r7
            int r7 = r3.f321506g
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10[r4] = r7
            java.lang.String r7 = "onOutputSizeChanged, outputWidth:%s, outputHeight:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r10)
            int r6 = r3.f321505f
            int r7 = r3.f321506g
            r3.mo157883d(r6, r7)
        L_0x01b2:
            rp3.g r2 = r2.f321533g
            r2.mo162167h(r8, r9)
            goto L_0x01bb
        L_0x01b8:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01b8 }
            throw r0
        L_0x01bb:
            f43.f r2 = r1.f318136m
            boolean r3 = r1.f318144u
            r2.f321581v = r3
            byte[] r3 = r1.f318130g
            int r6 = r1.f318145v
            monitor-enter(r2)
            r7 = 0
            r2.f321582w = r7     // Catch:{ all -> 0x020e }
            boolean r7 = r2.f321580u     // Catch:{ all -> 0x020e }
            if (r7 == 0) goto L_0x033c
            if (r3 == 0) goto L_0x033c
            r2.f321570k = r6     // Catch:{ all -> 0x020e }
            int r7 = r2.f321564e     // Catch:{ all -> 0x020e }
            int r8 = r2.f321565f     // Catch:{ all -> 0x020e }
            int r9 = r7 * r8
            int r9 = r9 * 3
            r10 = 2
            int r9 = r9 / r10
            if (r6 != r5) goto L_0x027a
            int r6 = r3.length     // Catch:{ all -> 0x020e }
            if (r6 != r9) goto L_0x024d
            int r6 = r2.f321579t     // Catch:{ all -> 0x020e }
            if (r6 != r4) goto L_0x0211
            rp3.m r6 = r2.f321583x     // Catch:{ all -> 0x020e }
            if (r6 == 0) goto L_0x0211
            int r6 = r6.mo162184c(r3, r7, r8)     // Catch:{ all -> 0x020e }
            r2.f321584y = r6     // Catch:{ all -> 0x020e }
            rp3.m r6 = r2.f321583x     // Catch:{ all -> 0x020e }
            float r6 = r6.f330940e     // Catch:{ all -> 0x020e }
            r7 = 1015222895(0x3c83126f, float:0.016)
            float r6 = r6 * r7
            r7 = 1020054733(0x3ccccccd, float:0.025)
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x0201
            r6 = 1020054733(0x3ccccccd, float:0.025)
        L_0x0201:
            r7 = 1011129254(0x3c449ba6, float:0.012)
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 >= 0) goto L_0x020b
            r6 = 1011129254(0x3c449ba6, float:0.012)
        L_0x020b:
            r2.f321585z = r6     // Catch:{ all -> 0x020e }
            goto L_0x0211
        L_0x020e:
            r0 = move-exception
            goto L_0x0343
        L_0x0211:
            java.nio.ByteBuffer r6 = r2.f321571l     // Catch:{ all -> 0x020e }
            r6.clear()     // Catch:{ all -> 0x020e }
            java.nio.ByteBuffer r6 = r2.f321572m     // Catch:{ all -> 0x020e }
            r6.clear()     // Catch:{ all -> 0x020e }
            java.nio.ByteBuffer r6 = r2.f321575p     // Catch:{ all -> 0x020e }
            r6.clear()     // Catch:{ all -> 0x020e }
            java.nio.ByteBuffer r6 = r2.f321571l     // Catch:{ all -> 0x020e }
            int r7 = r2.f321565f     // Catch:{ all -> 0x020e }
            int r8 = r2.f321564e     // Catch:{ all -> 0x020e }
            int r7 = r7 * r8
            int r7 = r7 * 3
            r5 = 2
            int r7 = r7 / r5
            r5 = 0
            r6.put(r3, r5, r7)     // Catch:{ all -> 0x020e }
            java.nio.ByteBuffer r5 = r2.f321572m     // Catch:{ all -> 0x020e }
            int r6 = r2.f321565f     // Catch:{ all -> 0x020e }
            int r7 = r2.f321564e     // Catch:{ all -> 0x020e }
            int r6 = r6 * r7
            r7 = 0
            r5.put(r3, r7, r6)     // Catch:{ all -> 0x020e }
            java.nio.ByteBuffer r5 = r2.f321575p     // Catch:{ all -> 0x020e }
            int r6 = r2.f321564e     // Catch:{ all -> 0x020e }
            int r7 = r2.f321565f     // Catch:{ all -> 0x020e }
            int r6 = r6 * r7
            int r7 = r6 / 2
            r5.put(r3, r6, r7)     // Catch:{ all -> 0x020e }
            r2.f321582w = r4     // Catch:{ all -> 0x020e }
            goto L_0x033c
        L_0x024d:
            java.lang.String r6 = "MicroMsg.VoipRenderer"
            java.lang.String r7 = "local yuvData size not match, realSize:%s, desiredSie:%s, videoSize:%sx%s"
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x020e }
            int r3 = r3.length     // Catch:{ all -> 0x020e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x020e }
            r10 = 0
            r8[r10] = r3     // Catch:{ all -> 0x020e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x020e }
            r8[r4] = r3     // Catch:{ all -> 0x020e }
            int r3 = r2.f321564e     // Catch:{ all -> 0x020e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x020e }
            r4 = 2
            r8[r4] = r3     // Catch:{ all -> 0x020e }
            int r3 = r2.f321565f     // Catch:{ all -> 0x020e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x020e }
            r8[r5] = r3     // Catch:{ all -> 0x020e }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r7, r8)     // Catch:{ all -> 0x020e }
            r3 = 0
            r2.f321582w = r3     // Catch:{ all -> 0x020e }
            goto L_0x033c
        L_0x027a:
            int r6 = r2.f321557A     // Catch:{ all -> 0x020e }
            int r6 = r6 + r4
            r2.f321557A = r6     // Catch:{ all -> 0x020e }
            int r6 = r6 % 100
            if (r6 != 0) goto L_0x02ac
            java.lang.String r6 = "MicroMsg.VoipRenderer"
            java.lang.String r8 = "steve: remote SW yuvData videoSize:%sx%s, mSoftDrawCnt:%d, mBeautyParam:%d"
            java.lang.Object[] r10 = new java.lang.Object[r14]     // Catch:{ all -> 0x020e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x020e }
            r11 = 0
            r10[r11] = r7     // Catch:{ all -> 0x020e }
            int r7 = r2.f321565f     // Catch:{ all -> 0x020e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x020e }
            r10[r4] = r7     // Catch:{ all -> 0x020e }
            int r7 = r2.f321557A     // Catch:{ all -> 0x020e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x020e }
            r11 = 2
            r10[r11] = r7     // Catch:{ all -> 0x020e }
            int r7 = r2.f321578s     // Catch:{ all -> 0x020e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x020e }
            r10[r5] = r7     // Catch:{ all -> 0x020e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r10)     // Catch:{ all -> 0x020e }
        L_0x02ac:
            int r6 = r3.length     // Catch:{ all -> 0x020e }
            if (r6 < r9) goto L_0x0311
            int r6 = r2.f321564e     // Catch:{ all -> 0x020e }
            int r7 = r2.f321565f     // Catch:{ all -> 0x020e }
            int r8 = r2.f321557A     // Catch:{ all -> 0x020e }
            int r8 = r8 % 100
            if (r8 != 0) goto L_0x02d4
            int r8 = r3.length     // Catch:{ all -> 0x020e }
            int r6 = r6 * r7
            int r7 = r6 * 3
            r10 = 2
            int r7 = r7 / r10
            if (r8 <= r7) goto L_0x02d2
            r7 = 0
            r8 = 0
        L_0x02c4:
            if (r7 >= r6) goto L_0x02cf
            byte r10 = r3[r7]     // Catch:{ all -> 0x020e }
            if (r10 != 0) goto L_0x02cc
            int r8 = r8 + 1
        L_0x02cc:
            int r7 = r7 + 1
            goto L_0x02c4
        L_0x02cf:
            if (r8 >= r6) goto L_0x02d2
            goto L_0x02d4
        L_0x02d2:
            r6 = 0
            goto L_0x02d5
        L_0x02d4:
            r6 = 1
        L_0x02d5:
            if (r6 == 0) goto L_0x0311
            java.nio.ByteBuffer r5 = r2.f321572m     // Catch:{ all -> 0x020e }
            r5.clear()     // Catch:{ all -> 0x020e }
            java.nio.ByteBuffer r5 = r2.f321573n     // Catch:{ all -> 0x020e }
            r5.clear()     // Catch:{ all -> 0x020e }
            java.nio.ByteBuffer r5 = r2.f321574o     // Catch:{ all -> 0x020e }
            r5.clear()     // Catch:{ all -> 0x020e }
            java.nio.ByteBuffer r5 = r2.f321572m     // Catch:{ all -> 0x020e }
            int r6 = r2.f321564e     // Catch:{ all -> 0x020e }
            int r7 = r2.f321565f     // Catch:{ all -> 0x020e }
            int r6 = r6 * r7
            r7 = 0
            r5.put(r3, r7, r6)     // Catch:{ all -> 0x020e }
            java.nio.ByteBuffer r5 = r2.f321573n     // Catch:{ all -> 0x020e }
            int r6 = r2.f321564e     // Catch:{ all -> 0x020e }
            int r7 = r2.f321565f     // Catch:{ all -> 0x020e }
            int r6 = r6 * r7
            int r7 = r6 / 4
            r5.put(r3, r6, r7)     // Catch:{ all -> 0x020e }
            java.nio.ByteBuffer r5 = r2.f321574o     // Catch:{ all -> 0x020e }
            int r6 = r2.f321564e     // Catch:{ all -> 0x020e }
            int r7 = r2.f321565f     // Catch:{ all -> 0x020e }
            int r6 = r6 * r7
            int r7 = r6 * 5
            int r7 = r7 / r14
            int r6 = r6 / r14
            r5.put(r3, r7, r6)     // Catch:{ all -> 0x020e }
            r2.f321582w = r4     // Catch:{ all -> 0x020e }
            goto L_0x033c
        L_0x0311:
            java.lang.String r6 = "MicroMsg.VoipRenderer"
            java.lang.String r7 = "remote yuvData size not match, realSize:%s, desiredSie:%s, videoSize:%sx%s"
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x020e }
            int r3 = r3.length     // Catch:{ all -> 0x020e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x020e }
            r10 = 0
            r8[r10] = r3     // Catch:{ all -> 0x020e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x020e }
            r8[r4] = r3     // Catch:{ all -> 0x020e }
            int r3 = r2.f321564e     // Catch:{ all -> 0x020e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x020e }
            r4 = 2
            r8[r4] = r3     // Catch:{ all -> 0x020e }
            int r3 = r2.f321565f     // Catch:{ all -> 0x020e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x020e }
            r8[r5] = r3     // Catch:{ all -> 0x020e }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r7, r8)     // Catch:{ all -> 0x020e }
            r3 = 0
            r2.f321582w = r3     // Catch:{ all -> 0x020e }
        L_0x033c:
            monitor-exit(r2)     // Catch:{ all -> 0x020e }
            f43.f r2 = r1.f318136m
            r2.onDrawFrame(r0)
            goto L_0x0345
        L_0x0343:
            monitor-exit(r2)     // Catch:{ all -> 0x020e }
            throw r0
        L_0x0345:
            r0 = 0
            r1.f318130g = r0
            goto L_0x039b
        L_0x0349:
            r0 = 0
            r1.f318130g = r0
            r1.f318131h = r0
            java.lang.String r0 = "OpenGlRender"
            java.lang.String r2 = "onDrawFrame return2, mfStarted:%b,mfInited:%b, isDrawingSelf:%s"
            java.lang.Object[] r3 = new java.lang.Object[r5]
            boolean r5 = r1.f318125b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6 = 0
            r3[r6] = r5
            boolean r5 = r1.f318124a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r3[r4] = r5
            boolean r4 = r1.f318144u
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 2
            r3[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r2, r3)
            return
        L_0x0372:
            com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            boolean r2 = r1.f318125b
            if (r2 == 0) goto L_0x039c
            boolean r2 = r1.f318124a
            if (r2 == 0) goto L_0x039c
            java.lang.ref.WeakReference<com.tencent.mm.plugin.voip.video.OpenGlView> r2 = r1.f318128e
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0386
            goto L_0x039c
        L_0x0386:
            f43.f r2 = r1.f318136m
            if (r2 == 0) goto L_0x039b
            boolean r2 = r1.f318149z
            if (r2 == 0) goto L_0x0391
            r1.mo153101a(r4)
        L_0x0391:
            f43.f r2 = r1.f318136m
            r2.onDrawFrame(r0)
            r0 = 0
            r1.f318130g = r0
            r1.f318131h = r0
        L_0x039b:
            return
        L_0x039c:
            r0 = 0
            r1.f318130g = r0
            r1.f318131h = r0
            java.lang.String r0 = "OpenGlRender"
            java.lang.String r2 = "onDrawFrame return3, mfStarted:%b,mfInited:%b, isDrawingSelf:%s"
            java.lang.Object[] r3 = new java.lang.Object[r5]
            boolean r5 = r1.f318125b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6 = 0
            r3[r6] = r5
            boolean r5 = r1.f318124a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r3[r4] = r5
            boolean r4 = r1.f318144u
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 2
            r3[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.video.OpenGlRender.mo153105f(javax.microedition.khronos.opengles.GL10):void");
    }

    /* renamed from: g */
    public void mo153106g() {
        Log.m105925i("OpenGlRender", "%s onStop, renderMode: %s", Integer.valueOf(hashCode()), Integer.valueOf(this.f318129f));
        this.f318125b = false;
    }

    /* renamed from: h */
    public void mo153107h(GL10 gl10, int i, int i2) {
        GL10 gl102 = gl10;
        int i3 = i;
        int i4 = i2;
        Class cls = C32735h.class;
        Log.m105925i("OpenGlRender", "%s onSurfaceChanged, width: %s, height: %s, self:%b, UI:%dx%d,mode:%d, lastHWDecSize:%dx%d", Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(this.f318144u), Integer.valueOf(this.f318126c), Integer.valueOf(this.f318127d), Integer.valueOf(this.f318129f), Integer.valueOf(this.f318147x), Integer.valueOf(this.f318148y));
        if (!(this.f318126c == i3 && this.f318127d == i4)) {
            gl102.glViewport(0, 0, i3, i4);
            this.f318126c = i3;
            this.f318127d = i4;
        }
        C107224b bVar = this.f318135l;
        if (bVar != null) {
            bVar.getClass();
            bVar.getClass();
        }
        C107479f fVar = this.f318136m;
        if (fVar != null) {
            fVar.onSurfaceChanged(gl102, i3, i4);
        }
        if (this.f318137n == null) {
            boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_voip_xsetting_allow_checkgpu, true);
            int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_facebeauty_gpu_rating_limited, 50);
            if (wf) {
                int i5 = -1;
                try {
                    int c = C111744e.f334654d.mo163480c();
                    if (c == -1) {
                        new C111744e().mo163475a();
                    }
                    i5 = c;
                } catch (Exception e) {
                    Log.printInfoStack("MicroMsg.GpuDetectorUtil", "error happened " + e, new Object[0]);
                }
                if (i5 < Qe) {
                    this.f318141r = false;
                }
            }
        }
        if (this.f318141r) {
            if (this.f318137n == null) {
                C103355g1 g1Var = new C103355g1(1);
                this.f318137n = g1Var;
                g1Var.mo143227G(this.f318142s, -1, -1, this.f318143t, -1);
                this.f318137n.mo143233a(false);
                C103355g1 g1Var2 = this.f318137n;
                g1Var2.mo143253t(0, g1Var2.f304795o[0]);
            }
            C103355g1 g1Var3 = this.f318137n;
            if (g1Var3 != null) {
                g1Var3.mo143224C(i3, i4);
                this.f318139p = i3;
                this.f318140q = i4;
            }
        }
        int i6 = this.f318146w;
        this.f318146w = i6;
        if (this.f318136m != null) {
            Log.printInfoStack("OpenGlRender", "setShowMode, mode:%d, uiWidth: %s, uiHeight: %s", Integer.valueOf(i6), Integer.valueOf(this.f318126c), Integer.valueOf(this.f318127d));
            if (i6 != 1) {
                this.f318123A = true;
                mo153102b(false);
            } else {
                if (this.f318123A) {
                    Log.m105924i("OpenGlRender", "is need to detach");
                    mo153102b(false);
                }
                this.f318149z = true;
                mo153101a(false);
            }
            this.f318136m.mo157904f(this.f318146w);
        }
        int i7 = this.f318147x;
        int i8 = this.f318148y;
        Log.m105924i("OpenGlRender", "video=" + i7 + "x" + i8);
        if (i7 <= 0 || i8 <= 0) {
            Log.m105921e("OpenGlRender", "ERROR video size:%dx%d, lastviddeosize:%dx%d ", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(this.f318147x), Integer.valueOf(this.f318148y));
            return;
        }
        this.f318147x = i7;
        this.f318148y = i8;
        C107479f fVar2 = this.f318136m;
        if (fVar2 != null) {
            Log.m105925i("MicroMsg.VoipRenderer", "setHWDecVideoSize: width:%s, height:%s", Integer.valueOf(i7), Integer.valueOf(i8));
            fVar2.f321566g = i7;
            fVar2.f321567h = i8;
            fVar2.mo157900b(i7, i8, C107474b.f321520f, C107474b.f321521g);
        }
    }

    /* renamed from: i */
    public void mo153108i(GL10 gl10, EGLConfig eGLConfig) {
        Log.m105924i("OpenGlRender", "onSurfaceCreated...");
        if (m143736e() == 2) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glDisable(2929);
        }
        C107479f fVar = this.f318136m;
        if (fVar != null) {
            fVar.onSurfaceCreated(gl10, eGLConfig);
        }
        if (v2protocal.f317545f2 == null) {
            C107476d b = C107476d.m145590b();
            b.getClass();
            try {
                b.f321555c = b.mo157898a();
                b.f321553a.set(false);
                Surface surface = new Surface(b.f321555c);
                v2protocal.f317547h2 = b.f321555c;
                v2protocal.f317546g2 = null;
                v2protocal.f317545f2 = surface;
                ((C105175u.C105176a) b.f321556d).mo149495a();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VoipHardDecodeUtil", e, "initSurfaceTexutre error", new Object[0]);
            }
        }
    }

    /* renamed from: j */
    public void mo153109j() {
        if (this.f318128e.get() != null) {
            GLTextureView.C106493j jVar = this.f318128e.get().f318059e;
            jVar.getClass();
            GLTextureView.C106494k kVar = GLTextureView.f318057r;
            synchronized (kVar) {
                jVar.f318097r = true;
                kVar.notifyAll();
            }
        }
    }
}
