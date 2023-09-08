package os2;

import android.content.ContentValues;
import android.database.Cursor;
import bp3.C79758p;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.autogen.events.SnsLuckyCheckFilterEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsSQLExecuteReportStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteTrace;
import com.tencent.wcdb.support.CancellationSignal;
import di3.C86312j;
import h81.C32735h;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import jr2.C33651p;
import lf3.C99414b;
import lo2.C99530e0;
import os2.C100411k0;
import p749xh.C102646h;
import p749xh.C102661q8;
import vr2.C102236a0;
import vr2.C37817q;
import zh3.C119118e;

/* renamed from: os2.e0 */
public class C100400e0 extends MAutoStorage<SnsInfo> implements C33651p {

    /* renamed from: A */
    public static String f294087A;

    /* renamed from: B */
    public static String f294088B;

    /* renamed from: C */
    public static String f294089C = " (type = 7 ) ";

    /* renamed from: D */
    public static ArrayList<Integer> f294090D = v10(Arrays.asList(new Integer[]{16, 32, 2, 8, 64, 128, 256, 512, 2048}));

    /* renamed from: E */
    public static ArrayList<Integer> f294091E = v10(Arrays.asList(new Integer[]{2, 4, 8, 16, 64, 128, 256}));

    /* renamed from: h */
    public static final String[] f294092h = {MAutoStorage.getCreateSQLs(SnsInfo.info, C102661q8.TABLE_NAME)};

    /* renamed from: i */
    public static String[] f294093i = {"snsId", "userName", "localFlag", "createTime", "head", "localPrivate", "type", "sourceType", "likeFlag", "pravited", "stringSeq", "content", "attrBuf", "postBuf", "rowid"};

    /* renamed from: j */
    public static final String[] f294094j = {"CREATE INDEX IF NOT EXISTS serverSnsNameIndex ON SnsInfo ( snsId )", "CREATE INDEX IF NOT EXISTS serverSnsTimeHeadIndex ON SnsInfo ( head )", "DROP INDEX IF EXISTS serverSnsTimeIndex", "DROP INDEX IF EXISTS serverSnsTimeSourceTypeIndex", "CREATE INDEX IF NOT EXISTS snsMultiIndex1 ON SnsInfo ( createTime,snsId,sourceType,type)", "CREATE INDEX IF NOT EXISTS snsMultiIndex2 ON SnsInfo ( sourceType,type,userName)", "CREATE INDEX IF NOT EXISTS snsMultiIndex3 ON SnsInfo ( userName,sourceType)", "CREATE INDEX IF NOT EXISTS snsLocalflagIndex ON SnsInfo ( localFlag )"};

    /* renamed from: n */
    public static String f294095n;

    /* renamed from: o */
    public static String f294096o = " order by SnsInfo.createTime desc ,snsId desc";

    /* renamed from: p */
    public static String f294097p = " order by SnsInfo.createTime asc ,snsId asc";

    /* renamed from: q */
    public static String f294098q = " order by SnsInfo.head desc ,SnsInfo.createTime desc ";

    /* renamed from: r */
    public static String f294099r = " order by SnsInfo.head desc ,snsId desc";

    /* renamed from: s */
    public static String f294100s;

    /* renamed from: t */
    public static String f294101t;

    /* renamed from: u */
    public static String f294102u;

    /* renamed from: v */
    public static String f294103v;

    /* renamed from: w */
    public static String f294104w;

    /* renamed from: x */
    public static String f294105x;

    /* renamed from: y */
    public static String f294106y;

    /* renamed from: z */
    public static String f294107z;

    /* renamed from: d */
    public C100411k0 f294108d;

    /* renamed from: e */
    public boolean f294109e;

    /* renamed from: f */
    public final String f294110f = " from SnsInfo".toLowerCase();

    /* renamed from: g */
    public SQLiteTrace f294111g = new C100401a();

    /* renamed from: os2.e0$a */
    public class C100401a implements SQLiteTrace {

        /* renamed from: os2.e0$a$a */
        public class C100402a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f294113d;

            /* renamed from: e */
            public final /* synthetic */ long f294114e;

            /* renamed from: f */
            public final /* synthetic */ int f294115f;

