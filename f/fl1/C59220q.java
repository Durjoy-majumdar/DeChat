package fl1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C49430fj0;

/* renamed from: fl1.q */
public final class C59220q extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59161f f169365d;

    /* renamed from: e */
    public final /* synthetic */ C49430fj0 f169366e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59220q(C59161f fVar, C49430fj0 fj02) {
        super(1);
        this.f169365d = fVar;
        this.f169366e = fj02;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C59161f fVar = this.f169365d;
        C49430fj0 fj02 = this.f169366e;
        C87412m.m108593f(fj02, LocaleUtil.ITALIAN);
        fVar.mo84386u(booleanValue, fj02);
        return C13598b0.f38549a;
    }
}
