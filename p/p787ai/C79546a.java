package p787ai;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86739i0;
import java.util.ArrayList;

/* renamed from: ai.a */
public class C79546a {

    /* renamed from: A */
    public static byte f233228A = 0;

    /* renamed from: a */
    public static final int[] f233229a = {0, 1, 2};

    /* renamed from: b */
    public static final int[] f233230b = {3, 13, 23};

    /* renamed from: c */
    public static final int[] f233231c = {4, 14, 24};

    /* renamed from: d */
    public static final int[] f233232d = {5, 15, 25};

    /* renamed from: e */
    public static final int[] f233233e = {6, 16, 26};

    /* renamed from: f */
    public static final int[] f233234f = {7, 17, 27};

    /* renamed from: g */
    public static final int[] f233235g = {8, 18, 28};

    /* renamed from: h */
    public static final int[] f233236h = {9, 19, 29};

    /* renamed from: i */
    public static final int[] f233237i = {63, 69, 75};

    /* renamed from: j */
    public static final int[] f233238j = {64, 70, 76};

    /* renamed from: k */
    public static final int[] f233239k = {65, 71, 77};

    /* renamed from: l */
    public static final int[] f233240l = {66, 72, 78};

    /* renamed from: m */
    public static final int[] f233241m = {0};

    /* renamed from: n */
    public static final int[] f233242n = {3};

    /* renamed from: o */
    public static final int[] f233243o = {9};

    /* renamed from: p */
    public static final int[] f233244p = {10};

    /* renamed from: q */
    public static final int[] f233245q = {11};

    /* renamed from: r */
    public static final int[] f233246r = {12};

    /* renamed from: s */
    public static final int[] f233247s = {13};

    /* renamed from: t */
    public static final int[] f233248t = {14};

    /* renamed from: u */
    public static final ArrayList<long[]> f233249u = new ArrayList<>();

    /* renamed from: v */
    public static final ArrayList<Object[]> f233250v = new ArrayList<>();

    /* renamed from: w */
    public static boolean f233251w = false;

    /* renamed from: x */
    public static long f233252x = 0;

    /* renamed from: y */
    public static long f233253y = 0;

    /* renamed from: z */
    public static long f233254z = 0;

    /* renamed from: a */
    public static boolean m96577a(int i) {
        byte b = f233228A;
        if ((b & i) != 0) {
            return false;
        }
        f233228A = (byte) (b | i);
        Log.m105925i("MicroMsg.BlinkStartup", "checkAndMark bit 0x%x", Integer.valueOf(i));
        return true;
    }

    /* renamed from: b */
    public static void m96578b(long j, long j2) {
        f233249u.add(new long[]{709, j, j2});
    }

    /* renamed from: c */
    public static void m96579c(int[] iArr, long j) {
        Log.m105925i("MicroMsg.BlinkStartup", "%s %s", Integer.valueOf(iArr[0]), Long.valueOf(j));
        m96578b((long) iArr[0], j);
        m96578b((long) iArr[1], j);
    }

    /* renamed from: d */
    public static void m96580d(int[] iArr, long j) {
        Log.m105925i("MicroMsg.BlinkStartup", "%s %s", Integer.valueOf(iArr[0]), Long.valueOf(j));
        long j2 = (long) iArr[0];
        f233249u.add(new long[]{910, j2, j});
    }

    /* renamed from: e */
    public static void m96581e(int i) {
        if (f233254z == 0) {
            Log.m105920e("MicroMsg.BlinkStartup", "sLastPhaseTimestamp is 0");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - f233254z;
        switch (i) {
            case 1:
                if (m96577a(1)) {
                    m96579c(f233230b, currentTimeMillis);
                    f233254z = System.currentTimeMillis();
                    return;
                }
                return;
            case 2:
                if (m96577a(2)) {
                    m96579c(f233231c, currentTimeMillis);
                    f233254z = System.currentTimeMillis();
                    return;
                }
                return;
            case 3:
                if (m96577a(4)) {
                    m96579c(f233232d, currentTimeMillis);
                    f233254z = System.currentTimeMillis();
                    return;
                }
                return;
            case 4:
                if (m96577a(8)) {
                    m96579c(f233233e, currentTimeMillis);
                    f233254z = System.currentTimeMillis();
                    return;
                }
                return;
            case 5:
                if (m96577a(16)) {
                    if (currentTimeMillis > 10000) {
                        m96577a(512);
                        f233251w = false;
                    }
                    m96579c(f233234f, currentTimeMillis);
                    f233254z = System.currentTimeMillis();
                    return;
                }
                return;
            case 6:
                if (m96577a(32)) {
                    if (currentTimeMillis > 10000) {
                        m96577a(512);
                        f233251w = false;
                    }
                    m96579c(f233235g, currentTimeMillis);
                    f233254z = System.currentTimeMillis();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: f */
    public static void m96582f(String str) {
        C86739i0.m107600b(str);
    }
}
