package jd1;

import bd1.C54446b;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p749xh.C66278y2;

/* renamed from: jd1.b */
public final class C60793b extends MAutoStorage<C54446b> {

    /* renamed from: d */
    public final ISQLiteDatabase f173152d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60793b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C54446b.f152697e1, "FinderAccount", C66278y2.f190726K);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C54446b.f152697e1;
        this.f173152d = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public final long mo85724jo(String str) {
        C87412m.m108594g(str, "username");
        C54446b bVar = (C54446b) C66278y2.f190724I.selectAll().where(C66278y2.f190725J.equal(new C54446b(str).field_username)).log("MicroMsg.SDK.BaseFinderAccount").build().singleQuery(this.f173152d, C54446b.class);
        if (bVar != null) {
            return bVar.systemRowid;
        }
        return -1;
    }
}
