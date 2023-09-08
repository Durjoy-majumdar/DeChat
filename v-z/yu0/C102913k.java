package yu0;

import a70.C112760b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C45628s0;
import eb0.C97625j3;
import f40.C86709a0;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.conn.util.InetAddressUtils;
import p156gj.C87203t;
import p206nj.C88956h;
import p823sg.C90193h;
import p823sg.C90196p;
import pe3.C47465a;
import pe3.C89349b;
import pv0.C100963a0;
import pv0.C100966p;
import pv0.C62556a;
import qe3.C89625d;
import te3.C51018qv3;
import te3.C77926f9;
import te3.C77996sv3;

/* renamed from: yu0.k */
public class C102913k {

    /* renamed from: a */
    public static boolean f303764a;

    /* renamed from: b */
    public static List<String> f303765b;

    /* renamed from: A */
    public static String m136029A(Context context) {
        int i;
        String str = "wifi";
        WifiManager wifiManager = (WifiManager) context.getSystemService(str);
        if (wifiManager.getWifiState() == 3) {
            try {
                String formattedWiFiSsid = ConnectivityCompat.Companion.getFormattedWiFiSsid();
                if (!Util.isNullOrNil(formattedWiFiSsid)) {
                    str = formattedWiFiSsid;
                }
                Log.m105925i("MicroMsg.BackupUtil", "getWifiName: result：%s ssid:%s", str, formattedWiFiSsid);
                return (str.length() < 2 || !str.startsWith(FastJsonResponse.QUOTE) || !str.endsWith(FastJsonResponse.QUOTE)) ? str : str.substring(1, str.length() - 1);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.BackupUtil", e, "getConnectionInfo error", new Object[0]);
                Log.printErrStackTrace("MicroMsg.BackupUtil", e, "", new Object[0]);
                return "";
            }
        } else {
            int i2 = 13;
            try {
                i2 = ((Integer) wifiManager.getClass().getField("WIFI_AP_STATE_ENABLED").get(wifiManager)).intValue();
                i = ((Integer) wifiManager.getClass().getMethod("getWifiApState", new Class[0]).invoke(wifiManager, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.BackupUtil", e2, "getWifiApState error", new Object[0]);
                Log.printErrStackTrace("MicroMsg.BackupUtil", e2, "", new Object[0]);
                i = 0;
            }
            if (i != i2) {
                return "";
            }
            Log.m105924i("MicroMsg.BackupUtil", "getWifiName apmode");
            try {
                return ((WifiConfiguration) wifiManager.getClass().getMethod("getWifiApConfiguration", new Class[0]).invoke(wifiManager, new Object[0])).SSID;
            } catch (Exception e3) {
                Log.printErrStackTrace("MicroMsg.BackupUtil", e3, "getWifiApConfiguration error", new Object[0]);
                Log.printErrStackTrace("MicroMsg.BackupUtil", e3, "", new Object[0]);
                return "wifiap";
            }
        }
    }

    /* renamed from: B */
    public static boolean m136030B(String str) {
        int i;
        String[] split = str.split("\\.");
        int d = C90196p.m112887d(new byte[]{(byte) (Util.getInt(split[0], 0) & 255), (byte) (Util.getInt(split[1], 0) & 255), (byte) (Util.getInt(split[2], 0) & 255), (byte) (Util.getInt(split[3], 0) & 255)});
        int d2 = C90196p.m112887d(new byte[]{-1, -1, -1, 0});
        WifiManager wifiManager = (WifiManager) MMApplicationContext.getContext().getSystemService("wifi");
        if (wifiManager.getWifiState() == 3) {
            int wiFiIpAddress = ConnectivityCompat.Companion.getWiFiIpAddress();
            Log.m105925i("MicroMsg.BackupUtil", "oldIpStr:%s, localIp:%s", str, (wiFiIpAddress & 255) + "." + ((wiFiIpAddress >> 8) & 255) + "." + ((wiFiIpAddress >> 16) & 255) + "." + ((wiFiIpAddress >> 24) & 255));
            return (d2 & d) == (d2 & wiFiIpAddress);
        }
        int i2 = 13;
        try {
            i2 = ((Integer) wifiManager.getClass().getField("WIFI_AP_STATE_ENABLED").get(wifiManager)).intValue();
            i = ((Integer) wifiManager.getClass().getMethod("getWifiApState", new Class[0]).invoke(wifiManager, new Object[0])).intValue();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.BackupUtil", "getWifiApState %s", e);
            Log.printErrStackTrace("MicroMsg.BackupUtil", e, "", new Object[0]);
            i = 0;
        }
        if (i == i2) {
            Log.m105924i("MicroMsg.BackupUtil", "matchip in apmode");
            try {
                for (T inetAddresses : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                    Iterator<T> it = Collections.list(inetAddresses.getInetAddresses()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            InetAddress inetAddress = (InetAddress) it.next();
                            if (!inetAddress.isLoopbackAddress()) {
                                String upperCase = inetAddress.getHostAddress().toUpperCase();
                                boolean isIPv4Address = InetAddressUtils.isIPv4Address(upperCase);
                                Log.m105925i("MicroMsg.BackupUtil", "check ip:%s, isIPv4:%b", upperCase, Boolean.valueOf(isIPv4Address));
                                if (isIPv4Address && (d2 & d) == (m136057v(upperCase) & d2)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        } else {
            Log.m105925i("MicroMsg.BackupUtil", "apState:%d", Integer.valueOf(i));
            return false;
        }
    }

    /* renamed from: C */
    public static <T extends C47465a> T m136031C(T t, byte[] bArr) {
        if (!(bArr == null || bArr.length == 0)) {
            try {
                t.parseFrom(bArr);
                return t;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.BackupUtil", "ERROR: parseProBuf [%s] [%s]", e.getMessage(), Util.stackTraceToString(e));
            }
        }
        return null;
    }

    /* renamed from: D */
    public static void m136032D(C62556a aVar) {
        if (aVar == null) {
            Log.m105920e("MicroMsg.BackupUtil", "BackupAnalyseInfo not support");
            return;
        }
        Log.m105925i("MicroMsg.BackupUtil", "backupSendFinishRequest deviceName:%s, sessionCount:%d, msgCount:%d, mediaCount:%d, cost:%d", aVar.f177663d, Integer.valueOf(aVar.f177665f), Long.valueOf(aVar.f177667h), Integer.valueOf(aVar.f177668i), Long.valueOf(aVar.f177664e));
    }

    /* renamed from: E */
    public static boolean m136033E(C77926f9 f9Var, int i, String str) {
        if (f9Var.f227347u == i) {
            byte[] bArr = f9Var.f227345s.f140574f.f257327a;
            if (bArr.length <= 0) {
                return false;
            }
            C86013q1.m106438T(str, bArr, 0, bArr.length);
            return true;
        }
        String x = m136059x(f9Var, i, (String) null);
        if (Util.isNullOrNil(x)) {
            return false;
        }
        C86013q1.m106463x(m136050o(x) + x, str);
        return true;
    }

    /* renamed from: F */
    public static boolean m136034F(C77926f9 f9Var, int i, String str) {
        if (f9Var.f227347u == i) {
            byte[] bArr = f9Var.f227345s.f140574f.f257327a;
            if (bArr.length <= 0) {
                return false;
            }
            C86013q1.m106438T(str, bArr, 0, bArr.length);
            return true;
        }
        String x = m136059x(f9Var, i, (String) null);
        if (Util.isNullOrNil(x)) {
            return false;
        }
        C86013q1.m106442c(m136050o(x) + x, str);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.RandomAccessFile, com.tencent.mm.vfs.f0$h] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m136035G(java.lang.String r6, pv0.C100963a0 r7) {
        /*
            r0 = 0
            r1 = 0
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r3 = r2.getPath()     // Catch:{ Exception -> 0x0095 }
            if (r3 == 0) goto L_0x002a
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r1, r1)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r4 = r2.getPath()     // Catch:{ Exception -> 0x0095 }
            boolean r4 = r4.equals(r3)     // Catch:{ Exception -> 0x0095 }
            if (r4 != 0) goto L_0x002a
            android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ Exception -> 0x0095 }
            android.net.Uri$Builder r2 = r2.path(r3)     // Catch:{ Exception -> 0x0095 }
            android.net.Uri r2 = r2.build()     // Catch:{ Exception -> 0x0095 }
            goto L_0x002a
        L_0x0027:
            r6 = move-exception
            goto L_0x00a4
        L_0x002a:
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0095 }
            com.tencent.mm.vfs.f0$h r3 = r3.mo177799l(r2, r0)     // Catch:{ Exception -> 0x0095 }
            boolean r4 = r3.mo177810a()     // Catch:{ Exception -> 0x0095 }
            if (r4 != 0) goto L_0x0038
            r4 = 0
            goto L_0x0040
        L_0x0038:
            com.tencent.mm.vfs.FileSystem$c r4 = r3.f348991a     // Catch:{ Exception -> 0x0095 }
            java.lang.String r5 = r3.f348992b     // Catch:{ Exception -> 0x0095 }
            boolean r4 = r4.mo119948x(r5)     // Catch:{ Exception -> 0x0095 }
        L_0x0040:
            if (r4 != 0) goto L_0x0056
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0095 }
            com.tencent.mm.vfs.f0$h r2 = r4.mo177799l(r2, r3)     // Catch:{ Exception -> 0x0095 }
            boolean r3 = r2.mo177810a()     // Catch:{ Exception -> 0x0095 }
            if (r3 != 0) goto L_0x004f
            goto L_0x0056
        L_0x004f:
            com.tencent.mm.vfs.FileSystem$c r3 = r2.f348991a     // Catch:{ Exception -> 0x0095 }
            java.lang.String r2 = r2.f348992b     // Catch:{ Exception -> 0x0095 }
            r3.mo119937g(r2)     // Catch:{ Exception -> 0x0095 }
        L_0x0056:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095 }
            r2.<init>()     // Catch:{ Exception -> 0x0095 }
            r2.append(r6)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r6 = r7.f295636d     // Catch:{ Exception -> 0x0095 }
            r2.append(r6)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x0095 }
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0095 }
            r2.<init>((java.lang.String) r6)     // Catch:{ Exception -> 0x0095 }
            boolean r3 = r2.mo119967g()     // Catch:{ Exception -> 0x0095 }
            if (r3 != 0) goto L_0x0075
            r2.mo119964e()     // Catch:{ Exception -> 0x0095 }
        L_0x0075:
            r2 = 1
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106448i(r6, r2)     // Catch:{ Exception -> 0x0095 }
            java.io.RandomAccessFile r0 = com.tencent.p014mm.vfs.C86013q1.m106420B(r6, r2)     // Catch:{ Exception -> 0x0095 }
            int r6 = r7.f295638f     // Catch:{ Exception -> 0x0095 }
            long r2 = (long) r6     // Catch:{ Exception -> 0x0095 }
            r0.setLength(r2)     // Catch:{ Exception -> 0x0095 }
            int r6 = r7.f295639g     // Catch:{ Exception -> 0x0095 }
            long r2 = (long) r6     // Catch:{ Exception -> 0x0095 }
            r0.seek(r2)     // Catch:{ Exception -> 0x0095 }
            pe3.b r6 = r7.f295642j     // Catch:{ Exception -> 0x0095 }
            byte[] r6 = r6.f257327a     // Catch:{ Exception -> 0x0095 }
            r0.write(r6)     // Catch:{ Exception -> 0x0095 }
        L_0x0091:
            r0.close()     // Catch:{ Exception -> 0x00a3 }
            goto L_0x00a3
        L_0x0095:
            r6 = move-exception
            java.lang.String r7 = "MicroMsg.BackupUtil"
            java.lang.String r2 = "writeMediaToFile fail with exception"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0027 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r6, r2, r1)     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x00a3
            goto L_0x0091
        L_0x00a3:
            return
        L_0x00a4:
            if (r0 == 0) goto L_0x00a9
            r0.close()     // Catch:{ Exception -> 0x00a9 }
        L_0x00a9:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yu0.C102913k.m136035G(java.lang.String, pv0.a0):void");
    }

    /* renamed from: a */
    public static long m136036a(String str, int i) {
        long j = (long) i;
        if (Util.isNullOrNil(str)) {
            return j;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupUtil", e, "", new Object[0]);
            return j;
        }
    }

    /* renamed from: b */
    public static int m136037b(String str, String str2, byte[] bArr) {
        try {
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
                if (l2.mo177810a()) {
                    l2.f348991a.mo119937g(l2.f348992b);
                }
            }
            String str3 = str + "/" + str2;
            C86009m1 m1Var = new C86009m1(str3);
            if (!m1Var.mo119967g()) {
                m1Var.mo119964e();
            }
            return C86013q1.m106440a(str3, bArr);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupUtil", e, "", new Object[0]);
            return -1;
        }
    }

    /* renamed from: c */
    public static void m136038c(String str, C100963a0 a0Var) {
        C89349b bVar;
        int i;
        if (TextUtils.isEmpty(str) || a0Var == null) {
            Log.m105921e("MicroMsg.BackupUtil", "appendFile dir:%s req:%s ", str, a0Var);
        } else if (TextUtils.isEmpty(a0Var.f295636d) || (bVar = a0Var.f295642j) == null || Util.getLength(bVar.f257327a) <= 0) {
            Object[] objArr = new Object[3];
            objArr[0] = a0Var.f295636d;
            C89349b bVar2 = a0Var.f295642j;
            objArr[1] = bVar2;
            objArr[2] = bVar2 == null ? "null" : Integer.valueOf(Util.getLength(bVar2.f257327a));
            Log.m105921e("MicroMsg.BackupUtil", "appendFile dataid:%s data:%s  %s", objArr);
        } else {
            int i2 = 3;
            while (true) {
                int i3 = i2 - 1;
                if (i2 > 0) {
                    long f = m136041f(str + a0Var.f295636d);
                    try {
                        Uri n = C116299g2.m163858n(str);
                        String path = n.getPath();
                        if (path != null) {
                            String k = C116299g2.m163855k(path, false, false);
                            if (!n.getPath().equals(k)) {
                                n = n.buildUpon().path(k).build();
                            }
                        }
                        C116281f0 f0Var = C116281f0.C116289i.f348994a;
                        C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
                        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                            C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                            if (l2.mo177810a()) {
                                l2.f348991a.mo119937g(l2.f348992b);
                            }
                        }
                        String str2 = str + "/" + a0Var.f295636d;
                        C86009m1 m1Var = new C86009m1(str2);
                        if (!m1Var.mo119967g()) {
                            m1Var.mo119964e();
                        }
                        i = C86013q1.m106440a(str2, a0Var.f295642j.f257327a);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.BackupUtil", e, "", new Object[0]);
                        i = -1;
                    }
                    long f2 = m136041f(str + a0Var.f295636d);
                    if (i != 0 || f2 < ((long) a0Var.f295642j.f257327a.length)) {
                        Log.m105921e("MicroMsg.BackupUtil", "appendFile retry:%d append:%d  old:%d  new:%d  data:%d", Integer.valueOf(i3), Integer.valueOf(i), Long.valueOf(f), Long.valueOf(f2), Integer.valueOf(a0Var.f295642j.f257327a.length));
                        i2 = i3;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public static int m136039d() {
        Intent registerReceiver = MMApplicationContext.getContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i = 100;
        if (registerReceiver == null) {
            return 100;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        boolean z = intExtra == 2 || intExtra == 5;
        Log.m105925i("MicroMsg.BackupUtil", "checkBatteryLevel, battery isCharging[%b]", Boolean.valueOf(z));
        if (z) {
            return 100;
        }
        int intExtra2 = registerReceiver.getIntExtra(FirebaseAnalytics.C113379b.LEVEL, -1);
        int intExtra3 = registerReceiver.getIntExtra("scale", -1);
        if (intExtra2 >= 0 && intExtra3 > 0) {
            i = (intExtra2 * 100) / intExtra3;
        }
        Log.m105925i("MicroMsg.BackupUtil", "checkBatteryLevel, battery level remaining[%d]", Integer.valueOf(i));
        return i;
    }

    /* renamed from: e */
    public static boolean m136040e(long j, PLong pLong, PLong pLong2, String str) {
        StatFs statFs = new StatFs(C112760b.m154195C());
        pLong.value = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        C86009m1 c = C86009m1.m106378c(C88956h.m111060a());
        StatFs statFs2 = new StatFs(c.mo119976n());
        long blockCount = (long) statFs2.getBlockCount();
        long availableBlocks = (long) statFs2.getAvailableBlocks();
        pLong2.value = ((long) statFs2.getBlockSize()) * ((long) statFs2.getAvailableBlocks());
        Log.m105925i("MicroMsg.BackupUtil", "checkDataFull, SDAvailSize:%d, DataAvailSize%d, dbSize:%d", Long.valueOf(pLong.value), Long.valueOf(pLong2.value), Long.valueOf(j));
        if (blockCount <= 0 || blockCount - availableBlocks < 0) {
            return false;
        }
        if (pLong.value == pLong2.value || str.startsWith(c.mo119976n())) {
            pLong.value = 0;
        }
        return j <= pLong2.value;
    }

    /* renamed from: f */
    public static long m136041f(String str) {
        C86009m1 m1Var = new C86009m1(str);
        if (!m1Var.mo119967g()) {
            return -1;
        }
        if (!m1Var.mo119961a()) {
            return -2;
        }
        if (!m1Var.mo119962b()) {
            return -3;
        }
        return m1Var.mo119980r();
    }

    /* renamed from: g */
    public static boolean m136042g(String str) {
        if (str == null) {
            return false;
        }
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            str = str.substring(indexOf);
        }
        return XmlParser.parseXml(str, "msg", (String) null) != null;
    }

    /* renamed from: h */
    public static void m136043h() {
        Log.m105924i("MicroMsg.BackupUtil", "BackupDelete clear MsgListDataId.");
        C97625j3.m125812b().mo105895j().deleteAllData();
        if (f303764a) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            C86709a0.m107528h();
            m136037b(C86709a0.m107535s().f251805c, "backupTestInfo.txt", ("\nclear MsgListDataId\n" + "deleteTime:" + simpleDateFormat.format(new Date(Util.nowMilliSecond())) + "\n").getBytes());
        }
    }

    /* renamed from: i */
    public static void m136044i() {
        Log.m105924i("MicroMsg.BackupUtil", "BackupDelete clear tempMoveTime.");
        C97625j3.m125812b().mo105896k().deleteAllData();
    }

    /* renamed from: j */
    public static boolean m136045j(C77926f9 f9Var, int i) {
        if (f9Var.f227347u == i && f9Var.f227345s != null) {
            return true;
        }
        Iterator<C77996sv3> it = f9Var.f227344r.iterator();
        while (it.hasNext()) {
            if (it.next().f228225d == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static long m136046k(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        long nowMilliSecond = Util.nowMilliSecond();
        try {
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            Log.m105921e("MicroMsg.BackupUtil", "dateToTimeStamp failed. date:%s, stack:%s", str, Util.getStack());
            return nowMilliSecond;
        }
    }

    /* renamed from: l */
    public static void m136047l(String str) {
        Log.m105925i("MicroMsg.BackupUtil", "BackupDelete Dir:%s", str);
        C86013q1.m106445f(str);
        if (f303764a) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            C86709a0.m107528h();
            m136037b(C86709a0.m107535s().f251805c, "backupTestInfo.txt", ("\n" + "deleteTime:" + simpleDateFormat.format(new Date(Util.nowMilliSecond())) + "\n" + "deletePath:" + str + "\n").getBytes());
        }
        Log.m105925i("MicroMsg.BackupUtil", "BackupDelete Finish. Dir:%s", str);
    }

    /* renamed from: m */
    public static String m136048m(String str) {
        String str2;
        String str3 = "";
        if (str == null) {
            return str3;
        }
        String f = C90193h.m112878f(str.getBytes());
        if (f.length() >= 1) {
            str2 = f.charAt(0) + "/";
        } else {
            str2 = str3;
        }
        if (f.length() >= 2) {
            str3 = f.charAt(1) + "/";
        }
        return str2 + str3;
    }

    /* renamed from: n */
    public static String m136049n(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        return m136051p() + "backupItem/" + m136048m(str);
    }

    /* renamed from: o */
    public static String m136050o(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        return m136051p() + "backupMeida/" + m136048m(str);
    }

    /* renamed from: p */
    public static String m136051p() {
        return C97625j3.m125812b().mo105891f() + "backupRecover/";
    }

    /* renamed from: q */
    public static String m136052q() {
        return C97625j3.m125812b().mo105891f() + "backupRecoverCopy/";
    }

    /* renamed from: r */
    public static LinkedList<C23367h> m136053r(LinkedList<String> linkedList, LinkedList<Long> linkedList2) {
        if (linkedList == null || linkedList2 == null || linkedList.isEmpty() || linkedList.size() * 2 != linkedList2.size()) {
            return null;
        }
        LinkedList<C23367h> linkedList3 = new LinkedList<>();
        HashMap hashMap = new HashMap();
        Iterator<Long> it = linkedList2.iterator();
        Iterator<String> it4 = linkedList.iterator();
        long j = 0;
        long j2 = 0;
        while (it4.hasNext()) {
            String next = it4.next();
            if (it.hasNext()) {
                j = it.next().longValue();
                if (it.hasNext()) {
                    j2 = it.next().longValue();
                }
            }
            int size = hashMap.size();
            if (hashMap.get(next) != null) {
                size = ((Integer) hashMap.get(next)).intValue();
            } else {
                hashMap.put(next, Integer.valueOf(size));
            }
            linkedList3.add(new C23367h(size, next, j, j2));
        }
        return linkedList3;
    }

    /* renamed from: s */
    public static C100966p m136054s(long j) {
        C100966p pVar = new C100966p();
        String f = C87203t.m108270f(false);
        if (TextUtils.isEmpty(f)) {
            f = C87203t.m108273i();
        }
        pVar.f295655d = f;
        pVar.f295656e = Build.MANUFACTURER;
        pVar.f295657f = C87203t.m108275k();
        pVar.f295658g = "Android";
        pVar.f295659h = Build.VERSION.RELEASE;
        int i = C89625d.f257841g;
        pVar.f295660i = i;
        pVar.f295661j = j;
        Log.m105925i("MicroMsg.BackupUtil", "getBackupStartGeneralInfo WechatVersion[%s], freespace[%d], deviceId[%s]", Integer.valueOf(i), Long.valueOf(j), pVar.f295655d);
        return pVar;
    }

    /* renamed from: t */
    public static List<String> m136055t() {
        List<String> list = f303765b;
        if (list != null) {
            return list;
        }
        f303765b = new LinkedList();
        for (String add : C45628s0.f123409o) {
            f303765b.add(add);
        }
        f303765b.add("weixin");
        f303765b.add("weibo");
        f303765b.add("qqmail");
        f303765b.add("fmessage");
        f303765b.add("tmessage");
        f303765b.add("qmessage");
        f303765b.add("qqsync");
        f303765b.add("floatbottle");
        f303765b.add("lbsapp");
        f303765b.add("shakeapp");
        f303765b.add("medianote");
        f303765b.add("qqfriend");
        f303765b.add("readerapp");
        f303765b.add("newsapp");
        f303765b.add("blogapp");
        f303765b.add("facebookapp");
        f303765b.add("masssendapp");
        f303765b.add("meishiapp");
        f303765b.add("feedsapp");
        f303765b.add("voipapp");
        f303765b.add("officialaccounts");
        f303765b.add("helper_entry");
        f303765b.add("pc_share");
        f303765b.add("cardpackage");
        f303765b.add("voicevoipapp");
        f303765b.add("voiceinputapp");
        f303765b.add("linkedinplugin");
        f303765b.add("appbrandcustomerservicemsg");
        return f303765b;
    }

    /* renamed from: u */
    public static LinkedList<String> m136056u(LinkedList<C102912i> linkedList) {
        LinkedList<String> linkedList2 = new LinkedList<>();
        if (linkedList != null) {
            Iterator<C102912i> it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add(it.next().f303759d);
            }
        }
        return linkedList2;
    }

    /* renamed from: v */
    public static int m136057v(String str) {
        String[] split = str.split("\\.");
        return C90196p.m112887d(new byte[]{(byte) (Util.getInt(split[0], 0) & 255), (byte) (Util.getInt(split[1], 0) & 255), (byte) (Util.getInt(split[2], 0) & 255), (byte) (Util.getInt(split[3], 0) & 255)});
    }

    /* renamed from: w */
    public static String m136058w(float f) {
        if (f == 0.0f) {
            return "0";
        }
        if (f < 1024.0f) {
            return "< 1 KB";
        }
        if (f < 1048576.0f) {
            return String.format("%dKB", new Object[]{Integer.valueOf(Math.round(f / 1024.0f))});
        } else if (f < 1.07374182E9f) {
            return String.format("%.1fMB", new Object[]{Float.valueOf((f / 1024.0f) / 1024.0f)});
        } else {
            return String.format("%.1fGB", new Object[]{Float.valueOf(((f / 1024.0f) / 1024.0f) / 1024.0f)});
        }
    }

    /* renamed from: x */
    public static String m136059x(C77926f9 f9Var, int i, String str) {
        C51018qv3 qv32;
        if (f9Var.f227347u == i && (qv32 = f9Var.f227345s) != null) {
            return C90193h.m112878f(qv32.f140574f.f257327a);
        }
        int i2 = 0;
        LinkedList<C77996sv3> linkedList = f9Var.f227344r;
        if (!(linkedList == null || f9Var.f227343q == null)) {
            Iterator<C77996sv3> it = linkedList.iterator();
            while (it.hasNext()) {
                if (it.next().f228225d == i) {
                    String str2 = f9Var.f227343q.get(i2).f141175d;
                    if (Util.isNullOrNil(str) || str2.endsWith(str)) {
                        if (C86013q1.m106450k(m136050o(str2) + str2)) {
                            return str2;
                        }
                        return null;
                    }
                }
                i2++;
            }
        }
        return null;
    }

    /* renamed from: y */
    public static int m136060y(C77926f9 f9Var, int i) {
        if (f9Var.f227347u == i) {
            C51018qv3 qv32 = f9Var.f227345s;
            if (qv32 == null) {
                return 0;
            }
            return qv32.f140574f.f257327a.length;
        }
        LinkedList<C77996sv3> linkedList = f9Var.f227344r;
        if (!(linkedList == null || f9Var.f227343q == null)) {
            Iterator<C77996sv3> it = linkedList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (it.next().f228225d == i) {
                    String str = f9Var.f227343q.get(i2).f141175d;
                    return (int) C86013q1.m106451l(m136050o(str) + str);
                }
                i2++;
            }
        }
        return 0;
    }

    /* renamed from: z */
    public static byte[] m136061z(C77926f9 f9Var, int i) {
        C51018qv3 qv32;
        if (f9Var.f227347u == i && (qv32 = f9Var.f227345s) != null) {
            return qv32.f140574f.f257327a;
        }
        LinkedList<C77996sv3> linkedList = f9Var.f227344r;
        if (!(linkedList == null || f9Var.f227343q == null)) {
            Iterator<C77996sv3> it = linkedList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (it.next().f228225d == i) {
                    String str = f9Var.f227343q.get(i2).f141175d;
                    String str2 = m136050o(str) + str;
                    int l = (int) C86013q1.m106451l(str2);
                    if (l != 0 && l <= 1048576) {
                        return C86013q1.m106433O(str2, 0, -1);
                    }
                    Log.m105920e("MicroMsg.BackupUtil", "thumb not exist or  too big!");
                    return null;
                }
                i2++;
            }
        }
        return null;
    }
}
