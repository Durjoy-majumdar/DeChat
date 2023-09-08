package rl0;

import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import fy3.C32224a;
import gy3.C87412m;
import js0.C88021l;
import p235sm.C64053t0;
import p329d3.C86165a;
import sx3.C110823p;

@C86522b
/* renamed from: rl0.h */
public final class C90006h extends C86301e implements C64053t0 {

    /* renamed from: rl0.h$a */
    public static final class C13013a {

        /* renamed from: a */
        public static final C13013a f37072a = new C13013a();

        /* renamed from: b */
        public static final C88021l<String, C64053t0.C13730a> f37073b = new C88021l<>();

        /* renamed from: rl0.h$a$a */
        public static final class C13014a<T> implements C86165a {

            /* renamed from: a */
            public final /* synthetic */ String f37074a;

            /* renamed from: b */
            public final /* synthetic */ String f37075b;

            public C13014a(String str, String str2) {
                this.f37074a = str;
                this.f37075b = str2;
            }

            public void accept(Object obj) {
                ((C64053t0.C13730a) obj).mo5696a(this.f37074a, this.f37075b);
            }
        }

        /* renamed from: a */
        public final void mo12525a(String str, String str2) {
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(str2, "data");
            Log.m105924i("MicroMsg.WxaToNativeCallbacksRegistry", "appId:" + str + ", data:" + str2);
            f37073b.mo122461b(str, new C13014a(str, str2));
        }
    }

    /* renamed from: Bz */
    public void mo88810Bz(String str, C64053t0.C13730a aVar) {
        if (!(str == null || str.length() == 0) && aVar != null) {
            C13013a aVar2 = C13013a.f37072a;
            C13013a.f37073b.mo122464e(str, aVar);
        }
    }

    /* renamed from: EW */
    public void mo88811EW(String str, String str2) {
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                if (!(str2 == null || str2.length() == 0)) {
                    if (str == null || str.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        Log.m105924i("MicroMsg.NativeToWxa", "onNativePostData, appId:" + str + ", data:" + str2);
                        AppBrandProcessesManager a = AppBrandProcessesManager.f246131g.mo116962a();
                        C90005f fVar = new C90005f(str, str2);
                        C87412m.m108594g(str, "appId");
                        C80264l lVar = (C80264l) C110823p.m150978D(a.mo111394i(str, -1));
                        if (lVar != null) {
                            C80250c.m97639p(a.mo111389d(lVar), (LuggageClientProcessMessage) fVar.invoke(lVar), (C32224a) null, 2, (Object) null);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: eW */
    public void mo88812eW(String str, C64053t0.C13730a aVar) {
        if (!(str == null || str.length() == 0) && aVar != null) {
            C13013a aVar2 = C13013a.f37072a;
            C13013a.f37073b.mo122465f(str, aVar);
        }
    }
}
