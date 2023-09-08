package p1066yc;

import c30.C104289g;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.pip.C84021a;
import com.tencent.p014mm.plugin.appbrand.pip.C84034d;
import com.tencent.p014mm.plugin.appbrand.pip.C84048m;
import com.tencent.p014mm.plugin.appbrand.pip.C84059t;
import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86920e;
import fl0.C86921f;
import hm0.C87554b;
import hm0.C87556c;
import hm0.C87560g;
import hm0.C87562h;
import hm0.C87564i;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p1066yc.C91406f;
import p830xc.C91165a;

/* renamed from: yc.d */
public abstract class C91400d<PipInfoProvider extends C91406f> {
    /* renamed from: f */
    public static C83780d1 m114679f(C91165a aVar) {
        C82381f g = aVar.mo62544g();
        if (g instanceof C83780d1) {
            return (C83780d1) g;
        }
        Log.m105929w("MicroMsg.AppBrand.PipPluginHandlerCommons", "getPageView, component(%s) is not AppBrandPageView", g);
        if (g instanceof C81925i2) {
            return ((C81925i2) g).mo114341l0();
        }
        Log.m105929w("MicroMsg.AppBrand.PipPluginHandlerCommons", "getPageView, component(%s) is not AppBrandService", g);
        return null;
    }

    /* renamed from: a */
    public boolean mo125355a(C91165a aVar) {
        C83780d1 f;
        C84059t h;
        Log.m105924i(mo109539e(), "amIPipPlayer");
        if (aVar == null || (f = m114679f(aVar)) == null || (h = mo125357h(f)) == null) {
            return false;
        }
        return Objects.equals(h.f245426l, mo109538d());
    }

    /* renamed from: b */
    public void mo125356b(C91165a aVar) {
        Log.m105924i(mo109539e(), "exitPip");
        C83780d1 f = m114679f(aVar);
        if (f == null) {
            aVar.mo62551l(C86920e.f252314d);
            return;
        }
        C84059t h = mo125357h(f);
        if (h == null) {
            aVar.mo62551l(C86920e.f252314d);
            return;
        }
        int ordinal = h.mo116711h(mo109537c()).ordinal();
        if (ordinal == 1) {
            aVar.mo62551l(C86921f.f252335i);
        } else if (ordinal != 2) {
            aVar.mo62551l(C86920e.f252311a);
        } else {
            aVar.mo62551l(C86921f.f252334h);
        }
    }

    /* renamed from: c */
    public abstract int mo109537c();

    /* renamed from: d */
    public abstract String mo109538d();

    /* renamed from: e */
    public abstract String mo109539e();

    /* renamed from: g */
    public abstract PipInfoProvider mo109540g();

    /* renamed from: h */
    public final C84059t mo125357h(C83780d1 d1Var) {
        AppBrandRuntime runtime = d1Var.getRuntime();
        if (runtime == null) {
            Log.m105928w(mo109539e(), "handlePipInfo, null == runtime");
            return null;
        }
        C84059t tVar = runtime.f238119Q0;
        if (tVar != null) {
            return tVar;
        }
        Log.m105928w(mo109539e(), "handlePipInfo, null == pipManager");
        return null;
    }

    /* renamed from: i */
    public abstract C87564i.C87566b mo109541i();

