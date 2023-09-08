package sq0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fm0.C86923a;
import gy3.C87412m;
import p963fc.C86812g;
import sq0.C90333e;

/* renamed from: sq0.d */
public class C90332d<T extends AppBrandRuntime> implements C90333e<T> {
    /* renamed from: a */
    public C90339i mo124559a() {
        return C90339i.SILENT;
    }

    /* renamed from: b */
    public boolean mo124560b(T t, String str, Runnable runnable) {
        C87412m.m108594g(t, "runtime");
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C83820i0 currentPage = t.mo113042Z().getCurrentPage();
        C90337g t2 = currentPage != null ? currentPage.mo116307t(C90339i.SILENT) : null;
        boolean z = false;
        if (t2 == null) {
            Log.m105924i("MicroMsg.AppBrandPageNavigateBackSilentInterceptor", "navigateBackInterceptionInfo is null");
            return false;
        }
        if (t2.mo124564a(str)) {
            Log.m105924i("MicroMsg.AppBrandPageNavigateBackSilentInterceptor", "scene:[" + str + "] intercept!!");
            C86812g gVar = (C86812g) t;
            z = true;
            switch (str.hashCode()) {
                case -1128437284:
                    if (str.equals("scene_actionbar_back")) {
                        C86923a.f252342i.mo121370a(gVar, 3);
                        break;
                    }
                    break;
                case 13653565:
                    if (str.equals("scene_back_key_pressed")) {
                        C86923a.f252342i.mo121370a(gVar, 2);
                        break;
                    }
                    break;
                case 298295391:
                    if (str.equals("scene_swipe_back")) {
                        C86923a.f252342i.mo121370a(gVar, 1);
                        break;
                    }
                    break;
                case 560038708:
                    if (str.equals("scene_jsapi_navigate_back")) {
                        C86923a.f252342i.mo121370a(gVar, 4);
                        break;
                    }
                    break;
            }
        }
        return z;
    }

    public C90333e.C90334a priority() {
        return C90333e.C90334a.C90335a.f259316b;
    }
}
