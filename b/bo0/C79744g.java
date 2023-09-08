package bo0;

import android.net.wifi.WifiConfiguration;

/* renamed from: bo0.g */
public class C79744g {
    /* renamed from: a */
    public static int m96885a(WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            return 2;
        }
        if (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) {
            return 3;
        }
        return wifiConfiguration.wepKeys[0] != null ? 1 : 0;
    }

    /* renamed from: b */
    public static String m96886b(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        if (length <= 1 || str.charAt(0) != '\"') {
            return str;
        }
        int i = length - 1;
        return str.charAt(i) == '\"' ? str.substring(1, i) : str;
    }
}
