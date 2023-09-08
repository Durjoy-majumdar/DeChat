package p152f0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p735w1.C111703v;

/* renamed from: f0.e1 */
public final class C107321e1 extends C87413o implements C32226l<List<C111703v>, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C107307d1 f321095d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107321e1(C107307d1 d1Var) {
        super(1);
        this.f321095d = d1Var;
    }

    public Object invoke(Object obj) {
        boolean z;
        List list = (List) obj;
        C87412m.m108594g(list, LocaleUtil.ITALIAN);
        C111703v vVar = this.f321095d.f321050d.f321370f;
        if (vVar != null) {
            list.add(vVar);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
