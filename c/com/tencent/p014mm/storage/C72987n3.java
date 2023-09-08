package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import g62.C75873h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.storage.n3 */
public class C72987n3 extends MAutoStorage<C72985m3> implements C75873h {

    /* renamed from: e */
    public static final String[] f212814e = {MAutoStorage.getCreateSQLs(C72985m3.f212810B, "fmessage_msginfo")};

    /* renamed from: f */
    public static final String[] f212815f = {"CREATE INDEX IF NOT EXISTS  fmessageTalkerIndex ON fmessage_msginfo ( talker )"};

    /* renamed from: d */
    public ISQLiteDatabase f212816d;

    public C72987n3(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C72985m3.f212810B, "fmessage_msginfo", f212815f);
        this.f212816d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public List<C72985m3> mo101186Lo(int i) {
        Log.m105918d("MicroMsg.FMessageMsgInfoStorage", "getFMsgByType, type = " + i);
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.f212816d.rawQuery("select *, rowid from fmessage_msginfo where type = " + i, (String[]) null, 2);
        while (rawQuery.moveToNext()) {
            C72985m3 m3Var = new C72985m3();
            m3Var.convertFrom(rawQuery);
            arrayList.add(m3Var);
        }
        rawQuery.close();
        Log.m105918d("MicroMsg.FMessageMsgInfoStorage", "getFMsgByType, size = " + arrayList.size());
        return arrayList;
    }

    /* renamed from: Ow */
    public C72985m3 mo101187Ow(String str) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.FMessageMsgInfoStorage", "getLastFMsg fail, talker is null");
            return null;
        }
        Cursor rawQuery = this.f212816d.rawQuery("select * from fmessage_msginfo where talker = '" + Util.escapeSqlValue(str) + "' order by createTime DESC limit 1", (String[]) null, 2);
        C72985m3 m3Var = new C72985m3();
        if (rawQuery.moveToFirst()) {
            m3Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return m3Var;
    }

    /* renamed from: SE */
    public boolean insert(C72985m3 m3Var) {
        if (m3Var == null) {
            Log.m105920e("MicroMsg.FMessageMsgInfoStorage", "insert fail, fmsgInfo is null");
            return false;
        } else if (!super.insert(m3Var)) {
            return false;
        } else {
            doNotify(m3Var.systemRowid + "");
            return true;
        }
    }

    /* renamed from: Yt */
    public C72985m3[] mo101189Yt(String str, String str2, int i) {
        String str3;
        if (!Util.isNullOrNil(str2)) {
            str3 = "select *, rowid from fmessage_msginfo  where talker = '" + Util.escapeSqlValue(str) + "' or talker = '" + Util.escapeSqlValue(str2) + "'  order by createTime DESC limit " + i;
        } else {
            str3 = "select *, rowid from fmessage_msginfo  where talker = '" + Util.escapeSqlValue(str) + "' order by createTime DESC limit " + i;
        }
        Log.m105918d("MicroMsg.FMessageMsgInfoStorage", "getLastFMessageMsgInfo, sql = " + str3);
        Cursor rawQuery = this.f212816d.rawQuery(str3, (String[]) null, 2);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            C72985m3 m3Var = new C72985m3();
            m3Var.convertFrom(rawQuery);
            arrayList.add(m3Var);
        }
        rawQuery.close();
        return (C72985m3[]) arrayList.toArray(new C72985m3[arrayList.size()]);
    }

    /* renamed from: bD */
    public C72985m3 mo101190bD(String str) {
        C72985m3[] kD = mo101192kD(str, 1);
        if (kD == null || kD.length <= 0) {
            return null;
        }
        return kD[0];
    }

    /* renamed from: jo */
    public boolean mo101191jo(String str) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.FMessageMsgInfoStorage", "deleteByTalker fail, talker is null");
            return false;
        }
        return this.f212816d.execSQL("fmessage_msginfo", "delete from fmessage_msginfo where talker = '" + Util.escapeSqlValue(str) + "'");
    }

    /* renamed from: kD */
    public C72985m3[] mo101192kD(String str, int i) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.FMessageMsgInfoStorage", "getLastRecvFMsg fail, talker is null");
            return null;
        }
        Cursor rawQuery = this.f212816d.rawQuery("select * from fmessage_msginfo where isSend != 1 and talker = '" + Util.escapeSqlValue(str) + "' order by createTime DESC limit " + i, (String[]) null, 2);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            C72985m3 m3Var = new C72985m3();
            m3Var.convertFrom(rawQuery);
            arrayList.add(m3Var);
        }
        rawQuery.close();
        return (C72985m3[]) arrayList.toArray(new C72985m3[arrayList.size()]);
    }

    /* renamed from: qq */
    public C72985m3[] mo101193qq(String str, int i) {
        Log.m105918d("MicroMsg.FMessageMsgInfoStorage", "getLastFMessageMsgInfo");
        Cursor rawQuery = this.f212816d.rawQuery("select *, rowid from fmessage_msginfo  where talker = '" + Util.escapeSqlValue(str) + "' order by createTime DESC limit " + i, (String[]) null, 2);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            C72985m3 m3Var = new C72985m3();
            m3Var.convertFrom(rawQuery);
            arrayList.add(m3Var);
        }
        rawQuery.close();
        return (C72985m3[]) arrayList.toArray(new C72985m3[arrayList.size()]);
    }
}
