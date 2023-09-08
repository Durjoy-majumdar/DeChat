package lw0;

import java.math.BigDecimal;

/* renamed from: lw0.l */
public class C117485l {
    /* renamed from: a */
    public static double m165720a(int[] iArr, int i) {
        if (iArr == null || iArr.length == 0) {
            throw new NullPointerException("null == dataGroup || 0 == dataGroup.length");
        }
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        return new BigDecimal((double) i2).divide(new BigDecimal((double) iArr.length), i, 4).doubleValue();
    }

    /* renamed from: b */
    public static BigDecimal m165721b(double d, double d2) {
        return new BigDecimal(d).multiply(new BigDecimal(d2));
    }

    /* renamed from: c */
    public static double m165722c(int[] iArr, int i) {
        if (iArr == null || iArr.length == 0) {
            throw new NullPointerException("null == dataGroup || 0 == dataGroup.length");
        }
        double a = m165720a(iArr, i);
        BigDecimal bigDecimal = new BigDecimal(0.0d);
        for (int i2 : iArr) {
            bigDecimal = bigDecimal.add(new BigDecimal((double) i2).subtract(new BigDecimal(a)).pow(2));
        }
        return Math.pow(bigDecimal.divide(new BigDecimal(iArr.length - 1), i, 4).doubleValue(), 0.5d);
    }
}
