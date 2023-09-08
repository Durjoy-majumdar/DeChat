package com.unionpay;

import android.content.Context;
import android.os.Bundle;
import com.unionpay.utils.UPUtils;
import hx3.C76248c;
import ix3.C76375b;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.unionpay.a */
public class C75273a {

    /* renamed from: a */
    public static String f221395a = "";

    /* renamed from: b */
    public static String f221396b = null;

    /* renamed from: c */
    public static String f221397c = null;

    /* renamed from: d */
    public static String f221398d = "";

    /* renamed from: e */
    public static int f221399e;

    /* renamed from: f */
    public static C76248c f221400f;

    /* renamed from: g */
    public static JSONArray f221401g;

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0136, code lost:
        if (r7 != null) goto L_0x0139;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076 A[Catch:{ Exception -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a A[Catch:{ Exception -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093 A[Catch:{ Exception -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f A[Catch:{ Exception -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c5 A[Catch:{ Exception -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ca A[Catch:{ Exception -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d8 A[Catch:{ Exception -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fc A[Catch:{ Exception -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ff A[Catch:{ Exception -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0113 A[SYNTHETIC, Splitter:B:47:0x0113] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012e A[Catch:{ Exception -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0164 A[Catch:{ Exception -> 0x018b }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017b A[Catch:{ Exception -> 0x018b }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0186 A[Catch:{ Exception -> 0x018b }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m90289a(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "0"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "v"
            java.lang.String r3 = "1.5"
            r1.put(r2, r3)     // Catch:{ Exception -> 0x018b }
            java.lang.String r2 = "sdkVerMode"
            java.lang.String r3 = "03"
            r1.put(r2, r3)     // Catch:{ Exception -> 0x018b }
            java.lang.String r2 = "os_name"
            java.lang.String r3 = "android"
            r1.put(r2, r3)     // Catch:{ Exception -> 0x018b }
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x018b }
            if (r2 != 0) goto L_0x0035
            java.lang.String r2 = "tn"
            int r3 = ix3.C76375b.m91799a(r8)     // Catch:{ Exception -> 0x018b }
            java.lang.String r9 = ix3.C76375b.m91805g(r9)     // Catch:{ Exception -> 0x018b }
            java.lang.String r9 = com.unionpay.utils.UPUtils.forWap(r3, r9)     // Catch:{ Exception -> 0x018b }
            r1.put(r2, r9)     // Catch:{ Exception -> 0x018b }
        L_0x0035:
            java.lang.String r9 = "appUuId"
            java.lang.String r2 = "merchant_id"
            java.lang.String r3 = ""
            if (r7 == 0) goto L_0x005f
            java.lang.String r4 = com.unionpay.utils.UPUtils.m90294a(r7, r2)     // Catch:{ Exception -> 0x005f }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x005f }
            if (r5 == 0) goto L_0x0060
            java.util.UUID r4 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x005f }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x005f }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x005f }
            if (r5 != 0) goto L_0x0060
            java.lang.String r5 = "-"
            java.lang.String r4 = r4.replaceAll(r5, r3)     // Catch:{ Exception -> 0x005f }
            com.unionpay.utils.UPUtils.m90296c(r7, r4, r2)     // Catch:{ Exception -> 0x005f }
            goto L_0x0060
        L_0x005f:
            r4 = r3
        L_0x0060:
            r1.put(r9, r4)     // Catch:{ Exception -> 0x018b }
            java.lang.String r9 = "locale"
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x014e }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x014e }
            java.lang.String r4 = "zh"
            boolean r2 = r2.startsWith(r4)     // Catch:{ Exception -> 0x014e }
            if (r2 == 0) goto L_0x007a
            java.lang.String r2 = "zh_CN"
            goto L_0x007c
        L_0x007a:
            java.lang.String r2 = "en_US"
        L_0x007c:
            r1.put(r9, r2)     // Catch:{ Exception -> 0x014e }
            java.lang.String r9 = "terminal_version"
            java.lang.String r2 = "3.5.9"
            r1.put(r9, r2)     // Catch:{ Exception -> 0x014e }
            java.lang.String r9 = "terminal_resolution"
            r2 = 0
            if (r7 == 0) goto L_0x009f
            android.content.res.Resources r4 = r7.getResources()     // Catch:{ Exception -> 0x014e }
            if (r4 == 0) goto L_0x009f
            android.util.DisplayMetrics r2 = r4.getDisplayMetrics()     // Catch:{ Exception -> 0x014e }
            int r4 = r2.widthPixels     // Catch:{ Exception -> 0x014e }
            int r2 = r2.heightPixels     // Catch:{ Exception -> 0x014e }
            r6 = r4
            r4 = r2
            r2 = r6
            goto L_0x00a0
        L_0x009f:
            r4 = 0
        L_0x00a0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014e }
            r5.<init>()     // Catch:{ Exception -> 0x014e }
            r5.append(r2)     // Catch:{ Exception -> 0x014e }
            java.lang.String r2 = "*"
            r5.append(r2)     // Catch:{ Exception -> 0x014e }
            r5.append(r4)     // Catch:{ Exception -> 0x014e }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x014e }
            java.lang.String r2 = r2.trim()     // Catch:{ Exception -> 0x014e }
            r1.put(r9, r2)     // Catch:{ Exception -> 0x014e }
            java.lang.String r9 = "os_version"
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x014e }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x014e }
            if (r4 != 0) goto L_0x00ca
            java.lang.String r2 = r2.trim()     // Catch:{ Exception -> 0x014e }
            goto L_0x00cb
        L_0x00ca:
            r2 = r3
        L_0x00cb:
            r1.put(r9, r2)     // Catch:{ Exception -> 0x014e }
            java.lang.String r9 = "device_model"
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ Exception -> 0x014e }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x014e }
            if (r4 != 0) goto L_0x00e9
            java.lang.String r2 = r2.trim()     // Catch:{ Exception -> 0x014e }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x014e }
            if (r4 != 0) goto L_0x00e9
            java.lang.String r4 = " "
            java.lang.String r2 = r2.replace(r4, r3)     // Catch:{ Exception -> 0x014e }
            goto L_0x00ea
        L_0x00e9:
            r2 = r3
        L_0x00ea:
            r1.put(r9, r2)     // Catch:{ Exception -> 0x014e }
            java.lang.String r9 = "root"
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x014e }
            java.lang.String r4 = "/system/bin/su"
            r2.<init>(r4)     // Catch:{ Exception -> 0x014e }
            boolean r2 = r2.exists()     // Catch:{ Exception -> 0x014e }
            if (r2 == 0) goto L_0x00ff
            java.lang.String r2 = "1"
            goto L_0x0100
        L_0x00ff:
            r2 = r0
        L_0x0100:
            r1.put(r9, r2)     // Catch:{ Exception -> 0x014e }
            java.lang.String r9 = "country"
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x014e }
            java.lang.String r2 = r2.getCountry()     // Catch:{ Exception -> 0x014e }
            int r4 = ix3.C76375b.f223657a     // Catch:{ Exception -> 0x014e }
            java.lang.String r4 = "[\":,\\[\\]{}]"
            if (r2 == 0) goto L_0x0124
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r4)     // Catch:{ Exception -> 0x0124 }
            java.util.regex.Matcher r2 = r5.matcher(r2)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r2 = r2.replaceAll(r3)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r2 = r2.trim()     // Catch:{ Exception -> 0x0124 }
            goto L_0x0125
        L_0x0124:
            r2 = r3
        L_0x0125:
            r1.put(r9, r2)     // Catch:{ Exception -> 0x014e }
            java.lang.String r9 = "package"
            boolean r2 = r7 instanceof android.app.Activity     // Catch:{ Exception -> 0x0138 }
            if (r2 == 0) goto L_0x0135
            android.app.Activity r7 = (android.app.Activity) r7     // Catch:{ Exception -> 0x0138 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ Exception -> 0x0138 }
            goto L_0x0136
        L_0x0135:
            r7 = r3
        L_0x0136:
            if (r7 != 0) goto L_0x0139
        L_0x0138:
            r7 = r3
        L_0x0139:
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r4)     // Catch:{ Exception -> 0x014a }
            java.util.regex.Matcher r7 = r2.matcher(r7)     // Catch:{ Exception -> 0x014a }
            java.lang.String r7 = r7.replaceAll(r3)     // Catch:{ Exception -> 0x014a }
            java.lang.String r7 = r7.trim()     // Catch:{ Exception -> 0x014a }
            goto L_0x014b
        L_0x014a:
            r7 = r3
        L_0x014b:
            r1.put(r9, r7)     // Catch:{ Exception -> 0x014e }
        L_0x014e:
            java.lang.String r7 = "seType"
            r1.put(r7, r3)     // Catch:{ Exception -> 0x018b }
            java.lang.String r7 = "isLimitSe"
            r1.put(r7, r0)     // Catch:{ Exception -> 0x018b }
            java.lang.String r7 = "vendorCapacity"
            r1.put(r7, r0)     // Catch:{ Exception -> 0x018b }
            boolean r7 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x018b }
            if (r7 != 0) goto L_0x0175
            java.lang.String r7 = "randKey"
            int r8 = ix3.C76375b.m91799a(r8)     // Catch:{ Exception -> 0x018b }
            java.lang.String r9 = ix3.C76375b.m91805g(r11)     // Catch:{ Exception -> 0x018b }
            java.lang.String r8 = com.unionpay.utils.UPUtils.forWap(r8, r9)     // Catch:{ Exception -> 0x018b }
            r1.put(r7, r8)     // Catch:{ Exception -> 0x018b }
        L_0x0175:
            boolean r7 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x018b }
            if (r7 != 0) goto L_0x0180
            java.lang.String r7 = "has_sdk"
            r1.put(r7, r10)     // Catch:{ Exception -> 0x018b }
        L_0x0180:
            boolean r7 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Exception -> 0x018b }
            if (r7 != 0) goto L_0x018b
            java.lang.String r7 = "merId"
            r1.put(r7, r12)     // Catch:{ Exception -> 0x018b }
        L_0x018b:
            java.lang.String r7 = r1.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.C75273a.m90289a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static JSONArray m90290b(JSONArray jSONArray, String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (jSONArray != null && i < jSONArray.length()) {
            arrayList.add(jSONArray.optJSONObject(i));
            i++;
        }
        Collections.sort(arrayList, new C7116e(str));
        JSONArray jSONArray2 = new JSONArray();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jSONArray2.put((JSONObject) arrayList.get(i2));
        }
        return jSONArray2;
    }

    /* renamed from: c */
    public static void m90291c(String str, Bundle bundle, String str2) {
        if (str != null && str.trim().length() > 0) {
            if (str.trim().charAt(0) != '<') {
                bundle.putString("ex_mode", str2);
            } else if (str2 == null || !str2.trim().equalsIgnoreCase("00")) {
                bundle.putBoolean("UseTestMode", true);
            } else {
                bundle.putBoolean("UseTestMode", false);
            }
        }
    }

    /* renamed from: d */
    public static void m90292d(Context context, String str, String str2) {
        String forScanUrl = UPUtils.forScanUrl(C76375b.m91799a(str));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(new DecimalFormat("0000000").format((long) new SecureRandom().nextInt(10000000)));
        stringBuffer.append(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(System.currentTimeMillis())));
        String stringBuffer2 = stringBuffer.toString();
        C76248c cVar = new C76248c(forScanUrl);
        String a = m90289a(context, str, (String) null, (String) null, stringBuffer2, str2);
        if (a != null) {
            a.getBytes();
            cVar.f223344b = a;
        }
        Executors.newSingleThreadExecutor().execute(new C75275d(cVar, context, str, stringBuffer2));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:61|(3:63|64|(1:66))|67|68|(2:76|(3:80|81|93)(1:92))) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bb, code lost:
        if (r3.equals(r5) != false) goto L_0x00c0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x015f */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011a A[Catch:{ Exception -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0183 A[SYNTHETIC, Splitter:B:80:0x0183] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0187 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m90293e(android.content.Context r14) {
        /*
            r0 = 1
            r1 = 0
            if (r14 != 0) goto L_0x0006
            goto L_0x0191
        L_0x0006:
            java.lang.String r2 = "00"
            android.text.TextUtils.isEmpty(r2)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.String r4 = "entryexpro"
            r3.mo10233c(r4)
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            java.lang.Object[] r6 = r3.mo10232b()
            java.lang.String r7 = "com/unionpay/UPPayAssistEx"
            java.lang.String r8 = "checkWalletInstalled"
            java.lang.String r9 = "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z"
            java.lang.String r10 = "java/lang/System_EXEC_"
            java.lang.String r11 = "loadLibrary"
            java.lang.String r12 = "(Ljava/lang/String;)V"
            r5 = r4
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r3 = r3.mo10231a(r1)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.System.loadLibrary(r3)
            java.lang.String r6 = "com/unionpay/UPPayAssistEx"
            java.lang.String r7 = "checkWalletInstalled"
            java.lang.String r8 = "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z"
            java.lang.String r9 = "java/lang/System_EXEC_"
            java.lang.String r10 = "loadLibrary"
            java.lang.String r11 = "(Ljava/lang/String;)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r3 = "scan_configs"
            java.lang.String r3 = com.unionpay.utils.UPUtils.m90294a(r14, r3)
            java.lang.String r4 = "scan_mode"
            java.lang.String r4 = com.unionpay.utils.UPUtils.m90294a(r14, r4)
            java.lang.String r5 = "scan_random"
            java.lang.String r5 = com.unionpay.utils.UPUtils.m90294a(r14, r5)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r7 = "sign"
            r8 = 0
            if (r6 != 0) goto L_0x00bf
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x00bf
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x00bf
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x00be }
            r6.<init>(r3)     // Catch:{ Exception -> 0x00be }
            java.lang.String r3 = ix3.C76377f.m91807b(r6, r7)     // Catch:{ Exception -> 0x00be }
            java.lang.String r9 = "configs"
            java.lang.String r6 = ix3.C76377f.m91807b(r6, r9)     // Catch:{ Exception -> 0x00be }
            boolean r9 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00be }
            if (r9 != 0) goto L_0x00bf
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x00be }
            if (r9 != 0) goto L_0x00bf
            java.lang.String r9 = new java.lang.String     // Catch:{ Exception -> 0x00be }
            r10 = 2
            byte[] r6 = android.util.Base64.decode(r6, r10)     // Catch:{ Exception -> 0x00be }
            r9.<init>(r6)     // Catch:{ Exception -> 0x00be }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00be }
            r6.<init>()     // Catch:{ Exception -> 0x00be }
            r6.append(r9)     // Catch:{ Exception -> 0x00be }
            r6.append(r5)     // Catch:{ Exception -> 0x00be }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x00be }
            java.lang.String r5 = com.unionpay.utils.UPUtils.m90295b(r5)     // Catch:{ Exception -> 0x00be }
            java.lang.String r5 = ix3.C76375b.m91805g(r5)     // Catch:{ Exception -> 0x00be }
            int r4 = ix3.C76375b.m91799a(r4)     // Catch:{ Exception -> 0x00be }
            java.lang.String r3 = com.unionpay.utils.UPUtils.forConfig(r4, r3)     // Catch:{ Exception -> 0x00be }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00be }
            if (r4 != 0) goto L_0x00bf
            boolean r3 = r3.equals(r5)     // Catch:{ Exception -> 0x00be }
            if (r3 == 0) goto L_0x00bf
            goto L_0x00c0
        L_0x00be:
        L_0x00bf:
            r9 = r8
        L_0x00c0:
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            if (r3 == 0) goto L_0x00c8
            java.lang.String r9 = "[{\"package_info\":[{\"schema\":\"com.unionpay\",\"sign\":\"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\":102,\"version\":\".*\"},{\"schema\":\"com.cmbc.cc.mbank\",\"sign\":\"812F343676D89E552A4820B2B52DB82D72E5119E\",\"sort\":101,\"version\":\"((9|1).*)|(8\\\\.[2-9].*)\"}],\"sort\":100,\"type\":\"app\"}]"
        L_0x00c8:
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            if (r3 != 0) goto L_0x018e
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x018e }
            r3.<init>(r9)     // Catch:{ Exception -> 0x018e }
            r4 = 0
        L_0x00d4:
            int r5 = r3.length()     // Catch:{ Exception -> 0x018e }
            if (r4 >= r5) goto L_0x018e
            java.lang.Object r5 = ix3.C76377f.m91806a(r3, r4)     // Catch:{ Exception -> 0x018e }
            boolean r6 = r5 instanceof org.json.JSONObject     // Catch:{ Exception -> 0x018e }
            if (r6 == 0) goto L_0x018a
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ Exception -> 0x018e }
            java.lang.String r6 = "type"
            java.lang.String r6 = ix3.C76377f.m91807b(r5, r6)     // Catch:{ Exception -> 0x018e }
            java.lang.String r9 = "app"
            boolean r6 = r9.equals(r6)     // Catch:{ Exception -> 0x018e }
            if (r6 == 0) goto L_0x018a
            java.lang.String r6 = "package_info"
            if (r5 == 0) goto L_0x00ff
            boolean r9 = r5.has(r6)     // Catch:{ Exception -> 0x018e }
            if (r9 == 0) goto L_0x00ff
            r9 = 1
            goto L_0x0100
        L_0x00ff:
            r9 = 0
        L_0x0100:
            if (r9 == 0) goto L_0x010c
            org.json.JSONArray r5 = r5.getJSONArray(r6)     // Catch:{ Exception -> 0x0107 }
            goto L_0x010d
        L_0x0107:
            java.lang.Class<ix3.f> r5 = ix3.C76377f.class
            r5.toString()     // Catch:{ Exception -> 0x018e }
        L_0x010c:
            r5 = r8
        L_0x010d:
            java.lang.String r6 = "sort"
            org.json.JSONArray r5 = m90290b(r5, r6)     // Catch:{ Exception -> 0x018e }
            r6 = 0
        L_0x0114:
            int r9 = r5.length()     // Catch:{ Exception -> 0x018e }
            if (r6 >= r9) goto L_0x018a
            java.lang.Object r9 = ix3.C76377f.m91806a(r5, r6)     // Catch:{ Exception -> 0x018e }
            boolean r10 = r9 instanceof org.json.JSONObject     // Catch:{ Exception -> 0x018e }
            if (r10 == 0) goto L_0x0187
            org.json.JSONObject r9 = (org.json.JSONObject) r9     // Catch:{ Exception -> 0x018e }
            if (r9 == 0) goto L_0x0180
            java.lang.String r10 = "schema"
            java.lang.String r10 = ix3.C76377f.m91807b(r9, r10)     // Catch:{ Exception -> 0x018e }
            java.lang.String r11 = ix3.C76377f.m91807b(r9, r7)     // Catch:{ Exception -> 0x018e }
            java.lang.String r12 = "version"
            java.lang.String r9 = ix3.C76377f.m91807b(r9, r12)     // Catch:{ Exception -> 0x018e }
            int r12 = ix3.C76375b.f223657a     // Catch:{ Exception -> 0x018e }
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x017f }
            if (r12 != 0) goto L_0x0180
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x017f }
            if (r12 != 0) goto L_0x0180
            boolean r12 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x017f }
            if (r12 != 0) goto L_0x0180
            java.lang.String r12 = ""
            boolean r13 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x017f }
            if (r13 != 0) goto L_0x015f
            android.content.pm.PackageManager r13 = r14.getPackageManager()     // Catch:{ Exception -> 0x015f }
            android.content.pm.PackageInfo r13 = r13.getPackageInfo(r10, r1)     // Catch:{ Exception -> 0x015f }
            if (r13 == 0) goto L_0x015f
            java.lang.String r12 = r13.versionName     // Catch:{ Exception -> 0x015f }
        L_0x015f:
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Exception -> 0x017f }
            if (r13 != 0) goto L_0x0180
            boolean r13 = ix3.C76375b.m91804f(r14, r10)     // Catch:{ Exception -> 0x017f }
            if (r13 == 0) goto L_0x0180
            boolean r9 = r12.matches(r9)     // Catch:{ Exception -> 0x017f }
            if (r9 == 0) goto L_0x0180
            java.lang.String r9 = "SHA1"
            java.lang.String r9 = ix3.C76375b.m91801c(r14, r10, r9)     // Catch:{ Exception -> 0x017f }
            boolean r9 = r11.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x017f }
            if (r9 == 0) goto L_0x0180
            r9 = 1
            goto L_0x0181
        L_0x017f:
        L_0x0180:
            r9 = 0
        L_0x0181:
            if (r9 == 0) goto L_0x0187
            m90292d(r14, r2, r8)     // Catch:{ Exception -> 0x018e }
            goto L_0x0192
        L_0x0187:
            int r6 = r6 + 1
            goto L_0x0114
        L_0x018a:
            int r4 = r4 + 1
            goto L_0x00d4
        L_0x018e:
            m90292d(r14, r2, r8)
        L_0x0191:
            r0 = 0
        L_0x0192:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.C75273a.m90293e(android.content.Context):boolean");
    }
}
