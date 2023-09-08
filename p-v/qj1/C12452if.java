package qj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.if */
public final class C12452if extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12399ff f35835d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12452if(C12399ff ffVar) {
        super(1);
        this.f35835d = ffVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Log.m105924i("FinderLiveTitlePlugin", "#followAnchor-withBiz result=" + booleanValue);
        this.f35835d.mo12079c1();
        return C13598b0.f38549a;
    }
}
