package ki0;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38576ha;

/* renamed from: ki0.j */
public class C33915j extends MAutoStorage<C33914i> {

    /* renamed from: d */
    public static final String[] f91609d = {MAutoStorage.getCreateSQLs(C33914i.f91608t, "WxaAttrVersionServerNotifyRecord")};

    public C33915j(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33914i.f91608t, "WxaAttrVersionServerNotifyRecord", C38576ha.f102476i);
    }

    /* renamed from: jo */
    public C33914i mo59363jo(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C33914i iVar = new C33914i();
        iVar.field_username = str;
        if (get(iVar, new String[0])) {
            return iVar;
        }
        return null;
    }
}
