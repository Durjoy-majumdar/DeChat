package bl3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53930o0;
import a14.C53959v2;
import a14.C53973z1;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39630m0;
import cl3.C55010a;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import gy3.C87412m;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;

/* renamed from: bl3.p */
public class C54494p implements C0123n0 {

    /* renamed from: d */
    public final C0000n0 f152774d = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));

    /* renamed from: e */
    public final C0000n0 f152775e = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C58901s.f168555a));

    /* renamed from: f */
    public final C39812a0 f152776f = new C39812a0(true);

    /* renamed from: a */
    public final C55010a mo75332a(String str) {
        String str2 = "com.tencent.mm.ui.component.UicApiExporterFor" + str;
        Log.m105924i("SupportUIC", "[attachUicApiRegister] name=" + str2);
        Object newInstance = Class.forName(str2).newInstance();
        C87412m.m108592e(newInstance, "null cannot be cast to non-null type com.tencent.mm.ui.component.annotation.UicApiRegister");
        return (C55010a) newInstance;
    }

    /* renamed from: b */
    public void mo75333b(String str) {
        Object obj;
        C87412m.m108594g(str, "javaClassName");
        try {
            Result.Companion companion = Result.Companion;
            mo75332a(str).mo7795a();
            obj = Result.m168114constructorimpl(C13598b0.f38549a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r4 = Result.m168117exceptionOrNullimpl(obj);
        if (r4 != null) {
            Log.printErrStackTrace("SupportUIC", r4, "", new Object[0]);
        }
    }

    /* renamed from: c */
    public void mo75334c() {
        this.f152776f.mo62188a();
        C0000n0 n0Var = this.f152774d;
        C53930o0.m60557d(n0Var, this + " onCleared.", (Throwable) null, 2, (Object) null);
        C0000n0 n0Var2 = this.f152775e;
        C53930o0.m60557d(n0Var2, this + " onCleared.", (Throwable) null, 2, (Object) null);
    }

    public C39630m0 getViewModelStore() {
        return this.f152776f;
    }
}
