package gv1;

import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gv1.f */
public final class C59734f extends C87413o implements C32227p<Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59712c f170625d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59734f(C59712c cVar) {
        super(2);
        this.f170625d = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        if (r13 == r12.f170583G) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0095, code lost:
        if (r13 == r12.f170583G) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        gv1.C59712c.m69615i(r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "StackLayoutManager.onItemChanged from="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " to="
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ForceNotify.MsgWindow"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            gv1.c r0 = r11.f170625d     // Catch:{ all -> 0x006c }
            java.util.ArrayList<ev1.a> r0 = r0.f170589q     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r12)     // Catch:{ all -> 0x006c }
            ev1.a r0 = (ev1.C58838a) r0     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0042
            gv1.c r1 = r11.f170625d     // Catch:{ all -> 0x006c }
            boolean r1 = r1.f170581E     // Catch:{ all -> 0x006c }
            if (r1 != 0) goto L_0x003e
            r1 = 1
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            r0.mo84042o(r1)     // Catch:{ all -> 0x006c }
        L_0x0042:
            gv1.c r0 = r11.f170625d     // Catch:{ all -> 0x006c }
            java.util.ArrayList<ev1.a> r0 = r0.f170589q     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r13)     // Catch:{ all -> 0x006c }
            ev1.a r0 = (ev1.C58838a) r0     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0051
            r0.mo84040m()     // Catch:{ all -> 0x006c }
        L_0x0051:
            if (r13 <= r12) goto L_0x0061
            zt3.t r0 = zt3.C119157j.f356862d     // Catch:{ all -> 0x006c }
            gv1.d r1 = new gv1.d     // Catch:{ all -> 0x006c }
            gv1.c r2 = r11.f170625d     // Catch:{ all -> 0x006c }
            r1.<init>(r12, r13, r2)     // Catch:{ all -> 0x006c }
            zt3.j r0 = (zt3.C119157j) r0     // Catch:{ all -> 0x006c }
            r0.mo183895z(r1)     // Catch:{ all -> 0x006c }
        L_0x0061:
            gv1.c r12 = r11.f170625d
            boolean r0 = r12.f170581E
            if (r0 == 0) goto L_0x009a
            int r0 = r12.f170583G
            if (r13 != r0) goto L_0x009a
            goto L_0x0097
        L_0x006c:
            r12 = move-exception
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch:{ all -> 0x009d }
            r0.<init>()     // Catch:{ all -> 0x009d }
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ all -> 0x009d }
            r1.<init>(r0)     // Catch:{ all -> 0x009d }
            r12.printStackTrace(r1)     // Catch:{ all -> 0x009d }
            ft1.a r2 = ft1.C59319a.f169618b     // Catch:{ all -> 0x009d }
            java.lang.String r3 = "finderForceNotifyCrash"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            gv1.e r8 = new gv1.e     // Catch:{ all -> 0x009d }
            r8.<init>(r0)     // Catch:{ all -> 0x009d }
            r9 = 28
            r10 = 0
            o40.C11348f.C11349a.m11178b(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x009d }
            gv1.c r12 = r11.f170625d
            boolean r0 = r12.f170581E
            if (r0 == 0) goto L_0x009a
            int r0 = r12.f170583G
            if (r13 != r0) goto L_0x009a
        L_0x0097:
            gv1.C59712c.m69615i(r12)
        L_0x009a:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        L_0x009d:
            r12 = move-exception
            gv1.c r0 = r11.f170625d
            boolean r1 = r0.f170581E
            if (r1 == 0) goto L_0x00ab
            int r1 = r0.f170583G
            if (r13 != r1) goto L_0x00ab
            gv1.C59712c.m69615i(r0)
        L_0x00ab:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: gv1.C59734f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
