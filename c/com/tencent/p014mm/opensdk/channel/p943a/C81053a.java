package com.tencent.p014mm.opensdk.channel.p943a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.utils.C81058b;
import com.tencent.p014mm.opensdk.utils.Log;
import java.security.MessageDigest;

/* renamed from: com.tencent.mm.opensdk.channel.a.a */
public class C81053a {

    /* renamed from: com.tencent.mm.opensdk.channel.a.a$a */
    public static class C81054a {

        /* renamed from: a */
        public String f238074a;

        /* renamed from: b */
        public String f238075b;

        /* renamed from: c */
        public String f238076c;

        /* renamed from: d */
        public long f238077d;

        /* renamed from: e */
        public Bundle f238078e;
    }

    /* renamed from: a */
    public static int m99032a(Bundle bundle, String str, int i) {
        if (bundle == null) {
            return i;
        }
        try {
            return bundle.getInt(str, i);
        } catch (Exception e) {
            Log.m99044e("MicroMsg.IntentUtil", "getIntExtra exception:" + e.getMessage());
            return i;
        }
    }

    /* renamed from: a */
    public static Object m99033a(int i, String str) {
        switch (i) {
            case 1:
                return Integer.valueOf(str);
            case 2:
                return Long.valueOf(str);
            case 3:
                return str;
            case 4:
                return Boolean.valueOf(str);
            case 5:
                return Float.valueOf(str);
            case 6:
                try {
                    return Double.valueOf(str);
                } catch (Exception e) {
                    Log.m99044e("MicroMsg.SDK.PluginProvider.Resolver", "resolveObj exception:" + e.getMessage());
                    return null;
                }
            default:
                Log.m99044e("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
                return null;
        }
    }

    /* renamed from: a */
    public static String m99034a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (Exception e) {
            Log.m99044e("MicroMsg.IntentUtil", "getStringExtra exception:" + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m99035a(Context context, C81054a aVar) {
        String str;
        if (context == null || aVar == null) {
            str = "send fail, invalid argument";
        } else if (C81058b.m99052b(aVar.f238075b)) {
            str = "send fail, action is null";
        } else {
            String str2 = null;
            if (!C81058b.m99052b(aVar.f238074a)) {
                str2 = aVar.f238074a + ".permission.MM_MESSAGE";
            }
            Intent intent = new Intent(aVar.f238075b);
            Bundle bundle = aVar.f238078e;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            String packageName = context.getPackageName();
            intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
            intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
            intent.putExtra(ConstantsAPI.CONTENT, aVar.f238076c);
            intent.putExtra(ConstantsAPI.APP_SUPORT_CONTENT_TYPE, aVar.f238077d);
            intent.putExtra(ConstantsAPI.CHECK_SUM, m99037a(aVar.f238076c, (int) Build.SDK_INT, packageName));
            context.sendBroadcast(intent, str2);
            Log.m99043d("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + str2);
            return true;
        }
        Log.m99044e("MicroMsg.SDK.MMessage", str);
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r3v38 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x019f A[SYNTHETIC, Splitter:B:104:0x019f] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01d8 A[SYNTHETIC, Splitter:B:115:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01f5 A[SYNTHETIC, Splitter:B:120:0x01f5] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0212 A[SYNTHETIC, Splitter:B:125:0x0212] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x024b A[SYNTHETIC, Splitter:B:136:0x024b] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0268 A[SYNTHETIC, Splitter:B:141:0x0268] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0285 A[SYNTHETIC, Splitter:B:146:0x0285] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02a7 A[SYNTHETIC, Splitter:B:154:0x02a7] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02c4 A[SYNTHETIC, Splitter:B:159:0x02c4] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02e1 A[SYNTHETIC, Splitter:B:164:0x02e1] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0165 A[SYNTHETIC, Splitter:B:94:0x0165] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0182 A[SYNTHETIC, Splitter:B:99:0x0182] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:112:0x01c0=Splitter:B:112:0x01c0, B:133:0x0233=Splitter:B:133:0x0233, B:91:0x014d=Splitter:B:91:0x014d} */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m99036a(java.lang.String r8, int r9) {
        /*
            java.lang.String r0 = "httpGet ex:"
            r1 = 0
            java.lang.String r2 = "MicroMsg.SDK.NetUtil"
            if (r8 == 0) goto L_0x02fd
            int r3 = r8.length()
            if (r3 != 0) goto L_0x000f
            goto L_0x02fd
        L_0x000f:
            java.net.URL r3 = new java.net.URL     // Catch:{ MalformedURLException -> 0x022e, IOException -> 0x01bb, Exception -> 0x0148, all -> 0x013f }
            r3.<init>(r8)     // Catch:{ MalformedURLException -> 0x022e, IOException -> 0x01bb, Exception -> 0x0148, all -> 0x013f }
            java.net.URLConnection r8 = r3.openConnection()     // Catch:{ MalformedURLException -> 0x022e, IOException -> 0x01bb, Exception -> 0x0148, all -> 0x013f }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ MalformedURLException -> 0x022e, IOException -> 0x01bb, Exception -> 0x0148, all -> 0x013f }
            if (r8 != 0) goto L_0x0048
            java.lang.String r9 = "open connection failed."
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r9)     // Catch:{ MalformedURLException -> 0x0046, IOException -> 0x0044, Exception -> 0x0042, all -> 0x0040 }
            if (r8 == 0) goto L_0x003f
            r8.disconnect()     // Catch:{ all -> 0x0028 }
            goto L_0x003f
        L_0x0028:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x003f:
            return r1
        L_0x0040:
            r9 = move-exception
            goto L_0x007c
        L_0x0042:
            r9 = move-exception
            goto L_0x007f
        L_0x0044:
            r9 = move-exception
            goto L_0x0083
        L_0x0046:
            r9 = move-exception
            goto L_0x0087
        L_0x0048:
            java.lang.String r3 = "GET"
            r8.setRequestMethod(r3)     // Catch:{ MalformedURLException -> 0x013b, IOException -> 0x0137, Exception -> 0x0134, all -> 0x0131 }
            r8.setConnectTimeout(r9)     // Catch:{ MalformedURLException -> 0x013b, IOException -> 0x0137, Exception -> 0x0134, all -> 0x0131 }
            r8.setReadTimeout(r9)     // Catch:{ MalformedURLException -> 0x013b, IOException -> 0x0137, Exception -> 0x0134, all -> 0x0131 }
            int r9 = r8.getResponseCode()     // Catch:{ MalformedURLException -> 0x013b, IOException -> 0x0137, Exception -> 0x0134, all -> 0x0131 }
            r3 = 300(0x12c, float:4.2E-43)
            if (r9 < r3) goto L_0x008b
            java.lang.String r9 = "httpURLConnectionGet 300"
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r9)     // Catch:{ MalformedURLException -> 0x0046, IOException -> 0x0044, Exception -> 0x0042, all -> 0x0040 }
            r8.disconnect()     // Catch:{ all -> 0x0064 }
            goto L_0x007b
        L_0x0064:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x007b:
            return r1
        L_0x007c:
            r3 = r1
            goto L_0x02a5
        L_0x007f:
            r3 = r1
            r4 = r3
            goto L_0x014d
        L_0x0083:
            r3 = r1
            r4 = r3
            goto L_0x01c0
        L_0x0087:
            r3 = r1
            r4 = r3
            goto L_0x0233
        L_0x008b:
            java.io.InputStream r9 = r8.getInputStream()     // Catch:{ MalformedURLException -> 0x013b, IOException -> 0x0137, Exception -> 0x0134, all -> 0x0131 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ MalformedURLException -> 0x012b, IOException -> 0x0125, Exception -> 0x0120, all -> 0x011b }
            r3.<init>()     // Catch:{ MalformedURLException -> 0x012b, IOException -> 0x0125, Exception -> 0x0120, all -> 0x011b }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ MalformedURLException -> 0x0114, IOException -> 0x010d, Exception -> 0x0106, all -> 0x00ff }
        L_0x0098:
            int r5 = r9.read(r4)     // Catch:{ MalformedURLException -> 0x0114, IOException -> 0x010d, Exception -> 0x0106, all -> 0x00ff }
            r6 = -1
            if (r5 == r6) goto L_0x00a4
            r6 = 0
            r3.write(r4, r6, r5)     // Catch:{ MalformedURLException -> 0x0114, IOException -> 0x010d, Exception -> 0x0106, all -> 0x00ff }
            goto L_0x0098
        L_0x00a4:
            byte[] r4 = r3.toByteArray()     // Catch:{ MalformedURLException -> 0x0114, IOException -> 0x010d, Exception -> 0x0106, all -> 0x00ff }
            java.lang.String r5 = "httpGet end"
            com.tencent.p014mm.opensdk.utils.Log.m99043d(r2, r5)     // Catch:{ MalformedURLException -> 0x0114, IOException -> 0x010d, Exception -> 0x0106, all -> 0x00ff }
            r8.disconnect()     // Catch:{ all -> 0x00b1 }
            goto L_0x00c8
        L_0x00b1:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x00c8:
            r9.close()     // Catch:{ all -> 0x00cc }
            goto L_0x00e3
        L_0x00cc:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x00e3:
            r3.close()     // Catch:{ all -> 0x00e7 }
            goto L_0x00fe
        L_0x00e7:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x00fe:
            return r4
        L_0x00ff:
            r1 = move-exception
            r7 = r3
            r3 = r9
            r9 = r1
            r1 = r7
            goto L_0x0143
        L_0x0106:
            r4 = move-exception
            r7 = r3
            r3 = r9
            r9 = r4
            r4 = r7
            goto L_0x014d
        L_0x010d:
            r4 = move-exception
            r7 = r3
            r3 = r9
            r9 = r4
            r4 = r7
            goto L_0x01c0
        L_0x0114:
            r4 = move-exception
            r7 = r3
            r3 = r9
            r9 = r4
            r4 = r7
            goto L_0x0233
        L_0x011b:
            r3 = move-exception
            r7 = r3
            r3 = r9
            r9 = r7
            goto L_0x0143
        L_0x0120:
            r3 = move-exception
            r7 = r3
            r3 = r9
            r9 = r7
            goto L_0x014c
        L_0x0125:
            r3 = move-exception
            r7 = r3
            r3 = r9
            r9 = r7
            goto L_0x01bf
        L_0x012b:
            r3 = move-exception
            r7 = r3
            r3 = r9
            r9 = r7
            goto L_0x0232
        L_0x0131:
            r9 = move-exception
            r3 = r1
            goto L_0x0143
        L_0x0134:
            r9 = move-exception
            r3 = r1
            goto L_0x014c
        L_0x0137:
            r9 = move-exception
            r3 = r1
            goto L_0x01bf
        L_0x013b:
            r9 = move-exception
            r3 = r1
            goto L_0x0232
        L_0x013f:
            r8 = move-exception
            r9 = r8
            r8 = r1
            r3 = r8
        L_0x0143:
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x02a5
        L_0x0148:
            r8 = move-exception
            r9 = r8
            r8 = r1
            r3 = r8
        L_0x014c:
            r4 = r1
        L_0x014d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a1 }
            r5.<init>()     // Catch:{ all -> 0x02a1 }
            r5.append(r0)     // Catch:{ all -> 0x02a1 }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x02a1 }
            r5.append(r9)     // Catch:{ all -> 0x02a1 }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x02a1 }
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r9)     // Catch:{ all -> 0x02a1 }
            if (r8 == 0) goto L_0x0180
            r8.disconnect()     // Catch:{ all -> 0x0169 }
            goto L_0x0180
        L_0x0169:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x0180:
            if (r3 == 0) goto L_0x019d
            r3.close()     // Catch:{ all -> 0x0186 }
            goto L_0x019d
        L_0x0186:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x019d:
            if (r4 == 0) goto L_0x01ba
            r4.close()     // Catch:{ all -> 0x01a3 }
            goto L_0x01ba
        L_0x01a3:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x01ba:
            return r1
        L_0x01bb:
            r8 = move-exception
            r9 = r8
            r8 = r1
            r3 = r8
        L_0x01bf:
            r4 = r1
        L_0x01c0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a1 }
            r5.<init>()     // Catch:{ all -> 0x02a1 }
            r5.append(r0)     // Catch:{ all -> 0x02a1 }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x02a1 }
            r5.append(r9)     // Catch:{ all -> 0x02a1 }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x02a1 }
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r9)     // Catch:{ all -> 0x02a1 }
            if (r8 == 0) goto L_0x01f3
            r8.disconnect()     // Catch:{ all -> 0x01dc }
            goto L_0x01f3
        L_0x01dc:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x01f3:
            if (r3 == 0) goto L_0x0210
            r3.close()     // Catch:{ all -> 0x01f9 }
            goto L_0x0210
        L_0x01f9:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x0210:
            if (r4 == 0) goto L_0x022d
            r4.close()     // Catch:{ all -> 0x0216 }
            goto L_0x022d
        L_0x0216:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x022d:
            return r1
        L_0x022e:
            r8 = move-exception
            r9 = r8
            r8 = r1
            r3 = r8
        L_0x0232:
            r4 = r1
        L_0x0233:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a1 }
            r5.<init>()     // Catch:{ all -> 0x02a1 }
            r5.append(r0)     // Catch:{ all -> 0x02a1 }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x02a1 }
            r5.append(r9)     // Catch:{ all -> 0x02a1 }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x02a1 }
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r9)     // Catch:{ all -> 0x02a1 }
            if (r8 == 0) goto L_0x0266
            r8.disconnect()     // Catch:{ all -> 0x024f }
            goto L_0x0266
        L_0x024f:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x0266:
            if (r3 == 0) goto L_0x0283
            r3.close()     // Catch:{ all -> 0x026c }
            goto L_0x0283
        L_0x026c:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x0283:
            if (r4 == 0) goto L_0x02a0
            r4.close()     // Catch:{ all -> 0x0289 }
            goto L_0x02a0
        L_0x0289:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x02a0:
            return r1
        L_0x02a1:
            r9 = move-exception
            r1 = r4
            goto L_0x0143
        L_0x02a5:
            if (r8 == 0) goto L_0x02c2
            r8.disconnect()     // Catch:{ all -> 0x02ab }
            goto L_0x02c2
        L_0x02ab:
            r8 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r8 = r8.getMessage()
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x02c2:
            if (r1 == 0) goto L_0x02df
            r1.close()     // Catch:{ all -> 0x02c8 }
            goto L_0x02df
        L_0x02c8:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x02df:
            if (r3 == 0) goto L_0x02fc
            r3.close()     // Catch:{ all -> 0x02e5 }
            goto L_0x02fc
        L_0x02e5:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
        L_0x02fc:
            throw r9
        L_0x02fd:
            java.lang.String r8 = "httpGet, url is null"
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r2, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.opensdk.channel.p943a.C81053a.m99036a(java.lang.String, int):byte[]");
    }

    /* renamed from: a */
    public static byte[] m99037a(String str, int i, String str2) {
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        byte[] bytes = stringBuffer.toString().substring(1, 9).getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bytes);
            char[] cArr2 = new char[(r8 * 2)];
            int i2 = 0;
            for (byte b : instance.digest()) {
                int i3 = i2 + 1;
                cArr2[i2] = cArr[(b >>> 4) & 15];
                i2 = i3 + 1;
                cArr2[i3] = cArr[b & 15];
            }
            str3 = new String(cArr2);
        } catch (Exception unused) {
            str3 = null;
        }
        return str3.getBytes();
    }
}
