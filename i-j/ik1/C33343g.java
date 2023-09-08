package ik1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import gy3.C87412m;
import hg1.C32893g;
import ig1.C33319f;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p749xh.C38610m3;

/* renamed from: ik1.g */
public final class C33343g extends C32893g {

    /* renamed from: e */
    public final ISQLiteDatabase f90383e;

    /* renamed from: f */
    public final ConcurrentHashMap<Long, Set<String>> f90384f = new ConcurrentHashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33343g(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33319f.f90337p, "FinderLiveLuckyMoneyInfo", C38610m3.f102997g);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C33319f.f90337p;
        this.f90383e = iSQLiteDatabase;
    }
}
