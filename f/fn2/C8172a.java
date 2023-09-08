package fn2;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import in2.C9205a;
import in2.C9208d;
import rx3.C13598b0;

/* renamed from: fn2.a */
public final class C8172a extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C9208d f27064d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8172a(C9208d dVar) {
        super(1);
        this.f27064d = dVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Log.m105924i("MicroMsg.RepairerQrCodeDemoUI", "s1 switch " + booleanValue);
        C9208d dVar = this.f27064d;
        C9205a aVar = new C9205a("c_" + System.currentTimeMillis());
        C8175d dVar2 = new C8175d("s4_" + System.currentTimeMillis());
        dVar2.mo9231d("Switch 4");
        aVar.mo10010b(dVar2);
        dVar.mo10014g3(aVar);
        return C13598b0.f38549a;
    }
}
