package by0;

import a14.C0000n0;
import com.tencent.p014mm.plugin.bizui.widget.StoryListView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoPreviewMgr$checkPositionInner$1", mo125469f = "MPVideoPreviewMgr.kt", mo125470l = {121, 129}, mo125471m = "invokeSuspend")
/* renamed from: by0.b */
public final class C16827b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f45460d;

    /* renamed from: e */
    public Object f45461e;

    /* renamed from: f */
    public Object f45462f;

    /* renamed from: g */
    public Object f45463g;

    /* renamed from: h */
    public int f45464h;

    /* renamed from: i */
    public int f45465i;

    /* renamed from: j */
    public int f45466j;

    /* renamed from: n */
    public final /* synthetic */ StoryListView f45467n;

    /* renamed from: o */
    public final /* synthetic */ C18508z2 f45468o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16827b(StoryListView storyListView, C18508z2 z2Var, C15601d<? super C16827b> dVar) {
        super(2, dVar);
        this.f45467n = storyListView;
        this.f45468o = z2Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C16827b(this.f45467n, this.f45468o, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C16827b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        if ((r2[1] == 0) != false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014e, code lost:
        if (r4 != 104) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0230, code lost:
        if (((java.lang.Number) r5.invoke(r14.f38555d, r14.f38556e)).floatValue() >= 0.5f) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0249, code lost:
        if ((((java.lang.Number) r5.invoke(r14.f38555d, r14.f38556e)).floatValue() == 0.0f) == false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x024d, code lost:
        r14 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x018a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f45466j
            r3 = 620757041(0x25000031, float:1.1102295E-16)
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 1
            java.lang.String r9 = "MicroMsg.MPVideoPreviewMgr"
            if (r2 == 0) goto L_0x0053
            if (r2 == r8) goto L_0x0039
            if (r2 != r5) goto L_0x0031
            int r2 = r0.f45465i
            int r10 = r0.f45464h
            java.lang.Object r11 = r0.f45463g
            com.tencent.mm.storage.o0 r11 = (com.tencent.p014mm.storage.C19623o0) r11
            java.lang.Object r12 = r0.f45462f
            java.util.LinkedList r12 = (java.util.LinkedList) r12
            java.lang.Object r13 = r0.f45461e
            com.tencent.mm.storage.o0 r13 = (com.tencent.p014mm.storage.C19623o0) r13
            java.lang.Object r14 = r0.f45460d
            java.util.LinkedList r14 = (java.util.LinkedList) r14
            kotlin.ResultKt.throwOnFailure(r18)
            r3 = r18
            r4 = r0
            goto L_0x018f
        L_0x0031:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0039:
            int r2 = r0.f45465i
            int r10 = r0.f45464h
            java.lang.Object r11 = r0.f45462f
            com.tencent.mm.plugin.brandservice.ui.timeline.item.u2 r11 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18366u2) r11
            java.lang.Object r12 = r0.f45461e
            com.tencent.mm.storage.o0 r12 = (com.tencent.p014mm.storage.C19623o0) r12
            java.lang.Object r13 = r0.f45460d
            java.util.LinkedList r13 = (java.util.LinkedList) r13
            kotlin.ResultKt.throwOnFailure(r18)
            r4 = r18
            r3 = r11
            r11 = r12
            r12 = r0
            goto L_0x0136
        L_0x0053:
            kotlin.ResultKt.throwOnFailure(r18)
            int[] r2 = by0.C16825a.f45448e
            if (r2 == 0) goto L_0x0063
            r2 = r2[r8]
            if (r2 != 0) goto L_0x0060
            r2 = 1
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            if (r2 == 0) goto L_0x0081
        L_0x0063:
            int[] r2 = new int[r5]
            com.tencent.mm.plugin.bizui.widget.StoryListView r10 = r0.f45467n
            r10.getLocationInWindow(r2)
            int[] r10 = new int[r5]
            by0.C16825a.f45448e = r10
            r11 = r2[r8]
            r10[r7] = r11
            r2 = r2[r8]
            com.tencent.mm.plugin.bizui.widget.StoryListView r11 = r0.f45467n
            int r11 = r11.getHeight()
            int r11 = r11 * 2
            int r11 = r11 / 3
            int r2 = r2 + r11
            r10[r8] = r2
        L_0x0081:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            com.tencent.mm.plugin.bizui.widget.StoryListView r10 = r0.f45467n
            int r10 = r10.getFirstVisiblePosition()
            com.tencent.mm.plugin.bizui.widget.StoryListView r11 = r0.f45467n
            int r11 = r11.getLastVisiblePosition()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "checkPosition x = "
            r12.append(r13)
            int[] r13 = by0.C16825a.f45448e
            if (r13 == 0) goto L_0x00a8
            r13 = r13[r7]
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r13)
            goto L_0x00a9
        L_0x00a8:
            r14 = r6
        L_0x00a9:
            r12.append(r14)
            java.lang.String r13 = ", y = "
            r12.append(r13)
            int[] r13 = by0.C16825a.f45448e
            if (r13 == 0) goto L_0x00bd
            r13 = r13[r8]
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r13)
            goto L_0x00be
        L_0x00bd:
            r14 = r6
        L_0x00be:
            r12.append(r14)
            java.lang.String r13 = ", height = "
            r12.append(r13)
            com.tencent.mm.plugin.bizui.widget.StoryListView r13 = r0.f45467n
            int r13 = r13.getHeight()
            r12.append(r13)
            java.lang.String r13 = ", startPos = "
            r12.append(r13)
            r12.append(r10)
            java.lang.String r13 = ", endPos = "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r12)
            if (r10 > r11) goto L_0x01bc
            r12 = r0
        L_0x00e9:
            if (r10 == 0) goto L_0x01b3
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r13 = r12.f45468o
            int r14 = r10 + -1
            com.tencent.mm.storage.o0 r13 = r13.getItem(r14)
            if (r13 == 0) goto L_0x01b3
            int r14 = r13.field_type
            if (r14 != r3) goto L_0x01b3
            java.util.HashMap<java.lang.Long, java.lang.ref.WeakReference<com.tencent.mm.plugin.brandservice.ui.timeline.item.u2>> r14 = by0.C16825a.f45450g
            long r3 = r13.field_msgId
            java.lang.Long r15 = new java.lang.Long
            r15.<init>(r3)
            java.lang.Object r3 = r14.get(r15)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L_0x0111
            java.lang.Object r3 = r3.get()
            com.tencent.mm.plugin.brandservice.ui.timeline.item.u2 r3 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18366u2) r3
            goto L_0x0112
        L_0x0111:
            r3 = r6
        L_0x0112:
            if (r3 == 0) goto L_0x01b3
            boolean r4 = r3.mo22833e()
            if (r4 == 0) goto L_0x01b3
            r12.f45460d = r2
            r12.f45461e = r13
            r12.f45462f = r3
            r12.f45463g = r6
            r12.f45464h = r11
            r12.f45465i = r10
            r12.f45466j = r8
            java.lang.Object r4 = r3.mo22832c(r12)
            if (r4 != r1) goto L_0x012f
            return r1
        L_0x012f:
            r16 = r13
            r13 = r2
            r2 = r10
            r10 = r11
            r11 = r16
        L_0x0136:
            if (r4 == 0) goto L_0x01b0
            te3.re4 r4 = r11.mo25774x2()
            if (r4 == 0) goto L_0x01b0
            te3.re4 r4 = r11.mo25774x2()
            int r4 = r4.f64521j
            r14 = 101(0x65, float:1.42E-43)
            if (r4 == r14) goto L_0x0151
            r14 = 102(0x66, float:1.43E-43)
            if (r4 == r14) goto L_0x0151
            r14 = 104(0x68, float:1.46E-43)
            if (r4 == r14) goto L_0x0153
            goto L_0x01b0
        L_0x0151:
            r14 = 104(0x68, float:1.46E-43)
        L_0x0153:
            te3.re4 r4 = r11.mo25774x2()
            int r4 = r4.f64521j
            if (r14 == r4) goto L_0x0176
            te3.re4 r4 = r11.mo25774x2()
            te3.hb0 r4 = r4.f64523o
            java.util.LinkedList<te3.eh> r4 = r4.f63905g
            java.lang.Object r4 = r4.get(r7)
            te3.eh r4 = (te3.C22495eh) r4
            java.util.LinkedList<te3.dh> r4 = r4.f63800n
            java.lang.Object r4 = r4.get(r7)
            te3.dh r4 = (te3.C22493dh) r4
            int r4 = r4.f63760q
            r14 = 5
            if (r4 != r14) goto L_0x01b0
        L_0x0176:
            r12.f45460d = r13
            r12.f45461e = r11
            r12.f45462f = r13
            r12.f45463g = r11
            r12.f45464h = r10
            r12.f45465i = r2
            r12.f45466j = r5
            java.lang.Object r3 = r3.mo22832c(r12)
            if (r3 != r1) goto L_0x018b
            return r1
        L_0x018b:
            r4 = r12
            r12 = r13
            r14 = r12
            r13 = r11
        L_0x018f:
            gy3.C87412m.m108591d(r3)
            rx3.l r15 = new rx3.l
            r15.<init>(r11, r3)
            r12.add(r15)
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            java.util.Map<java.lang.Long, java.lang.Integer> r11 = cy0.C20372d.f57086a
            long r12 = r13.field_msgId
            java.lang.Long r15 = new java.lang.Long
            r15.<init>(r12)
            r11.put(r15, r3)
            r12 = r4
            r11 = r10
            r10 = r2
            r2 = r14
            goto L_0x01b3
        L_0x01b0:
            r11 = r10
            r10 = r2
            r2 = r13
        L_0x01b3:
            if (r10 == r11) goto L_0x01bc
            int r10 = r10 + 1
            r3 = 620757041(0x25000031, float:1.1102295E-16)
            goto L_0x00e9
        L_0x01bc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "checkPosition videoInfoList size = "
            r1.append(r3)
            int r3 = r2.size()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)
            r3 = -1
            if (r1 == 0) goto L_0x01ef
            int r1 = by0.C16825a.f45455l
            if (r1 == r8) goto L_0x01ec
            by0.a r9 = by0.C16825a.f45444a
            r10 = 0
            r12 = 0
            r13 = 3
            r14 = 0
            by0.C16825a.m16471g(r9, r10, r12, r13, r14)
            by0.C16825a.f45451h = r3
        L_0x01ec:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x01ef:
            by0.a r1 = by0.C16825a.f45444a
            by0.d r5 = by0.C16829d.f45470d
            by0.e r10 = by0.C16830e.f45471d
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0203:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L_0x0254
            java.lang.Object r13 = r2.next()
            r14 = r13
            rx3.l r14 = (rx3.C13604l) r14
            A r15 = r14.f38555d
            java.lang.Object r15 = r10.invoke(r15)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x0233
            A r15 = r14.f38555d
            B r14 = r14.f38556e
            java.lang.Object r14 = r5.invoke(r15, r14)
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            r15 = 1056964608(0x3f000000, float:0.5)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 < 0) goto L_0x024d
            goto L_0x024b
        L_0x0233:
            A r15 = r14.f38555d
            B r14 = r14.f38556e
            java.lang.Object r14 = r5.invoke(r15, r14)
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            r15 = 0
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x0248
            r14 = 1
            goto L_0x0249
        L_0x0248:
            r14 = 0
        L_0x0249:
            if (r14 != 0) goto L_0x024d
        L_0x024b:
            r14 = 1
            goto L_0x024e
        L_0x024d:
            r14 = 0
        L_0x024e:
            if (r14 == 0) goto L_0x0203
            r12.add(r13)
            goto L_0x0203
        L_0x0254:
            r11.addAll(r12)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r10 = "checkPosition hotList size = "
            r2.append(r10)
            int r10 = r11.size()
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r11)
            if (r2 == 0) goto L_0x028b
            int r2 = by0.C16825a.f45455l
            if (r2 == r8) goto L_0x0284
            r6 = 0
            r8 = 0
            r9 = 3
            r10 = 0
            r5 = r1
            by0.C16825a.m16471g(r5, r6, r8, r9, r10)
            by0.C16825a.f45451h = r3
        L_0x0284:
            java.lang.Runnable r1 = by0.C16825a.f45454k
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r1)
            goto L_0x0349
        L_0x028b:
            int r2 = r11.size()
            if (r2 > r8) goto L_0x0298
            java.lang.Object r2 = r11.get(r7)
            rx3.l r2 = (rx3.C13604l) r2
            goto L_0x02e1
        L_0x0298:
            java.lang.Object r2 = r11.get(r7)
            java.lang.String r3 = "hotList[0]"
            gy3.C87412m.m108593f(r2, r3)
            rx3.l r2 = (rx3.C13604l) r2
            B r3 = r2.f38556e
            java.lang.Object r3 = r5.invoke(r6, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r4 = r11.size()
            r9 = 1
        L_0x02b4:
            if (r9 >= r4) goto L_0x02d1
            java.lang.Object r10 = r11.get(r9)
            rx3.l r10 = (rx3.C13604l) r10
            B r10 = r10.f38556e
            java.lang.Object r10 = r5.invoke(r6, r10)
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            int r10 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x02ce
            r3 = 0
            goto L_0x02d2
        L_0x02ce:
            int r9 = r9 + 1
            goto L_0x02b4
        L_0x02d1:
            r3 = 1
        L_0x02d2:
            java.lang.Object r4 = r11.get(r8)
            java.lang.String r5 = "hotList[1]"
            gy3.C87412m.m108593f(r4, r5)
            rx3.l r4 = (rx3.C13604l) r4
            if (r3 == 0) goto L_0x02e0
            goto L_0x02e1
        L_0x02e0:
            r2 = r4
        L_0x02e1:
            int r3 = by0.C16825a.f45455l
            if (r3 == r8) goto L_0x02f2
            A r3 = r2.f38555d
            com.tencent.mm.storage.o0 r3 = (com.tencent.p014mm.storage.C19623o0) r3
            long r10 = r3.field_msgId
            r12 = 0
            r13 = 2
            r14 = 0
            r9 = r1
            by0.C16825a.m16471g(r9, r10, r12, r13, r14)
        L_0x02f2:
            A r1 = r2.f38555d
            com.tencent.mm.storage.o0 r1 = (com.tencent.p014mm.storage.C19623o0) r1
            int r2 = r1.field_type
            r3 = 620757041(0x25000031, float:1.1102295E-16)
            if (r2 != r3) goto L_0x0309
            te3.re4 r2 = r1.f55530o1
            if (r2 == 0) goto L_0x0309
            int r2 = r2.f64521j
            r3 = 104(0x68, float:1.46E-43)
            if (r3 != r2) goto L_0x0309
            r2 = 1
            goto L_0x030a
        L_0x0309:
            r2 = 0
        L_0x030a:
            if (r2 == 0) goto L_0x0337
            te3.re4 r2 = r1.f55530o1
            if (r2 == 0) goto L_0x0325
            te3.y23 r2 = r2.f64529u
            if (r2 == 0) goto L_0x0325
            java.util.LinkedList<te3.pi1> r2 = r2.f186439e
            if (r2 == 0) goto L_0x0325
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x0325
            java.lang.Object r2 = r2.get(r7)
            r6 = r2
            te3.pi1 r6 = (te3.C22521pi1) r6
        L_0x0325:
            if (r6 == 0) goto L_0x0337
            java.util.Map<java.lang.String, java.lang.Integer> r2 = cy0.C20372d.f57088c
            java.lang.String r3 = r6.f64435r
            java.lang.String r4 = "data.finder_object_id"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r2.put(r3, r4)
        L_0x0337:
            java.lang.Runnable r2 = by0.C16825a.f45454k
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r2)
            by0.c r2 = new by0.c
            r2.<init>(r1)
            int r1 = by0.C16825a.f45447d
            long r3 = (long) r1
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r2, r3)
            by0.C16825a.f45454k = r2
        L_0x0349:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: by0.C16827b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
