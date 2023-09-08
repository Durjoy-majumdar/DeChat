package x72;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;

/* renamed from: x72.a */
public class C38459a extends MAutoStorage<C38460b> {

    /* renamed from: e */
    public static final String[] f101442e = {MAutoStorage.getCreateSQLs(C38460b.f101445v, "MsgQuote")};

    /* renamed from: f */
    public static final String[] f101443f = {"CREATE INDEX IF NOT EXISTS quotedMsgSvrIdIndex ON MsgQuote ( quotedMsgSvrId )"};

    /* renamed from: d */
    public ISQLiteDatabase f101444d;

    public C38459a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C38460b.f101445v, "MsgQuote", f101443f);
        this.f101444d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public C38460b mo61670Lo(long j) {
        if (j <= 0) {
            Log.m105921e("MicroMsg.msgquote.MsgQuoteStorage", "quotedMsgSvrId:%s", Long.valueOf(j));
            return null;
        }
        ISQLiteDatabase iSQLiteDatabase = this.f101444d;
        String[] strArr = C38460b.f101445v.columns;
        Cursor query = iSQLiteDatabase.query("MsgQuote", strArr, "quotedMsgSvrId=?", new String[]{j + ""}, (String) null, (String) null, (String) null);
        if (query == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            C38460b bVar = new C38460b();
            bVar.convertFrom(query);
            arrayList.add(bVar);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (C38460b) arrayList.get(0);
    }

    /* renamed from: Yt */
    public boolean mo61671Yt(C38460b bVar) {
        if (bVar == null) {
            return false;
        }
        return super.insert(bVar);
    }

    /* renamed from: jo */
    public C38460b mo61672jo(long j) {
        if (j <= 0) {
            Log.m105921e("MicroMsg.msgquote.MsgQuoteStorage", "quotedMsgId:%s", Long.valueOf(j));
            return null;
        }
        ISQLiteDatabase iSQLiteDatabase = this.f101444d;
        String[] strArr = C38460b.f101445v.columns;
        Cursor query = iSQLiteDatabase.query("MsgQuote", strArr, "quotedMsgId=?", new String[]{j + ""}, (String) null, (String) null, (String) null);
        if (query == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            C38460b bVar = new C38460b();
            bVar.convertFrom(query);
            arrayList.add(bVar);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (C38460b) arrayList.get(0);
    }

    /* renamed from: qq */
    public boolean insert(C38460b bVar) {
        if (bVar == null) {
            return false;
        }
        bVar.field_status = 0;
        return super.insert(bVar);
    }
}
