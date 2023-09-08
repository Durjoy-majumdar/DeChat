package com.tencent.p014mm.plugin.finder.feed.model;

import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.c0 */
public final class C41414c0 implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ C55757d0 f111505d;

    public C41414c0(C55757d0 d0Var) {
        this.f111505d = d0Var;
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0127 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.String r2 = "it"
            gy3.C87412m.m108594g(r0, r2)
            int r2 = r0.what
            com.tencent.mm.plugin.finder.feed.model.d0 r3 = r1.f111505d
            int r4 = r3.f158750t
            r5 = 0
            r6 = 10
            r7 = 1
            if (r2 != r4) goto L_0x01dd
            java.lang.Object r0 = r0.obj
            java.lang.String r2 = "null cannot be cast to non-null type java.util.LinkedList<kotlin.Pair<kotlin.Long, kotlin.String>>"
            gy3.C87412m.m108592e(r0, r2)
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            monitor-enter(r3)
            java.lang.String r2 = r3.f158740g     // Catch:{ all -> 0x01da }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01da }
            r4.<init>()     // Catch:{ all -> 0x01da }
            java.lang.String r8 = "request id size = "
            r4.append(r8)     // Catch:{ all -> 0x01da }
            int r8 = r0.size()     // Catch:{ all -> 0x01da }
            r4.append(r8)     // Catch:{ all -> 0x01da }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01da }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ all -> 0x01da }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x01da }
            r2.<init>()     // Catch:{ all -> 0x01da }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01da }
        L_0x0042:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x01da }
            r8 = 0
            if (r4 == 0) goto L_0x006f
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x01da }
            r9 = r4
            rx3.l r9 = (rx3.C13604l) r9     // Catch:{ all -> 0x01da }
            java.util.Vector<java.lang.Long> r10 = r3.f158745o     // Catch:{ all -> 0x01da }
            A r11 = r9.f38555d     // Catch:{ all -> 0x01da }
            boolean r10 = r10.contains(r11)     // Catch:{ all -> 0x01da }
            if (r10 != 0) goto L_0x0069
            A r9 = r9.f38555d     // Catch:{ all -> 0x01da }
            java.lang.Number r9 = (java.lang.Number) r9     // Catch:{ all -> 0x01da }
            long r9 = r9.longValue()     // Catch:{ all -> 0x01da }
            long r11 = com.tencent.p014mm.plugin.finder.feed.model.C55757d0.f158739y     // Catch:{ all -> 0x01da }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0069
            r8 = 1
        L_0x0069:
            if (r8 == 0) goto L_0x0042
            r2.add(r4)     // Catch:{ all -> 0x01da }
            goto L_0x0042
        L_0x006f:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x01da }
            r0.<init>(r2)     // Catch:{ all -> 0x01da }
            java.lang.String r2 = r3.f158740g     // Catch:{ all -> 0x01da }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01da }
            r4.<init>()     // Catch:{ all -> 0x01da }
            java.lang.String r9 = "idsToFillLoading id size = "
            r4.append(r9)     // Catch:{ all -> 0x01da }
            int r9 = r0.size()     // Catch:{ all -> 0x01da }
            r4.append(r9)     // Catch:{ all -> 0x01da }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01da }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ all -> 0x01da }
            gy3.f0 r2 = new gy3.f0     // Catch:{ all -> 0x01da }
            r2.<init>()     // Catch:{ all -> 0x01da }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x01da }
            r4.<init>()     // Catch:{ all -> 0x01da }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01da }
        L_0x009c:
            boolean r9 = r0.hasNext()     // Catch:{ all -> 0x01da }
            if (r9 == 0) goto L_0x00b8
            java.lang.Object r9 = r0.next()     // Catch:{ all -> 0x01da }
            r10 = r9
            rx3.l r10 = (rx3.C13604l) r10     // Catch:{ all -> 0x01da }
            java.util.Vector<java.lang.Long> r11 = r3.f158744n     // Catch:{ all -> 0x01da }
            A r10 = r10.f38555d     // Catch:{ all -> 0x01da }
            boolean r10 = r11.contains(r10)     // Catch:{ all -> 0x01da }
            r10 = r10 ^ r7
            if (r10 == 0) goto L_0x009c
            r4.add(r9)     // Catch:{ all -> 0x01da }
            goto L_0x009c
        L_0x00b8:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x01da }
            r0.<init>(r4)     // Catch:{ all -> 0x01da }
            r2.f27484d = r0     // Catch:{ all -> 0x01da }
            java.lang.String r0 = r3.f158740g     // Catch:{ all -> 0x01da }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01da }
            r4.<init>()     // Catch:{ all -> 0x01da }
            java.lang.String r9 = "real request id size = "
            r4.append(r9)     // Catch:{ all -> 0x01da }
            T r9 = r2.f27484d     // Catch:{ all -> 0x01da }
            java.util.LinkedList r9 = (java.util.LinkedList) r9     // Catch:{ all -> 0x01da }
            int r9 = r9.size()     // Catch:{ all -> 0x01da }
            r4.append(r9)     // Catch:{ all -> 0x01da }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01da }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)     // Catch:{ all -> 0x01da }
            T r0 = r2.f27484d     // Catch:{ all -> 0x01da }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x01da }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01da }
            r0 = r0 ^ r7
            if (r0 == 0) goto L_0x01d0
            java.util.Vector<java.lang.Long> r0 = r3.f158744n     // Catch:{ all -> 0x01da }
            T r4 = r2.f27484d     // Catch:{ all -> 0x01da }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ all -> 0x01da }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x01da }
            int r6 = sx3.C36907w.m41090l(r4, r6)     // Catch:{ all -> 0x01da }
            r9.<init>(r6)     // Catch:{ all -> 0x01da }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x01da }
        L_0x00fb:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x01da }
            if (r6 == 0) goto L_0x0117
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x01da }
            rx3.l r6 = (rx3.C13604l) r6     // Catch:{ all -> 0x01da }
            A r6 = r6.f38555d     // Catch:{ all -> 0x01da }
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ all -> 0x01da }
            long r10 = r6.longValue()     // Catch:{ all -> 0x01da }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x01da }
            r9.add(r6)     // Catch:{ all -> 0x01da }
            goto L_0x00fb
        L_0x0117:
            r0.addAll(r9)     // Catch:{ all -> 0x01da }
            T r0 = r2.f27484d     // Catch:{ all -> 0x01da }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x01da }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x01da }
            r4.<init>()     // Catch:{ all -> 0x01da }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01da }
        L_0x0127:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x01da }
            if (r6 == 0) goto L_0x015a
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x01da }
            r9 = r6
            rx3.l r9 = (rx3.C13604l) r9     // Catch:{ all -> 0x01da }
            A r10 = r9.f38555d     // Catch:{ all -> 0x01da }
            java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ all -> 0x01da }
            long r10 = r10.longValue()     // Catch:{ all -> 0x01da }
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0153
            B r9 = r9.f38556e     // Catch:{ all -> 0x01da }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x01da }
            int r9 = r9.length()     // Catch:{ all -> 0x01da }
            if (r9 <= 0) goto L_0x014e
            r9 = 1
            goto L_0x014f
        L_0x014e:
            r9 = 0
        L_0x014f:
            if (r9 == 0) goto L_0x0153
            r9 = 1
            goto L_0x0154
        L_0x0153:
            r9 = 0
        L_0x0154:
            if (r9 == 0) goto L_0x0127
            r4.add(r6)     // Catch:{ all -> 0x01da }
            goto L_0x0127
        L_0x015a:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x01da }
            r0.<init>(r4)     // Catch:{ all -> 0x01da }
            r2.f27484d = r0     // Catch:{ all -> 0x01da }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01da }
            r0 = r0 ^ r7
            if (r0 == 0) goto L_0x01c8
            je1.l r0 = new je1.l     // Catch:{ all -> 0x01da }
            T r4 = r2.f27484d     // Catch:{ all -> 0x01da }
            r10 = r4
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x01da }
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 30
            r16 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01da }
            nr3.e r0 = r0.mo9225i()     // Catch:{ all -> 0x01da }
            com.tencent.mm.plugin.finder.feed.model.f0 r4 = new com.tencent.mm.plugin.finder.feed.model.f0     // Catch:{ all -> 0x01da }
            r4.<init>(r3, r2)     // Catch:{ all -> 0x01da }
            nr3.e r0 = r0.mo123064p(r4)     // Catch:{ all -> 0x01da }
            android.app.Activity r2 = r3.f158746p     // Catch:{ all -> 0x01da }
            if (r2 == 0) goto L_0x0192
            boolean r4 = r2 instanceof com.tencent.p014mm.p136ui.MMActivity     // Catch:{ all -> 0x01da }
            if (r4 == 0) goto L_0x0192
            r4 = 1
            goto L_0x0193
        L_0x0192:
            r4 = 0
        L_0x0193:
            if (r4 == 0) goto L_0x0196
            goto L_0x0197
        L_0x0196:
            r2 = r5
        L_0x0197:
            if (r2 == 0) goto L_0x01a1
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2     // Catch:{ all -> 0x01da }
            r0.mo11397F(r2)     // Catch:{ all -> 0x01da }
            monitor-exit(r3)
            goto L_0x026f
        L_0x01a1:
            androidx.fragment.app.Fragment r2 = r3.f158747q     // Catch:{ all -> 0x01da }
            if (r2 == 0) goto L_0x01ae
            androidx.fragment.app.FragmentActivity r4 = r2.getActivity()     // Catch:{ all -> 0x01da }
            boolean r4 = r4 instanceof com.tencent.p014mm.p136ui.MMActivity     // Catch:{ all -> 0x01da }
            if (r4 == 0) goto L_0x01ae
            r8 = 1
        L_0x01ae:
            if (r8 == 0) goto L_0x01b1
            r5 = r2
        L_0x01b1:
            if (r5 == 0) goto L_0x01c4
            androidx.fragment.app.FragmentActivity r2 = r5.getActivity()     // Catch:{ all -> 0x01da }
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r2, r4)     // Catch:{ all -> 0x01da }
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2     // Catch:{ all -> 0x01da }
            r0.mo11397F(r2)     // Catch:{ all -> 0x01da }
            monitor-exit(r3)
            goto L_0x026f
        L_0x01c4:
            r0.mo11397F(r3)     // Catch:{ all -> 0x01da }
            goto L_0x01d7
        L_0x01c8:
            java.lang.String r0 = r3.f158740g     // Catch:{ all -> 0x01da }
            java.lang.String r2 = "idsToRequest is empty #1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x01da }
            goto L_0x01d7
        L_0x01d0:
            java.lang.String r0 = r3.f158740g     // Catch:{ all -> 0x01da }
            java.lang.String r2 = "idsToRequest is empty #2"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x01da }
        L_0x01d7:
            monitor-exit(r3)
            goto L_0x026f
        L_0x01da:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01dd:
            int r4 = r3.f158751u
            if (r2 != r4) goto L_0x021b
            java.lang.Object r0 = r0.obj
            java.lang.String r2 = "null cannot be cast to non-null type java.util.LinkedList<kotlin.Pair<kotlin.String, com.tencent.mm.protocal.protobuf.FinderLiveNoticeInfo>>"
            gy3.C87412m.m108592e(r0, r2)
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = sx3.C36907w.m41090l(r0, r6)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x01f7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x020b
            java.lang.Object r3 = r0.next()
            rx3.l r3 = (rx3.C13604l) r3
            A r3 = r3.f38555d
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            goto L_0x01f7
        L_0x020b:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ r7
            if (r0 == 0) goto L_0x0213
            r5 = r2
        L_0x0213:
            if (r5 == 0) goto L_0x026f
            com.tencent.mm.plugin.finder.feed.model.d0 r0 = r1.f111505d
            r0.mo77359F1(r5)
            goto L_0x026f
        L_0x021b:
            int r4 = r3.f158753w
            if (r2 != r4) goto L_0x0259
            java.lang.Object r0 = r0.obj
            java.lang.String r2 = "null cannot be cast to non-null type java.util.LinkedList<kotlin.Pair<kotlin.String, com.tencent.mm.protocal.protobuf.FinderObject>>"
            gy3.C87412m.m108592e(r0, r2)
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = sx3.C36907w.m41090l(r0, r6)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0235:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0249
            java.lang.Object r3 = r0.next()
            rx3.l r3 = (rx3.C13604l) r3
            A r3 = r3.f38555d
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            goto L_0x0235
        L_0x0249:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ r7
            if (r0 == 0) goto L_0x0251
            r5 = r2
        L_0x0251:
            if (r5 == 0) goto L_0x026f
            com.tencent.mm.plugin.finder.feed.model.d0 r0 = r1.f111505d
            r0.mo77359F1(r5)
            goto L_0x026f
        L_0x0259:
            int r3 = r3.f158752v
            if (r2 != r3) goto L_0x026f
            java.lang.Object r0 = r0.obj
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = sx3.C26236u.m33719b(r0)
            com.tencent.mm.plugin.finder.feed.model.d0 r2 = r1.f111505d
            r2.mo77359F1(r0)
        L_0x026f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.C41414c0.handleMessage(android.os.Message):boolean");
    }
}
