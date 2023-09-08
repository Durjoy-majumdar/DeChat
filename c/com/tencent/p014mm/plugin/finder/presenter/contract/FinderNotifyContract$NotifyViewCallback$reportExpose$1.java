package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import java.util.HashSet;
import kotlin.Metadata;
import zp3.C23555k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract$NotifyViewCallback$reportExpose$1", "Lzp3/k$c;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$reportExpose$1 */
public final class FinderNotifyContract$NotifyViewCallback$reportExpose$1 extends C23555k.C23558c {

    /* renamed from: a */
    public final HashSet<Long> f160516a = new HashSet<>();

    /* renamed from: b */
    public final /* synthetic */ FinderNotifyContract.NotifyViewCallback f160517b;

    public FinderNotifyContract$NotifyViewCallback$reportExpose$1(FinderNotifyContract.NotifyViewCallback notifyViewCallback) {
        this.f160517b = notifyViewCallback;
    }

    /* renamed from: d */
    public boolean mo777d() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: cm1.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo778e(android.view.View r22, java.util.List<? extends androidx.recyclerview.widget.RecyclerView.C16631z> r23) {
        /*
            r21 = this;
            r0 = r21
            java.lang.String r1 = "parent"
            r2 = r22
            gy3.C87412m.m108594g(r2, r1)
            java.lang.String r1 = "exposedHolders"
            r2 = r23
            gy3.C87412m.m108594g(r2, r1)
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback r1 = r0.f160517b
            java.util.Iterator r2 = r23.iterator()
        L_0x0016:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00c9
            java.lang.Object r3 = r2.next()
            androidx.recyclerview.widget.RecyclerView$z r3 = (androidx.recyclerview.widget.RecyclerView.C16631z) r3
            boolean r4 = r3 instanceof jq3.C60905o
            r5 = 0
            if (r4 == 0) goto L_0x002a
            jq3.o r3 = (jq3.C60905o) r3
            goto L_0x002b
        L_0x002a:
            r3 = r5
        L_0x002b:
            if (r3 == 0) goto L_0x0016
            java.lang.Object r4 = r3.f173503E
            boolean r6 = r4 instanceof cm1.C55011a
            if (r6 == 0) goto L_0x0036
            r5 = r4
            cm1.a r5 = (cm1.C55011a) r5
        L_0x0036:
            if (r5 == 0) goto L_0x0016
            java.util.HashSet<java.lang.Long> r4 = r0.f160516a
            xh.va r6 = r5.f154465d
            long r6 = r6.field_id
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L_0x0049
            goto L_0x0016
        L_0x0049:
            java.lang.String r4 = r1.f160453e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "onChildExposeChanged:"
            r6.append(r7)
            int r3 = r3.mo17363j()
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r3 = r1.f160455g
            int r3 = r3.f160440d
            r4 = 1
            if (r3 != r4) goto L_0x006d
            r3 = 14
            goto L_0x006f
        L_0x006d:
            r3 = 15
        L_0x006f:
            er1.m1 r6 = er1.C58748m1.f168218a
            int r14 = r6.mo83746b(r5)
            java.util.HashSet<java.lang.Long> r4 = r0.f160516a
            xh.va r7 = r5.f154465d
            long r7 = r7.field_id
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r4.add(r7)
            java.lang.Class<dp1.y0> r4 = dp1.C58417y0.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            java.lang.String r7 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r4, r7)
            dp1.y0 r4 = (dp1.C58417y0) r4
            com.tencent.mm.ui.MMActivity r13 = r1.f160456h
            long r11 = (long) r3
            r15 = 2
            r3 = 0
            r17 = 2
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r7 = r1.f160455g
            int r8 = r7.f160440d
            r9 = 0
            xh.va r5 = r5.f154465d
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.field_contact
            if (r5 == 0) goto L_0x00a6
            java.lang.String r5 = r5.username
            if (r5 != 0) goto L_0x00a8
        L_0x00a6:
            java.lang.String r5 = ""
        L_0x00a8:
            r10 = r5
            r5 = 4
            r18 = 0
            r7 = r13
            r19 = r11
            r11 = r5
            r12 = r18
            java.lang.String r5 = er1.C58748m1.m68323d(r6, r7, r8, r9, r10, r11, r12)
            r6 = 8
            r7 = r4
            r8 = r13
            r9 = r19
            r11 = r15
            r13 = r3
            r15 = r17
            r16 = r5
            r17 = r6
            dp1.C58417y0.fy0(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18)
            goto L_0x0016
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$reportExpose$1.mo778e(android.view.View, java.util.List):void");
    }
}
