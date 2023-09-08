package kf1;

import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import u60.C14121l;

/* renamed from: kf1.u0 */
public final class C61067u0 extends C87413o implements C32226l<C14121l, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f173918d;

    /* renamed from: e */
    public final /* synthetic */ FinderCommentDrawerPresenter f173919e;

    /* renamed from: f */
    public final /* synthetic */ int f173920f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61067u0(boolean z, FinderCommentDrawerPresenter finderCommentDrawerPresenter, int i) {
        super(1);
        this.f173918d = z;
        this.f173919e = finderCommentDrawerPresenter;
        this.f173920f = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: sx3.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r37) {
        /*
            r36 = this;
            r0 = r36
            r6 = r37
            u60.l r6 = (u60.C14121l) r6
            java.lang.String r1 = "task"
            gy3.C87412m.m108594g(r6, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "refreshData "
            r1.append(r2)
            boolean r2 = r0.f173918d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.DrawerPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            sx3.f0 r1 = sx3.C64186f0.f181907d
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r2 = r0.f173919e
            long r2 = r2.f158632x
            java.lang.String r4 = "feedObj"
            r7 = 0
            r9 = 0
            r10 = 0
            int r11 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x00a8
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            com.tencent.mm.plugin.FinderCommonFeatureService r2 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r2
            up1.c r2 = r2.Ex0()
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r3 = r0.f173919e
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.f158620i
            if (r3 == 0) goto L_0x00a4
            long r11 = r3.getId()
            java.util.List r2 = r2.mo89495jo(r11)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r3 = r0.f173919e
            boolean r3 = r3.f158629u
            if (r3 != 0) goto L_0x00a9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r2.iterator()
        L_0x005d:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x007b
            java.lang.Object r11 = r3.next()
            r12 = r11
            up1.w0 r12 = (up1.C65426w0) r12
            te3.ye0 r12 = r12.field_actionInfo
            long r12 = r12.f186500h
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 == 0) goto L_0x0074
            r12 = 1
            goto L_0x0075
        L_0x0074:
            r12 = 0
        L_0x0075:
            if (r12 == 0) goto L_0x005d
            r1.add(r11)
            goto L_0x005d
        L_0x007b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0084:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x00a2
            java.lang.Object r11 = r2.next()
            r12 = r11
            up1.w0 r12 = (up1.C65426w0) r12
            te3.ye0 r12 = r12.field_actionInfo
            long r12 = r12.f186500h
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L_0x009b
            r12 = 1
            goto L_0x009c
        L_0x009b:
            r12 = 0
        L_0x009c:
            if (r12 == 0) goto L_0x0084
            r3.add(r11)
            goto L_0x0084
        L_0x00a2:
            r2 = r3
            goto L_0x00a9
        L_0x00a4:
            gy3.C87412m.m108603p(r4)
            throw r10
        L_0x00a8:
            r2 = r1
        L_0x00a9:
            rs1.s8$a r3 = rs1.C13442s8.f38060Q0
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r11 = r0.f173919e
            android.content.Context r11 = r11.f158615d
            rs1.s8 r11 = r3.mo12873f(r11)
            if (r11 == 0) goto L_0x00b9
            int r9 = r11.f38096i
            r15 = r9
            goto L_0x00ba
        L_0x00b9:
            r15 = 0
        L_0x00ba:
            zc1.b r9 = zc1.C66785b.f191882e
            boolean r9 = r9.mo90681z1()
            java.lang.String r14 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            if (r9 == 0) goto L_0x0157
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r9 = r0.f173919e
            boolean r12 = r0.f173918d
            int r11 = r0.f173920f
            r9.getClass()
            long r27 = java.lang.System.currentTimeMillis()
            je1.a2 r29 = new je1.a2
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r9.f158620i
            if (r13 == 0) goto L_0x0153
            long r16 = r13.getId()
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r9.f158620i
            if (r13 == 0) goto L_0x014f
            java.lang.String r18 = r13.getObjectNonceId()
            int r13 = r9.f158621j
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r9.f158620i
            if (r5 == 0) goto L_0x014b
            java.lang.String r4 = r5.getUserName()
            pe3.b r5 = r9.f158626r
            r19 = 0
            if (r12 == 0) goto L_0x00f5
            long r7 = r9.f158632x
        L_0x00f5:
            r20 = r7
            android.content.Context r7 = r9.f158615d
            rs1.s8 r3 = r3.mo12873f(r7)
            if (r3 == 0) goto L_0x0103
            te3.hj1 r10 = r3.mo12861q3()
        L_0x0103:
            r23 = r10
            r3 = 2
            if (r11 != r3) goto L_0x010b
            r24 = 1
            goto L_0x010d
        L_0x010b:
            r24 = 2
        L_0x010d:
            r25 = 64
            r26 = 0
            r11 = r29
            r3 = r12
            r7 = r13
            r12 = r16
            r8 = r14
            r14 = r18
            r16 = r7
            r17 = r4
            r18 = r5
            r22 = r3
            r11.<init>(r12, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25, r26)
            nr3.e r4 = r29.mo9225i()
            kf1.c1 r5 = new kf1.c1
            r5.<init>(r9, r3, r1, r2)
            nr3.e r7 = r4.mo123064p(r5)
            kf1.e1 r10 = new kf1.e1
            r1 = r10
            r2 = r9
            r4 = r27
            r1.<init>(r2, r3, r4, r6)
            nr3.e r1 = r7.mo123062e(r10)
            android.content.Context r2 = r9.f158615d
            gy3.C87412m.m108592e(r2, r8)
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
            r1.mo11397F(r2)
            goto L_0x01e8
        L_0x014b:
            gy3.C87412m.m108603p(r4)
            throw r10
        L_0x014f:
            gy3.C87412m.m108603p(r4)
            throw r10
        L_0x0153:
            gy3.C87412m.m108603p(r4)
            throw r10
        L_0x0157:
            r9 = r14
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r5 = r0.f173919e
            boolean r14 = r0.f173918d
            r5.getClass()
            long r33 = java.lang.System.currentTimeMillis()
            je1.x1 r35 = new je1.x1
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r5.f158620i
            if (r11 == 0) goto L_0x01f5
            long r12 = r11.getId()
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r5.f158620i
            if (r11 == 0) goto L_0x01f0
            java.lang.String r16 = r11.getObjectNonceId()
            int r11 = r5.f158621j
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r5.f158620i
            if (r7 == 0) goto L_0x01eb
            java.lang.String r4 = r7.getUserName()
            pe3.b r7 = r5.f158626r
            r20 = 0
            r8 = r11
            if (r14 == 0) goto L_0x018b
            long r10 = r5.f158632x
            r21 = r10
            goto L_0x018d
        L_0x018b:
            r21 = 0
        L_0x018d:
            r23 = 0
            r25 = 0
            r26 = 0
            android.content.Context r10 = r5.f158615d
            rs1.s8 r3 = r3.mo12873f(r10)
            if (r3 == 0) goto L_0x01a2
            te3.hj1 r10 = r3.mo12861q3()
            r27 = r10
            goto L_0x01a4
        L_0x01a2:
            r27 = 0
        L_0x01a4:
            r28 = 1
            r29 = 0
            r30 = 0
            r31 = 105120(0x19aa0, float:1.47304E-40)
            r32 = 0
            r18 = 0
            r3 = r8
            r11 = r35
            r8 = r14
            r14 = r16
            r16 = r3
            r17 = r4
            r19 = r7
            r24 = r8
            r11.<init>(r12, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            nr3.e r3 = r35.mo9225i()
            kf1.x0 r4 = new kf1.x0
            r4.<init>(r5, r8, r1, r2)
            nr3.e r7 = r3.mo123064p(r4)
            kf1.z0 r10 = new kf1.z0
            r1 = r10
            r2 = r5
            r3 = r8
            r8 = r5
            r4 = r33
            r1.<init>(r2, r3, r4, r6)
            nr3.e r1 = r7.mo123062e(r10)
            android.content.Context r2 = r8.f158615d
            gy3.C87412m.m108592e(r2, r9)
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
            r1.mo11397F(r2)
        L_0x01e8:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x01eb:
            gy3.C87412m.m108603p(r4)
            r1 = 0
            throw r1
        L_0x01f0:
            r1 = r10
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x01f5:
            r1 = r10
            gy3.C87412m.m108603p(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C61067u0.invoke(java.lang.Object):java.lang.Object");
    }
}
