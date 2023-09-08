package lo2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import cy3.C58003b;
import eb0.C31543z5;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import os2.C100405h;
import os2.C77035g;
import rx3.C13598b0;
import vr2.C37817q;

/* renamed from: lo2.b */
public final class C99522b {

    /* renamed from: a */
    public static final C99522b f291759a = new C99522b();

    /* renamed from: b */
    public static int f291760b = 90;

    /* renamed from: c */
    public static int f291761c = 200;

    /* renamed from: d */
    public static long f291762d = (((long) 90) * 86400);

    /* renamed from: lo2.b$c */
    public static final class C34317c extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8478d0 f92470d;

        /* renamed from: e */
        public final /* synthetic */ int f92471e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34317c(C8478d0 d0Var, int i) {
            super(1);
            this.f92470d = d0Var;
            this.f92471e = i;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$3");
            int intValue = ((Number) obj).intValue();
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$3");
            C37817q.m41546b("auto_clean_ad_record_info", "" + intValue, this.f92470d.f27483d, this.f92471e, "");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$3");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$3");
            return b0Var;
        }
    }

    /* renamed from: lo2.b$a */
    public static final class C99523a extends C87413o implements C32224a<C77035g> {

        /* renamed from: d */
        public static final C99523a f291763d = new C99523a();

        public C99523a() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$1");
            C77035g gVar = new C77035g();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$1");
            return gVar;
        }
    }

    /* renamed from: lo2.b$b */
    public static final class C99524b extends C87413o implements C32226l<C77035g, C13598b0> {

        /* renamed from: d */
        public static final C99524b f291764d = new C99524b();

        public C99524b() {
            super(1);
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$2");
            C77035g gVar = (C77035g) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$2");
            C87412m.m108594g(gVar, "item");
            C100405h yx02 = C94866e1.yx0();
            yx02.getClass();
            SnsMethodCalculate.markStartTimeMs("deleteByItem", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage");
            String str = "DELETE FROM AdPullRecordsInfo  where rowid = " + gVar.systemRowid + "  and snsid = '" + gVar.field_snsid + "' ";
            ISQLiteDatabase iSQLiteDatabase = yx02.f294120d;
            Log.m105924i("AdPullRecordsInfoStorage", "deleteByItem " + (iSQLiteDatabase != null ? iSQLiteDatabase.execSQL("AdPullRecordsInfo", str) : false) + ' ' + str);
            SnsMethodCalculate.markEndTimeMs("deleteByItem", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$2");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$2");
            return b0Var;
        }
    }

    /* renamed from: a */
    public static final void m129875a() {
        SnsMethodCalculate.markStartTimeMs("cleanAdStorage", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
        try {
            C99522b bVar = f291759a;
            bVar.mo138920c();
            bVar.mo138919b();
        } catch (Throwable th) {
            Log.printErrStackTrace("AdCleanStorageManager", th, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("cleanAdStorage", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo138919b() {
        /*
            r16 = this;
            java.lang.String r1 = "AdCleanStorageManager"
            java.lang.String r2 = "cleanOldAdTask"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = "isAdAutoCleanEnable"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            r5 = 0
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0036 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ all -> 0x0036 }
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_sns_ad_auto_clean_android     // Catch:{ all -> 0x0036 }
            int r6 = r0.mo58779Qe(r6, r5)     // Catch:{ all -> 0x0036 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r0.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r7 = "isAdAutoCleanEnable called "
            r0.append(r7)     // Catch:{ all -> 0x0034 }
            r0.append(r6)     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0034 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ all -> 0x0034 }
            goto L_0x004d
        L_0x0034:
            r0 = move-exception
            goto L_0x0038
        L_0x0036:
            r0 = move-exception
            r6 = 0
        L_0x0038:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "isAdAutoCleanEnable, exp="
            r7.append(r8)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x004d:
            if (r6 <= 0) goto L_0x0051
            r6 = 1
            goto L_0x0052
        L_0x0051:
            r6 = 0
        L_0x0052:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            if (r6 != 0) goto L_0x005b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x005b:
            int r4 = eb0.C31543z5.m39455e()
            long r6 = (long) r4
            long r8 = f291762d
            long r6 = r6 - r8
            int r7 = (int) r6
            if (r7 >= 0) goto L_0x0067
            r7 = 0
        L_0x0067:
            os2.j r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()
            int r8 = f291761c
            r6.getClass()
            java.lang.String r9 = "getAdLimitIndexForClean"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "select *,rowid from AdSnsInfo  where createTime <= "
            r11.append(r12)
            r11.append(r4)
            java.lang.String r12 = " and "
            r11.append(r12)
            java.lang.String r13 = os2.C100400e0.f294107z
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            java.lang.String r11 = " order by  createTime desc  limit "
            r13.append(r11)
            r13.append(r8)
            java.lang.String r8 = ",1"
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "getAdLimitIndexForClean "
            r11.append(r13)
            r11.append(r8)
            java.lang.String r11 = r11.toString()
            java.lang.String r13 = "MicroMsg.AdSnsInfoStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r11)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r6.f294136d
            r11 = 0
            r14 = 2
            android.database.Cursor r6 = r6.rawQuery(r8, r11, r14)
            boolean r8 = r6.moveToFirst()
            if (r8 == 0) goto L_0x00d9
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r8 = new com.tencent.mm.plugin.sns.storage.AdSnsInfo
            r8.<init>()
            r8.convertFrom((android.database.Cursor) r6)
            goto L_0x00da
        L_0x00d9:
            r8 = r11
        L_0x00da:
            r6.close()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            if (r8 != 0) goto L_0x0101
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "cleanAdStorage() called but limit ad is not greater than "
            r0.append(r4)
            int r4 = f291761c
            r0.append(r4)
            r4 = 33
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0101:
            int r6 = r8.field_createTime
            if (r7 <= r6) goto L_0x0106
            r7 = r6
        L_0x0106:
            os2.j r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()
            r8 = 300(0x12c, float:4.2E-43)
            r6.getClass()
            java.lang.String r9 = "getAdInTimeWithLimit"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "select *,rowid from AdSnsInfo  where createTime > "
            r15.append(r0)
            r15.append(r5)
            r15.append(r12)
            java.lang.String r0 = "createTime"
            r15.append(r0)
            java.lang.String r0 = " <= "
            r15.append(r0)
            r15.append(r7)
            r15.append(r12)
            java.lang.String r0 = os2.C100400e0.f294107z
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            java.lang.String r0 = " order by  createTime desc limit "
            r12.append(r0)
            r12.append(r8)
            java.lang.String r0 = r12.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r12 = "getAdInTime "
            r8.append(r12)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r8)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r6.f294136d
            android.database.Cursor r6 = r6.rawQuery(r0, r11, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            java.lang.String r8 = "deleteByCursor"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r3)
            java.lang.String r0 = eb0.C75592q0.m90789s()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            if (r6 == 0) goto L_0x01e0
            boolean r10 = r6.moveToFirst()     // Catch:{ all -> 0x01d2 }
            if (r10 == 0) goto L_0x01ac
        L_0x0185:
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r10 = new com.tencent.mm.plugin.sns.storage.AdSnsInfo     // Catch:{ all -> 0x01d2 }
            r10.<init>()     // Catch:{ all -> 0x01d2 }
            r10.convertFrom((android.database.Cursor) r6)     // Catch:{ all -> 0x01d2 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r10.convertToSnsInfo()     // Catch:{ all -> 0x01d2 }
            com.tencent.mm.protocal.protobuf.SnsObject r12 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120367e(r10)     // Catch:{ all -> 0x01d2 }
            boolean r12 = vr2.C102260r.m134839H(r12, r0)     // Catch:{ all -> 0x01d2 }
            r13 = 1
            int r5 = r5 + r13
            if (r12 != 0) goto L_0x01a6
            long r12 = r10.field_snsId     // Catch:{ all -> 0x01d2 }
            java.lang.Long r10 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x01d2 }
            r9.add(r10)     // Catch:{ all -> 0x01d2 }
        L_0x01a6:
            boolean r10 = r6.moveToNext()     // Catch:{ all -> 0x01d2 }
            if (r10 != 0) goto L_0x0185
        L_0x01ac:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r0.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r10 = "delete ad size = "
            r0.append(r10)     // Catch:{ all -> 0x01d2 }
            int r10 = r9.size()     // Catch:{ all -> 0x01d2 }
            r0.append(r10)     // Catch:{ all -> 0x01d2 }
            java.lang.String r10 = "  checkedAdCount = "
            r0.append(r10)     // Catch:{ all -> 0x01d2 }
            r0.append(r5)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01d2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ all -> 0x01d2 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x01d2 }
            cy3.C58003b.m67160a(r6, r11)
            goto L_0x01e0
        L_0x01d2:
            r0 = move-exception
            r1 = r0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)     // Catch:{ all -> 0x01d8 }
            throw r1     // Catch:{ all -> 0x01d8 }
        L_0x01d8:
            r0 = move-exception
            cy3.C58003b.m67160a(r6, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
            throw r0
        L_0x01e0:
            int r0 = r9.size()
            boolean r5 = r9.isEmpty()
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x0220
            java.util.Iterator r5 = r9.iterator()
        L_0x01f0:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x021d
            java.lang.Object r6 = r5.next()
            java.lang.Number r6 = (java.lang.Number) r6
            long r10 = r6.longValue()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = "deleteAdWithNoCheck, id="
            r6.append(r12)
            java.lang.String r12 = vr2.C102236a0.m134765q0(r10)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            r6 = 7
            com.tencent.p014mm.plugin.sns.model.C94833a.m120153f(r10, r6)
            goto L_0x01f0
        L_0x021d:
            r9.clear()
        L_0x0220:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = ""
            r1.append(r5)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "auto_clean_ad_info"
            vr2.C37817q.m41546b(r1, r0, r7, r4, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lo2.C99522b.mo138919b():void");
    }

    /* renamed from: c */
    public final void mo138920c() {
        C77035g gVar;
        SnsMethodCalculate.markStartTimeMs("cleanPullAdRecords", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
        int e = C31543z5.m39455e();
        C8478d0 d0Var = new C8478d0();
        int i = (int) (((long) e) - 864000);
        d0Var.f27483d = i;
        if (i < 0) {
            d0Var.f27483d = 0;
        }
        C100405h yx02 = C94866e1.yx0();
        yx02.getClass();
        SnsMethodCalculate.markStartTimeMs("getAdRecordLimitIndexForClean", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage");
        String str = ("select *, rowid from AdPullRecordsInfo  where storeTime <= " + e) + " order by  storeTime desc  limit " + 1000 + ",1";
        Log.m105918d("AdPullRecordsInfoStorage", "getAdRecordLimitIndexForClean " + str);
        ISQLiteDatabase iSQLiteDatabase = yx02.f294120d;
        Cursor rawQuery = iSQLiteDatabase != null ? iSQLiteDatabase.rawQuery(str, (String[]) null, 2) : null;
        if (rawQuery == null) {
            SnsMethodCalculate.markEndTimeMs("getAdRecordLimitIndexForClean", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage");
            gVar = null;
        } else {
            if (rawQuery.moveToFirst()) {
                gVar = new C77035g();
                gVar.convertFrom(rawQuery);
            } else {
                gVar = null;
            }
            rawQuery.close();
            SnsMethodCalculate.markEndTimeMs("getAdRecordLimitIndexForClean", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage");
        }
        if (gVar == null) {
            Log.m105924i("AdCleanStorageManager", "cleanPullAdRecords called but limit ad is not greater than 1000!");
            SnsMethodCalculate.markEndTimeMs("cleanPullAdRecords", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
            return;
        }
        long j = (long) d0Var.f27483d;
        long j2 = gVar.field_storeTime;
        if (j > j2) {
            d0Var.f27483d = (int) j2;
        }
        C100405h yx03 = C94866e1.yx0();
        int i2 = d0Var.f27483d;
        yx03.getClass();
        SnsMethodCalculate.markStartTimeMs("getAdRecordInTimeWithLimit", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage");
        String str2 = ("select *, rowid from AdPullRecordsInfo where storeTime > 0 and storeTime < " + i2) + " order by  storeTime desc limit " + 300;
        Log.m105924i("AdPullRecordsInfoStorage", "getAdRecordInTimeWithLimit " + str2);
        ISQLiteDatabase iSQLiteDatabase2 = yx03.f294120d;
        Cursor rawQuery2 = iSQLiteDatabase2 != null ? iSQLiteDatabase2.rawQuery(str2, (String[]) null, 2) : null;
        SnsMethodCalculate.markEndTimeMs("getAdRecordInTimeWithLimit", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage");
        C99523a aVar = C99523a.f291763d;
        C99524b bVar = C99524b.f291764d;
        C34317c cVar = new C34317c(d0Var, e);
        SnsMethodCalculate.markStartTimeMs("traverseCursor", "com.tencent.mm.plugin.sns.ad.utils.SnsAdDBUtils");
        C87412m.m108594g(aVar, "createBlankItem");
        C87412m.m108594g(bVar, "traverseFunction");
        ArrayList arrayList = new ArrayList();
        if (rawQuery2 != null) {
            try {
                if (rawQuery2.moveToFirst()) {
                    do {
                        IAutoDBItem iAutoDBItem = (IAutoDBItem) aVar.invoke();
                        iAutoDBItem.convertFrom(rawQuery2);
                        arrayList.add(iAutoDBItem);
                    } while (rawQuery2.moveToNext());
                }
                C13598b0 b0Var = C13598b0.f38549a;
                C58003b.m67160a(rawQuery2, (Throwable) null);
            } catch (Throwable th) {
                C58003b.m67160a(rawQuery2, th);
                SnsMethodCalculate.markEndTimeMs("traverseCursor", "com.tencent.mm.plugin.sns.ad.utils.SnsAdDBUtils");
                throw th;
            }
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.invoke((IAutoDBItem) it.next());
            }
            arrayList.clear();
        }
        cVar.invoke(Integer.valueOf(size));
        SnsMethodCalculate.markEndTimeMs("traverseCursor", "com.tencent.mm.plugin.sns.ad.utils.SnsAdDBUtils");
        SnsMethodCalculate.markEndTimeMs("cleanPullAdRecords", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
    }
}
