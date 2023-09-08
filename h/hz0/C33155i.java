package hz0;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: hz0.i */
public class C33155i extends MAutoStorage<C33154h> {

    /* renamed from: e */
    public static final String[] f90004e = {MAutoStorage.getCreateSQLs(C33154h.f90003z, "CardQrCodeConfi")};

    /* renamed from: d */
    public ISQLiteDatabase f90005d;

    public C33155i(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33154h.f90003z, "CardQrCodeConfi", (String[]) null);
        this.f90005d = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public C33154h mo58987jo(String str) {
        C33154h hVar = new C33154h();
        hVar.field_card_id = str;
        if (get(hVar, new String[0])) {
            return hVar;
        }
        return null;
    }
}
