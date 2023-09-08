package ky0;

import com.tencent.p014mm.network.C81038d0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import jy0.C46579a;
import jy0.C46580b;
import ly0.C46908b;
import my0.C47140c;
import zt3.C119157j;

/* renamed from: ky0.b */
public final class C46796b extends C46795a {

    /* renamed from: a */
    public static final C46796b f125919a = new C46796b();

    /* renamed from: ky0.b$a */
    public static final class C46797a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C46580b f125920d;

        /* renamed from: e */
        public final /* synthetic */ C46579a f125921e;

        /* renamed from: ky0.b$a$a */
        public static final class C46798a extends C47140c<C81038d0> {

            /* renamed from: a */
            public final /* synthetic */ C46580b f125922a;

            /* renamed from: b */
            public final /* synthetic */ C46579a f125923b;

            public C46798a(C46580b bVar, C46579a aVar) {
                this.f125922a = bVar;
                this.f125923b = aVar;
            }

            /* renamed from: a */
            public boolean mo63626a(Object obj, int i, HashMap hashMap) {
                C87412m.m108594g((C81038d0) obj, "connection");
                C87412m.m108594g(hashMap, "headers");
                this.f125922a.f125480b.mo71770l().putAll(hashMap);
                C46796b bVar = C46796b.f125919a;
                C46580b bVar2 = this.f125922a;
                boolean c = bVar.mo72016c(bVar2.f125479a, bVar2.f125480b, bVar2.f125481c, i);
                this.f125923b.mo63641a(c, i, hashMap);
                return c;
            }

            /* renamed from: c */
            public void mo63628c(Object obj) {
                C81038d0 d0Var = (C81038d0) obj;
                C87412m.m108594g(d0Var, "connection");
                Map<String, String> map = this.f125922a.f125482d;
                if (map != null) {
                    for (Map.Entry next : map.entrySet()) {
                        if (((CharSequence) next.getKey()).length() > 0) {
                            Log.m105927v("MicroMsg.HttpContentFetcher", "fetchContent prefetchHeader key: %s, value: %s", next.getKey(), next.getValue());
                            d0Var.mo112921e((String) next.getKey(), (String) next.getValue());
                        }
                    }
                }
            }
        }

        public C46797a(C46580b bVar, C46579a aVar) {
            this.f125920d = bVar;
            this.f125921e = aVar;
        }

        public final void run() {
            C40717k0 k0Var = C40717k0.f109363a;
            C46580b bVar = this.f125920d;
            C46908b.f126125a.mo72113a(k0Var.mo63615c(bVar.f125479a, bVar.f125480b), new C46798a(this.f125920d, this.f125921e));
        }
    }

    /* renamed from: a */
    public boolean mo72017a(C46580b bVar) {
        C87412m.m108594g(bVar, "request");
        return true;
    }

    /* renamed from: b */
    public boolean mo72018b(C46580b bVar, C46579a aVar) {
        C87412m.m108594g(bVar, "request");
        C87412m.m108594g(aVar, "callback");
        ((C119157j) C119157j.f356862d).mo183875f(new C46797a(bVar, aVar));
        return true;
    }

    public String name() {
        return "MicroMsg.HttpContentFetcher";
    }
}
