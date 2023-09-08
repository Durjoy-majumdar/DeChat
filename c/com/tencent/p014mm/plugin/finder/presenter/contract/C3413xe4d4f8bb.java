package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$2$1", "Ljq3/l$b;", "Ljq3/o;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$2$1 */
public final class C3413xe4d4f8bb implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderLivePurchaseListContract.PurchaseListPresenter f16076d;

    public C3413xe4d4f8bb(FinderLivePurchaseListContract.PurchaseListPresenter purchaseListPresenter) {
        this.f16076d = purchaseListPresenter;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v7, types: [java.lang.Long] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r26, android.view.View r27, int r28, androidx.recyclerview.widget.RecyclerView.C16631z r29) {
        /*
            r25 = this;
            r0 = r25
            r1 = r28
            r2 = r29
            jq3.o r2 = (jq3.C60905o) r2
            java.lang.String r3 = "adapter"
            r4 = r26
            gy3.C87412m.m108594g(r4, r3)
            java.lang.String r3 = "view"
            r4 = r27
            gy3.C87412m.m108594g(r4, r3)
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r2, r3)
            com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter r3 = r0.f16076d
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r3 = r3.f16064d
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r3 = r3.getDataListJustForAdapter()
            r4 = 0
            r5 = 1
            if (r1 < 0) goto L_0x0030
            int r6 = r3.size()
            if (r1 >= r6) goto L_0x0030
            r6 = 1
            goto L_0x0031
        L_0x0030:
            r6 = 0
        L_0x0031:
            if (r6 == 0) goto L_0x01b1
            java.lang.Object r6 = r3.get(r1)
            cm1.i2 r6 = (cm1.C0740i2) r6
            boolean r7 = r6 instanceof cm1.C0776t0
            java.lang.String r8 = "holder.context"
            if (r7 == 0) goto L_0x008c
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderLiveEcSourceData"
            gy3.C87412m.m108592e(r3, r4)
            cm1.t0 r3 = (cm1.C0776t0) r3
            te3.vj0 r4 = r3.f1819d
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r4.f143499g
            if (r4 == 0) goto L_0x006a
            int r6 = r4.jumpinfo_type
            if (r6 != 0) goto L_0x0056
            r4.jumpinfo_type = r5
        L_0x0056:
            pf1.d0 r9 = pf1.C62262d0.f176978a
            android.content.Context r10 = r2.f173499A
            gy3.C87412m.m108593f(r10, r8)
            pf1.q r11 = new pf1.q
            r11.<init>(r4)
            r12 = 0
            r13 = 0
            r14 = 12
            r15 = 0
            pf1.C62262d0.m73168c(r9, r10, r11, r12, r13, r14, r15)
        L_0x006a:
            com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract r16 = com.tencent.p014mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.f16063a
            android.content.Context r2 = r2.f173499A
            gy3.C87412m.m108593f(r2, r8)
            r19 = 1
            int r20 = r1 + 1
            te3.vj0 r1 = r3.f1819d
            long r3 = r1.f143507r
            java.lang.Long r21 = java.lang.Long.valueOf(r3)
            r22 = 0
            r23 = 32
            r24 = 0
            java.lang.String r18 = "course"
            r17 = r2
            com.tencent.p014mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.m3516a(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x01b1
        L_0x008c:
            boolean r6 = r6 instanceof cm1.C0782u0
            if (r6 == 0) goto L_0x01b1
            java.lang.Object r6 = r3.get(r1)
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderLiveReplayFeed"
            gy3.C87412m.m108592e(r6, r7)
            cm1.u0 r6 = (cm1.C0782u0) r6
            boolean r7 = r6.mo727d()
            r9 = 0
            if (r7 == 0) goto L_0x0188
            com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract r10 = com.tencent.p014mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.f16063a
            android.content.Context r11 = r2.f173499A
            gy3.C87412m.m108593f(r11, r8)
            r13 = 1
            int r14 = r1 + 1
            r15 = 0
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r6.f1833d
            te3.c21 r1 = r1.liveInfo
            if (r1 == 0) goto L_0x00b9
            long r1 = r1.f182392d
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
        L_0x00b9:
            r16 = r9
            r17 = 16
            r18 = 0
            java.lang.String r12 = "live"
            com.tencent.p014mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.m3516a(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r6.f1833d
            long r7 = r2.f164794id
            java.lang.String r2 = o40.C61926c.m72691p(r7)
            java.lang.String r7 = "object_id"
            r1.put(r7, r2)
            java.lang.String r2 = "pay"
            java.lang.String r7 = "page_type"
            r1.put(r7, r2)
            boolean r7 = r6.mo726b()
            if (r7 == 0) goto L_0x00e5
            r7 = 1
            goto L_0x00e6
        L_0x00e5:
            r7 = 2
        L_0x00e6:
            java.lang.String r8 = "object_type"
            r1.put(r8, r7)
            java.lang.Class<ht1.j5> r7 = ht1.C8777j5.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ht1.j5 r7 = (ht1.C8777j5) r7
            java.lang.String r1 = r1.toString()
            java.lang.String r8 = "this.toString()"
            gy3.C87412m.m108593f(r1, r8)
            java.lang.String r8 = "watch_live_record"
            r7.hg0(r8, r1)
            java.lang.Class<cm1.u0> r1 = cm1.C0782u0.class
            java.util.List r1 = sx3.C13798c0.m13102z(r3, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0114:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x013c
            java.lang.Object r7 = r1.next()
            r8 = r7
            cm1.u0 r8 = (cm1.C0782u0) r8
            boolean r9 = r8.mo727d()
            if (r9 == 0) goto L_0x0135
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f1833d
            long r8 = r8.f164794id
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r6.f1833d
            long r10 = r10.f164794id
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0135
            r8 = 1
            goto L_0x0136
        L_0x0135:
            r8 = 0
        L_0x0136:
            if (r8 == 0) goto L_0x0114
            r3.add(r7)
            goto L_0x0114
        L_0x013c:
            int r1 = r3.indexOf(r6)
            if (r1 < 0) goto L_0x0143
            goto L_0x0144
        L_0x0143:
            r1 = 0
        L_0x0144:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter r7 = r0.f16076d
            cm1.u0$a r8 = cm1.C0782u0.f1832e
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r9 = r7.f16064d
            pe3.b r9 = r9.getLastBuffer()
            int r10 = r7.f16067g
            te3.fj1 r1 = r8.mo728a(r3, r9, r10, r1)
            byte[] r1 = r1.toByteArray()
            java.lang.String r3 = "KEY_PARAMS_KEY_VALUE"
            r6.putExtra(r3, r1)
            java.lang.String r1 = "KEY_PARAMS_SOURCE_TYPE"
            r6.putExtra(r1, r5)
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.t1 r1 = (ht1.C60200t1) r1
            ht1.z4 r1 = r1.mo76861l7()
            r1.mo83773T5(r6, r2, r4)
            java.lang.Class<tf0.q1> r1 = tf0.C13887q1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            tf0.q1 r1 = (tf0.C13887q1) r1
            com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback r2 = r7.mo3755n()
            com.tencent.mm.ui.MMActivity r2 = r2.f16068a
            r1.mo13349lV(r2, r6, r5)
            goto L_0x01b1
        L_0x0188:
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r6.f1833d
            te3.c21 r1 = r1.liveInfo
            if (r1 == 0) goto L_0x0190
            java.lang.String r9 = r1.f182373R0
        L_0x0190:
            if (r9 == 0) goto L_0x0198
            int r1 = r9.length()
            if (r1 != 0) goto L_0x0199
        L_0x0198:
            r4 = 1
        L_0x0199:
            if (r4 == 0) goto L_0x01ac
            android.content.Context r1 = r2.f173499A
            android.content.res.Resources r2 = r1.getResources()
            r3 = 2131828644(0x7f111fa4, float:1.9290235E38)
            java.lang.String r2 = r2.getString(r3)
            nj3.C76912y0.m92767f(r1, r2)
            goto L_0x01b1
        L_0x01ac:
            android.content.Context r1 = r2.f173499A
            nj3.C76912y0.m92767f(r1, r9)
        L_0x01b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.presenter.contract.C3413xe4d4f8bb.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
