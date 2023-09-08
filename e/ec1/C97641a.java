package ec1;

import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import java.util.List;
import p749xh.C102657n2;
import p749xh.C102670ua;
import pb1.C100746u;

/* renamed from: ec1.a */
public final class C97641a {
    /* renamed from: a */
    public static final List<C100746u> m125859a(long j) {
        SelectSql build = C102657n2.f302698u.selectAll().where(C102657n2.f302700w.equal((Number) Long.valueOf(j))).log("MicroMsg.SDK.BaseFavCdnInfo").build();
        if (C102670ua.f303014i == null) {
            C102670ua.f303014i = new C102670ua();
        }
        C102670ua uaVar = C102670ua.f303014i;
        boolean z = true;
        if (uaVar == null || !uaVar.mo125628r()) {
            z = false;
        }
        if (!z) {
            uaVar = null;
        }
        return build.multiQuery(uaVar, C100746u.class);
    }
}
