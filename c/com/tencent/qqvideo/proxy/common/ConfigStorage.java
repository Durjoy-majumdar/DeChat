package com.tencent.qqvideo.proxy.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.qqvideo.proxy.httpproxy.HttpproxyFacade;
import com.tencent.thumbplayer.api.TPPlayerMgr;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigStorage {
    private static String Config_Version = "";
    private static final long GET_CONFIG_INTERVAL = 600000;
    private static long LastGetConfigTime = 0;
    private static final String PREFERENCE = "_httpproxy_preferences";
    public static final String PREF_DOWNPROXY_CONFIG = "DOWNPROXY_CONFIG";
    public static final String PREF_DOWNPROXY_CONFIG_VERSION = "DOWNPROXY_GUID_CONFIG_VERSION";
    private static String TAG = "TV_Httpproxy";
    private static final String TVHttpProxy_Version = "V1.0.186.0011";
    private static final String TVHttpProxy_Version_Code = "101860011";
    private static final String TVHttpProxy_channel_id = "186";
    private static final int[] connectTimeOut = {5000, 5000, 10000};
    private static String guid = "123";
    private static final String httpsCrtFileName = "videosdkcrt/sec.video.qq.com.crt";
    private static final String ipflag = "1";
    private static final String otype = "json";
    private static final String platform = "aphone";
    private static final int[] readTimeOut = {10000, 10000, 15000};
    private static final int[] retryTimes = {3, 2};
    private static String sharedPreferencesName = null;
    private static final String url = "https://sec.video.qq.com/p/wxconf/getmfomat";
    private Thread thread = null;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:74|(2:26|27)|28|29|30) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:(2:33|34)|35|36|37|76|62) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:55|56|(2:58|59)|(1:78)|52|53|79) */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0102, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r3 = TAG;
        com.tencent.qqvideo.proxy.httpproxy.HttpproxyFacade.print(6, r3, "IO Exception" + java.lang.System.err);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0127, code lost:
        if (r4 != null) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012e, code lost:
        if (r5 != null) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0133, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00e0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00ed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0104 */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7 A[SYNTHETIC, Splitter:B:48:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0123 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String fetchTextFromUrl(java.lang.String r18, android.content.Context r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            javax.net.ssl.SSLContext r0 = r1.getHttpsSSLContext(r0)
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x000d
            return r2
        L_0x000d:
            r4 = 0
            r5 = r4
            r6 = 0
        L_0x0010:
            r7 = 2
            if (r6 < r7) goto L_0x0014
            return r2
        L_0x0014:
            r7 = 4
            r8 = 1
            if (r6 != r8) goto L_0x0031
            java.lang.String r8 = r17.getBkDomain(r18)
            java.lang.String r9 = TAG
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "请求备份域名:"
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            com.tencent.qqvideo.proxy.httpproxy.HttpproxyFacade.print(r7, r9, r10)
            goto L_0x0033
        L_0x0031:
            r8 = r18
        L_0x0033:
            r9 = 0
        L_0x0034:
            int[] r10 = retryTimes
            r10 = r10[r6]
            if (r9 < r10) goto L_0x003d
            int r6 = r6 + 1
            goto L_0x0010
        L_0x003d:
            r10 = 6
            java.lang.String r11 = TAG     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            java.lang.String r13 = " 第"
            r12.<init>(r13)     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            int r13 = r9 + 1
            r12.append(r13)     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            java.lang.String r13 = " 次CGI请求:"
            r12.append(r13)     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            r12.append(r8)     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            com.tencent.qqvideo.proxy.httpproxy.HttpproxyFacade.print(r7, r11, r12)     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            java.net.URL r13 = new java.net.URL     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            r13.<init>(r8)     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            java.net.URLConnection r13 = r13.openConnection()     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            javax.net.ssl.HttpsURLConnection r13 = (javax.net.ssl.HttpsURLConnection) r13     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            int[] r14 = connectTimeOut     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            r14 = r14[r9]     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            r13.setConnectTimeout(r14)     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            int[] r14 = readTimeOut     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            r14 = r14[r9]     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            r13.setReadTimeout(r14)     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            javax.net.ssl.SSLSocketFactory r14 = r0.getSocketFactory()     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            r13.setSSLSocketFactory(r14)     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            java.io.InputStream r4 = r13.getInputStream()     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            r13.<init>()     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            java.io.BufferedReader r14 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            java.io.InputStreamReader r15 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            java.lang.String r3 = "utf-8"
            r15.<init>(r4, r3)     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
            r14.<init>(r15)     // Catch:{ IOException -> 0x0104, all -> 0x00ed }
        L_0x0095:
            java.lang.String r3 = r14.readLine()     // Catch:{ IOException -> 0x00eb, all -> 0x00e9 }
            if (r3 != 0) goto L_0x00e5
            java.lang.String r3 = r13.toString()     // Catch:{ IOException -> 0x00eb, all -> 0x00e9 }
            java.lang.String r5 = TAG     // Catch:{ IOException -> 0x00eb, all -> 0x00e9 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00eb, all -> 0x00e9 }
            java.lang.String r15 = "【connect】连接时间："
            r13.<init>(r15)     // Catch:{ IOException -> 0x00eb, all -> 0x00e9 }
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00eb, all -> 0x00e9 }
            long r11 = r15 - r11
            r13.append(r11)     // Catch:{ IOException -> 0x00eb, all -> 0x00e9 }
            java.lang.String r11 = "返回数据："
            r13.append(r11)     // Catch:{ IOException -> 0x00eb, all -> 0x00e9 }
            r13.append(r3)     // Catch:{ IOException -> 0x00eb, all -> 0x00e9 }
            java.lang.String r11 = r13.toString()     // Catch:{ IOException -> 0x00eb, all -> 0x00e9 }
            com.tencent.qqvideo.proxy.httpproxy.HttpproxyFacade.print(r7, r5, r11)     // Catch:{ IOException -> 0x00eb, all -> 0x00e9 }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IOException -> 0x00eb, all -> 0x00e9 }
            if (r5 != 0) goto L_0x00db
            java.lang.String r5 = r3.trim()     // Catch:{ IOException -> 0x00eb, all -> 0x00e9 }
            boolean r5 = r5.isEmpty()     // Catch:{ IOException -> 0x00eb, all -> 0x00e9 }
            if (r5 != 0) goto L_0x00db
            if (r4 == 0) goto L_0x00d7
            r4.close()     // Catch:{ IOException -> 0x00d7 }
        L_0x00d7:
            r14.close()     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            return r3
        L_0x00db:
            if (r4 == 0) goto L_0x00e0
            r4.close()     // Catch:{ IOException -> 0x00e0 }
        L_0x00e0:
            r14.close()     // Catch:{ IOException -> 0x00e3 }
        L_0x00e3:
            r5 = r14
            goto L_0x0123
        L_0x00e5:
            r13.append(r3)     // Catch:{ IOException -> 0x00eb, all -> 0x00e9 }
            goto L_0x0095
        L_0x00e9:
            r5 = r14
            goto L_0x00ed
        L_0x00eb:
            r5 = r14
            goto L_0x0104
        L_0x00ed:
            java.lang.String r3 = TAG     // Catch:{ all -> 0x0102 }
            java.lang.String r11 = "unknow exception"
            com.tencent.qqvideo.proxy.httpproxy.HttpproxyFacade.print(r10, r3, r11)     // Catch:{ all -> 0x0102 }
            if (r4 == 0) goto L_0x00fc
            r4.close()     // Catch:{ IOException -> 0x00fb }
            goto L_0x00fc
        L_0x00fb:
        L_0x00fc:
            if (r5 == 0) goto L_0x0123
        L_0x00fe:
            r5.close()     // Catch:{ IOException -> 0x0123 }
            goto L_0x0123
        L_0x0102:
            r0 = move-exception
            goto L_0x0127
        L_0x0104:
            java.lang.String r3 = TAG     // Catch:{ all -> 0x0102 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            java.lang.String r12 = "IO Exception"
            r11.<init>(r12)     // Catch:{ all -> 0x0102 }
            java.io.PrintStream r12 = java.lang.System.err     // Catch:{ all -> 0x0102 }
            r11.append(r12)     // Catch:{ all -> 0x0102 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0102 }
            com.tencent.qqvideo.proxy.httpproxy.HttpproxyFacade.print(r10, r3, r11)     // Catch:{ all -> 0x0102 }
            if (r4 == 0) goto L_0x0120
            r4.close()     // Catch:{ IOException -> 0x011f }
            goto L_0x0120
        L_0x011f:
        L_0x0120:
            if (r5 == 0) goto L_0x0123
            goto L_0x00fe
        L_0x0123:
            int r9 = r9 + 1
            goto L_0x0034
        L_0x0127:
            if (r4 == 0) goto L_0x012e
            r4.close()     // Catch:{ IOException -> 0x012d }
            goto L_0x012e
        L_0x012d:
        L_0x012e:
            if (r5 == 0) goto L_0x0133
            r5.close()     // Catch:{ IOException -> 0x0133 }
        L_0x0133:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqvideo.proxy.common.ConfigStorage.fetchTextFromUrl(java.lang.String, android.content.Context):java.lang.String");
    }

    public static SharedPreferences getAppSharedPreferences(Context context) {
        if (sharedPreferencesName == null) {
            sharedPreferencesName = String.valueOf(context.getPackageName()) + PREFERENCE;
        }
        return getSharedPreferences(context, sharedPreferencesName, 0);
    }

    private String getBkDomain(String str) {
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public static String getConfigVersion() {
        return Config_Version;
    }

    private static String getConfigVersionFromSharedPreference(Context context) {
        return context == null ? "" : getAppSharedPreferences(context).getString(PREF_DOWNPROXY_CONFIG_VERSION, "");
    }

    public static String getDownProxyConfig(Context context) {
        if (context == null) {
            return "";
        }
        Config_Version = getConfigVersionFromSharedPreference(context);
        return getAppSharedPreferences(context).getString(PREF_DOWNPROXY_CONFIG, "");
    }

    public static String getHttpProxyVersion() {
        return TVHttpProxy_Version;
    }

    public static String getHttpProxyVersionCode() {
        return TVHttpProxy_Version_Code;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062 A[SYNTHETIC, Splitter:B:17:0x0062] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private javax.net.ssl.SSLContext getHttpsSSLContext(android.content.Context r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch:{ all -> 0x0046 }
            android.content.res.AssetManager r7 = r7.getAssets()     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = "videosdkcrt/sec.video.qq.com.crt"
            java.io.InputStream r7 = r7.open(r2)     // Catch:{ all -> 0x0046 }
            java.security.cert.Certificate r1 = r1.generateCertificate(r7)     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = java.security.KeyStore.getDefaultType()     // Catch:{ all -> 0x0044 }
            java.security.KeyStore r2 = java.security.KeyStore.getInstance(r2)     // Catch:{ all -> 0x0044 }
            r2.load(r0, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = "ca"
            r2.setCertificateEntry(r3, r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch:{ all -> 0x0044 }
            javax.net.ssl.TrustManagerFactory r1 = javax.net.ssl.TrustManagerFactory.getInstance(r1)     // Catch:{ all -> 0x0044 }
            r1.init(r2)     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "TLS"
            javax.net.ssl.SSLContext r2 = javax.net.ssl.SSLContext.getInstance(r2)     // Catch:{ all -> 0x0044 }
            javax.net.ssl.TrustManager[] r1 = r1.getTrustManagers()     // Catch:{ all -> 0x0044 }
            r2.init(r0, r1, r0)     // Catch:{ all -> 0x0044 }
            if (r7 == 0) goto L_0x0043
            r7.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            return r2
        L_0x0044:
            r1 = move-exception
            goto L_0x0048
        L_0x0046:
            r1 = move-exception
            r7 = r0
        L_0x0048:
            r2 = 6
            java.lang.String r3 = TAG     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = "getHttpsSSLContext unknow exception:"
            r4.<init>(r5)     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = android.util.Log.getStackTraceString(r1)     // Catch:{ all -> 0x0066 }
            r4.append(r1)     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0066 }
            com.tencent.qqvideo.proxy.httpproxy.HttpproxyFacade.print(r2, r3, r1)     // Catch:{ all -> 0x0066 }
            if (r7 == 0) goto L_0x0065
            r7.close()     // Catch:{ IOException -> 0x0065 }
        L_0x0065:
            return r0
        L_0x0066:
            r0 = move-exception
            if (r7 == 0) goto L_0x006c
            r7.close()     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqvideo.proxy.common.ConfigStorage.getHttpsSSLContext(android.content.Context):javax.net.ssl.SSLContext");
    }

    public static SharedPreferences getSharedPreferences(Context context, String str, int i) {
        return context.getSharedPreferences(str, i);
    }

    private String makeGetServerConfigUrl(Context context) {
        return String.format("%s?platform=%s&appver=%s&player_channel_id=%s&otype=%s&ipflag=%s&guid=%s", new Object[]{url, platform, TVHttpProxy_Version, TVHttpProxy_channel_id, otype, "1", guid});
    }

    private boolean needGetConfig() {
        if (LastGetConfigTime == 0) {
            LastGetConfigTime = System.currentTimeMillis();
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = LastGetConfigTime;
        if (currentTimeMillis - j <= GET_CONFIG_INTERVAL && currentTimeMillis >= j) {
            return false;
        }
        LastGetConfigTime = System.currentTimeMillis();
        return true;
    }

    private static void setConfigVersionToSharedPreference(Context context, String str) {
        if (context != null && str != null) {
            getAppSharedPreferences(context).edit().putString(PREF_DOWNPROXY_CONFIG_VERSION, str).commit();
        }
    }

    public static void setDownProxyConfig(Context context, String str) {
        getAppSharedPreferences(context).edit().putString(PREF_DOWNPROXY_CONFIG, str).commit();
    }

    /* access modifiers changed from: private */
    public void synGetConfig(Context context) {
        if (!needGetConfig()) {
            String str = TAG;
            HttpproxyFacade.print(4, str, "last get config time:" + System.currentTimeMillis() + ",so get config just return");
            return;
        }
        int i = -1;
        try {
            JSONObject jSONObject = new JSONObject(fetchTextFromUrl(makeGetServerConfigUrl(context), context));
            if (jSONObject.has(TPPlayerMgr.PROXY_HOST_KEY)) {
                i = 0;
                String str2 = TAG;
                HttpproxyFacade.print(3, str2, "get httpproxy_config:" + jSONObject.getString(TPPlayerMgr.PROXY_HOST_KEY));
                setDownProxyConfig(context, jSONObject.getString(TPPlayerMgr.PROXY_HOST_KEY));
            }
            if (jSONObject.has("config_ver")) {
                setConfigVersionToSharedPreference(context, jSONObject.getString("config_ver"));
            }
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "get config exception");
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StateEvent.Name.ERROR_CODE, i);
            jSONObject2.put("report_type", 90);
            HttpproxyFacade.jsonReport(jSONObject2.toString());
        } catch (JSONException unused2) {
        }
    }

    public void stopGetServerConfig() {
        try {
            Thread thread2 = this.thread;
            if (thread2 != null) {
                thread2.interrupt();
            }
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "thread create exception");
        }
    }

    public void synGetServerConfig(final Context context) {
        if (context == null) {
            HttpproxyFacade.print(6, TAG, "synGetServerConfig context is null");
            return;
        }
        try {
            Thread thread2 = new Thread(new Runnable() {
                public void run() {
                    ConfigStorage.this.synGetConfig(context);
                }
            });
            this.thread = thread2;
            thread2.start();
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "thread create exception");
        }
    }
}
