package ud3;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.p014mm.booter.C28862c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.xweb.util.FrequentLimiter;
import p206nj.C11171e;

/* renamed from: ud3.a */
public class C14181a {
    /* renamed from: a */
    public static void m13515a() {
        if (C11171e.m11046c(23)) {
            Context context = MMApplicationContext.getContext();
            boolean z = false;
            int i = MultiProcessMMKV.getMMKV("sdcard_usable_report").getInt("ignore_battery_dialog_time", 0);
            Log.m105925i("MicroMsg.BatteryUtil", "getIgnoreBatteryOptimizationsDialogTime() time=%s", Integer.valueOf(i));
            if (i < 3 && !C28862c.m38401b(context)) {
                Log.m105924i("MicroMsg.BatteryUtil", "checkIgnoreBatteryOptimizations()");
                SharedPreferences.Editor edit = MultiProcessMMKV.getMMKV("sdcard_usable_report").edit();
                long currentTimeMillis = System.currentTimeMillis();
                if (i == 0) {
                    try {
                        C28862c.m38403d();
                    } catch (Exception e) {
                        Exception exc = e;
                        Log.m105925i("MicroMsg.BatteryUtil", "checkIgnoreBatteryOptimizations() Exception:%s %s", exc.getClass().toString(), exc.getMessage());
                        z = true;
                    }
                    if (!z) {
                        edit.putLong("last_ignore_battery_dialog_time", currentTimeMillis);
                        edit.putInt("ignore_battery_dialog_time", 1);
                    }
                } else {
                    long j = MultiProcessMMKV.getMMKV("sdcard_usable_report").getLong("last_ignore_battery_dialog_time", currentTimeMillis);
                    long j2 = currentTimeMillis - j;
                    Log.m105925i("MicroMsg.BatteryUtil", "checkIgnoreBatteryOptimizations() last:%s diff:%s", Long.valueOf(j), Long.valueOf(j2));
                    if (i == 1) {
                        if (j2 >= 86400000) {
                            try {
                                C28862c.m38403d();
                            } catch (Exception e2) {
                                Exception exc2 = e2;
                                Log.m105925i("MicroMsg.BatteryUtil", "checkIgnoreBatteryOptimizations() Exception:%s %s", exc2.getClass().toString(), exc2.getMessage());
                                z = true;
                            }
                            if (!z) {
                                edit.putLong("last_ignore_battery_dialog_time", currentTimeMillis);
                                edit.putInt("ignore_battery_dialog_time", 2);
                            }
                        }
                    } else if (i == 2 && j2 >= FrequentLimiter.WEEK_MILLS) {
                        try {
                            C28862c.m38403d();
                        } catch (Exception e3) {
                            Exception exc3 = e3;
                            Log.m105925i("MicroMsg.BatteryUtil", "checkIgnoreBatteryOptimizations() Exception:%s %s", exc3.getClass().toString(), exc3.getMessage());
                            z = true;
                        }
                        if (!z) {
                            edit.putLong("last_ignore_battery_dialog_time", currentTimeMillis);
                            edit.putInt("ignore_battery_dialog_time", 3);
                        }
                    }
                }
                edit.commit();
            }
        }
    }
}
