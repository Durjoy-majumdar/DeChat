package p684si;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import te3.C48768av3;

/* renamed from: si.b */
public class C36673b extends MAutoStorage<C36672a> {

    /* renamed from: e */
    public static final String[] f97465e = {MAutoStorage.getCreateSQLs(C36672a.f97464p, "GroupBindApp")};

    /* renamed from: f */
    public static final String[] f97466f = {"CREATE INDEX IF NOT EXISTS GroupBindAppUserNameIndex ON GroupBindApp ( chatRoomName )"};

    /* renamed from: d */
    public ISQLiteDatabase f97467d;

    public C36673b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C36672a.f97464p, "GroupBindApp", f97466f);
        this.f97467d = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public C48768av3 mo60794jo(String str) {
        Cursor query = this.f97467d.query("GroupBindApp", (String[]) null, "chatRoomName =?", new String[]{str}, (String) null, (String) null, (String) null);
        if (query == null) {
            return null;
        }
        try {
            if (query.moveToNext()) {
                C36672a aVar = new C36672a();
                aVar.convertFrom(query);
                byte[] bArr = aVar.field_BindAppData;
                if (bArr == null || bArr.length > 0) {
                    C48768av3 av32 = new C48768av3();
                    av32.parseFrom(aVar.field_BindAppData);
                    query.close();
                    return av32;
                }
                Log.m105924i("MicroMsg.GroupBindAppStorage", "BindAppData is null");
                query.close();
                return null;
            }
        } catch (Exception e) {
            Log.m105924i("MicroMsg.GroupBindAppStorage", e.getMessage());
        } catch (Throwable th) {
            query.close();
            throw th;
        }
        query.close();
        return null;
    }
}
