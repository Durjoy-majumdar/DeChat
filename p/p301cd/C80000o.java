package p301cd;

import android.graphics.Point;
import android.view.Surface;
import android.webkit.ValueCallback;
import c30.C104289g;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82731k;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82732k0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.pip.C84048m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import gy3.C87412m;
import hm0.C87560g;
import hm0.C87564i;
import lo0.C88603c;
import p1066yc.C91399c0;
import p1066yc.C91400d;
import p1066yc.C91401d0;
import p830xc.C91165a;
import p954dd.C86224a;
import rx3.C13598b0;

/* renamed from: cd.o */
public final class C80000o implements C87560g, C87564i, C91399c0 {

    /* renamed from: a */
    public final C80005q f234301a;

    /* renamed from: b */
    public int f234302b;

    /* renamed from: c */
    public C87564i.C87565a f234303c;

    /* renamed from: cd.o$a */
    public static final class C80001a<T> implements ValueCallback {

        /* renamed from: a */
        public final /* synthetic */ C80000o f234304a;

        /* renamed from: b */
        public final /* synthetic */ C87560g.C87561a f234305b;

        public C80001a(C80000o oVar, C87560g.C87561a aVar) {
            this.f234304a = oVar;
            this.f234305b = aVar;
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            Log.m105924i("MicroMsg.AppBrand.LivePusherOriginVideoContainer", "getVideoPositionAsync, value: " + str);
            try {
                this.f234304a.f234301a.mo110219I(new C104289g(str));
                C87560g.C87561a aVar = this.f234305b;
                C80005q qVar = this.f234304a.f234301a;
                aVar.mo116681a(qVar.f234322L, qVar.f234323M);
            } catch (Exception e) {
                Log.m105928w("MicroMsg.AppBrand.LivePusherOriginVideoContainer", "getVideoPositionAsync, updatePosition fail since " + e);
                C87560g.C87561a aVar2 = this.f234305b;
                C80005q qVar2 = this.f234304a.f234301a;
                aVar2.mo116681a(qVar2.f234322L, qVar2.f234323M);
            }
        }
    }

    public C80000o(C80005q qVar) {
        C87412m.m108594g(qVar, "pluginHandler");
        this.f234301a = qVar;
        C86224a aVar = qVar.f234330o;
        if (aVar != null) {
            C88603c cVar = (C88603c) aVar;
            cVar.f255885f = this;
            C91401d0.m114690a(cVar.f255886g, this);
        }
        this.f234302b = -1;
    }

    /* renamed from: a */
    public void mo110184a() {
        C13598b0 b0Var;
        C87564i.C87565a aVar = this.f234303c;
        if (aVar != null) {
            ((C84048m) aVar).mo116693a(this);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            this.f234302b = 5;
        }
    }

    /* renamed from: b */
    public Integer mo110185b() {
        C80005q qVar = this.f234301a;
        C91165a aVar = qVar.f234331p;
        Integer num = null;
        if (aVar == null) {
            Log.m105928w(qVar.mo110227w(), "getOriginPageViewId, invokeContext is null");
        } else {
            C83780d1 f = C91400d.m114679f(aVar);
            if (f == null) {
                Log.m105928w(qVar.mo110227w(), "getOriginPageViewId, pageView is null");
            } else {
                num = Integer.valueOf(f.hashCode());
            }
        }
        Log.m105918d("MicroMsg.AppBrand.LivePusherOriginVideoContainer", "getOriginPageViewId, originPageViewId: " + num);
        return num;
    }

    /* renamed from: c */
    public void mo110186c(boolean z) {
        C13598b0 b0Var;
        C87564i.C87565a aVar = this.f234303c;
        if (aVar != null) {
            ((C84048m) aVar).mo116697e(this, z);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            this.f234302b = z ? 2 : 3;
        }
    }

    /* renamed from: d */
    public void mo110187d(C87564i.C87565a aVar) {
        this.f234303c = aVar;
        if (aVar != null) {
            switch (this.f234302b) {
                case 0:
                    ((C84048m) aVar).mo116695c(this);
                    break;
                case 1:
                    ((C84048m) aVar).mo116694b(this);
                    break;
                case 2:
                    ((C84048m) aVar).mo116697e(this, true);
                    break;
                case 3:
                    ((C84048m) aVar).mo116697e(this, false);
                    break;
                case 4:
                    ((C84048m) aVar).mo116696d(this);
                    break;
                case 5:
                    ((C84048m) aVar).mo116693a(this);
                    break;
                case 6:
                    ((C84048m) aVar).mo116699g(this);
                    break;
                case 7:
                    ((C84048m) aVar).mo116698f(this);
                    break;
            }
            this.f234302b = -1;
        }
    }

