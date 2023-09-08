package b42;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: b42.f */
public final class C28256f extends MAutoStorage<C28255e> {

    /* renamed from: e */
    public static final String[] f77811e = {MAutoStorage.getCreateSQLs(C28255e.f77810p, "LuckyMoneyDetailOpenRecord")};

    /* renamed from: d */
    public ISQLiteDatabase f77812d;

    public C28256f(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C28255e.f77810p, "LuckyMoneyDetailOpenRecord", (String[]) null);
        this.f77812d = iSQLiteDatabase;
    }
}
