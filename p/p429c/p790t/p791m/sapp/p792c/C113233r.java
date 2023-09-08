package p429c.p790t.p791m.sapp.p792c;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.map.geolocation.sapp.TencentLocationManager;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: c.t.m.sapp.c.r */
public class C113233r {

    /* renamed from: a */
    public static final Object f338822a = new Object();

    /* renamed from: b */
    public static String f338823b = "TencentLocation_sapp/comp";

    /* renamed from: c */
    public static String f338824c = "TencentLocation_sapp/odex";

    /* renamed from: d */
    public static String f338825d = "complist_loading_sapp";

    /* renamed from: e */
    public static long f338826e = 0;

    /* renamed from: f */
    public static String f338827f = "01234567890ABCDEF";

    /* renamed from: g */
    public static String f338828g = "key-locselfid";

    /* renamed from: h */
    public static String f338829h = "key-locoutid";

    /* renamed from: i */
    public static String f338830i = "01234567890ABCDEF";

    /* renamed from: j */
    public static HashMap<String, C79911s> f338831j = new HashMap<>();

    /* renamed from: a */
    public static double m154987a(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    /* renamed from: a */
    public static C79911s m154989a(Context context, String str) {
        if (f338831j.containsKey(str)) {
            return f338831j.get(str);
        }
        C79911s sVar = new C79911s(context.getFilesDir().getAbsolutePath() + "/TencentLocation_sapp/conf/" + str);
        f338831j.put(str, sVar);
        return sVar;
    }

    /* renamed from: b */
    public static boolean m155008b(Context context, String str, Long l) {
        return m154989a(context, str).mo110073a(String.valueOf(l).getBytes(), false);
    }

    /* renamed from: c */
    public static String m155014c(Context context, String str, String str2) {
        return m154989a(context, str).mo110072a(str2);
    }

    /* renamed from: d */
    public static boolean m155020d(Context context, String str, String str2) {
        return m154989a(context, str).mo110073a(str2.getBytes(), false);
    }

    /* renamed from: e */
    public static String m155021e() {
        try {
            return Build.MANUFACTURER.replaceAll("[_]", "");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0035 A[SYNTHETIC, Splitter:B:24:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x007f  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m155024f(android.content.Context r9) {
        /*
            java.lang.String r0 = "gps"
            if (r9 != 0) goto L_0x0006
            r9 = -1
            return r9
        L_0x0006:
            boolean r1 = m155030j(r9)
            java.lang.String r2 = "wifi"
            r3 = 1
            r4 = 0
            java.lang.Object r2 = r9.getSystemService(r2)     // Catch:{ all -> 0x0028 }
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0025
            boolean r5 = r2.isWifiEnabled()     // Catch:{ all -> 0x0028 }
            boolean r2 = r2.isScanAlwaysAvailable()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0022
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            r6 = 1
            goto L_0x002b
        L_0x0025:
            r2 = 0
            r5 = 0
            goto L_0x002a
        L_0x0028:
            r5 = 0
        L_0x0029:
            r2 = 0
        L_0x002a:
            r6 = 0
        L_0x002b:
            java.lang.String r7 = "location"
            java.lang.Object r7 = r9.getSystemService(r7)     // Catch:{ Exception -> 0x0054 }
            android.location.LocationManager r7 = (android.location.LocationManager) r7     // Catch:{ Exception -> 0x0054 }
            if (r7 == 0) goto L_0x0054
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch:{ all -> 0x0040 }
            java.lang.String r8 = "location_mode"
            int r9 = android.provider.Settings.Secure.getInt(r9, r8)     // Catch:{ all -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r9 = 0
        L_0x0041:
            boolean r8 = r7.isProviderEnabled(r0)     // Catch:{ Exception -> 0x0055 }
            java.util.List r7 = r7.getAllProviders()     // Catch:{ Exception -> 0x0055 }
            if (r7 != 0) goto L_0x004c
            goto L_0x0051
        L_0x004c:
            boolean r0 = r7.contains(r0)     // Catch:{ Exception -> 0x0055 }
            r4 = r0
        L_0x0051:
            r0 = r4
            r4 = r8
            goto L_0x0056
        L_0x0054:
            r9 = 0
        L_0x0055:
            r0 = 0
        L_0x0056:
            r1 = r1 ^ r3
            if (r5 != 0) goto L_0x005b
            int r1 = r1 + 2
        L_0x005b:
            if (r4 != 0) goto L_0x005f
            int r1 = r1 + 4
        L_0x005f:
            if (r6 != 0) goto L_0x0063
            int r1 = r1 + 8
        L_0x0063:
            if (r0 != 0) goto L_0x0067
            int r1 = r1 + 16
        L_0x0067:
            if (r2 != 0) goto L_0x006b
            int r1 = r1 + 32
        L_0x006b:
            if (r9 == 0) goto L_0x007f
            if (r9 == r3) goto L_0x007c
            r0 = 2
            if (r9 == r0) goto L_0x0079
            r0 = 3
            if (r9 == r0) goto L_0x0076
            goto L_0x0081
        L_0x0076:
            int r1 = r1 + 512
            goto L_0x0081
        L_0x0079:
            int r1 = r1 + 256
            goto L_0x0081
        L_0x007c:
            int r1 = r1 + 128
            goto L_0x0081
        L_0x007f:
            int r1 = r1 + 64
        L_0x0081:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p429c.p790t.p791m.sapp.p792c.C113233r.m155024f(android.content.Context):int");
    }

    /* renamed from: f */
    public static String m155025f() {
        return "";
    }

    /* renamed from: g */
    public static int m155026g() {
        return Process.myPid();
    }

    /* renamed from: h */
    public static String m155028h(Context context) {
        return context.getFilesDir().getAbsolutePath() + File.separator + f338824c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = r1.getActiveNetworkInfo();
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m155029i(android.content.Context r1) {
        /*
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x0018 }
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch:{ Exception -> 0x0018 }
            if (r1 == 0) goto L_0x0018
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch:{ Exception -> 0x0018 }
            if (r1 == 0) goto L_0x0018
            int r1 = r1.getType()     // Catch:{ Exception -> 0x0018 }
            r0 = 1
            if (r1 != r0) goto L_0x0018
            return r0
        L_0x0018:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p429c.p790t.p791m.sapp.p792c.C113233r.m155029i(android.content.Context):boolean");
    }

    /* renamed from: j */
    public static boolean m155030j(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null && telephonyManager.getSimState() == 5;
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    public static String m155031k(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                if (bundle.containsKey("TencentGeoLocationSDK")) {
                    return bundle.getString("TencentGeoLocationSDK");
                }
                if (bundle.containsKey("TencentMapSDK")) {
                    return bundle.getString("TencentMapSDK");
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* renamed from: e */
    public static String m155022e(Context context) {
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static String m155027g(Context context) {
        try {
            String str = f338827f;
            if (str != null && str.length() != 0 && !"01234567890ABCDEF".equals(f338827f)) {
                return f338827f;
            }
            String a = C79909m.m97058a(m155007b(context, "LocationSDK", "_col_ooo_"));
            if (!"01234567890ABCDEF".equals(a)) {
                if (!"".equals(a)) {
                    f338827f = a;
                    return a;
                }
            }
            String b = m155007b(context, "TLocationSDK", f338829h);
            if (!"01234567890ABCDEF".equals(b)) {
                f338827f = b;
                return b;
            }
            String b2 = m155007b(context, "TLocationSDK", f338828g);
            if (!"01234567890ABCDEF".equals(b2)) {
                f338827f = b2;
                return b2;
            }
            String b3 = m155007b(context, "LocationSDK", "loc_id_LocCommId");
            f338827f = b3;
            return b3;
        } catch (Throwable unused) {
            f338827f = "01234567890ABCDEF";
            return "01234567890ABCDEF";
        }
    }

    /* renamed from: c */
    public static String m155013c(Context context) {
        return context.getFilesDir().getAbsolutePath() + File.separator + f338823b;
    }

    /* renamed from: d */
    public static String m155018d(Context context) {
        String e = m155022e(context);
        return e == null ? m155012c() : e;
    }

    /* renamed from: b */
    public static String m155005b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str = packageInfo.versionName;
            int i = packageInfo.versionCode;
            if (str != null) {
                if (str.trim().length() > 0) {
                    return str;
                }
            }
            return "" + i;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m155012c() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("/proc/");
            sb.append(Process.myPid());
            sb.append("/cmdline");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(sb.toString())));
            String trim = bufferedReader.readLine().trim();
            bufferedReader.close();
            return trim;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static long m155017d() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static Long m154990a(Context context, String str, Long l) {
        try {
            return Long.valueOf(Long.parseLong(m154989a(context, str).mo110072a(String.valueOf(l))));
        } catch (Exception unused) {
            return l;
        }
    }

    /* renamed from: c */
    public static String m155015c(String str) {
        try {
            return m154993a(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: e */
    public static List<C113220a> m155023e(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String split : str.split(";")) {
                String[] split2 = split.split(",");
                if (split2.length >= 5) {
                    try {
                        C113220a aVar = new C113220a();
                        aVar.f338770a = Integer.valueOf(split2[0]).intValue();
                        aVar.f338771b = split2[1];
                        aVar.f338772c = split2[2];
                        aVar.f338773d = Integer.valueOf(split2[3]).intValue();
                        aVar.f338774e = split2[4];
                        if (split2.length > 5) {
                            aVar.f338775f = split2[5];
                        }
                        arrayList.add(aVar);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m154995a() {
        long currentTimeMillis = System.currentTimeMillis();
        f338823b = "TencentLocation/comp";
        f338824c = "TencentLocation/odex";
        f338823b += "_atuo_" + currentTimeMillis;
        f338824c += "_atuo_" + currentTimeMillis;
    }

    /* renamed from: d */
    public static String m155019d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("status");
            C113223e b = C113223e.m154940b();
            b.mo165758a("DRG", "statucode:" + string);
            if (string.equals("-3")) {
                return null;
            }
            if (string.equals("0")) {
                JSONArray jSONArray = jSONObject.getJSONArray("compList");
                String str2 = "";
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    int i2 = jSONObject2.getInt("compId");
                    String string2 = jSONObject2.getString("compVer");
                    String string3 = jSONObject2.getString("md5");
                    int i3 = jSONObject2.getInt("size");
                    String string4 = jSONObject2.getString("compName");
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(i2);
                    sb.append(",");
                    sb.append(string2);
                    sb.append(",");
                    sb.append(string4);
                    sb.append(",");
                    sb.append(i3);
                    sb.append(",");
                    sb.append(string3);
                    sb.append(",;");
                    str2 = sb.toString();
                }
                return str2;
            } else if (string.equals("-1")) {
                return null;
            } else {
                if (string.equals("-2")) {
                    return null;
                }
                if (string.equals("-4")) {
                    return null;
                }
                string.equals("-5");
                return null;
            }
        } catch (Exception e) {
            C113223e b2 = C113223e.m154940b();
            b2.mo165758a("DRG", "statucode:" + e.toString());
            return null;
        }
    }

    /* renamed from: b */
    public static int m155004b() {
        return Build.VERSION.SDK_INT;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.util.zip.GZIPInputStream} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0084, code lost:
        if (r1 == null) goto L_0x0089;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0057 A[SYNTHETIC, Splitter:B:37:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x005c A[Catch:{ Exception -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0061 A[Catch:{ Exception -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x006b A[SYNTHETIC, Splitter:B:48:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0070 A[Catch:{ Exception -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0075 A[Catch:{ Exception -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x007c A[Catch:{ Exception -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0081 A[Catch:{ Exception -> 0x0089 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m155016c(byte[] r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x0089
            int r1 = r7.length
            if (r1 != 0) goto L_0x0008
            goto L_0x0089
        L_0x0008:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0076, Error -> 0x0065, all -> 0x0052 }
            r1.<init>()     // Catch:{ Exception -> 0x0076, Error -> 0x0065, all -> 0x0052 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x004e, Error -> 0x004a, all -> 0x0047 }
            r2.<init>(r7)     // Catch:{ Exception -> 0x004e, Error -> 0x004a, all -> 0x0047 }
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x0044, Error -> 0x0041, all -> 0x003f }
            r7.<init>(r2)     // Catch:{ Exception -> 0x0044, Error -> 0x0041, all -> 0x003f }
            r3 = 307200(0x4b000, float:4.30479E-40)
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x003d, Error -> 0x003b, all -> 0x0036 }
        L_0x001c:
            int r4 = r7.read(r3)     // Catch:{ Exception -> 0x003d, Error -> 0x003b, all -> 0x0036 }
            if (r4 < 0) goto L_0x0027
            r5 = 0
            r1.write(r3, r5, r4)     // Catch:{ Exception -> 0x003d, Error -> 0x003b, all -> 0x0036 }
            goto L_0x001c
        L_0x0027:
            byte[] r0 = r1.toByteArray()     // Catch:{ Exception -> 0x003d, Error -> 0x003b, all -> 0x0036 }
            r7.close()     // Catch:{ Exception -> 0x0089 }
            r2.close()     // Catch:{ Exception -> 0x0089 }
            r1.close()     // Catch:{ Exception -> 0x0089 }
            goto L_0x0089
        L_0x0036:
            r0 = move-exception
            r6 = r0
            r0 = r7
            r7 = r6
            goto L_0x0055
        L_0x003b:
            goto L_0x0069
        L_0x003d:
            goto L_0x007a
        L_0x003f:
            r7 = move-exception
            goto L_0x0055
        L_0x0041:
            r7 = r0
            goto L_0x0069
        L_0x0044:
            r7 = r0
            goto L_0x007a
        L_0x0047:
            r7 = move-exception
            r2 = r0
            goto L_0x0055
        L_0x004a:
            r7 = r0
            r2 = r7
            goto L_0x0069
        L_0x004e:
            r7 = r0
            r2 = r7
            goto L_0x007a
        L_0x0052:
            r7 = move-exception
            r1 = r0
            r2 = r1
        L_0x0055:
            if (r0 == 0) goto L_0x005a
            r0.close()     // Catch:{ Exception -> 0x0064 }
        L_0x005a:
            if (r2 == 0) goto L_0x005f
            r2.close()     // Catch:{ Exception -> 0x0064 }
        L_0x005f:
            if (r1 == 0) goto L_0x0064
            r1.close()     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            throw r7
        L_0x0065:
            r7 = r0
            r1 = r7
            r2 = r1
        L_0x0069:
            if (r7 == 0) goto L_0x006e
            r7.close()     // Catch:{ Exception -> 0x0089 }
        L_0x006e:
            if (r2 == 0) goto L_0x0073
            r2.close()     // Catch:{ Exception -> 0x0089 }
        L_0x0073:
            if (r1 == 0) goto L_0x0089
            goto L_0x0086
        L_0x0076:
            r7 = r0
            r1 = r7
            r2 = r1
        L_0x007a:
            if (r7 == 0) goto L_0x007f
            r7.close()     // Catch:{ Exception -> 0x0089 }
        L_0x007f:
            if (r2 == 0) goto L_0x0084
            r2.close()     // Catch:{ Exception -> 0x0089 }
        L_0x0084:
            if (r1 == 0) goto L_0x0089
        L_0x0086:
            r1.close()     // Catch:{ Exception -> 0x0089 }
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p429c.p790t.p791m.sapp.p792c.C113233r.m155016c(byte[]):byte[]");
    }

    /* renamed from: b */
    public static String m155007b(Context context, String str, String str2) {
        try {
            if (C67332q.f193174b == null) {
                C67332q.f193174b = context;
            }
            return (String) C67332q.m79669a(str, str2, (Object) "01234567890ABCDEF");
        } catch (Throwable unused) {
            return "01234567890ABCDEF";
        }
    }

    /* renamed from: a */
    public static void m154997a(Context context) {
        if (context != null) {
            File[] listFiles = new File(context.getFilesDir().getAbsolutePath() + "/TencentLocation").listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : listFiles) {
                    String name = file.getName();
                    if (file.isDirectory() && name.contains("_atuo_") && !f338823b.contains(name)) {
                        m155010b(file.getAbsolutePath());
                        file.delete();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static byte[] m155011b(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable unused) {
                return byteArray;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m155010b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        String[] list = file.list();
        if (!(list == null || list.length == 0)) {
            for (String file2 : list) {
                File file3 = new File(str, file2);
                if (file3.isDirectory()) {
                    m155010b(file3.getAbsolutePath());
                    file3.delete();
                } else {
                    file3.delete();
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static List<String> m154994a(Context context, File file) {
        ArrayList arrayList;
        File[] listFiles;
        String str = "";
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (File file2 : listFiles) {
                arrayList.add(file2.getName() + "," + file2.length() + "," + m154991a(file2));
                str = str + file2.getName() + "," + file2.length() + "," + m154991a(file2) + ";";
            }
        }
        C113229j.m154971a("before check ,private dir files:" + str);
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m155009b(Context context, String str, String str2, String str3, long j, byte[] bArr) {
        String str4 = str2 + File.separator + str3;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str4);
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    fileInputStream.close();
                    return true;
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m154998a(Context context, Pair<String, String> pair) {
        Object obj;
        try {
            if (TencentLocationManager.TYPE_OAID.equals(pair.first) && (obj = pair.second) != null && ((String) obj).length() > 0) {
                Object obj2 = pair.second;
                f338830i = (String) obj2;
                m154999a(context, f338829h, (String) obj2);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m154999a(Context context, String str, String str2) {
        try {
            if (C67332q.f193174b == null) {
                C67332q.f193174b = context;
            }
            C67332q.m79671b("TLocationSDK", str, (Object) str2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static String m154991a(File file) {
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return m154993a(instance.digest());
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m155006b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            InputStream open = context.getAssets().open(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            open.close();
        } catch (IOException | UnsupportedEncodingException unused) {
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m154993a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & ExifInterface.MARKER);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString().toLowerCase();
    }

    /* renamed from: a */
    public static void m154996a(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: a */
    public static byte[] m155003a(int i) {
        byte[] bArr = new byte[2];
        for (int i2 = 0; i2 < 2; i2++) {
            bArr[i2] = Integer.valueOf(i & 255).byteValue();
            i >>= 8;
        }
        return bArr;
    }

    /* renamed from: a */
    public static String m154992a(List<C113220a> list) {
        StringBuilder sb = new StringBuilder();
        for (C113220a next : list) {
            sb.append(next.f338770a);
            sb.append(",");
            sb.append(next.f338771b);
            sb.append(",");
            if (!next.f338772c.contains(ShareConstants.DEX_SUFFIX)) {
                next.f338772c += ShareConstants.DEX_SUFFIX;
            }
            sb.append(next.f338772c);
            sb.append(",");
            sb.append(next.f338773d);
            sb.append(",");
            sb.append(next.f338774e);
            sb.append(",");
            sb.append(next.f338775f);
            sb.append(";");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m155001a(Context context, List<C113220a> list) {
        List<C113220a> e = m155023e(m155014c(context, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", ""));
        if (list.size() == 0) {
            return false;
        }
        if (e.size() == 0) {
            return m155020d(context, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", m154992a(list));
        }
        for (int i = 0; i < e.size(); i++) {
            C113220a aVar = e.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                C113220a aVar2 = list.get(i2);
                if (aVar2.f338770a == aVar.f338770a) {
                    aVar.f338772c = aVar2.f338772c;
                    aVar.f338771b = aVar2.f338771b;
                    aVar.f338773d = aVar2.f338773d;
                    aVar.f338774e = aVar2.f338774e;
                    break;
                }
                i2++;
            }
        }
        return m155020d(context, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", m154992a(e));
    }

    /* renamed from: a */
    public static boolean m155000a(Context context, String str, String str2, String str3, long j, byte[] bArr) {
        String str4 = str2 + File.separator + str3;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        boolean z = false;
        try {
            InputStream open = context.getResources().getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            open.available();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str4, true), 1024);
            while (true) {
                int read = open.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.close();
            byte[] c = m155016c(C79909m.m97066a(byteArrayOutputStream.toByteArray(), "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q"));
            if (c != null) {
                bufferedOutputStream.write(c);
                bufferedOutputStream.close();
                z = true;
            }
            open.close();
        } catch (Exception e) {
            C113229j.m154972a("copy base to private dir", e);
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m155002a(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
            return true;
        }
        String[] list = file.list();
        if (!(list == null || list.length == 0)) {
            for (String file2 : list) {
                File file3 = new File(str, file2);
                if (file3.isDirectory()) {
                    m155010b(file3.getAbsolutePath());
                    file3.delete();
                } else {
                    file3.delete();
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static double m154988a(double d, double d2, double d3, double d4) {
        double a = m154987a(d);
        double a2 = m154987a(d3);
        return (((double) Math.round(((Math.asin(Math.sqrt(Math.pow(Math.sin((a - a2) / 2.0d), 2.0d) + ((Math.cos(a) * Math.cos(a2)) * Math.pow(Math.sin((m154987a(d2) - m154987a(d4)) / 2.0d), 2.0d)))) * 2.0d) * 6378.137d) * 10000.0d)) / 10000.0d) * 1000.0d;
    }
}
