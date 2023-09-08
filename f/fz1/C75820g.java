package fz1;

import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.C72959e;
import di3.C86312j;
import g62.C75875l;
import gy3.C87412m;
import p215oo.C35246f;

/* renamed from: fz1.g */
public final class C75820g extends C72959e {

    /* renamed from: c */
    public static final String[] f222433c = {MAutoStorage.getCreateSQLs(((C35246f) C86312j.m106911c(C35246f.class)).mo59795iS(), "gamelifemessage"), "CREATE INDEX IF NOT EXISTS  gamelifemessageSvrIdIndex ON gamelifemessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  gamelifemessageTalkerIndex ON gamelifemessage ( talker )", "CREATE INDEX IF NOT EXISTS  gamelifemessageTalkerStatusIndex ON gamelifemessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  gamelifemessageCreateTimeIndex ON gamelifemessage ( createTime )", "CREATE INDEX IF NOT EXISTS  gamelifemessageCreateTalkerTimeIndex ON gamelifemessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  gamelifemessageSendCreateTimeIndex ON gamelifemessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  gamelifemessageTalkerTypeIndex ON gamelifemessage ( talker,type )"};

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75820g(C75875l lVar) {
        super(lVar);
        C87412m.m108594g(lVar, "storage");
        mo100942g(mo100940c(), "gamelifemessage");
        mo100939a(new C75875l.C75878d(1024, "gamelifemessage", C75875l.C75878d.m91132a(4500001, 5000000, 208000001, 308000000)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if ((r4.length() > 0) == true) goto L_0x0011;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo100923f(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x0010
            int r2 = r4.length()
            if (r2 <= 0) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            if (r2 != r0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            junit.framework.Assert.assertTrue(r0)
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85832c5(r4)
            if (r4 == 0) goto L_0x001d
            java.lang.String r4 = "gamelifemessage"
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fz1.C75820g.mo100923f(java.lang.String):java.lang.String");
    }
}
