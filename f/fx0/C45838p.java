package fx0;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.model.MPDataLogic$getAppMsgRelatedInfo$1", mo125469f = "MPDataLogic.kt", mo125470l = {193}, mo125471m = "invokeSuspend")
/* renamed from: fx0.p */
public final class C45838p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f123762d;

    /* renamed from: e */
    public final /* synthetic */ long f123763e;

    /* renamed from: f */
    public final /* synthetic */ String f123764f;

    /* renamed from: g */
    public final /* synthetic */ int f123765g;

    /* renamed from: h */
    public final /* synthetic */ int f123766h;

    /* renamed from: i */
    public final /* synthetic */ int f123767i;

    /* renamed from: j */
    public final /* synthetic */ int f123768j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45838p(long j, String str, int i, int i2, int i3, int i4, C15601d<? super C45838p> dVar) {
        super(2, dVar);
        this.f123763e = j;
        this.f123764f = str;
        this.f123765g = i;
        this.f123766h = i2;
        this.f123767i = i3;
        this.f123768j = i4;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C45838p(this.f123763e, this.f123764f, this.f123765g, this.f123766h, this.f123767i, this.f123768j, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C45838p) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105926v("MicroMsg.MPDataLogic", "getAppMsgRelatedInfo size:" + r0.size());
        r10 = sx3.C110818d0.m150936h0(r0);
        r0 = new java.util.ArrayList();
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        if (r10.hasNext() == false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00aa, code lost:
        r1 = r10.next();
        r4 = (java.util.List) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
        if (r4 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b9, code lost:
        if ((r4.get(0) instanceof java.lang.String) == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bb, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bd, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00be, code lost:
        if (r4 == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c0, code lost:
        r0.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        r10 = new java.util.HashSet();
        r1 = new java.util.ArrayList();
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        if (r0.hasNext() == false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d8, code lost:
        r4 = r0.next();
        r5 = ((java.util.List) r4).get(0);
        gy3.C87412m.m108592e(r5, "null cannot be cast to non-null type kotlin.String");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f2, code lost:
        if (r10.add(com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43955d((java.lang.String) r5)) == false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f4, code lost:
        r1.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f8, code lost:
        r10 = r9.f123767i;
        r0 = r9.f123768j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        if (r1.isEmpty() != false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0102, code lost:
        r4 = new java.util.LinkedList();
        r5 = new java.util.ArrayList();
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0114, code lost:
        if (r1.hasNext() == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0116, code lost:
        r6 = r1.next();
        r7 = ((java.util.List) r6).get(0);
        gy3.C87412m.m108592e(r7, "null cannot be cast to non-null type kotlin.String");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012c, code lost:
        if (ea3.C45590f.m50650j((java.lang.String) r7) == false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        r5.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0132, code lost:
        r1 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013a, code lost:
        if (r1.hasNext() == false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013c, code lost:
        r5 = (java.util.List) r1.next();
        r6 = new te3.C50637o6();
        r7 = r5.get(0);
        gy3.C87412m.m108592e(r7, "null cannot be cast to non-null type kotlin.String");
        r7 = (java.lang.String) r7;
        r6.f138971e = r7;
        r6.f138970d = fx0.C45834o.f123751a.mo71301b(r7);
        r7 = r5.get(1);
        gy3.C87412m.m108592e(r7, "null cannot be cast to non-null type kotlin.Int");
        r6.f138973g = ((java.lang.Integer) r7).intValue();
        r6.f138972f = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0173, code lost:
        if (r5.size() <= r0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0175, code lost:
        r7 = r5.get(r0);
        gy3.C87412m.m108592e(r7, "null cannot be cast to non-null type kotlin.Int");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0184, code lost:
        if (((java.lang.Integer) r7).intValue() <= 0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0186, code lost:
        r5 = r5.get(r0);
        gy3.C87412m.m108592e(r5, "null cannot be cast to non-null type kotlin.Int");
        r6.f138972f = ((java.lang.Integer) r5).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0197, code lost:
        r4.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x019b, code lost:
        fx0.C45834o.f123751a.mo71300a(r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a2, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r9.f123762d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0016
            if (r1 != r3) goto L_0x000e
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0051
        L_0x000e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0016:
            kotlin.ResultKt.throwOnFailure(r10)
            java.util.Queue<java.util.List<java.lang.Object>> r10 = fx0.C45834o.f123755e
            long r4 = r9.f123763e
            java.lang.String r1 = r9.f123764f
            int r6 = r9.f123765g
            int r7 = r9.f123766h
            monitor-enter(r10)
            fx0.C45834o.f123754d = r4     // Catch:{ all -> 0x01aa }
            java.util.Queue<java.util.List<java.lang.Object>> r4 = fx0.C45834o.f123755e     // Catch:{ all -> 0x01aa }
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x01aa }
            r5[r2] = r1     // Catch:{ all -> 0x01aa }
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ all -> 0x01aa }
            r1.<init>(r6)     // Catch:{ all -> 0x01aa }
            r5[r3] = r1     // Catch:{ all -> 0x01aa }
            r1 = 2
            java.lang.Integer r6 = new java.lang.Integer     // Catch:{ all -> 0x01aa }
            r6.<init>(r7)     // Catch:{ all -> 0x01aa }
            r5[r1] = r6     // Catch:{ all -> 0x01aa }
            java.util.ArrayList r1 = sx3.C64197v.m75534c(r5)     // Catch:{ all -> 0x01aa }
            java.util.LinkedList r4 = (java.util.LinkedList) r4     // Catch:{ all -> 0x01aa }
            r4.add(r1)     // Catch:{ all -> 0x01aa }
            monitor-exit(r10)
            r4 = 1000(0x3e8, double:4.94E-321)
            r9.f123762d = r3
            java.lang.Object r10 = a14.C53965x0.m60607b(r4, r9)
            if (r10 != r0) goto L_0x0051
            return r0
        L_0x0051:
            java.util.Queue<java.util.List<java.lang.Object>> r10 = fx0.C45834o.f123755e
            long r0 = r9.f123763e
            monitor-enter(r10)
            long r4 = fx0.C45834o.f123754d     // Catch:{ all -> 0x01a7 }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x01a3
            java.util.Queue<java.util.List<java.lang.Object>> r0 = fx0.C45834o.f123755e     // Catch:{ all -> 0x01a7 }
            if (r0 == 0) goto L_0x0069
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01a7 }
            if (r0 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r0 = 0
            goto L_0x006a
        L_0x0069:
            r0 = 1
        L_0x006a:
            if (r0 == 0) goto L_0x006e
            goto L_0x01a3
        L_0x006e:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01a7 }
            java.util.Queue<java.util.List<java.lang.Object>> r1 = fx0.C45834o.f123755e     // Catch:{ all -> 0x01a7 }
            r0.<init>(r1)     // Catch:{ all -> 0x01a7 }
            java.util.Queue<java.util.List<java.lang.Object>> r1 = fx0.C45834o.f123755e     // Catch:{ all -> 0x01a7 }
            java.util.LinkedList r1 = (java.util.LinkedList) r1     // Catch:{ all -> 0x01a7 }
            r1.clear()     // Catch:{ all -> 0x01a7 }
            monitor-exit(r10)
            java.lang.String r10 = "MicroMsg.MPDataLogic"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "getAppMsgRelatedInfo size:"
            r1.append(r4)
            int r4 = r0.size()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r10, r1)
            java.util.List r10 = sx3.C110818d0.m150936h0(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00a4:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00c4
            java.lang.Object r1 = r10.next()
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x00bd
            java.lang.Object r4 = r4.get(r2)
            boolean r4 = r4 instanceof java.lang.String
            if (r4 == 0) goto L_0x00bd
            r4 = 1
            goto L_0x00be
        L_0x00bd:
            r4 = 0
        L_0x00be:
            if (r4 == 0) goto L_0x00a4
            r0.add(r1)
            goto L_0x00a4
        L_0x00c4:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00d2:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00f8
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = r5.get(r2)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r5, r6)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43955d(r5)
            boolean r5 = r10.add(r5)
            if (r5 == 0) goto L_0x00d2
            r1.add(r4)
            goto L_0x00d2
        L_0x00f8:
            int r10 = r9.f123767i
            int r0 = r9.f123768j
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L_0x01a0
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0110:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0132
            java.lang.Object r6 = r1.next()
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r7.get(r2)
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r7, r8)
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = ea3.C45590f.m50650j(r7)
            if (r7 == 0) goto L_0x0110
            r5.add(r6)
            goto L_0x0110
        L_0x0132:
            java.util.Iterator r1 = r5.iterator()
        L_0x0136:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x019b
            java.lang.Object r5 = r1.next()
            java.util.List r5 = (java.util.List) r5
            te3.o6 r6 = new te3.o6
            r6.<init>()
            java.lang.Object r7 = r5.get(r2)
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r7, r8)
            java.lang.String r7 = (java.lang.String) r7
            r6.f138971e = r7
            fx0.o r8 = fx0.C45834o.f123751a
            java.lang.String r7 = r8.mo71301b(r7)
            r6.f138970d = r7
            java.lang.Object r7 = r5.get(r3)
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Int"
            gy3.C87412m.m108592e(r7, r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.f138973g = r7
            r6.f138972f = r3
            int r7 = r5.size()
            if (r7 <= r0) goto L_0x0197
            java.lang.Object r7 = r5.get(r0)
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Int"
            gy3.C87412m.m108592e(r7, r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 <= 0) goto L_0x0197
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Int"
            gy3.C87412m.m108592e(r5, r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.f138972f = r5
        L_0x0197:
            r4.add(r6)
            goto L_0x0136
        L_0x019b:
            fx0.o r0 = fx0.C45834o.f123751a
            r0.mo71300a(r4, r10)
        L_0x01a0:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        L_0x01a3:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x01a7 }
            monitor-exit(r10)
            return r0
        L_0x01a7:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x01aa:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fx0.C45838p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
