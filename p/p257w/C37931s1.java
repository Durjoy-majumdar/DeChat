package p257w;

import com.tencent.tav.coremedia.TimeUtil;
import gy3.C87412m;
import p257w.C37919o;

/* renamed from: w.s1 */
public interface C37931s1<V extends C37919o> extends C37918n1 {

    /* renamed from: w.s1$a */
    public static final class C37932a {
        /* renamed from: a */
        public static <V extends C37919o> long m41629a(C37931s1<V> s1Var, V v, V v2, V v3) {
            C87412m.m108594g(v, "initialValue");
            C87412m.m108594g(v2, "targetValue");
            C87412m.m108594g(v3, "initialVelocity");
            return ((long) (s1Var.mo61431e() + s1Var.mo61432f())) * TimeUtil.SECOND_TO_US;
        }
    }

    /* renamed from: e */
    int mo61431e();

    /* renamed from: f */
    int mo61432f();
}
