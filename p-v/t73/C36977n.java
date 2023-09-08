package t73;

import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import q73.C35812s;

/* renamed from: t73.n */
public final class C36977n extends C87413o implements C32228q<Integer, Integer, C40427l0, Boolean> {

    /* renamed from: d */
    public static final C36977n f98061d = new C36977n();

    public C36977n() {
        super(3);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        C40427l0 l0Var = (C40427l0) obj3;
        C87412m.m108594g(l0Var, "resPkg");
        return Boolean.valueOf(intValue2 > intValue && C35812s.f95615a.mo60424e(l0Var, "wx97b7aebac2183fd2"));
    }
}
