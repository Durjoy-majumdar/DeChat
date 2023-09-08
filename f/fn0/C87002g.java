package fn0;

import an0.C79592a;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.URLUtil;
import bn0.C79721e;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.file.XVFSFile;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.xwalk.core.XWalkEnvironment;

/* renamed from: fn0.g */
public class C87002g {

    /* renamed from: a */
    public static final int f252486a = Build.VERSION.SDK_INT;

    /* renamed from: b */
    public static HashMap<String, String> f252487b = new HashMap<>();

    /* renamed from: c */
    public static HashMap<String, Boolean> f252488c = new HashMap<>();

    static {
        new AtomicInteger(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0012 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0016 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0008] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0021 A[SYNTHETIC, Splitter:B:18:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0028 A[SYNTHETIC, Splitter:B:24:0x0028] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m108007a() {
        /*
            r0 = 0
            java.net.ServerSocket r1 = new java.net.ServerSocket     // Catch:{ IOException -> 0x0025, all -> 0x001b }
            r2 = 0
            r1.<init>(r2)     // Catch:{ IOException -> 0x0025, all -> 0x001b }
            r0 = 1
            r1.setReuseAddress(r0)     // Catch:{ IOException -> 0x0018, all -> 0x0016 }
            int r0 = r1.getLocalPort()     // Catch:{ IOException -> 0x0018, all -> 0x0016 }
            r1.close()     // Catch:{ IOException -> 0x0012, all -> 0x0016 }
        L_0x0012:
            r1.close()     // Catch:{ IOException -> 0x0015 }
        L_0x0015:
            return r0
        L_0x0016:
            r0 = move-exception
            goto L_0x001f
        L_0x0018:
            r0 = r1
            goto L_0x0026
        L_0x001b:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            r1.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            throw r0
        L_0x0025:
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            r0.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find a free TCP/IP port to start video proxy"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fn0.C87002g.m108007a():int");
    }

    /* renamed from: b */
    public static int m108008b(int i) {
        try {
            return m108007a();
        } catch (IllegalStateException unused) {
            int i2 = 0;
            while (i2 < i) {
                try {
                    return m108007a();
                } catch (IllegalStateException unused2) {
                    m108023q(5, "PlayerUtils", "retry findFreePort i=" + i2, (Throwable) null);
                    i2++;
                }
            }
            throw new IllegalStateException("Could not find a free TCP/IP port to start video proxy, maxRetry=" + i);
        }
    }

    /* renamed from: c */
    public static String m108009c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        if (str2.startsWith("http")) {
            return str2;
        }
        try {
            return new URL(new URL(str), str2).toString();
        } catch (MalformedURLException unused) {
            if (str.endsWith("/")) {
                str = str.substring(0, str.length() - 1);
            }
            int lastIndexOf = str.lastIndexOf(47);
            if (lastIndexOf > 0) {
                str = str.substring(0, lastIndexOf);
            }
            return str + str2;
        }
    }

    /* renamed from: d */
    public static long m108010d(String str) {
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119978p()) {
            return m1Var.mo119980r();
        }
        C86009m1[] u = m1Var.mo119984u();
        if (u != null) {
            for (C86009m1 m1Var2 : u) {
                if (m1Var2 != null) {
                    j += m108010d(m1Var2.mo119971i());
                }
            }
        }
        return j;
    }

    /* renamed from: e */
    public static long m108011e(long j, long j2) {
        int i;
        String[] j3 = m108016j();
        if (j3 != null) {
            i = -3;
            m108023q(4, "PlayerUtils", "proxy setting " + m108021o(Arrays.asList(j3).iterator(), "|"), (Throwable) null);
        } else {
            i = -2;
        }
        return ((j - j2) - ((long) (i * XWalkEnvironment.TEST_APK_START_VERSION))) / 100000;
    }

    /* renamed from: f */
    public static long m108012f(long j, long j2) {
        int i;
        String[] j3 = m108016j();
        if (j3 != null) {
            i = -3;
            m108023q(4, "PlayerUtils", "proxy setting " + m108021o(Arrays.asList(j3).iterator(), "|"), (Throwable) null);
        } else {
            i = -2;
        }
        return ((long) (i * XWalkEnvironment.TEST_APK_START_VERSION)) + (j * 100000) + j2;
    }

    /* renamed from: g */
    public static String m108013g(Throwable th) {
        return m108014h(th, false);
    }

    /* renamed from: h */
    public static String m108014h(Throwable th, boolean z) {
        if (th == null) {
            return "";
        }
        Thread currentThread = Thread.currentThread();
        StringBuilder sb = new StringBuilder();
        if (!z) {
            sb.append("Exception in thread \"");
            sb.append(currentThread.getName());
            sb.append(FastJsonResponse.QUOTE);
            sb.append(th.toString());
        }
        for (StackTraceElement append : th.getStackTrace()) {
            sb.append("\tat ");
            sb.append(append);
            sb.append("\n");
        }
        Throwable targetException = th instanceof InvocationTargetException ? ((InvocationTargetException) th).getTargetException() : th.getCause();
        if (targetException != null) {
            sb.append("caused by: ");
            sb.append(targetException.toString());
            sb.append("\n");
            sb.append(m108014h(targetException, true));
        }
        return sb.toString();
    }

    /* renamed from: i */
    public static long m108015i(Map<String, List<String>> map) {
        if (map == null) {
            return -99999;
        }
        long s = m108025s(map.get("x-server-error"));
        if (s != -1 && s != 0) {
            return s;
        }
        long s2 = m108025s(map.get("x-proxy-error"));
        if (s2 != -1) {
            return s2 - 20000;
        }
        long s3 = m108025s(map.get("error"));
        if (s3 != -1) {
            return s3;
        }
        return -99999;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] m108016j() {
        /*
            r0 = 0
            java.lang.Class<android.net.ConnectivityManager> r1 = android.net.ConnectivityManager.class
            java.lang.String r2 = "getProxy"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception | NoSuchMethodException -> 0x002c }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ Exception | NoSuchMethodException -> 0x002c }
            an0.a r2 = an0.C79592a.m96648a()     // Catch:{  }
            r2.getClass()     // Catch:{  }
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{  }
            java.lang.String r4 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r4)     // Catch:{  }
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch:{  }
            if (r1 != 0) goto L_0x0028
            return r0
        L_0x0028:
            java.lang.String[] r0 = m108017k(r1)     // Catch:{  }
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fn0.C87002g.m108016j():java.lang.String[]");
    }

    /* renamed from: k */
    public static String[] m108017k(Object obj) {
        Class<?> cls = Class.forName("android.net.ProxyProperties");
        String[] strArr = {(String) cls.getMethod("getHost", new Class[0]).invoke(obj, new Object[0]), String.valueOf((Integer) cls.getMethod("getPort", new Class[0]).invoke(obj, new Object[0])), (String) cls.getMethod("getExclusionList", new Class[0]).invoke(obj, new Object[0])};
        if (strArr[0] != null) {
            return strArr;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m108018l(java.lang.String r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "/"
            boolean r0 = r10.startsWith(r0)
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "file:"
            boolean r0 = r10.startsWith(r0)
            if (r0 == 0) goto L_0x0022
        L_0x0020:
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r0 == 0) goto L_0x0028
            java.lang.String r10 = "local"
            return r10
        L_0x0028:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0052
            dn0.m r0 = dn0.C86368m.m106993b()
            dn0.o r0 = r0.f251100a
            r0.getClass()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "http://127.0.0.1:"
            r4.append(r5)
            int r0 = r0.f251110d
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            boolean r0 = r10.startsWith(r0)
            if (r0 != 0) goto L_0x0052
            r0 = 1
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r0 == 0) goto L_0x0058
            java.lang.String r10 = "noproxy"
            return r10
        L_0x0058:
            java.util.regex.Pattern r0 = fn0.C87000e.f252477h
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0071
            java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = fn0.C87000e.f252478i
            boolean r0 = r0.containsKey(r10)
            if (r0 == 0) goto L_0x0071
            java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = fn0.C87000e.f252478i
            java.lang.Object r0 = r0.get(r10)
            java.util.Map r0 = (java.util.Map) r0
            goto L_0x00e0
        L_0x0071:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r4 = "UTF-8"
            if (r10 == 0) goto L_0x00e0
            r5 = 63
            int r5 = r10.indexOf(r5)
            if (r5 < 0) goto L_0x00e0
            int r5 = r5 + r3
            java.lang.String r5 = r10.substring(r5)
            java.lang.String r6 = "&"
            java.lang.String[] r5 = r5.split(r6)
            r6 = 0
        L_0x008e:
            int r7 = r5.length     // Catch:{ IOException -> 0x00d5 }
            if (r6 >= r7) goto L_0x00cf
            r7 = r5[r6]     // Catch:{ IOException -> 0x00d5 }
            java.lang.String r8 = "="
            java.lang.String[] r7 = r7.split(r8)     // Catch:{ IOException -> 0x00d5 }
            int r8 = r7.length     // Catch:{ IOException -> 0x00d5 }
            r9 = 2
            if (r8 != r9) goto L_0x00ad
            r8 = r7[r2]     // Catch:{ IOException -> 0x00d5 }
            java.lang.String r8 = java.net.URLDecoder.decode(r8, r4)     // Catch:{ IOException -> 0x00d5 }
            r7 = r7[r3]     // Catch:{ IOException -> 0x00d5 }
            java.lang.String r7 = java.net.URLDecoder.decode(r7, r4)     // Catch:{ IOException -> 0x00d5 }
            r0.put(r8, r7)     // Catch:{ IOException -> 0x00d5 }
            goto L_0x00cc
        L_0x00ad:
            int r8 = r7.length     // Catch:{ IOException -> 0x00d5 }
            if (r8 != r3) goto L_0x00cc
            r8 = r5[r6]     // Catch:{ IOException -> 0x00d5 }
            r9 = 61
            int r8 = r8.indexOf(r9)     // Catch:{ IOException -> 0x00d5 }
            r9 = r5[r6]     // Catch:{ IOException -> 0x00d5 }
            int r9 = r9.length()     // Catch:{ IOException -> 0x00d5 }
            int r9 = r9 - r3
            if (r8 != r9) goto L_0x00cc
            r7 = r7[r2]     // Catch:{ IOException -> 0x00d5 }
            java.lang.String r7 = java.net.URLDecoder.decode(r7, r4)     // Catch:{ IOException -> 0x00d5 }
            java.lang.String r8 = ""
            r0.put(r7, r8)     // Catch:{ IOException -> 0x00d5 }
        L_0x00cc:
            int r6 = r6 + 1
            goto L_0x008e
        L_0x00cf:
            java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r3 = fn0.C87000e.f252478i     // Catch:{ IOException -> 0x00d5 }
            r3.put(r10, r0)     // Catch:{ IOException -> 0x00d5 }
            goto L_0x00e0
        L_0x00d5:
            r3 = move-exception
            r4 = 5
            java.lang.String r2 = m108014h(r3, r2)
            java.lang.String r3 = "HttpParser"
            m108023q(r4, r3, r2, r1)
        L_0x00e0:
            if (r0 == 0) goto L_0x00f2
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x00e9
            goto L_0x00f2
        L_0x00e9:
            java.lang.String r10 = "id"
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L_0x00f2:
            r0 = 6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getVideoUuidFromVideoUrl fail "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            java.lang.String r2 = "PlayerUtils"
            m108023q(r0, r2, r10, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fn0.C87002g.m108018l(java.lang.String):java.lang.String");
    }

    /* renamed from: m */
    public static boolean m108019m(String str) {
        if (f252488c.containsKey(str)) {
            return f252488c.get(str).booleanValue();
        }
        boolean z = str.contains("m3u8") || str.contains("m3u");
        f252488c.put(str, Boolean.valueOf(z));
        return z;
    }

    /* renamed from: n */
    public static boolean m108020n() {
        ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        m108023q(5, "PlayerUtils", "isNetworkAvailable cant access ConnectivityManager missing permission?", (Throwable) null);
        return false;
    }

    /* renamed from: o */
    public static String m108021o(Iterator<String> it, String str) {
        String str2 = "";
        if (it != null) {
            while (it.hasNext()) {
                str2 = str2 + it.next();
                if (it.hasNext()) {
                    str2 = str2 + str;
                }
            }
        }
        return str2;
    }

    /* renamed from: p */
    public static void m108022p(int i, String str, String str2) {
        m108023q(i, str, str2, (Throwable) null);
    }

    /* renamed from: q */
    public static void m108023q(int i, String str, String str2, Throwable th) {
        int i2 = 0;
        if (th != null) {
            str2 = str2 + XVFSFile.PATH_SEPARATOR + m108014h(th, false);
        }
        if (str2.length() > 1000) {
            ArrayList arrayList = new ArrayList(((str2.length() + 1000) - 1) / 1000);
            while (i2 < str2.length()) {
                int i3 = i2 + 1000;
                arrayList.add(str2.substring(i2, Math.min(str2.length(), i3)));
                i2 = i3;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m108022p(i, str, (String) it.next());
            }
        } else if (C79592a.m96648a().f233410m != null) {
            if (i == 2) {
                Log.m105926v("WxPlayer/" + str, str2);
            } else if (i == 3) {
                Log.m105918d("WxPlayer/" + str, str2);
            } else if (i == 4) {
                Log.m105924i("WxPlayer/" + str, str2);
            } else if (i == 5) {
                Log.m105928w("WxPlayer/" + str, str2);
            } else if (i == 6) {
                Log.m105920e("WxPlayer/" + str, str2);
            }
        }
    }

    /* renamed from: r */
    public static void m108024r(HttpURLConnection httpURLConnection, long j) {
        int i = f252486a;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (IOException | Exception unused) {
            }
        }
    }

    /* renamed from: s */
    public static long m108025s(List<String> list) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        String str = list.get(0);
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            m108023q(6, "PlayerUtils", "getSubErrorCode: long string is ill-format", (Throwable) null);
            return -1;
        }
    }

