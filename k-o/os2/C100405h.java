package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;

/* renamed from: os2.h */
public final class C100405h extends MAutoStorage<C77035g> {

    /* renamed from: e */
    public static final String[] f294119e;

    /* renamed from: d */
    public final ISQLiteDatabase f294120d;

    static {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C77035g.f225046B;
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo$Companion");
        SnsMethodCalculate.markStartTimeMs("access$getInfo$cp", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C77035g.f225046B;
        SnsMethodCalculate.markEndTimeMs("access$getInfo$cp", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo");
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo$Companion");
        String createSQLs = MAutoStorage.getCreateSQLs(mAutoDBInfo2, "AdPullRecordsInfo");
        C87412m.m108593f(createSQLs, "getCreateSQLs(AdPullReco…llRecordsInfo.TABLE_NAME)");
        f294119e = new String[]{createSQLs};
    }

    public C100405h(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
        this.f294120d = iSQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        r5 = r5.f134464d;
     */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m131357Lo(java.util.List<? extends te3.C48952c4> r8) {
        /*
            java.lang.String r0 = "insertTimelineAdObj"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            if (r8 == 0) goto L_0x007c
            java.util.Iterator r8 = r8.iterator()
        L_0x0012:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x007c
            java.lang.Object r3 = r8.next()
            te3.c4 r3 = (te3.C48952c4) r3
            if (r3 == 0) goto L_0x0012
            os2.g r4 = new os2.g
            r4.<init>()
            te3.h64 r5 = r3.f131489d
            if (r5 == 0) goto L_0x0030
            com.tencent.mm.protocal.protobuf.SnsObject r5 = r5.f134464d
            if (r5 == 0) goto L_0x0030
            long r5 = r5.f283891Id
            goto L_0x0032
        L_0x0030:
            r5 = 0
        L_0x0032:
            java.lang.String r5 = vr2.C102236a0.m134765q0(r5)
            r4.field_snsid = r5
            com.tencent.mm.plugin.sns.storage.ADInfo r5 = new com.tencent.mm.plugin.sns.storage.ADInfo
            te3.rv3 r3 = r3.f131490e
            java.lang.String r3 = sf0.C48374j0.m53718g(r3)
            r5.<init>(r3)
            java.lang.String r3 = r5.aid
            r4.field_aid = r3
            int r3 = eb0.C31543z5.m39455e()
            long r6 = (long) r3
            r4.field_storeTime = r6
            r3 = 0
            r4.field_isAsync = r3
            r3 = 1
            r4.field_isSelected = r3
            java.lang.String r3 = r5.sessionKeyAd
            r4.field_sessionKey = r3
            java.lang.String r3 = r5.traceid
            r4.field_traceid = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "insert called with: ad = "
            r3.append(r5)
            java.lang.String r5 = r4.field_snsid
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "AdPullRecordsInfoStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            os2.h r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.yx0()
            r3.insert(r4)
            goto L_0x0012
        L_0x007c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: os2.C100405h.m131357Lo(java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final org.json.JSONObject m131358jo() {
        /*
            java.lang.String r1 = "getAdRecordByBeginTime"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = "AdPullRecordsInfoStorage"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r4)
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "getBeginTimeConfigValue"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
            r7 = 0
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x003e }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ all -> 0x003e }
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_sns_ad_passthrough_record_pull_info_config     // Catch:{ all -> 0x003e }
            int r8 = r0.mo58779Qe(r8, r7)     // Catch:{ all -> 0x003e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x003c }
            r0.<init>()     // Catch:{ all -> 0x003c }
            java.lang.String r9 = "getBeginTimeConfigValue called "
            r0.append(r9)     // Catch:{ all -> 0x003c }
            r0.append(r8)     // Catch:{ all -> 0x003c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x003c }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ all -> 0x003c }
            goto L_0x0054
        L_0x003c:
            r0 = move-exception
            goto L_0x0040
        L_0x003e:
            r0 = move-exception
            r8 = 0
        L_0x0040:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "getBeginTimeConfigValue, exp="
            r9.append(r10)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x0054:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
            r0 = 7
            if (r8 <= r0) goto L_0x005b
            r8 = 7
        L_0x005b:
            java.lang.String r0 = "timeConfig"
            r5.put(r0, r8)
            if (r8 > 0) goto L_0x0068
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            goto L_0x021c
        L_0x0068:
            int r0 = eb0.C31543z5.m39455e()
            long r9 = (long) r0
            r11 = 86400(0x15180, double:4.26873E-319)
            long r13 = (long) r8
            long r13 = r13 * r11
            long r9 = r9 - r13
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            java.lang.String r6 = "select *, rowid from AdPullRecordsInfo where storeTime >= "
            r8 = 2
            r12 = 0
            if (r0 != 0) goto L_0x0081
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x0163
        L_0x0081:
            os2.h r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.yx0()
            int r13 = (int) r9
            r0.getClass()
            java.lang.String r14 = "printDbRecord"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r2)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r6)
            r15.append(r13)
            java.lang.String r13 = " limit 1000"
            r15.append(r13)
            java.lang.String r13 = r15.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f294120d
            if (r0 == 0) goto L_0x00ac
            android.database.Cursor r0 = r0.rawQuery(r13, r12, r8)
            goto L_0x00ad
        L_0x00ac:
            r0 = r12
        L_0x00ad:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r7 = "getByBeginTime "
            r15.append(r7)
            r15.append(r13)
            java.lang.String r7 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            if (r0 == 0) goto L_0x00cb
            int r7 = r0.getCount()
            if (r7 != 0) goto L_0x00cb
            r7 = 1
            goto L_0x00cc
        L_0x00cb:
            r7 = 0
        L_0x00cc:
            if (r7 == 0) goto L_0x00d6
            r0.close()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r2)
            goto L_0x0163
        L_0x00d6:
            if (r0 == 0) goto L_0x0160
            r0.moveToFirst()
            boolean r7 = r0.moveToFirst()
            if (r7 == 0) goto L_0x0159
        L_0x00e1:
            os2.g r7 = new os2.g
            r7.<init>()
            r7.convertFrom(r0)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r15 = 32
            r13.append(r15)
            java.lang.String r11 = "printDbRecord$printAdRecord"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r2)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r16 = r13
            long r12 = r7.systemRowid
            r8.append(r12)
            r8.append(r15)
            java.lang.String r12 = r7.field_snsid
            r8.append(r12)
            r8.append(r15)
            java.lang.String r12 = r7.field_traceid
            r8.append(r12)
            java.lang.String r12 = "   "
            r8.append(r12)
            int r13 = r7.field_isAsync
            r8.append(r13)
            r8.append(r12)
            int r12 = r7.field_isSelected
            r8.append(r12)
            java.lang.String r12 = "  "
            r8.append(r12)
            long r12 = r7.field_storeTime
            r8.append(r12)
            r8.append(r15)
            java.lang.String r7 = r7.field_sessionKey
            r8.append(r7)
            r8.append(r15)
            java.lang.String r7 = r8.toString()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r2)
            r8 = r16
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            boolean r7 = r0.moveToNext()
            if (r7 != 0) goto L_0x0156
            goto L_0x0159
        L_0x0156:
            r8 = 2
            r12 = 0
            goto L_0x00e1
        L_0x0159:
            r0.close()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r2)
            goto L_0x0163
        L_0x0160:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r2)
        L_0x0163:
            os2.h r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.yx0()
            int r7 = (int) r9
            r0.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = " and  isSelected = 1 limit 1000"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f294120d
            if (r0 == 0) goto L_0x018d
            r7 = 2
            r8 = 0
            android.database.Cursor r0 = r0.rawQuery(r6, r8, r7)
            goto L_0x018f
        L_0x018d:
            r8 = 0
            r0 = r8
        L_0x018f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "getAdRecordByBeginTime "
            r7.append(r9)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            if (r0 == 0) goto L_0x01ae
            boolean r3 = r0.moveToFirst()
            r6 = 1
            if (r3 != r6) goto L_0x01ae
            r7 = 1
            goto L_0x01af
        L_0x01ae:
            r7 = 0
        L_0x01af:
            if (r7 != 0) goto L_0x01bb
            if (r0 == 0) goto L_0x01b6
            r0.close()
        L_0x01b6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r12 = r8
            goto L_0x01c2
        L_0x01bb:
            r0.moveToFirst()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r12 = r0
        L_0x01c2:
            if (r12 != 0) goto L_0x01c8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            goto L_0x021c
        L_0x01c8:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            boolean r3 = r12.moveToFirst()
            if (r3 == 0) goto L_0x0210
        L_0x01d3:
            os2.g r3 = new os2.g
            r3.<init>()
            r3.convertFrom(r12)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = r3.field_traceid
            java.lang.String r8 = "traceid"
            r6.put(r8, r7)
            java.lang.String r7 = r3.field_aid
            java.lang.String r8 = "aid"
            r6.put(r8, r7)
            java.lang.String r7 = r3.field_snsid
            java.lang.String r8 = "snsid"
            r6.put(r8, r7)
            long r7 = r3.field_storeTime
            java.lang.String r9 = "storeTime"
            r6.put(r9, r7)
            int r3 = r3.field_isAsync
            java.lang.String r7 = "isAsync"
            r6.put(r7, r3)
            r0.put(r6)
            boolean r3 = r12.moveToNext()
            if (r3 != 0) goto L_0x01d3
        L_0x0210:
            r12.close()
            java.lang.String r3 = "records"
            r5.put(r3, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
        L_0x021c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: os2.C100405h.m131358jo():org.json.JSONObject");
    }
}
