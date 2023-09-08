package rn3;

import com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rn3.z0 */
public final class C48063z0 extends C87413o implements C32227p<Integer, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WXAppExtendObject f128911d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Integer, C13598b0> f128912e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48063z0(WXAppExtendObject wXAppExtendObject, C32226l<? super Integer, C13598b0> lVar) {
        super(2);
        this.f128911d = wXAppExtendObject;
        this.f128912e = lVar;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String str = (String) obj2;
        if (intValue == 2) {
            this.f128911d.filePath = str;
        }
        this.f128912e.invoke(Integer.valueOf(intValue));
        return C13598b0.f38549a;
    }
}
