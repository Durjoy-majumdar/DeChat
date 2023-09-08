package aq3;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import p869y0.C66478i;
import rx3.C13598b0;

/* renamed from: aq3.r */
public final class C54308r extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C66478i f152425d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54308r(C66478i iVar) {
        super(1);
        this.f152425d = iVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Log.m105924i("MicroMsg.ImageQueryMainUIC", "isShow: " + booleanValue);
        if (!booleanValue) {
            C66478i.C66479a.m78437a(this.f152425d, false, 1, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
