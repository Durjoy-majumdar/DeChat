package ly0;

import android.content.Context;
import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.network.C40383o0;
import com.tencent.p014mm.network.C81038d0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import ea3.C45596j;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import js0.C46574u;
import my0.C47138a;
import my0.C47139b;
import my0.C47141d;
import my0.C47142e;
import n83.C47207a;
import n83.C47209c;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C26236u;
import z04.C112551y;

/* renamed from: ly0.b */
public final class C46908b implements C47138a<C81038d0> {

    /* renamed from: a */
    public static final C46908b f126125a = new C46908b();

    /* renamed from: ly0.b$a */
    public static final class C46909a implements C47207a {

        /* renamed from: a */
        public HashMap<String, List<String>> f126126a = new HashMap<>();

        /* renamed from: b */
        public final /* synthetic */ C47141d f126127b;

        /* renamed from: c */
        public final /* synthetic */ C47139b<C81038d0> f126128c;

        /* renamed from: d */
        public final /* synthetic */ long f126129d;

        /* renamed from: e */
        public final /* synthetic */ String f126130e;

        /* renamed from: f */
        public final /* synthetic */ String f126131f;

        /* renamed from: g */
        public final /* synthetic */ String f126132g;

        public C46909a(C47141d dVar, C47139b<C81038d0> bVar, long j, String str, String str2, String str3) {
            this.f126127b = dVar;
            this.f126128c = bVar;
            this.f126129d = j;
            this.f126130e = str;
            this.f126131f = str2;
            this.f126132g = str3;
        }

        /* renamed from: a */
        public int mo72114a(C81038d0 d0Var, CronetLogic.ResponseHeader responseHeader, int i, String str) {
            C87412m.m108594g(d0Var, "connection");
            Log.m105924i("MicroMsg.WebPrefetcherHttpDownloader", "downloadUrl onCronetReceiveHeader statusCode: " + i + ", session: " + this.f126129d);
            if ((i == 200 || i == 304 || i == 301 || i == 302) && this.f126126a.isEmpty()) {
                mo72117d(d0Var, i, this.f126126a);
            }
            if (this.f126128c.mo63626a(d0Var, i, this.f126126a)) {
                return 0;
            }
            this.f126128c.mo63627b(d0Var, new C47142e(this.f126132g, false, this.f126126a));
            return -99;
        }

        /* renamed from: b */
        public void mo72115b(C81038d0 d0Var) {
            C87412m.m108594g(d0Var, "connection");
            if (this.f126127b.f126657b.mo119967g()) {
                if (!C112551y.m153811k(this.f126127b.f126660e)) {
                    d0Var.mo112921e("x-wx-if-none-match", this.f126127b.f126660e);
                }
                if (!C112551y.m153811k(this.f126127b.f126659d)) {
                    d0Var.mo112921e("if-none-match", this.f126127b.f126659d);
                }
            }
            Context context = MMApplicationContext.getContext();
            String a = C45596j.f123315f.mo71117a();
            C40717k0.f109363a.getClass();
            d0Var.mo112921e("User-Agent", C46574u.m51897a(context, a, (C45596j) ((C36570n) C40717k0.f109367e).getValue()));
            d0Var.f238050f = 10000;
            d0Var.f238049e = 3000;
            this.f126128c.mo63628c(d0Var);
        }

        /* renamed from: c */
        public void mo72116c(C81038d0 d0Var, String str, CronetLogic.CronetTaskResult cronetTaskResult, String str2) {
            C87412m.m108594g(d0Var, "connection");
            Object[] objArr = new Object[2];
            boolean z = false;
            objArr[0] = cronetTaskResult != null ? Integer.valueOf(cronetTaskResult.statusCode) : null;
            objArr[1] = Long.valueOf(this.f126129d);
            Log.m105925i("MicroMsg.WebPrefetcherHttpDownloader", "downloadUrl onCronetTaskCompleted statusCode: %s, session: %s", objArr);
            if (cronetTaskResult != null) {
                String str3 = this.f126130e;
                String str4 = this.f126131f;
                String str5 = this.f126132g;
                C47139b<C81038d0> bVar = this.f126128c;
                int i = cronetTaskResult.statusCode;
                if (i != 200) {
                    if (i == 301 || i == 302) {
                        if (this.f126126a.isEmpty()) {
                            mo72117d(d0Var, cronetTaskResult.statusCode, this.f126126a);
                        }
                        bVar.mo63626a(d0Var, cronetTaskResult.statusCode, this.f126126a);
                    }
                } else if (C86013q1.m106463x(str3, str4)) {
                    Log.m105924i("MicroMsg.WebPrefetcherHttpDownloader", "downloadUrl save file success:" + str5 + " to " + str4);
                } else {
                    Log.m105920e("MicroMsg.WebPrefetcherHttpDownloader", "downloadUrl save file failed:" + str5 + " to " + str3);
                }
            }
            C86009m1 m1Var = new C86009m1(this.f126130e);
            if (m1Var.mo119967g()) {
                m1Var.mo119966f();
            }
            boolean k = C86013q1.m106450k(this.f126131f);
            C47142e eVar = new C47142e(this.f126132g, k, this.f126126a);
            String str6 = this.f126131f;
            if (k) {
                if (str6 == null || str6.length() == 0) {
                    z = true;
                }
                if (!z) {
                    eVar.f126663c = new C86009m1(str6);
                }
            }
            this.f126128c.mo63627b(d0Var, eVar);
        }

        /* renamed from: d */
        public final void mo72117d(C81038d0 d0Var, int i, HashMap<String, List<String>> hashMap) {
            synchronized (d0Var) {
                Map<String, List<String>> map = d0Var.f238061q;
                C87412m.m108593f(map, "connection.headerFields");
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    List list = (List) next.getValue();
                    if (!C87412m.m108589b(str, "status")) {
                        C87412m.m108593f(str, "key");
                        Locale locale = Locale.getDefault();
                        C87412m.m108593f(locale, "getDefault()");
                        String lowerCase = str.toLowerCase(locale);
                        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        C87412m.m108593f(list, "value");
                        hashMap.put(lowerCase, list);
                    }
                }
                if (i == 304) {
                    hashMap.put("status", C26236u.m33719b("200"));
                } else {
                    hashMap.put("status", C26236u.m33719b(String.valueOf(i)));
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: a */
    public void mo72113a(C47141d dVar, C47139b<C81038d0> bVar) {
        C87412m.m108594g(dVar, "downloadRequest");
        C87412m.m108594g(bVar, "downloadListener");
        long currentTimeMillis = System.currentTimeMillis();
        String str = dVar.f126656a;
        String i = C86013q1.m106448i(dVar.f126657b.mo119976n(), true);
        String str2 = i + ".fd";
        Log.m105925i("MicroMsg.WebPrefetcherHttpDownloader", "downloadUrl session: %s, url: %s, savedPath: %s, downloadRequest: %s", Long.valueOf(currentTimeMillis), dVar.f126656a, i, dVar);
        C46909a aVar = new C46909a(dVar, bVar, currentTimeMillis, str2, i, str);
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, "savedPath");
        Log.m105927v("MicroMsg.MMHttpDownloader", "downloadUrl targetPath: " + str2 + ", url: %s", str);
        C40383o0.m43567a(new C81038d0(str, 0), (Object) null, new C47209c(str2, aVar));
    }
}
