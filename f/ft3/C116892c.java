package ft3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.lang.reflect.Method;

/* renamed from: ft3.c */
public final class C116892c {

    /* renamed from: ft3.c$a */
    public enum C116893a {
        CONN_WIFI,
        CONN_CMWAP,
        CONN_CMNET,
        CONN_NONE
    }

    /* renamed from: a */
    public static String m164881a(String str) {
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class});
            method.setAccessible(true);
            String str2 = (String) method.invoke((Object) null, new Object[]{str});
            return str2 == null ? "" : str2;
        } catch (Throwable th) {
            C116895f.m164892d("DeviceUtil", " getBuildPropByReflect: " + th);
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m164882b(boolean r6) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "DeviceUtil"
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = "/proc/version"
            r2.<init>(r3)     // Catch:{ all -> 0x0088 }
            java.io.BufferedReader r3 = new java.io.BufferedReader
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            r4.<init>(r2)
            r5 = 8192(0x2000, float:1.14794E-41)
            r3.<init>(r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
        L_0x001c:
            java.lang.String r5 = r3.readLine()     // Catch:{ all -> 0x003b }
            if (r5 == 0) goto L_0x0026
            r4.append(r5)     // Catch:{ all -> 0x003b }
            goto L_0x001c
        L_0x0026:
            r3.close()     // Catch:{ all -> 0x002a }
            goto L_0x002e
        L_0x002a:
            r3 = move-exception
            ft3.C116895f.m164889a(r1, r3)
        L_0x002e:
            r2.close()     // Catch:{ all -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r2 = move-exception
        L_0x0033:
            ft3.C116895f.m164889a(r1, r2)
        L_0x0036:
            java.lang.String r2 = r4.toString()
            goto L_0x004d
        L_0x003b:
            r5 = move-exception
            ft3.C116895f.m164889a(r1, r5)     // Catch:{ all -> 0x0076 }
            r3.close()     // Catch:{ all -> 0x0043 }
            goto L_0x0047
        L_0x0043:
            r3 = move-exception
            ft3.C116895f.m164889a(r1, r3)
        L_0x0047:
            r2.close()     // Catch:{ all -> 0x004b }
            goto L_0x0036
        L_0x004b:
            r2 = move-exception
            goto L_0x0033
        L_0x004d:
            if (r6 != 0) goto L_0x0051
            r0 = r2
            goto L_0x0075
        L_0x0051:
            if (r2 == 0) goto L_0x0075
            boolean r6 = r2.equals(r0)
            if (r6 != 0) goto L_0x0075
            java.lang.String r6 = "version "
            int r6 = r2.indexOf(r6)     // Catch:{ all -> 0x0071 }
            int r6 = r6 + 8
            java.lang.String r6 = r2.substring(r6)     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = " "
            int r2 = r6.indexOf(r2)     // Catch:{ all -> 0x0071 }
            r3 = 0
            java.lang.String r0 = r6.substring(r3, r2)     // Catch:{ all -> 0x0071 }
            goto L_0x0075
        L_0x0071:
            r6 = move-exception
            ft3.C116895f.m164889a(r1, r6)
        L_0x0075:
            return r0
        L_0x0076:
            r6 = move-exception
            r3.close()     // Catch:{ all -> 0x007b }
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            ft3.C116895f.m164889a(r1, r0)
        L_0x007f:
            r2.close()     // Catch:{ all -> 0x0083 }
            goto L_0x0087
        L_0x0083:
            r0 = move-exception
            ft3.C116895f.m164889a(r1, r0)
        L_0x0087:
            throw r6
        L_0x0088:
            r6 = move-exception
            ft3.C116895f.m164889a(r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ft3.C116892c.m164882b(boolean):java.lang.String");
    }

    /* renamed from: c */
    public static C116893a m164883c(Context context) {
        C116893a aVar = C116893a.CONN_NONE;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && (activeNetworkInfo.getState() == NetworkInfo.State.CONNECTING || activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED)) {
            if (activeNetworkInfo.getType() == 1) {
                return C116893a.CONN_WIFI;
            }
            if (activeNetworkInfo.getType() == 0) {
                return (Proxy.getDefaultHost() == null && Proxy.getHost(context) == null) ? C116893a.CONN_CMNET : C116893a.CONN_CMWAP;
            }
        }
        return aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|17|18|19|20) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005f */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0090 A[SYNTHETIC, Splitter:B:39:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0097 A[SYNTHETIC, Splitter:B:43:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m164884d(boolean r6) {
        /*
            if (r6 == 0) goto L_0x0007
            java.lang.String r6 = "/sys/block/mmcblk0/device/"
            java.lang.String r0 = "MMC"
            goto L_0x000b
        L_0x0007:
            java.lang.String r6 = "/sys/block/mmcblk1/device/"
            java.lang.String r0 = "SD"
        L_0x000b:
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0076 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x0076 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0076 }
            r4.<init>()     // Catch:{ all -> 0x0076 }
            r4.append(r6)     // Catch:{ all -> 0x0076 }
            java.lang.String r5 = "type"
            r4.append(r5)     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0076 }
            r3.<init>(r4)     // Catch:{ all -> 0x0076 }
            r2.<init>(r3)     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = r2.readLine()     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0067
            java.lang.String r3 = r3.toUpperCase()     // Catch:{ all -> 0x0072 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0067
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0072 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x0072 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r4.<init>()     // Catch:{ all -> 0x0072 }
            r4.append(r6)     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = "cid"
            r4.append(r6)     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0072 }
            r3.<init>(r6)     // Catch:{ all -> 0x0072 }
            r0.<init>(r3)     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = r0.readLine()     // Catch:{ all -> 0x0065 }
            if (r6 == 0) goto L_0x0063
            java.lang.String r6 = r6.trim()     // Catch:{ all -> 0x0065 }
            r2.close()     // Catch:{ IOException -> 0x005f }
        L_0x005f:
            r0.close()     // Catch:{ IOException -> 0x0062 }
        L_0x0062:
            return r6
        L_0x0063:
            r1 = r0
            goto L_0x0067
        L_0x0065:
            r6 = move-exception
            goto L_0x0074
        L_0x0067:
            r2.close()     // Catch:{ IOException -> 0x006b }
            goto L_0x006c
        L_0x006b:
        L_0x006c:
            if (r1 == 0) goto L_0x009a
            r1.close()     // Catch:{ IOException -> 0x009a }
            goto L_0x009a
        L_0x0072:
            r6 = move-exception
            r0 = r1
        L_0x0074:
            r1 = r2
            goto L_0x0078
        L_0x0076:
            r6 = move-exception
            r0 = r1
        L_0x0078:
            java.lang.String r2 = "DeviceUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009d }
            r3.<init>()     // Catch:{ all -> 0x009d }
            java.lang.String r4 = "getSDCid(): "
            r3.append(r4)     // Catch:{ all -> 0x009d }
            r3.append(r6)     // Catch:{ all -> 0x009d }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x009d }
            ft3.C116895f.m164892d(r2, r6)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0095
            r1.close()     // Catch:{ IOException -> 0x0094 }
            goto L_0x0095
        L_0x0094:
        L_0x0095:
            if (r0 == 0) goto L_0x009a
            r0.close()     // Catch:{ IOException -> 0x009a }
        L_0x009a:
            java.lang.String r6 = ""
            return r6
        L_0x009d:
            r6 = move-exception
            if (r1 == 0) goto L_0x00a5
            r1.close()     // Catch:{ IOException -> 0x00a4 }
            goto L_0x00a5
        L_0x00a4:
        L_0x00a5:
            if (r0 == 0) goto L_0x00aa
            r0.close()     // Catch:{ IOException -> 0x00aa }
        L_0x00aa:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ft3.C116892c.m164884d(boolean):java.lang.String");
    }

    /* renamed from: e */
    public static int m164885e() {
        try {
            return Integer.parseInt(Build.VERSION.SDK);
        } catch (Throwable th) {
            C116895f.m164892d("DeviceUtil", "getSDKVersion: " + th);
            return 0;
        }
    }
}
