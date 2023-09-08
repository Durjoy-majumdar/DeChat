package p1166z0;

/* renamed from: z0.c */
public final class C112537c {
    /* renamed from: a */
    public static final String m153733a(float f, int i) {
        int max = Math.max(i, 0);
        float pow = (float) Math.pow((double) 10.0f, (double) max);
        float f2 = f * pow;
        int i2 = (int) f2;
        if (f2 - ((float) i2) >= 0.5f) {
            i2++;
        }
        float f3 = ((float) i2) / pow;
        return max > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }
}
