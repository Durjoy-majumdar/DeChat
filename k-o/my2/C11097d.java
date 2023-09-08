package my2;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import ky2.C10438n;

/* renamed from: my2.d */
public final class C11097d extends MAutoStorage<C10438n> {

    /* renamed from: e */
    public static final String[] f32876e = {MAutoStorage.getCreateSQLs(C10438n.f31666t, "TeenModeBindGuardian")};

    /* renamed from: d */
    public final ISQLiteDatabase f32877d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11097d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C10438n.f31666t, "TeenModeBindGuardian", (String[]) null);
        C87412m.m108594g(iSQLiteDatabase, "db");
        this.f32877d = iSQLiteDatabase;
    }
}
