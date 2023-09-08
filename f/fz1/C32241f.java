package fz1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p749xh.C38566g4;

/* renamed from: fz1.f */
public final class C32241f extends MAutoStorage<C32238c> {

    /* renamed from: d */
    public static final String[] f85658d = {MAutoStorage.getCreateSQLs(C32238c.f85654z, "AppMessage")};

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32241f(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C32238c.f85654z, "AppMessage", C38566g4.f102344o);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C32238c.f85654z;
    }
}
