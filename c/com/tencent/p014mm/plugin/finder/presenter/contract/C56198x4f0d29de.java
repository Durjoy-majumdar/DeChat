package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyViewCallback$initMessageClickListener$1", "Ljq3/l$b;", "Ljq3/o;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$initMessageClickListener$1 */
public final class C56198x4f0d29de implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderNotifyContractNew.NotifyViewCallback f160564d;

    public C56198x4f0d29de(FinderNotifyContractNew.NotifyViewCallback notifyViewCallback) {
        this.f160564d = notifyViewCallback;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r21, android.view.View r22, int r23, androidx.recyclerview.widget.RecyclerView.C16631z r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            r3 = r24
            jq3.o r3 = (jq3.C60905o) r3
            java.lang.Class<dp1.y0> r4 = dp1.C58417y0.class
            java.lang.String r5 = "adapter"
            gy3.C87412m.m108594g(r1, r5)
            java.lang.String r5 = "view"
            r6 = r22
            gy3.C87412m.m108594g(r6, r5)
            java.lang.String r5 = "holder"
            gy3.C87412m.m108594g(r3, r5)
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback r3 = r0.f160564d
            cm1.a r1 = com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.m64288y(r3, r1, r2)
            r3 = 0
            if (r1 == 0) goto L_0x022a
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback r5 = r0.f160564d
            java.lang.String r6 = com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f160541s
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "onItemClick id:"
            r7.append(r8)
            xh.va r8 = r1.f154465d
            long r8 = r8.field_id
            r7.append(r8)
            java.lang.String r8 = " commentId:"
            r7.append(r8)
            xh.va r8 = r1.f154465d
            long r8 = r8.field_commentId
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            bl3.r r6 = bl3.C39818r.f106831a
            androidx.fragment.app.Fragment r5 = r5.f160542d
            bl3.r$a r5 = r6.mo62445d(r5)
            java.lang.Class<rs1.r6> r6 = rs1.C63621r6.class
            androidx.lifecycle.i0 r5 = r5.mo75002a(r6)
            rs1.r6 r5 = (rs1.C63621r6) r5
            xh.va r6 = r1.f154465d
            r5.getClass()
            java.lang.Class<er1.b> r7 = er1.C58684b.class
            java.lang.String r8 = "mention"
            gy3.C87412m.m108594g(r6, r8)
            int r8 = r5.f180385d
            r9 = 1
            if (r8 != r9) goto L_0x0076
            int r8 = r5.f180386e
            if (r8 != r9) goto L_0x0076
            if (r2 == 0) goto L_0x0228
        L_0x0076:
            int r2 = r6.field_type
            if (r2 != r9) goto L_0x00a6
            di3.d r2 = di3.C86312j.m106911c(r4)
            r10 = r2
            dp1.y0 r10 = (dp1.C58417y0) r10
            int r11 = r6.field_type
            int r2 = r5.f180387f
            int r12 = r2 + 1
            boolean r13 = r6.mo90403l2()
            int r14 = r6.mo90404m2()
            xh.va r1 = r1.f154465d
            long r1 = r1.field_objectId
            r15 = r1
            r10.Vx0(r11, r12, r13, r14, r15)
            di3.d r1 = di3.C86312j.m106911c(r7)
            er1.b r1 = (er1.C58684b) r1
            androidx.appcompat.app.AppCompatActivity r2 = r5.getActivity()
            r1.Gx0(r2, r3)
            goto L_0x0228
        L_0x00a6:
            r8 = 10
            r10 = 11
            if (r2 == r8) goto L_0x01e4
            if (r2 != r10) goto L_0x00b0
            goto L_0x01e4
        L_0x00b0:
            r7 = 2
            if (r2 != r7) goto L_0x0123
            int r8 = r6.field_extFlag
            r8 = r8 & 16
            if (r8 <= 0) goto L_0x0123
            di3.d r2 = di3.C86312j.m106911c(r4)
            r7 = r2
            dp1.y0 r7 = (dp1.C58417y0) r7
            int r8 = r6.field_type
            boolean r9 = r6.mo90403l2()
            int r10 = r6.mo90404m2()
            xh.va r1 = r1.f154465d
            long r11 = r1.field_objectId
            r7.Wx0(r8, r9, r10, r11)
            je1.x1 r1 = r5.f180388g
            if (r1 == 0) goto L_0x00d8
            r1.mo85581g()
        L_0x00d8:
            je1.d2 r1 = r5.f180389h
            if (r1 == 0) goto L_0x00df
            r1.mo85581g()
        L_0x00df:
            je1.d2 r1 = new je1.d2
            long r8 = r6.field_refVideoObjectId
            java.lang.String r11 = r6.field_refVideoObjectNonceId
            java.lang.String r2 = "mention.field_refVideoObjectNonceId"
            gy3.C87412m.m108593f(r11, r2)
            r12 = 0
            rs1.s8$a r2 = rs1.C13442s8.f38060Q0
            android.app.Activity r7 = r5.getContext()
            rs1.s8 r2 = r2.mo12873f(r7)
            if (r2 == 0) goto L_0x00fb
            te3.hj1 r3 = r2.mo12861q3()
        L_0x00fb:
            r13 = r3
            r14 = 8
            r15 = 0
            java.lang.String r10 = ""
            r7 = r1
            r7.<init>(r8, r10, r11, r12, r13, r14, r15)
            r5.f180389h = r1
            nr3.e r1 = r1.mo9225i()
            androidx.appcompat.app.AppCompatActivity r2 = r5.getActivity()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r2, r3)
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
            r1.mo11397F(r2)
            rs1.q6 r2 = new rs1.q6
            r2.<init>(r6, r5)
            r1.mo123062e(r2)
            goto L_0x0228
        L_0x0123:
            r8 = 4
            if (r2 == r8) goto L_0x014f
            di3.d r2 = di3.C86312j.m106911c(r4)
            r10 = r2
            dp1.y0 r10 = (dp1.C58417y0) r10
            int r11 = r6.field_type
            int r2 = r5.f180387f
            int r12 = r2 + 1
            boolean r13 = r6.mo90403l2()
            int r14 = r6.mo90404m2()
            xh.va r1 = r1.f154465d
            long r1 = r1.field_objectId
            r15 = r1
            r10.Vx0(r11, r12, r13, r14, r15)
            je1.x1 r1 = r5.f180388g
            if (r1 == 0) goto L_0x014a
            r1.mo85581g()
        L_0x014a:
            r5.mo88463e3(r6)
            goto L_0x0228
        L_0x014f:
            di3.d r2 = di3.C86312j.m106911c(r4)
            r10 = r2
            dp1.y0 r10 = (dp1.C58417y0) r10
            int r11 = r6.field_type
            int r2 = r5.f180387f
            int r12 = r2 + 1
            boolean r13 = r6.mo90403l2()
            int r14 = r6.mo90404m2()
            xh.va r1 = r1.f154465d
            long r1 = r1.field_objectId
            r15 = r1
            r10.Vx0(r11, r12, r13, r14, r15)
            te3.ne1 r1 = r6.field_notify
            if (r1 == 0) goto L_0x0228
            int r2 = r1.f184468f
            if (r2 == r9) goto L_0x01c6
            if (r2 == r7) goto L_0x01ad
            r3 = 3
            if (r2 == r3) goto L_0x019d
            if (r2 == r8) goto L_0x019d
            r3 = 6
            if (r2 == r3) goto L_0x0180
            goto L_0x0228
        L_0x0180:
            int r2 = r5.f180385d
            if (r2 != r7) goto L_0x0228
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r1.f184473n
            if (r1 == 0) goto L_0x0228
            pf1.d0 r6 = pf1.C62262d0.f176978a
            android.app.Activity r7 = r5.getContext()
            pf1.q r8 = new pf1.q
            r8.<init>(r1)
            r9 = 0
            r10 = 0
            r11 = 12
            r12 = 0
            pf1.C62262d0.m73168c(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0228
        L_0x019d:
            int r1 = r5.f180385d
            if (r1 != r7) goto L_0x0228
            je1.x1 r1 = r5.f180388g
            if (r1 == 0) goto L_0x01a8
            r1.mo85581g()
        L_0x01a8:
            r5.mo88463e3(r6)
            goto L_0x0228
        L_0x01ad:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r1.f184469g
            java.lang.String r6 = "rawUrl"
            r2.putExtra(r6, r1)
            android.app.Activity r1 = r5.getContext()
            java.lang.String r5 = "webview"
            java.lang.String r6 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r1, r5, r6, r2, r3)
            goto L_0x0228
        L_0x01c6:
            java.lang.Class<kr0.x0> r2 = kr0.C76630x0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            r6 = r2
            kr0.x0 r6 = (kr0.C76630x0) r6
            android.app.Activity r7 = r5.getContext()
            java.lang.String r8 = r1.f184470h
            r10 = 0
            r11 = 0
            java.lang.String r12 = r1.f184469g
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r13 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
            r13.<init>()
            java.lang.String r9 = ""
            r6.Ko0(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0228
        L_0x01e4:
            if (r2 != r10) goto L_0x0228
            java.lang.String r1 = r6.field_username
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0228
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            er1.w3 r2 = er1.C58784w3.f168295a
            int r3 = r5.f180385d
            int r8 = r5.f180387f
            r2.mo83873H1(r1, r3, r8)
            java.lang.String r2 = r6.field_username
            java.lang.String r3 = "finder_username"
            r1.putExtra(r3, r2)
            rs1.s8$a r8 = rs1.C13442s8.f38060Q0
            android.app.Activity r9 = r5.getContext()
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 9
            r16 = 0
            r17 = 0
            r18 = 192(0xc0, float:2.69E-43)
            r19 = 0
            r10 = r1
            rs1.C13442s8.C13443a.m12791e(r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19)
            di3.d r2 = di3.C86312j.m106911c(r7)
            er1.b r2 = (er1.C58684b) r2
            android.app.Activity r3 = r5.getContext()
            r2.mo13272V1(r3, r1)
        L_0x0228:
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x022a:
            if (r3 != 0) goto L_0x0233
            java.lang.String r1 = com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f160541s
            java.lang.String r2 = "onItemClick: null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
        L_0x0233:
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback r1 = r0.f160564d
            android.content.Context r2 = r1.f160547i
            if (r2 == 0) goto L_0x0258
            di3.d r2 = di3.C86312j.m106911c(r4)
            java.lang.String r3 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            r4 = r2
            dp1.y0 r4 = (dp1.C58417y0) r4
            android.content.Context r5 = r1.f160547i
            r6 = 14
            r8 = 1
            r10 = 0
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter r1 = r1.f160543e
            int r11 = r1.f160526e
            r12 = 2
            r13 = 0
            r14 = 72
            r15 = 0
            dp1.C58417y0.fy0(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
        L_0x0258:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.presenter.contract.C56198x4f0d29de.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
