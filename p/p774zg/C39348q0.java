package p774zg;

import com.eclipsesource.mmv8.C80135V8;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C29555x;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: zg.q0 */
public final class C39348q0 {

    /* renamed from: a */
    public static int f105763a = -1;

    /* renamed from: b */
    public static int f105764b = -1;

    /* renamed from: c */
    public static C39349a f105765c;

    /* renamed from: zg.q0$a */
    public interface C39349a {
    }

    /* renamed from: a */
    public static int m42095a(String str, String str2, int i) {
        String str3 = str2 + "=";
        if (str.indexOf(str3) >= 0) {
            return Util.getInt(str.replaceFirst(str3, ""), i);
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public static void m42096b() {
        String flags = C80135V8.getFlags();
        Log.m105925i("MicroMsg.V8GCReporter", "initV8GCSpaceSizeFromFlags : %s", flags);
        if (Util.isNullOrNil(flags)) {
            f105763a = 1;
            f105764b = 8;
            return;
        }
        String[] split = flags.split(" ", -1);
        for (int i = 0; i < split.length; i++) {
            int a = m42095a(split[i], "--min_semi_space_size", 1);
            if (a != Integer.MIN_VALUE) {
                f105763a = a;
            } else {
                int a2 = m42095a(split[i], "--max_semi_space_size", 8);
                if (a2 != Integer.MIN_VALUE) {
                    f105764b = a2;
                }
            }
        }
    }

    /* renamed from: c */
    public static void m42097c(int i, long j, int i2, String str, int i3, int i4, int i5) {
        if (f105765c != null) {
            Object[] objArr = new Object[9];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Long.valueOf(j);
            int i6 = f105763a;
            if (i6 <= 0) {
                m42096b();
                i6 = f105763a;
            }
            objArr[2] = Integer.valueOf(i6);
            int i7 = f105764b;
            if (i7 <= 0) {
                m42096b();
                i7 = f105764b;
            }
            objArr[3] = Integer.valueOf(i7);
            objArr[4] = Integer.valueOf(i2);
            objArr[5] = str;
            objArr[6] = Integer.valueOf(i3);
            objArr[7] = Integer.valueOf(i4);
            objArr[8] = Integer.valueOf(i5);
            String format = String.format("%d,%d,%d,%d,%d,%s,%d,%d,%d", objArr);
            Log.m105927v("MicroMsg.V8GCReporter", "report str:%s", format);
            ((C29555x.C29556a) f105765c).getClass();
            C115669n.INSTANCE.kvStat(17693, format);
        }
    }
}
