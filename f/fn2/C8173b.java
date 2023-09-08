package fn2;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import in2.C9208d;
import rx3.C13598b0;

/* renamed from: fn2.b */
public final class C8173b extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C9208d f27065d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8173b(C9208d dVar) {
        super(1);
        this.f27065d = dVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Log.m105924i("MicroMsg.RepairerQrCodeDemoUI", "s2 switch " + booleanValue);
        this.f27065d.mo10016j3("s3", booleanValue);
        return C13598b0.f38549a;
    }
}
