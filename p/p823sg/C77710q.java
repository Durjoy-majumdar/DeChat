package p823sg;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: sg.q */
public class C77710q extends Number {

    /* renamed from: d */
    public int f226490d;

    public C77710q(int i) {
        this.f226490d = i;
    }

    /* renamed from: a */
    public static String m93738a(int i) {
        return new C77710q(i).toString();
    }

    /* renamed from: b */
    public static int m93739b(String str) {
        try {
            return new C77710q(Long.valueOf(str).longValue()).f226490d;
        } catch (Exception unused) {
            return 0;
        }
    }

    public double doubleValue() {
        return ((double) (((long) this.f226490d) | 0)) + 0.0d;
    }

    public float floatValue() {
        return (float) (((double) (((long) this.f226490d) | 0)) + 0.0d);
    }

    public int intValue() {
        return this.f226490d;
    }

    public long longValue() {
        return ((long) this.f226490d) & Util.MAX_32BIT_VALUE;
    }

    public String toString() {
        long j = ((long) this.f226490d) & Util.MAX_32BIT_VALUE;
        return "" + j;
    }

    public C77710q(long j) {
        this.f226490d = (int) (j & -1);
    }
}
