package g10;

import a14.C53916l;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.fp4;

/* renamed from: g10.c */
public final class C8226c extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C53916l<fp4> f27152d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8226c(C53916l<? super fp4> lVar) {
        super(1);
        this.f27152d = lVar;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        C53916l<fp4> lVar = this.f27152d;
        Result.Companion companion = Result.Companion;
        lVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new IllegalStateException("Failed to get finders: error code is " + intValue))));
        return C13598b0.f38549a;
    }
}
