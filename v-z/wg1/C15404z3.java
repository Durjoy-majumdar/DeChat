package wg1;

import com.tencent.p014mm.plugin.finder.view.notice.NoticeGetCouponView;
import er1.C7776a;
import er1.C7802g1;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C49098d51;
import te3.C49359f1;
import te3.C51559uk1;

/* renamed from: wg1.z3 */
public final class C15404z3 extends C87413o implements C32227p<Boolean, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f41797d;

    /* renamed from: e */
    public final /* synthetic */ C51559uk1 f41798e;

    /* renamed from: f */
    public final /* synthetic */ C49098d51 f41799f;

    /* renamed from: g */
    public final /* synthetic */ C8479f0<NoticeGetCouponView> f41800g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15404z3(String str, C51559uk1 uk12, C49098d51 d512, C8479f0<NoticeGetCouponView> f0Var) {
        super(2);
        this.f41797d = str;
        this.f41798e = uk12;
        this.f41799f = d512;
        this.f41800g = f0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        C51559uk1 uk12;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C87412m.m108594g((String) obj2, "errString");
        if (booleanValue) {
            String str = this.f41797d;
            C51559uk1 uk13 = this.f41798e;
            if (C87412m.m108589b(str, uk13 != null ? uk13.f142894e : null) && (uk12 = this.f41798e) != null) {
                C49098d51 d512 = this.f41799f;
                C8479f0<NoticeGetCouponView> f0Var = this.f41800g;
                C49359f1 f1Var = uk12.f142912z;
                if (f1Var != null) {
                    C7776a.m7932b(f1Var);
                }
                C7802g1.m7951c(d512, uk12);
                NoticeGetCouponView noticeGetCouponView = (NoticeGetCouponView) f0Var.f27484d;
                if (noticeGetCouponView != null) {
                    noticeGetCouponView.mo5015a(uk12, (C32224a<C13598b0>) null);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
