package cm1;

import a14.C53916l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kotlin.Result;
import u60.C65220d;
import u60.C65231j;
import u60.C65234n;
import uq1.C65453p;

/* renamed from: cm1.r2 */
public final class C0771r2 implements C65231j<C65220d> {

    /* renamed from: a */
    public final /* synthetic */ C53916l<String> f1813a;

    public C0771r2(C53916l<? super String> lVar) {
        this.f1813a = lVar;
    }

    /* renamed from: a */
    public void mo539a(C65220d dVar, C65234n nVar) {
        C87412m.m108594g(dVar, "task");
        C87412m.m108594g(nVar, "status");
        C65453p pVar = (C65453p) dVar;
        Log.m105924i("Finder.SetProfileCoverViewModel", "onLoaderFin status:" + nVar + " url:" + pVar.f188339g);
        if (nVar != C65234n.OK || Util.isNullOrNil(pVar.f188339g)) {
            this.f1813a.resumeWith(Result.m168114constructorimpl(""));
            return;
        }
        C53916l<String> lVar = this.f1813a;
        Result.Companion companion = Result.Companion;
        lVar.resumeWith(Result.m168114constructorimpl(pVar.f188339g));
    }
}
