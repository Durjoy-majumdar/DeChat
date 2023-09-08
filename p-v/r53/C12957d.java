package r53;

import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C48943c22;
import z04.C119027c;

/* renamed from: r53.d */
public final class C12957d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C48943c22 f36979d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12957d(C48943c22 c222) {
        super(0);
        this.f36979d = c222;
    }

    public Object invoke() {
        byte[] byteArray = this.f36979d.toByteArray();
        C87412m.m108593f(byteArray, "response.toByteArray()");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WECOIN_INCOME_PAGE_INFO_RESPONSE_STRING_SYNC, new String(byteArray, C119027c.f356489b));
        return C13598b0.f38549a;
    }
}
