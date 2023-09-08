package e63;

import b63.C28269p;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: e63.a */
public class C31431a extends MAutoStorage<C28269p> {

    /* renamed from: e */
    public static final String[] f84129e = {MAutoStorage.getCreateSQLs(C28269p.f77841z, "LoanEntryInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f84130d;

    public C31431a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C28269p.f77841z, "LoanEntryInfo", (String[]) null);
        this.f84130d = iSQLiteDatabase;
    }
}
