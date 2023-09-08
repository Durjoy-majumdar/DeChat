package pv2;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import lt3.C21460a;
import ot3.C117897l;

/* renamed from: pv2.i */
public class C110259i {
    /* renamed from: a */
    public static C110260j m149874a() {
        m149876c();
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath());
        if (mmkv == null) {
            return new C110260j();
        }
        String string = mmkv.getString("cpu_id", "");
        String string2 = mmkv.getString("uid", "");
        if (Util.isNullOrNil(string) || Util.isNullOrNil(string2)) {
            Log.m105928w("MicroMsg.SoterDeviceInfoManager", "hy: no cpu id and uid retrieved. load again");
            C117897l c = C21460a.m24269c();
            if (c != null) {
                String str = c.f352426c;
                String valueOf = String.valueOf(c.f352425b);
                if (!Util.isNullOrNil(str) && !Util.isNullOrNil(valueOf)) {
                    m149875b(str, valueOf);
                    return new C110260j(str, valueOf);
                }
            }
            return new C110260j();
        }
        Log.m105924i("MicroMsg.SoterDeviceInfoManager", "hy:device info exists in preference. directly return");
        return new C110260j(string, string2);
    }

    /* renamed from: b */
    public static void m149875b(String str, String str2) {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath());
        if (mmkv != null) {
            SharedPreferences.Editor edit = mmkv.edit();
            edit.putString("cpu_id", str);
            edit.putString("uid", str2);
            edit.commit();
            Log.m105924i("MicroMsg.SoterDeviceInfoManager", "hy: save device info");
        }
    }

    /* renamed from: c */
    public static void m149876c() {
        SharedPreferences defaultPreference;
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath());
        String string = mmkv.getString("cpu_id", (String) null);
        String string2 = mmkv.getString("uid", (String) null);
        if ((Util.isNullOrNil(string) || Util.isNullOrNil(string2)) && (defaultPreference = MMApplicationContext.getDefaultPreference()) != null) {
            String string3 = defaultPreference.getString("cpu_id", (String) null);
            String string4 = defaultPreference.getString("uid", (String) null);
            Log.m105925i("MicroMsg.SoterDeviceInfoManager", "transfer old cpuId: %s, old uid: %s", string, string2);
            mmkv.putString("cpu_id", string3);
            mmkv.putString("uid", string4);
            mmkv.commit();
        }
    }
}
