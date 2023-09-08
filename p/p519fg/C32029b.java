package p519fg;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;

/* renamed from: fg.b */
public final class C32029b extends MAutoStorage<C32028a> {

    /* renamed from: e */
    public static final String[] f85257e = {MAutoStorage.getCreateSQLs(C32028a.f85256z, "AdvertisePushDBInfo")};

    /* renamed from: d */
    public final ISQLiteDatabase f85258d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32029b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C32028a.f85256z, "AdvertisePushDBInfo", f85257e);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C32028a.f85256z;
        this.f85258d = iSQLiteDatabase;
    }
}