            public C100402a(C100401a aVar, String str, long j, int i) {
                this.f294113d = str;
                this.f294114e = j;
                this.f294115f = i;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1$1");
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("SnsMMKV");
                long j = mmkv.getLong("SnsMMKVCleanDbCount", -1);
                if (j >= 0) {
                    SnsMethodCalculate.markStartTimeMs("getSQLHashMap", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
                    ConcurrentHashMap<Integer, C100411k0.C100412a> concurrentHashMap = C100411k0.f294165i;
                    SnsMethodCalculate.markEndTimeMs("getSQLHashMap", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
                    if (concurrentHashMap != null) {
                        SnsMethodCalculate.markStartTimeMs("getSQLHashMap", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
                        ConcurrentHashMap<Integer, C100411k0.C100412a> concurrentHashMap2 = C100411k0.f294165i;
                        SnsMethodCalculate.markEndTimeMs("getSQLHashMap", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
                        C100411k0.C100412a aVar = concurrentHashMap2.get(Integer.valueOf(this.f294113d.hashCode()));
                        if (aVar != null) {
                            if (aVar.f294166a == null) {
                                aVar.f294166a = "";
                            }
                            boolean z = mmkv.getBoolean("SnsMMKVCleanDbIsFirstTime", true);
                            boolean z2 = this.f294114e >= ((long) ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_sql_trace_report_threshold, 10));
                            Log.m105925i("MicroMsg.SnsInfoStorage", "SQLExecuted needReport:%s, type:%s, time:%s, isBeforeFirstTime:%s, isMainThread:%s, sql:%s, stack:%s", Boolean.valueOf(z2), Integer.valueOf(this.f294115f), Long.valueOf(this.f294114e), Boolean.valueOf(z), Boolean.valueOf(aVar.f294167b), this.f294113d, aVar.f294166a);
                            if (z2) {
                                SnsSQLExecuteReportStruct snsSQLExecuteReportStruct = new SnsSQLExecuteReportStruct();
                                snsSQLExecuteReportStruct.f266161d = j;
                                snsSQLExecuteReportStruct.f266163f = this.f294114e;
                                snsSQLExecuteReportStruct.f266164g = snsSQLExecuteReportStruct.mo86045b("Sql", this.f294113d.replace(',', ' '), true);
                                snsSQLExecuteReportStruct.f266162e = this.f294115f;
                                snsSQLExecuteReportStruct.f266165h = snsSQLExecuteReportStruct.mo86045b("Stack", aVar.f294166a, true);
                                snsSQLExecuteReportStruct.f266166i = z ? 1 : 0;
                                snsSQLExecuteReportStruct.f266167j = aVar.f294167b ? 1 : 0;
                                snsSQLExecuteReportStruct.mo86055o();
                            }
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1$1");
            }
        }

        public C100401a() {
        }

        public void onConnectionObtained(SQLiteDatabase sQLiteDatabase, String str, long j, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onConnectionObtained", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1");
            SnsMethodCalculate.markEndTimeMs("onConnectionObtained", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1");
        }

        public void onConnectionPoolBusy(SQLiteDatabase sQLiteDatabase, String str, long j, boolean z, List<SQLiteTrace.TraceInfo<String>> list, List<SQLiteTrace.TraceInfo<StackTraceElement[]>> list2) {
            SnsMethodCalculate.markStartTimeMs("onConnectionPoolBusy", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1");
            SnsMethodCalculate.markEndTimeMs("onConnectionPoolBusy", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1");
        }

        public void onDatabaseCorrupted(SQLiteDatabase sQLiteDatabase) {
            SnsMethodCalculate.markStartTimeMs("onDatabaseCorrupted", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1");
            SnsMethodCalculate.markEndTimeMs("onDatabaseCorrupted", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1");
        }

        public void onSQLExecuted(SQLiteDatabase sQLiteDatabase, String str, int i, long j) {
            SnsMethodCalculate.markStartTimeMs("onSQLExecuted", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1");
            String lowerCase = str.toLowerCase();
            C100400e0 e0Var = C100400e0.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            String str2 = e0Var.f294110f;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            if (lowerCase.contains(str2)) {
                C94866e1.my0().post(new C100402a(this, str, j, i));
            }
            SnsMethodCalculate.markEndTimeMs("onSQLExecuted", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1");
        }
    }

    static {
        f294095n = "";
        f294105x = null;
        f294095n = "select ";
        int i = 0;
        while (true) {
            String[] strArr = f294093i;
            if (i >= strArr.length) {
                break;
            }
            if (i < strArr.length - 1) {
                f294095n += " " + f294093i[i] + ",";
            } else {
                f294095n += " " + f294093i[i] + " ";
            }
            i++;
        }
        Log.m105924i("MicroMsg.SnsInfoStorage", "TIMELINE_SELECT_BEGIN " + f294095n);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = f294090D.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if ((intValue & 16) != 0 && (intValue & 32) == 0 && (intValue & 512) == 0) {
                arrayList.add(Integer.valueOf(intValue));
            }
        }
        String jo = m131329jo(arrayList, "localFlag");
        f294100s = jo;
        Log.m105925i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", jo);
        arrayList.clear();
        Iterator<Integer> it4 = f294090D.iterator();
        while (it4.hasNext()) {
            int intValue2 = it4.next().intValue();
            if ((intValue2 & 32) != 0) {
                arrayList.add(Integer.valueOf(intValue2));
            }
        }
        String jo4 = m131329jo(arrayList, "localFlag");
        f294102u = jo4;
        Log.m105925i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", jo4);
        arrayList.clear();
        Iterator<Integer> it5 = f294090D.iterator();
        while (it5.hasNext()) {
            int intValue3 = it5.next().intValue();
            if ((intValue3 & 64) == 0 && (intValue3 & 32) != 0) {
                arrayList.add(Integer.valueOf(intValue3));
            }
        }
        f294106y = m131329jo(arrayList, "localFlag");
        arrayList.clear();
        Iterator<Integer> it6 = f294090D.iterator();
        while (it6.hasNext()) {
            int intValue4 = it6.next().intValue();
            if (!((intValue4 & 2048) == 0 || (intValue4 & 32) == 0)) {
                arrayList.add(Integer.valueOf(intValue4));
            }
        }
        f294088B = m131329jo(arrayList, "localFlag");
        arrayList.clear();
        Iterator<Integer> it7 = f294091E.iterator();
        while (it7.hasNext()) {
            int intValue5 = it7.next().intValue();
            if ((intValue5 & 8) != 0) {
                arrayList.add(Integer.valueOf(intValue5));
            }
        }
        String jo5 = m131329jo(arrayList, "sourceType");
        f294104w = jo5;
        Log.m105925i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", jo5);
        arrayList.clear();
        Iterator<Integer> it8 = f294091E.iterator();
        while (it8.hasNext()) {
            int intValue6 = it8.next().intValue();
            if ((intValue6 & 2) != 0) {
                arrayList.add(Integer.valueOf(intValue6));
            }
        }
        Log.m105925i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", m131329jo(arrayList, "sourceType"));
        arrayList.clear();
        Iterator<Integer> it9 = f294091E.iterator();
        while (it9.hasNext()) {
            int intValue7 = it9.next().intValue();
            if ((intValue7 & 4) != 0) {
                arrayList.add(Integer.valueOf(intValue7));
            }
        }
        String jo6 = m131329jo(arrayList, "sourceType");
        f294103v = jo6;
        Log.m105925i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", jo6);
        arrayList.clear();
        Iterator<Integer> it10 = f294090D.iterator();
        while (it10.hasNext()) {
            int intValue8 = it10.next().intValue();
            if ((intValue8 & 256) != 0) {
                arrayList.add(Integer.valueOf(intValue8));
            }
        }
        f294107z = m131328Lo(arrayList, "localFlag", true);
        arrayList.clear();
        Iterator<Integer> it11 = f294091E.iterator();
        while (it11.hasNext()) {
            int intValue9 = it11.next().intValue();
            if ((intValue9 & 16) != 0) {
                arrayList.add(Integer.valueOf(intValue9));
            }
        }
        f294087A = m131329jo(arrayList, "sourceType");
        arrayList.clear();
        Iterator<Integer> it12 = f294091E.iterator();
        while (it12.hasNext()) {
            int intValue10 = it12.next().intValue();
            if ((intValue10 & 64) != 0) {
                arrayList.add(Integer.valueOf(intValue10));
            }
        }
        f294105x = m131329jo(arrayList, "sourceType");
        arrayList.clear();
        Iterator<Integer> it13 = f294090D.iterator();
        while (it13.hasNext()) {
            int intValue11 = it13.next().intValue();
            if ((intValue11 & 512) != 0) {
                arrayList.add(Integer.valueOf(intValue11));
            }
        }
        f294101t = m131329jo(arrayList, "localFlag");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100400e0(C100411k0 k0Var) {
        super(k0Var, SnsInfo.info, C102661q8.TABLE_NAME, f294094j);
        boolean z;
        int i;
        Class cls = C32735h.class;
        this.f294108d = k0Var;
        SnsMethodCalculate.markStartTimeMs("tryAddDBCol", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        Cursor rawQuery = k0Var.rawQuery("PRAGMA table_info( SnsInfo )", (String[]) null, 2);
        int columnIndex = rawQuery.getColumnIndex("name");
        boolean z2 = false;
        while (rawQuery.moveToNext()) {
            if (columnIndex >= 0 && C102661q8.COL_SERVEREXTFLAG.equalsIgnoreCase(rawQuery.getString(columnIndex))) {
                z2 = true;
            }
        }
        rawQuery.close();
        long beginTransaction = k0Var.beginTransaction(Thread.currentThread().getId());
        if (!z2) {
            k0Var.execSQL(C102661q8.TABLE_NAME, "Alter table SnsInfo add serverExtFlag INT DEFAULT 0");
        }
        k0Var.endTransaction(beginTransaction);
        SnsMethodCalculate.markEndTimeMs("tryAddDBCol", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        SnsMethodCalculate.markStartTimeMs("checkSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_init_delete_invalid_snsid, true)) {
            SnsMethodCalculate.markStartTimeMs("deleteInvalidSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            Log.m105925i("MicroMsg.SnsInfoStorage", "deleteInvalidSnsId result:%d", Integer.valueOf(this.f294108d.delete(C102661q8.TABLE_NAME, "snsId=?", new String[]{"9223372036854775807"})));
            SnsMethodCalculate.markEndTimeMs("deleteInvalidSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        }
        Cursor rawQuery2 = this.f294108d.rawQuery("select count(*) from SnsInfo where snsId > 0;", (String[]) null, 2);
        if (!rawQuery2.moveToFirst() || (i = rawQuery2.getInt(0)) <= 0) {
            rawQuery2.close();
            SnsMethodCalculate.markEndTimeMs("checkSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            z = false;
        } else {
            Log.m105925i("MicroMsg.SnsInfoStorage", "exsits snsId > 0  ,count is %d", Integer.valueOf(i));
            rawQuery2.close();
            SnsMethodCalculate.markEndTimeMs("checkSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            z = true;
        }
        boolean z3 = !z;
        this.f294109e = z3;
        if (z3) {
            Log.m105924i("MicroMsg.SnsInfoStorage", "all sndId < 0 ,so optimalizeForSnsId");
        } else {
            f294096o = " order by SnsInfo.createTime desc ,case when snsId < 0 then 0 else 1 end ,  snsId desc";
            f294097p = " order by SnsInfo.createTime asc ,case when snsId < 0 then 0 else 1 end ,  snsId asc";
            f294098q = " order by SnsInfo.head desc ,SnsInfo.createTime desc ";
            f294099r = " order by SnsInfo.head desc ,case when snsId < 0 then 0 else 1 end ,  snsId desc";
        }
        if (Util.getInt(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_sns_sql_trace_switch, "0"), 0) > 0) {
            C119118e.f356737q = this.f294111g;
        }
    }

    /* renamed from: CP */
    public static String m131327CP() {
        SnsMethodCalculate.markStartTimeMs("getCON_TIMELINE", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        SnsMethodCalculate.markStartTimeMs("isFilterLucky", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        SnsLuckyCheckFilterEvent snsLuckyCheckFilterEvent = new SnsLuckyCheckFilterEvent();
        snsLuckyCheckFilterEvent.publish();
        snsLuckyCheckFilterEvent.f265172d.getClass();
        SnsMethodCalculate.markEndTimeMs("isFilterLucky", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        SnsMethodCalculate.markEndTimeMs("getCON_TIMELINE", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return " (sourceType & 2 != 0 ) ";
    }

    /* renamed from: Lo */
    public static String m131328Lo(List<Integer> list, String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("buildLimitString", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        StringBuilder sb = new StringBuilder("(");
        if (z) {
            sb.append(str + " not in (");
        } else {
            sb.append(str + " in (");
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        sb.append(")");
        sb.append(")");
        String sb4 = sb.toString();
        SnsMethodCalculate.markEndTimeMs("buildLimitString", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return sb4;
    }

    /* renamed from: jo */
    public static String m131329jo(List<Integer> list, String str) {
        SnsMethodCalculate.markStartTimeMs("buildLimitString", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        String Lo = m131328Lo(list, str, false);
        SnsMethodCalculate.markEndTimeMs("buildLimitString", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return Lo;
    }

    public static ArrayList<Integer> v10(List<Integer> list) {
        SnsMethodCalculate.markStartTimeMs("getORIntRange", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        ArrayList arrayList = new ArrayList(list);
        HashSet hashSet = new HashSet();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                arrayList3.add(Integer.valueOf(((Integer) it4.next()).intValue() | num.intValue()));
            }
            hashSet.addAll(new HashSet(arrayList3));
            hashSet.add(num);
        }
        hashSet.add(0);
        arrayList2.addAll(hashSet);
        SnsMethodCalculate.markEndTimeMs("getORIntRange", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return arrayList2;
    }

    public long Ab0(long j, int i, String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("getUserMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long b002 = b00(ko0(false, str, z, false), j, i, false);
        SnsMethodCalculate.markEndTimeMs("getUserMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return b002;
    }

    public void Ax0(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("updateFilterUserNameAll", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        yx0(str, z, mo139802Ow(str, z) + " AND " + " (snsId != 0  ) ");
        SnsMethodCalculate.markEndTimeMs("updateFilterUserNameAll", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public void Bx0(String str, boolean z, String str2) {
        SnsMethodCalculate.markStartTimeMs("updateFilterUserNameBelow", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        String str3 = mo139802Ow(str, z) + " AND " + " (snsId != 0  ) ";
        if (zs0(str2)) {
            str3 = str3 + " AND " + mo139831uP(str2);
        }
        yx0(str, z, str3);
        SnsMethodCalculate.markEndTimeMs("updateFilterUserNameBelow", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    /* renamed from: CZ */
    public int mo139797CZ(String str) {
        SnsMethodCalculate.markStartTimeMs("getLastTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        P50();
        String str2 = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ";
        if (zs0(str)) {
            str2 = str2 + " AND " + mo139827nP(str);
        }
        String str3 = (str2 + " AND  (snsId != 0 ) ") + f294097p + " limit 1";
        Cursor rawQuery = this.f294108d.rawQuery(str3, (String[]) null, 2);
        int i = 0;
        if (rawQuery.moveToFirst()) {
            SnsInfo snsInfo = new SnsInfo();
            snsInfo.convertFrom(rawQuery);
            i = snsInfo.field_createTime;
        }
        rawQuery.close();
        Log.m105924i("MicroMsg.SnsInfoStorage", "getLastTime " + str3 + " createtime " + i);
        SnsMethodCalculate.markEndTimeMs("getLastTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return i;
    }

    /* renamed from: DN */
    public SnsInfo mo139798DN(String str) {
        SnsMethodCalculate.markStartTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (C100417r0.m131418g(str)) {
            SnsInfo LL = mo139800LL(C100417r0.m131424m(str));
            SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return LL;
        }
        AdSnsInfo qq = C94866e1.zx0().mo139865qq(C100417r0.m131424m(str));
        if (qq != null) {
            SnsInfo convertToSnsInfo = qq.convertToSnsInfo();
            SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return convertToSnsInfo;
        }
        SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return null;
    }

    public int Jt0(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("set", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        Log.m105918d("MicroMsg.SnsInfoStorage", "SnsInfo Insert");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("set", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return -1;
        }
        int q = (int) this.f294108d.mo125627q(C102661q8.TABLE_NAME, "", snsInfo.convertTo(), false);
        Log.m105918d("MicroMsg.SnsInfoStorage", "SnsInfo Insert result " + q);
        SnsMethodCalculate.markEndTimeMs("set", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return q;
    }

    /* renamed from: LL */
    public SnsInfo mo139800LL(int i) {
        SnsMethodCalculate.markStartTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        SnsInfo snsInfo = new SnsInfo();
        Cursor rawQuery = this.f294108d.rawQuery("select *,rowid from SnsInfo  where SnsInfo.rowid=" + i, (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            snsInfo.convertFrom(rawQuery);
            rawQuery.close();
            Log.m105919d("MicroMsg.SnsInfoStorage", "getByLocalId localId:%d find SnsInfo id:%d ", Integer.valueOf(i), Long.valueOf(snsInfo.field_snsId));
            SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return snsInfo;
        }
        rawQuery.close();
        Log.m105921e("MicroMsg.SnsInfoStorage", "getByLocalId localId:%d find SnsInfo: null ", Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return null;
    }

    /* renamed from: NQ */
    public final Cursor mo139801NQ(boolean z, String str, int i, boolean z2, String str2, int i2, int i3) {
        String str3;
        SnsMethodCalculate.markStartTimeMs("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        String ko02 = ko0(z, str, z2, false);
        if (zs0(str2)) {
            ko02 = ko02 + " AND " + mo139827nP(str2);
        }
        if (i2 != i3) {
            ko02 = (ko02 + " AND createTime <=  " + i3) + " AND createTime >=  " + i2;
        }
        if (z2) {
            str3 = ko02 + f294098q;
        } else {
            str3 = ko02 + f294099r;
        }
        if (i > 0) {
            str3 = str3 + " LIMIT " + i;
        }
        Log.m105918d("MicroMsg.SnsInfoStorage", "getCursorByUserName in gallery " + str3);
        Cursor rawQuery = this.f294108d.rawQuery(str3, (String[]) null);
        SnsMethodCalculate.markEndTimeMs("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return rawQuery;
    }

    /* renamed from: Ow */
    public final String mo139802Ow(String str, boolean z) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("conUserWhere", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (z) {
            str2 = "" + " WHERE " + f294103v;
        } else {
            str2 = ("" + " WHERE SnsInfo.userName=\"" + Util.escapeSqlValue(str) + FastJsonResponse.QUOTE) + " AND " + f294104w;
        }
        SnsMethodCalculate.markEndTimeMs("conUserWhere", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return str2;
    }

    public final String P50() {
        SnsMethodCalculate.markStartTimeMs("getTimeLineSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        m131327CP();
        SnsMethodCalculate.markEndTimeMs("getTimeLineSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ";
    }

    public boolean Pq0(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (snsInfo.isAd()) {
            boolean replace = C94866e1.zx0().replace(snsInfo.getAdSnsInfo());
            SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return replace;
        }
        boolean z = this.f294108d.replace(C102661q8.TABLE_NAME, "", snsInfo.convertTo()) > 0;
        Log.m105918d("MicroMsg.SnsInfoStorage", "SnsInfo replace result " + z);
        SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z;
    }

    public int Rv0(int i, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("updateByLocal", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        ContentValues convertTo = snsInfo.convertTo();
        convertTo.remove("rowid");
        C100411k0 k0Var = this.f294108d;
        int update = k0Var.update(C102661q8.TABLE_NAME, convertTo, "rowid=?", new String[]{"" + i});
        Log.m105919d("MicroMsg.SnsInfoStorage", "updateByLocal result:%d, localId:%d, snsId:%d", Integer.valueOf(update), Integer.valueOf(i), Long.valueOf(snsInfo.field_snsId));
        SnsMethodCalculate.markEndTimeMs("updateByLocal", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return update;
    }

    /* renamed from: SE */
    public SnsInfo mo139806SE(long j) {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        SnsInfo snsInfo = new SnsInfo();
        Cursor rawQuery = this.f294108d.rawQuery("select *,rowid from SnsInfo  where SnsInfo.snsId=" + j + " limit 1", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            snsInfo.convertFrom(rawQuery);
            rawQuery.close();
            SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return snsInfo;
        }
        rawQuery.close();
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return null;
    }

    /* renamed from: TE */
    public SnsInfo mo139807TE(String str) {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (C100417r0.m131418g(str)) {
            SnsInfo SE = mo139806SE(C100417r0.m131425n(str));
            SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return SE;
        }
        AdSnsInfo jo = C94866e1.zx0().mo139864jo(C100417r0.m131425n(str));
        if (jo != null) {
            SnsInfo convertToSnsInfo = jo.convertToSnsInfo();
            SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return convertToSnsInfo;
        }
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return null;
    }

    /* renamed from: TO */
    public final String mo139808TO(String str) {
        SnsMethodCalculate.markStartTimeMs("getCDAboveExcudeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str == null || str.equals("")) {
            SnsMethodCalculate.markEndTimeMs("getCDAboveExcudeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return " ";
        } else if (this.f294109e) {
            String str2 = " (snsId > " + wt0(Util.escapeSqlValue(str)) + " ) ";
            SnsMethodCalculate.markEndTimeMs("getCDAboveExcudeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return str2;
        } else {
            String str3 = " (stringSeq >\"" + Util.escapeSqlValue(str) + "\"  ) ";
            SnsMethodCalculate.markEndTimeMs("getCDAboveExcudeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return str3;
        }
    }

    /* renamed from: TY */
    public int mo139809TY(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getFeedsGapCount", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        m131327CP();
        String str3 = "select snsId from SnsInfo  where  (sourceType & 2 != 0 ) ";
        if (zs0(str)) {
            str3 = str3 + " AND " + mo139831uP(str);
        }
        if (zs0(str2)) {
            str3 = str3 + " AND " + mo139808TO(str2);
        }
        String str4 = str3 + f294096o;
        Log.m105919d("MicroMsg.SnsInfoStorage", "getAdCursorForTimeLine:%s upLimtiSeq:%s downLimitSeq:%s", str4, str, str2);
        int count = this.f294108d.rawQuery(str4, (String[]) null).getCount();
        SnsMethodCalculate.markEndTimeMs("getFeedsGapCount", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return count;
    }

    public final String Wa0(boolean z, String str, boolean z2, boolean z3) {
        SnsMethodCalculate.markStartTimeMs("getUserMediaSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        StringBuilder sb = new StringBuilder();
        sb.append("select *,rowid from SnsInfo ");
        SnsMethodCalculate.markStartTimeMs("conAlbumWhere", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        SnsMethodCalculate.markEndTimeMs("conAlbumWhere", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        sb.append(" WHERE " + f294105x);
        String str2 = sb.toString() + " AND type in ( 1 , 15)";
        SnsMethodCalculate.markEndTimeMs("getUserMediaSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return str2;
    }

    public int X90(int i, String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("getUserCountWithLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        SnsMethodCalculate.markStartTimeMs("getCheckUserDataCountSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        SnsMethodCalculate.markEndTimeMs("getCheckUserDataCountSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        Cursor rawQuery = this.f294108d.rawQuery("select snsId from SnsInfo " + mo139802Ow(str, z) + " AND type in ( 1,2 , 3 , 4 , 18 , 5 , 12 , 9 , 14 , 15 , 13 , 21 , 25 , 26,28,29,30 , 34,45,43,38,33,37,36,39,41,42,44,46,101)" + " and " + " (snsId != 0  ) " + " limit " + i, (String[]) null);
        int count = rawQuery.getCount();
        rawQuery.close();
        SnsMethodCalculate.markEndTimeMs("getUserCountWithLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return count;
    }

    /* renamed from: Yt */
    public void mo139812Yt(long j, long j2, String str, CancellationSignal cancellationSignal) {
        long longForQuery;
        SnsMethodCalculate.markStartTimeMs("cleanDbExpireExcludeSelf", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        String str2 = "DELETE FROM SnsInfo WHERE rowid IN (SELECT rowid FROM SnsInfo WHERE createTime < " + j + " AND " + "userName" + " != '" + str + "' LIMIT " + j2 + ")";
        int i = 0;
        do {
            i++;
            this.f294108d.mo125615f().beginTransaction();
            try {
                this.f294108d.mo125615f().execSQL(str2, (Object[]) null, cancellationSignal);
                longForQuery = DatabaseUtils.longForQuery(this.f294108d.mo125615f(), "SELECT changes()", (String[]) null);
                Log.m105925i("MicroMsg.SnsInfoStorage", "cleanSnsTablesByTimeLimit cleanDbExpire, %s, count:%s, limitCount:%s", Integer.valueOf(i), Long.valueOf(longForQuery), Long.valueOf(j2));
                this.f294108d.mo125615f().setTransactionSuccessful();
                try {
                    this.f294108d.mo125615f().endTransaction();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                try {
                    this.f294108d.mo125615f().endTransaction();
                } catch (Exception unused2) {
                }
                SnsMethodCalculate.markEndTimeMs("cleanDbExpireExcludeSelf", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                throw th;
            }
        } while (longForQuery > 0);
        boolean execSQL = this.f294108d.execSQL(C102661q8.TABLE_NAME, "VACUUM");
        Log.m105918d("MicroMsg.SnsInfoStorage", "cleanSnsTablesByTimeLimit cleanDbExpire:" + str2);
        Log.m105924i("MicroMsg.SnsInfoStorage", "cleanSnsTablesByTimeLimit cleanDbExpire vacuumResult:" + execSQL);
        SnsMethodCalculate.markEndTimeMs("cleanDbExpireExcludeSelf", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public final long b00(String str, long j, int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("getMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (j != 0) {
            str = str + " AND SnsInfo.stringSeq < '" + C102236a0.m134705B(C102236a0.m134765q0(j)) + "'";
        }
        if (z) {
            str = str + " AND  (snsId != 0 ) ";
        }
        String str2 = (str + f294096o) + " limit " + i;
        Log.m105919d("MicroMsg.SnsInfoStorage", "getMinSeqByLimit %s \n maxId=%s", str2, Long.valueOf(j));
        Cursor rawQuery = this.f294108d.rawQuery(str2, (String[]) null);
        if (rawQuery.moveToLast()) {
            SnsInfo snsInfo = new SnsInfo();
            snsInfo.convertFrom(rawQuery);
            rawQuery.close();
            long j2 = snsInfo.field_snsId;
            SnsMethodCalculate.markEndTimeMs("getMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return j2;
        }
        rawQuery.close();
        SnsMethodCalculate.markEndTimeMs("getMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return 0;
    }

    /* renamed from: bD */
    public boolean mo139814bD(int i) {
        SnsMethodCalculate.markStartTimeMs("deleteByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        boolean z = true;
        Log.printInfoStack("MicroMsg.SnsInfoStorage", "deleteByLocalId localId:%s", Integer.valueOf(i));
        C100411k0 k0Var = this.f294108d;
        if (k0Var.delete(C102661q8.TABLE_NAME, "rowid=?", new String[]{"" + i}) <= 0) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("deleteByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z;
    }

    /* renamed from: bF */
    public Cursor mo139815bF(String str, String str2, int i, int i2) {
        boolean z;
        String str3;
        boolean z2;
        Cursor cursor;
        String str4 = str;
        String str5 = str2;
        int i3 = i;
        int i4 = i2;
        SnsMethodCalculate.markStartTimeMs("getAdCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        StringBuilder sb = new StringBuilder();
        sb.append(f294095n + " from " + C102661q8.TABLE_NAME + " where ");
        m131327CP();
        sb.append(" (sourceType & 2 != 0 ) ");
        String sb4 = sb.toString();
        if (zs0(str)) {
            sb4 = sb4 + " AND " + mo139827nP(str);
        }
        if (zs0(str5)) {
            sb4 = sb4 + " AND " + mo139832vP(str5);
        }
        String str6 = sb4 + " AND createTime >= " + i3;
        if (i3 <= 0) {
            SnsMethodCalculate.markStartTimeMs("isAdLowTimeLimitZero", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            SnsMethodCalculate.markEndTimeMs("isAdLowTimeLimitZero", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            try {
                C115669n.INSTANCE.mo175911u(1612, 28);
            } catch (Throwable unused) {
            }
            Log.m105920e("MicroMsg.SnsInfoStorage", "getAdCursorForTimeLine: downTime=" + i3 + ", upTime=" + i4 + ", downSeq=" + str4 + ", upSeq=" + str5);
            z = false;
        } else {
            z = true;
        }
        if (z) {
            String str7 = str6 + " UNION ";
            if (i4 <= 0 || i4 <= i3) {
                str3 = "getAdCursorForTimeLine";
                str6 = str7 + f294095n + " from " + C102646h.TABLE_NAME + " where " + "createTime" + " > " + i3 + " and " + f294107z;
            } else {
                str3 = "getAdCursorForTimeLine";
                str6 = str7 + f294095n + " from " + C102646h.TABLE_NAME + " where " + "createTime" + " > " + i3 + " and " + "createTime" + " < " + i4 + " and " + f294107z;
            }
        } else {
            str3 = "getAdCursorForTimeLine";
        }
        String str8 = str6 + f294096o;
        Log.m105919d("MicroMsg.SnsInfoStorage", "getAdCursorForTimeLine:%s, downLimtiSeq:%s, upLimitSeq:%s", str8, str4, str5);
        Cursor cursor2 = null;
        if (z) {
            SnsMethodCalculate.markStartTimeMs("isConsecutiveFilter", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper");
            SnsMethodCalculate.markEndTimeMs("isConsecutiveFilter", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper");
            SnsMethodCalculate.markStartTimeMs("isFilterValue", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper");
            SnsMethodCalculate.markStartTimeMs("isStrictDebugEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            boolean z3 = BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG;
            SnsMethodCalculate.markEndTimeMs("isStrictDebugEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            if (z3) {
                SnsMethodCalculate.markStartTimeMs("isDebugDelConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper");
                z2 = C79758p.f233760a.mo109883f(new C99414b()) == 1;
                SnsMethodCalculate.markEndTimeMs("isDebugDelConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper");
                Log.m105918d("ConsecutiveAdHelper", "debug Env, cfg=" + z2);
                SnsMethodCalculate.markEndTimeMs("isFilterValue", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper");
            } else {
                SnsMethodCalculate.markEndTimeMs("isFilterValue", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper");
                z2 = true;
            }
            Cursor rawQuery = this.f294108d.rawQuery(str8, (String[]) null);
            if (!z2) {
                SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                return rawQuery;
            }
            String str9 = str3;
            C100411k0 k0Var = this.f294108d;
            SnsMethodCalculate.markStartTimeMs("removeConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper");
            try {
                cursor = C99530e0.m129887a(rawQuery, k0Var, str8);
                SnsMethodCalculate.markEndTimeMs("removeConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper");
            } catch (Throwable th) {
                Throwable th4 = th;
                Log.m105920e("ConsecutiveAdHelper", "there is something wrong in removeConsecutiveAd: " + android.util.Log.getStackTraceString(th4));
                C37817q.m41545a("filter_ad_exp", "", 0, 0, "");
                SnsMethodCalculate.markStartTimeMs("queryAgain", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper");
                if (k0Var != null) {
                    cursor2 = k0Var.rawQuery(str8, (String[]) null);
                    SnsMethodCalculate.markEndTimeMs("queryAgain", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper");
                } else {
                    SnsMethodCalculate.markEndTimeMs("queryAgain", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper");
                }
                SnsMethodCalculate.markEndTimeMs("removeConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper");
                cursor = cursor2;
            }
            SnsMethodCalculate.markEndTimeMs(str9, "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return cursor;
        }
        Cursor rawQuery2 = this.f294108d.rawQuery(str8, (String[]) null);
        SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return rawQuery2;
    }

    /* renamed from: bO */
    public SnsInfo mo139816bO(String str) {
        Cursor cursor;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("getByServerStrId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        SnsInfo snsInfo = new SnsInfo();
        if (!this.f294109e) {
            C100411k0 k0Var = this.f294108d;
            cursor = k0Var.query(C102661q8.TABLE_NAME, (String[]) null, "stringSeq=?", new String[]{"" + str2}, (String) null, (String) null, (String) null, 2);
        } else {
            C100411k0 k0Var2 = this.f294108d;
            StringBuilder sb = new StringBuilder();
            sb.append(wt0("" + str2));
            sb.append("");
            cursor = k0Var2.query(C102661q8.TABLE_NAME, (String[]) null, "snsId=?", new String[]{sb.toString()}, (String) null, (String) null, (String) null, 2);
        }
        if (cursor.moveToFirst()) {
            snsInfo.convertFrom(cursor);
            cursor.close();
            SnsMethodCalculate.markEndTimeMs("getByServerStrId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return snsInfo;
        }
        cursor.close();
        SnsMethodCalculate.markEndTimeMs("getByServerStrId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return null;
    }

    public long c40(long j, int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("getTimeLineMaxSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        P50();
        SnsMethodCalculate.markStartTimeMs("getMaxSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long j2 = 0;
        String str = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ";
        if (j != 0) {
            str = str + " AND SnsInfo.stringSeq > '" + C102236a0.m134705B(C102236a0.m134765q0(j)) + "'";
        }
        if (z) {
            str = str + " AND  (snsId != 0 ) ";
        }
        String str2 = (str + f294096o) + " limit " + i;
        Log.m105919d("MicroMsg.SnsInfoStorage", "getMaxSeqByLimit %s \n minId=%s", str2, Long.valueOf(j));
        Cursor rawQuery = this.f294108d.rawQuery(str2, (String[]) null);
        if (rawQuery.moveToFirst()) {
            SnsInfo snsInfo = new SnsInfo();
            snsInfo.convertFrom(rawQuery);
            rawQuery.close();
            j2 = snsInfo.field_snsId;
            SnsMethodCalculate.markEndTimeMs("getMaxSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        } else {
            rawQuery.close();
            SnsMethodCalculate.markEndTimeMs("getMaxSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        }
        SnsMethodCalculate.markEndTimeMs("getTimeLineMaxSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return j2;
    }

    public final void cx0(String str) {
        SnsMethodCalculate.markStartTimeMs("updateFilterTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        String str2 = "UPDATE SnsInfo SET sourceType = sourceType & " + -3 + str;
        Log.m105918d("MicroMsg.SnsInfoStorage", "updateFilterTimeLine sql " + str2);
        this.f294108d.execSQL(C102661q8.TABLE_NAME, str2);
        SnsMethodCalculate.markEndTimeMs("updateFilterTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public boolean delete(long j) {
        SnsMethodCalculate.markStartTimeMs("delete", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        boolean z = true;
        Log.printInfoStack("MicroMsg.SnsInfoStorage", "delete snsId:%s", Long.valueOf(j));
        C100411k0 k0Var = this.f294108d;
        int delete = k0Var.delete(C102661q8.TABLE_NAME, "snsId=?", new String[]{"" + j});
        Log.m105918d("MicroMsg.SnsInfoStorage", "del msg " + j + " res " + delete);
        if (delete <= 0) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("delete", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z;
    }

    /* renamed from: fY */
    public Cursor mo139819fY(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getCursorByUserSearch", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        String str3 = "select *,rowid from SnsInfo  WHERE " + f294087A;
        if (zs0(str)) {
            str3 = str3 + " AND " + mo139832vP(str);
        }
        if (zs0(str2)) {
            str3 = str3 + " AND " + mo139827nP(str2);
        }
        String str4 = str3 + f294098q;
        Log.m105918d("MicroMsg.SnsInfoStorage", "getCursorByUserSeq " + str4);
        Cursor rawQuery = this.f294108d.rawQuery(str4, (String[]) null);
        SnsMethodCalculate.markEndTimeMs("getCursorByUserSearch", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return rawQuery;
    }

    public boolean fq0(long j) {
        SnsMethodCalculate.markStartTimeMs("isSnsIdExist", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        Cursor rawQuery = this.f294108d.rawQuery("select *,rowid from SnsInfo  where SnsInfo.snsId=" + j, (String[]) null);
        int count = rawQuery.getCount();
        rawQuery.close();
        boolean z = count > 0;
        SnsMethodCalculate.markEndTimeMs("isSnsIdExist", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z;
    }

    /* renamed from: gY */
    public Cursor mo139821gY(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("getCursorByWsFoldDetailSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        SnsMethodCalculate.markStartTimeMs("getFullWsFoldSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        SnsMethodCalculate.markEndTimeMs("getFullWsFoldSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        String str4 = "select *,rowid from SnsInfo  where  (sourceType & 128 != 0 ) ";
        if (!Util.isNullOrNil(str)) {
            str4 = str4 + " AND SnsInfo.userName=\"" + Util.escapeSqlValue(str) + FastJsonResponse.QUOTE;
        }
        if (str2 == null || !str2.equals("")) {
            str4 = str4 + " AND " + mo139832vP(str2);
        }
        if (zs0(str3)) {
            str4 = str4 + " AND " + mo139827nP(str3);
        }
        String str5 = str4 + " " + f294096o;
        Log.m105918d("MicroMsg.SnsInfoStorage", "getCursorByUserSeq " + str5);
        Cursor rawQuery = this.f294108d.rawQuery(str5, (String[]) null);
        SnsMethodCalculate.markEndTimeMs("getCursorByWsFoldDetailSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return rawQuery;
    }

    public long h30() {
        SnsMethodCalculate.markStartTimeMs("getSnsTableCount", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long currentTimeMillis = System.currentTimeMillis();
        Cursor rawQuery = this.f294108d.rawQuery("select count(*) from SnsInfo", (String[]) null, 2);
        int i = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
        rawQuery.close();
        Log.m105925i("MicroMsg.SnsInfoStorage", "sns table count %d passed %d", Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        long j = (long) i;
        SnsMethodCalculate.markEndTimeMs("getSnsTableCount", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return j;
    }

    /* renamed from: kD */
    public Boolean mo139823kD(String str) {
        SnsMethodCalculate.markStartTimeMs("deleteByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        Log.printInfoStack("MicroMsg.SnsInfoStorage", "deleteByUserName userName:%s", str);
        boolean execSQL = this.f294108d.execSQL(C102661q8.TABLE_NAME, "DELETE FROM SnsInfo" + " where SnsInfo.userName=\"" + Util.escapeSqlValue(str) + FastJsonResponse.QUOTE);
        Log.m105918d("MicroMsg.SnsInfoStorage", "del snsinfo " + str + " res " + execSQL);
        Boolean valueOf = Boolean.valueOf(execSQL);
        SnsMethodCalculate.markEndTimeMs("deleteByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return valueOf;
    }

    public final String ko0(boolean z, String str, boolean z2, boolean z3) {
        SnsMethodCalculate.markStartTimeMs("getUserSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        String str2 = "select *,rowid from SnsInfo ";
        if (z3) {
            str2 = "select count(*) from SnsInfo ";
        }
        String str3 = (str2 + mo139802Ow(str, z2)) + " AND type in ( 1,2 , 3 , 4 , 18 , 5 , 12 , 9 , 14 , 15 , 13 , 21 , 25 , 26,28,29,30 , 34,45,43,38,33,37,36,39,41,42,44,46,101)";
        SnsMethodCalculate.markEndTimeMs("getUserSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return str3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090 A[Catch:{ all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3 A[Catch:{ all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9 A[Catch:{ all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x004b A[SYNTHETIC] */
    /* renamed from: mI */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.Long> mo139825mI() {
        /*
            r14 = this;
            java.lang.String r0 = "getAllNeedResendSns"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            os2.k0 r3 = r14.f294108d
            java.lang.String r4 = "*"
            java.lang.String r5 = "rowid"
            java.lang.String[] r5 = new java.lang.String[]{r4, r5}
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "createTime >=? AND "
            r4.append(r6)
            java.lang.String r6 = f294106y
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            r12 = 1
            java.lang.String[] r7 = new java.lang.String[r12]
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r10
            int r4 = (int) r8
            r8 = 172800(0x2a300, float:2.42144E-40)
            int r4 = r4 - r8
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r13 = 0
            r7[r13] = r4
            java.lang.String r4 = "SnsInfo"
            r8 = 0
            r9 = 0
            java.lang.String r10 = "createTime ASC"
            r11 = 2
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x004b:
            boolean r4 = r3.moveToNext()     // Catch:{ all -> 0x00e5 }
            java.lang.String r5 = "MicroMsg.SnsInfoStorage"
            if (r4 == 0) goto L_0x00cd
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = new com.tencent.mm.plugin.sns.storage.SnsInfo     // Catch:{ all -> 0x00e5 }
            r4.<init>()     // Catch:{ all -> 0x00e5 }
            r4.convertFrom((android.database.Cursor) r3)     // Catch:{ all -> 0x00e5 }
            int r6 = r4.localid     // Catch:{ all -> 0x00e5 }
            r7 = -1
            if (r6 == r7) goto L_0x004b
            java.lang.String r6 = r4.getUserName()     // Catch:{ all -> 0x00e5 }
            java.lang.String r7 = eb0.C75592q0.m90789s()     // Catch:{ all -> 0x00e5 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x00e5 }
            if (r6 == 0) goto L_0x004b
            java.lang.String r6 = "checkSnsInfoIsFakeVideo"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)     // Catch:{ all -> 0x00e5 }
            r8 = 0
            com.tencent.mm.protocal.protobuf.TimeLineObject r9 = r4.getTimeLine()     // Catch:{ all -> 0x00e5 }
            if (r9 == 0) goto L_0x0082
            te3.j00 r9 = r9.ContentObj     // Catch:{ all -> 0x00e5 }
            if (r9 == 0) goto L_0x0082
            java.util.LinkedList<te3.kv2> r8 = r9.f298427h     // Catch:{ all -> 0x00e5 }
        L_0x0082:
            if (r8 == 0) goto L_0x008d
            boolean r9 = r8.isEmpty()     // Catch:{ all -> 0x00e5 }
            if (r9 == 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r9 = 0
            goto L_0x008e
        L_0x008d:
            r9 = 1
        L_0x008e:
            if (r9 != 0) goto L_0x00a3
            java.lang.Object r8 = r8.get(r13)     // Catch:{ all -> 0x00e5 }
            te3.kv2 r8 = (te3.C101804kv2) r8     // Catch:{ all -> 0x00e5 }
            int r8 = r8.f298690e     // Catch:{ all -> 0x00e5 }
            r9 = 8
            if (r8 != r9) goto L_0x009e
            r8 = 1
            goto L_0x009f
        L_0x009e:
            r8 = 0
        L_0x009f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)     // Catch:{ all -> 0x00e5 }
            goto L_0x00a7
        L_0x00a3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)     // Catch:{ all -> 0x00e5 }
            r8 = 0
        L_0x00a7:
            if (r8 != 0) goto L_0x004b
            int r6 = r4.localid     // Catch:{ all -> 0x00e5 }
            long r6 = (long) r6     // Catch:{ all -> 0x00e5 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x00e5 }
            r2.add(r6)     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r6.<init>()     // Catch:{ all -> 0x00e5 }
            java.lang.String r7 = "getAllNeedResendSns, add snsInfo: "
            r6.append(r7)     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = r4.getLocalid()     // Catch:{ all -> 0x00e5 }
            r6.append(r4)     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x00e5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r4)     // Catch:{ all -> 0x00e5 }
            goto L_0x004b
        L_0x00cd:
            r3.close()
            java.lang.Object[] r3 = new java.lang.Object[r12]
            int r4 = r2.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r13] = r4
            java.lang.String r4 = "getAllNeedResendSns, resendList.size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r4, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x00e5:
            r2 = move-exception
            r3.close()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: os2.C100400e0.mo139825mI():java.util.ArrayList");
    }

    /* renamed from: mL */
    public SnsInfo mo139826mL(long j) {
        SnsMethodCalculate.markStartTimeMs("getAnyOneBeforeTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - j;
        Cursor rawQuery = this.f294108d.rawQuery("select *,rowid from SnsInfo  WHERE createTime < " + currentTimeMillis + " LIMIT 1", (String[]) null, 2);
        SnsInfo snsInfo = new SnsInfo();
        if (rawQuery.moveToFirst()) {
            snsInfo.convertFrom(rawQuery);
            rawQuery.close();
            SnsMethodCalculate.markEndTimeMs("getAnyOneBeforeTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return snsInfo;
        }
        rawQuery.close();
        SnsMethodCalculate.markEndTimeMs("getAnyOneBeforeTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return null;
    }

    /* renamed from: nP */
    public final String mo139827nP(String str) {
        SnsMethodCalculate.markStartTimeMs("getCDAboveIncludeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str == null || str.equals("")) {
            SnsMethodCalculate.markEndTimeMs("getCDAboveIncludeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return " ";
        } else if (this.f294109e) {
            String str2 = " (snsId >= " + wt0(Util.escapeSqlValue(str)) + " ) ";
            SnsMethodCalculate.markEndTimeMs("getCDAboveIncludeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return str2;
        } else {
            String str3 = " (stringSeq >=\"" + Util.escapeSqlValue(str) + "\"  ) ";
            SnsMethodCalculate.markEndTimeMs("getCDAboveIncludeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return str3;
        }
    }

    public boolean ov0(String str, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (C100417r0.m131418g(str)) {
            boolean yu02 = yu0(C100417r0.m131425n(str), snsInfo);
            SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return yu02;
        }
        boolean bD = C94866e1.zx0().mo139863bD(C100417r0.m131425n(str), snsInfo.getAdSnsInfo());
        SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return bD;
    }

    /* renamed from: qq */
    public void mo139829qq(long j, long j2, CancellationSignal cancellationSignal) {
        long longForQuery;
        SnsMethodCalculate.markStartTimeMs("cleanDbExpire", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        String str = "DELETE FROM SnsInfo WHERE rowid IN (SELECT rowid FROM SnsInfo WHERE createTime < " + j + " LIMIT " + j2 + ")";
        int i = 0;
        do {
            i++;
            this.f294108d.mo125615f().beginTransaction();
            try {
                this.f294108d.mo125615f().execSQL(str, (Object[]) null, cancellationSignal);
                longForQuery = DatabaseUtils.longForQuery(this.f294108d.mo125615f(), "SELECT changes()", (String[]) null);
                Log.m105925i("MicroMsg.SnsInfoStorage", "cleanSnsTablesByTimeLimit cleanDbExpire, %s, count:%s, limitCount:%s", Integer.valueOf(i), Long.valueOf(longForQuery), Long.valueOf(j2));
                this.f294108d.mo125615f().setTransactionSuccessful();
                try {
                    this.f294108d.mo125615f().endTransaction();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                try {
                    this.f294108d.mo125615f().endTransaction();
                } catch (Exception unused2) {
                }
                SnsMethodCalculate.markEndTimeMs("cleanDbExpire", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                throw th;
            }
        } while (longForQuery > 0);
        boolean execSQL = this.f294108d.execSQL(C102661q8.TABLE_NAME, "VACUUM");
        Log.m105918d("MicroMsg.SnsInfoStorage", "cleanSnsTablesByTimeLimit cleanDbExpire:" + str);
        Log.m105924i("MicroMsg.SnsInfoStorage", "cleanSnsTablesByTimeLimit cleanDbExpire vacuumResult:" + execSQL);
        SnsMethodCalculate.markEndTimeMs("cleanDbExpire", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public long r50(long j, int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("getTimeLineMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        P50();
        long b002 = b00("select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ", j, i, z);
        SnsMethodCalculate.markEndTimeMs("getTimeLineMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return b002;
    }

    public /* bridge */ /* synthetic */ boolean replace(IAutoDBItem iAutoDBItem) {
        SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        boolean Pq0 = Pq0((SnsInfo) iAutoDBItem);
        SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return Pq0;
    }

    /* renamed from: uP */
    public final String mo139831uP(String str) {
        SnsMethodCalculate.markStartTimeMs("getCDBelowExculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str == null || str.equals("")) {
            SnsMethodCalculate.markEndTimeMs("getCDBelowExculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return " ";
        } else if (this.f294109e) {
            String str2 = " (snsId < " + wt0(Util.escapeSqlValue(str)) + " ) ";
            SnsMethodCalculate.markEndTimeMs("getCDBelowExculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return str2;
        } else {
            String str3 = " (stringSeq <\"" + Util.escapeSqlValue(str) + "\"  ) ";
            SnsMethodCalculate.markEndTimeMs("getCDBelowExculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return str3;
        }
    }

    public /* bridge */ /* synthetic */ boolean update(long j, IAutoDBItem iAutoDBItem) {
        SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        boolean yu02 = yu0(j, (SnsInfo) iAutoDBItem);
        SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return yu02;
    }

    /* renamed from: vP */
    public final String mo139832vP(String str) {
        SnsMethodCalculate.markStartTimeMs("getCDBelowInculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str == null || str.equals("")) {
            SnsMethodCalculate.markEndTimeMs("getCDBelowInculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return " ";
        } else if (this.f294109e) {
            String str2 = " (snsId <= " + wt0(Util.escapeSqlValue(str)) + " ) ";
            SnsMethodCalculate.markEndTimeMs("getCDBelowInculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return str2;
        } else {
            String str3 = " (stringSeq <=\"" + Util.escapeSqlValue(str) + "\"  ) ";
            SnsMethodCalculate.markEndTimeMs("getCDBelowInculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return str3;
        }
    }

    public void vx0(String str) {
        SnsMethodCalculate.markStartTimeMs("updateFilterTimeLineAbove", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (!zs0(str)) {
            SnsMethodCalculate.markEndTimeMs("updateFilterTimeLineAbove", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" where ");
        sb.append(mo139808TO(str));
        sb.append(" and ");
        m131327CP();
        sb.append(" (sourceType & 2 != 0 ) ");
        sb.append(" and ");
        sb.append(" (snsId != 0  ) ");
        cx0(sb.toString());
        SnsMethodCalculate.markEndTimeMs("updateFilterTimeLineAbove", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public long wt0(String str) {
        SnsMethodCalculate.markStartTimeMs("seqToSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long longValue = new BigInteger(str).longValue();
        Log.m105925i("MicroMsg.SnsInfoStorage", "seq %s to snsId %d ", str, Long.valueOf(longValue));
        SnsMethodCalculate.markEndTimeMs("seqToSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return longValue;
    }

    public void wx0() {
        SnsMethodCalculate.markStartTimeMs("updateFilterTimeLineAll", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        m131327CP();
        cx0(" where  (sourceType & 2 != 0 )  AND  (snsId != 0  ) ");
        SnsMethodCalculate.markEndTimeMs("updateFilterTimeLineAll", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public boolean xs0(long j, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("replaceUserBySnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (fq0(j)) {
            boolean yu02 = yu0(j, snsInfo);
            SnsMethodCalculate.markEndTimeMs("replaceUserBySnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return yu02;
        }
        boolean z = Jt0(snsInfo) != -1;
        SnsMethodCalculate.markEndTimeMs("replaceUserBySnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z;
    }

    public void xx0(String str) {
        SnsMethodCalculate.markStartTimeMs("updateFilterTimeLineBelow", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (!zs0(str)) {
            SnsMethodCalculate.markEndTimeMs("updateFilterTimeLineBelow", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" where ");
        sb.append(mo139831uP(str));
        sb.append(" and ");
        m131327CP();
        sb.append(" (sourceType & 2 != 0 ) ");
        sb.append(" and ");
        sb.append(" (snsId != 0  ) ");
        cx0(sb.toString());
        SnsMethodCalculate.markEndTimeMs("updateFilterTimeLineBelow", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public boolean yu0(long j, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        ContentValues convertTo = snsInfo.convertTo();
        convertTo.remove("rowid");
        C100411k0 k0Var = this.f294108d;
        boolean z = true;
        if (k0Var.update(C102661q8.TABLE_NAME, convertTo, "snsId=?", new String[]{"" + j}) <= 0) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z;
    }

    public final void yx0(String str, boolean z, String str2) {
        SnsMethodCalculate.markStartTimeMs("updateFilterUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        int i = z ? 4 : 8;
        String str3 = "UPDATE SnsInfo SET sourceType = sourceType & " + (~i) + str2;
        Log.m105918d("MicroMsg.SnsInfoStorage", "updateFilterUserName sql " + str3);
        this.f294108d.execSQL(C102661q8.TABLE_NAME, str3);
        SnsMethodCalculate.markEndTimeMs("updateFilterUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public final boolean zs0(String str) {
        SnsMethodCalculate.markStartTimeMs("seqAvailable", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str == null || str.equals("")) {
            SnsMethodCalculate.markEndTimeMs("seqAvailable", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("seqAvailable", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return true;
    }

    public void zx0(String str, boolean z, String str2) {
        SnsMethodCalculate.markStartTimeMs("updateFilterUserNameAbove", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        String str3 = mo139802Ow(str, z) + " AND " + " (snsId != 0  ) ";
        if (zs0(str2)) {
            str3 = str3 + " AND " + mo139808TO(str2);
        }
        yx0(str, z, str3);
        SnsMethodCalculate.markEndTimeMs("updateFilterUserNameAbove", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }
}
