package qr1;

import ac3.C103355g1;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.xeffect.VLogDirector;
import d03.C58010a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p80.C110194c;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: qr1.j */
public final class C110461j {

    /* renamed from: a */
    public int f330315a;

    /* renamed from: b */
    public int f330316b;

    /* renamed from: c */
    public final String f330317c = ("MicroMsg.TPTrackThumbRenderer@" + hashCode());

    /* renamed from: d */
    public C111742d.C65942b f330318d;

    /* renamed from: e */
    public HandlerThread f330319e;

    /* renamed from: f */
    public MMHandler f330320f;

    /* renamed from: g */
    public C32226l<? super Surface, C13598b0> f330321g;

    /* renamed from: h */
    public Surface f330322h;

    /* renamed from: i */
    public SurfaceTexture f330323i;

    /* renamed from: j */
    public C110194c f330324j;

    /* renamed from: k */
    public VLogDirector f330325k = new VLogDirector();

    /* renamed from: l */
    public C58010a f330326l;

    /* renamed from: m */
    public C110194c f330327m;

    /* renamed from: n */
    public boolean f330328n;

    /* renamed from: o */
    public C32227p<? super Bitmap, ? super Long, C13598b0> f330329o;

    /* renamed from: p */
    public volatile long f330330p;

    /* renamed from: qr1.j$a */
    public static final class C110462a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f330331d;

