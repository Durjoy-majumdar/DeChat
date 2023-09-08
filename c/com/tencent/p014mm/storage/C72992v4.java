package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import g62.C75881q;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.storage.v4 */
public class C72992v4 extends MAutoStorage<C72991u4> implements C75881q {

    /* renamed from: e */
    public static final String[] f212828e = {MAutoStorage.getCreateSQLs(C72991u4.f212827H, "shakeverifymessage")};

    /* renamed from: f */
    public static final String[] f212829f = {"CREATE INDEX IF NOT EXISTS  shakeverifymessage_unread_index ON shakeverifymessage ( status )", "CREATE INDEX IF NOT EXISTS shakeverifymessage_statusIndex ON shakeverifymessage ( status )", "CREATE INDEX IF NOT EXISTS shakeverifymessage_createtimeIndex ON shakeverifymessage ( createtime )"};

    /* renamed from: d */
    public ISQLiteDatabase f212830d;

    public C72992v4(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C72991u4.f212827H, "shakeverifymessage", f212829f);
        this.f212830d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public C72991u4 mo101221Lo() {
        ISQLiteDatabase iSQLiteDatabase = this.f212830d;
        Cursor rawQuery = iSQLiteDatabase.rawQuery("SELECT * FROM " + getTableName() + " ORDER BY createtime DESC LIMIT 1", (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return null;
        }
        C72991u4 u4Var = new C72991u4();
        u4Var.convertFrom(rawQuery);
        rawQuery.close();
        return u4Var;
    }

    /* renamed from: Ow */
    public int mo101222Ow() {
        ISQLiteDatabase iSQLiteDatabase = this.f212830d;
        Cursor rawQuery = iSQLiteDatabase.rawQuery("select count(*) from " + getTableName() + " where status != " + 4, (String[]) null, 2);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return 0;
        }
        int i = rawQuery.getInt(0);
        rawQuery.close();
        if (i > 0) {
            return i;
        }
        return 0;
    }

    /* renamed from: Yt */
    public C72991u4[] mo101223Yt(String str, int i) {
        Log.m105918d("MicroMsg.ShakeVerifyMessageStorage", "getLastShakeVerifyMessage");
        Cursor rawQuery = this.f212830d.rawQuery("select *, rowid from ShakeVerifyMessage  where sayhiuser = '" + Util.escapeSqlValue(str) + "' order by createtime DESC limit " + i, (String[]) null, 2);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            C72991u4 u4Var = new C72991u4();
            u4Var.convertFrom(rawQuery);
            arrayList.add(u4Var);
        }
        rawQuery.close();
        if (arrayList.size() == 0) {
            return null;
        }
        return (C72991u4[]) arrayList.toArray(new C72991u4[arrayList.size()]);
    }

    /* renamed from: bD */
    public boolean insert(C72991u4 u4Var) {
        if (u4Var == null) {
            Log.m105920e("MicroMsg.ShakeVerifyMessageStorage", "insert fail, shakeMsg is null");
            return false;
        } else if (!super.insert(u4Var)) {
            return false;
        } else {
            doNotify(u4Var.systemRowid + "");
            return true;
        }
    }

    public int getCount() {
        ISQLiteDatabase iSQLiteDatabase = this.f212830d;
        Cursor rawQuery = iSQLiteDatabase.rawQuery("select count(*) from " + getTableName(), (String[]) null, 2);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return 0;
        }
        int i = rawQuery.getInt(0);
        rawQuery.close();
        if (i > 0) {
            return i;
        }
        return 0;
    }

    /* renamed from: jo */
    public void mo101225jo(String str) {
        int delete = this.f212830d.delete(getTableName(), "svrid = '" + str + "'", (String[]) null);
        if (delete > 0) {
            doNotify();
        }
        Log.m105924i("MicroMsg.ShakeVerifyMessageStorage", "delBySvrId = " + delete);
    }

    /* renamed from: qq */
    public C72991u4[] mo101226qq(String str, int i) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.ShakeVerifyMessageStorage", "getLastRecvShakeMsg fail, talker is null");
            return null;
        }
        Cursor rawQuery = this.f212830d.rawQuery("select * from ShakeVerifyMessage where isSend = 0 and sayhiuser = '" + Util.escapeSqlValue(str) + "' order by createTime DESC limit " + i, (String[]) null, 2);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            C72991u4 u4Var = new C72991u4();
            u4Var.convertFrom(rawQuery);
            arrayList.add(u4Var);
        }
        rawQuery.close();
        if (arrayList.size() == 0) {
            return null;
        }
        return (C72991u4[]) arrayList.toArray(new C72991u4[arrayList.size()]);
    }
}
