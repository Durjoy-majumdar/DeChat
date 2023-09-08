package p50;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: p50.h */
public final class C11827h extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f34582d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11827h(C32226l<? super Boolean, C13598b0> lVar) {
        super(1);
        this.f34582d = lVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Log.m105924i("MicroMsg.LiveCoreVisitor", "switchToCdnMode success:" + booleanValue);
        C32226l<Boolean, C13598b0> lVar = this.f34582d;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(booleanValue));
        }
        return C13598b0.f38549a;
    }
}
