package jd1;

import bd1.C39757e;
import com.tencent.p014mm.vfs.C45112n1;
import com.tencent.p014mm.vfs.C86009m1;
import gy3.C87412m;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;

/* renamed from: jd1.a */
public final class C46470a {

    /* renamed from: a */
    public final C86009m1 f125196a;

    public C46470a(C86009m1 m1Var) {
        C87412m.m108594g(m1Var, "file");
        this.f125196a = m1Var;
    }

    /* renamed from: a */
    public final boolean mo71847a(C39757e eVar) {
        Object obj;
        C87412m.m108594g(eVar, "accountPublicInfo");
        try {
            Result.Companion companion = Result.Companion;
            if (this.f125196a.mo119966f()) {
                this.f125196a.mo119964e();
            }
            C86009m1 m1Var = this.f125196a;
            byte[] byteArray = eVar.toByteArray();
            C87412m.m108593f(byteArray, "accountPublicInfo.toByteArray()");
            C45112n1.m49955b(m1Var, byteArray);
            obj = Result.m168114constructorimpl(C13598b0.f38549a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m168121isSuccessimpl(obj);
    }
}
