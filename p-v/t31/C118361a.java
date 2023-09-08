package t31;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: t31.a */
public class C118361a {

    /* renamed from: c */
    public static volatile C118361a f353761c;

    /* renamed from: a */
    public Map<String, C118362b> f353762a = new HashMap();

    /* renamed from: b */
    public List<String> f353763b = null;

    /* JADX WARNING: Removed duplicated region for block: B:56:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C118361a() {
        /*
            r20 = this;
            r7 = r20
            r20.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r7.f353762a = r0
            r0 = 0
            r7.f353763b = r0
            java.lang.String r1 = "mmkv_key_data_report_page_config"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r1)
            java.lang.String r2 = "Amoeba.PageConfig"
            java.lang.String r3 = ""
            r4 = 0
            if (r0 != 0) goto L_0x001e
            goto L_0x00e1
        L_0x001e:
            java.lang.String r5 = "mmkv_key_data_report_page_config_json"
            java.lang.String r0 = r0.getString(r5, r3)
            boolean r5 = u24.C90599h.m113511d(r0)
            if (r5 == 0) goto L_0x002c
            goto L_0x00e1
        L_0x002c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[parseConfig] configJson : "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r5)
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b5 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r0 = "config"
            org.json.JSONArray r0 = r5.getJSONArray(r0)     // Catch:{ Exception -> 0x00b5 }
            if (r0 == 0) goto L_0x00e1
            int r5 = r0.length()     // Catch:{ Exception -> 0x00b5 }
            if (r5 <= 0) goto L_0x00e1
            r5 = 0
        L_0x0054:
            int r6 = r0.length()     // Catch:{ Exception -> 0x00b5 }
            if (r5 >= r6) goto L_0x00e1
            org.json.JSONObject r6 = r0.getJSONObject(r5)     // Catch:{ Exception -> 0x00b5 }
            if (r6 == 0) goto L_0x00c1
            java.lang.String r8 = "page_id"
            int r8 = r6.optInt(r8, r4)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r9 = "biz_group_id"
            int r15 = r6.optInt(r9, r4)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r9 = "report_policy"
            int r16 = r6.optInt(r9, r4)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r9 = "route_rule"
            int r17 = r6.optInt(r9, r4)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r9 = "and_page_name"
            org.json.JSONArray r6 = r6.getJSONArray(r9)     // Catch:{ Exception -> 0x00b5 }
            if (r6 == 0) goto L_0x00c1
            int r9 = r6.length()     // Catch:{ Exception -> 0x00b5 }
            if (r9 <= 0) goto L_0x00c1
            r14 = 0
        L_0x008a:
            int r9 = r6.length()     // Catch:{ Exception -> 0x00b5 }
            if (r14 >= r9) goto L_0x00c1
            java.lang.String r13 = r6.getString(r14)     // Catch:{ Exception -> 0x00b5 }
            boolean r9 = u24.C90599h.m113511d(r13)     // Catch:{ Exception -> 0x00b5 }
            if (r9 != 0) goto L_0x00b7
            t31.b r12 = new t31.b     // Catch:{ Exception -> 0x00b5 }
            r9 = r12
            r10 = r8
            r11 = r15
            r4 = r12
            r12 = r13
            r18 = r0
            r0 = r13
            r13 = r16
            r19 = r14
            r14 = r17
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00b5 }
            java.util.Map<java.lang.String, t31.b> r9 = r7.f353762a     // Catch:{ Exception -> 0x00b5 }
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch:{ Exception -> 0x00b5 }
            r9.put(r0, r4)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00bb
        L_0x00b5:
            r0 = move-exception
            goto L_0x00c9
        L_0x00b7:
            r18 = r0
            r19 = r14
        L_0x00bb:
            int r14 = r19 + 1
            r0 = r18
            r4 = 0
            goto L_0x008a
        L_0x00c1:
            r18 = r0
            int r5 = r5 + 1
            r0 = r18
            r4 = 0
            goto L_0x0054
        L_0x00c9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[parseConfig] throw Exception : "
            r4.append(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
        L_0x00e1:
            ma1.a r0 = ma1.C117543a.Cx0()
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_data_report_pageid_bizid_config
            java.lang.String r0 = r0.Y60(r4, r3)
            boolean r4 = u24.C90599h.m113511d(r0)
            if (r4 == 0) goto L_0x00f3
            goto L_0x0166
        L_0x00f3:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[pullCloudConfig] cloudConfig : "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r4)
            java.lang.String r4 = ";"
            java.lang.String[] r0 = r0.split(r4)     // Catch:{ Exception -> 0x0121 }
            r4 = 0
            r5 = r0[r4]     // Catch:{ Exception -> 0x0121 }
            int r4 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x0121 }
            r5 = 1
            r5 = r0[r5]     // Catch:{ Exception -> 0x011e }
            r6 = 2
            r0 = r0[r6]     // Catch:{ Exception -> 0x011c }
            r3 = r0
            goto L_0x013c
        L_0x011c:
            r0 = move-exception
            goto L_0x0124
        L_0x011e:
            r0 = move-exception
            r5 = r3
            goto L_0x0124
        L_0x0121:
            r0 = move-exception
            r5 = r3
            r4 = 0
        L_0x0124:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "[pullCloudConfig] throw Exception : "
            r6.append(r8)
            java.lang.String r0 = r0.getMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x013c:
            r6 = r4
            boolean r0 = u24.C90599h.m113511d(r3)
            if (r0 != 0) goto L_0x0166
            boolean r0 = u24.C90599h.m113511d(r5)
            if (r0 == 0) goto L_0x014a
            goto L_0x0166
        L_0x014a:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r1)
            if (r4 != 0) goto L_0x0151
            goto L_0x0166
        L_0x0151:
            java.lang.String r0 = "mmkv_key_data_report_page_config_version"
            r1 = 0
            int r0 = r4.getInt(r0, r1)
            if (r6 > r0) goto L_0x015b
            goto L_0x0166
        L_0x015b:
            t31.a$$a r0 = new t31.a$$a
            r1 = r0
            r2 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            m41.C117536f.m165800b(r0)
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t31.C118361a.<init>():void");
    }

    /* renamed from: a */
    public static C118361a m166983a() {
        if (f353761c == null) {
            synchronized (C118361a.class) {
                if (f353761c == null) {
                    f353761c = new C118361a();
                }
            }
        }
        return f353761c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0071  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo183164b(a41.C112756b r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.List<java.lang.String> r1 = r6.f353763b
            if (r1 != 0) goto L_0x003e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.f353763b = r1
            ma1.a r1 = ma1.C117543a.Cx0()
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_data_report_filter_page_config
            java.lang.String r3 = "sFinderMultiTaskRouterUI|ccom.tencent.mm.ui.LauncherUI|ccom.tencent.mm.ui.vas.VASCommonActivity|sAPMidasDistributeActivity|ccom.tencent.mm.ui.chatting.ChattingUI|sLiveEntranceFragment|sFinderLiveVisitorFragment|sVideoActivity"
            java.lang.String r1 = r1.Y60(r2, r3)
            boolean r2 = u24.C90599h.m113511d(r1)
            if (r2 != 0) goto L_0x003e
            java.lang.String r2 = "\\|"
            java.lang.String[] r1 = r1.split(r2)
            int r2 = r1.length
            r3 = 0
        L_0x002a:
            if (r3 >= r2) goto L_0x003e
            r4 = r1[r3]
            java.util.List<java.lang.String> r5 = r6.f353763b
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto L_0x003b
            java.util.List<java.lang.String> r5 = r6.f353763b
            r5.add(r4)
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x003e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "s"
            r1.append(r2)
            java.lang.String r2 = r7.f337635c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "c"
            r2.append(r3)
            java.lang.String r7 = r7.f337636d
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            java.util.List<java.lang.String> r2 = r6.f353763b
            java.util.Iterator r2 = r2.iterator()
        L_0x006b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0085
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = u24.C90599h.m113509b(r3, r1)
            if (r4 != 0) goto L_0x0083
            boolean r3 = u24.C90599h.m113509b(r3, r7)
            if (r3 == 0) goto L_0x006b
        L_0x0083:
            r7 = 1
            return r7
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t31.C118361a.mo183164b(a41.b):boolean");
    }
}
