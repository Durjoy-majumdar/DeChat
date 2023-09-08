package jo0;

import android.graphics.Point;
import android.view.Surface;
import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82731k;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82732k0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.pip.C84048m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.AssetExtension;
import hm0.C87560g;
import hm0.C87564i;
import org.json.JSONException;
import org.json.JSONObject;
import p1066yc.C91399c0;
import p1066yc.C91400d;
import p1066yc.C91401d0;
import p292ad.C79501a;
import p292ad.C79502b;
import p292ad.C79513m;
import p292ad.b$$k;
import p292ad.b$$n;
import p830xc.C91165a;

/* renamed from: jo0.e */
public final class C88003e implements C87560g {

    /* renamed from: a */
    public final C79502b f254610a;

    /* renamed from: b */
    public C88005b f254611b = new C88005b((C88004a) null);

    /* renamed from: jo0.e$a */
    public class C88004a implements ValueCallback<String> {

        /* renamed from: a */
        public final /* synthetic */ C87560g.C87561a f254612a;

        public C88004a(C87560g.C87561a aVar) {
            this.f254612a = aVar;
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            Log.m105924i("MicroMsg.AppBrand.XWebLivePlayerOriginVideoContainer", "getVideoPositionAsync, value: " + str);
            try {
                C88003e.this.f254610a.mo109506G(new JSONObject(str));
                C87560g.C87561a aVar = this.f254612a;
                C79502b bVar = C88003e.this.f254610a;
                aVar.mo116681a(bVar.f233105s, bVar.f233106t);
            } catch (JSONException unused) {
                Log.m105928w("MicroMsg.AppBrand.XWebLivePlayerOriginVideoContainer", "getVideoPositionAsync, parse " + str + " failed");
                C87560g.C87561a aVar2 = this.f254612a;
                C79502b bVar2 = C88003e.this.f254610a;
                aVar2.mo116681a(bVar2.f233105s, bVar2.f233106t);
            }
        }
    }

    /* renamed from: jo0.e$b */
    public class C88005b implements C87564i {

        /* renamed from: a */
        public C87564i.C87565a f254614a = null;

        /* renamed from: b */
        public int f254615b = -1;

        /* renamed from: jo0.e$b$a */
        public class C88006a implements C91399c0 {
            public C88006a() {
            }

            /* renamed from: a */
            public void mo110184a() {
            }

            /* renamed from: c */
            public void mo110186c(boolean z) {
                C88005b bVar = C88005b.this;
                C87564i.C87565a aVar = bVar.f254614a;
                if (aVar != null) {
                    ((C84048m) aVar).mo116697e(bVar, z);
                } else {
                    bVar.f254615b = z ? 2 : 3;
                }
            }

            /* renamed from: e */
            public void mo110188e() {
                C88005b bVar = C88005b.this;
                C87564i.C87565a aVar = bVar.f254614a;
                if (aVar != null) {
                    ((C84048m) aVar).mo116695c(bVar);
                } else {
                    bVar.f254615b = 0;
                }
            }

            /* renamed from: f */
            public void mo110189f() {
                C88005b bVar = C88005b.this;
                C87564i.C87565a aVar = bVar.f254614a;
                if (aVar != null) {
                    ((C84048m) aVar).mo116694b(bVar);
                } else {
                    bVar.f254615b = 1;
                }
            }

            /* renamed from: j */
            public void mo110198j() {
                C88005b bVar = C88005b.this;
                C87564i.C87565a aVar = bVar.f254614a;
                if (aVar != null) {
                    ((C84048m) aVar).mo116698f(bVar);
                } else {
                    bVar.f254615b = 7;
                }
            }

            public void onPause() {
                C88005b bVar = C88005b.this;
                C87564i.C87565a aVar = bVar.f254614a;
                if (aVar != null) {
                    ((C84048m) aVar).mo116696d(bVar);
                } else {
                    bVar.f254615b = 4;
                }
            }

            public void onStop() {
                C88005b bVar = C88005b.this;
                C87564i.C87565a aVar = bVar.f254614a;
                if (aVar != null) {
                    ((C84048m) aVar).mo116696d(bVar);
                } else {
                    bVar.f254615b = 4;
                }
            }
        }

        public C88005b(C88004a aVar) {
            C88006a aVar2 = new C88006a();
            C79502b bVar = C88003e.this.f254610a;
            bVar.f233084J = aVar2;
            C91401d0.m114690a(bVar.f233085K, aVar2);
        }

        /* renamed from: b */
        public Integer mo110185b() {
            C79502b bVar = C88003e.this.f254610a;
            C91165a aVar = bVar.f233101o;
            Integer num = null;
            if (aVar == null) {
                Log.m105928w(bVar.mo109516v(), "getOriginPageViewId, invokeContext is null");
            } else {
                C83780d1 f = C91400d.m114679f(aVar);
                if (f == null) {
                    Log.m105928w(bVar.mo109516v(), "getOriginPageViewId, pageView is null");
                } else {
                    num = Integer.valueOf(f.hashCode());
                }
            }
            Log.m105918d("MicroMsg.AppBrand.XWebLivePlayerOriginVideoContainer", "getOriginPageViewId, originPageViewId: " + num);
            return num;
        }

