package fh1;

import cj1.C54847z3;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import pe3.C47465a;
import te3.C51512u91;
import xh1.C15685d;

/* renamed from: fh1.b0 */
public final class C8031b0 extends C54847z3.C54849b<C51512u91> {
    public C8031b0(Class<C51512u91> cls) {
        super(cls);
    }

    /* renamed from: a */
    public void mo9116a(C47465a aVar) {
        C51512u91 u912 = (C51512u91) aVar;
        C87412m.m108594g(u912, "result");
        if ((u912.f142685d & 1) == 1) {
            Log.m105924i("FinderGestureEffectVisitorDataController", "#polling success MMFinderLiveesourceLoadFlag_Gesture");
            C15685d.f42379a.mo14431b(u912.f142686e, false);
        }
    }
}
