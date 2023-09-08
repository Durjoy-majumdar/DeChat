package ki0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p749xh.C91210p7;
import tr0.C37242c;

/* renamed from: ki0.d */
public final class C88154d extends C37242c<C88153c> {

    /* renamed from: f */
    public static final String[] f254939f = {MAutoStorage.getCreateSQLs(C88153c.f254938V, "PredownloadCmdGetCodePersistentInfo2"), "DROP TABLE IF EXISTS PredownloadCmdGetCodePersistentInfo"};

    /* renamed from: e */
    public final ISQLiteDatabase f254940e;

    public C88154d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C88153c.f254938V, "PredownloadCmdGetCodePersistentInfo2", C91210p7.f261709y);
        this.f254940e = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean insert(C88153c cVar) {
        boolean insert = super.insert(cVar);
        Log.m105925i("MicroMsg.Appbrand.Predownload.CmdGetCodePersistentStorage", "insert(%b) %s", Boolean.valueOf(insert), cVar);
        return insert;
    }

    /* renamed from: Yt */
    public boolean update(C88153c cVar, String... strArr) {
        boolean update = super.update(cVar, strArr);
        Log.m105925i("MicroMsg.Appbrand.Predownload.CmdGetCodePersistentStorage", "update(%b) %s", Boolean.valueOf(update), cVar);
        return update;
    }

    /* renamed from: jo */
    public boolean delete(C88153c cVar, String... strArr) {
        boolean delete = super.delete(cVar, strArr);
        Log.m105925i("MicroMsg.Appbrand.Predownload.CmdGetCodePersistentStorage", "delete(%b) %s", Boolean.valueOf(delete), cVar);
        return delete;
    }

    /* renamed from: qq */
    public final List<C88153c> mo122563qq(String str, String... strArr) {
        Cursor query = this.f254940e.query("PredownloadCmdGetCodePersistentInfo2", (String[]) null, str, strArr, (String) null, (String) null, (String) null);
        if (query == null || query.isClosed()) {
            return Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        if (query.moveToFirst()) {
            do {
                C88153c cVar = new C88153c();
                cVar.convertFrom(query);
                linkedList.add(cVar);
            } while (query.moveToNext());
        }
        query.close();
        return linkedList;
    }
}