    /* renamed from: e */
    public void mo110188e() {
        C13598b0 b0Var;
        C87564i.C87565a aVar = this.f234303c;
        if (aVar != null) {
            ((C84048m) aVar).mo116695c(this);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            this.f234302b = 0;
        }
    }

    /* renamed from: f */
    public void mo110189f() {
        C13598b0 b0Var;
        C87564i.C87565a aVar = this.f234303c;
        if (aVar != null) {
            ((C84048m) aVar).mo116694b(this);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            this.f234302b = 1;
        }
    }

    /* renamed from: g */
    public Point mo110190g() {
        C80005q qVar = this.f234301a;
        return new Point(qVar.f234322L, qVar.f234323M);
    }

    public String getKey() {
        String v = this.f234301a.mo110226v();
        Log.m105918d("MicroMsg.AppBrand.LivePusherOriginVideoContainer", "getKey, key: " + v);
        C87412m.m108593f(v, "pluginHandler.key.also {…Key, key: $it\")\n        }");
        return v;
    }

    public C87564i.C87566b getType() {
        return C87564i.C87566b.LivePusher;
    }

    public int getVideoHeight() {
        return -1;
    }

    public int getVideoWidth() {
        return -1;
    }

    /* renamed from: h */
    public C87564i mo110195h() {
        return this;
    }

    /* renamed from: i */
    public boolean mo110196i() {
        return false;
    }

    public boolean isPlaying() {
        C79999m mVar = this.f234301a.f234327i;
        if (mVar != null) {
            return mVar.isPushing();
        }
        return false;
    }

    /* renamed from: j */
    public void mo110198j() {
        C13598b0 b0Var;
        C87564i.C87565a aVar = this.f234303c;
        if (aVar != null) {
            ((C84048m) aVar).mo116698f(this);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            this.f234302b = 7;
        }
    }

    /* renamed from: k */
    public C82732k0 mo110199k() {
        return C82731k.f242051e.mo115008RV(true, true);
    }

    /* renamed from: l */
    public int mo110200l() {
        return this.f234301a.f234333r;
    }

    /* renamed from: m */
    public int mo110201m() {
        return this.f234301a.f234334s;
    }

    /* renamed from: n */
    public void mo110202n(C83780d1 d1Var, C87560g.C87561a aVar) {
        C87412m.m108594g(d1Var, "pageView");
        C87412m.m108594g(aVar, "onVideoPositionGotCallback");
        C83165i jsRuntime = d1Var.getJsRuntime();
        if (jsRuntime == null) {
            Log.m105928w("MicroMsg.AppBrand.LivePusherOriginVideoContainer", "getVideoPositionAsync, jsRuntime is null");
            C80005q qVar = this.f234301a;
            aVar.mo116681a(qVar.f234322L, qVar.f234323M);
            return;
        }
        jsRuntime.evaluateJavascript("document.querySelector('embed[embed-id=" + this.f234301a.f253971d + "]').getBoundingClientRect().toJSON()", new C80001a(this, aVar));
    }

    /* renamed from: o */
    public final boolean mo110203o(Surface surface) {
        C80005q qVar = this.f234301a;
        C79999m mVar = qVar.f234327i;
        if (mVar != null) {
            mVar.setSurface(surface);
            return true;
        }
        Log.m105928w(qVar.mo110227w(), "setSurface, Adapter is null");
        return false;
    }

    public void onPause() {
        C13598b0 b0Var;
        C87564i.C87565a aVar = this.f234303c;
        if (aVar != null) {
            ((C84048m) aVar).mo116696d(this);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            this.f234302b = 4;
        }
    }

    public void onStop() {
        C13598b0 b0Var;
        C87564i.C87565a aVar = this.f234303c;
        if (aVar != null) {
            ((C84048m) aVar).mo116699g(this);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            this.f234302b = 6;
        }
    }

    /* renamed from: p */
    public final boolean mo110206p(int i, int i2) {
        C79999m mVar;
        C80005q qVar = this.f234301a;
        Log.m105919d(qVar.mo110227w(), "setSurfaceSize, width: %d, height: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 || i2 == 0 || (mVar = qVar.f234327i) == null) {
            Log.m105928w(qVar.mo110227w(), "setSurfaceSize, Adapter is null");
            return false;
        }
        mVar.setSurfaceSize(i, i2);
        return true;
    }

    public void pause() {
        C80005q qVar = this.f234301a;
        qVar.getClass();
        qVar.mo110217G(new q$$m(qVar, "pause"));
    }

    public void release() {
        C80005q qVar = this.f234301a;
        qVar.getClass();
        qVar.mo110217G(new q$$j(qVar));
    }

    public void start() {
        C80005q qVar = this.f234301a;
        C79999m mVar = qVar.f234327i;
        if (mVar != null && !((C79998d0) mVar).isPushing()) {
            qVar.mo110217G(new q$$m(qVar, IXWebBroadcastListener.STAGE_START));
        }
    }
}
