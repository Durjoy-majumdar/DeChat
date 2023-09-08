package hg0;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import zh3.C91753f;

/* renamed from: hg0.b1 */
public class C76169b1 extends MStorageEx {

    /* renamed from: d */
    public static final String[] f223158d = {"CREATE TABLE IF NOT EXISTS qqlist ( qq long  PRIMARY KEY , wexinstatus int  , groupid int  , username text  , nickname text  , pyinitial text  , quanpin text  , qqnickname text  , qqpyinitial text  , qqquanpin text  , qqremark text  , qqremarkpyinitial text  , qqremarkquanpin text  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) ", "CREATE INDEX IF NOT EXISTS groupid_index ON qqlist ( groupid ) ", "CREATE INDEX IF NOT EXISTS qq_index ON qqlist ( qq ) "};

    /* renamed from: c */
    public final C91753f f223159c;

    public C76169b1(C91753f fVar) {
        this.f223159c = fVar;
    }

    /* renamed from: a */
    public C76167a1 mo106404a(long j) {
        C76167a1 a1Var = null;
        Cursor rawQuery = this.f223159c.rawQuery("select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.qq = \"" + j + FastJsonResponse.QUOTE, (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            a1Var = new C76167a1();
            a1Var.mo106397a(rawQuery);
        }
        rawQuery.close();
        return a1Var;
    }

    /* renamed from: b */
    public C76167a1 mo106405b(String str) {
        C76167a1 a1Var = null;
        Cursor rawQuery = this.f223159c.rawQuery("select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.username = \"" + str + FastJsonResponse.QUOTE, (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            a1Var = new C76167a1();
            a1Var.mo106397a(rawQuery);
        }
        rawQuery.close();
        return a1Var;
    }

    /* renamed from: d */
    public int mo106406d(long j, C76167a1 a1Var) {
        ContentValues b = a1Var.mo106398b();
        int i = 0;
        if (b.size() > 0) {
            C91753f fVar = this.f223159c;
            i = fVar.update("qqlist", b, "qq=?", new String[]{"" + j});
        }
        if (i > 0) {
            doNotify(3, this, "" + j);
        }
        return i;
    }

    public boolean shouldProcessEvent() {
        C91753f fVar = this.f223159c;
        if (fVar != null && !fVar.isClose()) {
            return true;
        }
        Object[] objArr = new Object[1];
        C91753f fVar2 = this.f223159c;
        objArr[0] = fVar2 == null ? "null" : Boolean.valueOf(fVar2.isClose());
        Log.m105929w("MicroMsg.QQListStorage", "shouldProcessEvent db is close :%s", objArr);
        return false;
    }
}
