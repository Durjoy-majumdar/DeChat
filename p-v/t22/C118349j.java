package t22;

/* renamed from: t22.j */
public class C118349j {

    /* renamed from: a */
    public static double f353702a = -85.0d;

    /* renamed from: b */
    public static double f353703b = -1000.0d;

    /* renamed from: c */
    public static double f353704c = -85.0d;

    /* renamed from: d */
    public static double f353705d = -1000.0d;

    /* renamed from: a */
    public static double m166966a(double d, double d2) {
        double d3;
        f353704c = d;
        f353705d = d2;
        double d4 = f353702a;
        if (d4 != -85.0d) {
            double d5 = f353703b;
            if (d5 != -1000.0d) {
                d3 = (Math.atan2(d2 - d5, d - d4) * 180.0d) / 3.141592d;
                f353702a = f353704c;
                f353703b = f353705d;
                return d3;
            }
        }
        d3 = 0.0d;
        f353702a = f353704c;
        f353703b = f353705d;
        return d3;
    }
}
