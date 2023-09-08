package vk2;

import fy3.C32228q;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: vk2.p */
public final class C52951p extends C87413o implements C32228q<Boolean, Boolean, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C52958x f147794d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52951p(C52958x xVar) {
        super(3);
        this.f147794d = xVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        C52959y yVar = this.f147794d.f147816r;
        if (yVar != null) {
            yVar.mo73703b(booleanValue, booleanValue2, booleanValue3);
        }
        return C13598b0.f38549a;
    }
}
