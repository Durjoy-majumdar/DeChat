package ik1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import gy3.C87412m;
import hg1.C32891d;
import ig1.C33317c;
import java.util.ArrayList;
import p749xh.C38586j3;

/* renamed from: ik1.d */
public final class C33341d extends C32891d {

    /* renamed from: e */
    public final ISQLiteDatabase f90380e;

    /* renamed from: f */
    public ArrayList<String> f90381f = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33341d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33317c.f90335p, "FinderLiveDislikeBannerRecord", C38586j3.f102606g);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C33317c.f90335p;
        this.f90380e = iSQLiteDatabase;
    }
}
