package oi0;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: oi0.b */
public class C89212b extends MAutoStorage<C35168a> {

    /* renamed from: e */
    public static final String[] f257057e = {MAutoStorage.getCreateSQLs(C35168a.f94315p, "AppBrandRecommendCard")};

    /* renamed from: d */
    public ISQLiteDatabase f257058d;

    public C89212b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C35168a.f94315p, "AppBrandRecommendCard", (String[]) null);
        this.f257058d = iSQLiteDatabase;
    }
}
