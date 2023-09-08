package up1;

import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C66274t3;
import p749xh.C66276va;

/* renamed from: up1.q */
public final class C65423q extends MAutoStorage<C66274t3> {

    /* renamed from: d */
    public static final String[] f188272d;

    /* renamed from: e */
    public static final String[] f188273e = {MAutoStorage.getCreateSQLs(C66276va.f190699A1, "FinderIdentityMsg")};

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE INDEX IF NOT EXISTS ");
        sb.append(C66276va.f190700B1);
        sb.append(" ON ");
        int i = C66274t3.f190671z1;
        sb.append("FinderIdentityMsg");
        sb.append(" ( id, flag, type, userVersion)");
        f188272d = new String[]{sb.toString(), "CREATE INDEX IF NOT EXISTS Finder_Mention_Id_Create_Time ON FinderIdentityMsg(createTime, id)", "CREATE INDEX IF NOT EXISTS Finder_Mention_Type ON FinderIdentityMsg(type)", "CREATE INDEX IF NOT EXISTS Finder_Object_Id ON FinderIdentityMsg(objectId)", "CREATE INDEX IF NOT EXISTS Finder_Comment_Id ON FinderIdentityMsg(commentId)"};
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C65423q(com.tencent.p014mm.sdk.storage.ISQLiteDatabase r4) {
        /*
            r3 = this;
            java.lang.String r0 = "db"
            gy3.C87412m.m108594g(r4, r0)
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r0 = p749xh.C66276va.f190699A1
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r0 = p749xh.C66276va.f190699A1
            int r1 = p749xh.C66274t3.f190671z1
            java.lang.String[] r1 = f188272d
            java.lang.String r2 = "FinderIdentityMsg"
            r3.<init>(r4, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: up1.C65423q.<init>(com.tencent.mm.sdk.storage.ISQLiteDatabase):void");
    }
}
