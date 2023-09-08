package p1142p8;

/* renamed from: p8.a */
public final class C110191a {
    /* renamed from: a */
    public static float m149775a(float f, float f2, float f3, float f4, float f5, float f6) {
        double d = (double) (f3 - f);
        double d2 = (double) (f4 - f2);
        float hypot = (float) Math.hypot(d, d2);
        double d3 = (double) (f5 - f);
        float hypot2 = (float) Math.hypot(d3, d2);
        double d4 = (double) (f6 - f2);
        float hypot3 = (float) Math.hypot(d3, d4);
        float hypot4 = (float) Math.hypot(d, d4);
        return (hypot <= hypot2 || hypot <= hypot3 || hypot <= hypot4) ? (hypot2 <= hypot3 || hypot2 <= hypot4) ? hypot3 > hypot4 ? hypot3 : hypot4 : hypot2 : hypot;
    }
}