        public C110462a(C32224a aVar) {
            this.f330331d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f330331d.invoke();
        }
    }

    static {
        C103355g1.f304769J.mo143261a();
    }

    public C110461j(int i, int i2) {
        this.f330315a = i;
        this.f330316b = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x009e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m150367a(qr1.C110461j r18, long r19) {
        /*
            r0 = r18
            r1 = r19
            r18.getClass()
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r5 = 1000000(0xf4240, float:1.401298E-39)
            long r5 = (long) r5
            long r5 = r1 / r5
            long r7 = r0.f330330p
            long r7 = r5 - r7
            long r7 = java.lang.Math.abs(r7)
            r9 = 100
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0021
            goto L_0x013a
        L_0x0021:
            java.lang.String r7 = r0.f330317c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "renderFrame "
            r8.append(r9)
            r8.append(r5)
            r9 = 32
            r8.append(r9)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            p80.c r1 = r0.f330324j
            r2 = 0
            if (r1 == 0) goto L_0x0048
            int r1 = r1.f329652e
            r8 = r1
            goto L_0x0049
        L_0x0048:
            r8 = 0
        L_0x0049:
            if (r8 > 0) goto L_0x004d
            goto L_0x013a
        L_0x004d:
            d03.a r1 = r0.f330326l
            if (r1 == 0) goto L_0x0055
            int r7 = r1.f165950v
            r13 = r7
            goto L_0x0056
        L_0x0055:
            r13 = 0
        L_0x0056:
            if (r1 == 0) goto L_0x005c
            int r7 = r1.f165951w
            r14 = r7
            goto L_0x005d
        L_0x005c:
            r14 = 0
        L_0x005d:
            if (r1 == 0) goto L_0x0066
            int r1 = r1.f165939k
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            if (r1 != 0) goto L_0x006a
            goto L_0x0071
        L_0x006a:
            int r7 = r1.intValue()
            if (r7 != 0) goto L_0x0071
            goto L_0x009b
        L_0x0071:
            r7 = 90
            if (r1 != 0) goto L_0x0076
            goto L_0x007f
        L_0x0076:
            int r9 = r1.intValue()
            if (r9 != r7) goto L_0x007f
            r1 = 1
            r12 = 1
            goto L_0x009c
        L_0x007f:
            r7 = 180(0xb4, float:2.52E-43)
            if (r1 != 0) goto L_0x0084
            goto L_0x008d
        L_0x0084:
            int r9 = r1.intValue()
            if (r9 != r7) goto L_0x008d
            r1 = 2
            r12 = 2
            goto L_0x009c
        L_0x008d:
            r7 = 270(0x10e, float:3.78E-43)
            if (r1 != 0) goto L_0x0092
            goto L_0x009b
        L_0x0092:
            int r1 = r1.intValue()
            if (r1 != r7) goto L_0x009b
            r1 = 3
            r12 = 3
            goto L_0x009c
        L_0x009b:
            r12 = 0
        L_0x009c:
            if (r13 <= 0) goto L_0x013a
            if (r14 > 0) goto L_0x00a2
            goto L_0x013a
        L_0x00a2:
            qr3.c r1 = new qr3.c
            r11 = 1
            r7 = r1
            r9 = r13
            r10 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            android.graphics.Rect r7 = r1.f330358g
            r7.setEmpty()
            android.graphics.Rect r7 = r1.f330359h
            r7.set(r2, r2, r13, r14)
            android.graphics.Rect r7 = r1.f330359h
            android.graphics.Rect r8 = new android.graphics.Rect
            int r9 = r0.f330315a
            int r10 = r0.f330316b
            r8.<init>(r2, r2, r9, r10)
            sp3.C101692i.m133583a(r7, r8)
            java.util.List r1 = sx3.C26236u.m33719b(r1)
            p80.c r7 = r0.f330327m
            if (r7 == 0) goto L_0x00ce
            int r7 = r7.f329652e
            goto L_0x00cf
        L_0x00ce:
            r7 = 0
        L_0x00cf:
            if (r7 > 0) goto L_0x00d2
            goto L_0x013a
        L_0x00d2:
            boolean r8 = r0.f330328n
            if (r8 == 0) goto L_0x00f1
            r8 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r8, r7)
            r9 = 3553(0xde1, float:4.979E-42)
            r10 = 0
            r11 = 6408(0x1908, float:8.98E-42)
            int r12 = r0.f330315a
            int r13 = r0.f330316b
            r14 = 0
            r15 = 6408(0x1908, float:8.98E-42)
            r16 = 5121(0x1401, float:7.176E-42)
            r17 = 0
            android.opengl.GLES20.glTexImage2D(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            android.opengl.GLES20.glBindTexture(r8, r2)
        L_0x00f1:
            com.tencent.mm.xeffect.VLogDirector r8 = r0.f330325k
            r8.mo154916d(r1, r7, r5)
            fy3.p<? super android.graphics.Bitmap, ? super java.lang.Long, rx3.b0> r1 = r0.f330329o
            if (r1 == 0) goto L_0x0111
            w80.d$a r1 = w80.C111742d.f334647a
            int r5 = r0.f330315a
            int r6 = r0.f330316b
            android.graphics.Bitmap r1 = r1.mo163472r(r7, r5, r6)
            fy3.p<? super android.graphics.Bitmap, ? super java.lang.Long, rx3.b0> r5 = r0.f330329o
            if (r5 == 0) goto L_0x0111
            long r6 = r0.f330330p
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5.invoke(r1, r6)
        L_0x0111:
            w80.d$b r1 = r0.f330318d
            if (r1 == 0) goto L_0x011e
            w80.d$a r5 = w80.C111742d.f334647a
            android.opengl.EGLDisplay r6 = r1.f189591a
            android.opengl.EGLSurface r1 = r1.f189592b
            r5.mo163474t(r6, r1)
        L_0x011e:
            r0.f330328n = r2
            java.lang.String r0 = r0.f330317c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "renderFrame cost:"
            r1.append(r2)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x013a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qr1.C110461j.m150367a(qr1.j, long):void");
    }

    /* renamed from: b */
    public final void mo161947b(C32224a<C13598b0> aVar) {
        MMHandler mMHandler;
        C87412m.m108594g(aVar, "call");
        HandlerThread handlerThread = this.f330319e;
        boolean z = true;
        if (handlerThread == null || !handlerThread.isAlive()) {
            z = false;
        }
        if (z && (mMHandler = this.f330320f) != null) {
            mMHandler.post(new C110462a(aVar));
        }
    }
}
