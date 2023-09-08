package kf1;

import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import hp3.C87581a;
import java.util.List;
import up1.C65426w0;

/* renamed from: kf1.c1 */
public final class C61021c1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderCommentDrawerPresenter f173782a;

    /* renamed from: b */
    public final /* synthetic */ boolean f173783b;

    /* renamed from: c */
    public final /* synthetic */ List<C65426w0> f173784c;

    /* renamed from: d */
    public final /* synthetic */ List<C65426w0> f173785d;

    public C61021c1(FinderCommentDrawerPresenter finderCommentDrawerPresenter, boolean z, List<C65426w0> list, List<C65426w0> list2) {
        this.f173782a = finderCommentDrawerPresenter;
        this.f173783b = z;
        this.f173784c = list;
        this.f173785d = list2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            r2 = r19
            ob0.b$c r2 = (ob0.C89132b.C89134c) r2
            r3 = 0
            java.lang.String r4 = "Finder.DrawerPresenter"
            if (r2 != 0) goto L_0x001b
            java.lang.String r1 = "refreshData resp null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            rx3.l r1 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2, r3)
            goto L_0x028e
        L_0x001b:
            int r5 = r2.f256793a
            r6 = 0
            if (r5 != 0) goto L_0x024f
            int r7 = r2.f256794b
            if (r7 != 0) goto L_0x024f
            T r7 = r2.f256796d
            if (r7 == 0) goto L_0x024f
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r5 = r0.f173782a
            te3.lm0 r7 = (te3.C50284lm0) r7
            pe3.b r7 = r7.f137514f
            r5.f158626r = r7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "refreshData oldVersion:"
            r5.append(r7)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r7 = r0.f173782a
            boolean r7 = r7.f158629u
            r5.append(r7)
            java.lang.String r7 = ", lastBuffer "
            r5.append(r7)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r7 = r0.f173782a
            pe3.b r7 = r7.f158626r
            if (r7 != 0) goto L_0x004f
            java.lang.String r7 = "null"
            goto L_0x005f
        L_0x004f:
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r7 = r0.f173782a
            pe3.b r7 = r7.f158626r
            if (r7 == 0) goto L_0x005a
            byte[] r7 = r7.mo123703f()
            goto L_0x005b
        L_0x005a:
            r7 = r3
        L_0x005b:
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((byte[]) r7)
        L_0x005f:
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            boolean r5 = r0.f173783b
            r7 = 1
            if (r5 == 0) goto L_0x008f
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r5 = r0.f173782a
            T r8 = r2.f256796d
            te3.lm0 r8 = (te3.C50284lm0) r8
            int r8 = r8.f137516h
            if (r8 != r7) goto L_0x007a
            r8 = 1
            goto L_0x007b
        L_0x007a:
            r8 = 0
        L_0x007b:
            r5.mo77322S0(r8)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r5 = r0.f173782a
            T r8 = r2.f256796d
            te3.lm0 r8 = (te3.C50284lm0) r8
            int r8 = r8.f137515g
            if (r8 != r7) goto L_0x008a
            r8 = 1
            goto L_0x008b
        L_0x008a:
            r8 = 0
        L_0x008b:
            r5.mo77323T0(r8)
            goto L_0x009f
        L_0x008f:
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r5 = r0.f173782a
            T r8 = r2.f256796d
            te3.lm0 r8 = (te3.C50284lm0) r8
            int r8 = r8.f137515g
            if (r8 != r7) goto L_0x009b
            r8 = 1
            goto L_0x009c
        L_0x009b:
            r8 = 0
        L_0x009c:
            r5.mo77323T0(r8)
        L_0x009f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            T r8 = r2.f256796d
            te3.lm0 r8 = (te3.C50284lm0) r8
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> r8 = r8.f137512d
            java.lang.String r9 = "it.resp.commentInfo"
            gy3.C87412m.m108593f(r8, r9)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r9 = r0.f173782a
            java.util.Iterator r8 = r8.iterator()
        L_0x00b5:
            boolean r10 = r8.hasNext()
            java.lang.String r11 = "feedObj"
            if (r10 == 0) goto L_0x0125
            java.lang.Object r10 = r8.next()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r10 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r10
            java.lang.String r12 = "commentInfo"
            gy3.C87412m.m108593f(r10, r12)
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r9.f158620i
            if (r12 == 0) goto L_0x0121
            long r11 = r12.getId()
            up1.w0 r13 = new up1.w0
            r13.<init>()
            r13.field_feedId = r11
            r11 = 2
            r13.field_state = r11
            te3.ye0 r11 = r13.field_actionInfo
            r11.f186497e = r10
            r14 = 0
            r11.f186500h = r14
            cm1.u r10 = new cm1.u
            r10.<init>(r13)
            di3.d r11 = di3.C86312j.m106911c(r1)
            ny.h r11 = (p629ny.C76979h) r11
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            up1.w0 r13 = r10.f154492d
            java.lang.String r13 = r13.getContent()
            r11.mo107057T1(r12, r13)
            boolean r11 = r9.f158633y
            if (r11 == 0) goto L_0x010f
            long r11 = r10.getItemId()
            r13 = r8
            long r7 = r9.f158632x
            int r16 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r16 != 0) goto L_0x0110
            int r11 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r11 == 0) goto L_0x0110
            r7 = 1
            goto L_0x0111
        L_0x010f:
            r13 = r8
        L_0x0110:
            r7 = 0
        L_0x0111:
            r10.f154499n = r7
            long r11 = r9.f158634z
            r10.f154500o = r11
            if (r7 == 0) goto L_0x011b
            r9.f158633y = r6
        L_0x011b:
            r5.add(r10)
            r8 = r13
            r7 = 1
            goto L_0x00b5
        L_0x0121:
            gy3.C87412m.m108603p(r11)
            throw r3
        L_0x0125:
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r7 = r0.f173782a
            com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter.m63416x(r7, r5)
            int r7 = r5.size()
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r8 = r0.f173782a
            java.util.List<up1.w0> r9 = r0.f173784c
            com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter.m63414N(r8, r9, r5)
            int r8 = r5.size()
            int r8 = r8 - r7
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r7 = r0.f173782a
            java.util.List r5 = r7.mo77330f0(r5, r6)
            r7 = r5
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r9 = r7.size()
            java.util.List<up1.w0> r10 = r0.f173785d
            java.util.Iterator r10 = r10.iterator()
        L_0x014d:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x01ba
            java.lang.Object r12 = r10.next()
            up1.w0 r12 = (up1.C65426w0) r12
            java.util.Iterator r13 = r7.iterator()
        L_0x015d:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0182
            java.lang.Object r14 = r13.next()
            r15 = r14
            cm1.u r15 = (cm1.C55033u) r15
            up1.w0 r6 = r15.f154492d
            r6.mo89530m2()
            up1.w0 r6 = r15.f154492d
            java.lang.String r6 = r6.mo89530m2()
            java.lang.String r15 = r12.mo89530m2()
            boolean r6 = gy3.C87412m.m108589b(r6, r15)
            if (r6 == 0) goto L_0x0180
            goto L_0x0183
        L_0x0180:
            r6 = 0
            goto L_0x015d
        L_0x0182:
            r14 = r3
        L_0x0183:
            cm1.u r14 = (cm1.C55033u) r14
            if (r14 != 0) goto L_0x01b8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "merge local item: "
            r6.append(r13)
            java.lang.String r13 = r12.mo89530m2()
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            cm1.u r6 = new cm1.u
            r6.<init>(r12)
            di3.d r13 = di3.C86312j.m106911c(r1)
            ny.h r13 = (p629ny.C76979h) r13
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r12 = r12.getContent()
            r13.mo107057T1(r14, r12)
            r7.add(r6)
        L_0x01b8:
            r6 = 0
            goto L_0x014d
        L_0x01ba:
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r1 = r0.f173782a
            up1.w0 r1 = r1.f158608K
            if (r1 == 0) goto L_0x01f5
            java.util.Iterator r6 = r7.iterator()
        L_0x01c4:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x01e1
            java.lang.Object r10 = r6.next()
            r12 = r10
            cm1.u r12 = (cm1.C55033u) r12
            up1.w0 r12 = r12.f154492d
            long r12 = r12.field_localCommentId
            long r14 = r1.field_localCommentId
            int r17 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r17 != 0) goto L_0x01dd
            r12 = 1
            goto L_0x01de
        L_0x01dd:
            r12 = 0
        L_0x01de:
            if (r12 == 0) goto L_0x01c4
            goto L_0x01e2
        L_0x01e1:
            r10 = r3
        L_0x01e2:
            cm1.u r10 = (cm1.C55033u) r10
            if (r10 != 0) goto L_0x01ee
            cm1.u r10 = new cm1.u
            r10.<init>(r1)
            r7.add(r10)
        L_0x01ee:
            r1 = 1
            r10.f154499n = r1
            r12 = 2000(0x7d0, double:9.88E-321)
            r10.f154500o = r12
        L_0x01f5:
            int r1 = r7.size()
            int r1 = r1 - r9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "preSize: "
            r6.append(r9)
            T r2 = r2.f256796d
            te3.lm0 r2 = (te3.C50284lm0) r2
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> r2 = r2.f137512d
            int r2 = r2.size()
            r6.append(r2)
            java.lang.String r2 = ", afterSize:"
            r6.append(r2)
            int r2 = r7.size()
            r6.append(r2)
            java.lang.String r2 = ", diffsize1:"
            r6.append(r2)
            r6.append(r8)
            java.lang.String r2 = ", diffSize2:"
            r6.append(r2)
            r6.append(r1)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r2 = r0.f173782a
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f158620i
            if (r2 == 0) goto L_0x024b
            int r3 = r2.getCommentCount()
            int r8 = r8 + r1
            int r3 = r3 + r8
            r2.setCommentCount(r3)
            rx3.l r1 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.<init>(r2, r5)
            goto L_0x028e
        L_0x024b:
            gy3.C87412m.m108603p(r11)
            throw r3
        L_0x024f:
            int r1 = r2.f256794b
            r2 = -4014(0xfffffffffffff052, float:NaN)
            if (r1 == r2) goto L_0x027d
            r2 = -4032(0xfffffffffffff040, float:NaN)
            if (r1 != r2) goto L_0x025a
            goto L_0x027d
        L_0x025a:
            er1.j4 r2 = er1.C58739j4.f168176a
            boolean r1 = r2.mo83681J(r5, r1)
            if (r1 == 0) goto L_0x0275
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r1 = r0.f173782a
            r2 = 0
            r1.mo77322S0(r2)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r1 = r0.f173782a
            r1.mo77323T0(r2)
            rx3.l r1 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.<init>(r2, r3)
            goto L_0x028e
        L_0x0275:
            rx3.l r1 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2, r3)
            goto L_0x028e
        L_0x027d:
            kf1.b1 r1 = new kf1.b1
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r2 = r0.f173782a
            r1.<init>(r2)
            o40.C61926c.m72668M(r1)
            rx3.l r1 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.<init>(r2, r3)
        L_0x028e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C61021c1.call(java.lang.Object):java.lang.Object");
    }
}