    /* renamed from: t */
    public static int m108026t(String str) {
        int i;
        String u = m108027u(str);
        if (TextUtils.isEmpty(u)) {
            return -1;
        }
        try {
            i = Integer.parseInt(u);
        } catch (Exception e) {
            m108023q(6, "PlayerUtils", "parseM3u8Number error " + e, (Throwable) null);
            i = -1;
        }
        if (i != -1) {
            return i;
        }
        try {
            return (int) Float.parseFloat(u);
        } catch (Exception e2) {
            m108023q(6, "PlayerUtils", "parseM3u8Number error " + e2, (Throwable) null);
            return i;
        }
    }

    /* renamed from: u */
    public static String m108027u(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str) || !str.startsWith("#") || (indexOf = str.indexOf(XVFSFile.PATH_SEPARATOR)) == -1) {
            return "";
        }
        String substring = str.substring(indexOf + 1);
        return str.lastIndexOf(",") != -1 ? substring.substring(0, substring.length() - 1) : substring;
    }

    /* renamed from: v */
    public static String m108028v(String str) {
        String str2;
        URL url;
        if (!TextUtils.isEmpty(str)) {
            String str3 = f252487b.get(str);
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        C79721e eVar = C79592a.m96648a().f233413p;
        if (!URLUtil.isNetworkUrl(str)) {
            str2 = str;
        } else {
            String substring = (str == null || !str.startsWith("http://mpvideo.qpic.cn")) ? str : str.substring(0, str.indexOf("?"));
            str2 = null;
            try {
                url = new URL(substring);
            } catch (MalformedURLException e) {
                m108023q(6, "DefaultCacheKeyGenerator", m108014h(e, false), (Throwable) null);
                url = null;
            }
            if (url != null) {
                str2 = MD5Util.getMD5String(substring).substring(0, 20);
            }
        }
        f252487b.put(str, str2);
        return str2;
    }

    /* renamed from: w */
    public static String m108029w(String str, String str2) {
        if (str2 == null) {
            str2 = "|";
        }
        return str != null ? str.replaceAll("\\r\\n", str2).replaceAll("\\r|\\n", str2) : str;
    }

    /* renamed from: x */
    public static String m108030x(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("/")) {
            return str;
        }
        return "file://" + str;
    }
}
