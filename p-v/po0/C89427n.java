package po0;

import android.graphics.Point;
import android.view.Surface;
import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82731k;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82732k0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.pip.C84048m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import hm0.C87560g;
import hm0.C87564i;
import in0.C87760d;
import in0.C87761e;
import in0.d$$d;
import in0.d$$j;
import in0.d$$k;
import org.json.JSONException;
import org.json.JSONObject;
import p1066yc.C91399c0;
import p1066yc.C91400d;
import p830xc.C91165a;
import p964fd.C86817b;
import p964fd.C86826e;
import p964fd.C86840q;
import p964fd.C86841r;
import p964fd.e$$b;
import p964fd.e$$t;
import p975hd.C87480d;

/* renamed from: po0.n */
public final class C89427n implements C87560g {

    /* renamed from: a */
    public final C86826e f257465a;

    /* renamed from: b */
    public C89431d f257466b = new C89431d((C89428a) null);

    /* renamed from: po0.n$a */
    public class C89428a implements C86817b {
        public C89428a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
            r5 = r1.f245397a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo123757a(int r5, int r6) {
            /*
                r4 = this;
                po0.n r0 = po0.C89427n.this
                po0.n$d r0 = r0.f257466b
                hm0.i$a r1 = r0.f257472b
                if (r1 == 0) goto L_0x0065
                float r2 = (float) r5
                r3 = 1120403456(0x42c80000, float:100.0)
                float r2 = r2 * r3
                float r3 = (float) r6
                float r2 = r2 / r3
                int r6 = r6 - r5
                r5 = 1120272384(0x42c60000, float:99.0)
                int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r5 < 0) goto L_0x003c
                r5 = 1000(0x3e8, float:1.401E-42)
                if (r6 > r5) goto L_0x003c
                com.tencent.mm.plugin.appbrand.pip.m r1 = (com.tencent.p014mm.plugin.appbrand.pip.C84048m) r1
                r1.getClass()
                java.lang.String r5 = r0.getKey()
                com.tencent.mm.plugin.appbrand.pip.t r6 = r1.f245397a
                java.lang.String r6 = r6.f245415a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onPlayEndSoon, key: "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r5)
                goto L_0x0065
            L_0x003c:
                com.tencent.mm.plugin.appbrand.pip.m r1 = (com.tencent.p014mm.plugin.appbrand.pip.C84048m) r1
                r1.getClass()
                java.lang.String r5 = r0.getKey()
                com.tencent.mm.plugin.appbrand.pip.t r6 = r1.f245397a
                java.lang.String r6 = r6.f245426l
                if (r6 == 0) goto L_0x0065
                boolean r5 = r6.equals(r5)
                if (r5 == 0) goto L_0x0065
                com.tencent.mm.plugin.appbrand.pip.t r5 = r1.f245397a
                com.tencent.mm.plugin.appbrand.pip.a$c r6 = r5.f245429o
                if (r6 == 0) goto L_0x0065
                com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView r5 = r5.f245419e
                if (r5 == 0) goto L_0x0065
                boolean r6 = r6.f245304c
                com.tencent.mm.plugin.appbrand.pip.n r0 = new com.tencent.mm.plugin.appbrand.pip.n
                r0.<init>(r1, r6, r2)
                r5.post(r0)
            L_0x0065:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: po0.C89427n.C89428a.mo123757a(int, int):void");
        }
    }

    /* renamed from: po0.n$b */
    public class C89429b implements C91399c0 {
        public C89429b() {
        }

        /* renamed from: a */
        public void mo110184a() {
            C89431d dVar = C89427n.this.f257466b;
            C87564i.C87565a aVar = dVar.f257472b;
            if (aVar != null) {
                ((C84048m) aVar).mo116693a(dVar);
            }
        }

        /* renamed from: c */
        public void mo110186c(boolean z) {
            C89431d dVar = C89427n.this.f257466b;
            C87564i.C87565a aVar = dVar.f257472b;
            if (aVar != null) {
                ((C84048m) aVar).mo116697e(dVar, z);
            }
        }

        /* renamed from: e */
        public void mo110188e() {
            if (C89427n.this.f257466b.f257472b != null) {
                Log.m105924i("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "onLoading from XWebOnPlayListener");
                C89431d dVar = C89427n.this.f257466b;
                ((C84048m) dVar.f257472b).mo116695c(dVar);
            }
        }

        /* renamed from: f */
        public void mo110189f() {
            if (C89427n.this.f257466b.f257472b != null) {
                Log.m105924i("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "onLoadEnd from XWebOnPlayListener");
                C89431d dVar = C89427n.this.f257466b;
                ((C84048m) dVar.f257472b).mo116694b(dVar);
            }
        }

        /* renamed from: j */
        public void mo110198j() {
            C89431d dVar = C89427n.this.f257466b;
            C87564i.C87565a aVar = dVar.f257472b;
            if (aVar != null) {
                ((C84048m) aVar).mo116698f(dVar);
            }
        }

        public void onPause() {
            C89431d dVar = C89427n.this.f257466b;
            C87564i.C87565a aVar = dVar.f257472b;
            if (aVar != null) {
                ((C84048m) aVar).mo116696d(dVar);
            }
        }

        public void onStop() {
            C89431d dVar = C89427n.this.f257466b;
            C87564i.C87565a aVar = dVar.f257472b;
            if (aVar != null) {
                ((C84048m) aVar).mo116699g(dVar);
            }
        }
    }

    /* renamed from: po0.n$c */
    public class C89430c implements ValueCallback<String> {

        /* renamed from: a */
        public final /* synthetic */ C87560g.C87561a f257469a;

        public C89430c(C87560g.C87561a aVar) {
            this.f257469a = aVar;
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            Log.m105924i("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "getVideoPositionAsync, value: " + str);
            try {
                C89427n.this.f257465a.mo121282Q(new JSONObject(str));
                this.f257469a.mo116681a(C89427n.this.f257465a.mo121292z(), C89427n.this.f257465a.mo121266A());
            } catch (JSONException unused) {
                Log.m105928w("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "getVideoPositionAsync, parse " + str + " failed");
                this.f257469a.mo116681a(C89427n.this.f257465a.mo121292z(), C89427n.this.f257465a.mo121266A());
            }
        }
    }

    /* renamed from: po0.n$d */
    public class C89431d implements C87564i {

        /* renamed from: a */
        public final String f257471a = ("MicroMsg.AppBrand.XWebVideoVideoController#" + hashCode());

        /* renamed from: b */
        public C87564i.C87565a f257472b = null;

        /* renamed from: c */
        public volatile boolean f257473c = false;

        /* renamed from: d */
        public d$$j f257474d = new C89432a();

        /* renamed from: e */
        public d$$k f257475e = new C89433b();

        /* renamed from: f */
        public d$$d f257476f = new C89434c();

        /* renamed from: po0.n$d$a */
        public class C89432a implements d$$j {
            public C89432a() {
            }

            /* renamed from: a */
            public void mo17986a(C87760d dVar) {
                C89431d.this.f257473c = true;
                C89431d dVar2 = C89431d.this;
                if (dVar2.f257472b != null) {
                    Log.m105924i(dVar2.f257471a, "onLoadEnd from OnPreparedListener");
                    C89431d dVar3 = C89431d.this;
                    ((C84048m) dVar3.f257472b).mo116694b(dVar3);
                }
            }
        }

        /* renamed from: po0.n$d$b */
        public class C89433b implements d$$k {
            public C89433b() {
            }

            /* renamed from: a */
            public void mo17988a(C87760d dVar) {
                C89431d dVar2 = C89431d.this;
                if (dVar2.f257472b != null) {
                    Log.m105924i(dVar2.f257471a, "onLoadEnd from OnSeekCompleteListener");
                    C89431d dVar3 = C89431d.this;
                    ((C84048m) dVar3.f257472b).mo116694b(dVar3);
                    C89431d dVar4 = C89431d.this;
                    ((C84048m) dVar4.f257472b).mo116697e(dVar4, false);
                }
            }
        }

        /* renamed from: po0.n$d$c */
        public class C89434c implements d$$d {
            public C89434c() {
            }

            /* renamed from: a */
            public void mo17987a(C87760d dVar) {
                C89431d dVar2 = C89431d.this;
                C87564i.C87565a aVar = dVar2.f257472b;
                if (aVar != null) {
                    ((C84048m) aVar).mo116698f(dVar2);
                }
            }
        }

        /* renamed from: po0.n$d$d */
        public class C89435d implements e$$t {
            public C89435d() {
            }

            /* renamed from: a */
            public void mo123759a(boolean z) {
                C89431d dVar = C89431d.this;
                C87760d dVar2 = C89427n.this.f257465a.f252033h;
                C87761e eVar = !(dVar2 instanceof C87761e) ? null : (C87761e) dVar2;
                if (eVar != null) {
                    dVar.f257473c = z;
                    eVar.mo32887j(C89431d.this.f257474d);
                    eVar.mo32886f(C89431d.this.f257475e);
                    eVar.mo32888k(C89431d.this.f257476f);
                }
            }
        }

        public C89431d(C89428a aVar) {
            C86826e eVar = C89427n.this.f257465a;
            C89435d dVar = new C89435d();
            eVar.f252026b1 = dVar;
            if (eVar.f252033h != null) {
                dVar.mo123759a(eVar.f251990A);
            }
        }

        /* renamed from: b */
        public Integer mo110185b() {
            C86826e eVar = C89427n.this.f257465a;
            C91165a aVar = eVar.f252049s;
            Integer num = null;
            if (aVar == null) {
                Log.m105928w(eVar.mo121291y(), "getOriginPageViewId, invokeContext is null");
            } else {
                C83780d1 f = C91400d.m114679f(aVar);
                if (f == null) {
                    Log.m105928w(eVar.mo121291y(), "getOriginPageViewId, pageView is null");
                } else {
                    num = Integer.valueOf(f.hashCode());
                }
            }
            Log.m105918d("MicroMsg.AppBrand.XWebVideoVideoController", "getOriginPageViewId, originPageViewId: " + num);
            return num;
        }

        /* renamed from: d */
        public void mo110187d(C87564i.C87565a aVar) {
            if (aVar != null) {
                if (!this.f257473c) {
                    Log.m105924i(this.f257471a, "onLoading from mPrepared");
                    ((C84048m) aVar).mo116695c(this);
                } else {
                    Log.m105924i(this.f257471a, "onLoadEnd from mPrepared");
                    ((C84048m) aVar).mo116694b(this);
                }
            }
            this.f257472b = aVar;
        }

        public String getKey() {
            return C89427n.this.f257465a.mo121290x();
        }

        public C87564i.C87566b getType() {
            return C87564i.C87566b.Video;
        }

        public int getVideoHeight() {
            C87760d dVar = C89427n.this.f257465a.f252033h;
            C87761e eVar = !(dVar instanceof C87761e) ? null : (C87761e) dVar;
            if (eVar == null) {
                return 0;
            }
            return eVar.getVideoHeight();
        }

        public int getVideoWidth() {
            C87760d dVar = C89427n.this.f257465a.f252033h;
            C87761e eVar = !(dVar instanceof C87761e) ? null : (C87761e) dVar;
            if (eVar == null) {
                return 0;
            }
            return eVar.getVideoWidth();
        }

        /* renamed from: i */
        public boolean mo110196i() {
            return C89427n.this.f257465a.f252034h1;
        }

        /* renamed from: k */
        public C82732k0 mo110199k() {
            C82731k kVar = C82731k.f242051e;
            C86826e eVar = C89427n.this.f257465a;
            return kVar.mo115008RV(eVar.f252005Q, eVar.f252007R);
        }

        public void pause() {
            Log.m105918d(this.f257471a, "pause");
            C86826e eVar = C89427n.this.f257465a;
            eVar.getClass();
            eVar.mo121276K(new e$$b(eVar, false));
        }

        public void release() {
            Log.m105918d(this.f257471a, "release");
            C86826e eVar = C89427n.this.f257465a;
            eVar.getClass();
            eVar.mo121276K(new C86841r(eVar));
        }

        public void start() {
            Log.m105918d(this.f257471a, IXWebBroadcastListener.STAGE_START);
            C86826e eVar = C89427n.this.f257465a;
            eVar.getClass();
            eVar.mo121276K(new C86840q(eVar));
        }
    }

    public C89427n(C86826e eVar) {
        this.f257465a = eVar;
        C89428a aVar = new C89428a();
        eVar.f252027c1 = aVar;
        C87480d dVar = eVar.f252035i;
        if (dVar != null) {
            C89421g gVar = (C89421g) dVar;
            synchronized (gVar) {
                gVar.f257451h = aVar;
            }
        }
        C89429b bVar = new C89429b();
        eVar.f252028d1 = bVar;
        C87480d dVar2 = eVar.f252035i;
        if (dVar2 != null) {
            C89421g gVar2 = (C89421g) dVar2;
            synchronized (gVar2) {
                gVar2.f257452i = bVar;
            }
        }
    }

    /* renamed from: a */
    public boolean mo123755a() {
        return this.f257465a.f252038j1.get();
    }

    /* renamed from: b */
    public boolean mo123756b(Surface surface) {
        C86826e eVar = this.f257465a;
        if (eVar.f252033h != null) {
            if (!eVar.f252038j1.get()) {
                eVar.f252033h.setSurface(surface);
            } else {
                Log.m105924i(eVar.mo121291y(), "setSurface, JustPlayAudio");
            }
            if (eVar.f252031g == surface) {
                eVar.f252014U0 = null;
            } else {
                eVar.f252014U0 = surface;
            }
            String y = eVar.mo121291y();
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(eVar.f252014U0 != null);
            Log.m105925i(y, "setSurface, SurfacePipSet exist: %b", objArr);
            return true;
        }
        Log.m105928w(eVar.mo121291y(), "setSurface, MediaPlayer is null");
        return false;
    }

    /* renamed from: g */
    public Point mo110190g() {
        return new Point(this.f257465a.mo121292z(), this.f257465a.mo121266A());
    }

    /* renamed from: h */
    public C87564i mo110195h() {
        return this.f257466b;
    }

    public boolean isPlaying() {
        return this.f257465a.mo121268C();
    }

    /* renamed from: l */
    public int mo110200l() {
        C86826e eVar = this.f257465a;
        int i = (int) (eVar.f252029e1 * ((float) eVar.f251995F));
        String y = eVar.mo121291y();
        Log.m105918d(y, "getVideoContainerWidth, videoContainerWidth: " + i);
        return i;
    }

    /* renamed from: m */
    public int mo110201m() {
        C86826e eVar = this.f257465a;
        int i = (int) (eVar.f252030f1 * ((float) eVar.f251996G));
        String y = eVar.mo121291y();
        Log.m105918d(y, "getVideoContainerHeight, videoContainerHeight: " + i);
        return i;
    }

    /* renamed from: n */
    public void mo110202n(C83780d1 d1Var, C87560g.C87561a aVar) {
        C83165i jsRuntime = d1Var.getJsRuntime();
        if (jsRuntime == null) {
            Log.m105928w("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "getVideoPositionAsync, null == jsRuntime");
            aVar.mo116681a(this.f257465a.mo121292z(), this.f257465a.mo121266A());
            return;
        }
        String str = "document.querySelector('embed[embed-id=\"" + this.f257465a.f253971d + "\"]').getBoundingClientRect().toJSON()";
        Log.m105924i("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "getVideoPositionAsync, jsScript: " + str);
        jsRuntime.evaluateJavascript(str, new C89430c(aVar));
    }
}
