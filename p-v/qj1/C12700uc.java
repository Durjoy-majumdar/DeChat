package qj1;

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

/* renamed from: qj1.uc */
public final class C12700uc extends C87413o implements C32227p<Boolean, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12572oc f36389d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<NoticeGetCouponView> f36390e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12700uc(C12572oc ocVar, C8479f0<NoticeGetCouponView> f0Var) {
        super(2);
        this.f36389d = ocVar;
        this.f36390e = f0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        C49098d51 d512;
        C51559uk1 a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C87412m.m108594g((String) obj2, "errString");
        if (!(!booleanValue || (d512 = this.f36389d.f36081r) == null || (a = C7802g1.m7949a(d512)) == null)) {
            C12572oc ocVar = this.f36389d;
            C8479f0<NoticeGetCouponView> f0Var = this.f36390e;
            C49359f1 f1Var = a.f142912z;
            if (f1Var != null) {
                C7776a.m7932b(f1Var);
            }
            C49098d51 d513 = ocVar.f36081r;
            if (d513 != null) {
                C7802g1.m7951c(d513, a);
            }
            ocVar.mo12182d();
            NoticeGetCouponView noticeGetCouponView = (NoticeGetCouponView) f0Var.f27484d;
            if (noticeGetCouponView != null) {
                noticeGetCouponView.mo5015a(a, (C32224a<C13598b0>) null);
            }
        }
        return C13598b0.f38549a;
    }
}
