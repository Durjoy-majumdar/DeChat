package kf1;

import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import hp3.C87581a;
import java.util.List;
import up1.C65426w0;

/* renamed from: kf1.x0 */
public final class C61070x0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderCommentDrawerPresenter f173923a;

    /* renamed from: b */
    public final /* synthetic */ boolean f173924b;

    /* renamed from: c */
    public final /* synthetic */ List<C65426w0> f173925c;

    /* renamed from: d */
    public final /* synthetic */ List<C65426w0> f173926d;

    public C61070x0(FinderCommentDrawerPresenter finderCommentDrawerPresenter, boolean z, List<C65426w0> list, List<C65426w0> list2) {
        this.f173923a = finderCommentDrawerPresenter;
        this.f173924b = z;
        this.f173925c = list;
        this.f173926d = list2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0151 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014f  */
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
            goto L_0x02ed
        L_0x001b:
            int r5 = r2.f256793a
            r6 = 0
            if (r5 != 0) goto L_0x02ab
            int r7 = r2.f256794b
            if (r7 != 0) goto L_0x02ab
            T r7 = r2.f256796d
            if (r7 == 0) goto L_0x02ab
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r5 = r0.f173923a
            te3.jm0 r7 = (te3.C50008jm0) r7
            pe3.b r7 = r7.f136185f
            r5.f158626r = r7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "refreshData oldVersion:"
            r5.append(r7)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r7 = r0.f173923a
            boolean r7 = r7.f158629u
            r5.append(r7)
            java.lang.String r7 = ", lastBuffer "
            r5.append(r7)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r7 = r0.f173923a
            pe3.b r7 = r7.f158626r
            if (r7 != 0) goto L_0x004f
            java.lang.String r7 = "null"
            goto L_0x005f
        L_0x004f:
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r7 = r0.f173923a
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
            boolean r5 = r0.f173924b
            java.lang.String r7 = "feedObj"
            r8 = 1
            if (r5 == 0) goto L_0x00c4
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r5 = r0.f173923a
            T r9 = r2.f256796d
            te3.jm0 r9 = (te3.C50008jm0) r9
            int r9 = r9.f136188i
            if (r9 != r8) goto L_0x007c
            r9 = 1
            goto L_0x007d
        L_0x007c:
            r9 = 0
        L_0x007d:
            r5.mo77322S0(r9)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r5 = r0.f173923a
            T r9 = r2.f256796d
            te3.jm0 r9 = (te3.C50008jm0) r9
            int r9 = r9.f136187h
            if (r9 != r8) goto L_0x008c
            r9 = 1
            goto L_0x008d
        L_0x008c:
            r9 = 0
        L_0x008d:
            r5.mo77323T0(r9)
            T r5 = r2.f256796d
            te3.jm0 r5 = (te3.C50008jm0) r5
            int r5 = r5.f136186g
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r9 = r0.f173923a
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r9.f158620i
            if (r9 == 0) goto L_0x00c0
            r9.setCommentCount(r5)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "first fetch, svrCount:"
            r9.append(r10)
            r9.append(r5)
            java.lang.String r5 = ", oldVersion:"
            r9.append(r5)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r5 = r0.f173923a
            boolean r5 = r5.f158629u
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            goto L_0x00d4
        L_0x00c0:
            gy3.C87412m.m108603p(r7)
            throw r3
        L_0x00c4:
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r5 = r0.f173923a
            T r9 = r2.f256796d
            te3.jm0 r9 = (te3.C50008jm0) r9
            int r9 = r9.f136187h
            if (r9 != r8) goto L_0x00d0
            r9 = 1
            goto L_0x00d1
        L_0x00d0:
            r9 = 0
        L_0x00d1:
            r5.mo77323T0(r9)
        L_0x00d4:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            T r9 = r2.f256796d
            te3.jm0 r9 = (te3.C50008jm0) r9
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> r9 = r9.f136183d
            java.lang.String r10 = "it.resp.commentInfo"
            gy3.C87412m.m108593f(r9, r10)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r10 = r0.f173923a
            java.util.Iterator r9 = r9.iterator()
        L_0x00ea:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x015f
            java.lang.Object r11 = r9.next()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r11 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r11
            java.lang.String r12 = "commentInfo"
            gy3.C87412m.m108593f(r11, r12)
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r10.f158620i
            if (r12 == 0) goto L_0x015a
            long r12 = r12.getId()
            up1.w0 r14 = new up1.w0
            r14.<init>()
            r14.field_feedId = r12
            r12 = 2
            r14.field_state = r12
            te3.ye0 r12 = r14.field_actionInfo
            r12.f186497e = r11
            r11 = r9
            r8 = 0
            r12.f186500h = r8
            cm1.u r12 = new cm1.u
            r12.<init>(r14)
            di3.d r13 = di3.C86312j.m106911c(r1)
            ny.h r13 = (p629ny.C76979h) r13
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            up1.w0 r15 = r12.f154492d
            java.lang.String r15 = r15.getContent()
            r13.mo107057T1(r14, r15)
            boolean r13 = r10.f158633y
            if (r13 == 0) goto L_0x0144
            long r13 = r12.getItemId()
            r16 = r4
            long r3 = r10.f158632x
            int r17 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r17 != 0) goto L_0x0146
            int r13 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x0146
            r3 = 1
            goto L_0x0147
        L_0x0144:
            r16 = r4
        L_0x0146:
            r3 = 0
        L_0x0147:
            r12.f154499n = r3
            long r8 = r10.f158634z
            r12.f154500o = r8
            if (r3 == 0) goto L_0x0151
            r10.f158633y = r6
        L_0x0151:
            r5.add(r12)
            r9 = r11
            r4 = r16
            r3 = 0
            r8 = 1
            goto L_0x00ea
        L_0x015a:
            gy3.C87412m.m108603p(r7)
            r1 = 0
            throw r1
        L_0x015f:
            r16 = r4
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r3 = r0.f173923a
            com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter.m63416x(r3, r5)
            int r3 = r5.size()
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r4 = r0.f173923a
            java.util.List<up1.w0> r8 = r0.f173925c
            com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter.m63414N(r4, r8, r5)
            int r4 = r5.size()
            int r4 = r4 - r3
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r3 = r0.f173923a
            java.util.List r3 = r3.mo77330f0(r5, r6)
            r5 = r3
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r8 = r5.size()
            java.util.List<up1.w0> r9 = r0.f173926d
            java.util.Iterator r9 = r9.iterator()
        L_0x0189:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01fa
            java.lang.Object r10 = r9.next()
            up1.w0 r10 = (up1.C65426w0) r10
            java.util.Iterator r11 = r5.iterator()
        L_0x0199:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x01bc
            java.lang.Object r12 = r11.next()
            r13 = r12
            cm1.u r13 = (cm1.C55033u) r13
            up1.w0 r14 = r13.f154492d
            r14.mo89530m2()
            up1.w0 r13 = r13.f154492d
            java.lang.String r13 = r13.mo89530m2()
            java.lang.String r14 = r10.mo89530m2()
            boolean r13 = gy3.C87412m.m108589b(r13, r14)
            if (r13 == 0) goto L_0x0199
            goto L_0x01bd
        L_0x01bc:
            r12 = 0
        L_0x01bd:
            cm1.u r12 = (cm1.C55033u) r12
            if (r12 != 0) goto L_0x01f5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "merge local item: "
            r11.append(r12)
            java.lang.String r12 = r10.mo89530m2()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r12 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            cm1.u r11 = new cm1.u
            r11.<init>(r10)
            di3.d r13 = di3.C86312j.m106911c(r1)
            ny.h r13 = (p629ny.C76979h) r13
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r10 = r10.getContent()
            r13.mo107057T1(r14, r10)
            r5.add(r11)
            goto L_0x01f7
        L_0x01f5:
            r12 = r16
        L_0x01f7:
            r16 = r12
            goto L_0x0189
        L_0x01fa:
            r12 = r16
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r1 = r0.f173923a
            up1.w0 r1 = r1.f158608K
            if (r1 == 0) goto L_0x0240
            java.util.Iterator r9 = r5.iterator()
        L_0x0206:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0229
            java.lang.Object r10 = r9.next()
            r11 = r10
            cm1.u r11 = (cm1.C55033u) r11
            up1.w0 r11 = r11.f154492d
            long r13 = r11.field_localCommentId
            r16 = r7
            long r6 = r1.field_localCommentId
            int r17 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r17 != 0) goto L_0x0221
            r6 = 1
            goto L_0x0222
        L_0x0221:
            r6 = 0
        L_0x0222:
            if (r6 == 0) goto L_0x0225
            goto L_0x022c
        L_0x0225:
            r7 = r16
            r6 = 0
            goto L_0x0206
        L_0x0229:
            r16 = r7
            r10 = 0
        L_0x022c:
            cm1.u r10 = (cm1.C55033u) r10
            if (r10 != 0) goto L_0x0238
            cm1.u r10 = new cm1.u
            r10.<init>(r1)
            r5.add(r10)
        L_0x0238:
            r1 = 1
            r10.f154499n = r1
            r6 = 2000(0x7d0, double:9.88E-321)
            r10.f154500o = r6
            goto L_0x0242
        L_0x0240:
            r16 = r7
        L_0x0242:
            int r1 = r5.size()
            int r1 = r1 - r8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "merge respCount:"
            r6.append(r7)
            T r7 = r2.f256796d
            te3.jm0 r7 = (te3.C50008jm0) r7
            int r7 = r7.f136186g
            r6.append(r7)
            java.lang.String r7 = ", preSize: "
            r6.append(r7)
            T r2 = r2.f256796d
            te3.jm0 r2 = (te3.C50008jm0) r2
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> r2 = r2.f136183d
            int r2 = r2.size()
            r6.append(r2)
            java.lang.String r2 = ", afterSize:"
            r6.append(r2)
            int r2 = r5.size()
            r6.append(r2)
            java.lang.String r2 = ", diffsize1:"
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = ", diffSize2:"
            r6.append(r2)
            r6.append(r1)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r2 = r0.f173923a
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f158620i
            if (r2 == 0) goto L_0x02a6
            int r5 = r2.getCommentCount()
            int r4 = r4 + r1
            int r5 = r5 + r4
            r2.setCommentCount(r5)
            rx3.l r1 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.<init>(r2, r3)
            goto L_0x02ed
        L_0x02a6:
            gy3.C87412m.m108603p(r16)
            r1 = 0
            throw r1
        L_0x02ab:
            int r1 = r2.f256794b
            r2 = -4014(0xfffffffffffff052, float:NaN)
            if (r1 == r2) goto L_0x02db
            r2 = -4032(0xfffffffffffff040, float:NaN)
            if (r1 != r2) goto L_0x02b6
            goto L_0x02db
        L_0x02b6:
            er1.j4 r2 = er1.C58739j4.f168176a
            boolean r1 = r2.mo83681J(r5, r1)
            if (r1 == 0) goto L_0x02d2
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r1 = r0.f173923a
            r2 = 0
            r1.mo77322S0(r2)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r1 = r0.f173923a
            r1.mo77323T0(r2)
            rx3.l r1 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r3 = 0
            r1.<init>(r2, r3)
            goto L_0x02ed
        L_0x02d2:
            r3 = 0
            rx3.l r1 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2, r3)
            goto L_0x02ed
        L_0x02db:
            r3 = 0
            kf1.w0 r1 = new kf1.w0
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r2 = r0.f173923a
            r1.<init>(r2)
            o40.C61926c.m72668M(r1)
            rx3.l r1 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.<init>(r2, r3)
        L_0x02ed:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C61070x0.call(java.lang.Object):java.lang.Object");
    }
}
