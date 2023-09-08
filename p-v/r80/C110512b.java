package r80;

import android.opengl.EGLContext;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: r80.b */
public final class C110512b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EGLContext f330477d;

    /* renamed from: e */
    public final /* synthetic */ C110505a f330478e;

    /* renamed from: f */
    public final /* synthetic */ int f330479f;

    /* renamed from: g */
    public final /* synthetic */ int f330480g;

    /* renamed from: h */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f330481h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110512b(EGLContext eGLContext, C110505a aVar, int i, int i2, C32226l<? super Boolean, C13598b0> lVar) {
        super(0);
        this.f330477d = eGLContext;
        this.f330478e = aVar;
        this.f330479f = i;
        this.f330480g = i2;
        this.f330481h = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11.f330478e.f330438b, r1, "initWithSize error!", new java.lang.Object[0]);
        r0 = r11.f330481h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        if (r0 != null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
        r0.invoke(java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r11 = this;
            r0 = 0
            android.opengl.EGLContext r1 = r11.f330477d     // Catch:{ Exception -> 0x007d }
            r2 = 1
            if (r1 != 0) goto L_0x0034
            r80.a r1 = r11.f330478e     // Catch:{ Exception -> 0x007d }
            r1.getClass()     // Catch:{ Exception -> 0x007d }
            r80.a r1 = r11.f330478e     // Catch:{ Exception -> 0x007d }
            w80.d$a r3 = w80.C111742d.f334647a     // Catch:{ Exception -> 0x007d }
            r4 = 0
            r5 = 0
            int r6 = r11.f330479f     // Catch:{ Exception -> 0x007d }
            int r7 = r11.f330480g     // Catch:{ Exception -> 0x007d }
            r8 = 0
            r9 = 16
            r10 = 0
            w80.d$b r3 = w80.C111742d.C111743a.m152352k(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x007d }
            r1.f330441e = r3     // Catch:{ Exception -> 0x007d }
            r80.a r1 = r11.f330478e     // Catch:{ Exception -> 0x007d }
            s80.a r1 = r1.f330437a     // Catch:{ Exception -> 0x007d }
            r1.mo157955k(r2)     // Catch:{ Exception -> 0x007d }
            r80.a r1 = r11.f330478e     // Catch:{ Exception -> 0x007d }
            s80.a r3 = r1.f330437a     // Catch:{ Exception -> 0x007d }
            monitor-enter(r3)     // Catch:{ Exception -> 0x007d }
            android.graphics.SurfaceTexture r4 = r3.f331384i     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)     // Catch:{ Exception -> 0x007d }
            r1.f330444h = r4     // Catch:{ Exception -> 0x007d }
            goto L_0x0051
        L_0x0031:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x007d }
            throw r1     // Catch:{ Exception -> 0x007d }
        L_0x0034:
            r80.a r1 = r11.f330478e     // Catch:{ Exception -> 0x007d }
            r1.getClass()     // Catch:{ Exception -> 0x007d }
            r80.a r1 = r11.f330478e     // Catch:{ Exception -> 0x007d }
            w80.d$a r3 = w80.C111742d.f334647a     // Catch:{ Exception -> 0x007d }
            android.opengl.EGLContext r4 = r11.f330477d     // Catch:{ Exception -> 0x007d }
            r5 = 0
            int r6 = r11.f330479f     // Catch:{ Exception -> 0x007d }
            int r7 = r11.f330480g     // Catch:{ Exception -> 0x007d }
            w80.d$b r3 = r3.mo163458a(r4, r5, r6, r7)     // Catch:{ Exception -> 0x007d }
            r1.f330441e = r3     // Catch:{ Exception -> 0x007d }
            r80.a r1 = r11.f330478e     // Catch:{ Exception -> 0x007d }
            s80.a r1 = r1.f330437a     // Catch:{ Exception -> 0x007d }
            r1.mo157955k(r0)     // Catch:{ Exception -> 0x007d }
        L_0x0051:
            r80.a r1 = r11.f330478e     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = r1.f330438b     // Catch:{ Exception -> 0x007d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007d }
            r3.<init>()     // Catch:{ Exception -> 0x007d }
            r80.a r4 = r11.f330478e     // Catch:{ Exception -> 0x007d }
            int r4 = r4.hashCode()     // Catch:{ Exception -> 0x007d }
            r3.append(r4)     // Catch:{ Exception -> 0x007d }
            java.lang.String r4 = " initWithSize finish"
            r3.append(r4)     // Catch:{ Exception -> 0x007d }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x007d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ Exception -> 0x007d }
            r80.a r1 = r11.f330478e     // Catch:{ Exception -> 0x007d }
            r1.f330458v = r2     // Catch:{ Exception -> 0x007d }
            fy3.l<java.lang.Boolean, rx3.b0> r1 = r11.f330481h     // Catch:{ Exception -> 0x007d }
            if (r1 == 0) goto L_0x0092
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x007d }
            r1.invoke(r2)     // Catch:{ Exception -> 0x007d }
            goto L_0x0092
        L_0x007d:
            r1 = move-exception
            r80.a r2 = r11.f330478e
            java.lang.String r2 = r2.f330438b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "initWithSize error!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r0)
            fy3.l<java.lang.Boolean, rx3.b0> r0 = r11.f330481h
            if (r0 == 0) goto L_0x0092
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.invoke(r1)
        L_0x0092:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r80.C110512b.invoke():java.lang.Object");
    }
}
