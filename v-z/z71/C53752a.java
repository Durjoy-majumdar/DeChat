package z71;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Set;

/* renamed from: z71.a */
public final class C53752a {
    /* renamed from: a */
    public static boolean m60247a(String str, long j) {
        String str2;
        Log.m105925i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "addToSharedPreferences, key = %s, deviceId = %d", str, Long.valueOf(j));
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
            return false;
        }
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("exdevice_pref", 0);
        if (sharedPreferences == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
            return false;
        }
        m60251e(sharedPreferences);
        String str3 = j + "";
        String string = sharedPreferences.getString(str, new String());
        Log.m105925i("MicroMsg.exdevice.Util", "addDeviceToDeviceList, device = %s, device list = %s", str3, string);
        if (Util.isNullOrNil(str3) || string == null) {
            Log.m105920e("MicroMsg.exdevice.Util", "Error parameters!!!");
            str2 = null;
        } else {
            str2 = ((new String() + string) + str3) + "|";
            Log.m105925i("MicroMsg.exdevice.Util", "add device to device list successful, new device list = %s", str2);
        }
        if (str2 == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "addDeviceToDeviceList failed!!!");
            return false;
        } else if (!sharedPreferences.edit().putString(str, str2).commit()) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "sp.edit().putString().commit() Failed!!!");
            return false;
        } else {
            Log.m105925i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "add to sharepreference successful, new device list is %s", str2);
            return true;
        }
    }

    /* renamed from: b */
    public static long[] m60248b(String str) {
        int i;
        Exception e;
        Log.m105925i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "getListFromSharedPreferences, key = %s", str);
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
            return null;
        }
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("exdevice_pref", 0);
        if (sharedPreferences == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
            return null;
        }
        m60251e(sharedPreferences);
        try {
            String[] split = sharedPreferences.getString(str, new String()).split("\\|");
            if (split == null || split.length == 0) {
                Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == strDeviceList || 0 == strDeviceList.length");
                return null;
            }
            long[] jArr = new long[split.length];
            int length = split.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                String str2 = split[i2];
                try {
                    Log.m105925i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "parse %s to long", str2);
                    if (str2.length() == 0) {
                        i2++;
                    } else {
                        i = i3 + 1;
                        try {
                            jArr[i3] = Util.getLong(str2, 0);
                        } catch (Exception e2) {
                            e = e2;
                        }
                        i3 = i;
                        i2++;
                    }
                } catch (Exception e3) {
                    i = i3;
                    e = e3;
                    Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "try pase string device id to long failed : " + e.getMessage());
                    i3 = i;
                    i2++;
                }
            }
            if (i3 == 0) {
                return null;
            }
            return jArr;
        } catch (Exception e4) {
            Log.m105921e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "split failed!!!, %s", e4.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m60249c(String str, long j) {
        boolean z;
        Log.m105925i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "isItemInSharedPreferences, key = %s, device id = %d", str, Long.valueOf(j));
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
            return false;
        }
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("exdevice_pref", 0);
        if (sharedPreferences == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
            return false;
        }
        m60251e(sharedPreferences);
        String str2 = j + "";
        String string = sharedPreferences.getString(str, new String());
        Log.m105925i("MicroMsg.exdevice.Util", "isDeviceInDeviceList, device = %s, device list = %s", str2, string);
        if (!Util.isNullOrNil(str2) && !Util.isNullOrNil(string)) {
            try {
                String[] split = string.split("\\|");
                if (split != null) {
                    int length = split.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (split[i].equalsIgnoreCase(str2)) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                } else {
                    Log.m105920e("MicroMsg.exdevice.Util", "null == deviceArray");
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.exdevice.Util", "aDeviceList.split failed, %s", e.getMessage());
            }
        }
        z = false;
        return z;
    }

    /* renamed from: d */
    public static boolean m60250d(String str, long j) {
        Log.m105925i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "removeFromSharedPreferences, key = %s, deviceId = %d", str, Long.valueOf(j));
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
            return false;
        }
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("exdevice_pref", 0);
        if (sharedPreferences == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
            return false;
        }
        m60251e(sharedPreferences);
        String str2 = j + "";
        String string = sharedPreferences.getString(str, new String());
        Log.m105925i("MicroMsg.exdevice.Util", "moveDevicefromDeviceList, device = %s, device list = %s", str2, string);
        String str3 = null;
        if (Util.isNullOrNil(str2) || Util.isNullOrNil(string)) {
            Log.m105928w("MicroMsg.exdevice.Util", "parameters is null or nil");
        } else {
            try {
                String[] split = string.split("\\|");
                if (split == null) {
                    Log.m105920e("MicroMsg.exdevice.Util", "null == strArray");
                } else {
                    String str4 = new String();
                    boolean z = false;
                    for (String str5 : split) {
                        if (!str5.equalsIgnoreCase(str2)) {
                            str4 = (str4 + str5) + "|";
                        } else {
                            z = true;
                        }
                    }
                    if (!z) {
                        Log.m105920e("MicroMsg.exdevice.Util", "remove failed!!!, this device is not in the list");
                    } else {
                        Log.m105925i("MicroMsg.exdevice.Util", "add device to device list successful, new device list = %s", string);
                        str3 = str4;
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.exdevice.Util", "aDeviceList.split failed!!!, %s", e.getMessage());
            }
        }
        if (str3 == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "remove device from device list failed!!!");
            return false;
        }
        if (!(str3.length() == 0 ? sharedPreferences.edit().remove(str).commit() : sharedPreferences.edit().putString(str, str3).commit())) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "sp.edit().putString().commit()");
            return false;
        }
        Log.m105925i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "remove from sharepreference successful, new device list is %s", str3);
        return true;
    }

    /* renamed from: e */
    public static void m60251e(SharedPreferences sharedPreferences) {
        Log.m105924i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "tryToClearDirtyData");
        if (sharedPreferences == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == aSP");
            return;
        }
        String[] strArr = {"conneted_device", "shut_down_device"};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            try {
                if (sharedPreferences.getStringSet(str, (Set) null) != null) {
                    Log.m105925i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "find dirty data, remove it, key = %s", str);
                    if (!sharedPreferences.edit().remove(str).commit()) {
                        Log.m105920e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "remove dirty data failed!!!");
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
