package xz1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import di3.C86312j;
import eb0.C31543z5;
import java.util.ArrayList;
import java.util.List;
import p823sg.C101611g;
import sz1.C77815b;
import wz1.C78746a;
import wz1.C78747b;

/* renamed from: xz1.c */
public class C79015c extends MAutoStorage<C79013a> {

    /* renamed from: e */
    public static final Long f232016e = 86400L;

    /* renamed from: f */
    public static final Long f232017f = 3600L;

    /* renamed from: g */
    public static final String[] f232018g = {MAutoStorage.getCreateSQLs(C79013a.f232000R, "GroupSolitatire")};

    /* renamed from: h */
    public static final String[] f232019h = {"DROP INDEX IF EXISTS usernameIndex", "CREATE INDEX IF NOT EXISTS GroupSolitatire_usernameIndex ON GroupSolitatire ( username )", "CREATE INDEX IF NOT EXISTS usernameKeyIndex ON GroupSolitatire ( username,key )", "CREATE INDEX IF NOT EXISTS usernameKeyActiveIndex ON GroupSolitatire ( username,key,active )"};

    /* renamed from: d */
    public ISQLiteDatabase f232020d;

    public C79015c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C79013a.f232000R, "GroupSolitatire", f232019h);
        this.f232020d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public List<C79013a> mo108979Lo(String str, int i, long j) {
        ArrayList arrayList = new ArrayList();
        if (Util.isNullOrNil(str)) {
            return arrayList;
        }
        ISQLiteDatabase iSQLiteDatabase = this.f232020d;
        String[] strArr = C79013a.f232000R.columns;
        Cursor query = iSQLiteDatabase.query("GroupSolitatire", strArr, "username=? and active=? and lastActiveTime<?", new String[]{str, i + "", j + ""}, (String) null, (String) null, (String) null);
        if (query == null) {
            return arrayList;
        }
        while (query.moveToNext()) {
            C79013a aVar = new C79013a();
            aVar.convertFrom(query);
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* renamed from: Ow */
    public C79013a mo108980Ow(String str, String str2, boolean z) {
        Class cls = C77815b.class;
        C79013a Yt = mo108981Yt(str, str2);
        if (!z) {
            return Yt;
        }
        C78746a c = ((C77815b) C86312j.m106911c(cls)).vx0().mo108666c(str);
        if (!(Yt == null || c == null)) {
            int i = Yt.field_active;
            if (i == 1) {
                if (Yt.field_lastActiveTime < c.f230453b) {
                    if (c.f230452a) {
                        ((C77815b) C86312j.m106911c(cls)).wx0().mo108685f(Yt, 2);
                    } else {
                        ((C77815b) C86312j.m106911c(cls)).wx0().mo108685f(Yt, 1);
                    }
                    if (delete(Yt.systemRowid)) {
                        return null;
                    }
                }
            } else if (i == 0 && Yt.field_lastActiveTime < c.f230455d) {
                if (c.f230454c) {
                    ((C77815b) C86312j.m106911c(cls)).wx0().mo108685f(Yt, 2);
                } else {
                    ((C77815b) C86312j.m106911c(cls)).wx0().mo108685f(Yt, 1);
                }
                if (delete(Yt.systemRowid)) {
                    return null;
                }
            }
        }
        return Yt;
    }

    /* renamed from: Yt */
    public C79013a mo108981Yt(String str, String str2) {
        Cursor query;
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2) || (query = this.f232020d.query("GroupSolitatire", C79013a.f232000R.columns, "username=? and key=?", new String[]{str, str2}, (String) null, (String) null, "lastActiveTime DESC")) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            C79013a aVar = new C79013a();
            aVar.convertFrom(query);
            C78747b.m95114n(aVar);
            arrayList.add(aVar);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        C79013a aVar2 = (C79013a) arrayList.get(0);
        C78746a c = ((C77815b) C86312j.m106911c(C77815b.class)).vx0().mo108666c(str);
        if (c != null) {
            int i = aVar2.field_active;
            if (i == 0 && aVar2.field_lastActiveTime >= c.f230455d) {
                return aVar2;
            }
            if (i != 1 || aVar2.field_lastActiveTime < c.f230453b) {
                return null;
            }
            return aVar2;
        }
        return null;
    }

    /* renamed from: bD */
    public boolean insert(C79013a aVar) {
        if (aVar == null) {
            return false;
        }
        C101611g<Integer, C79013a> gVar = C78747b.f230457a;
        if (aVar.f232005L == 1 && C78747b.m95094F(aVar.f232001H)) {
            return false;
        }
        aVar.field_content = C78747b.m95102b(aVar);
        if (aVar.f232007N.size() > 1) {
            aVar.field_active = 1;
        } else if (aVar.field_active == -1) {
            aVar.field_active = 0;
        }
        return super.insert(aVar);
    }

    /* renamed from: jo */
    public boolean mo108983jo(String str, int i, long j) {
        int i2;
        try {
            ISQLiteDatabase iSQLiteDatabase = this.f232020d;
            i2 = iSQLiteDatabase.delete("GroupSolitatire", "username=? and lastActiveTime<? and active=?", new String[]{str, j + "", i + ""});
        } catch (Exception e) {
            Log.m105921e("MicroMsg.groupsolitaire.GroupSolitatireStorage", "deleteExpireData username:%s lastTime:%s Exception:%s", str, Long.valueOf(j), e.getMessage());
            i2 = 0;
        }
        return i2 > 0;
    }

    /* renamed from: kD */
    public boolean mo108984kD(C79013a aVar, boolean z) {
        if (aVar == null) {
            return false;
        }
        C101611g<Integer, C79013a> gVar = C78747b.f230457a;
        if (aVar.f232005L == 1 && C78747b.m95094F(aVar.f232001H)) {
            return false;
        }
        if (!z) {
            aVar.field_content = C78747b.m95102b(aVar);
            if (aVar.f232007N.size() > 1) {
                aVar.field_active = 1;
            } else if (aVar.field_active == -1) {
                aVar.field_active = 0;
            }
        }
        boolean update = update(aVar.systemRowid, aVar);
        if (update) {
            ((C77815b) C86312j.m106911c(C77815b.class)).vx0().mo108665b(aVar.field_username, aVar.field_key);
        }
        return update;
    }

    /* renamed from: qq */
    public List<C79013a> mo108985qq(String str, int i) {
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        if (Util.isNullOrNil(str)) {
            return arrayList;
        }
        Cursor cursor = null;
        long e = (long) C31543z5.m39455e();
        if (i2 == 1) {
            ISQLiteDatabase iSQLiteDatabase = this.f232020d;
            String[] strArr = C79013a.f232000R.columns;
            StringBuilder sb = new StringBuilder();
            C101611g<Integer, C79013a> gVar = C78747b.f230457a;
            sb.append(e - (((long) 5) * f232016e.longValue()));
            sb.append("");
            cursor = iSQLiteDatabase.query("GroupSolitatire", strArr, "username=? and active=? and lastActiveTime>=?", new String[]{str, "1", sb.toString()}, (String) null, (String) null, "lastActiveTime DESC ");
        } else if (i2 == 0) {
            ISQLiteDatabase iSQLiteDatabase2 = this.f232020d;
            String[] strArr2 = C79013a.f232000R.columns;
            cursor = iSQLiteDatabase2.query("GroupSolitatire", strArr2, "username=? and active=? and lastActiveTime>=?", new String[]{str, "0", (e - (((long) C78747b.m95116p()) * f232017f.longValue())) + ""}, (String) null, (String) null, "lastActiveTime DESC ");
        }
        if (cursor == null) {
            return arrayList;
        }
        while (cursor.moveToNext()) {
            C79013a aVar = new C79013a();
            aVar.convertFrom(cursor);
            C78747b.m95114n(aVar);
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
