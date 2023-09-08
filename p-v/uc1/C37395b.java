package uc1;

import com.tencent.p014mm.sdk.storage.MAutoStorage;
import di3.C86312j;
import f40.C31887k0;
import gy3.C87412m;
import java.util.HashMap;
import p215oo.C35246f;
import zh3.C91753f;

/* renamed from: uc1.b */
public final class C37395b implements C31887k0.C31890c {

    /* renamed from: uc1.b$a */
    public static final class C37396a implements C91753f.C66827b {

        /* renamed from: a */
        public static final C37396a f98858a = new C37396a();

        /* renamed from: a */
        public final String[] mo6410a() {
            String createSQLs = MAutoStorage.getCreateSQLs(((C35246f) C86312j.m106911c(C35246f.class)).mo59795iS(), "findermessage006");
            C87412m.m108593f(createSQLs, "getCreateSQLs(ServiceMan…getBypMsgDBInfo(), table)");
            return new String[]{createSQLs, "CREATE INDEX IF NOT EXISTS  findermessage006SvrIdIndex ON findermessage006 ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  findermessage006TalkerIndex ON findermessage006 ( talker )", "CREATE INDEX IF NOT EXISTS  findermessage006TalkerStatusIndex ON findermessage006 ( talker,status )", "CREATE INDEX IF NOT EXISTS  findermessage006CreateTimeIndex ON findermessage006 ( createTime )", "CREATE INDEX IF NOT EXISTS  findermessage006CreateTalkerTimeIndex ON findermessage006 ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  findermessage006SendCreateTimeIndex ON findermessage006 ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  findermessage006TalkerTypeIndex ON findermessage006 ( talker,type )"};
        }
    }

    /* renamed from: Rg */
    public HashMap<Integer, C91753f.C66827b> mo9070Rg() {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        hashMap.put(-440473227, C37396a.f98858a);
        return hashMap;
    }
}
