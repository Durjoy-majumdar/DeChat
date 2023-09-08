package hg0;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import zh3.C91753f;

/* renamed from: hg0.b */
public class C76168b extends MStorageEx {

    /* renamed from: d */
    public static final String[] f223156d = {"CREATE TABLE IF NOT EXISTS addr_upload2 ( id int  PRIMARY KEY , md5 text  , peopleid text  , uploadtime long  , realname text  , realnamepyinitial text  , realnamequanpin text  , username text  , nickname text  , nicknamepyinitial text  , nicknamequanpin text  , type int  , moblie text  , email text  , status int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int , lvbuf BLOG , showhead int  ) ", "CREATE INDEX IF NOT EXISTS upload_time_index ON addr_upload2 ( uploadtime ) ", "CREATE INDEX IF NOT EXISTS addr_upload_user_index ON addr_upload2 ( username ) "};

    /* renamed from: c */
    public final C91753f f223157c;

    public C76168b(C91753f fVar) {
        this.f223157c = fVar;
        Cursor rawQuery = fVar.rawQuery("PRAGMA table_info( addr_upload2 )", (String[]) null, 2);
        int columnIndex = rawQuery.getColumnIndex("name");
        boolean z = false;
        boolean z2 = false;
        while (rawQuery.moveToNext()) {
            if (columnIndex >= 0) {
                String string = rawQuery.getString(columnIndex);
                if ("lvbuf".equalsIgnoreCase(string)) {
                    z = true;
                } else if ("showhead".equalsIgnoreCase(string)) {
                    z2 = true;
                }
            }
        }
        rawQuery.close();
        if (!z) {
            fVar.execSQL("addr_upload2", "Alter table addr_upload2 add lvbuf BLOB ");
        }
        if (!z2) {
            fVar.execSQL("addr_upload2", "Alter table addr_upload2 add showhead int ");
        }
    }

    /* renamed from: a */
    public C76166a mo106401a(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C76166a aVar = new C76166a();
        Cursor rawQuery = this.f223157c.rawQuery("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2 where addr_upload2.username=\"" + Util.escapeSqlValue(str) + FastJsonResponse.QUOTE, (String[]) null, 2);
        StringBuilder sb = new StringBuilder();
        sb.append("get addrUpload :");
        sb.append(str);
        Log.m105918d("MicroMsg.AddrUploadStorage", sb.toString());
        if (rawQuery.moveToFirst()) {
            aVar.mo106383b(rawQuery);
        }
        rawQuery.close();
        return aVar;
    }

    /* renamed from: b */
    public C76166a mo106402b(String str) {
        C76166a aVar = null;
        if (str != null && str.length() > 0) {
            Cursor rawQuery = this.f223157c.rawQuery("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2 where addr_upload2.id=" + C76166a.m91467d(str) + "", (String[]) null, 2);
            if (rawQuery.moveToFirst()) {
                aVar = new C76166a();
                aVar.mo106383b(rawQuery);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("get addrUpload :");
            sb.append(str);
            sb.append(", resCnt:");
            sb.append(aVar != null ? 1 : 0);
            Log.m105918d("MicroMsg.AddrUploadStorage", sb.toString());
            rawQuery.close();
        }
        return aVar;
    }

    /* renamed from: d */
    public int mo106403d(String str, C76166a aVar) {
        ContentValues c = aVar.mo106384c();
        int i = 0;
        if (c.size() > 0) {
            C91753f fVar = this.f223157c;
            i = fVar.update("addr_upload2", c, "id=?", new String[]{"" + C76166a.m91467d(str)});
        }
        if (i > 0) {
            if (!aVar.mo106385e().equals(str)) {
                doNotify(5, this, str);
                doNotify(2, this, aVar.mo106385e());
            } else {
                doNotify(3, this, str);
            }
        }
        return i;
    }

    public boolean shouldProcessEvent() {
        C91753f fVar = this.f223157c;
        if (fVar != null && !fVar.isClose()) {
            return true;
        }
        Object[] objArr = new Object[1];
        C91753f fVar2 = this.f223157c;
        objArr[0] = fVar2 == null ? "null" : Boolean.valueOf(fVar2.isClose());
        Log.m105929w("MicroMsg.AddrUploadStorage", "shouldProcessEvent db is close :%s", objArr);
        return false;
    }
}
