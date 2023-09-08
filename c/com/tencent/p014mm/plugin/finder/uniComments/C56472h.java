package com.tencent.p014mm.plugin.finder.uniComments;

import gy3.C8479f0;
import hp3.C87581a;
import java.util.List;
import sq1.C64147b;

/* renamed from: com.tencent.mm.plugin.finder.uniComments.h */
public final class C56472h<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ UniCommentDrawerPresenter f161462a;

    /* renamed from: b */
    public final /* synthetic */ boolean f161463b;

    /* renamed from: c */
    public final /* synthetic */ C8479f0<List<C64147b>> f161464c;

    /* renamed from: d */
    public final /* synthetic */ C8479f0<List<C64147b>> f161465d;

    public C56472h(UniCommentDrawerPresenter uniCommentDrawerPresenter, boolean z, C8479f0<List<C64147b>> f0Var, C8479f0<List<C64147b>> f0Var2) {
        this.f161462a = uniCommentDrawerPresenter;
        this.f161463b = z;
        this.f161464c = f0Var;
        this.f161465d = f0Var2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:174:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0198 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d2 A[LOOP:0: B:30:0x0090->B:47:0x00d2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0195  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            ob0.b$c r1 = (ob0.C89132b.C89134c) r1
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            java.lang.String r3 = "MicroMsg.MusicUni.DrawerPresenter"
            r4 = 0
            if (r1 != 0) goto L_0x001c
            java.lang.String r1 = "refreshData resp null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            rx3.l r1 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2, r4)
            r4 = r0
            goto L_0x03f4
        L_0x001c:
            int r5 = r1.f256793a
            if (r5 != 0) goto L_0x03b1
            int r6 = r1.f256794b
            if (r6 != 0) goto L_0x03b1
            T r6 = r1.f256796d
            if (r6 == 0) goto L_0x03b1
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r5 = r0.f161462a
            te3.ao1 r6 = (te3.C64236ao1) r6
            pe3.b r6 = r6.f182114h
            r5.f161385p = r6
            boolean r5 = r0.f161463b
            java.lang.String r6 = "feedObj"
            r7 = 1
            if (r5 == 0) goto L_0x006a
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r5 = r0.f161462a
            T r8 = r1.f256796d
            te3.ao1 r8 = (te3.C64236ao1) r8
            int r8 = r8.f182113g
            if (r8 != r7) goto L_0x0043
            r8 = 1
            goto L_0x0044
        L_0x0043:
            r8 = 0
        L_0x0044:
            r5.mo79246u0(r8)
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r5 = r0.f161462a
            T r8 = r1.f256796d
            te3.ao1 r8 = (te3.C64236ao1) r8
            int r8 = r8.f182112f
            if (r8 != r7) goto L_0x0053
            r7 = 1
            goto L_0x0054
        L_0x0053:
            r7 = 0
        L_0x0054:
            r5.mo79228J0(r7)
            T r5 = r1.f256796d
            te3.ao1 r5 = (te3.C64236ao1) r5
            int r5 = r5.f182111e
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r7 = r0.f161462a
            qq1.a r7 = r7.f161380h
            if (r7 == 0) goto L_0x0066
            r7.f179671c = r5
            goto L_0x007a
        L_0x0066:
            gy3.C87412m.m108603p(r6)
            throw r4
        L_0x006a:
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r5 = r0.f161462a
            T r8 = r1.f256796d
            te3.ao1 r8 = (te3.C64236ao1) r8
            int r8 = r8.f182112f
            if (r8 != r7) goto L_0x0076
            r7 = 1
            goto L_0x0077
        L_0x0076:
            r7 = 0
        L_0x0077:
            r5.mo79228J0(r7)
        L_0x007a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            T r1 = r1.f256796d
            te3.ao1 r1 = (te3.C64236ao1) r1
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> r1 = r1.f182110d
            java.lang.String r7 = "it.resp.comment_info"
            gy3.C87412m.m108593f(r1, r7)
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r7 = r0.f161462a
            java.util.Iterator r1 = r1.iterator()
        L_0x0090:
            boolean r8 = r1.hasNext()
            java.lang.String r9 = "commentInfo"
            r10 = 0
            if (r8 == 0) goto L_0x00e2
            java.lang.Object r8 = r1.next()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r8 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r8
            pq1.a r12 = pq1.C62490a.f177529a
            gy3.C87412m.m108593f(r8, r9)
            qq1.a r9 = r7.f161380h
            if (r9 == 0) goto L_0x00de
            int r4 = r9.f179674f
            long r13 = (long) r4
            sq1.e r4 = r12.mo87519a(r8, r13)
            boolean r8 = r7.f161391v
            if (r8 == 0) goto L_0x00c4
            long r8 = r4.getItemId()
            long r12 = r7.f161390u
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x00c4
            int r8 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x00c4
            r8 = 1
            goto L_0x00c5
        L_0x00c4:
            r8 = 0
        L_0x00c5:
            r4.f181872h = r8
            if (r8 == 0) goto L_0x00cc
            r8 = 0
            r7.f161391v = r8
        L_0x00cc:
            sq1.b r8 = r4.f181868d
            qq1.a r9 = r7.f161380h
            if (r9 == 0) goto L_0x00d9
            r8.f181859P = r9
            r5.add(r4)
            r4 = 0
            goto L_0x0090
        L_0x00d9:
            gy3.C87412m.m108603p(r6)
            r1 = 0
            throw r1
        L_0x00de:
            gy3.C87412m.m108603p(r6)
            throw r4
        L_0x00e2:
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r1 = r0.f161462a
            long r7 = r1.f161390u
            int r4 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x01c8
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r7 = r5.iterator()
            r8 = 0
            r10 = -1
        L_0x00f5:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x01b8
            java.lang.Object r11 = r7.next()
            int r12 = r8 + 1
            if (r8 < 0) goto L_0x01b3
            sq1.e r11 = (sq1.C64151e) r11
            sq1.b r13 = r11.f181868d
            java.util.LinkedList r13 = r13.mo88881s2()
            if (r13 == 0) goto L_0x013c
            java.util.Iterator r13 = r13.iterator()
            r14 = 0
        L_0x0112:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x0136
            java.lang.Object r15 = r13.next()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r15 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r15
            r24 = r7
            r16 = r8
            long r7 = r15.commentId
            r15 = r12
            r17 = r13
            long r12 = r1.f161390u
            int r18 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r18 != 0) goto L_0x012e
            r14 = 1
        L_0x012e:
            r7 = r24
            r12 = r15
            r8 = r16
            r13 = r17
            goto L_0x0112
        L_0x0136:
            r24 = r7
            r16 = r8
            r15 = r12
            goto L_0x0142
        L_0x013c:
            r24 = r7
            r16 = r8
            r15 = r12
            r14 = 0
        L_0x0142:
            if (r14 == 0) goto L_0x01ab
            sq1.b r7 = r11.f181868d
            java.util.LinkedList r7 = r7.mo88881s2()
            java.lang.String r8 = "root.commentObj.levelTwoComment"
            gy3.C87412m.m108593f(r7, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0158:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x01a3
            java.lang.Object r10 = r7.next()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r10 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r10
            pq1.a r17 = pq1.C62490a.f177529a
            gy3.C87412m.m108593f(r10, r9)
            qq1.a r12 = r1.f161380h
            if (r12 == 0) goto L_0x019e
            int r12 = r12.f179674f
            long r12 = (long) r12
            long r21 = r11.getItemId()
            r18 = r10
            r19 = r12
            sq1.e r10 = r17.mo87520b(r18, r19, r21)
            boolean r12 = r1.f161391v
            if (r12 == 0) goto L_0x018e
            long r12 = r10.getItemId()
            r17 = r15
            long r14 = r1.f161390u
            int r18 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r18 != 0) goto L_0x0190
            r12 = 1
            goto L_0x0191
        L_0x018e:
            r17 = r15
        L_0x0190:
            r12 = 0
        L_0x0191:
            r10.f181872h = r12
            if (r12 == 0) goto L_0x0198
            r12 = 0
            r1.f161391v = r12
        L_0x0198:
            r8.add(r10)
            r15 = r17
            goto L_0x0158
        L_0x019e:
            gy3.C87412m.m108603p(r6)
            r1 = 0
            throw r1
        L_0x01a3:
            r17 = r15
            r4.addAll(r8)
            r10 = r16
            goto L_0x01ad
        L_0x01ab:
            r17 = r15
        L_0x01ad:
            r7 = r24
            r8 = r17
            goto L_0x00f5
        L_0x01b3:
            r1 = 0
            sx3.C64197v.m75542k()
            throw r1
        L_0x01b8:
            if (r10 < 0) goto L_0x01c8
            int r7 = r4.size()
            if (r7 <= 0) goto L_0x01c8
            int r10 = r10 + 1
            r5.addAll(r10, r4)
            r1.getClass()
        L_0x01c8:
            int r1 = r5.size()
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r4 = r0.f161462a
            gy3.f0<java.util.List<sq1.b>> r7 = r0.f161464c
            T r7 = r7.f27484d
            java.util.List r7 = (java.util.List) r7
            r4.getClass()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r7.iterator()
        L_0x01e5:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0237
            java.lang.Object r11 = r10.next()
            sq1.b r11 = (sq1.C64147b) r11
            te3.ye0 r11 = r11.field_actionInfo
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r11 = r11.f186501i
            if (r11 == 0) goto L_0x0234
            java.util.Iterator r12 = r9.iterator()
            r13 = 0
        L_0x01fc:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x021f
            java.lang.Object r14 = r12.next()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r14 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r14
            long r14 = r14.commentId
            r24 = r1
            long r0 = r11.commentId
            int r16 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r16 != 0) goto L_0x0214
            r0 = 1
            goto L_0x0215
        L_0x0214:
            r0 = 0
        L_0x0215:
            if (r0 == 0) goto L_0x0218
            goto L_0x0222
        L_0x0218:
            int r13 = r13 + 1
            r0 = r23
            r1 = r24
            goto L_0x01fc
        L_0x021f:
            r24 = r1
            r13 = -1
        L_0x0222:
            if (r13 >= 0) goto L_0x022f
            long r0 = r11.commentId
            r12 = 0
            int r14 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x022f
            r9.add(r11)
        L_0x022f:
            r0 = r23
            r1 = r24
            goto L_0x01e5
        L_0x0234:
            r0 = r23
            goto L_0x01e5
        L_0x0237:
            r24 = r1
            java.util.Iterator r0 = r9.iterator()
        L_0x023d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02dc
            java.lang.Object r1 = r0.next()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r1 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r1
            java.util.Iterator r10 = r5.iterator()
            r11 = 0
        L_0x024e:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x026f
            java.lang.Object r12 = r10.next()
            sq1.e r12 = (sq1.C64151e) r12
            sq1.b r12 = r12.f181868d
            long r12 = r12.mo88875m2()
            long r14 = r1.commentId
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x0268
            r12 = 1
            goto L_0x0269
        L_0x0268:
            r12 = 0
        L_0x0269:
            if (r12 == 0) goto L_0x026c
            goto L_0x0270
        L_0x026c:
            int r11 = r11 + 1
            goto L_0x024e
        L_0x026f:
            r11 = -1
        L_0x0270:
            if (r11 < 0) goto L_0x0293
            r5.remove(r11)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "mergeLocalLevel2Comments, remove level1ExistIndex:"
            r10.append(r12)
            r10.append(r11)
            java.lang.String r11 = ", id:"
            r10.append(r11)
            long r11 = r1.commentId
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
        L_0x0293:
            pq1.a r10 = pq1.C62490a.f177529a
            qq1.a r11 = r4.f161380h
            if (r11 == 0) goto L_0x02d7
            int r11 = r11.f179674f
            long r11 = (long) r11
            sq1.e r10 = r10.mo87519a(r1, r11)
            r8.add(r10)
            java.util.Iterator r10 = r7.iterator()
        L_0x02a7:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x023d
            java.lang.Object r11 = r10.next()
            sq1.b r11 = (sq1.C64147b) r11
            te3.ye0 r12 = r11.field_actionInfo
            long r12 = r12.f186500h
            long r14 = r1.commentId
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x02a7
            sq1.e r12 = new sq1.e
            r12.<init>(r11)
            di3.d r13 = di3.C86312j.m106911c(r2)
            ny.h r13 = (p629ny.C76979h) r13
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r11 = r11.getContent()
            r13.mo107057T1(r14, r11)
            r8.add(r12)
            goto L_0x02a7
        L_0x02d7:
            gy3.C87412m.m108603p(r6)
            r0 = 0
            throw r0
        L_0x02dc:
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x0306
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mergeLocalLevel2Comments, total local size: "
            r0.append(r1)
            int r1 = r8.size()
            r0.append(r1)
            java.lang.String r1 = ", level1 size:"
            r0.append(r1)
            int r1 = r9.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x0306:
            r5.addAll(r8)
            int r0 = r5.size()
            int r0 = r0 - r24
            r4 = r23
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r1 = r4.f161462a
            java.util.List r1 = com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter.m64755t(r1, r5)
            r5 = r1
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r7 = r5.size()
            gy3.f0<java.util.List<sq1.b>> r8 = r4.f161465d
            T r8 = r8.f27484d
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0328:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0392
            java.lang.Object r9 = r8.next()
            sq1.b r9 = (sq1.C64147b) r9
            java.util.Iterator r10 = r5.iterator()
        L_0x0338:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x035b
            java.lang.Object r11 = r10.next()
            r12 = r11
            sq1.e r12 = (sq1.C64151e) r12
            sq1.b r13 = r12.f181868d
            r13.mo88874l2()
            sq1.b r12 = r12.f181868d
            java.lang.String r12 = r12.mo88874l2()
            java.lang.String r13 = r9.mo88874l2()
            boolean r12 = gy3.C87412m.m108589b(r12, r13)
            if (r12 == 0) goto L_0x0338
            goto L_0x035c
        L_0x035b:
            r11 = 0
        L_0x035c:
            sq1.e r11 = (sq1.C64151e) r11
            if (r11 != 0) goto L_0x0328
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "merge local item: "
            r10.append(r11)
            java.lang.String r11 = r9.mo88874l2()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            sq1.e r10 = new sq1.e
            r10.<init>(r9)
            di3.d r11 = di3.C86312j.m106911c(r2)
            ny.h r11 = (p629ny.C76979h) r11
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r9 = r9.getContent()
            r11.mo107057T1(r12, r9)
            r5.add(r10)
            goto L_0x0328
        L_0x0392:
            int r2 = r5.size()
            int r2 = r2 - r7
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r3 = r4.f161462a
            qq1.a r3 = r3.f161380h
            if (r3 == 0) goto L_0x03ac
            int r5 = r3.f179671c
            int r0 = r0 + r2
            int r5 = r5 + r0
            r3.f179671c = r5
            rx3.l r0 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.<init>(r2, r1)
            r1 = r0
            goto L_0x03f4
        L_0x03ac:
            gy3.C87412m.m108603p(r6)
            r0 = 0
            throw r0
        L_0x03b1:
            r4 = r0
            int r0 = r1.f256794b
            r1 = -4014(0xfffffffffffff052, float:NaN)
            if (r0 == r1) goto L_0x03e2
            r1 = -4032(0xfffffffffffff040, float:NaN)
            if (r0 != r1) goto L_0x03bd
            goto L_0x03e2
        L_0x03bd:
            er1.j4 r1 = er1.C58739j4.f168176a
            boolean r0 = r1.mo83681J(r5, r0)
            if (r0 == 0) goto L_0x03d9
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r0 = r4.f161462a
            r1 = 0
            r0.mo79246u0(r1)
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r0 = r4.f161462a
            r0.mo79228J0(r1)
            rx3.l r1 = new rx3.l
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2 = 0
            r1.<init>(r0, r2)
            goto L_0x03f4
        L_0x03d9:
            r0 = 0
            rx3.l r1 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2, r0)
            goto L_0x03f4
        L_0x03e2:
            r0 = 0
            com.tencent.mm.plugin.finder.uniComments.g r1 = new com.tencent.mm.plugin.finder.uniComments.g
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r2 = r4.f161462a
            r1.<init>(r2)
            o40.C61926c.m72668M(r1)
            rx3.l r1 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.<init>(r2, r0)
        L_0x03f4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.uniComments.C56472h.call(java.lang.Object):java.lang.Object");
    }
}
