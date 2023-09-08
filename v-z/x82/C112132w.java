package x82;

import b92.C104065a;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import rx3.C13598b0;

/* renamed from: x82.w */
public final class C112132w extends C87413o implements C32228q<ByteBuffer, Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C112124u f335729d;

    /* renamed from: e */
    public final /* synthetic */ C104065a f335730e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112132w(C112124u uVar, C104065a aVar) {
        super(3);
        this.f335729d = uVar;
        this.f335730e = aVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        C87412m.m108594g(byteBuffer, "data");
        MMHandler sendData = this.f335729d.getSendData();
        if (sendData != null) {
            sendData.post(new C112131v(this.f335730e, byteBuffer, intValue, intValue2));
        }
        return C13598b0.f38549a;
    }
}
