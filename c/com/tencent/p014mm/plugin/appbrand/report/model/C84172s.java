package com.tencent.p014mm.plugin.appbrand.report.model;

import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83112l;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.C84241t;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.LinkedList;
import java.util.Set;
import js0.C88024r;
import p1044ub.C90630c;
import p206nj.C117627q;
import p963fc.C86812g;
import xn0.C91304m;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.s */
public final class C84172s {

    /* renamed from: A */
    public static final C84172s f245783A = new C84172s(true);

    /* renamed from: a */
    public final boolean f245784a;

    /* renamed from: b */
    public String f245785b = "";

    /* renamed from: c */
    public final LinkedList<String> f245786c = new LinkedList<>();

    /* renamed from: d */
    public boolean f245787d = false;

    /* renamed from: e */
    public int f245788e;

    /* renamed from: f */
    public String f245789f;

    /* renamed from: g */
    public String f245790g;

    /* renamed from: h */
    public String f245791h;

    /* renamed from: i */
    public C86812g f245792i;

    /* renamed from: j */
    public int f245793j;

    /* renamed from: k */
    public int f245794k;

    /* renamed from: l */
    public int f245795l;

    /* renamed from: m */
    public String f245796m;

    /* renamed from: n */
    public String f245797n;

    /* renamed from: o */
    public String f245798o;

    /* renamed from: p */
    public String f245799p;

    /* renamed from: q */
    public int f245800q;

    /* renamed from: r */
    public String f245801r;

    /* renamed from: s */
    public long f245802s;

    /* renamed from: t */
    public int f245803t;

    /* renamed from: u */
    public int f245804u;

    /* renamed from: v */
    public String f245805v;

    /* renamed from: w */
    public int f245806w;

    /* renamed from: x */
    public String f245807x;

    /* renamed from: y */
    public int f245808y;

    /* renamed from: z */
    public boolean f245809z = true;

    public C84172s(boolean z) {
        this.f245784a = z;
    }

    /* renamed from: a */
    public void mo116847a(C90630c cVar, boolean z) {
        this.f245800q = z ? 1 : 7;
        String pollFirst = this.f245786c.pollFirst();
        this.f245801r = pollFirst;
        this.f245799p = pollFirst;
        if (!z) {
            this.f245801r = this.f245785b;
        }
        mo116848b(cVar);
    }

    /* renamed from: b */
    public final void mo116848b(C90630c cVar) {
        C83112l A1 = cVar.mo116520A1();
        if (A1 != null) {
            AppBrandSysConfigLU o1 = cVar.getRuntime().mo113051d0();
            if (o1 != null) {
                this.f245793j = o1.f261072r.pkgVersion;
            }
            ICommLibReader k = cVar.mo114272k();
            if (k != null) {
                this.f245803t = k.mo113371a();
            }
            this.f245802s = System.currentTimeMillis();
            String url = ((C91304m) A1).getUrl();
            if (url == null) {
                url = "";
            }
            this.f245797n = C117627q.m165908a(url);
            this.f245796m = cVar.mo116162Q0();
            this.f245807x = cVar.mo116163R0();
            this.f245798o = C84116i0.m103659b(MMApplicationContext.getContext());
            this.f245806w = this.f245809z ? 1 : 0;
            this.f245809z = false;
            C86812g B1 = cVar.getRuntime();
            AppBrandInitConfigLU l1 = B1 == null ? null : B1.mo113036W();
            if (l1 != null) {
                this.f245808y = l1.f234841u;
            } else {
                int b = C84241t.m103848b(this.f245791h);
                this.f245808y = b;
                Log.m105925i("MicroMsg.AppBrand.Report.kv_14992", "prepareCommonFields null = initConfig! apptype:%s", Integer.valueOf(b));
            }
            this.f245808y += 1000;
            if (!this.f245784a) {
                Log.m105924i("MicroMsg.AppBrand.Report.kv_14992", "report " + toString());
                C84171r rVar = new C84171r(this, new Object[]{Integer.valueOf(this.f245788e), this.f245789f, this.f245790g, this.f245791h, Integer.valueOf(this.f245793j), Integer.valueOf(this.f245794k), Integer.valueOf(this.f245795l), this.f245796m, this.f245797n, this.f245798o, this.f245799p, Integer.valueOf(this.f245800q), this.f245801r, Long.valueOf(this.f245802s), Integer.valueOf(this.f245803t), Integer.valueOf(this.f245804u), this.f245805v, Integer.valueOf(this.f245806w), this.f245807x, Integer.valueOf(this.f245808y)});
                if (this.f245787d) {
                    rVar.run();
                    return;
                }
                Set<Object> set = C84737f0.f247137a;
                C88024r.m109571a().postToWorker(rVar);
            }
        }
    }

    public String toString() {
        return "kv_14992{scene=" + this.f245788e + ", sceneNote='" + this.f245789f + '\'' + ", sessionId='" + this.f245790g + '\'' + ", appId='" + this.f245791h + '\'' + ", appVersion=" + this.f245793j + ", appState=" + this.f245794k + ", usedState=" + this.f245795l + ", pagePath='" + this.f245796m + '\'' + ", currentUrl='" + this.f245797n + '\'' + ", networkType='" + this.f245798o + '\'' + ", referPagePath='" + this.f245799p + '\'' + ", targetAction=" + this.f245800q + ", targetPagePath='" + this.f245801r + '\'' + ", clickTimestamp=" + this.f245802s + ", publicLibVersion=" + this.f245803t + ", preScene=" + this.f245804u + ", preSceneNote='" + this.f245805v + '\'' + ", isEntrance=" + this.f245806w + ", apptype=" + this.f245808y + '}';
    }
}
