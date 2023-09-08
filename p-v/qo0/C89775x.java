package qo0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qo0.x */
public final class C89775x extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C89750q f258143d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89775x(C89750q qVar) {
        super(1);
        this.f258143d = qVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Log.m105924i("MicroMsg.VideoCast.VideoCastController", "reconnect: isSuccess = " + booleanValue);
        if (booleanValue) {
            C89750q qVar = this.f258143d;
            qVar.mo124047d(qVar.f258098i, 5);
        }
        return C13598b0.f38549a;
    }
}
