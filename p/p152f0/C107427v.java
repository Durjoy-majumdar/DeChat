package p152f0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p735w1.C111703v;

/* renamed from: f0.v */
public final class C107427v extends C87413o implements C32226l<List<C111703v>, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C107394p2 f321432d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107427v(C107394p2 p2Var) {
        super(1);
        this.f321432d = p2Var;
    }

    public Object invoke(Object obj) {
        boolean z;
        List list = (List) obj;
        C87412m.m108594g(list, LocaleUtil.ITALIAN);
        C107401q2 q2Var = this.f321432d.f321319g;
        if (q2Var != null) {
            list.add(q2Var.f321339a);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
