package hg0;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: hg0.y0 */
public class C76187y0 extends MAutoStorage<C76188z> {

    /* renamed from: e */
    public static final String[] f223222e = {MAutoStorage.getCreateSQLs(C76188z.f223224D, "OldAccountFriend")};

    /* renamed from: d */
    public ISQLiteDatabase f223223d;

    public C76187y0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C76188z.f223224D, "OldAccountFriend", (String[]) null);
        this.f223223d = iSQLiteDatabase;
    }
}
