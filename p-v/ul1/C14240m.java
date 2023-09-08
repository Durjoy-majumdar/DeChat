package ul1;

import ak1.C54067f0;
import ak1.C54108o;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87413o;
import qo3.C101218e0;
import rx3.C13598b0;
import ul1.C14205c;

/* renamed from: ul1.m */
public final class C14240m extends C87413o implements C32227p<C14205c.C14206a, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C14221k f39765d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14240m(C14221k kVar) {
        super(2);
        this.f39765d = kVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C14205c.C14206a aVar = (C14205c.C14206a) obj;
        int intValue = ((Number) obj2).intValue();
        C14221k kVar = this.f39765d;
        if (aVar != null) {
            C14209e eVar = kVar.f39728f;
            if (eVar != null) {
                eVar.mo13596k0(aVar);
            }
            kVar.mo13612x(aVar);
            int i = aVar.f39674c;
            Class cls = C54108o.class;
            if (i == 1) {
                ((C54108o) C86312j.m106911c(cls)).Mx0(C54067f0.C0051c.CLICK_ANY_COMMENT, "");
            } else if (i == 2) {
                ((C54108o) C86312j.m106911c(cls)).Mx0(C54067f0.C0051c.CLICK_LIKE, "");
            } else if (i == 3) {
                ((C54108o) C86312j.m106911c(cls)).Mx0(C54067f0.C0051c.CLICK_SPECIFY_COMMENT_CONTENT, "");
            } else if (i == 5) {
                ((C54108o) C86312j.m106911c(cls)).Mx0(C54067f0.C0051c.CLICK_FANS_MEMBER, "");
            }
        }
        C101218e0 e0Var = kVar.f39721F;
        if (e0Var != null) {
            e0Var.mo140680z();
        }
        Log.m105924i("FinderLiveLotteryCreateViewCallback", "chooserLotteryType " + aVar + ", pos:" + intValue);
        return C13598b0.f38549a;
    }
}
