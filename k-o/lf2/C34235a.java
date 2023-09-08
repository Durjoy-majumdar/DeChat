package lf2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import jf2.C33569a;

/* renamed from: lf2.a */
public class C34235a extends MAutoStorage<C33569a> {

    /* renamed from: d */
    public static final String[] f92312d = {MAutoStorage.getCreateSQLs(C33569a.f90878U, "ProfileInfo")};

    /* renamed from: e */
    public static final String[] f92313e = new String[0];

    public C34235a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33569a.f90878U, "ProfileInfo", f92313e);
    }

    /* renamed from: jo */
    public C33569a mo59508jo(String str) {
        C33569a aVar = new C33569a();
        aVar.field_username = str;
        if (!get(aVar, "username")) {
            Log.m105920e("MicroMsg.ProfileInfoStorage", "profileInfo is null");
            return null;
        }
        Log.m105925i("MicroMsg.ProfileInfoStorage", "get username:%s", aVar.field_username);
        return aVar;
    }
}
