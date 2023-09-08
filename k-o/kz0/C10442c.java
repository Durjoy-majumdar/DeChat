package kz0;

import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C64539ly1;
import z04.C119027c;

/* renamed from: kz0.c */
public final class C10442c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C64539ly1 f31669d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10442c(C64539ly1 ly12) {
        super(0);
        this.f31669d = ly12;
    }

    public Object invoke() {
        byte[] byteArray = this.f31669d.toByteArray();
        C87412m.m108593f(byteArray, "response.toByteArray()");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_COUPON_HISTORY_LIST_STRING_SYNC, new String(byteArray, C119027c.f356489b));
        return C13598b0.f38549a;
    }
}
