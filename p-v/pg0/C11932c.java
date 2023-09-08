package pg0;

import a14.C53934p0;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import ng0.C11158b;
import ng0.C11160d;
import og0.C11409c;
import og0.C47374b;
import wx3.C15601d;

/* renamed from: pg0.c */
public final class C11932c implements C11160d {
    public void onChanged(Object obj) {
        C11158b bVar = (C11158b) obj;
        C87412m.m108594g(bVar, "data");
        if (bVar.f32939a == C11158b.C11159a.JsApiAgree) {
            int i = bVar.f32940b;
            String str = bVar.f32941c;
            String str2 = bVar.f32942d;
            String str3 = bVar.f32943e;
            C87412m.m108594g(str, "customInfo");
            C87412m.m108594g(str2, "ticket");
            C87412m.m108594g(str3, "policyList");
            LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
            if (lifecycleScope != null) {
                LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C47374b(i, str, str2, str3, "AgreeEvent", (C15601d<? super C47374b>) null), 1, (Object) null);
            }
            C11409c.C11410a aVar = C11409c.f33568d;
            if (aVar != null) {
                Log.m105924i("MicroMsg.Account.AccountComplianceReceiver", "currentObj: " + aVar.f33571c + ' ' + aVar.f33569a);
                if (C87412m.m108589b(bVar.f32942d, aVar.f33571c)) {
                    C11409c.f33568d = null;
                }
            }
        }
    }
}
