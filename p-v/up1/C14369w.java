package up1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p749xh.C38649r3;

/* renamed from: up1.w */
public final class C14369w extends MAutoStorage<C38649r3> {

    /* renamed from: e */
    public static final String[] f39924e = {MAutoStorage.getCreateSQLs(C14368v.f39923E, "FinderMapPoiInfo")};

    /* renamed from: d */
    public final ISQLiteDatabase f39925d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14369w(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C14368v.f39923E, "FinderMapPoiInfo", C38649r3.f103480r);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C14368v.f39923E;
        this.f39925d = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public final C14368v mo13670jo(String str) {
        C87412m.m108594g(str, "poiId");
        return (C14368v) C38649r3.f103478p.selectAll().where(C38649r3.f103479q.equal(str)).log("MicroMsg.SDK.BaseFinderMapPoiInfo").build().singleQuery(this.f39925d, C14368v.class);
    }
}
