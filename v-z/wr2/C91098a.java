package wr2;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import wr2.C91099c;

/* renamed from: wr2.a */
public final class C91098a {

    /* renamed from: a */
    public final List<C91099c> f261281a;

    /* renamed from: b */
    public final WeakReference<? extends Context> f261282b;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0072 A[LOOP:0: B:9:0x0051->B:13:0x0072, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0101 A[EDGE_INSN: B:16:0x0101->B:14:0x0101 ?: BREAK  
    EDGE_INSN: B:17:0x0101->B:14:0x0101 ?: BREAK  ] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C91098a(android.content.Context r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            r11 = this;
            r11.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r12)
            r11.f261282b = r0
            java.lang.String r12 = "createMarketTagList"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "getKeyPrefix"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r0)
            java.lang.String r3 = ".adxml.adCanvasInfo.adMarketJump.marketTag.marketSchema"
            boolean r3 = r13.containsKey(r3)
            if (r3 == 0) goto L_0x0027
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r0)
            goto L_0x0038
        L_0x0027:
            java.lang.String r3 = ".RecXml.adxml.adCanvasInfo.adMarketJump.marketTag.marketSchema"
            boolean r3 = r13.containsKey(r3)
            if (r3 == 0) goto L_0x0035
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r0)
            java.lang.String r2 = ".RecXml.adxml.adCanvasInfo.adMarketJump."
            goto L_0x003a
        L_0x0035:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r0)
        L_0x0038:
            java.lang.String r2 = ".adxml.adCanvasInfo.adMarketJump."
        L_0x003a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r4 = "marketTag"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5 = 0
            java.lang.String r3 = r11.mo125156c(r3, r5)
        L_0x0051:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r7 = "."
            r6.append(r7)
            java.lang.String r8 = "marketSchema"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            boolean r6 = r13.containsKey(r6)
            if (r6 == 0) goto L_0x0101
            r6 = 20
            if (r5 >= r6) goto L_0x0101
            wr2.c r6 = new wr2.c
            r6.<init>()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            r9.append(r7)
            java.lang.String r10 = "brand"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r13.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r6.f261285c = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            r9.append(r7)
            java.lang.String r10 = "appPackage"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r13.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r6.f261286d = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            r9.append(r7)
            java.lang.String r7 = "marketName"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.Object r7 = r13.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r6.f261287e = r7
            java.lang.String r7 = "marketPackage"
            java.util.List r7 = r11.mo125155b(r13, r3, r7)
            r6.f261284b = r7
            java.util.List r3 = r11.mo125155b(r13, r3, r8)
            r6.f261283a = r3
            r11.mo125154a(r6)
            r1.add(r6)
            java.lang.String r3 = r6.toString()
            java.lang.String r6 = "MICROMSG.AdAppMarketHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            int r5 = r5 + 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r11.mo125156c(r3, r5)
            goto L_0x0051
        L_0x0101:
            wr2.c$a r13 = new wr2.c$a
            r13.<init>()
            java.util.Collections.sort(r1, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r0)
            r11.f261281a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wr2.C91098a.<init>(android.content.Context, java.util.Map):void");
    }

    /* renamed from: d */
    public static boolean m114280d(Intent intent) {
        SnsMethodCalculate.markStartTimeMs("isAppMarketIntentValid", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        if (intent != null) {
            try {
                if (!TextUtils.isEmpty(intent.getAction()) && intent.getData() != null) {
                    C115669n.INSTANCE.mo175911u(1958, 6);
                    SnsMethodCalculate.markEndTimeMs("isAppMarketIntentValid", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                    return true;
                }
            } catch (Throwable unused) {
                Log.m105928w("MICROMSG.AdAppMarketHelper", "isAppMarketIntentValid has something error");
            }
        }
        C115669n.INSTANCE.mo175911u(1958, 7);
        SnsMethodCalculate.markEndTimeMs("isAppMarketIntentValid", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        return false;
    }

    /* renamed from: e */
    public static boolean m114281e(Intent intent) {
        SnsMethodCalculate.markStartTimeMs("isBrandSuccess", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        if (intent != null) {
            try {
                boolean booleanExtra = intent.getBooleanExtra("brand_state", false);
                SnsMethodCalculate.markEndTimeMs("isBrandSuccess", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                return booleanExtra;
            } catch (Throwable unused) {
                Log.m105928w("MICROMSG.AdAppMarketHelper", "setBrandState has something error");
            }
        }
        SnsMethodCalculate.markEndTimeMs("isBrandSuccess", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        return false;
    }

    /* renamed from: f */
    public static C91098a m114282f(Context context, String str, Map<String, String> map) {
        SnsMethodCalculate.markStartTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        try {
            C91098a aVar = new C91098a(context, str, map);
            SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return aVar;
        } catch (Throwable unused) {
            Log.m105920e("MICROMSG.AdAppMarketHelper", "create aAdAppMarketHelper failed!");
            SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return null;
        }
    }

    /* renamed from: g */
    public static C91098a m114283g(Context context, Map<String, String> map) {
        SnsMethodCalculate.markStartTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        try {
            C91098a aVar = new C91098a(context, map);
            SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return aVar;
        } catch (Throwable unused) {
            Log.m105920e("MICROMSG.AdAppMarketHelper", "create aAdAppMarketHelper failed!");
            SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return null;
        }
    }

    /* renamed from: h */
    public static void m114284h(String str, String str2, String str3, int i, String str4, Map<String, Object> map) {
        String str5;
        SnsMethodCalculate.markStartTimeMs("report19790", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        SnsMethodCalculate.markStartTimeMs("build19790ExtraInfo", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (String next : map.keySet()) {
                        jSONObject.put(next, map.get(next));
                    }
                    str5 = jSONObject.toString();
                    SnsMethodCalculate.markEndTimeMs("build19790ExtraInfo", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                    SnsMethodCalculate.markStartTimeMs("report19790", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                    C115669n.INSTANCE.mo160131h(19790, str, str2, str3, Integer.valueOf(i), str4, str5);
                    Log.m105924i("MICROMSG.AdAppMarketHelper", "report19790 snsId=" + str + ", uxInfo=" + str2 + ", adExtInfo =" + str3 + ", actType =" + i + ", actValue = " + str4 + ", extInfo = " + str5);
                    SnsMethodCalculate.markEndTimeMs("report19790", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                    SnsMethodCalculate.markEndTimeMs("report19790", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                }
            } catch (Throwable unused) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("build19790ExtraInfo", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        str5 = "";
        SnsMethodCalculate.markStartTimeMs("report19790", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        try {
            C115669n.INSTANCE.mo160131h(19790, str, str2, str3, Integer.valueOf(i), str4, str5);
            Log.m105924i("MICROMSG.AdAppMarketHelper", "report19790 snsId=" + str + ", uxInfo=" + str2 + ", adExtInfo =" + str3 + ", actType =" + i + ", actValue = " + str4 + ", extInfo = " + str5);
        } catch (Throwable th) {
            Log.m105920e("MICROMSG.AdAppMarketHelper", "report19790 exp:" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("report19790", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        SnsMethodCalculate.markEndTimeMs("report19790", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
    }

    /* renamed from: a */
    public final void mo125154a(C91099c cVar) {
        SnsMethodCalculate.markStartTimeMs("computeMarketNodePriority", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        if (cVar != null) {
            String str = Build.BRAND;
            String str2 = Build.MANUFACTURER;
            String str3 = cVar.f261285c;
            cVar.f261288f = 2;
            if (!TextUtils.isEmpty(str3) && str != null) {
                String lowerCase = str3.toLowerCase();
                String lowerCase2 = str.toLowerCase();
                int i = 0;
                if (lowerCase.equals(lowerCase2)) {
                    cVar.f261288f = 0;
                } else {
                    SnsMethodCalculate.markStartTimeMs("computePriorityWithManufacture", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                    if (str2 != null) {
                        String lowerCase3 = lowerCase.toLowerCase();
                        String lowerCase4 = str2.toLowerCase();
                        if (lowerCase3.equals(lowerCase4)) {
                            SnsMethodCalculate.markEndTimeMs("computePriorityWithManufacture", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                        } else if (lowerCase3.contains(lowerCase4)) {
                            SnsMethodCalculate.markEndTimeMs("computePriorityWithManufacture", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                            i = 1;
                        } else if (lowerCase4.contains(lowerCase3)) {
                            SnsMethodCalculate.markEndTimeMs("computePriorityWithManufacture", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                            i = 2;
                        }
                        cVar.f261288f = i;
                        if (i >= 2 && lowerCase.contains(lowerCase2)) {
                            cVar.f261288f = 1;
                        }
                    }
                    i = 3;
                    SnsMethodCalculate.markEndTimeMs("computePriorityWithManufacture", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                    cVar.f261288f = i;
                    cVar.f261288f = 1;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("computeMarketNodePriority", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
    }

    /* renamed from: b */
    public final List<String> mo125155b(Map<String, String> map, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getElementList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        String c = mo125156c(str + "." + str2, 0);
        while (map.containsKey(c) && i < 10) {
            String str3 = map.get(c);
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(str3);
            }
            i++;
            c = mo125156c(str + "." + str2, i);
        }
        SnsMethodCalculate.markEndTimeMs("getElementList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        return arrayList;
    }

    /* renamed from: c */
    public final String mo125156c(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("getNodeKey", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        if (i == 0) {
            SnsMethodCalculate.markEndTimeMs("getNodeKey", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return str;
        }
        String str2 = str + i;
        SnsMethodCalculate.markEndTimeMs("getNodeKey", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        return str2;
    }

    /* renamed from: i */
    public Intent mo125157i() {
        SnsMethodCalculate.markStartTimeMs("screenIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        try {
            Intent j = mo125158j();
            SnsMethodCalculate.markEndTimeMs("screenIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return j;
        } catch (Throwable unused) {
            Log.m105918d("MICROMSG.AdAppMarketHelper", "screen intent failed");
            SnsMethodCalculate.markEndTimeMs("screenIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0178 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x017e A[SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent mo125158j() {
        /*
            r29 = this;
            r0 = r29
            java.lang.String r1 = "screenIntentInner"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.ref.WeakReference<? extends android.content.Context> r3 = r0.f261282b
            java.lang.Object r3 = r3.get()
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = "MICROMSG.AdAppMarketHelper"
            r5 = 0
            if (r3 != 0) goto L_0x0021
            java.lang.String r3 = "the context is null, activity is finished?"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r5
        L_0x0021:
            java.util.List<wr2.c> r6 = r0.f261281a
            if (r6 == 0) goto L_0x0252
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.util.Iterator r7 = r6.iterator()
        L_0x002b:
            boolean r8 = r7.hasNext()
            java.lang.String r9 = "brand_state"
            java.lang.String r10 = "setBrandState"
            java.lang.String r12 = "whichPriorityIsSuccess"
            java.lang.String r13 = "setBrandState has something error"
            if (r8 == 0) goto L_0x01e4
            java.lang.Object r8 = r7.next()
            wr2.c r8 = (wr2.C91099c) r8
            if (r8 == 0) goto L_0x01c7
            java.lang.String r15 = "screenIntent"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r5)
            android.content.pm.PackageManager r14 = r3.getPackageManager()
            java.lang.String r11 = "toIntent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r16 = r3
            java.lang.String r3 = "toIntentNodes"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            r17 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r18 = r6
            java.util.List<java.lang.String> r6 = r8.f261283a
            r19 = r1
            java.util.List<java.lang.String> r1 = r8.f261284b
            r20 = r13
            java.lang.String r13 = "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode"
            if (r6 == 0) goto L_0x0116
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r21 = r6.isEmpty()
            if (r21 == 0) goto L_0x0082
            goto L_0x0116
        L_0x0082:
            r21 = r9
            java.lang.String r9 = "createIntentNode"
            if (r1 == 0) goto L_0x00e5
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r22 = r1.isEmpty()
            if (r22 != 0) goto L_0x00e5
            java.util.Iterator r1 = r1.iterator()
        L_0x0094:
            boolean r22 = r1.hasNext()
            if (r22 == 0) goto L_0x00dc
            java.lang.Object r22 = r1.next()
            r23 = r1
            r1 = r22
            java.lang.String r1 = (java.lang.String) r1
            java.util.Iterator r22 = r6.iterator()
        L_0x00a8:
            boolean r24 = r22.hasNext()
            if (r24 == 0) goto L_0x00d9
            java.lang.Object r24 = r22.next()
            r25 = r10
            r10 = r24
            java.lang.String r10 = (java.lang.String) r10
            r24 = r2
            java.lang.String r2 = r8.f261286d
            r26 = r12
            java.lang.String r12 = r8.f261287e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r13)
            r27 = r4
            wr2.b r4 = new wr2.b
            r4.<init>(r10, r1, r2, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r13)
            r7.add(r4)
            r2 = r24
            r10 = r25
            r12 = r26
            r4 = r27
            goto L_0x00a8
        L_0x00d9:
            r1 = r23
            goto L_0x0094
        L_0x00dc:
            r24 = r2
            r27 = r4
            r25 = r10
            r26 = r12
            goto L_0x0112
        L_0x00e5:
            r24 = r2
            r27 = r4
            r25 = r10
            r26 = r12
            java.util.Iterator r1 = r6.iterator()
        L_0x00f1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0112
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = r8.f261286d
            java.lang.String r6 = r8.f261287e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r13)
            wr2.b r10 = new wr2.b
            java.lang.String r12 = ""
            r10.<init>(r2, r12, r4, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r13)
            r7.add(r10)
            goto L_0x00f1
        L_0x0112:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            goto L_0x0123
        L_0x0116:
            r24 = r2
            r27 = r4
            r21 = r9
            r25 = r10
            r26 = r12
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
        L_0x0123:
            java.util.Iterator r1 = r7.iterator()
        L_0x0127:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0153
            java.lang.Object r2 = r1.next()
            wr2.b r2 = (wr2.C53196b) r2
            r2.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)
            android.content.Intent r2 = r2.mo73870a()     // Catch:{ all -> 0x0141 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
            goto L_0x014d
        L_0x0141:
            java.lang.String r2 = "MicroMsg.AdAppMarketIntentNode"
            java.lang.String r3 = "there is something wrong in toIntent"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
            r2 = 0
        L_0x014d:
            if (r2 == 0) goto L_0x0127
            r0.add(r2)
            goto L_0x0127
        L_0x0153:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x015a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0178
            java.lang.Object r1 = r0.next()
            android.content.Intent r1 = (android.content.Intent) r1
            android.content.ComponentName r2 = r1.resolveActivity(r14)
            if (r2 == 0) goto L_0x015a
            int r0 = r8.f261288f
            java.lang.String r2 = "market_priority"
            r1.putExtra(r2, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r5)
            goto L_0x017c
        L_0x0178:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r5)
            r1 = 0
        L_0x017c:
            if (r1 == 0) goto L_0x01c0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "screenIntentInner, useNode="
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r2 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            int r0 = r8.f261288f
            r4 = r24
            r3 = r26
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r5 = 1
            if (r0 > r5) goto L_0x01a3
            r11 = 1
            goto L_0x01a4
        L_0x01a3:
            r11 = 0
        L_0x01a4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r0 = r25
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            r5 = r21
            r1.putExtra(r5, r11)     // Catch:{ all -> 0x01b2 }
            goto L_0x01b7
        L_0x01b2:
            r6 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r6)
        L_0x01b7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            r7 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            return r1
        L_0x01c0:
            r7 = r19
            r4 = r24
            r2 = r27
            goto L_0x01d3
        L_0x01c7:
            r16 = r3
            r18 = r6
            r17 = r7
            r7 = r1
            r28 = r4
            r4 = r2
            r2 = r28
        L_0x01d3:
            r0 = r29
            r1 = r7
            r3 = r16
            r7 = r17
            r6 = r18
            r5 = 0
            r28 = r4
            r4 = r2
            r2 = r28
            goto L_0x002b
        L_0x01e4:
            r7 = r1
            r18 = r6
            r5 = r9
            r0 = r10
            r3 = r12
            r6 = r13
            r28 = r4
            r4 = r2
            r2 = r28
            boolean r1 = r18.isEmpty()
            if (r1 != 0) goto L_0x0254
            java.lang.String r1 = "--screenIntentInner, no tagNode match--"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            r1 = r18
            r8 = 0
            java.lang.Object r1 = r1.get(r8)
            wr2.c r1 = (wr2.C91099c) r1
            if (r1 == 0) goto L_0x024b
            java.lang.String r9 = "screenIntentInner, default"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.String r10 = r1.f261286d
            java.lang.String r11 = "setTargetPkg"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r4)
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0226 }
            if (r12 != 0) goto L_0x0229
            java.lang.String r12 = "target_app_id"
            r9.putExtra(r12, r10)     // Catch:{ all -> 0x0226 }
            goto L_0x0229
        L_0x0226:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r6)
        L_0x0229:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
            int r1 = r1.f261288f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r10 = 1
            if (r1 > r10) goto L_0x0236
            r11 = 1
            goto L_0x0237
        L_0x0236:
            r11 = 0
        L_0x0237:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            r9.putExtra(r5, r11)     // Catch:{ all -> 0x0241 }
            goto L_0x0244
        L_0x0241:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r6)
        L_0x0244:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            return r9
        L_0x024b:
            java.lang.String r0 = "screenIntentInner, null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x0254
        L_0x0252:
            r7 = r1
            r4 = r2
        L_0x0254:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wr2.C91098a.mo125158j():android.content.Intent");
    }

    public C91098a(Context context, String str, Map<String, String> map) {
        this.f261282b = new WeakReference<>(context);
        SnsMethodCalculate.markStartTimeMs("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        String c = mo125156c(str + "marketTag", 0);
        while (true) {
            if (!map.containsKey(c + "." + "marketSchema") || i >= 20) {
                Collections.sort(arrayList, new C91099c.C91100a());
                SnsMethodCalculate.markEndTimeMs("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                this.f261281a = arrayList;
            } else {
                C91099c cVar = new C91099c();
                cVar.f261285c = map.get(c + "." + "brand");
                cVar.f261286d = map.get(c + "." + "appPackage");
                cVar.f261287e = map.get(c + "." + "marketName");
                cVar.f261284b = mo125155b(map, c, "marketPackage");
                cVar.f261283a = mo125155b(map, c, "marketSchema");
                mo125154a(cVar);
                arrayList.add(cVar);
                i++;
                c = mo125156c(str + "marketTag", i);
            }
        }
        Collections.sort(arrayList, new C91099c.C91100a());
        SnsMethodCalculate.markEndTimeMs("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        this.f261281a = arrayList;
    }
}
