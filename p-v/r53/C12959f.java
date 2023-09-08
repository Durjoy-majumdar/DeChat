package r53;

import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C51526uc2;
import z04.C119027c;

/* renamed from: r53.f */
public final class C12959f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C51526uc2 f36981d;

    /* renamed from: e */
    public final /* synthetic */ int f36982e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12959f(C51526uc2 uc22, int i) {
        super(0);
        this.f36981d = uc22;
        this.f36982e = i;
    }

    public Object invoke() {
        byte[] byteArray = this.f36981d.toByteArray();
        C87412m.m108593f(byteArray, "response.toByteArray()");
        String str = new String(byteArray, C119027c.f356489b);
        C85801v1 i = C86709a0.m107535s().mo121142i();
        i.mo119678L(this.f36982e + "USERINFO_WECOIN_PRICE_LIST_RESPONSE_STRING_SYNC", str);
        return C13598b0.f38549a;
    }
}
