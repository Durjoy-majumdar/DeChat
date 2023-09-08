package xh3;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: xh3.b */
public final class C38726b extends MAutoStorage<C38725a> {

    /* renamed from: e */
    public static final String[] f104491e = {MAutoStorage.getCreateSQLs(C38725a.f104490v, "FileMsgInfo")};

    /* renamed from: f */
    public static final String[] f104492f = {"CREATE INDEX IF NOT EXISTS " + "FileMsgInfo_" + "overwriteNewMsgIdIndex" + " ON " + "FileMsgInfo" + " ( overwriteNewMsgId )"};

    /* renamed from: d */
    public final ISQLiteDatabase f104493d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38726b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C38725a.f104490v, "FileMsgInfo", f104492f);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C38725a.f104490v;
        this.f104493d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final C38725a mo61736Lo(long j) {
        C38725a aVar = null;
        if (j == 0) {
            return null;
        }
        ISQLiteDatabase iSQLiteDatabase = this.f104493d;
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C38725a.f104490v;
        Cursor query = iSQLiteDatabase.query("FileMsgInfo", C38725a.f104490v.columns, "overwriteNewMsgId=?", new String[]{String.valueOf(j)}, (String) null, (String) null, (String) null);
        try {
            ArrayList arrayList = new ArrayList();
            while (query.moveToNext()) {
                C38725a aVar2 = new C38725a();
                aVar2.convertFrom(query);
                arrayList.add(aVar2);
            }
            if (arrayList.size() > 0) {
                aVar = (C38725a) arrayList.get(0);
            }
            query.close();
            return aVar;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.FileMsgInfoStorage", "getFileMsgInfoByOverwriteMsgId Exception:" + e.getMessage());
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th) {
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    /* renamed from: jo */
    public final C38725a mo61737jo(long j) {
        C38725a aVar = null;
        if (j == 0) {
            return null;
        }
        ISQLiteDatabase iSQLiteDatabase = this.f104493d;
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C38725a.f104490v;
        Cursor query = iSQLiteDatabase.query("FileMsgInfo", C38725a.f104490v.columns, "msgSvrId=?", new String[]{String.valueOf(j)}, (String) null, (String) null, (String) null);
        try {
            ArrayList arrayList = new ArrayList();
            while (query.moveToNext()) {
                C38725a aVar2 = new C38725a();
                aVar2.convertFrom(query);
                arrayList.add(aVar2);
            }
            if (arrayList.size() > 0) {
                aVar = (C38725a) arrayList.get(0);
            }
            query.close();
            return aVar;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.FileMsgInfoStorage", "getFileMsgInfo Exception:" + e.getMessage());
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th) {
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    /* renamed from: qq */
    public boolean insert(C38725a aVar) {
        if (aVar == null) {
            return false;
        }
        return super.insert(aVar);
    }
}
