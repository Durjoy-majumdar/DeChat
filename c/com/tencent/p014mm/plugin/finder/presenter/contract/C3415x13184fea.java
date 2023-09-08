package com.tencent.p014mm.plugin.finder.presenter.contract;

import java.util.HashSet;
import kotlin.Metadata;
import zp3.C23555k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract$PurchaseListViewCallback$initView$1$2", "Lzp3/k$c;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$initView$1$2 */
public final class C3415x13184fea extends C23555k.C23558c {

    /* renamed from: a */
    public final HashSet<Long> f16079a = new HashSet<>();

    /* renamed from: b */
    public final HashSet<Long> f16080b = new HashSet<>();

    /* renamed from: d */
    public boolean mo777d() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: cm1.t0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo778e(android.view.View r14, java.util.List<? extends androidx.recyclerview.widget.RecyclerView.C16631z> r15) {
        /*
            r13 = this;
            java.lang.String r0 = "parent"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r14 = "exposedHolders"
            gy3.C87412m.m108594g(r15, r14)
            java.util.Iterator r14 = r15.iterator()
            r15 = 0
        L_0x000f:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.Object r0 = r14.next()
            int r10 = r15 + 1
            r11 = 0
            if (r15 < 0) goto L_0x0100
            androidx.recyclerview.widget.RecyclerView$z r0 = (androidx.recyclerview.widget.RecyclerView.C16631z) r0
            boolean r15 = r0 instanceof jq3.C60905o
            if (r15 == 0) goto L_0x0027
            jq3.o r0 = (jq3.C60905o) r0
            goto L_0x0028
        L_0x0027:
            r0 = r11
        L_0x0028:
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r15 = r0.f173503E
            boolean r1 = r15 instanceof cm1.C0782u0
            if (r1 == 0) goto L_0x0033
            cm1.u0 r15 = (cm1.C0782u0) r15
            goto L_0x0034
        L_0x0033:
            r15 = r11
        L_0x0034:
            java.lang.String r12 = "holder.context"
            if (r15 == 0) goto L_0x00ba
            java.util.HashSet<java.lang.Long> r1 = r13.f16079a
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r15.f1833d
            long r2 = r2.f164794id
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x004a
            goto L_0x00fd
        L_0x004a:
            java.util.HashSet<java.lang.Long> r1 = r13.f16079a
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r15.f1833d
            long r2 = r2.f164794id
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.add(r2)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r15.f1833d
            long r2 = r2.f164794id
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            java.lang.String r3 = "object_id"
            r1.put(r3, r2)
            java.lang.String r2 = "page_type"
            java.lang.String r3 = "pay"
            r1.put(r2, r3)
            boolean r2 = r15.mo726b()
            java.lang.String r3 = "object_type"
            if (r2 == 0) goto L_0x007d
            r2 = 1
            r1.put(r3, r2)
            goto L_0x0081
        L_0x007d:
            r2 = 2
            r1.put(r3, r2)
        L_0x0081:
            java.lang.Class<ht1.j5> r2 = ht1.C8777j5.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.j5 r2 = (ht1.C8777j5) r2
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "this.toString()"
            gy3.C87412m.m108593f(r1, r3)
            java.lang.String r3 = "watch_live_expose"
            r2.hg0(r3, r1)
            com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract r1 = com.tencent.p014mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.f16063a
            android.content.Context r2 = r0.f173499A
            gy3.C87412m.m108593f(r2, r12)
            r4 = 0
            r6 = 0
            com.tencent.mm.protocal.protobuf.FinderObject r15 = r15.f1833d
            te3.c21 r15 = r15.liveInfo
            if (r15 == 0) goto L_0x00b0
            long r7 = r15.f182392d
            java.lang.Long r15 = java.lang.Long.valueOf(r7)
            r7 = r15
            goto L_0x00b1
        L_0x00b0:
            r7 = r11
        L_0x00b1:
            r8 = 16
            r9 = 0
            java.lang.String r3 = "live"
            r5 = r10
            com.tencent.p014mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.m3516a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x00ba:
            java.lang.Object r15 = r0.f173503E
            boolean r1 = r15 instanceof cm1.C0776t0
            if (r1 == 0) goto L_0x00c3
            r11 = r15
            cm1.t0 r11 = (cm1.C0776t0) r11
        L_0x00c3:
            if (r11 == 0) goto L_0x00fd
            java.util.HashSet<java.lang.Long> r15 = r13.f16080b
            te3.vj0 r1 = r11.f1819d
            long r1 = r1.f143507r
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r15 = r15.contains(r1)
            if (r15 == 0) goto L_0x00d6
            goto L_0x00fd
        L_0x00d6:
            java.util.HashSet<java.lang.Long> r15 = r13.f16080b
            te3.vj0 r1 = r11.f1819d
            long r1 = r1.f143507r
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r15.add(r1)
            com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract r1 = com.tencent.p014mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.f16063a
            android.content.Context r2 = r0.f173499A
            gy3.C87412m.m108593f(r2, r12)
            r4 = 0
            te3.vj0 r15 = r11.f1819d
            long r5 = r15.f143507r
            java.lang.Long r6 = java.lang.Long.valueOf(r5)
            r7 = 0
            r8 = 32
            r9 = 0
            java.lang.String r3 = "course"
            r5 = r10
            com.tencent.p014mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.m3516a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x00fd:
            r15 = r10
            goto L_0x000f
        L_0x0100:
            sx3.C64197v.m75542k()
            throw r11
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.presenter.contract.C3415x13184fea.mo778e(android.view.View, java.util.List):void");
    }
}
