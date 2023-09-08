package com.tencent.youtu.ytcommon.auth;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.tencent.xweb.file.XVFSFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StatisticsUtils {
    private StatisticsUtils() {
    }

    private static String encryptUid(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            sb.append(charAt + (charAt % length));
        }
        sb.reverse();
        return sb.toString();
    }

    private static char getChar(byte b, int i) {
        return (char) (b - getOffset(i & 1));
    }

    public static String getDeviceUid(Context context) {
        if (context.getPackageName().startsWith("com.tencent")) {
            return "com.tencent";
        }
        String imei = getIMEI(context.getApplicationContext());
        String macAddr = getMacAddr(context.getApplicationContext());
        boolean z = !TextUtils.isEmpty(macAddr);
        String str = "";
        if (z) {
            macAddr = macAddr.replaceAll(XVFSFile.PATH_SEPARATOR, str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(imei);
        if (z) {
            str = macAddr;
        }
        sb.append(str);
        return toMD5(encryptUid(sb.toString()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r2 = (android.telephony.TelephonyManager) r2.getApplicationContext().getSystemService("phone");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getIMEI(android.content.Context r2) {
        /*
            android.content.ContentResolver r0 = r2.getContentResolver()
            java.lang.String r1 = "android_id"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0023
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            if (r2 == 0) goto L_0x0023
            java.lang.String r0 = r2.getDeviceId()
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.ytcommon.auth.StatisticsUtils.getIMEI(android.content.Context):java.lang.String");
    }

    public static String getMacAddr(Context context) {
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        if (context == null || (wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi")) == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return null;
        }
        return connectionInfo.getMacAddress();
    }

    private static byte getOffset(int i) {
        return (byte) (i == 0 ? 65 : 97);
    }

    public static String toMD5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(str.getBytes());
            String bigInteger = new BigInteger(1, instance.digest()).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
