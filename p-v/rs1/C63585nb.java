package rs1;

import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hp1.C60055x0;
import java.util.List;
import rx3.C13598b0;

/* renamed from: rs1.nb */
public final class C63585nb extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63625rb f180302d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63585nb(C63625rb rbVar) {
        super(1);
        this.f180302d = rbVar;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        C63625rb rbVar = this.f180302d;
        C60055x0 x0Var = rbVar.f180402j;
        if (x0Var != null) {
            x0Var.f171399r = str;
            rbVar.mo88468f3().getFtsEditText().mo70356l(str, (List<FTSSearchView.C6996f>) null);
            this.f180302d.mo88468f3().getFtsEditText().mo70335c();
            this.f180302d.getClass();
            this.f180302d.mo88470i3(str);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("searchSuggestionManager");
        throw null;
    }
}
