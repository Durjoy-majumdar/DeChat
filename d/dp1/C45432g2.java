package dp1;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: dp1.g2 */
public final class C45432g2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f122964d;

    /* renamed from: e */
    public final /* synthetic */ C45434h2<Object, Object> f122965e;

    public C45432g2(RecyclerView recyclerView, C45434h2<Object, Object> h2Var) {
        this.f122964d = recyclerView;
        this.f122965e = h2Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x0151 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0170  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r10.f122964d
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r2 = 0
            r3 = 0
            r4 = 1
            java.lang.String r5 = ", layoutPosition="
            java.lang.String r6 = "[onScrollStateChanged] invalid. adapterPosition="
            java.lang.String r7 = "RecyclerViewAdapterEx"
            if (r1 == 0) goto L_0x0084
            dp1.h2<java.lang.Object, java.lang.Object> r1 = r10.f122965e
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r8 = r0.mo16957C()
            if (r8 <= 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r8 = 0
        L_0x001f:
            r1.f122972e = r8
            dp1.h2<java.lang.Object, java.lang.Object> r1 = r10.f122965e
            int r0 = r0.mo16959E()
            if (r0 <= 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            r1.f122973f = r0
            androidx.recyclerview.widget.RecyclerView r0 = r10.f122964d
            dp1.h2<java.lang.Object, java.lang.Object> r1 = r10.f122965e
            int r1 = r1.f122972e
            androidx.recyclerview.widget.RecyclerView$z r0 = r0.mo17024J0(r1, r3)
            if (r0 == 0) goto L_0x0042
            int r1 = r0.mo17363j()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0043
        L_0x0042:
            r1 = r2
        L_0x0043:
            if (r0 == 0) goto L_0x004e
            int r8 = r0.mo17364k()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x004f
        L_0x004e:
            r8 = r2
        L_0x004f:
            boolean r1 = gy3.C87412m.m108589b(r1, r8)
            if (r1 != 0) goto L_0x00f9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            if (r0 == 0) goto L_0x0068
            int r3 = r0.mo17363j()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0069
        L_0x0068:
            r3 = r2
        L_0x0069:
            r1.append(r3)
            r1.append(r5)
            if (r0 == 0) goto L_0x0079
            int r0 = r0.mo17364k()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x0079:
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            return
        L_0x0084:
            boolean r1 = r0 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r1 == 0) goto L_0x00fb
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            int[] r1 = r0.mo17394A(r2)
            int[] r0 = r0.mo17395B(r2)
            dp1.h2<java.lang.Object, java.lang.Object> r8 = r10.f122965e
            r9 = r1[r3]
            r1 = r1[r4]
            if (r9 <= r1) goto L_0x009b
            r9 = r1
        L_0x009b:
            r8.f122972e = r9
            r1 = r0[r3]
            r0 = r0[r4]
            if (r1 >= r0) goto L_0x00a4
            r1 = r0
        L_0x00a4:
            r8.f122973f = r1
            androidx.recyclerview.widget.RecyclerView r0 = r10.f122964d
            androidx.recyclerview.widget.RecyclerView$z r0 = r0.mo17024J0(r9, r3)
            if (r0 == 0) goto L_0x00b7
            int r1 = r0.mo17363j()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00b8
        L_0x00b7:
            r1 = r2
        L_0x00b8:
            if (r0 == 0) goto L_0x00c3
            int r8 = r0.mo17364k()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x00c4
        L_0x00c3:
            r8 = r2
        L_0x00c4:
            boolean r1 = gy3.C87412m.m108589b(r1, r8)
            if (r1 != 0) goto L_0x00f9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            if (r0 == 0) goto L_0x00dd
            int r3 = r0.mo17363j()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x00de
        L_0x00dd:
            r3 = r2
        L_0x00de:
            r1.append(r3)
            r1.append(r5)
            if (r0 == 0) goto L_0x00ee
            int r0 = r0.mo17364k()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x00ee:
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            return
        L_0x00f9:
            r0 = 1
            goto L_0x00fc
        L_0x00fb:
            r0 = 0
        L_0x00fc:
            if (r0 == 0) goto L_0x0243
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            dp1.h2<java.lang.Object, java.lang.Object> r1 = r10.f122965e
            int r5 = r1.f122972e
            int r1 = r1.f122973f
            if (r5 > r1) goto L_0x0142
        L_0x010b:
            dp1.h2<java.lang.Object, java.lang.Object> r6 = r10.f122965e
            dp1.j2 r6 = (dp1.C45436j2) r6
            ue1.k r6 = r6.f122976h
            if (r6 == 0) goto L_0x012f
            if (r5 < 0) goto L_0x0120
            int r7 = r6.mo73487Q5()
            if (r5 >= r7) goto L_0x0120
            ue1.f r6 = r6.mo73488R5(r5)
            goto L_0x0130
        L_0x0120:
            java.util.ArrayList<ue1.f> r7 = r6.f146725f
            int r6 = r6.mo73487Q5()
            int r6 = r5 - r6
            java.lang.Object r6 = r7.get(r6)
            ue1.f r6 = (ue1.C52528f) r6
            goto L_0x0130
        L_0x012f:
            r6 = r2
        L_0x0130:
            if (r6 == 0) goto L_0x0135
            java.lang.String r6 = r6.field_sessionId
            goto L_0x0136
        L_0x0135:
            r6 = r2
        L_0x0136:
            if (r6 != 0) goto L_0x013a
            java.lang.String r6 = ""
        L_0x013a:
            r0.add(r6)
            if (r5 == r1) goto L_0x0142
            int r5 = r5 + 1
            goto L_0x010b
        L_0x0142:
            dp1.h2<java.lang.Object, java.lang.Object> r1 = r10.f122965e
            dp1.b<ID> r1 = r1.f122974g
            if (r1 == 0) goto L_0x0243
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0151:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0174
            java.lang.Object r5 = r0.next()
            boolean r6 = r1.f122951a
            if (r6 == 0) goto L_0x016d
            dp1.x1<ID> r6 = r1.f122953c
            if (r6 == 0) goto L_0x0168
            boolean r6 = r6.mo70931a(r5)
            goto L_0x0169
        L_0x0168:
            r6 = 1
        L_0x0169:
            if (r6 == 0) goto L_0x016d
            r6 = 1
            goto L_0x016e
        L_0x016d:
            r6 = 0
        L_0x016e:
            if (r6 == 0) goto L_0x0151
            r2.add(r5)
            goto L_0x0151
        L_0x0174:
            java.util.Set<ID> r0 = r1.f122954d
            java.util.Set r2 = sx3.C110818d0.m150904D0(r2)
            boolean r5 = r1.f122951a
            if (r5 != 0) goto L_0x0180
            goto L_0x0243
        L_0x0180:
            java.util.Set r0 = sx3.C48501y0.m53871f(r2, r0)
            java.util.Set<ID> r5 = r1.f122954d
            r5.clear()
            java.util.Iterator r2 = r2.iterator()
        L_0x018d:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x019b
            java.lang.Object r6 = r2.next()
            r5.add(r6)
            goto L_0x018d
        L_0x019b:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x01a2
            goto L_0x01b0
        L_0x01a2:
            zt3.t r2 = zt3.C119157j.f356862d
            dp1.a r5 = new dp1.a
            r5.<init>(r1, r0)
            zt3.j r2 = (zt3.C119157j) r2
            java.lang.String r6 = "ExposeStatisticUtil"
            r2.mo183876g(r5, r6)
        L_0x01b0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "newExposeRecords"
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = "，size:"
            r2.append(r5)
            int r5 = r0.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.append(r5)
            r5 = 41
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "Finder.ExposeStatisticUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            boolean r2 = r0.isEmpty()
            r2 = r2 ^ r4
            if (r2 != r4) goto L_0x01e5
            r2 = 1
            goto L_0x01e6
        L_0x01e5:
            r2 = 0
        L_0x01e6:
            if (r2 == 0) goto L_0x0243
            java.util.Iterator r0 = r0.iterator()
        L_0x01ec:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0243
            java.lang.Object r2 = r0.next()
            boolean r5 = r2 instanceof java.lang.Integer
            if (r5 == 0) goto L_0x0204
            r5 = r2
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 < 0) goto L_0x0216
            goto L_0x0214
        L_0x0204:
            boolean r5 = r2 instanceof java.lang.String
            if (r5 == 0) goto L_0x0212
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0216
            goto L_0x0214
        L_0x0212:
            if (r2 == 0) goto L_0x0216
        L_0x0214:
            r5 = 1
            goto L_0x0217
        L_0x0216:
            r5 = 0
        L_0x0217:
            if (r5 != 0) goto L_0x021a
            goto L_0x01ec
        L_0x021a:
            java.util.concurrent.ConcurrentHashMap<ID, java.lang.Integer> r5 = r1.f122955e
            java.util.Set r6 = r5.keySet()
            boolean r6 = r6.contains(r2)
            if (r6 == 0) goto L_0x023b
            java.lang.Object r6 = r5.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x01ec
            int r6 = r6.intValue()
            int r6 = r6 + r4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.put(r2, r6)
            goto L_0x01ec
        L_0x023b:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r5.put(r2, r6)
            goto L_0x01ec
        L_0x0243:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C45432g2.run():void");
    }
}
