package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import kotlin.Metadata;
import nj3.C11182m0;
import qo3.C77407n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Lnj3/e0;", "kotlin.jvm.PlatformType", "menu", "Lrx3/b0;", "onCreateMMMenu", "(Lnj3/e0;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getCreateMoreMenuListener$1 */
public final class C3394x32abef4a implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelinePresenter f16001d;

    /* renamed from: e */
    public final /* synthetic */ BaseFinderFeed f16002e;

    /* renamed from: f */
    public final /* synthetic */ int f16003f;

    /* renamed from: g */
    public final /* synthetic */ C77407n f16004g;

    public C3394x32abef4a(FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter, BaseFinderFeed baseFinderFeed, int i, C77407n nVar) {
        this.f16001d = likedTimelinePresenter;
        this.f16002e = baseFinderFeed;
        this.f16003f = i;
        this.f16004g = nVar;
    }

    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0145, code lost:
        r1 = (r1 = r1.mo3513o()).field_finderObject;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r10v2, types: [boolean, int] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreateMMMenu(nj3.C76874e0 r19) {
        /*
            r18 = this;
            r0 = r18
            r7 = r19
            java.lang.Class<dp1.y0> r8 = dp1.C58417y0.class
            boolean r1 = r19.mo107176v()
            if (r1 == 0) goto L_0x020c
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter r1 = r0.f16001d
            com.tencent.mm.ui.MMActivity r6 = r1.f15975d
            er1.w3 r5 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = r0.f16002e
            r12 = 0
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getCreateMoreMenuListener$1$actionMenuInfo$1 r13 = com.tencent.p014mm.plugin.finder.presenter.contract.C3395x756748ea.f16005d
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getCreateMoreMenuListener$1$actionMenuInfo$2 r14 = new com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getCreateMoreMenuListener$1$actionMenuInfo$2
            qo3.n r1 = r0.f16004g
            r14.<init>(r7, r6, r1)
            r15 = 4
            r16 = 0
            r9 = r5
            r10 = r6
            er1.w3$a r9 = er1.C58784w3.m68431K(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r10 = r9.f26579a
            boolean r11 = r9.f26580b
            java.lang.String r3 = r9.f26583e
            java.lang.String r12 = r9.f26584f
            boolean r1 = r9.f26587i
            if (r1 != 0) goto L_0x004d
            r2 = 102(0x66, float:1.43E-43)
            r4 = 2131755655(0x7f100287, float:1.9142195E38)
            android.content.res.Resources r1 = r6.getResources()
            r13 = 2131099756(0x7f06006c, float:1.7811874E38)
            int r13 = r1.getColor(r13)
            r1 = r19
            r15 = r5
            r5 = r13
            r14 = r6
            r6 = r10
            r1.mo107150j(r2, r3, r4, r5, r6)
            goto L_0x004f
        L_0x004d:
            r15 = r5
            r14 = r6
        L_0x004f:
            boolean r1 = r9.f26588j
            if (r1 != 0) goto L_0x0060
            r2 = 103(0x67, float:1.44E-43)
            r4 = 2131755285(0x7f100115, float:1.9141445E38)
            r5 = 0
            r1 = r19
            r3 = r12
            r6 = r11
            r1.mo107150j(r2, r3, r4, r5, r6)
        L_0x0060:
            boolean r1 = r9.f26590l
            if (r1 != 0) goto L_0x0071
            r2 = 208(0xd0, float:2.91E-43)
            r4 = 2131755296(0x7f100120, float:1.9141467E38)
            r5 = 0
            r6 = 0
            r1 = r19
            r3 = r12
            r1.mo107150j(r2, r3, r4, r5, r6)
        L_0x0071:
            up1.f r17 = up1.C37521f.f99374d
            r17.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99190H7
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r12 = 1
            if (r1 != r12) goto L_0x00c0
            boolean r1 = r9.f26589k
            if (r1 != 0) goto L_0x00c0
            r2 = 104(0x68, float:1.46E-43)
            r1 = 2131825615(0x7f1113cf, float:1.9284091E38)
            java.lang.String r3 = r14.getString(r1)
            r4 = 2131755278(0x7f10010e, float:1.914143E38)
            r5 = 0
            boolean r6 = r9.f26591m
            r1 = r19
            r1.mo107150j(r2, r3, r4, r5, r6)
            di3.d r1 = di3.C86312j.m106911c(r8)
            java.lang.String r2 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            dp1.y0 r1 = (dp1.C58417y0) r1
            r11 = 0
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16002e
            long r2 = r2.getItemId()
            boolean r4 = r9.f26591m
            r5 = 2
            r16 = 0
            r9 = r1
            r10 = r14
            r6 = 1
            r12 = r2
            r3 = r14
            r14 = r4
            r4 = r15
            r15 = r5
            dp1.C58417y0.Qy0(r9, r10, r11, r12, r14, r15, r16)
            goto L_0x00c3
        L_0x00c0:
            r3 = r14
            r4 = r15
            r6 = 1
        L_0x00c3:
            er1.i1 r9 = er1.C58736i1.f168173a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16002e
            r9.mo83664j(r3, r7, r1)
            r17.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99337Y4
            up1.f$h1 r1 = (up1.C37521f.C37530h1) r1
            r1.getClass()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            int r1 = r1.intValue()
            if (r1 != r6) goto L_0x012f
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16002e
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            boolean r1 = r4.mo83939j(r1)
            if (r1 == 0) goto L_0x012f
            di3.d r1 = di3.C86312j.m106911c(r8)
            dp1.y0 r1 = (dp1.C58417y0) r1
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16002e
            long r10 = r2.getItemId()
            r1.Vy0(r3, r10)
            r2 = 113(0x71, float:1.58E-43)
            r1 = 2131829896(0x7f112488, float:1.9292774E38)
            java.lang.String r5 = r3.getString(r1)
            r10 = 2131757017(0x7f1007d9, float:1.9144958E38)
            android.content.res.Resources r1 = r3.getResources()
            r11 = 2131099737(0x7f060059, float:1.7811836E38)
            int r11 = r1.getColor(r11)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16002e
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            boolean r12 = r4.mo83854A(r1)
            r1 = r19
            r13 = r3
            r3 = r5
            r14 = r4
            r4 = r10
            r5 = r11
            r10 = 1
            r6 = r12
            r1.mo107150j(r2, r3, r4, r5, r6)
            goto L_0x0132
        L_0x012f:
            r13 = r3
            r14 = r4
            r10 = 1
        L_0x0132:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16002e
            boolean r1 = r14.mo83933h(r1)
            r11 = 0
            if (r1 == 0) goto L_0x01a5
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16002e
            if (r1 == 0) goto L_0x014c
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            if (r1 == 0) goto L_0x014c
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.field_finderObject
            if (r1 == 0) goto L_0x014c
            int r1 = r1.ringtone_count
            goto L_0x014d
        L_0x014c:
            r1 = 0
        L_0x014d:
            if (r1 == 0) goto L_0x017f
            int r2 = r14.mo83977x0()
            if (r1 < r2) goto L_0x017f
            r2 = 99999(0x1869f, float:1.40128E-40)
            if (r1 <= r2) goto L_0x0166
            r1 = 2131826812(0x7f11187c, float:1.9286519E38)
            java.lang.String r1 = r13.getString(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0173
        L_0x0166:
            r2 = 9999(0x270f, float:1.4012E-41)
            if (r1 <= r2) goto L_0x016f
            java.lang.String r1 = er1.C58784w3.m68432N1(r1)
            goto L_0x0173
        L_0x016f:
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L_0x0173:
            r2 = 2131826564(0x7f111784, float:1.9286016E38)
            java.lang.Object[] r3 = new java.lang.Object[r10]
            r3[r11] = r1
            java.lang.String r1 = r13.getString(r2, r3)
            goto L_0x0186
        L_0x017f:
            r1 = 2131829889(0x7f112481, float:1.929276E38)
            java.lang.String r1 = r13.getString(r1)
        L_0x0186:
            r3 = r1
            java.lang.String r1 = "if(count != 0 && count >…                        }"
            gy3.C87412m.m108593f(r3, r1)
            r2 = 114(0x72, float:1.6E-43)
            r4 = 2131756151(0x7f100477, float:1.9143201E38)
            r5 = 0
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16002e
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            boolean r6 = r14.mo83982z(r1)
            r1 = r19
            r1.mo107150j(r2, r3, r4, r5, r6)
        L_0x01a5:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16002e
            r9.mo83662h(r13, r1, r7)
            di3.d r1 = di3.C86312j.m106911c(r8)
            dp1.y0 r1 = (dp1.C58417y0) r1
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16002e
            long r2 = r2.getItemId()
            r4 = 2
            r1.mo83275AJ(r2, r4)
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter r2 = r0.f16001d
            com.tencent.mm.ui.MMActivity r2 = r2.f15975d
            rs1.s8 r1 = r1.mo12873f(r2)
            if (r1 == 0) goto L_0x01dd
            r2 = 0
            df1.a r1 = ht1.C60172g4.C60173a.m70190b(r1, r11, r10, r2)
            if (r1 == 0) goto L_0x01dd
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16002e
            long r2 = r2.getItemId()
            df1.a$a r4 = new df1.a$a
            r5 = 16
            r4.<init>(r5, r2)
            r1.mo8766a(r4)
        L_0x01dd:
            bl3.r r1 = bl3.C39818r.f106831a
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter r2 = r0.f16001d
            com.tencent.mm.ui.MMActivity r2 = r2.f15975d
            bl3.r$a r1 = r1.mo62444c(r2)
            java.lang.Class<rs1.s8> r2 = rs1.C13442s8.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            rs1.s8 r1 = (rs1.C13442s8) r1
            te3.hj1 r1 = r1.mo12861q3()
            dp1.f2 r2 = dp1.C7435f2.f25626a
            int r3 = r0.f16003f
            if (r3 != r10) goto L_0x01fc
            java.lang.String r3 = "forward"
            goto L_0x01ff
        L_0x01fc:
            java.lang.String r3 = "tridot"
        L_0x01ff:
            c30.g r4 = new c30.g
            r4.<init>()
            r2.mo8580d(r1, r3, r10, r4)
            dp1.e1 r1 = dp1.C7433e1.f25622a
            r1.mo8572a(r7)
        L_0x020c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.presenter.contract.C3394x32abef4a.onCreateMMMenu(nj3.e0):void");
    }
}
