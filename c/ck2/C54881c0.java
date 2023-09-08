package ck2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import d03.C58010a;
import gy3.C87412m;
import rj2.C63451c;
import rj2.C63460e;
import wj2.C66132f;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: ck2.c0 */
public final class C54881c0 {

    /* renamed from: a */
    public final C0000n0 f153829a;

    /* renamed from: b */
    public C63451c f153830b;

    public C54881c0() {
        C0000n0 a = C53930o0.m60554a(C53872d1.f151119c);
        this.f153829a = a;
        C63451c cVar = new C63451c(a);
        this.f153830b = cVar;
        C53973z1 d = C53895h.m60466d(cVar.f179975d, (C66212f) null, (C53934p0) null, new C63460e(cVar, (C15601d<? super C63460e>) null), 3, (Object) null);
        cVar.f179984p = d;
        ((C53884f2) d).start();
    }

    /* renamed from: a */
    public final void mo75822a(C66132f fVar, long j, boolean z) {
        C87412m.m108594g(fVar, "item");
        Log.m105924i("MicroMsg.RingtonePlayUIC", "on play ringtone " + fVar.mo90183n() + ",and id is " + j + " with action is play " + z);
        C63451c cVar = this.f153830b;
        C58010a aVar = fVar.f190078a;
        cVar.mo88318e3(fVar, j, z, true, aVar != null ? aVar.f165940l : false);
    }
}