        /* renamed from: d */
        public void mo110187d(C87564i.C87565a aVar) {
            this.f254614a = aVar;
            if (aVar != null) {
                switch (this.f254615b) {
                    case 0:
                        ((C84048m) aVar).mo116695c(this);
                        return;
                    case 1:
                        ((C84048m) aVar).mo116694b(this);
                        return;
                    case 2:
                        C84048m mVar = (C84048m) aVar;
                        mVar.mo116694b(this);
                        mVar.mo116697e(this, true);
                        return;
                    case 3:
                        C84048m mVar2 = (C84048m) aVar;
                        mVar2.mo116694b(this);
                        mVar2.mo116697e(this, false);
                        return;
                    case 4:
                        ((C84048m) aVar).mo116696d(this);
                        return;
                    case 5:
                        ((C84048m) aVar).mo116693a(this);
                        return;
                    case 6:
                        ((C84048m) aVar).mo116699g(this);
                        return;
                    case 7:
                        ((C84048m) aVar).mo116698f(this);
                        return;
                    default:
                        return;
                }
            }
        }

        public String getKey() {
            String u = C88003e.this.f254610a.mo109515u();
            Log.m105918d("MicroMsg.AppBrand.XWebLivePlayerOriginVideoContainer", "getKey, key: " + u);
            return u;
        }

        public C87564i.C87566b getType() {
            return C87564i.C87566b.LivePlayer;
        }

        public int getVideoHeight() {
            return -1;
        }

        public int getVideoWidth() {
            return -1;
        }

        /* renamed from: i */
        public boolean mo110196i() {
            return C88003e.this.f254610a.f233089P;
        }

        /* renamed from: k */
        public C82732k0 mo110199k() {
            C82731k kVar = C82731k.f242051e;
            C79502b bVar = C88003e.this.f254610a;
            return kVar.mo115008RV(bVar.f233107u, bVar.f233108v);
        }

        public void pause() {
            C79502b bVar = C88003e.this.f254610a;
            bVar.getClass();
            bVar.mo109503D(new b$$n(bVar, "stop", (Runnable) null));
        }

        public void release() {
            C79502b bVar = C88003e.this.f254610a;
            bVar.getClass();
            bVar.mo109503D(new b$$k(bVar));
        }

        public void start() {
            C79502b bVar = C88003e.this.f254610a;
            C79501a aVar = bVar.f233097h;
            if (aVar != null && !((C79513m) aVar).isPlaying()) {
                bVar.mo109503D(new b$$n(bVar, AssetExtension.SCENE_PLAY, (Runnable) null));
            }
        }
    }

    public C88003e(C79502b bVar) {
        this.f254610a = bVar;
    }

    /* renamed from: a */
    public boolean mo122453a() {
        return this.f254610a.f233091R.get();
    }

    /* renamed from: b */
    public boolean mo122454b(Surface surface) {
        C79502b bVar = this.f254610a;
        if (bVar.f233097h != null) {
            if (!bVar.f233091R.get()) {
                bVar.f233097h.setSurface(surface);
            } else {
                Log.m105924i(bVar.mo109516v(), "setSurface, JustPlayAudio");
            }
            return true;
        }
        Log.m105928w(bVar.mo109516v(), "setSurface, Adapter is null");
        return false;
    }

    /* renamed from: c */
    public boolean mo122455c(int i, int i2) {
        C79502b bVar = this.f254610a;
        Log.m105919d(bVar.mo109516v(), "setSurfaceSize, width: %d, height: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 || i2 == 0 || bVar.f233097h == null) {
            Log.m105928w(bVar.mo109516v(), "setSurfaceSize, Adapter is null");
            return false;
        }
        if (!bVar.f233091R.get()) {
            bVar.f233097h.setSurfaceSize(i, i2);
        } else {
            Log.m105924i(bVar.mo109516v(), "setSurfaceSize, JustPlayAudio");
        }
        return true;
    }

    /* renamed from: g */
    public Point mo110190g() {
        C79502b bVar = this.f254610a;
        return new Point(bVar.f233105s, bVar.f233106t);
    }

    /* renamed from: h */
    public C87564i mo110195h() {
        return this.f254611b;
    }

    public boolean isPlaying() {
        C79501a aVar = this.f254610a.f233097h;
        if (aVar == null) {
            return false;
        }
        return aVar.isPlaying();
    }

    /* renamed from: l */
    public int mo110200l() {
        return this.f254610a.f233103q;
    }

    /* renamed from: m */
    public int mo110201m() {
        return this.f254610a.f233104r;
    }

    /* renamed from: n */
    public void mo110202n(C83780d1 d1Var, C87560g.C87561a aVar) {
        C83165i jsRuntime = d1Var.getJsRuntime();
        if (jsRuntime == null) {
            Log.m105928w("MicroMsg.AppBrand.XWebLivePlayerOriginVideoContainer", "getVideoPositionAsync, null == jsRuntime");
            C79502b bVar = this.f254610a;
            aVar.mo116681a(bVar.f233105s, bVar.f233106t);
            return;
        }
        String str = "document.querySelector('embed[embed-id=\"" + this.f254610a.f253971d + "\"]').getBoundingClientRect().toJSON()";
        Log.m105924i("MicroMsg.AppBrand.XWebLivePlayerOriginVideoContainer", "getVideoPositionAsync, jsScript: " + str);
        jsRuntime.evaluateJavascript(str, new C88004a(aVar));
    }
}
