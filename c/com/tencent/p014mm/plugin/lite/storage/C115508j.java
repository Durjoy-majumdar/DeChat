package com.tencent.p014mm.plugin.lite.storage;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.ipcinvoker.C80916r;

/* renamed from: com.tencent.mm.plugin.lite.storage.j */
public class C115508j {

    /* renamed from: a */
    public static C115507i f346329a;

    /* renamed from: b */
    public static C30152e f346330b;

    /* renamed from: c */
    public static C115505g f346331c;

    /* renamed from: com.tencent.mm.plugin.lite.storage.j$a */
    public static class C115509a implements C80916r<Bundle, Bundle> {
        private C115509a() {
        }

        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            return C115508j.m162396a(bundle.getString(FirebaseAnalytics.C113379b.METHOD), bundle.getString("arg"), bundle.getBundle("extras"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x025b, code lost:
        if (r5 != null) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0193, code lost:
        if (r5 != null) goto L_0x0195;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ce  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle m162396a(java.lang.String r17, java.lang.String r18, android.os.Bundle r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            com.tencent.p014mm.plugin.lite.C115478f.initLib()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r3 == 0) goto L_0x0443
            com.tencent.mm.plugin.lite.storage.i r3 = f346329a
            java.lang.String r4 = "LiteAppInfo"
            r5 = 0
            if (r3 != 0) goto L_0x0025
            com.tencent.mm.plugin.lite.storage.i r3 = new com.tencent.mm.plugin.lite.storage.i
            f40.o r6 = f40.C86709a0.m107535s()
            zh3.f r6 = r6.f251811i
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r7 = com.tencent.p014mm.plugin.lite.storage.C115506h.f346326H
            r3.<init>(r6, r7, r4, r5)
            f346329a = r3
        L_0x0025:
            com.tencent.mm.plugin.lite.storage.e r3 = f346330b
            java.lang.String r6 = "LiteAppAuthInfo"
            if (r3 != 0) goto L_0x003a
            com.tencent.mm.plugin.lite.storage.e r3 = new com.tencent.mm.plugin.lite.storage.e
            f40.o r7 = f40.C86709a0.m107535s()
            zh3.f r7 = r7.f251811i
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r8 = com.tencent.p014mm.plugin.lite.storage.C30151d.f81515v
            r3.<init>(r7, r8, r6, r5)
            f346330b = r3
        L_0x003a:
            com.tencent.mm.plugin.lite.storage.g r3 = f346331c
            java.lang.String r7 = "LiteAppBaselibInfo"
            if (r3 != 0) goto L_0x004f
            com.tencent.mm.plugin.lite.storage.g r3 = new com.tencent.mm.plugin.lite.storage.g
            f40.o r8 = f40.C86709a0.m107535s()
            zh3.f r8 = r8.f251811i
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r9 = com.tencent.p014mm.plugin.lite.storage.C115504f.f346323D
            r3.<init>(r8, r9, r7, r5)
            f346331c = r3
        L_0x004f:
            r3 = 2
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r9 = 0
            r8[r9] = r0
            r10 = 1
            r8[r10] = r1
            java.lang.String r11 = "MicroMsg.LiteAppStorageHelper"
            java.lang.String r12 = "call %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r8)
            r17.getClass()
            r8 = -1
            int r12 = r17.hashCode()
            switch(r12) {
                case -2020791892: goto L_0x00e3;
                case -1176952088: goto L_0x00d8;
                case -637421891: goto L_0x00cd;
                case -494167053: goto L_0x00c2;
                case -201266840: goto L_0x00b7;
                case 402930224: goto L_0x00ac;
                case 992676011: goto L_0x00a1;
                case 992760987: goto L_0x0096;
                case 1674371653: goto L_0x0088;
                case 1674456629: goto L_0x007a;
                case 1924595699: goto L_0x006c;
                default: goto L_0x006a;
            }
        L_0x006a:
            goto L_0x00ed
        L_0x006c:
            java.lang.String r12 = "getLiteAppAuthInfo"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0076
            goto L_0x00ed
        L_0x0076:
            r8 = 10
            goto L_0x00ed
        L_0x007a:
            java.lang.String r12 = "getLiteAppBaselibList"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0084
            goto L_0x00ed
        L_0x0084:
            r8 = 9
            goto L_0x00ed
        L_0x0088:
            java.lang.String r12 = "getLiteAppBaselibInfo"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0092
            goto L_0x00ed
        L_0x0092:
            r8 = 8
            goto L_0x00ed
        L_0x0096:
            java.lang.String r12 = "getLiteAppList"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x009f
            goto L_0x00ed
        L_0x009f:
            r8 = 7
            goto L_0x00ed
        L_0x00a1:
            java.lang.String r12 = "getLiteAppInfo"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00aa
            goto L_0x00ed
        L_0x00aa:
            r8 = 6
            goto L_0x00ed
        L_0x00ac:
            java.lang.String r12 = "insertLiteAppAuthInfo"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00b5
            goto L_0x00ed
        L_0x00b5:
            r8 = 5
            goto L_0x00ed
        L_0x00b7:
            java.lang.String r12 = "insertLiteAppInfo"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00c0
            goto L_0x00ed
        L_0x00c0:
            r8 = 4
            goto L_0x00ed
        L_0x00c2:
            java.lang.String r12 = "removeLiteAppBaselibInfo"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00cb
            goto L_0x00ed
        L_0x00cb:
            r8 = 3
            goto L_0x00ed
        L_0x00cd:
            java.lang.String r12 = "removeLiteAppInfo"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00d6
            goto L_0x00ed
        L_0x00d6:
            r8 = 2
            goto L_0x00ed
        L_0x00d8:
            java.lang.String r12 = "insertLiteAppBaselibInfo"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00e1
            goto L_0x00ed
        L_0x00e1:
            r8 = 1
            goto L_0x00ed
        L_0x00e3:
            java.lang.String r12 = "getLatestLiteAppBaselibInfo"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            r8 = 0
        L_0x00ed:
            java.lang.String r0 = "updateTime"
            java.lang.String r12 = "headerMap"
            java.lang.String r13 = "paramMap"
            java.lang.String r14 = "param"
            java.lang.String r15 = "MicroMsg.LiteAppBaselibInfoStorage"
            java.lang.String r5 = "select * from %s "
            java.lang.String r3 = "LiteApp"
            java.lang.String r9 = "remove liteapp: %s, ret:%d"
            java.lang.String r10 = "MicroMsg.LiteAppInfoStorage"
            r17 = r9
            java.lang.String r9 = "LiteAppBaselib"
            r16 = r6
            java.lang.String r6 = "host"
            switch(r8) {
                case 0: goto L_0x0416;
                case 1: goto L_0x03bb;
                case 2: goto L_0x0399;
                case 3: goto L_0x0377;
                case 4: goto L_0x031f;
                case 5: goto L_0x02d7;
                case 6: goto L_0x029a;
                case 7: goto L_0x020e;
                case 8: goto L_0x01d2;
                case 9: goto L_0x0146;
                case 10: goto L_0x010c;
                default: goto L_0x010a;
            }
        L_0x010a:
            goto L_0x0441
        L_0x010c:
            com.tencent.mm.plugin.lite.storage.e r2 = f346330b     // Catch:{ Exception -> 0x0134 }
            com.tencent.mm.plugin.lite.storage.d r1 = r2.mo57180jo(r1)     // Catch:{ Exception -> 0x0134 }
            if (r1 == 0) goto L_0x0441
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x0134 }
            r2.<init>()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = r1.field_host     // Catch:{ Exception -> 0x0134 }
            r2.putString(r6, r3)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = r1.field_param     // Catch:{ Exception -> 0x0134 }
            r2.putString(r14, r3)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = r1.field_paramMap     // Catch:{ Exception -> 0x0134 }
            r2.putString(r13, r3)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = r1.field_headerMap     // Catch:{ Exception -> 0x0134 }
            r2.putString(r12, r3)     // Catch:{ Exception -> 0x0134 }
            long r3 = r1.field_updateTime     // Catch:{ Exception -> 0x0134 }
            r2.putLong(r0, r3)     // Catch:{ Exception -> 0x0134 }
            goto L_0x02ae
        L_0x0134:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "getLiteAppAuthInfo failed. :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r1)
            goto L_0x0441
        L_0x0146:
            r1 = 1
            r2 = 0
            com.tencent.mm.plugin.lite.storage.g r0 = f346331c
            r0.getClass()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r2] = r7
            java.lang.String r1 = java.lang.String.format(r5, r3)
            java.lang.String[] r3 = new java.lang.String[r2]
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f346325d     // Catch:{ Exception -> 0x0182, all -> 0x017f }
            r4 = 2
            android.database.Cursor r5 = r0.rawQuery(r1, r3, r4)     // Catch:{ Exception -> 0x0182, all -> 0x017f }
            boolean r0 = r5.moveToFirst()     // Catch:{ Exception -> 0x017d }
            if (r0 == 0) goto L_0x0195
        L_0x0169:
            com.tencent.mm.plugin.lite.storage.f r0 = new com.tencent.mm.plugin.lite.storage.f     // Catch:{ Exception -> 0x017d }
            r0.<init>()     // Catch:{ Exception -> 0x017d }
            r0.convertFrom(r5)     // Catch:{ Exception -> 0x017d }
            r2.add(r0)     // Catch:{ Exception -> 0x017d }
            boolean r0 = r5.moveToNext()     // Catch:{ Exception -> 0x017d }
            if (r0 != 0) goto L_0x0169
            goto L_0x0195
        L_0x017b:
            r0 = move-exception
            goto L_0x01cc
        L_0x017d:
            r0 = move-exception
            goto L_0x0184
        L_0x017f:
            r0 = move-exception
            r5 = 0
            goto L_0x01cc
        L_0x0182:
            r0 = move-exception
            r5 = 0
        L_0x0184:
            java.lang.String r1 = "getLiteAppBaselibList failed. :%s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x017b }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x017b }
            r4 = 0
            r3[r4] = r0     // Catch:{ all -> 0x017b }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r1, r3)     // Catch:{ all -> 0x017b }
            if (r5 == 0) goto L_0x0198
        L_0x0195:
            r5.close()
        L_0x0198:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r2.size()
            if (r1 <= 0) goto L_0x01ba
            r9 = 0
        L_0x01a4:
            int r1 = r2.size()
            if (r9 >= r1) goto L_0x01ba
            java.lang.Object r1 = r2.get(r9)
            com.tencent.mm.plugin.lite.storage.f r1 = (com.tencent.p014mm.plugin.lite.storage.C115504f) r1
            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo r1 = r1.mo175483l2()
            r0.add(r1)
            int r9 = r9 + 1
            goto L_0x01a4
        L_0x01ba:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0442
            java.lang.String r1 = "LiteAppBaselibList"
            r5.putParcelableArrayList(r1, r0)
            goto L_0x0442
        L_0x01cc:
            if (r5 == 0) goto L_0x01d1
            r5.close()
        L_0x01d1:
            throw r0
        L_0x01d2:
            com.tencent.mm.plugin.lite.storage.g r0 = f346331c     // Catch:{ Exception -> 0x01e8 }
            com.tencent.mm.plugin.lite.storage.f r0 = r0.mo175484Lo(r1)     // Catch:{ Exception -> 0x01e8 }
            if (r0 == 0) goto L_0x01f8
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x01e8 }
            r2.<init>()     // Catch:{ Exception -> 0x01e8 }
            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo r0 = r0.mo175483l2()     // Catch:{ Exception -> 0x01e8 }
            r2.putParcelable(r9, r0)     // Catch:{ Exception -> 0x01e8 }
            goto L_0x02ae
        L_0x01e8:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "getLiteAppBaselibInfo failed. :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r2)
        L_0x01f8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "null == baselib, majorVersion:"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            goto L_0x0441
        L_0x020e:
            com.tencent.mm.plugin.lite.storage.i r0 = f346329a
            r0.getClass()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            r2[r1] = r4
            java.lang.String r2 = java.lang.String.format(r5, r2)
            java.lang.String[] r3 = new java.lang.String[r1]
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f346328d     // Catch:{ Exception -> 0x024a, all -> 0x0247 }
            r4 = 2
            android.database.Cursor r5 = r0.rawQuery(r2, r3, r4)     // Catch:{ Exception -> 0x024a, all -> 0x0247 }
            boolean r0 = r5.moveToFirst()     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x025d
        L_0x0231:
            com.tencent.mm.plugin.lite.storage.h r0 = new com.tencent.mm.plugin.lite.storage.h     // Catch:{ Exception -> 0x0245 }
            r0.<init>()     // Catch:{ Exception -> 0x0245 }
            r0.convertFrom(r5)     // Catch:{ Exception -> 0x0245 }
            r1.add(r0)     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r5.moveToNext()     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x0231
            goto L_0x025d
        L_0x0243:
            r0 = move-exception
            goto L_0x0294
        L_0x0245:
            r0 = move-exception
            goto L_0x024c
        L_0x0247:
            r0 = move-exception
            r5 = 0
            goto L_0x0294
        L_0x024a:
            r0 = move-exception
            r5 = 0
        L_0x024c:
            java.lang.String r2 = "getLiteAppList failed. :%s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0243 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x0243 }
            r4 = 0
            r3[r4] = r0     // Catch:{ all -> 0x0243 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r3)     // Catch:{ all -> 0x0243 }
            if (r5 == 0) goto L_0x0260
        L_0x025d:
            r5.close()
        L_0x0260:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x0282
            r9 = 0
        L_0x026c:
            int r2 = r1.size()
            if (r9 >= r2) goto L_0x0282
            java.lang.Object r2 = r1.get(r9)
            com.tencent.mm.plugin.lite.storage.h r2 = (com.tencent.p014mm.plugin.lite.storage.C115506h) r2
            com.tencent.liteapp.storage.WxaLiteAppInfo r2 = r2.mo175486l2()
            r0.add(r2)
            int r9 = r9 + 1
            goto L_0x026c
        L_0x0282:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0442
            java.lang.String r1 = "LiteAppList"
            r5.putParcelableArrayList(r1, r0)
            goto L_0x0442
        L_0x0294:
            if (r5 == 0) goto L_0x0299
            r5.close()
        L_0x0299:
            throw r0
        L_0x029a:
            com.tencent.mm.plugin.lite.storage.i r0 = f346329a     // Catch:{ Exception -> 0x02b1 }
            com.tencent.mm.plugin.lite.storage.h r0 = r0.mo175487jo(r1)     // Catch:{ Exception -> 0x02b1 }
            if (r0 == 0) goto L_0x02c1
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x02b1 }
            r2.<init>()     // Catch:{ Exception -> 0x02b1 }
            com.tencent.liteapp.storage.WxaLiteAppInfo r0 = r0.mo175486l2()     // Catch:{ Exception -> 0x02b1 }
            r2.putParcelable(r3, r0)     // Catch:{ Exception -> 0x02b1 }
        L_0x02ae:
            r5 = r2
            goto L_0x0442
        L_0x02b1:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "getLiteAppInfo failed. :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r2)
        L_0x02c1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "null == info, appId:"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            goto L_0x0441
        L_0x02d7:
            java.lang.String r1 = r2.getString(r6)
            if (r1 != 0) goto L_0x02df
            goto L_0x0441
        L_0x02df:
            com.tencent.mm.plugin.lite.storage.d r3 = new com.tencent.mm.plugin.lite.storage.d
            r3.<init>()
            r3.field_host = r1
            java.lang.String r4 = r2.getString(r14)
            r3.field_param = r4
            java.lang.String r4 = r2.getString(r13)
            r3.field_paramMap = r4
            java.lang.String r4 = r2.getString(r12)
            r3.field_headerMap = r4
            long r4 = r2.getLong(r0)
            r3.field_updateTime = r4
            com.tencent.mm.plugin.lite.storage.e r0 = f346330b
            com.tencent.mm.plugin.lite.storage.d r0 = r0.mo57180jo(r1)
            if (r0 != 0) goto L_0x0315
            com.tencent.mm.plugin.lite.storage.e r0 = f346330b
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f81517d
            android.content.ContentValues r1 = r3.convertTo()
            r2 = r16
            r0.insert(r2, r6, r1)
            goto L_0x0441
        L_0x0315:
            com.tencent.mm.plugin.lite.storage.e r0 = f346330b
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.update(r3, (java.lang.String[]) r1)
            goto L_0x0441
        L_0x031f:
            android.os.Parcelable r0 = r2.getParcelable(r3)
            com.tencent.liteapp.storage.WxaLiteAppInfo r0 = (com.tencent.liteapp.storage.WxaLiteAppInfo) r0
            if (r0 != 0) goto L_0x0329
            goto L_0x0441
        L_0x0329:
            com.tencent.mm.plugin.lite.storage.h r1 = new com.tencent.mm.plugin.lite.storage.h
            r1.<init>()
            java.lang.String r2 = r0.f339290d
            r1.field_appId = r2
            java.lang.String r3 = r0.f339294h
            r1.field_signatureKey = r3
            java.lang.String r3 = r0.f339296j
            r1.field_pkgType = r3
            java.lang.String r3 = r0.f339295i
            r1.field_pkgPath = r3
            java.lang.String r3 = r0.f339297n
            r1.field_patchId = r3
            long r5 = r0.f339301r
            r1.field_updateTime = r5
            java.lang.String r3 = r0.f339292f
            r1.field_url = r3
            java.lang.String r3 = r0.f339293g
            r1.field_md5 = r3
            long r5 = r0.f339302s
            r1.field_lastUseTime = r5
            java.lang.String r0 = r0.f339291e
            r1.field_groupId = r0
            com.tencent.mm.plugin.lite.storage.i r0 = f346329a
            com.tencent.mm.plugin.lite.storage.h r0 = r0.mo175487jo(r2)
            if (r0 != 0) goto L_0x036d
            com.tencent.mm.plugin.lite.storage.i r0 = f346329a
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f346328d
            android.content.ContentValues r1 = r1.convertTo()
            java.lang.String r2 = "appId"
            r0.insert(r4, r2, r1)
            goto L_0x0441
        L_0x036d:
            com.tencent.mm.plugin.lite.storage.i r0 = f346329a
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            r0.update(r1, (java.lang.String[]) r2)
            goto L_0x0441
        L_0x0377:
            r2 = 0
            com.tencent.mm.plugin.lite.storage.g r0 = f346331c
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f346325d
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]
            r4[r2] = r1
            java.lang.String r5 = "majorVersion=?"
            int r0 = r0.delete(r7, r5, r4)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r3] = r0
            r0 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r0, r4)
            goto L_0x0441
        L_0x0399:
            r2 = 0
            r3 = 1
            r0 = r17
            com.tencent.mm.plugin.lite.storage.i r5 = f346329a
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r5.f346328d
            java.lang.String[] r6 = new java.lang.String[r3]
            r6[r2] = r1
            java.lang.String r7 = "appId=?"
            int r4 = r5.delete(r4, r7, r6)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r5[r3] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r5)
            goto L_0x0441
        L_0x03bb:
            java.lang.Class<com.tencent.liteapp.storage.WxaLiteAppBaselibInfo> r0 = com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r2.setClassLoader(r0)
            android.os.Parcelable r0 = r2.getParcelable(r9)
            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo r0 = (com.tencent.liteapp.storage.WxaLiteAppBaselibInfo) r0
            if (r0 != 0) goto L_0x03ce
            goto L_0x0441
        L_0x03ce:
            com.tencent.mm.plugin.lite.storage.f r1 = new com.tencent.mm.plugin.lite.storage.f
            r1.<init>()
            java.lang.String r2 = r0.f339281d
            r1.field_majorVersion = r2
            java.lang.String r3 = r0.f339284g
            r1.field_signatureKey = r3
            java.lang.String r3 = r0.f339286i
            r1.field_pkgType = r3
            java.lang.String r3 = r0.f339285h
            r1.field_pkgPath = r3
            java.lang.String r3 = r0.f339287j
            r1.field_patchId = r3
            long r3 = r0.f339288n
            r1.field_updateTime = r3
            java.lang.String r3 = r0.f339282e
            r1.field_url = r3
            java.lang.String r3 = r0.f339283f
            r1.field_md5 = r3
            long r3 = r0.f339289o
            r1.field_lastUseTime = r3
            com.tencent.mm.plugin.lite.storage.g r0 = f346331c
            com.tencent.mm.plugin.lite.storage.f r0 = r0.mo175484Lo(r2)
            if (r0 != 0) goto L_0x040d
            com.tencent.mm.plugin.lite.storage.g r0 = f346331c
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f346325d
            android.content.ContentValues r1 = r1.convertTo()
            java.lang.String r2 = "majorVersion"
            r0.insert(r7, r2, r1)
            goto L_0x0441
        L_0x040d:
            com.tencent.mm.plugin.lite.storage.g r0 = f346331c
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            r0.update(r1, (java.lang.String[]) r2)
            goto L_0x0441
        L_0x0416:
            com.tencent.mm.plugin.lite.storage.g r0 = f346331c     // Catch:{ Exception -> 0x042c }
            com.tencent.mm.plugin.lite.storage.f r0 = r0.mo175485jo()     // Catch:{ Exception -> 0x042c }
            if (r0 == 0) goto L_0x043c
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Exception -> 0x042c }
            r1.<init>()     // Catch:{ Exception -> 0x042c }
            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo r0 = r0.mo175483l2()     // Catch:{ Exception -> 0x042c }
            r1.putParcelable(r9, r0)     // Catch:{ Exception -> 0x042c }
            r5 = r1
            goto L_0x0442
        L_0x042c:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "getLatestLiteAppBaselibInfo failed. :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r1)
        L_0x043c:
            java.lang.String r0 = "null == latestBaselib"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
        L_0x0441:
            r5 = 0
        L_0x0442:
            return r5
        L_0x0443:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "method"
            r3.putString(r4, r0)
            java.lang.String r0 = "arg"
            r3.putString(r0, r1)
            java.lang.String r0 = "extras"
            r3.putBundle(r0, r2)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            java.lang.Class<com.tencent.mm.plugin.lite.storage.j$a> r1 = com.tencent.p014mm.plugin.lite.storage.C115508j.C115509a.class
            java.lang.Object r0 = com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98749b(r0, r3, r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.lite.storage.C115508j.m162396a(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }
}
