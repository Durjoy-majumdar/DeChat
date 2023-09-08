package hz0;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: hz0.k0 */
public class C33159k0 extends MAutoStorage<C33157j0> {

    /* renamed from: e */
    public static final String[] f90010e = {MAutoStorage.getCreateSQLs(C33157j0.f90007p, "PendingCardId")};

    /* renamed from: d */
    public ISQLiteDatabase f90011d;

    public C33159k0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33157j0.f90007p, "PendingCardId", (String[]) null);
        this.f90011d = iSQLiteDatabase;
    }
}
