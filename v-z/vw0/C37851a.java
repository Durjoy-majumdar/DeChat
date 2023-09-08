package vw0;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import tw0.C37285a;

/* renamed from: vw0.a */
public class C37851a extends MAutoStorage<C37285a> {

    /* renamed from: e */
    public static final String[] f100212e = {MAutoStorage.getCreateSQLs(C37285a.f98639t, "ActiveInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f100213d;

    public C37851a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C37285a.f98639t, "ActiveInfo", (String[]) null);
        this.f100213d = iSQLiteDatabase;
    }

    public String getTableName() {
        return "ActiveInfo";
    }
}
