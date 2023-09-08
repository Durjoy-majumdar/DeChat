package dh2;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p749xh.C38550da;

/* renamed from: dh2.a */
public final class C31182a extends MAutoStorage<C38550da> {

    /* renamed from: e */
    public static final String[] f83573e = {MAutoStorage.getCreateSQLs(C31183b.f83575p, C31183b.f83576q)};

    /* renamed from: d */
    public final ISQLiteDatabase f83574d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31182a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C31183b.f83575p, C31183b.f83576q, C31183b.f83577r);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C31183b.f83575p;
        this.f83574d = iSQLiteDatabase;
    }
}
