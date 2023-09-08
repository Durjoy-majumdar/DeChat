package ok1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kotlin.Result;
import u60.C65220d;
import u60.C65231j;
import u60.C65234n;
import uq1.C65458r;
import wx3.C15601d;

/* renamed from: ok1.t */
public final class C11470t implements C65231j<C65220d> {

    /* renamed from: a */
    public final /* synthetic */ C15601d<String> f33727a;

    public C11470t(C15601d<? super String> dVar) {
        this.f33727a = dVar;
    }

    /* renamed from: a */
    public void mo539a(C65220d dVar, C65234n nVar) {
        C87412m.m108594g(dVar, "task");
        C87412m.m108594g(nVar, "status");
        Log.m105924i("FinderLiveUtil", "[dealWithBgPath] upload end");
        C65458r rVar = (C65458r) dVar;
        if (nVar != C65234n.OK || Util.isNullOrNil(rVar.f188352h)) {
            this.f33727a.resumeWith(Result.m168114constructorimpl((Object) null));
            return;
        }
        C15601d<String> dVar2 = this.f33727a;
        Result.Companion companion = Result.Companion;
        dVar2.resumeWith(Result.m168114constructorimpl(rVar.f188352h));
    }
}
