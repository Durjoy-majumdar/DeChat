package r80;

import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import s80.C110779b;

/* renamed from: r80.d0 */
public final class C110517d0 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110538r f330495d;

    /* renamed from: e */
    public final /* synthetic */ C110779b f330496e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110517d0(C110538r rVar, C110779b bVar) {
        super(1);
        this.f330495d = rVar;
        this.f330496e = bVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: m80.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: m80.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: m80.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: m80.j} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:39:0x00a2, B:47:0x00cd] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r2 = "MicroMsg.MediaEditorIDKeyStat"
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = "markRemuxGLInitFailed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 986(0x3da, double:4.87E-321)
            r6 = 18
            r8 = 1
            r3.mo175913w(r4, r6, r8)
        L_0x001e:
            r80.r r0 = r1.f330495d
            boolean r3 = r0.f330604o
            if (r3 == 0) goto L_0x0043
            r80.a r3 = r0.f330559I
            if (r3 == 0) goto L_0x0043
            w80.d$b r3 = r3.f330441e
            if (r3 == 0) goto L_0x0043
            s80.b r5 = r1.f330496e
            n80.i r0 = r0.f330557G
            if (r0 == 0) goto L_0x0043
            p80.c r6 = r5.mo157953g()
            if (r6 == 0) goto L_0x003b
            int r6 = r6.f329652e
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            int r7 = r5.f331378c
            int r5 = r5.f331379d
            r0.mo160945c(r3, r6, r7, r5)
        L_0x0043:
            r80.b0 r0 = new r80.b0
            r80.r r3 = r1.f330495d
            r0.<init>(r3)
            r80.a0 r3 = new r80.a0
            r80.r r5 = r1.f330495d
            r3.<init>(r5)
            r80.r r5 = r1.f330495d
            r80.a r6 = r5.f330559I
            if (r6 == 0) goto L_0x005e
            r80.v r7 = new r80.v
            r7.<init>(r5)
            r6.f330453q = r7
        L_0x005e:
            r80.c0 r5 = new r80.c0
            r80.r r6 = r1.f330495d
            r5.<init>(r6)
            r80.r r7 = r1.f330495d     // Catch:{ Exception -> 0x00b3 }
            r8 = 23
            boolean r8 = p206nj.C11171e.m11046c(r8)     // Catch:{ Exception -> 0x00b3 }
            if (r8 == 0) goto L_0x00b5
            m80.j r8 = new m80.j     // Catch:{ Exception -> 0x00b3 }
            r80.r r9 = r1.f330495d     // Catch:{ Exception -> 0x00b3 }
            long r10 = r9.f330553C     // Catch:{ Exception -> 0x00b3 }
            long r12 = r9.f330554D     // Catch:{ Exception -> 0x00b3 }
            o80.a r14 = r9.f330560J     // Catch:{ Exception -> 0x00b3 }
            r80.a r9 = r9.f330559I     // Catch:{ Exception -> 0x00b3 }
            gy3.C87412m.m108591d(r9)     // Catch:{ Exception -> 0x00b3 }
            android.graphics.SurfaceTexture r15 = r9.f330444h     // Catch:{ Exception -> 0x00b3 }
            if (r15 != 0) goto L_0x0093
            s80.a r15 = r9.f330437a     // Catch:{ Exception -> 0x00b3 }
            monitor-enter(r15)     // Catch:{ Exception -> 0x00b3 }
            android.graphics.SurfaceTexture r6 = r15.f331384i     // Catch:{ all -> 0x008b }
            monitor-exit(r15)     // Catch:{ Exception -> 0x00b3 }
            r9.f330444h = r6     // Catch:{ Exception -> 0x00b3 }
            goto L_0x0093
        L_0x008b:
            r0 = move-exception
            r3 = r0
            monitor-exit(r15)     // Catch:{ Exception -> 0x00b3 }
            throw r3     // Catch:{ Exception -> 0x00b3 }
        L_0x008f:
            r19 = r2
            goto L_0x00fc
        L_0x0093:
            android.view.Surface r15 = new android.view.Surface     // Catch:{ Exception -> 0x00b3 }
            android.graphics.SurfaceTexture r6 = r9.f330444h     // Catch:{ Exception -> 0x00b3 }
            r15.<init>(r6)     // Catch:{ Exception -> 0x00b3 }
            r80.r r6 = r1.f330495d     // Catch:{ Exception -> 0x00b3 }
            int r9 = r6.f330603n     // Catch:{ Exception -> 0x00b3 }
            boolean r4 = r6.f330605p     // Catch:{ Exception -> 0x00b3 }
            r19 = r2
            r80.x r2 = new r80.x     // Catch:{ Exception -> 0x00d7 }
            r2.<init>(r3, r0, r5, r6)     // Catch:{ Exception -> 0x00d7 }
            r0 = r9
            r9 = r8
            r16 = r0
            r17 = r4
            r18 = r2
            r9.<init>(r10, r12, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x00d7 }
            goto L_0x00f5
        L_0x00b3:
            r0 = move-exception
            goto L_0x008f
        L_0x00b5:
            r19 = r2
            m80.i r2 = new m80.i     // Catch:{ Exception -> 0x00d7 }
            r80.r r4 = r1.f330495d     // Catch:{ Exception -> 0x00d7 }
            long r9 = r4.f330553C     // Catch:{ Exception -> 0x00d7 }
            long r11 = r4.f330554D     // Catch:{ Exception -> 0x00d7 }
            o80.a r13 = r4.f330560J     // Catch:{ Exception -> 0x00d7 }
            r80.a r4 = r4.f330559I     // Catch:{ Exception -> 0x00d7 }
            gy3.C87412m.m108591d(r4)     // Catch:{ Exception -> 0x00d7 }
            android.graphics.SurfaceTexture r6 = r4.f330444h     // Catch:{ Exception -> 0x00d7 }
            if (r6 != 0) goto L_0x00d9
            s80.a r6 = r4.f330437a     // Catch:{ Exception -> 0x00d7 }
            monitor-enter(r6)     // Catch:{ Exception -> 0x00d7 }
            android.graphics.SurfaceTexture r8 = r6.f331384i     // Catch:{ all -> 0x00d3 }
            monitor-exit(r6)     // Catch:{ Exception -> 0x00d7 }
            r4.f330444h = r8     // Catch:{ Exception -> 0x00d7 }
            goto L_0x00d9
        L_0x00d3:
            r0 = move-exception
            r2 = r0
            monitor-exit(r6)     // Catch:{ Exception -> 0x00d7 }
            throw r2     // Catch:{ Exception -> 0x00d7 }
        L_0x00d7:
            r0 = move-exception
            goto L_0x00fc
        L_0x00d9:
            android.view.Surface r14 = new android.view.Surface     // Catch:{ Exception -> 0x00d7 }
            android.graphics.SurfaceTexture r4 = r4.f330444h     // Catch:{ Exception -> 0x00d7 }
            r14.<init>(r4)     // Catch:{ Exception -> 0x00d7 }
            r80.r r4 = r1.f330495d     // Catch:{ Exception -> 0x00d7 }
            int r15 = r4.f330603n     // Catch:{ Exception -> 0x00d7 }
            boolean r6 = r4.f330605p     // Catch:{ Exception -> 0x00d7 }
            r80.z r8 = new r80.z     // Catch:{ Exception -> 0x00d7 }
            r8.<init>(r3, r0, r5, r4)     // Catch:{ Exception -> 0x00d7 }
            r0 = r8
            r8 = r2
            r16 = r6
            r17 = r0
            r8.<init>(r9, r11, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00d7 }
            r8 = r2
        L_0x00f5:
            r7.f330555E = r8     // Catch:{ Exception -> 0x00d7 }
            r2 = r19
            r3 = 0
            r4 = 1
            goto L_0x0121
        L_0x00fc:
            r80.r r2 = r1.f330495d
            java.lang.String r2 = r2.f330612w
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r3 = "init decoder error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)
            java.lang.String r0 = "markRemuxH264DecoderInitFailed"
            r2 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 986(0x3da, double:4.87E-321)
            r6 = 17
            r8 = 1
            r3.mo175913w(r4, r6, r8)
            r80.r r0 = r1.f330495d
            r3 = 0
            r4 = 1
            r0.mo161996j(r4, r3)
        L_0x0121:
            r80.r r0 = r1.f330495d
            int r5 = r0.f330552B
            int r6 = r5 + -1
            int r7 = r0.f330603n
            if (r4 > r7) goto L_0x012f
            if (r7 > r6) goto L_0x012f
            r4 = 1
            goto L_0x0130
        L_0x012f:
            r4 = 0
        L_0x0130:
            if (r4 == 0) goto L_0x0168
            m80.f r0 = r0.f330555E
            if (r0 == 0) goto L_0x0168
            float r3 = (float) r5
            float r4 = (float) r7
            float r3 = r3 / r4
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            java.lang.String r0 = r0.f327871e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "setFrameDropInterval: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            r4 = 1
            if (r3 <= r4) goto L_0x0168
            java.lang.String r0 = "markRemuxFrameDropBiggerThanOne"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 986(0x3da, double:4.87E-321)
            r6 = 82
            r8 = 1
            r3.mo175913w(r4, r6, r8)
        L_0x0168:
            r80.r r0 = r1.f330495d
            r2 = 1
            r0.f330566P = r2
            boolean r2 = r0.f330567Q
            if (r2 == 0) goto L_0x0174
            r0.mo124208b()
        L_0x0174:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r80.C110517d0.invoke(java.lang.Object):java.lang.Object");
    }
}
