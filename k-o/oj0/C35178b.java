package oj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorage;

/* renamed from: oj0.b */
public class C35178b extends MAutoStorage<C35177a> {

    /* renamed from: d */
    public static final String[] f94333d = {MAutoStorage.getCreateSQLs(C35177a.f94332D, "WxagGameInfo")};

    public C35178b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C35177a.f94332D, "WxagGameInfo", (String[]) null);
        if (!(iSQLiteDatabase != null)) {
            Log.m105920e("MicroMsg.MiniGameInfoStorage", "storage can not work!!!");
        }
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange) {
        add("MicroMsg.MiniGameInfoStorage.WORKER", iOnStorageChange);
    }
}
