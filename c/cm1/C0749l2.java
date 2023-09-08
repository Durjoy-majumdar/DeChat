package cm1;

import a14.C53916l;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ht1.C8794p5;
import kotlin.Result;
import rx3.C13604l;
import te3.C50542nh0;
import te3.C64553md1;

/* renamed from: cm1.l2 */
public final class C0749l2 implements C8794p5<C64553md1> {

    /* renamed from: d */
    public final /* synthetic */ C53916l<C13604l<Integer, String>> f1767d;

    public C0749l2(C53916l<? super C13604l<Integer, String>> lVar) {
        this.f1767d = lVar;
    }

    /* renamed from: c5 */
    public void mo705c5(Object obj, C50542nh0 nh02) {
        C87412m.m108594g((C64553md1) obj, "req");
        C87412m.m108594g(nh02, "ret");
        Log.m105924i("Finder.SetProfileCoverViewModel", "onModifyResult, retCode: " + nh02.f138603e + " retMsg:" + nh02.f138604f);
        C53916l<C13604l<Integer, String>> lVar = this.f1767d;
        Result.Companion companion = Result.Companion;
        lVar.resumeWith(Result.m168114constructorimpl(new C13604l(Integer.valueOf(nh02.f138603e), nh02.f138604f)));
    }
}
