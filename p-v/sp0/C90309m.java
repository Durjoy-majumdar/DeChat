package sp0;

import android.net.Uri;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.util.InetAddressUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p823sg.C90196p;

/* renamed from: sp0.m */
public enum C90309m {
    ;

    /* renamed from: sp0.m$a */
    public class C90310a implements HostnameVerifier {

        /* renamed from: a */
        public final /* synthetic */ HostnameVerifier f259259a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f259260b;

        public C90310a(HostnameVerifier hostnameVerifier, ArrayList arrayList) {
            this.f259259a = hostnameVerifier;
            this.f259260b = arrayList;
        }

        public boolean verify(String str, SSLSession sSLSession) {
            boolean z;
            if (!this.f259259a.verify(str, sSLSession)) {
                ArrayList arrayList = this.f259260b;
                if (arrayList != null && str != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).contains(str)) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                } else {
                    z = true;
                }
                return z;
            }
        }
    }

    /* renamed from: A */
    public static boolean m113065A(C82381f fVar) {
        int ordinal = fVar.getAppState().ordinal();
        return ordinal == 2 || ordinal == 3;
    }

    /* renamed from: B */
    public static Map<String, List<String>> m113066B(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        try {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                if (str != null) {
                    if (!str.isEmpty()) {
                        String str2 = (String) next.getValue();
                        List list = (List) hashMap.get(str);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(str2);
                        hashMap.put(str, list);
                    }
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e, "JSONException: put header error", new Object[0]);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m113067a(HttpURLConnection httpURLConnection, ArrayList<String> arrayList) {
        if (httpURLConnection != null) {
            ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new C90310a(HttpsURLConnection.getDefaultHostnameVerifier(), arrayList));
        }
    }

    /* renamed from: b */
    public static int m113068b(int i) {
        String c = m113069c(i);
        Log.m105925i("MicroMsg.AppBrandNetworkUtil", "calcMaskIntByPrefixLength result:%s", c);
        String[] split = c.split("\\.");
        return C90196p.m112887d(new byte[]{(byte) (Util.getInt(split[0], 0) & 255), (byte) (Util.getInt(split[1], 0) & 255), (byte) (Util.getInt(split[2], 0) & 255), (byte) (Util.getInt(split[3], 0) & 255)});
    }

    /* renamed from: c */
    public static String m113069c(int i) {
        Log.m105925i("MicroMsg.AppBrandNetworkUtil", "calcMaskStrByPrefixLength length:%d", Integer.valueOf(i));
        int i2 = -1 << (32 - i);
        int[] iArr = new int[4];
        for (int i3 = 0; i3 < 4; i3++) {
            iArr[3 - i3] = (i2 >> (i3 * 8)) & 255;
        }
        String str = "" + iArr[0];
        for (int i4 = 1; i4 < 4; i4++) {
            str = str + "." + iArr[i4];
        }
        return str;
    }

    /* renamed from: e */
    public static JSONObject m113070e(Map<String, List<String>> map, int i) {
        JSONObject jSONObject = new JSONObject();
        if (i == 1) {
            try {
                jSONObject.put("__AppBrandRemoteDebugRequestHeader__", true);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e, "JSONException: getHeaderJsonObject put REQUEST_HEADER header error", new Object[0]);
            }
        }
        if (map == null) {
            return jSONObject;
        }
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            if (!Util.isNullOrNil(str) && list != null && !list.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append((String) list.get(0));
                for (int i2 = 1; i2 < list.size(); i2++) {
                    sb.append(",");
                    sb.append((String) list.get(i2));
                }
                try {
                    jSONObject.put(str, sb.toString());
                } catch (JSONException e2) {
                    Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e2, "JSONException: getHeaderJsonObject put header error", new Object[0]);
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: f */
    public static int m113071f(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.AppBrandNetworkUtil", "getHostIPNetMaskPrefixLength invalid ip");
            return 0;
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Iterator<InterfaceAddress> it = networkInterfaces.nextElement().getInterfaceAddresses().iterator();
                while (true) {
                    if (it.hasNext()) {
                        InterfaceAddress next = it.next();
                        Log.m105925i("MicroMsg.AppBrandNetworkUtil", "address:%s", next.getAddress().getHostAddress());
                        if ((next.getAddress() instanceof Inet4Address) && !next.getAddress().isLoopbackAddress() && !next.getAddress().isAnyLocalAddress() && next.getAddress().getHostAddress().equals(str)) {
                            return next.getNetworkPrefixLength();
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e, "lm:get mask failed", new Object[0]);
        }
        return 0;
    }

    /* renamed from: g */
    public static Map<String, String> m113072g(JSONObject jSONObject, C90272a aVar) {
        ArrayList<String> arrayList;
        HashMap hashMap = new HashMap();
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("header");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null) {
                        hashMap.put(next.toLowerCase(), optJSONObject.getString(next));
                    }
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e, "Exception: get header error", new Object[0]);
        }
        if (aVar == null) {
            Log.m105920e("MicroMsg.AppBrandNetworkUtil", "hy: no network config!");
        } else {
            int i = aVar.f259123E;
            if (i == 1) {
                ArrayList<String> arrayList2 = aVar.f259143w;
                if (arrayList2 != null) {
                    if (arrayList2.isEmpty()) {
                        Log.m105920e("MicroMsg.AppBrandNetworkUtil", "filterHttpHeaderBlackList fail, headerMap is null or blacklist is null or nil.");
                    } else {
                        Iterator<String> it = arrayList2.iterator();
                        while (it.hasNext()) {
                            String next2 = it.next();
                            if (next2 != null) {
                                String lowerCase = next2.toLowerCase();
                                String str = (String) hashMap.remove(lowerCase);
                                if (str != null) {
                                    Log.m105927v("MicroMsg.AppBrandNetworkUtil", "remove key %s value %s", lowerCase, str);
                                }
                            }
                        }
                    }
                }
            } else if (i == 2 && (arrayList = aVar.f259144x) != null) {
                HashMap hashMap2 = new HashMap();
                Iterator<String> it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    String next3 = it4.next();
                    if (next3 != null) {
                        String lowerCase2 = next3.toLowerCase();
                        String str2 = (String) hashMap.get(lowerCase2);
                        if (str2 != null) {
                            Log.m105927v("MicroMsg.AppBrandNetworkUtil", "add item, key(%s), value(%s)", lowerCase2, str2);
                            hashMap2.put(lowerCase2, str2);
                        }
                    }
                }
                hashMap = hashMap2;
            }
            hashMap.remove("referer");
            if (!TextUtils.isEmpty(aVar.f259122D)) {
                hashMap.put("referer", aVar.f259122D);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static String m113073h(int i) {
        return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
    }

    /* renamed from: i */
    public static int m113074i(String str) {
        if (!m113083r(str)) {
            return 0;
        }
        String[] split = str.split("\\.");
        return C90196p.m112887d(new byte[]{(byte) (Util.getInt(split[0], 0) & 255), (byte) (Util.getInt(split[1], 0) & 255), (byte) (Util.getInt(split[2], 0) & 255), (byte) (Util.getInt(split[3], 0) & 255)});
    }

    /* renamed from: j */
    public static String m113075j(URI uri) {
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (Util.isNullOrNil(scheme)) {
            return null;
        }
        if (scheme.equalsIgnoreCase("wss")) {
            scheme = C113600ck.f339986i;
        } else if (scheme.equalsIgnoreCase("ws")) {
            scheme = "http";
        }
        StringBuilder sb = new StringBuilder(scheme);
        sb.append("://");
        sb.append(uri.getHost());
        int port = uri.getPort();
        if (!(port == -1 || (scheme.equalsIgnoreCase("http") && port == 80) || (scheme.equalsIgnoreCase(C113600ck.f339986i) && port == 443))) {
            sb.append(XVFSFile.PATH_SEPARATOR);
            sb.append(uri.getPort());
        }
        return sb.toString();
    }

    /* renamed from: k */
    public static synchronized Map<String, Object> m113076k(CronetLogic.WebPageProfile webPageProfile) {
        HashMap hashMap;
        synchronized (C90309m.class) {
            hashMap = new HashMap();
            if (webPageProfile != null) {
                hashMap.put("redirectStart", Long.valueOf(webPageProfile.redirectStart));
                hashMap.put("redirectEnd", Long.valueOf(webPageProfile.redirectEnd));
                hashMap.put("fetchStart", Long.valueOf(webPageProfile.fetchStart));
                hashMap.put("domainLookUpStart", Long.valueOf(webPageProfile.domainLookUpStart));
                hashMap.put("domainLookUpEnd", Long.valueOf(webPageProfile.domainLookUpEnd));
                hashMap.put("connectStart", Long.valueOf(webPageProfile.connectStart));
                hashMap.put("connectEnd", Long.valueOf(webPageProfile.connectEnd));
                hashMap.put("SSLconnectionStart", Long.valueOf(webPageProfile.SSLconnectionStart));
                hashMap.put("SSLconnectionEnd", Long.valueOf(webPageProfile.SSLconnectionEnd));
                hashMap.put("requestStart", Long.valueOf(webPageProfile.requestStart));
                hashMap.put("requestEnd", Long.valueOf(webPageProfile.requestEnd));
                hashMap.put("responseStart", Long.valueOf(webPageProfile.responseStart));
                hashMap.put("responseEnd", Long.valueOf(webPageProfile.responseEnd));
                hashMap.put("rtt", Integer.valueOf(webPageProfile.rtt));
                hashMap.put("estimate_nettype", Integer.valueOf(webPageProfile.networkTypeEstimate));
                hashMap.put("httpRttEstimate", Integer.valueOf(webPageProfile.httpRttEstimate));
                hashMap.put("transportRttEstimate", Integer.valueOf(webPageProfile.transportRttEstimate));
                hashMap.put("downstreamThroughputKbpsEstimate", Integer.valueOf(webPageProfile.downstreamThroughputKbpsEstimate));
                hashMap.put("throughputKbps", Integer.valueOf(webPageProfile.throughputKbps));
                hashMap.put("peerIP", webPageProfile.peerIP);
                hashMap.put("port", Integer.valueOf(webPageProfile.port));
                hashMap.put("protocol", webPageProfile.protocol);
                hashMap.put("socketReused", Boolean.valueOf(webPageProfile.socketReused));
                hashMap.put("sendBytesCount", Long.valueOf(webPageProfile.sendBytesCount));
                hashMap.put("receivedBytedCount", Long.valueOf(webPageProfile.receivedBytedCount));
            }
        }
        return hashMap;
    }

    /* renamed from: l */
    public static String m113077l(HttpURLConnection httpURLConnection) {
        URL url;
        if (httpURLConnection == null || (url = httpURLConnection.getURL()) == null) {
            return "";
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        if (headerField == null) {
            headerField = httpURLConnection.getHeaderField(FirebaseAnalytics.C113379b.LOCATION);
        }
        if (headerField == null) {
            return null;
        }
        try {
            return url.toURI().resolve(headerField).toString();
        } catch (URISyntaxException e) {
            Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e, "URISyntaxException: resolve url error", new Object[0]);
            return headerField;
        }
    }

    /* renamed from: m */
    public static JSONObject m113078m(HttpURLConnection httpURLConnection) {
        return httpURLConnection == null ? m113070e((Map<String, List<String>>) null, 1) : m113070e(httpURLConnection.getRequestProperties(), 1);
    }

    /* renamed from: n */
    public static int m113079n(C90272a aVar, int i) {
        if (i == 0) {
            return aVar.f259129f;
        }
        if (i == 1) {
            return aVar.f259130g;
        }
        if (i == 2) {
            return aVar.f259131h;
        }
        if (i != 3) {
            return 0;
        }
        return aVar.f259132i;
    }

    /* renamed from: o */
    public static JSONObject m113080o(HttpURLConnection httpURLConnection) {
        return httpURLConnection == null ? m113070e((Map<String, List<String>>) null, 2) : m113070e(httpURLConnection.getHeaderFields(), 2);
    }

    /* renamed from: p */
    public static SSLContext m113081p(C90272a aVar) {
        C90325r q = m113082q(aVar);
        if (q == null) {
            return null;
        }
        TrustManager[] trustManagerArr = {q};
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init((KeyManager[]) null, trustManagerArr, (SecureRandom) null);
            return instance;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e, "Exception: SSLContext init error", new Object[0]);
            return null;
        }
    }

    /* renamed from: q */
    public static C90325r m113082q(C90272a aVar) {
        LinkedList linkedList = new LinkedList();
        Iterator<byte[]> it = aVar.f259145y.iterator();
        while (it.hasNext()) {
            byte[] next = it.next();
            if (!(next == null || next.length == 0)) {
                linkedList.add(new ByteArrayInputStream(next));
            }
        }
        if (!linkedList.isEmpty()) {
            C90325r rVar = new C90325r(aVar.f259126H);
            Iterator it4 = linkedList.iterator();
            while (it4.hasNext()) {
                InputStream inputStream = (InputStream) it4.next();
                if (rVar.f259303c == null) {
                    Log.m105920e("MicroMsg.AppBrandX509TrustManager", "local keystore is null");
                } else {
                    try {
                        Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(inputStream);
                        inputStream.close();
                        KeyStore keyStore = rVar.f259303c;
                        keyStore.setCertificateEntry(((X509Certificate) generateCertificate).getSubjectDN() + "", generateCertificate);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.AppBrandX509TrustManager", e, "Exception: initLocalSelfSignedCertificate", new Object[0]);
                    } catch (Throwable th) {
                        inputStream.close();
                        throw th;
                    }
                }
            }
            rVar.mo124554a();
            return rVar;
        } else if (!aVar.f259126H) {
            return null;
        } else {
            Log.m105924i("MicroMsg.AppBrandNetworkUtil", "getTrustManagerWithSelfSignedCertificates debug type");
            C90325r rVar2 = new C90325r(true);
            rVar2.mo124554a();
            return rVar2;
        }
    }

    /* renamed from: r */
    public static boolean m113083r(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, url is null");
            return false;
        }
        String[] split = str.split("\\.");
        if (split.length != 4) {
            Log.m105920e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, invalid ip format");
            return false;
        }
        for (String str2 : split) {
            int i = Util.getInt(str2, -1);
            if (i < 0 || i > 255) {
                Log.m105920e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, invalid ip format");
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public static boolean m113084s(ArrayList<String> arrayList, String str, boolean z) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, url is null");
            return false;
        } else if (arrayList == null || arrayList.size() == 0) {
            Log.m105920e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, configUrls is empty");
            return false;
        } else {
            Log.m105918d("MicroMsg.AppBrandNetworkUtil", "url " + str);
            Log.m105918d("MicroMsg.AppBrandNetworkUtil", "configUrl size " + arrayList.size());
            HashMap<String, String> z2 = m113091z(str);
            String str2 = z2.get("host");
            String str3 = z2.get("scheme");
            String str4 = z2.get("port");
            if (!Util.isNullOrNil(str2) && !Util.isNullOrNil(str3)) {
                char c = 2;
                Log.m105919d("MicroMsg.AppBrandNetworkUtil", "host %s  scheme %s port %s skipPortCheck %s", str2, str3, str4, Boolean.valueOf(z));
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    Log.m105918d("MicroMsg.AppBrandNetworkUtil", "configUrl " + next);
                    HashMap<String, String> z3 = m113091z(next);
                    String str5 = z3.get("host");
                    String str6 = z3.get("scheme");
                    String str7 = z3.get("port");
                    Object[] objArr = new Object[3];
                    objArr[0] = str5;
                    objArr[1] = str6;
                    objArr[c] = str7;
                    Log.m105919d("MicroMsg.AppBrandNetworkUtil", "confighost %s  configscheme %s configport %s", objArr);
                    if (!str2.equalsIgnoreCase(str5) || !str3.equalsIgnoreCase(str6) || (!z && !str4.equalsIgnoreCase(str7))) {
                        c = 2;
                    } else {
                        Log.m105924i("MicroMsg.AppBrandNetworkUtil", "match!!");
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: t */
    public static int m113085t(String str) {
        int i;
        int i2;
        int i3;
        if (!m113083r(str)) {
            Log.m105920e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, url is null");
            return 0;
        }
        String[] split = str.split("\\.");
        int d = C90196p.m112887d(new byte[]{(byte) (Util.getInt(split[0], 0) & 255), (byte) (Util.getInt(split[1], 0) & 255), (byte) (Util.getInt(split[2], 0) & 255), (byte) (Util.getInt(split[3], 0) & 255)});
        WifiManager wifiManager = (WifiManager) MMApplicationContext.getContext().getApplicationContext().getSystemService("wifi");
        if (wifiManager.getWifiState() == 3) {
            int wiFiIpAddress = ConnectivityCompat.Companion.getWiFiIpAddress();
            String h = m113073h(wiFiIpAddress);
            try {
                i2 = wifiManager.getDhcpInfo().netmask;
            } catch (NullPointerException e) {
                Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e, "NullPointerException: getDhcpInfo error", new Object[0]);
                i2 = 0;
            }
            if (i2 <= 0) {
                int f = m113071f(h);
                i3 = f;
                i2 = m113068b(f);
            } else {
                i3 = 0;
            }
            Log.m105925i("MicroMsg.AppBrandNetworkUtil", "matchIp oldIpStr:%s, localIp:%s,oldIpInt:%d, localIpInt:%d, netmask:%d, prefixLength:%d", str, h, Integer.valueOf(d), Integer.valueOf(wiFiIpAddress), Integer.valueOf(i2), Integer.valueOf(i3));
            return m113086u((long) i2, d, wiFiIpAddress);
        }
        int i4 = 13;
        try {
            i4 = ((Integer) wifiManager.getClass().getField("WIFI_AP_STATE_ENABLED").get(wifiManager)).intValue();
            i = ((Integer) wifiManager.getClass().getMethod("getWifiApState", new Class[0]).invoke(wifiManager, new Object[0])).intValue();
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e2, "Exception: getWifiApState error", new Object[0]);
            i = 0;
        }
        if (i == i4) {
            Log.m105924i("MicroMsg.AppBrandNetworkUtil", "matchip in apmode");
            try {
                for (T interfaceAddresses : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                    Iterator<InterfaceAddress> it = interfaceAddresses.getInterfaceAddresses().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            InterfaceAddress next = it.next();
                            if (!next.getAddress().isLoopbackAddress()) {
                                String upperCase = next.getAddress().getHostAddress().toUpperCase();
                                boolean isIPv4Address = InetAddressUtils.isIPv4Address(upperCase);
                                Log.m105925i("MicroMsg.AppBrandNetworkUtil", "check ip:%s, isIPv4:%b", upperCase, Boolean.valueOf(isIPv4Address));
                                if (isIPv4Address) {
                                    int i5 = m113074i(upperCase);
                                    long b = (long) m113068b(next.getNetworkPrefixLength());
                                    Log.m105925i("MicroMsg.AppBrandNetworkUtil", "matchAddress oldIpInt:%d, localIpInt:%d, netmask:%d", Integer.valueOf(d), Integer.valueOf(i5), Long.valueOf(b));
                                    return m113086u(b, d, i5);
                                }
                            }
                        }
                    }
                }
                return 0;
            } catch (Exception e3) {
                Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e3, "Exception: matchAddress error", new Object[0]);
                return 0;
            }
        } else {
            Log.m105925i("MicroMsg.AppBrandNetworkUtil", "apState:%d", Integer.valueOf(i));
            return 0;
        }
    }

    /* renamed from: u */
    public static int m113086u(long j, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int d = C90196p.m112887d(new byte[]{-1, -1, -1, 0});
        long[] jArr = new long[4];
        if (j > 0) {
            jArr[0] = j >>> 24;
            jArr[1] = (j & 16777215) >>> 16;
            jArr[2] = (j & 65535) >>> 8;
            jArr[3] = j & 255;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= 4) {
                break;
            }
            long j2 = jArr[i5];
            i6 = (int) (((long) i6) + j2);
            if (j2 < 0 || j2 > 255) {
                i6 = -1;
            } else {
                i5++;
            }
        }
        long j3 = i6 <= 0 ? (long) d : j;
        Log.m105925i("MicroMsg.AppBrandNetworkUtil", "matchNetMask oldIpInt:%d, localIpInt:%d, netmask:%d", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j3));
        if ((((long) i3) & j3) == (j3 & ((long) i4))) {
            return i3 == i4 ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: v */
    public static boolean m113087v(ArrayList<String> arrayList, String str) {
        return m113088w(arrayList, str, false);
    }

    /* renamed from: w */
    public static boolean m113088w(ArrayList<String> arrayList, String str, boolean z) {
        if (m113084s(arrayList, str, z)) {
            return true;
        }
        if (m113085t(m113091z(str).get("host")) != 2) {
            return false;
        }
        Log.m105921e("MicroMsg.AppBrandNetworkUtil", "matchUrl, url in the same net %s", str);
        return true;
    }

    /* renamed from: x */
    public static boolean m113089x(int i) {
        return i == 301 || i == 302 || i == 307;
    }

    /* renamed from: y */
    public static String m113090y(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        JSONArray optJSONArray = jSONObject.optJSONArray("protocols");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                linkedList.add(optJSONArray.optString(i));
            }
        }
        if (!Util.isNullOrNil((List) linkedList)) {
            return TextUtils.join(", ", linkedList);
        }
        return null;
    }

    /* renamed from: z */
    public static HashMap<String, String> m113091z(String str) {
        String str2;
        String str3;
        String str4 = "";
        try {
            Uri parse = Uri.parse(str);
            str3 = parse.getHost();
            try {
                str2 = parse.getScheme();
                try {
                    str4 = String.valueOf(parse.getPort());
                } catch (Exception e) {
                    e = e;
                    Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e, "Exception: parseUrl error", new Object[0]);
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("host", str3);
                    hashMap.put("scheme", str2);
                    hashMap.put("port", str4);
                    return hashMap;
                }
            } catch (Exception e2) {
                e = e2;
                str2 = str4;
                Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e, "Exception: parseUrl error", new Object[0]);
                HashMap<String, String> hashMap2 = new HashMap<>();
                hashMap2.put("host", str3);
                hashMap2.put("scheme", str2);
                hashMap2.put("port", str4);
                return hashMap2;
            }
        } catch (Exception e3) {
            e = e3;
            str3 = str4;
            str2 = str3;
            Log.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", e, "Exception: parseUrl error", new Object[0]);
            HashMap<String, String> hashMap22 = new HashMap<>();
            hashMap22.put("host", str3);
            hashMap22.put("scheme", str2);
            hashMap22.put("port", str4);
            return hashMap22;
        }
        HashMap<String, String> hashMap222 = new HashMap<>();
        hashMap222.put("host", str3);
        hashMap222.put("scheme", str2);
        hashMap222.put("port", str4);
        return hashMap222;
    }
}
