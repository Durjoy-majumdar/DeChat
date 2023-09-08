package il1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C50131kh1;

/* renamed from: il1.l8 */
public final class C60458l8 extends C87413o implements C32229r<Integer, Integer, String, C50131kh1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60424h8 f172368d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60458l8(C60424h8 h8Var) {
        super(4);
        this.f172368d = h8Var;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        C87412m.m108594g((C50131kh1) obj4, "resp");
        String str = this.f172368d.f172287r;
        Log.m105924i(str, "doHighLightLikeLive errType:" + intValue + " errCode:" + intValue2 + " errMsg:" + ((String) obj3));
        return C13598b0.f38549a;
    }
}
