package oo1;

import ak1.C54067f0;
import android.view.View;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.HashMap;
import te3.C49712hj1;
import zp3.C23555k;

/* renamed from: oo1.l */
public final class C11666l extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C11625e f34186a;

    /* renamed from: b */
    public final /* synthetic */ String f34187b;

    public C11666l(C11625e eVar, String str) {
        this.f34186a = eVar;
        this.f34187b = str;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (this.f34186a.f34107u) {
            HashMap hashMap = new HashMap();
            String str = this.f34187b;
            C11625e eVar = this.f34186a;
            hashMap.put("finder_username", str);
            hashMap.put("activityId", eVar.f34108v);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C54067f0.C0066n nVar = C54067f0.C0066n.LIVE_CONCERT_PROFILE_RECIVE;
            C49712hj1 hj12 = this.f34186a.f34088b;
            C8777j5.C8778a.m8609j((C8777j5) c, nVar, hashMap, hj12.f134671e, String.valueOf(hj12.f134675i), (String) null, 16, (Object) null);
        }
    }
}
