package h43;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import rx3.C13598b0;

/* renamed from: h43.c */
public final class C108067c extends C87413o implements C32226l<ByteBuffer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108061b f323596d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108067c(C108061b bVar) {
        super(1);
        this.f323596d = bVar;
    }

    public Object invoke(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C87412m.m108594g(byteBuffer, "data");
        C108061b bVar = this.f323596d;
        C108109r0 r0Var = bVar.f323617j;
        if (r0Var != null) {
            C108061b.m146366n(bVar, byteBuffer, r0Var.f332768w, r0Var.f332769x, false);
        }
        return C13598b0.f38549a;
    }
}
