package pp3;

import com.tencent.p014mm.vfs.C75063i0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pp3.p */
public final class C77221p extends C87413o implements C32226l<C75063i0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f225330d;

    /* renamed from: e */
    public final /* synthetic */ long f225331e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77221p(long j, long j2) {
        super(1);
        this.f225330d = j;
        this.f225331e = j2;
    }

    public Object invoke(Object obj) {
        C75063i0 i0Var = (C75063i0) obj;
        C87412m.m108594g(i0Var, "$this$lruExpire");
        i0Var.f220844d = this.f225330d;
        i0Var.f220843c = this.f225331e;
        return C13598b0.f38549a;
    }
}
