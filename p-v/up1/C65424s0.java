package up1;

import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C66274t3;
import p749xh.C66276va;

/* renamed from: up1.s0 */
public final class C65424s0 extends MAutoStorage<C66274t3> {

    /* renamed from: d */
    public static final String[] f188274d;

    /* renamed from: e */
    public static final String[] f188275e = {MAutoStorage.getCreateSQLs(C66276va.f190699A1, "WxIdentityMsg")};

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE INDEX IF NOT EXISTS ");
        sb.append(C66276va.f190700B1);
        sb.append(" ON ");
        int i = C66274t3.f190671z1;
        sb.append("WxIdentityMsg");
        sb.append(" ( id, flag, type, userVersion)");
        f188274d = new String[]{sb.toString(), "CREATE INDEX IF NOT EXISTS Finder_Mention_Id_Create_Time ON FinderIdentityMsg(createTime, id)", "CREATE INDEX IF NOT EXISTS Finder_Mention_Type ON WxIdentityMsg(type)", "CREATE INDEX IF NOT EXISTS Finder_Object_Id ON WxIdentityMsg(objectId)", "CREATE INDEX IF NOT EXISTS Finder_Comment_Id ON WxIdentityMsg(commentId)"};
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C65424s0(com.tencent.p014mm.sdk.storage.ISQLiteDatabase r4) {
        /*
            r3 = this;
            java.lang.String r0 = "db"
            gy3.C87412m.m108594g(r4, r0)
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r0 = p749xh.C66276va.f190699A1
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r0 = p749xh.C66276va.f190699A1
            int r1 = p749xh.C66274t3.f190671z1
            java.lang.String[] r1 = f188274d
            java.lang.String r2 = "WxIdentityMsg"
            r3.<init>(r4, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: up1.C65424s0.<init>(com.tencent.mm.sdk.storage.ISQLiteDatabase):void");
    }
}
