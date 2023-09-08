package cn0;

import an0.C79592a;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.URLUtil;
import bn0.C79714a;
import bn0.C79716b;
import bn0.C79718c;
import cn0.C80075b;
import dn0.C86360d;
import dn0.C86375p;
import fn0.C86998c;
import fn0.C87001f;
import fn0.C87002g;

/* renamed from: cn0.i */
public class C80083i {

    /* renamed from: a */
    public C79714a f234532a;

    /* renamed from: b */
    public C80087k f234533b;

    /* renamed from: c */
    public C80085j f234534c;

    /* renamed from: d */
    public C79716b f234535d;

    /* renamed from: e */
    public C86375p f234536e;

    /* renamed from: f */
    public C80075b f234537f;

    /* renamed from: cn0.i$a */
    public class C80084a implements C79718c.C79719a {
        public C80084a(C80083i iVar) {
        }

        /* renamed from: a */
        public void mo110333a(String str, long j, long j2, long j3) {
            C87002g.m108023q(3, "DataSourceBuilder", String.format("onHttpUpstreamServerCost, videoUuid:%s, httpDnsCost:%s, httpConnectCost:%s, httpFirstRecvCost:%s", new Object[]{str, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}), (Throwable) null);
            if (C79592a.m96648a().f233411n != null) {
                C79592a.m96648a().f233411n.getClass();
            }
        }
    }

    public C80083i(C79714a aVar, C86360d dVar, C86375p pVar) {
        if (this.f234537f == null) {
            this.f234537f = new C80082h((Handler) null, (C80075b.C80076a) null);
        }
        this.f234534c = new C80099n("com.tencent.mm.video", new C87001f(), this.f234537f, dVar, new C86998c(pVar.f251145p, pVar.mo120776f()), pVar);
        this.f234533b = new C80087k();
        this.f234532a = aVar;
        if (aVar != null) {
            this.f234535d = new C79716b(aVar, C79592a.m96648a().f233408k);
        }
        this.f234536e = pVar;
    }

    /* renamed from: a */
    public C80079e mo110332a(String str, String str2) {
        this.f234534c.f234560u = str2;
        C79716b bVar = this.f234535d;
        if (bVar != null) {
            bVar.f233632k = str2;
        }
        this.f234533b.getClass();
        boolean z = true;
        boolean z2 = !URLUtil.isNetworkUrl(str);
        int i = C87002g.f252486a;
        boolean z3 = !TextUtils.isEmpty(str) && str.startsWith("file:///android_asset");
        if (TextUtils.isEmpty(str) || !str.startsWith("android.resource://")) {
            z = false;
        }
        if (z3) {
            C80073a aVar = new C80073a(C79592a.m96648a().f233398a);
            C87002g.m108023q(4, str2 + "DataSourceBuilder", "play asset file, dataSource:" + aVar, (Throwable) null);
            return aVar;
        } else if (z) {
            C80100o oVar = new C80100o(C79592a.m96648a().f233398a);
            C87002g.m108023q(4, str2 + "DataSourceBuilder", "play raw file, dataSource:" + oVar, (Throwable) null);
            return oVar;
        } else if (z2) {
            C80087k kVar = this.f234533b;
            C87002g.m108023q(4, str2 + "DataSourceBuilder", "play local file, dataSource:" + kVar, (Throwable) null);
            return kVar;
        } else if (this.f234532a == null || !C79592a.m96648a().f233401d) {
            C80085j jVar = this.f234534c;
            C87002g.m108023q(5, str2 + "DataSourceBuilder", "cache disabled, dataSource:" + jVar, (Throwable) null);
            return jVar;
        } else {
            C79718c cVar = new C79718c(this.f234532a, this.f234534c, this.f234533b, this.f234536e.f251141l ? this.f234535d : null, false, true, new C80084a(this));
            cVar.f233656x = str2;
            C87002g.m108023q(4, str2 + "DataSourceBuilder", "cache enabled, dataSource:" + cVar, (Throwable) null);
            return cVar;
        }
    }
}
