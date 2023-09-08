package pq0;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38554e7;

/* renamed from: pq0.b */
public class C35613b extends MAutoStorage<C35612a> {

    /* renamed from: d */
    public static final String[] f95197d = {MAutoStorage.getCreateSQLs(C35612a.f95196z, "OuterWidgetAppInfo")};

    public C35613b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C35612a.f95196z, "OuterWidgetAppInfo", C38554e7.f102163o);
    }

    /* renamed from: jo */
    public int mo60336jo() {
        return super.delete("OuterWidgetAppInfo", (String) null, (String[]) null);
    }
}
