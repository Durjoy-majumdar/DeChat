package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import g62.C75874j;
import java.util.ArrayList;
import p749xh.C78823q5;

/* renamed from: com.tencent.mm.storage.c4 */
public class C72957c4 extends MAutoStorage<C72956b4> implements C75874j {

    /* renamed from: e */
    public static final String[] f212644e = {MAutoStorage.getCreateSQLs(C72956b4.f212643N, "LBSVerifyMessage")};

    /* renamed from: d */
    public ISQLiteDatabase f212645d;

    public C72957c4(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C72956b4.f212643N, "LBSVerifyMessage", C78823q5.f231314v);
        this.f212645d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public void mo100931Lo(String str) {
        int delete = this.f212645d.delete(getTableName(), "sayhiuser = '" + str + "' or sayhiencryptuser='" + str + "'", (String[]) null);
        if (delete > 0) {
            doNotify();
        }
        Log.m105924i("MicroMsg.LBSVerifyMessageStorage", "delByUserName = " + delete);
    }

    /* renamed from: Ow */
    public C72956b4[] mo100932Ow(String str, int i) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.LBSVerifyMessageStorage", "getLastRecvLbsMsg fail, talker is null");
            return null;
        }
        Cursor rawQuery = this.f212645d.rawQuery("select * from LBSVerifyMessage where isSend = 0 and (sayhiuser = '" + Util.escapeSqlValue(str) + "' or sayhiencryptuser = '" + Util.escapeSqlValue(str) + "') order by createTime DESC limit " + i, (String[]) null, 2);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            C72956b4 b4Var = new C72956b4();
            b4Var.convertFrom(rawQuery);
            arrayList.add(b4Var);
        }
        rawQuery.close();
        return (C72956b4[]) arrayList.toArray(new C72956b4[arrayList.size()]);
    }

    /* renamed from: SE */
    public boolean insert(C72956b4 b4Var) {
        if (b4Var == null) {
            Log.m105920e("MicroMsg.LBSVerifyMessageStorage", "insert fail, lbsMsg is null");
            return false;
        } else if (!super.insert(b4Var)) {
            return false;
        } else {
            doNotify(b4Var.systemRowid + "");
            return true;
        }
    }

    /* renamed from: Yt */
    public C72956b4[] mo100934Yt(String str, int i) {
        Log.m105918d("MicroMsg.LBSVerifyMessageStorage", "getLastLBSVerifyMessage");
        Cursor rawQuery = this.f212645d.rawQuery("select *, rowid from LBSVerifyMessage  where sayhiuser = '" + Util.escapeSqlValue(str) + "' or sayhiencryptuser = '" + Util.escapeSqlValue(str) + "' order by createtime DESC limit " + i, (String[]) null, 2);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            C72956b4 b4Var = new C72956b4();
            b4Var.convertFrom(rawQuery);
            arrayList.add(b4Var);
        }
        rawQuery.close();
        return (C72956b4[]) arrayList.toArray(new C72956b4[arrayList.size()]);
    }

    /* renamed from: bD */
    public C72956b4 mo100935bD() {
        ISQLiteDatabase iSQLiteDatabase = this.f212645d;
        Cursor rawQuery = iSQLiteDatabase.rawQuery("SELECT * FROM " + getTableName() + " where status != " + 4 + " ORDER BY createtime DESC LIMIT 1", (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return null;
        }
        C72956b4 b4Var = new C72956b4();
        b4Var.convertFrom(rawQuery);
        rawQuery.close();
        return b4Var;
    }

    public int getCount() {
        ISQLiteDatabase iSQLiteDatabase = this.f212645d;
        Cursor rawQuery = iSQLiteDatabase.rawQuery("select count(*) from " + getTableName(), (String[]) null, 2);
        int i = 0;
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }

    /* renamed from: jo */
    public void mo100936jo(String str) {
        int delete = this.f212645d.delete(getTableName(), "svrid = '" + str + "'", (String[]) null);
        if (delete > 0) {
            doNotify();
        }
        Log.m105924i("MicroMsg.LBSVerifyMessageStorage", "delBySvrId = " + delete);
    }

    /* renamed from: kD */
    public int mo100937kD() {
        ISQLiteDatabase iSQLiteDatabase = this.f212645d;
        Cursor rawQuery = iSQLiteDatabase.rawQuery("select count(*) from " + getTableName() + " where status != " + 4, (String[]) null, 2);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return 0;
        }
        int i = rawQuery.getInt(0);
        rawQuery.close();
        return i;
    }

    /* renamed from: qq */
    public C72956b4 mo100938qq(String str, int i) {
        Log.m105918d("MicroMsg.LBSVerifyMessageStorage", "getLBSVerifyMessage");
        C72956b4 b4Var = null;
        Cursor rawQuery = this.f212645d.rawQuery("select *, rowid from LBSVerifyMessage  where (sayhiuser = '" + Util.escapeSqlValue(str) + "' or sayhiencryptuser = '" + Util.escapeSqlValue(str) + "') and flag=" + i + " order by createtime DESC limit 1", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            b4Var = new C72956b4();
            b4Var.convertFrom(rawQuery);
        } else {
            Log.m105924i("MicroMsg.LBSVerifyMessageStorage", "getLBSVerifyMessage, cursor count = 0");
        }
        rawQuery.close();
        return b4Var;
    }
}
