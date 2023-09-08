package com.tencent.p014mm.pluginsdk.model;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.storage.C19601c0;
import gy3.C87412m;
import wx3.C15601d;
import z04.C112551y;

/* renamed from: com.tencent.mm.pluginsdk.model.i */
public final class C19448i implements MTimerHandler.CallBack {

    /* renamed from: d */
    public static final C19448i f54938d = new C19448i();

    public final boolean onTimerExpired() {
        String i = C19428d.m20723i();
        if (!(i == null || C112551y.m153811k(i))) {
            C19601c0 c0Var = C19601c0.f55446a;
            if (C19601c0.f55457l) {
                C19428d dVar = C19428d.f54856a;
                C87412m.m108594g(i, "userName");
                C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C19443f(i, (C15601d<? super C19443f>) null), 2, (Object) null);
                return true;
            }
        }
        Log.m105918d("MicroMsg.BizFinderLiveLogic", "startCheckMaiCellRedDot not show finderReadDot");
        C19428d.f54856a.mo25166T();
        return true;
    }
}
