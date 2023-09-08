package r80;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: r80.d */
public final class C110516d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110505a f330489d;

    /* renamed from: e */
    public final /* synthetic */ int f330490e;

    /* renamed from: f */
    public final /* synthetic */ boolean f330491f;

    /* renamed from: g */
    public final /* synthetic */ long f330492g;

    /* renamed from: h */
    public final /* synthetic */ boolean f330493h;

    /* renamed from: i */
    public final /* synthetic */ long f330494i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110516d(C110505a aVar, int i, boolean z, long j, boolean z2, long j2) {
        super(0);
        this.f330489d = aVar;
        this.f330490e = i;
        this.f330491f = z;
        this.f330492g = j;
        this.f330493h = z2;
        this.f330494i = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6.f330489d.f330438b, r1, "", new java.lang.Object[0]);
        r0 = r6.f330489d.f330442f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
        if (r0 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
        r0.invoke(java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r6 = this;
            r80.a r0 = r6.f330489d
            boolean r0 = r0.f330458v
            if (r0 != 0) goto L_0x0011
            r80.a r0 = r6.f330489d
            java.lang.String r0 = r0.f330438b
            java.lang.String r1 = "requestDraw not init now"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x00a6
        L_0x0011:
            r80.a r0 = r6.f330489d
            java.lang.String r0 = r0.f330438b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "requestDraw textureId:"
            r1.append(r2)
            int r2 = r6.f330490e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r0 = 0
            boolean r1 = r6.f330491f     // Catch:{ Exception -> 0x008f }
            if (r1 == 0) goto L_0x0042
            long r1 = r6.f330492g     // Catch:{ Exception -> 0x008f }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0042
            r3 = -1
            android.opengl.GLES30.glWaitSync(r1, r0, r3)     // Catch:{ Exception -> 0x008f }
            long r1 = r6.f330492g     // Catch:{ Exception -> 0x008f }
            android.opengl.GLES30.glDeleteSync(r1)     // Catch:{ Exception -> 0x008f }
        L_0x0042:
            boolean r1 = r6.f330493h     // Catch:{ Exception -> 0x008f }
            if (r1 == 0) goto L_0x0053
            com.tencent.mm.sdk.platformtools.MMConditionVariable r1 = v80.C111412a.f333532b     // Catch:{ Exception -> 0x008f }
            monitor-enter(r1)     // Catch:{ Exception -> 0x008f }
            r1.block()     // Catch:{ all -> 0x0050 }
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0050 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x008f }
            goto L_0x0053
        L_0x0050:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x008f }
            throw r2     // Catch:{ Exception -> 0x008f }
        L_0x0053:
            r80.a r1 = r6.f330489d     // Catch:{ Exception -> 0x008f }
            s80.a r1 = r1.f330437a     // Catch:{ Exception -> 0x008f }
            int r2 = r6.f330490e     // Catch:{ Exception -> 0x008f }
            r1.f331388m = r2     // Catch:{ Exception -> 0x008f }
            u80.a r1 = r1.f331382g     // Catch:{ Exception -> 0x008f }
            if (r1 == 0) goto L_0x0062
            r1.mo159578p(r2)     // Catch:{ Exception -> 0x008f }
        L_0x0062:
            r80.a r1 = r6.f330489d     // Catch:{ Exception -> 0x008f }
            s80.a r1 = r1.f330437a     // Catch:{ Exception -> 0x008f }
            r1.mo157957p()     // Catch:{ Exception -> 0x008f }
            r80.a r1 = r6.f330489d     // Catch:{ Exception -> 0x008f }
            android.view.Surface r2 = r1.f330443g     // Catch:{ Exception -> 0x008f }
            if (r2 == 0) goto L_0x0083
            long r2 = r6.f330494i     // Catch:{ Exception -> 0x008f }
            r1.mo161981j(r2)     // Catch:{ Exception -> 0x008f }
            r80.a r1 = r6.f330489d     // Catch:{ Exception -> 0x008f }
            w80.d$b r1 = r1.f330441e     // Catch:{ Exception -> 0x008f }
            if (r1 == 0) goto L_0x0083
            w80.d$a r2 = w80.C111742d.f334647a     // Catch:{ Exception -> 0x008f }
            android.opengl.EGLDisplay r3 = r1.f189591a     // Catch:{ Exception -> 0x008f }
            android.opengl.EGLSurface r1 = r1.f189592b     // Catch:{ Exception -> 0x008f }
            r2.mo163474t(r3, r1)     // Catch:{ Exception -> 0x008f }
        L_0x0083:
            r80.a r1 = r6.f330489d     // Catch:{ Exception -> 0x008f }
            fy3.l<? super java.lang.Boolean, rx3.b0> r1 = r1.f330442f     // Catch:{ Exception -> 0x008f }
            if (r1 == 0) goto L_0x00a6
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x008f }
            r1.invoke(r2)     // Catch:{ Exception -> 0x008f }
            goto L_0x00a6
        L_0x008f:
            r1 = move-exception
            r80.a r2 = r6.f330489d
            java.lang.String r2 = r2.f330438b
            java.lang.String r3 = ""
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r0)
            r80.a r0 = r6.f330489d
            fy3.l<? super java.lang.Boolean, rx3.b0> r0 = r0.f330442f
            if (r0 == 0) goto L_0x00a6
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.invoke(r1)
        L_0x00a6:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r80.C110516d.invoke():java.lang.Object");
    }
}
