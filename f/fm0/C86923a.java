package fm0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: fm0.a */
public final class C86923a extends C82926s {
    private static final int CTRL_INDEX = 881;
    private static final String NAME = "onNavigateBackIntercept";

    /* renamed from: i */
    public static final C86924a f252342i = new C86924a((C8480h) null);

    /* renamed from: fm0.a$a */
    public static final class C86924a {
        public C86924a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo121370a(AppBrandRuntime appBrandRuntime, int i) {
            C83780d1 pageView;
            C87412m.m108594g(appBrandRuntime, "rt");
            C86923a aVar = new C86923a((C8480h) null);
            Log.m105924i("AppBrandOnNavigateBackInterceptEvent", "[dispatch] type=" + i);
            HashMap hashMap = new HashMap(1);
            hashMap.put("type", Integer.valueOf(i));
            aVar.mo115165o(hashMap);
            aVar.mo115194p(appBrandRuntime.mo113047b0());
            aVar.mo115158h();
            C83849m0 Z = appBrandRuntime.mo113042Z();
            if (Z != null && (pageView = Z.getPageView()) != null) {
                aVar.mo115165o(hashMap);
                aVar.mo115194p(pageView);
                aVar.mo115158h();
            }
        }
    }

    public C86923a(C8480h hVar) {
    }
}
