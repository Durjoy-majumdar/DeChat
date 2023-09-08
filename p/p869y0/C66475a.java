package p869y0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C60690y0;
import rx3.C13598b0;

/* renamed from: y0.a */
public final class C66475a extends C87413o implements C32226l<C66476a0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60690y0<C66476a0> f191250d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C66476a0, C13598b0> f191251e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66475a(C60690y0<C66476a0> y0Var, C32226l<? super C66476a0, C13598b0> lVar) {
        super(1);
        this.f191250d = y0Var;
        this.f191251e = lVar;
    }

    public Object invoke(Object obj) {
        C66476a0 a0Var = (C66476a0) obj;
        C87412m.m108594g(a0Var, LocaleUtil.ITALIAN);
        if (!C87412m.m108589b(this.f191250d.getValue(), a0Var)) {
            this.f191250d.setValue(a0Var);
            this.f191251e.invoke(a0Var);
        }
        return C13598b0.f38549a;
    }
}
