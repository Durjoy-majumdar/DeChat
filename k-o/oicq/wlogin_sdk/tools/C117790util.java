package oicq.wlogin_sdk.tools;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import androidx.exifinterface.media.ExifInterface;
import c24.C113237b;
import c24.C79920c;
import com.tencent.wxmm.v2encoder;
import j20.C117292a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.Key;
import java.security.KeyFactory;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import ob0.C117744o0;

/* renamed from: oicq.wlogin_sdk.tools.util */
public class C117790util {

    /* renamed from: a */
    public static int f352326a = 1;

    /* renamed from: b */
    public static C113237b f352327b;

    public static Key RSAPrivKeyFromJNI(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[26];
        bArr2[0] = 48;
        bArr2[1] = -126;
        bArr2[2] = 2;
        bArr2[3] = 117;
        bArr2[4] = 2;
        bArr2[5] = 1;
        bArr2[7] = 48;
        bArr2[8] = 13;
        bArr2[9] = 6;
        bArr2[10] = 9;
        bArr2[11] = ExifInterface.START_CODE;
        bArr2[12] = -122;
        bArr2[13] = 72;
        bArr2[14] = -122;
        bArr2[15] = -9;
        bArr2[16] = 13;
        bArr2[17] = 1;
        bArr2[18] = 1;
        bArr2[19] = 1;
        bArr2[20] = 5;
        bArr2[22] = 4;
        bArr2[23] = -126;
        bArr2[24] = 2;
        bArr2[25] = 95;
        int length = bArr.length - 607;
        bArr2[3] = (byte) (117 + length);
        bArr2[25] = (byte) (95 + length);
        byte[] bArr3 = new byte[(bArr.length + 26)];
        System.arraycopy(bArr2, 0, bArr3, 0, 26);
        System.arraycopy(bArr, 0, bArr3, 26, bArr.length);
        try {
            return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr3));
        } catch (Exception e) {
            m166197s(e);
            return null;
        }
    }

    public static Key RSAPubKeyFromJNI(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[22];
        bArr2[0] = 48;
        boolean z = true;
        bArr2[1] = -127;
        bArr2[2] = -97;
        bArr2[3] = 48;
        bArr2[4] = 13;
        bArr2[5] = 6;
        bArr2[6] = 9;
        bArr2[7] = ExifInterface.START_CODE;
        bArr2[8] = -122;
        bArr2[9] = 72;
        bArr2[10] = -122;
        bArr2[11] = -9;
        bArr2[12] = 13;
        bArr2[13] = 1;
        bArr2[14] = 1;
        bArr2[15] = 1;
        bArr2[16] = 5;
        bArr2[18] = 3;
        bArr2[19] = -127;
        bArr2[20] = -115;
        byte[] bArr3 = new byte[(bArr.length + 22)];
        if (bArr.length >= 22) {
            int i = 0;
            while (true) {
                if (i >= 22) {
                    break;
                } else if (bArr2[i] != bArr[i]) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z) {
            System.arraycopy(bArr2, 0, bArr3, 0, 22);
            System.arraycopy(bArr, 0, bArr3, 22, bArr.length);
            bArr = bArr3;
        }
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
        } catch (Exception e) {
            m166197s(e);
            return null;
        }
    }

    /* renamed from: a */
    public static void m166179a(String str) {
        C113237b bVar;
        try {
            if (f352326a >= 2 && (bVar = f352327b) != null) {
                ((C117744o0.C117745a) bVar).mo165786a(2, "", str);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m166180b(String str, String str2) {
        C113237b bVar;
        try {
            if (f352326a >= 2 && (bVar = f352327b) != null) {
                bVar.mo165786a(2, str, str2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public static void m166181c(String str) {
        C113237b bVar;
        try {
            if (f352326a >= 1 && (bVar = f352327b) != null) {
                ((C117744o0.C117745a) bVar).mo165786a(1, "", str);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static void m166182d(String str, String str2) {
        C113237b bVar;
        try {
            if (f352326a >= 0 && (bVar = f352327b) != null) {
                bVar.mo165786a(0, str, str2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static long m166183e(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return (long) bArr.length;
    }

    /* renamed from: f */
    public static int m166184f(byte[] bArr, int i) {
        return ((bArr[i] << 8) & 65280) + ((bArr[i + 1] << 0) & 255);
    }

    /* renamed from: g */
    public static int m166185g(byte[] bArr, int i) {
        return ((bArr[i] << 24) & -16777216) + ((bArr[i + 1] << v2encoder.enumCODEC_vcodec2) & 16711680) + ((bArr[i + 2] << 8) & 65280) + ((bArr[i + 3] << 0) & 255);
    }

    /* renamed from: h */
    public static String m166186h(byte[] bArr) {
        String str = "";
        if (bArr == null) {
            return str;
        }
        for (int i = 0; i < bArr.length; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(String.valueOf(str) + Integer.toHexString((bArr[i] >> 4) & 15)));
            sb.append(Integer.toHexString(bArr[i] & 15));
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: i */
    public static byte[] m166187i(Context context) {
        WifiInfo wifiInfo;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String str = null;
        String str2 = telephonyManager != null ? (String) C117292a.m165363i(telephonyManager, "oicq/wlogin_sdk/tools/util", "get_IMEI", "(Landroid/content/Context;)[B", "android/telephony/TelephonyManager", "getDeviceId", "()Ljava/lang/String;") : null;
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (!(wifiManager == null || (wifiInfo = (WifiInfo) C117292a.m165363i(wifiManager, "oicq/wlogin_sdk/tools/util", "get_IMEI", "(Landroid/content/Context;)[B", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;")) == null)) {
            str = wifiInfo.getMacAddress();
        }
        String str3 = "";
        if (str2 != null) {
            str3 = str3 + str2;
        }
        if (str != null) {
            str3 = String.valueOf(str3) + str;
        }
        return str3.length() <= 0 ? new byte[0] : C79920c.m97091l(str3.getBytes());
    }

    /* renamed from: j */
    public static byte m166188j(byte b) {
        int i;
        if (b < 48 || b > 57) {
            byte b2 = 97;
            if (b < 97 || b > 102) {
                b2 = 65;
                if (b < 65 || b > 70) {
                    return 0;
                }
            }
            i = (b - b2) + 10;
        } else {
            i = b - 48;
        }
        return (byte) i;
    }

    /* renamed from: k */
    public static byte[] m166189k(Context context) {
        byte[] bytes = new String("").getBytes();
        try {
            bytes = m166199u(context.getSharedPreferences("WLOGIN_DEVICE_INFO", 0).getString("ksid", new String("")));
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter, true);
            e.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            m166182d("exception", stringWriter.toString());
        }
        if (bytes == null || bytes.length <= 0) {
            m166179a("get_ksid:null");
        } else {
            m166179a("get_ksid:" + m166186h(bytes));
        }
        return bytes;
    }

    /* renamed from: l */
    public static int m166190l(Context context) {
        int i;
        try {
            i = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().getType();
        } catch (Exception unused) {
            i = 0;
        }
        if (i == 0) {
            return 1;
        }
        return i == 1 ? 2 : 0;
    }

    /* renamed from: m */
    public static int m166191m() {
        return (int) (Math.random() * 2.147483647E9d);
    }

    /* renamed from: n */
    public static byte[] m166192n(Context context) {
        byte[] bArr = new byte[0];
        try {
            bArr = m166199u(context.getSharedPreferences("WLOGIN_DEVICE_INFO", 0).getString("imei", new String("")));
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter, true);
            e.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            m166182d("exception", stringWriter.toString());
        }
        if (bArr.length <= 0) {
            return new byte[0];
        }
        m166179a("get_imei:" + m166186h(bArr));
        return bArr;
    }

    /* renamed from: o */
    public static void m166193o(byte[] bArr, int i, int i2) {
        bArr[i + 1] = (byte) (i2 >> 0);
        bArr[i + 0] = (byte) (i2 >> 8);
    }

    /* renamed from: p */
    public static void m166194p(byte[] bArr, int i, int i2) {
        bArr[i + 3] = (byte) (i2 >> 0);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 0] = (byte) (i2 >> 24);
    }

    /* renamed from: q */
    public static void m166195q(byte[] bArr, int i, long j) {
        bArr[i + 7] = (byte) ((int) (j >> 0));
        bArr[i + 6] = (byte) ((int) (j >> 8));
        bArr[i + 5] = (byte) ((int) (j >> 16));
        bArr[i + 4] = (byte) ((int) (j >> 24));
        bArr[i + 3] = (byte) ((int) (j >> 32));
        bArr[i + 2] = (byte) ((int) (j >> 40));
        bArr[i + 1] = (byte) ((int) (j >> 48));
        bArr[i + 0] = (byte) ((int) (j >> 56));
    }

    /* renamed from: r */
    public static void m166196r(byte[] bArr, int i, long j) {
        bArr[i + 3] = (byte) ((int) (j >> 0));
        bArr[i + 2] = (byte) ((int) (j >> 8));
        bArr[i + 1] = (byte) ((int) (j >> 16));
        bArr[i + 0] = (byte) ((int) (j >> 24));
    }

    /* renamed from: s */
    public static void m166197s(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter, true);
        exc.printStackTrace(printWriter);
        printWriter.flush();
        stringWriter.flush();
        m166182d("exception:", stringWriter.toString());
    }

    /* renamed from: t */
    public static void m166198t(Context context, byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            SharedPreferences.Editor edit = context.getSharedPreferences("WLOGIN_DEVICE_INFO", 0).edit();
            edit.putString("imei", m166186h(bArr));
            edit.commit();
        }
    }

    /* renamed from: u */
    public static byte[] m166199u(String str) {
        if (str == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < str.length() / 2; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((m166188j((byte) str.charAt(i2)) << 4) + m166188j((byte) str.charAt(i2 + 1)));
        }
        return bArr;
    }
}
