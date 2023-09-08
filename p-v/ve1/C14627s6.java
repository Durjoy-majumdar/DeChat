package ve1;

import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import ve1.C14634t6;

/* renamed from: ve1.s6 */
public final class C14627s6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f40467d;

    /* renamed from: e */
    public final /* synthetic */ C14634t6.C14635a f40468e;

    /* renamed from: f */
    public final /* synthetic */ int f40469f;

    /* renamed from: g */
    public final /* synthetic */ C14634t6 f40470g;

    /* renamed from: h */
    public final /* synthetic */ FinderObject f40471h;

    public C14627s6(int i, C14634t6.C14635a aVar, int i2, C14634t6 t6Var, FinderObject finderObject) {
        this.f40467d = i;
        this.f40468e = aVar;
        this.f40469f = i2;
        this.f40470g = t6Var;
        this.f40471h = finderObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a8, code lost:
        if (r13 != 3) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r6 = r18
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r19
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/convert/FinderOpenEntranceTipConvert$RvAdapter$onBindViewHolder$2"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r18
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            int r0 = r6.f40467d
            r1 = 3
            r2 = 2
            r3 = 4
            r5 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 == r3) goto L_0x002d
            r3 = 5
            if (r0 == r3) goto L_0x0030
        L_0x002d:
            r3 = 1
            r8 = 1
            goto L_0x0034
        L_0x0030:
            r3 = 3
            r8 = 0
            goto L_0x0034
        L_0x0033:
            r8 = 2
        L_0x0034:
            ve1.t6$a r7 = r6.f40468e
            java.util.List<com.tencent.mm.protocal.protobuf.FinderObject> r9 = r7.f40487h
            java.util.List<java.lang.Integer> r10 = r7.f40488i
            pe3.b r7 = r7.f40486g
            int r11 = r6.f40469f
            java.lang.String r12 = "finerObjects"
            gy3.C87412m.m108594g(r9, r12)
            java.lang.String r12 = "objectActions"
            gy3.C87412m.m108594g(r10, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.util.Iterator r13 = r10.iterator()
            r14 = 0
        L_0x0054:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x0074
            int r15 = r14 + 1
            java.lang.Object r16 = r13.next()
            java.lang.Number r16 = (java.lang.Number) r16
            int r4 = r16.intValue()
            if (r4 != r0) goto L_0x0072
            r4 = r9
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r4 = r4.get(r14)
            r12.add(r4)
        L_0x0072:
            r14 = r15
            goto L_0x0054
        L_0x0074:
            wp1.f$a r4 = wp1.C15585f.f42211a
            r13 = 4096(0x1000, float:5.74E-42)
            r14 = 0
            java.util.List r4 = r4.mo14343f(r12, r13, r14)
            ve1.C14486c8.f40162b = r4
            java.util.Iterator r4 = r10.iterator()
            r12 = -1
            r13 = 0
            r15 = -1
            r16 = 0
        L_0x0088:
            boolean r17 = r4.hasNext()
            if (r17 == 0) goto L_0x00a4
            java.lang.Object r17 = r4.next()
            java.lang.Number r17 = (java.lang.Number) r17
            int r14 = r17.intValue()
            if (r14 != r0) goto L_0x00a0
            int r13 = r13 + 1
            if (r15 != r12) goto L_0x00a0
            r15 = r16
        L_0x00a0:
            int r16 = r16 + 1
            r14 = 0
            goto L_0x0088
        L_0x00a4:
            if (r13 == r5) goto L_0x00b2
            if (r13 == r2) goto L_0x00ab
            if (r13 == r1) goto L_0x00ad
            goto L_0x00b3
        L_0x00ab:
            if (r15 != 0) goto L_0x00af
        L_0x00ad:
            r12 = r11
            goto L_0x00b3
        L_0x00af:
            int r12 = r11 + -1
            goto L_0x00b3
        L_0x00b2:
            r12 = 0
        L_0x00b3:
            ve1.C14486c8.f40165e = r12
            ve1.C14486c8.f40163c = r7
            ve1.C14486c8.f40164d = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "finerObjects.size="
            r0.append(r1)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r1 = r9.size()
            r0.append(r1)
            java.lang.String r1 = " objectActions.size="
            r0.append(r1)
            int r1 = r10.size()
            r0.append(r1)
            java.lang.String r1 = " tabType="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " position="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " dataList.size="
            r0.append(r1)
            java.util.List<? extends com.tencent.mm.plugin.finder.storage.FinderItem> r1 = ve1.C14486c8.f40162b
            if (r1 == 0) goto L_0x00fc
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            goto L_0x00fd
        L_0x00fc:
            r14 = 0
        L_0x00fd:
            r0.append(r14)
            java.lang.String r1 = " index="
            r0.append(r1)
            int r1 = ve1.C14486c8.f40165e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderShareJumpData"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.util.List<? extends com.tencent.mm.plugin.finder.storage.FinderItem> r0 = ve1.C14486c8.f40162b
            if (r0 == 0) goto L_0x0122
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            r4 = 0
            goto L_0x0123
        L_0x0122:
            r4 = 1
        L_0x0123:
            if (r4 != 0) goto L_0x0143
            bl3.r r0 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r1 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r0 = r0.mo62446e(r1)
            java.lang.Class<os1.f> r1 = os1.C11739f.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            os1.f r0 = (os1.C11739f) r0
            os1.f$a r0 = r0.mo11600c3(r3)
            os1.f$c r1 = os1.C11739f.C11742c.InCacheTime
            r0.f34376i = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.f34374g = r1
        L_0x0143:
            ve1.t6 r7 = r6.f40470g
            r9 = 3
            ve1.t6$a r0 = r6.f40468e
            android.content.Context r10 = r0.f40483d
            int r0 = r6.f40469f
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            ve1.t6$a r0 = r6.f40468e
            java.lang.String r12 = r0.f40485f
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r6.f40471h
            long r0 = r0.f164794id
            java.lang.String r13 = o40.C61926c.m72691p(r0)
            r7.mo13836j(r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = "com/tencent/mm/plugin/finder/convert/FinderOpenEntranceTipConvert$RvAdapter$onBindViewHolder$2"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14627s6.onClick(android.view.View):void");
    }
}
