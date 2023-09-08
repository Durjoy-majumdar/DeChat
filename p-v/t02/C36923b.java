package t02;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: t02.b */
public class C36923b extends MAutoStorage<C36922a> {

    /* renamed from: e */
    public static final String[] f97963e = {MAutoStorage.getCreateSQLs(C36922a.f97962p, "HoneyPayMsgRecord")};

    /* renamed from: d */
    public ISQLiteDatabase f97964d;

    public C36923b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C36922a.f97962p, "HoneyPayMsgRecord", (String[]) null);
        this.f97964d = iSQLiteDatabase;
    }
}
