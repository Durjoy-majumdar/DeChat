package oo1;

import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeGetCouponView;
import er1.C7776a;
import er1.C7802g1;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import oo1.C11625e;
import rx3.C13598b0;
import te3.C49098d51;
import te3.C49359f1;
import te3.C51559uk1;

/* renamed from: oo1.o */
public final class C11672o extends C87413o implements C32227p<Boolean, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f34204d;

    /* renamed from: e */
    public final /* synthetic */ C11625e f34205e;

    /* renamed from: f */
    public final /* synthetic */ C11625e.C11646u f34206f;

    /* renamed from: g */
    public final /* synthetic */ C49098d51 f34207g;

    /* renamed from: h */
    public final /* synthetic */ C8479f0<NoticeGetCouponView> f34208h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11672o(String str, C11625e eVar, C11625e.C11646u uVar, C49098d51 d512, C8479f0<NoticeGetCouponView> f0Var) {
        super(2);
        this.f34204d = str;
        this.f34205e = eVar;
        this.f34206f = uVar;
        this.f34207g = d512;
        this.f34208h = f0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        C11625e eVar;
        C51559uk1 uk12;
        C49098d51 d512;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C87412m.m108594g((String) obj2, "errString");
        if (booleanValue) {
            String str = this.f34204d;
            C51559uk1 uk13 = this.f34205e.f34104r;
            if (C87412m.m108589b(str, uk13 != null ? uk13.f142894e : null) && (uk12 = eVar.f34104r) != null) {
                C11625e.C11646u uVar = this.f34206f;
                C49098d51 d513 = this.f34207g;
                C8479f0<NoticeGetCouponView> f0Var = this.f34208h;
                C49359f1 f1Var = uk12.f142912z;
                if (f1Var != null) {
                    C7776a.m7932b(f1Var);
                }
                FinderProfileHeaderUIC.C3463b bVar = (FinderProfileHeaderUIC.C3463b) FinderProfileHeaderUIC.f16192h1.get(uVar.f34141d.invoke());
                if (!(bVar == null || (d512 = bVar.f16265d) == null)) {
                    C7802g1.m7951c(d512, uk12);
                }
                (eVar = this.f34205e).mo11536i(uVar.f34141d.invoke(), d513, !uVar.f34142e.invoke().booleanValue());
                NoticeGetCouponView noticeGetCouponView = (NoticeGetCouponView) f0Var.f27484d;
                if (noticeGetCouponView != null) {
                    noticeGetCouponView.mo5015a(uk12, (C32224a<C13598b0>) null);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
