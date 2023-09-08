package f32;

import android.os.SystemClock;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: f32.e */
public class C75676e {

    /* renamed from: a */
    public static String f222284a;

    /* renamed from: b */
    public static long f222285b;

    /* renamed from: c */
    public static String f222286c;

    /* renamed from: d */
    public static boolean f222287d;

    /* renamed from: a */
    public static void m90932a(int i) {
        if (!Util.isNullOrNil(f222284a)) {
            if (f222287d || !(i == 9 || i == 10 || i == 11)) {
                if (i == 9 || i == 10 || i == 11) {
                    f222287d = false;
                }
                long elapsedRealtime = (SystemClock.elapsedRealtime() / 1000) - f222285b;
                C115669n.INSTANCE.mo160131h(18889, Integer.valueOf(i), f222284a, Long.valueOf(elapsedRealtime), f222286c);
            }
        }
    }
}
