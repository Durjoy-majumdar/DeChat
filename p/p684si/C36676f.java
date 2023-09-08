package p684si;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.p014mm.autogen.events.NotifyGroupToolsEvent;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;

/* renamed from: si.f */
public class C36676f extends MAutoStorage<C36674e> {

    /* renamed from: e */
    public static final String[] f97471e = {MAutoStorage.getCreateSQLs(C36674e.f97468v, "GroupTools")};

    /* renamed from: f */
    public static final String[] f97472f = {"DROP INDEX IF EXISTS usernameIndex", "CREATE INDEX IF NOT EXISTS GroupTools_usernameIndex ON GroupTools ( chatroomname )"};

    /* renamed from: d */
    public ISQLiteDatabase f97473d;

    public C36676f(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C36674e.f97468v, "GroupTools", f97472f);
        this.f97473d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean insert(C36674e eVar) {
        if (eVar == null) {
            return false;
        }
        return super.insert(eVar);
    }

    /* renamed from: jo */
    public C36674e mo60800jo(String str) {
        Cursor query;
        if (Util.isNullOrNil(str) || (query = this.f97473d.query("GroupTools", C36674e.f97468v.columns, "chatroomname=?", new String[]{str}, (String) null, (String) null, (String) null)) == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (query.moveToNext()) {
                C36674e eVar = new C36674e();
                eVar.convertFrom(query);
                arrayList.add(eVar);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            C36674e eVar2 = (C36674e) arrayList.get(0);
            query.close();
            return eVar2;
        } finally {
            query.close();
        }
    }

    /* renamed from: qq */
    public boolean update(C36674e eVar, String... strArr) {
        boolean updateNotify = super.updateNotify(eVar, true, strArr);
        if (updateNotify) {
            NotifyGroupToolsEvent notifyGroupToolsEvent = new NotifyGroupToolsEvent();
            notifyGroupToolsEvent.f78878d.f78879a = eVar.field_chatroomname;
            notifyGroupToolsEvent.asyncPublish(Looper.getMainLooper());
        }
        return updateNotify;
    }
}
