package wx0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import f40.C86709a0;
import java.util.List;

/* renamed from: wx0.b */
public class C38339b extends MAutoStorage<C38338a> {

    /* renamed from: e */
    public static final String[] f101194e = {MAutoStorage.getCreateSQLs(C38338a.f101193t, "BizAppMsgReportContext")};

    /* renamed from: f */
    public static final String[] f101195f = new String[0];

    /* renamed from: d */
    public final ISQLiteDatabase f101196d;

    public C38339b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C38338a.f101193t, "BizAppMsgReportContext", f101195f);
        this.f101196d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public void mo61622Lo(List<C38338a> list) {
        long beginTransaction = C86709a0.m107535s().f251811i.beginTransaction(Thread.currentThread().getId());
        for (C38338a delete : list) {
            if (!delete(delete, new String[0])) {
                Log.m105926v("MicroMsg.Preload.BizAppMsgReportContextStorage", "[remove] delete fail");
            }
        }
        C86709a0.m107535s().f251811i.endTransaction(beginTransaction);
    }

    /* renamed from: jo */
    public boolean insert(C38338a aVar) {
        aVar.field_appMsgReportContextId = aVar.field_reportTime;
        return super.insert(aVar);
    }
}