    /* renamed from: j */
    public void mo125358j(C91165a aVar, String str) {
        C87554b.C87555a aVar2;
        C87554b.C87555a aVar3 = C87554b.C87555a.NONE;
        Log.m105924i(mo109539e(), "handlePipInfo");
        C83780d1 f = m114679f(aVar);
        if (f == null) {
            Log.m105928w(mo109539e(), "handlePipInfo, null == pageView");
            return;
        }
        C83820i0 i0Var = f.f244572U;
        if (i0Var == null) {
            Log.m105928w(mo109539e(), "handlePipInfo, null == page");
            return;
        }
        C84059t h = mo125357h(f);
        if (h == null) {
            Log.m105928w(mo109539e(), "handlePipInfo, null == pipManager");
            return;
        }
        if (((C84021a) ((ConcurrentHashMap) h.f245421g).get(Integer.valueOf(f.hashCode()))) == null) {
            C84021a aVar4 = new C84021a(f);
            if (h.f245430p == null) {
                h.f245430p = new C84048m(h);
            }
            aVar4.f245294d = h.f245430p;
            Log.m105924i(h.f245415a, "createPageScopedPipInfoIfNeed for " + C84059t.m103576j(f.f244572U));
            ((ConcurrentHashMap) h.f245421g).put(Integer.valueOf(f.hashCode()), aVar4);
        }
        JSONObject b = aVar.mo62539b();
        if (b == null) {
            Log.m105928w(mo109539e(), "handlePipInfo, null == dataJsonObj");
            return;
        }
        C91406f g = mo109540g();
        String jSONObject = b.toString();
        g.getClass();
        C91402e eVar = null;
        boolean z = true;
        boolean z2 = false;
        try {
            C104289g gVar = new C104289g(jSONObject);
            String optString = gVar.optString("pictureInPictureMode", (String) null);
            if (optString != null) {
                String trim = optString.trim();
                trim.getClass();
                char c = 65535;
                switch (trim.hashCode()) {
                    case 0:
                        if (trim.equals("")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 111185:
                        if (trim.equals("pop")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3452698:
                        if (trim.equals("push")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1077886132:
                        if (trim.equals("pushAndPop")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        aVar2 = aVar3;
                        break;
                    case 1:
                        aVar2 = C87554b.C87555a.POP;
                        break;
                    case 2:
                        aVar2 = C87554b.C87555a.PUSH;
                        break;
                    case 3:
                        aVar2 = C87554b.C87555a.PUSH_AND_POP;
                        break;
                }
            }
            aVar2 = null;
            eVar = new C91402e(g, aVar2, gVar.has("pictureInPictureShowProgress") ? Boolean.valueOf(gVar.optBoolean("pictureInPictureShowProgress", false)) : null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.AbsXWebPipInfoProvider#" + g.f262119a.f253971d, e, "getPipExtra fail", new Object[0]);
        }
        if (eVar == null) {
            Log.m105928w(mo109539e(), "handlePipInfo, null == pipExtra");
            return;
        }
        C84034d dVar = new C84034d(h.f245417c.f238147j, i0Var.getCurrentUrl(), str);
        String d = mo109538d();
        int c2 = mo109537c();
        C87560g b2 = g.mo109560b();
        C87562h.C87563a a = g.mo109559a();
        C87556c c3 = g.mo109561c();
        C84021a i = h.mo116712i(f.hashCode());
        if (i != null) {
            Log.m105918d(i.f245291a, "processPipInfo, key: " + d);
            C84021a.C84024c cVar = (C84021a.C84024c) ((ConcurrentHashMap) i.f245299i).get(d);
            if (cVar == null) {
                Log.m105924i(i.f245291a, "processPipInfo, create PipVideoSession for key: " + d);
                ((ConcurrentHashMap) i.f245299i).put(d, new C84021a.C84024c(c2, eVar, b2, a, c3, dVar, i.f245294d));
            } else {
                Log.m105924i(i.f245291a, "processPipInfo, pipVideoSession for key: " + d + " exists");
                C87554b.C87555a aVar5 = eVar.f262109a;
                if (aVar5 != null) {
                    cVar.f245303b = aVar5;
                }
                Boolean bool = eVar.f262110b;
                if (bool != null) {
                    cVar.f245304c = bool.booleanValue();
                }
                cVar.f245309h = dVar;
            }
            C87554b.C87555a aVar6 = eVar.f262109a;
            if (aVar6 != null) {
                if (aVar3 == aVar6) {
                    z = false;
                }
                z2 = z;
            }
            if (z2 && b2.isPlaying()) {
                i.mo116676a(b2.mo110195h().getType(), d);
            }
        }
    }

    /* renamed from: k */
    public void mo125359k(C91165a aVar) {
        C84059t h;
        Log.m105924i(mo109539e(), "removePipId");
        C83780d1 f = m114679f(aVar);
        if (f != null && (h = mo125357h(f)) != null) {
            C87564i.C87566b i = mo109541i();
            String d = mo109538d();
            h.getClass();
            C84021a i2 = h.mo116712i(f.hashCode());
            if (i2 != null) {
                i2.mo116678c(i, d);
            }
        }
    }
}
