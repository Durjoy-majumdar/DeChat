package tj2;

import a14.C0000n0;
import fy3.C32227p;
import pj2.C62324e;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.history.RingtoneHistoryInfo$doDataRefresh$1$1$1$1", mo125469f = "RingtoneHistoryInfo.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: tj2.c */
public final class C64946c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C64948e f187017d;

    /* renamed from: e */
    public final /* synthetic */ C62324e f187018e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64946c(C64948e eVar, C62324e eVar2, C15601d<? super C64946c> dVar) {
        super(2, dVar);
        this.f187017d = eVar;
        this.f187018e = eVar2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64946c(this.f187017d, this.f187018e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64946c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r2 == true) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r10 = r10.getData();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.ResultKt.throwOnFailure(r10)
            tj2.e r10 = r9.f187017d
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r10 = r10.mo89112c3()
            r0 = 1
            r10.mo26580f(r0)
            tj2.e r10 = r9.f187017d
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r10 = r10.f187023g
            r1 = 0
            if (r10 == 0) goto L_0x001f
            java.util.List r10 = r10.getData()
            if (r10 == 0) goto L_0x001f
            int r10 = r10.size()
            goto L_0x0020
        L_0x001f:
            r10 = 0
        L_0x0020:
            tj2.e r2 = r9.f187017d
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r2 = r2.f187023g
            if (r2 == 0) goto L_0x005b
            java.util.List r2 = r2.getData()
            if (r2 == 0) goto L_0x005b
            pj2.e r3 = r9.f187018e
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x0036
        L_0x0034:
            r2 = 1
            goto L_0x0058
        L_0x0036:
            java.util.Iterator r2 = r2.iterator()
        L_0x003a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0034
            java.lang.Object r4 = r2.next()
            pj2.d r4 = (pj2.C62323d) r4
            long r5 = r3.getItemId()
            long r7 = r4.getItemId()
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0054
            r4 = 1
            goto L_0x0055
        L_0x0054:
            r4 = 0
        L_0x0055:
            if (r4 == 0) goto L_0x003a
            r2 = 0
        L_0x0058:
            if (r2 != r0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r0 == 0) goto L_0x006f
            tj2.e r0 = r9.f187017d
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r0 = r0.f187023g
            if (r0 == 0) goto L_0x006f
            java.util.List r0 = r0.getData()
            if (r0 == 0) goto L_0x006f
            pj2.e r1 = r9.f187018e
            r0.add(r1)
        L_0x006f:
            tj2.e r0 = r9.f187017d
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r0 = r0.f187023g
            if (r0 == 0) goto L_0x0078
            r0.notifyItemInserted(r10)
        L_0x0078:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tj2.C64946c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
