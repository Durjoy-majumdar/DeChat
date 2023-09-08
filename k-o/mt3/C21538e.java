package mt3;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import ot3.C21881e;

@Deprecated
/* renamed from: mt3.e */
public class C21538e {
    /* renamed from: a */
    public static int m24414a(Context context) {
        Integer valueOf = Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getInt("key_fail_times", 0));
        C21881e.m25084c("Soter.SoterAntiBruteForceStrategy", "soter: current retry time: " + valueOf, new Object[0]);
        return valueOf.intValue();
    }

    /* renamed from: b */
    public static boolean m24415b(Context context) {
        if (m24414a(context) >= 5) {
            return false;
        }
        C21881e.m25084c("Soter.SoterAntiBruteForceStrategy", "soter: fail time available", new Object[0]);
        return true;
    }

    /* renamed from: c */
    public static boolean m24416c(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        Long valueOf = Long.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getLong("key_last_freeze_time", -1));
        C21881e.m25084c("Soter.SoterAntiBruteForceStrategy", "soter: current last freeze time: " + valueOf, new Object[0]);
        int longValue = (int) ((currentTimeMillis - valueOf.longValue()) / 1000);
        C21881e.m25084c("Soter.SoterAntiBruteForceStrategy", "soter: tween sec after last freeze: " + longValue, new Object[0]);
        if (longValue <= 30) {
            return false;
        }
        C21881e.m25082a("Soter.SoterAntiBruteForceStrategy", "soter: after last freeze", new Object[0]);
        return true;
    }

    /* renamed from: d */
    public static void m24417d(Context context, int i) {
        C21881e.m25084c("Soter.SoterAntiBruteForceStrategy", "soter: setting to time: " + i, new Object[0]);
        if (i < 0) {
            C21881e.m25087f("Soter.SoterAntiBruteForceStrategy", "soter: illegal fail time", new Object[0]);
        } else if (context == null) {
            C21881e.m25083b("Soter.SoterAntiBruteForceStrategy", "soter: context is null", new Object[0]);
        } else {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
            edit.putInt("key_fail_times", i);
            edit.apply();
        }
    }

    /* renamed from: e */
    public static void m24418e(Context context, long j) {
        C21881e.m25084c("Soter.SoterAntiBruteForceStrategy", "soter: setting last freeze time: " + j, new Object[0]);
        if (j < -1) {
            C21881e.m25087f("Soter.SoterAntiBruteForceStrategy", "soter: illegal setLastFreezeTime", new Object[0]);
        } else if (context == null) {
            C21881e.m25083b("Soter.SoterAntiBruteForceStrategy", "soter: context is null", new Object[0]);
        } else {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
            edit.putLong("key_last_freeze_time", j);
            edit.apply();
        }
    }
}
