package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyViewCallback$initMessageClickListener$2", "Ljq3/l$c;", "Ljq3/o;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$initMessageClickListener$2 */
public final class C56199x4f0d29df implements C60898l.C9503c<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderNotifyContractNew.NotifyViewCallback f160565d;

    public C56199x4f0d29df(FinderNotifyContractNew.NotifyViewCallback notifyViewCallback) {
        this.f160565d = notifyViewCallback;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0027, code lost:
        r3 = r15.f154465d;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo759n(androidx.recyclerview.widget.RecyclerView.C16613e r12, android.view.View r13, int r14, androidx.recyclerview.widget.RecyclerView.C16631z r15) {
        /*
            r11 = this;
            jq3.o r15 = (jq3.C60905o) r15
            java.lang.String r0 = "adapter"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r15, r0)
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback r15 = r11.f160565d
            cm1.a r15 = com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.m64288y(r15, r12, r14)
            java.lang.String r0 = com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f160541s
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onLongClick id:"
            r1.append(r2)
            r2 = 0
            if (r15 == 0) goto L_0x0032
            xh.va r3 = r15.f154465d
            if (r3 == 0) goto L_0x0032
            long r3 = r3.field_id
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0033
        L_0x0032:
            r3 = r2
        L_0x0033:
            r1.append(r3)
            java.lang.String r3 = " commentId:"
            r1.append(r3)
            if (r15 == 0) goto L_0x0048
            xh.va r3 = r15.f154465d
            if (r3 == 0) goto L_0x0048
            long r3 = r3.field_commentId
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0049
        L_0x0048:
            r3 = r2
        L_0x0049:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            if (r15 == 0) goto L_0x008c
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback r1 = r11.f160565d
            xh.va r15 = r15.f154465d
            int r3 = r1.f160544f
            jq3.l r12 = (jq3.C60898l) r12
            int r12 = r12.mo85796c6()
            int r14 = r14 - r12
            uo3.a r12 = r1.f160552q
            java.lang.String r4 = "popupMenu"
            if (r12 == 0) goto L_0x0088
            r12.mo108266a()
            uo3.a r5 = r1.f160552q
            if (r5 == 0) goto L_0x0084
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$1 r7 = new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$1
            r7.<init>(r3, r1, r15, r13)
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$2 r8 = new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$2
            r8.<init>(r15, r1, r14)
            int r9 = com.tencent.p014mm.view.TouchableLayout.f24959d
            int r10 = com.tencent.p014mm.view.TouchableLayout.f24960e
            r6 = r13
            r5.mo108273h(r6, r7, r8, r9, r10)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x008c
        L_0x0084:
            gy3.C87412m.m108603p(r4)
            throw r2
        L_0x0088:
            gy3.C87412m.m108603p(r4)
            throw r2
        L_0x008c:
            if (r2 != 0) goto L_0x0093
            java.lang.String r12 = "onItemLongClick: null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
        L_0x0093:
            r12 = 1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.presenter.contract.C56199x4f0d29df.mo759n(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):boolean");
    }
}
