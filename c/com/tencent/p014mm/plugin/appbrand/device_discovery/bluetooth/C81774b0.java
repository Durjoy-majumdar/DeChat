package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import android.database.Cursor;
import bj0.C79708a;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p749xh.C91205f6;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b0 */
public final class C81774b0 extends MAutoStorage<C91205f6> {

    /* renamed from: d */
    public static final String[] f239966d = {"appId", "wechatToken"};

    /* renamed from: e */
    public static final String[] f239967e = {"appId", "versionType"};

    /* renamed from: f */
    public static final String[] f239968f = {MAutoStorage.getCreateSQLs(MonitoredBluetoothDeviceInfo.f239963A, "MonitoredBluetoothDeviceInfoV2")};

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b0$a */
    public static final class C81775a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C81774b0 f239969d;

        /* renamed from: e */
        public final /* synthetic */ ISQLiteDatabase f239970e;

        public C81775a(C81774b0 b0Var, ISQLiteDatabase iSQLiteDatabase) {
            this.f239969d = b0Var;
            this.f239970e = iSQLiteDatabase;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
            dy3.C86417a.m107084a(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r9 = this;
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b0 r0 = r9.f239969d
                com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r9.f239970e
                r0.getClass()
                java.lang.String r0 = "migrateFromV1IfNeed fail"
                java.lang.String r2 = "MonitoredBluetoothDeviceInfo"
                boolean r3 = com.tencent.p014mm.plugin.appbrand.utils.C84776q0.m104440b(r1, r2)
                java.lang.String r4 = "MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage"
                if (r3 != 0) goto L_0x001b
                bj0.a r0 = bj0.C79708a.f233619a
                java.lang.String r1 = "migrateFromV1IfNeed, not need"
                r0.mo109821a(r4, r1)
                goto L_0x0062
            L_0x001b:
                com.tencent.mm.plugin.appbrand.utils.b2 r3 = new com.tencent.mm.plugin.appbrand.utils.b2
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                long r5 = r5.getId()
                long r5 = r1.beginTransaction(r5)
                r7 = 0
                r3.<init>(r1, r5, r7)
                bj0.a r5 = bj0.C79708a.f233619a     // Catch:{ Exception -> 0x0051 }
                java.lang.String r6 = "migrateFromV1IfNeed, v1 exists, start migrate to v2"
                r5.mo109821a(r4, r6)     // Catch:{ Exception -> 0x0051 }
                java.lang.String r6 = "MonitoredBluetoothDeviceInfoV2"
                java.lang.String r8 = "INSERT INTO MonitoredBluetoothDeviceInfoV2 SELECT * FROM MonitoredBluetoothDeviceInfo;"
                boolean r6 = r1.execSQL(r6, r8)     // Catch:{ Exception -> 0x0051 }
                if (r6 == 0) goto L_0x005d
                java.lang.String r6 = "migrateFromV1IfNeed, migrate to v2 success, delete v1"
                r5.mo109821a(r4, r6)     // Catch:{ Exception -> 0x0051 }
                boolean r1 = com.tencent.p014mm.plugin.appbrand.utils.C84776q0.m104439a(r1, r2)     // Catch:{ Exception -> 0x0051 }
                if (r1 == 0) goto L_0x005d
                java.lang.String r1 = "migrateFromV1IfNeed, delete v1 success"
                r5.mo109821a(r4, r1)     // Catch:{ Exception -> 0x0051 }
                goto L_0x005d
            L_0x004f:
                r0 = move-exception
                goto L_0x0063
            L_0x0051:
                r1 = move-exception
                bj0.a r2 = bj0.C79708a.f233619a     // Catch:{ all -> 0x004f }
                r2.mo109822b(r4, r0)     // Catch:{ all -> 0x004f }
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x004f }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r0, r2)     // Catch:{ all -> 0x004f }
            L_0x005d:
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x004f }
                dy3.C86417a.m107084a(r3, r7)
            L_0x0062:
                return
            L_0x0063:
                throw r0     // Catch:{ all -> 0x0064 }
            L_0x0064:
                r1 = move-exception
                dy3.C86417a.m107084a(r3, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81774b0.C81775a.run():void");
        }
    }

    static {
        String[] strArr = {"wechatToken", "appId"};
        int i = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(", PRIMARY KEY ( ");
        int i2 = 0;
        while (i < 2) {
            String str = strArr[i];
            int i3 = i2 + 1;
            if (i2 == 0) {
                sb.append(str);
            } else {
                sb.append(", " + str);
            }
            i++;
            i2 = i3;
        }
        sb.append(" )");
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = MonitoredBluetoothDeviceInfo.f239963A;
        mAutoDBInfo.sql += sb4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81774b0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, MonitoredBluetoothDeviceInfo.f239963A, "MonitoredBluetoothDeviceInfoV2", C91205f6.f261501o);
        C87412m.m108594g(iSQLiteDatabase, "db");
        ((C119157j) C119157j.f356862d).mo183884o(new C81775a(this, iSQLiteDatabase));
    }

    /* renamed from: Lo */
    public final synchronized List<MonitoredBluetoothDeviceInfo> mo114167Lo(String str, int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, appId: " + str + ", versionType: " + i);
        Cursor rawQuery = rawQuery("SELECT * FROM " + getTableName() + " WHERE appId = '" + str + "' AND versionType = " + i, new String[0]);
        arrayList = null;
        if (rawQuery != null) {
            if (!rawQuery.moveToFirst()) {
                aVar.mo109821a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, allCursor moveToFirst fail");
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList();
                do {
                    MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = new MonitoredBluetoothDeviceInfo();
                    monitoredBluetoothDeviceInfo.convertFrom(rawQuery);
                    arrayList2.add(monitoredBluetoothDeviceInfo);
                } while (rawQuery.moveToNext());
                rawQuery.close();
            }
            if (arrayList2 != null) {
                arrayList = arrayList2;
            }
        }
        C79708a.f233619a.mo109822b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, allCursor is null");
        return arrayList;
    }

    /* renamed from: jo */
    public final synchronized List<MonitoredBluetoothDeviceInfo> mo114168jo(String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, appId: " + str);
        Cursor rawQuery = rawQuery("SELECT * FROM " + getTableName() + " WHERE appId = '" + str + '\'', new String[0]);
        arrayList = null;
        if (rawQuery != null) {
            if (!rawQuery.moveToFirst()) {
                aVar.mo109821a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, allCursor moveToFirst fail");
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList();
                do {
                    MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = new MonitoredBluetoothDeviceInfo();
                    monitoredBluetoothDeviceInfo.convertFrom(rawQuery);
                    arrayList2.add(monitoredBluetoothDeviceInfo);
                } while (rawQuery.moveToNext());
                rawQuery.close();
            }
            if (arrayList2 != null) {
                arrayList = arrayList2;
            }
        }
        C79708a.f233619a.mo109822b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, allCursor is null");
        return arrayList;
    }
}
