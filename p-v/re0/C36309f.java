package re0;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;

/* renamed from: re0.f */
public final class C36309f extends MAutoStorage<C36308e> {

    /* renamed from: e */
    public static final String[] f96661e = {MAutoStorage.getCreateSQLs(C36308e.f96660p, "OpenIMArchive")};

    /* renamed from: d */
    public final ISQLiteDatabase f96662d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36309f(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C36308e.f96660p, "OpenIMArchive", (String[]) null);
        C87412m.m108594g(iSQLiteDatabase, "db");
        this.f96662d = iSQLiteDatabase;
    }
}
