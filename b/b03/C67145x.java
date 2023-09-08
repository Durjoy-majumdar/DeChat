package b03;

import androidx.transition.Transition;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: b03.x */
public final class C67145x extends C87413o implements C32226l<CharSequence, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C67133s f192794d;

    /* renamed from: e */
    public final /* synthetic */ Transition f192795e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67145x(C67133s sVar, Transition transition) {
        super(1);
        this.f192794d = sVar;
        this.f192795e = transition;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((CharSequence) obj, LocaleUtil.ITALIAN);
        C67133s.m79391e(this.f192794d, this.f192795e);
        return C13598b0.f38549a;
    }
}
