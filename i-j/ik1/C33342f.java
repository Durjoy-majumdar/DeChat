package ik1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import gy3.C87412m;
import hg1.C32892f;
import ig1.C33318e;
import p749xh.C38605l3;

/* renamed from: ik1.f */
public final class C33342f extends C32892f {

    /* renamed from: e */
    public final ISQLiteDatabase f90382e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33342f(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33318e.f90336p, "FinderLiveLastRewardInfo", C38605l3.f102934g);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C33318e.f90336p;
        this.f90382e = iSQLiteDatabase;
    }
}
