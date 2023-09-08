package up1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p749xh.C38519a3;

/* renamed from: up1.f0 */
public final class C37549f0 extends MAutoStorage<C38519a3> {

    /* renamed from: d */
    public static final String[] f99604d = {MAutoStorage.getCreateSQLs(C37558x0.f99617x, "FinderConsumeNewXmlData")};

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37549f0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C37558x0.f99617x, "FinderConsumeNewXmlData", C38519a3.f101593n);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C37558x0.f99617x;
    }
}
