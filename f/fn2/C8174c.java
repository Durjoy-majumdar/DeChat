package fn2;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import in2.C9208d;
import rx3.C13598b0;

/* renamed from: fn2.c */
public final class C8174c extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C9208d f27066d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8174c(C9208d dVar) {
        super(1);
        this.f27066d = dVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Log.m105924i("MicroMsg.RepairerQrCodeDemoUI", "s3 switch " + booleanValue);
        this.f27066d.mo10016j3("s2", booleanValue);
        return C13598b0.f38549a;
    }
}
