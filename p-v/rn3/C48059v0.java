package rn3;

import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rn3.v0 */
public final class C48059v0 extends C87413o implements C32227p<Integer, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WXFileObject f128903d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Integer, C13598b0> f128904e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48059v0(WXFileObject wXFileObject, C32226l<? super Integer, C13598b0> lVar) {
        super(2);
        this.f128903d = wXFileObject;
        this.f128904e = lVar;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String str = (String) obj2;
        if (intValue == 2) {
            this.f128903d.filePath = str;
        }
        this.f128904e.invoke(Integer.valueOf(intValue));
        return C13598b0.f38549a;
    }
}
