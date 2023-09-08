package pm2;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C48897bs;

/* renamed from: pm2.b */
public class C35562b extends MAutoStorage<C35561a> {

    /* renamed from: e */
    public static final String[] f95080e = {MAutoStorage.getCreateSQLs(C35561a.f95079t, "SelectRecord")};

    /* renamed from: f */
    public static final String[] f95081f = {"CREATE INDEX IF NOT EXISTS SelectRecord_historyIdIndex ON SelectRecord ( historyId )"};

    /* renamed from: d */
    public ISQLiteDatabase f95082d;

    public C35562b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C35561a.f95079t, "SelectRecord", f95081f);
        this.f95082d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public C72963f4 mo60316Lo(String str) {
        Cursor query;
        C72963f4 f4Var = new C72963f4();
        if (Util.isNullOrNil(str) || (query = this.f95082d.query("SelectRecord", C35561a.f95079t.columns, "historyId=?", new String[]{str}, (String) null, (String) null, (String) null, 2)) == null) {
            return f4Var;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (query.moveToNext()) {
                C35561a aVar = new C35561a();
                aVar.convertFrom(query);
                arrayList.add(aVar);
            }
            if (arrayList.size() == 0) {
                return f4Var;
            }
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(((C35561a) arrayList.get(0)).field_msgId);
            query.close();
            return b002;
        } finally {
            query.close();
        }
    }

    /* renamed from: Ow */
    public boolean mo60317Ow(String str, C48897bs bsVar) {
        C35561a qq = mo60320qq(str);
        if (qq == null) {
            Log.m105920e("MicroMsg.selectRecord.SelectRecordStorage", "updateChatHistoryItem() called with: historyId = [" + str + "], item = [" + bsVar + "] selectRecordItem == null");
            return false;
        }
        qq.field_chatHistoryItem = bsVar;
        boolean update = super.update(qq.systemRowid, qq);
        int size = bsVar == null ? -1 : bsVar.f131282d.size();
        Log.m105925i("MicroMsg.selectRecord.SelectRecordStorage", "updateChatHistoryItem() called with: historyId = [" + str + "], item = [" + bsVar + "] updateRes:%s itemsize:%s", Boolean.valueOf(update), Integer.valueOf(size));
        return update;
    }

    /* renamed from: Yt */
    public boolean insert(C35561a aVar) {
        if (aVar == null) {
            return false;
        }
        return super.insert(aVar);
    }

    /* renamed from: jo */
    public boolean mo60319jo(String str) {
        C48897bs bsVar;
        LinkedList<Long> linkedList;
        C35561a qq = mo60320qq(str);
        if (qq == null) {
            Log.m105920e("MicroMsg.selectRecord.SelectRecordStorage", "deleteRelatedMsgs() called with: historyId = [" + str + "] selectRecordItem == null");
            return false;
        } else if (TextUtils.isEmpty(qq.field_talker) || (bsVar = qq.field_chatHistoryItem) == null || (linkedList = bsVar.f131282d) == null || linkedList.size() <= 0) {
            return true;
        } else {
            try {
                Iterator<Long> it = qq.field_chatHistoryItem.f131282d.iterator();
                while (it.hasNext()) {
                    C75604z3.m90835g(qq.field_talker, it.next().longValue());
                }
                return true;
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.selectRecord.SelectRecordStorage", th, "deleteRelatedMsgs err", new Object[0]);
                return true;
            }
        }
    }

    /* renamed from: qq */
    public C35561a mo60320qq(String str) {
        Cursor query = this.f95082d.query("SelectRecord", C35561a.f95079t.columns, "historyId=?", new String[]{str}, (String) null, (String) null, (String) null, 2);
        if (query == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (query.moveToNext()) {
                C35561a aVar = new C35561a();
                aVar.convertFrom(query);
                arrayList.add(aVar);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            C35561a aVar2 = (C35561a) arrayList.get(0);
            query.close();
            return aVar2;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.selectRecord.SelectRecordStorage", th, "getSelectRecordItem err", new Object[0]);
            return null;
        } finally {
            query.close();
        }
    }
}
