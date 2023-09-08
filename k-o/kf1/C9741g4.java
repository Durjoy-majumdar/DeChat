package kf1;

import ak1.C54067f0;
import ak1.C54108o;
import android.view.View;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.HashMap;
import te3.C49204dz;
import te3.C49352ez;
import zp3.C23555k;

/* renamed from: kf1.g4 */
public final class C9741g4 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C9765h4 f30193a;

    public C9741g4(C9765h4 h4Var) {
        this.f30193a = h4Var;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        String str;
        String str2;
        Class cls = C54108o.class;
        C87412m.m108594g(view, "view");
        HashMap hashMap = new HashMap();
        C9765h4 h4Var = this.f30193a;
        hashMap.put("page_id", "1003");
        C49352ez ezVar = h4Var.f30249J;
        String str3 = "";
        if (ezVar == null || (str = ezVar.f133182d) == null) {
            str = str3;
        }
        hashMap.put("activityId", str);
        C49204dz dzVar = h4Var.f30250K;
        if (!(dzVar == null || (str2 = dzVar.f132567d) == null)) {
            str3 = str2;
        }
        hashMap.put("resource_id", str3);
        hashMap.put("enter_sence", h4Var.f30245F);
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C54067f0.C0066n nVar = C54067f0.C0066n.LIVE_CONCERT_TICKET_PAGE_SHARE_BUTTON;
        C9765h4 h4Var2 = this.f30193a;
        C8777j5.C8778a.m8609j((C8777j5) c, nVar, hashMap, h4Var2.f30255Q, h4Var2.f30256R, (String) null, 16, (Object) null);
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C54067f0.C0066n nVar2 = C54067f0.C0066n.LIVE_CONCERT_TICKET_PAGE_SAVE_BUTTON;
        C9765h4 h4Var3 = this.f30193a;
        C8777j5.C8778a.m8609j((C8777j5) c2, nVar2, hashMap, h4Var3.f30255Q, h4Var3.f30256R, (String) null, 16, (Object) null);
    }
}
