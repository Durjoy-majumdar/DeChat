package com.tencent.p014mm.plugin.finder.feed.model;

import hp3.C87581a;
import java.util.List;
import up1.C65426w0;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.o */
public final class C55774o<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C55776r f158796a;

    /* renamed from: b */
    public final /* synthetic */ long f158797b;

    /* renamed from: c */
    public final /* synthetic */ List<C65426w0> f158798c;

    /* renamed from: d */
    public final /* synthetic */ List<C65426w0> f158799d;

    /* renamed from: e */
    public final /* synthetic */ int f158800e;

    public C55774o(C55776r rVar, long j, List<C65426w0> list, List<C65426w0> list2, int i) {
        this.f158796a = rVar;
        this.f158797b = j;
        this.f158798c = list;
        this.f158799d = list2;
        this.f158800e = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: cm1.i2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: cm1.i2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: cm1.i2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: cm1.i2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: cm1.i2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: cm1.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: cm1.i2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            ob0.b$c r0 = (ob0.C89132b.C89134c) r0
            r2 = 0
            int r3 = r0.f256793a     // Catch:{ all -> 0x0140 }
            if (r3 != 0) goto L_0x0322
            int r3 = r0.f256794b     // Catch:{ all -> 0x0140 }
            if (r3 != 0) goto L_0x0322
            T r3 = r0.f256796d     // Catch:{ all -> 0x0140 }
            if (r3 == 0) goto L_0x0322
            r4 = r3
            te3.jm0 r4 = (te3.C50008jm0) r4     // Catch:{ all -> 0x0140 }
            pe3.b r11 = r4.f136185f     // Catch:{ all -> 0x0140 }
            te3.jm0 r3 = (te3.C50008jm0) r3     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.finder.feed.model.r r3 = r1.f158796a     // Catch:{ all -> 0x0140 }
            java.lang.String r3 = r3.f158807h     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r4.<init>()     // Catch:{ all -> 0x0140 }
            java.lang.String r5 = "---refreshData lastBuffer "
            r4.append(r5)     // Catch:{ all -> 0x0140 }
            if (r11 != 0) goto L_0x002d
            java.lang.String r5 = "null"
            goto L_0x0035
        L_0x002d:
            byte[] r5 = r11.mo123703f()     // Catch:{ all -> 0x0140 }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((byte[]) r5)     // Catch:{ all -> 0x0140 }
        L_0x0035:
            r4.append(r5)     // Catch:{ all -> 0x0140 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0140 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r4)     // Catch:{ all -> 0x0140 }
            T r3 = r0.f256796d     // Catch:{ all -> 0x0140 }
            r4 = r3
            te3.jm0 r4 = (te3.C50008jm0) r4     // Catch:{ all -> 0x0140 }
            int r4 = r4.f136188i     // Catch:{ all -> 0x0140 }
            r15 = 1
            if (r4 != r15) goto L_0x004b
            r13 = 1
            goto L_0x004c
        L_0x004b:
            r13 = 0
        L_0x004c:
            r4 = r3
            te3.jm0 r4 = (te3.C50008jm0) r4     // Catch:{ all -> 0x0140 }
            int r4 = r4.f136187h     // Catch:{ all -> 0x0140 }
            if (r4 != r15) goto L_0x0055
            r12 = 1
            goto L_0x0056
        L_0x0055:
            r12 = 0
        L_0x0056:
            te3.jm0 r3 = (te3.C50008jm0) r3     // Catch:{ all -> 0x0140 }
            if (r3 == 0) goto L_0x006e
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> r3 = r3.f136195s     // Catch:{ all -> 0x0140 }
            if (r3 == 0) goto L_0x006e
            com.tencent.mm.plugin.finder.feed.model.r r4 = r1.f158796a     // Catch:{ all -> 0x0140 }
            long r5 = r1.f158797b     // Catch:{ all -> 0x0140 }
            zt3.t r7 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.finder.feed.model.n r8 = new com.tencent.mm.plugin.finder.feed.model.n     // Catch:{ all -> 0x0140 }
            r8.<init>(r4, r5, r3)     // Catch:{ all -> 0x0140 }
            zt3.j r7 = (zt3.C119157j) r7     // Catch:{ all -> 0x0140 }
            r7.mo183895z(r8)     // Catch:{ all -> 0x0140 }
        L_0x006e:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0140 }
            r3.<init>()     // Catch:{ all -> 0x0140 }
            T r4 = r0.f256796d     // Catch:{ all -> 0x0140 }
            te3.jm0 r4 = (te3.C50008jm0) r4     // Catch:{ all -> 0x0140 }
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> r4 = r4.f136183d     // Catch:{ all -> 0x0140 }
            java.lang.String r5 = "it.resp.commentInfo"
            gy3.C87412m.m108593f(r4, r5)     // Catch:{ all -> 0x0140 }
            long r5 = r1.f158797b     // Catch:{ all -> 0x0140 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0140 }
        L_0x0084:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x0140 }
            if (r7 == 0) goto L_0x009f
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x0140 }
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r7 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r7     // Catch:{ all -> 0x0140 }
            wp1.a r8 = wp1.C66164a.f190162a     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = "commentInfo"
            gy3.C87412m.m108593f(r7, r9)     // Catch:{ all -> 0x0140 }
            cm1.u r7 = r8.mo90221b(r7, r5)     // Catch:{ all -> 0x0140 }
            r3.add(r7)     // Catch:{ all -> 0x0140 }
            goto L_0x0084
        L_0x009f:
            com.tencent.mm.plugin.finder.feed.model.r r4 = r1.f158796a     // Catch:{ all -> 0x0140 }
            T r5 = r0.f256796d     // Catch:{ all -> 0x0140 }
            te3.jm0 r5 = (te3.C50008jm0) r5     // Catch:{ all -> 0x0140 }
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> r5 = r5.f136191o     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = "it.resp.barrageCommentInfo"
            gy3.C87412m.m108593f(r5, r6)     // Catch:{ all -> 0x0140 }
            long r6 = r1.f158797b     // Catch:{ all -> 0x0140 }
            com.tencent.p014mm.plugin.finder.feed.model.C55776r.m63512E1(r4, r5, r6)     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.finder.feed.model.r r4 = r1.f158796a     // Catch:{ all -> 0x0140 }
            java.util.List<up1.w0> r5 = r1.f158798c     // Catch:{ all -> 0x0140 }
            long r6 = r1.f158797b     // Catch:{ all -> 0x0140 }
            com.tencent.p014mm.plugin.finder.feed.model.C55776r.m63514G1(r4, r5, r3, r6)     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.finder.feed.model.r r4 = r1.f158796a     // Catch:{ all -> 0x0140 }
            long r5 = r1.f158797b     // Catch:{ all -> 0x0140 }
            java.util.List r3 = com.tencent.p014mm.plugin.finder.feed.model.C55776r.m63513F1(r4, r3, r5)     // Catch:{ all -> 0x0140 }
            java.util.List<up1.w0> r4 = r1.f158799d     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.finder.feed.model.r r5 = r1.f158796a     // Catch:{ all -> 0x0140 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0140 }
        L_0x00ca:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0140 }
            r16 = 0
            if (r6 == 0) goto L_0x0143
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0140 }
            up1.w0 r6 = (up1.C65426w0) r6     // Catch:{ all -> 0x0140 }
            r7 = r3
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x0140 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0140 }
        L_0x00df:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0140 }
            if (r8 == 0) goto L_0x0103
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0140 }
            r9 = r8
            cm1.u r9 = (cm1.C55033u) r9     // Catch:{ all -> 0x0140 }
            up1.w0 r10 = r9.f154492d     // Catch:{ all -> 0x0140 }
            r10.mo89530m2()     // Catch:{ all -> 0x0140 }
            up1.w0 r9 = r9.f154492d     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = r9.mo89530m2()     // Catch:{ all -> 0x0140 }
            java.lang.String r10 = r6.mo89530m2()     // Catch:{ all -> 0x0140 }
            boolean r9 = gy3.C87412m.m108589b(r9, r10)     // Catch:{ all -> 0x0140 }
            if (r9 == 0) goto L_0x00df
            r16 = r8
        L_0x0103:
            cm1.u r16 = (cm1.C55033u) r16     // Catch:{ all -> 0x0140 }
            if (r16 != 0) goto L_0x00ca
            java.lang.String r7 = r5.f158807h     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r8.<init>()     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = "---merge local item: "
            r8.append(r9)     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = r6.mo89530m2()     // Catch:{ all -> 0x0140 }
            r8.append(r9)     // Catch:{ all -> 0x0140 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0140 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)     // Catch:{ all -> 0x0140 }
            cm1.u r7 = new cm1.u     // Catch:{ all -> 0x0140 }
            r7.<init>(r6)     // Catch:{ all -> 0x0140 }
            java.lang.Class<ny.h> r8 = p629ny.C76979h.class
            di3.d r8 = di3.C86312j.m106911c(r8)     // Catch:{ all -> 0x0140 }
            ny.h r8 = (p629ny.C76979h) r8     // Catch:{ all -> 0x0140 }
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = r6.getContent()     // Catch:{ all -> 0x0140 }
            r8.mo107057T1(r9, r6)     // Catch:{ all -> 0x0140 }
            r6 = r3
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x0140 }
            r6.add(r7)     // Catch:{ all -> 0x0140 }
            goto L_0x00ca
        L_0x0140:
            r0 = move-exception
            goto L_0x0362
        L_0x0143:
            com.tencent.mm.plugin.finder.feed.model.r r4 = r1.f158796a     // Catch:{ all -> 0x0140 }
            java.lang.String r4 = r4.f158807h     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r5.<init>()     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = "---merge respCount:"
            r5.append(r6)     // Catch:{ all -> 0x0140 }
            T r6 = r0.f256796d     // Catch:{ all -> 0x0140 }
            te3.jm0 r6 = (te3.C50008jm0) r6     // Catch:{ all -> 0x0140 }
            int r6 = r6.f136186g     // Catch:{ all -> 0x0140 }
            r5.append(r6)     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = ", preSize: "
            r5.append(r6)     // Catch:{ all -> 0x0140 }
            T r6 = r0.f256796d     // Catch:{ all -> 0x0140 }
            te3.jm0 r6 = (te3.C50008jm0) r6     // Catch:{ all -> 0x0140 }
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> r6 = r6.f136183d     // Catch:{ all -> 0x0140 }
            int r6 = r6.size()     // Catch:{ all -> 0x0140 }
            r5.append(r6)     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = ", afterSize:"
            r5.append(r6)     // Catch:{ all -> 0x0140 }
            r6 = r3
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x0140 }
            int r6 = r6.size()     // Catch:{ all -> 0x0140 }
            r5.append(r6)     // Catch:{ all -> 0x0140 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0140 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ all -> 0x0140 }
            vp1.f r4 = vp1.C65838f.f189333a     // Catch:{ all -> 0x0140 }
            long r5 = r1.f158797b     // Catch:{ all -> 0x0140 }
            r7 = 0
            java.util.List r5 = r4.mo89883d(r5, r7)     // Catch:{ all -> 0x0140 }
            if (r5 != 0) goto L_0x0190
            r5 = 1
            goto L_0x0191
        L_0x0190:
            r5 = 0
        L_0x0191:
            if (r5 == 0) goto L_0x01fc
            long r5 = r1.f158797b     // Catch:{ all -> 0x0140 }
            r20 = 0
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0140 }
            r8 = 10
            int r8 = sx3.C36907w.m41090l(r3, r8)     // Catch:{ all -> 0x0140 }
            r7.<init>(r8)     // Catch:{ all -> 0x0140 }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x0140 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0140 }
        L_0x01a9:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0140 }
            if (r9 == 0) goto L_0x01bb
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0140 }
            cm1.u r9 = (cm1.C55033u) r9     // Catch:{ all -> 0x0140 }
            up1.w0 r9 = r9.f154492d     // Catch:{ all -> 0x0140 }
            r7.add(r9)     // Catch:{ all -> 0x0140 }
            goto L_0x01a9
        L_0x01bb:
            r17 = r4
            r18 = r5
            r22 = r7
            r17.mo89880a(r18, r20, r22)     // Catch:{ all -> 0x0140 }
            vp1.f r5 = vp1.C65838f.f189333a     // Catch:{ all -> 0x0140 }
            long r6 = r1.f158797b     // Catch:{ all -> 0x0140 }
            r8 = 0
            r10 = 0
            r14 = 0
            r5.mo89881b(r6, r8, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.finder.feed.model.r r4 = r1.f158796a     // Catch:{ all -> 0x0140 }
            java.lang.String r4 = r4.f158807h     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r5.<init>()     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = "add cache succ, feedId: "
            r5.append(r6)     // Catch:{ all -> 0x0140 }
            long r6 = r1.f158797b     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = o40.C61926c.m72691p(r6)     // Catch:{ all -> 0x0140 }
            r5.append(r6)     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = ", size:"
            r5.append(r6)     // Catch:{ all -> 0x0140 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0140 }
            int r3 = r3.size()     // Catch:{ all -> 0x0140 }
            r5.append(r3)     // Catch:{ all -> 0x0140 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0140 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)     // Catch:{ all -> 0x0140 }
            goto L_0x0228
        L_0x01fc:
            com.tencent.mm.plugin.finder.feed.model.r r4 = r1.f158796a     // Catch:{ all -> 0x0140 }
            java.lang.String r4 = r4.f158807h     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r5.<init>()     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = "---cache exist or list is empty, feedId:"
            r5.append(r6)     // Catch:{ all -> 0x0140 }
            long r6 = r1.f158797b     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = o40.C61926c.m72691p(r6)     // Catch:{ all -> 0x0140 }
            r5.append(r6)     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = ", list size: "
            r5.append(r6)     // Catch:{ all -> 0x0140 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0140 }
            int r3 = r3.size()     // Catch:{ all -> 0x0140 }
            r5.append(r3)     // Catch:{ all -> 0x0140 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0140 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)     // Catch:{ all -> 0x0140 }
        L_0x0228:
            int r3 = r1.f158800e     // Catch:{ all -> 0x0140 }
            if (r3 < 0) goto L_0x035f
            com.tencent.mm.plugin.finder.feed.model.r r4 = r1.f158796a     // Catch:{ all -> 0x0140 }
            fy3.l<? super java.lang.Integer, ? extends cm1.i2> r4 = r4.f158809j     // Catch:{ all -> 0x0140 }
            if (r4 == 0) goto L_0x023e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0140 }
            java.lang.Object r3 = r4.invoke(r3)     // Catch:{ all -> 0x0140 }
            r16 = r3
            cm1.i2 r16 = (cm1.C0740i2) r16     // Catch:{ all -> 0x0140 }
        L_0x023e:
            r3 = r16
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed     // Catch:{ all -> 0x0140 }
            if (r4 == 0) goto L_0x035f
            r4 = r3
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()     // Catch:{ all -> 0x0140 }
            long r4 = r4.getId()     // Catch:{ all -> 0x0140 }
            long r6 = r1.f158797b     // Catch:{ all -> 0x0140 }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x035f
            r4 = r3
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()     // Catch:{ all -> 0x0140 }
            int r4 = r4.getMediaType()     // Catch:{ all -> 0x0140 }
            r5 = 2
            if (r4 == r5) goto L_0x0271
            r4 = r3
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()     // Catch:{ all -> 0x0140 }
            int r4 = r4.getMediaType()     // Catch:{ all -> 0x0140 }
            r5 = 4
            if (r4 != r5) goto L_0x035f
        L_0x0271:
            T r0 = r0.f256796d     // Catch:{ all -> 0x0140 }
            te3.jm0 r0 = (te3.C50008jm0) r0     // Catch:{ all -> 0x0140 }
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.f136184e     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x035f
            com.tencent.mm.plugin.finder.feed.model.r r4 = r1.f158796a     // Catch:{ all -> 0x0140 }
            long r5 = r1.f158797b     // Catch:{ all -> 0x0140 }
            r7 = r3
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7     // Catch:{ all -> 0x0140 }
            boolean r7 = r7.mo3477K()     // Catch:{ all -> 0x0140 }
            if (r7 == 0) goto L_0x02cd
            r7 = r3
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()     // Catch:{ all -> 0x0140 }
            boolean r7 = r7.isUrlValid()     // Catch:{ all -> 0x0140 }
            if (r7 != 0) goto L_0x02cd
            java.lang.String r0 = r4.f158807h     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r3.<init>()     // Catch:{ all -> 0x0140 }
            java.lang.String r7 = "preloadFirstPageComment: notify feed full update, feedId = "
            r3.append(r7)     // Catch:{ all -> 0x0140 }
            java.lang.String r7 = o40.C61926c.m72691p(r5)     // Catch:{ all -> 0x0140 }
            r3.append(r7)     // Catch:{ all -> 0x0140 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0140 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x0140 }
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = new com.tencent.mm.autogen.events.FeedUpdateEvent     // Catch:{ all -> 0x0140 }
            r0.<init>()     // Catch:{ all -> 0x0140 }
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r0.f9173d     // Catch:{ all -> 0x0140 }
            r3.f9174a = r5     // Catch:{ all -> 0x0140 }
            r3.f9183j = r15     // Catch:{ all -> 0x0140 }
            r3.f9175b = r2     // Catch:{ all -> 0x0140 }
            r0.publish()     // Catch:{ all -> 0x0140 }
            androidx.appcompat.app.AppCompatActivity r0 = r4.f158806g     // Catch:{ all -> 0x0140 }
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x035f
            com.tencent.mm.plugin.finder.feed.model.m r0 = new com.tencent.mm.plugin.finder.feed.model.m     // Catch:{ all -> 0x0140 }
            r0.<init>(r4)     // Catch:{ all -> 0x0140 }
            o40.C61926c.m72668M(r0)     // Catch:{ all -> 0x0140 }
            goto L_0x035f
        L_0x02cd:
            r7 = r3
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()     // Catch:{ all -> 0x0140 }
            int r8 = r0.commentCount     // Catch:{ all -> 0x0140 }
            r7.setCommentCount(r8)     // Catch:{ all -> 0x0140 }
            r7 = r3
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()     // Catch:{ all -> 0x0140 }
            int r8 = r0.likeCount     // Catch:{ all -> 0x0140 }
            r7.setLikeCount(r8)     // Catch:{ all -> 0x0140 }
            r7 = r3
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()     // Catch:{ all -> 0x0140 }
            int r8 = r0.forwardCount     // Catch:{ all -> 0x0140 }
            r7.setForwardCount(r8)     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r3     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()     // Catch:{ all -> 0x0140 }
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()     // Catch:{ all -> 0x0140 }
            te3.ug1 r0 = r0.playhistory_info     // Catch:{ all -> 0x0140 }
            r3.playhistory_info = r0     // Catch:{ all -> 0x0140 }
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = new com.tencent.mm.autogen.events.FeedUpdateEvent     // Catch:{ all -> 0x0140 }
            r0.<init>()     // Catch:{ all -> 0x0140 }
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r0.f9173d     // Catch:{ all -> 0x0140 }
            r3.f9174a = r5     // Catch:{ all -> 0x0140 }
            r7 = 20
            r3.f9175b = r7     // Catch:{ all -> 0x0140 }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0140 }
            java.util.Map<java.lang.Long, com.tencent.mm.autogen.events.FeedUpdateEvent> r7 = r4.f158813q     // Catch:{ all -> 0x0140 }
            boolean r3 = r7.containsKey(r3)     // Catch:{ all -> 0x0140 }
            if (r3 != 0) goto L_0x035f
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0140 }
            java.util.Map<java.lang.Long, com.tencent.mm.autogen.events.FeedUpdateEvent> r4 = r4.f158813q     // Catch:{ all -> 0x0140 }
            r4.put(r3, r0)     // Catch:{ all -> 0x0140 }
            goto L_0x035f
        L_0x0322:
            int r0 = r0.f256794b     // Catch:{ all -> 0x0140 }
            r3 = -4011(0xfffffffffffff055, float:NaN)
            if (r0 == r3) goto L_0x0330
            r3 = -4033(0xfffffffffffff03f, float:NaN)
            if (r0 == r3) goto L_0x0330
            r3 = -4036(0xfffffffffffff03c, float:NaN)
            if (r0 != r3) goto L_0x035f
        L_0x0330:
            wp1.f$a r0 = wp1.C15585f.f42211a     // Catch:{ all -> 0x0140 }
            long r3 = r1.f158797b     // Catch:{ all -> 0x0140 }
            r0.mo14339b(r3)     // Catch:{ all -> 0x0140 }
            com.tencent.mm.autogen.events.FeedDeleteEvent r0 = new com.tencent.mm.autogen.events.FeedDeleteEvent     // Catch:{ all -> 0x0140 }
            r0.<init>()     // Catch:{ all -> 0x0140 }
            com.tencent.mm.autogen.events.FeedDeleteEvent$a r3 = r0.f9154d     // Catch:{ all -> 0x0140 }
            long r4 = r1.f158797b     // Catch:{ all -> 0x0140 }
            r3.f9155a = r4     // Catch:{ all -> 0x0140 }
            r0.publish()     // Catch:{ all -> 0x0140 }
            com.tencent.mm.plugin.finder.feed.model.r r0 = r1.f158796a     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = r0.f158807h     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r3.<init>()     // Catch:{ all -> 0x0140 }
            java.lang.String r4 = "CgiGetFinderFeedComment onCgiEnd: deleteItem by id "
            r3.append(r4)     // Catch:{ all -> 0x0140 }
            long r4 = r1.f158797b     // Catch:{ all -> 0x0140 }
            r3.append(r4)     // Catch:{ all -> 0x0140 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0140 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x0140 }
        L_0x035f:
            com.tencent.mm.plugin.finder.feed.model.r r0 = r1.f158796a
            goto L_0x036e
        L_0x0362:
            com.tencent.mm.plugin.finder.feed.model.r r3 = r1.f158796a     // Catch:{ all -> 0x037c }
            java.lang.String r3 = r3.f158807h     // Catch:{ all -> 0x037c }
            java.lang.String r4 = "preloadFirstPageComment exception"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x037c }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r2)     // Catch:{ all -> 0x037c }
            goto L_0x035f
        L_0x036e:
            java.util.Vector<java.lang.Long> r0 = r0.f158812p
            long r2 = r1.f158797b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.remove(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x037c:
            r0 = move-exception
            com.tencent.mm.plugin.finder.feed.model.r r2 = r1.f158796a
            java.util.Vector<java.lang.Long> r2 = r2.f158812p
            long r3 = r1.f158797b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.remove(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.C55774o.call(java.lang.Object):java.lang.Object");
    }
}
