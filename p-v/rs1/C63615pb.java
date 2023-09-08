package rs1;

import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hp1.C46091u0;
import java.util.List;
import rx3.C13598b0;

/* renamed from: rs1.pb */
public final class C63615pb extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63625rb f180378d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63615pb(C63625rb rbVar) {
        super(1);
        this.f180378d = rbVar;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "suggestion");
        String str2 = this.f180378d.f180396d;
        Log.m105924i(str2, "onSuggestion Click :" + str);
        this.f180378d.mo88468f3().getFtsEditText().mo70356l(str, (List<FTSSearchView.C6996f>) null);
        this.f180378d.mo88468f3().getFtsEditText().mo70335c();
        C46091u0 u0Var = this.f180378d.f180403n;
        if (u0Var != null) {
            u0Var.mo71529c(str);
            this.f180378d.getClass();
            this.f180378d.mo88470i3(str);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("historyLogic");
        throw null;
    }
}
