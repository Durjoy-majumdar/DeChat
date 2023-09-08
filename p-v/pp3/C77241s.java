package pp3;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C75057b1;
import com.tencent.p014mm.vfs.C75061i;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pp3.s */
public final class C77241s extends C87413o implements C32226l<C75057b1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MultiProcessMMKV f225351d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77241s(MultiProcessMMKV multiProcessMMKV) {
        super(1);
        this.f225351d = multiProcessMMKV;
    }

    public Object invoke(Object obj) {
        C75057b1 b1Var = (C75057b1) obj;
        C87412m.m108594g(b1Var, "$this$storage");
        b1Var.mo104650f(C75061i.C75062a.m90021b(b1Var, 50), new C77235r(this.f225351d));
        b1Var.f220828e = Boolean.TRUE;
        return C13598b0.f38549a;
    }
}
