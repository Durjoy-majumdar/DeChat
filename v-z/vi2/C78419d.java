package vi2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.HashMap;
import java.util.Map;
import p749xh.C78830w7;

/* renamed from: vi2.d */
public class C78419d extends MAutoStorage<C78418c> {

    /* renamed from: e */
    public static final String[] f229764e = {MAutoStorage.getCreateSQLs(C78418c.f229763B, "RemittanceRecord")};

    /* renamed from: f */
    public static final String[] f229765f = {"*", "rowid"};

    /* renamed from: g */
    public static Map<String, C78418c> f229766g = new HashMap();

    /* renamed from: d */
    public ISQLiteDatabase f229767d;

    public C78419d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C78418c.f229763B, "RemittanceRecord", C78830w7.f231549p);
        this.f229767d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public C78418c mo108368Lo(String str) {
        if (!Util.isNullOrNil(str) && ((HashMap) f229766g).containsKey(str)) {
            return (C78418c) ((HashMap) f229766g).get(str);
        }
        C78418c jo = mo108369jo(str);
        if (jo == null) {
            return null;
        }
        ((HashMap) f229766g).put(str, jo);
        return jo;
    }

    public boolean delete(IAutoDBItem iAutoDBItem, String[] strArr) {
        C78418c cVar = (C78418c) iAutoDBItem;
        if (cVar != null) {
            if (((HashMap) f229766g).containsKey(cVar.field_transferId)) {
                ((HashMap) f229766g).remove(cVar.field_transferId);
            }
        }
        return super.delete(cVar, strArr);
    }

    public boolean insert(IAutoDBItem iAutoDBItem) {
        C78418c cVar = (C78418c) iAutoDBItem;
        if (cVar != null) {
            if (((HashMap) f229766g).containsKey(cVar.field_transferId)) {
                ((HashMap) f229766g).put(cVar.field_transferId, cVar);
            }
        }
        return super.insert(cVar);
    }

    /* renamed from: jo */
    public C78418c mo108369jo(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        Cursor query = this.f229767d.query("RemittanceRecord", f229765f, "transferId=?", new String[]{str}, (String) null, (String) null, (String) null, 2);
        try {
            if (query.moveToFirst()) {
                C78418c cVar = new C78418c();
                cVar.convertFrom(query);
                query.close();
                return cVar;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.RemittanceSendRecordStorage", e, "getRecordByTransferId error: %s", e.getMessage());
        } catch (Throwable th) {
            query.close();
            throw th;
        }
        query.close();
        return null;
    }

    /* renamed from: qq */
    public boolean replace(C78418c cVar) {
        if (cVar != null) {
            if (((HashMap) f229766g).containsKey(cVar.field_transferId)) {
                ((HashMap) f229766g).put(cVar.field_transferId, cVar);
            }
        }
        return super.replace(cVar);
    }
}
