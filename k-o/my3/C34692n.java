package my3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;

/* renamed from: my3.n */
public class C34692n {
    /* renamed from: a */
    public static final void m40449a(boolean z, Number number) {
        C87412m.m108594g(number, TPReportKeys.Common.COMMON_STEP);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }

    /* renamed from: b */
    public static final C109647f<Double> m40450b(double d, double d2) {
        return new C34688d(d, d2);
    }
}
