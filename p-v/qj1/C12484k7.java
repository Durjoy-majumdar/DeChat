package qj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import qj1.C12282d7;
import rx3.C13598b0;

/* renamed from: qj1.k7 */
public final class C12484k7 extends C87413o implements C32227p<Boolean, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12282d7 f35909d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12484k7(C12282d7 d7Var) {
        super(2);
        this.f35909d = d7Var;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        if (booleanValue) {
            C12282d7.m11835p1(this.f35909d, (C12282d7.C12289d) null, (String) null, 3, (Object) null);
            this.f35909d.f35420u.getRv().post(new C12472j7(this.f35909d));
        } else {
            String str = this.f35909d.f35417r;
            Log.m105924i(str, "[giftPkgBuySuccess] doGetGiftList faild, errcode = " + intValue + ", return");
        }
        return C13598b0.f38549a;
    }
}
