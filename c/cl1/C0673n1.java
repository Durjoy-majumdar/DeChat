package cl1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: cl1.n1 */
public final class C0673n1 extends C87413o implements C32226l<String, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ String f1584d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0673n1(String str) {
        super(1);
        this.f1584d = str;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        return Boolean.valueOf(C87412m.m108589b(str, this.f1584d));
    }
}
