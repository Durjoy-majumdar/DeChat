package at3;

import java.util.concurrent.TimeUnit;

/* renamed from: at3.d */
public class C113071d {

    /* renamed from: a */
    public static final long f338456a;

    /* renamed from: b */
    public static final long f338457b;

    /* renamed from: c */
    public static final int f338458c;

    /* renamed from: d */
    public static final long f338459d;

    static {
        long millis = TimeUnit.SECONDS.toMillis(1);
        f338456a = millis;
        long millis2 = TimeUnit.MILLISECONDS.toMillis(50);
        f338457b = millis2;
        f338458c = (int) (millis / millis2);
        f338459d = millis * 3;
    }
}
