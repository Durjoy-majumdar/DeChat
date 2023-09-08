package b92;

import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import rx3.C13598b0;

/* renamed from: b92.c */
public final class C104070c extends C87413o implements C32228q<ByteBuffer, Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C104065a f307804d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104070c(C104065a aVar) {
        super(3);
        this.f307804d = aVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        C87412m.m108594g(byteBuffer, "data");
        byteBuffer.position(0);
        C32228q<? super ByteBuffer, ? super Integer, ? super Integer, C13598b0> qVar = this.f307804d.f307795h;
        if (qVar != null) {
            qVar.invoke(byteBuffer, Integer.valueOf(intValue), Integer.valueOf(intValue2));
        }
        return C13598b0.f38549a;
    }
}
