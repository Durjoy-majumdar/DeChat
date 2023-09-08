package px1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: px1.c */
public class C35725c extends MAutoStorage<C35724b> {

    /* renamed from: d */
    public static final String[] f95421d = {MAutoStorage.getCreateSQLs(C35724b.f95420p, "PBCache")};

    public C35725c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C35724b.f95420p, "PBCache", (String[]) null);
    }

    /* renamed from: Rz */
    public byte[] mo60366Rz(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C35724b bVar = new C35724b();
        bVar.field_key = str;
        if (super.get(bVar, new String[0])) {
            return bVar.field_value;
        }
        return null;
    }

    /* renamed from: jo */
    public boolean mo60367jo(String str, byte[] bArr) {
        boolean z;
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        C35724b bVar = new C35724b();
        bVar.field_key = str;
        if (super.get(bVar, new String[0])) {
            bVar.field_value = bArr;
            z = super.update(bVar, new String[0]);
        } else {
            bVar.field_value = bArr;
            z = super.insert(bVar);
        }
        if (!z) {
            Log.m105920e("MicroMsg.PBCacheStorage", "Saving cache failed (update or insert)");
        }
        return z;
    }

    public void q60(String str) {
        C35724b bVar = new C35724b();
        bVar.field_key = str;
        super.delete(bVar, new String[0]);
    }
}
