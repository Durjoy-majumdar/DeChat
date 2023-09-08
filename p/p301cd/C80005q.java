package p301cd;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.util.Size;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.WindowManager;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.xwebplugin.live.C83127a;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.utils.C84800z1;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.rtmp.TXLiveBase;
import fl0.C86920e;
import fl0.C86921f;
import fu3.C116901a;
import hr0.C87583a;
import io0.C87779d;
import js0.C88020k;
import lo0.C88601a;
import lo0.C88602b;
import lo0.C88603c;
import lo0.C88606e;
import ml0.C21511u;
import ml0.C61498w;
import org.json.JSONException;
import org.json.JSONObject;
import p1066yc.C91400d;
import p1066yc.C91415l;
import p1066yc.C91424t;
import p1066yc.C91433x;
import p1066yc.C91434y;
import p1068zc.C91660a;
import p224ra.C89909e;
import p225rc.C89922k;
import p817kd.C88140c;
import p830xc.C91165a;
import p954dd.C86224a;
import p954dd.C86227b;
import p954dd.C86228c;
import p960ed.C86500a;
import p960ed.C86505e;
import p980id.C87695a;
import wq0.C91085v;
import zt3.C119157j;

/* renamed from: cd.q */
public class C80005q extends C87695a implements C91424t {

    /* renamed from: P */
    public static C86505e.C86506a f234309P = C86500a.f251329g;

    /* renamed from: Q */
    public static C91415l.C91416a f234310Q = C91433x.m114724b(C91434y.LivePusher);

    /* renamed from: A */
    public q$$x f234311A = new q$$x(this, (C80010t) null);

    /* renamed from: B */
    public Handler f234312B;

    /* renamed from: C */
    public int f234313C = 0;

    /* renamed from: D */
    public C84800z1 f234314D;

    /* renamed from: E */
    public q$$v f234315E = new q$$v(this);

    /* renamed from: F */
    public final C91415l f234316F;

    /* renamed from: G */
    public final C116901a f234317G;

    /* renamed from: H */
    public volatile C91165a f234318H = null;

    /* renamed from: I */
    public ScaleGestureDetector.OnScaleGestureListener f234319I = new q$$r(this);

    /* renamed from: J */
    public volatile boolean f234320J = false;

    /* renamed from: K */
    public String f234321K = "";

    /* renamed from: L */
    public int f234322L = 0;

    /* renamed from: M */
    public int f234323M = 0;

    /* renamed from: N */
    public final C91400d<C80002p> f234324N = new q$$s(this);

    /* renamed from: g */
    public final C86505e f234325g;

    /* renamed from: h */
    public Surface f234326h;

    /* renamed from: i */
    public C79999m f234327i;

    /* renamed from: j */
    public C86228c f234328j;

    /* renamed from: n */
    public C86227b f234329n;

    /* renamed from: o */
    public C86224a f234330o;

    /* renamed from: p */
    public C91165a f234331p;

    /* renamed from: q */
    public C91165a.C53318a f234332q;

    /* renamed from: r */
    public int f234333r;

    /* renamed from: s */
    public int f234334s;

    /* renamed from: t */
    public String f234335t = "";

    /* renamed from: u */
    public String f234336u;

    /* renamed from: v */
    public int f234337v;

    /* renamed from: w */
    public boolean f234338w;

    /* renamed from: x */
    public int f234339x = 1;

    /* renamed from: y */
    public boolean f234340y;

    /* renamed from: z */
    public ScaleGestureDetector f234341z;

    public C80005q() {
        C91415l a = ((C91433x) f234310Q).mo125370a();
        this.f234316F = a;
        a.start();
        this.f234317G = a.getHandler();
        this.f234312B = new Handler(MMApplicationContext.getContext().getMainLooper());
        C61498w.m72203a();
        C79998d0 d0Var = new C79998d0(MMApplicationContext.getContext());
        this.f234327i = d0Var;
        d0Var.setPushListener(new C80010t(this));
        this.f234327i.mo33716g(new C80011u(this));
        this.f234327i.mo33720m(new C80012v(this));
        this.f234325g = f234309P.mo120984a(this, this.f234327i);
        C84800z1 z1Var = new C84800z1(MMApplicationContext.getContext(), new C80013w(this));
        this.f234314D = z1Var;
        z1Var.enable();
        mo110230z(mo110228x());
        Handler handler = this.f234312B;
        if (handler != null) {
            handler.post(new q$$a(this));
        }
    }

    /* renamed from: A */
    public final void mo110211A(float f, float f2) {
        C79999m mVar = this.f234327i;
        if (mVar != null) {
            C21511u focusPosition = mVar.setFocusPosition(f, f2);
            this.f234325g.mo120983z().mo120978r(new PointF(f, f2));
            Log.m105925i(mo110227w(), "onTouchFocusPosition, set focus(%s, %s), code:%d, info:%s", Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(focusPosition.f60905a), focusPosition.f60906b);
        }
    }

    /* renamed from: B */
    public final void mo110212B(JSONObject jSONObject) {
        if (jSONObject.has(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE)) {
            this.f234335t = jSONObject.optString(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, this.f234335t);
            this.f234336u = jSONObject.optString("filterImageMd5", (String) null);
            if (Util.isNullOrNil(this.f234335t)) {
                try {
                    jSONObject.put(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, "");
                } catch (JSONException e) {
                    Log.m105929w(mo110227w(), "parseFilterImage, ignore exception:%s", e);
                }
            } else if (this.f234335t.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || this.f234335t.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
                jSONObject.remove(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE);
            }
        }
    }

    /* renamed from: C */
    public final void mo110213C(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject.has("position") && (optJSONObject = jSONObject.optJSONObject("position")) != null) {
            this.f234333r = C88020k.m109553d(optJSONObject.optInt("width", 0));
            this.f234334s = C88020k.m109553d(optJSONObject.optInt("height", 0));
            Log.m105925i(mo110227w(), "parseHtmlPosition, size:[%d, %d]", Integer.valueOf(this.f234333r), Integer.valueOf(this.f234334s));
            mo110221q();
        }
    }

    /* renamed from: D */
    public final void mo110214D(C91165a aVar, JSONObject jSONObject) {
        if (jSONObject.has("needEvent")) {
            jSONObject.optBoolean("needEvent", false);
            if (mo110218H()) {
                C88606e eVar = (C88606e) this.f234329n;
                eVar.getClass();
                if (aVar instanceof C81823b) {
                    eVar.f255893a = (C81823b) aVar;
                }
            }
        }
    }

    /* renamed from: E */
    public final void mo110215E() {
        C86224a aVar = this.f234330o;
        if (aVar != null) {
            ((C88603c) aVar).mo123049f(this, this.f234331p);
            C83127a d = ((C88603c) this.f234330o).mo123047d(this.f234331p);
            if (d == null) {
                Log.m105918d("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "unregisterForBackgroundVOIPIfNeed, no state manager");
            } else if (d.f242929i == this) {
                d.f242929i = null;
                Log.m105925i(d.f242924d, "unregisterLivePusher:%s", mo109508b());
            }
        }
        C79999m mVar = this.f234327i;
        if (mVar != null) {
            ((C79998d0) mVar).mo21076h();
            this.f234327i = null;
        }
        if (this.f234326h != null) {
            this.f234325g.mo120977q();
            this.f234326h.release();
            this.f234326h = null;
        }
        C91165a aVar2 = this.f234331p;
        if (aVar2 != null) {
            aVar2.mo62548i();
            this.f234332q = null;
        }
        Log.m105924i(mo110227w(), "LivePusher release handler thread");
        this.f234317G.removeCallbacksAndMessages((Object) null);
        this.f234316F.mo125366a();
        C88140c cVar = this.f253973f;
        if (cVar != null) {
            cVar.mo122542a(this.f253972e, this.f253971d);
        }
    }

    /* renamed from: F */
    public final void mo110216F(int i) {
        if (this.f234328j != null) {
            ((C87583a) C89909e.m112439d(C87583a.class, true)).idkeyStat(976, (long) i, 1, false);
        }
    }

    /* renamed from: G */
    public final void mo110217G(Runnable runnable) {
        this.f234317G.post(runnable);
    }

    /* renamed from: H */
    public final boolean mo110218H() {
        return this.f234329n != null;
    }

    /* renamed from: I */
    public void mo110219I(JSONObject jSONObject) {
        this.f234322L = C88020k.m109553d(jSONObject.optInt("x", this.f234322L));
        this.f234323M = C88020k.m109553d(jSONObject.optInt("y", this.f234323M));
        Log.m105919d(mo110227w(), "updatePosition, mPosX: %d, mPosY: %d", Integer.valueOf(this.f234322L), Integer.valueOf(this.f234323M));
    }

    /* renamed from: a */
    public boolean mo109507a() {
        Log.m105924i(mo110227w(), "startIfForeground");
        if (this.f234320J) {
            Log.m105924i(mo110227w(), "startIfForeground, not in foregound");
            return false;
        }
        mo110217G(new q$$e(this));
        return true;
    }

    /* renamed from: b */
    public String mo109508b() {
        return String.format("%s_%s", new Object[]{this.f253972e, Integer.valueOf(this.f253971d)});
    }

    /* renamed from: e */
    public void mo109510e() {
        mo110217G(new q$$c(this));
    }

    /* renamed from: f */
    public void mo110220f(MotionEvent motionEvent) {
        mo110217G(new q$$g(this, motionEvent));
    }

    /* renamed from: h */
    public void mo17968h(Surface surface) {
        mo110217G(new q$$h(this, surface));
    }

    /* renamed from: i */
    public String mo17969i(C91165a aVar) {
        if (this.f234325g.mo120973e(aVar)) {
            return null;
        }
        mo110217G(new q$$f(this, aVar));
        return null;
    }

    /* renamed from: j */
    public void mo17970j(SurfaceTexture surfaceTexture) {
        mo17968h(new Surface(surfaceTexture));
    }

    /* renamed from: m */
    public void mo17971m() {
        mo110217G(new q$$i(this));
    }

    /* renamed from: n */
    public boolean mo17972n(C91165a aVar) {
        return true;
    }

    /* renamed from: o */
    public void mo17973o(Bitmap bitmap) {
        Log.m105925i(mo110227w(), "*** handler(%s) handlePluginScreenshotTaken", mo122122p());
        C91165a aVar = this.f234318H;
        if (aVar == null) {
            Log.m105928w(mo110227w(), "handlePluginScreenshotTaken4JsApiCall, invokeContext is null");
            return;
        }
        this.f234318H = null;
        C86224a aVar2 = this.f234330o;
        if (aVar2 == null) {
            Log.m105928w(mo110227w(), "handlePluginScreenshotTaken4JsApiCall, customHandler is null");
        } else {
            ((C88603c) aVar2).mo123048e(aVar, bitmap);
        }
    }

    /* renamed from: q */
    public final void mo110221q() {
        if (this.f234333r != 0 && this.f234334s != 0 && this.f234327i != null) {
            Log.m105925i(mo110227w(), "adjustHtmlSize, size:[%d, %d]", Integer.valueOf(this.f234333r), Integer.valueOf(this.f234334s));
            if (!this.f234324N.mo125355a(this.f234331p) || !this.f234320J) {
                ((C79998d0) this.f234327i).setSurfaceSize(this.f234333r, this.f234334s);
                this.f234325g.mo120981u(new Size(this.f234333r, this.f234334s));
                return;
            }
            Log.m105924i(mo110227w(), "adjustHtmlSize, i am pip player, isWebViewInBackground");
        }
    }

    /* renamed from: r */
    public final void mo110222r(C91165a aVar) {
        C86224a aVar2 = this.f234330o;
        if (aVar2 != null) {
            q$$u q__u = new q$$u(this);
            C88603c cVar = (C88603c) aVar2;
            cVar.getClass();
            if (aVar instanceof C81823b) {
                C81823b bVar = (C81823b) aVar;
                JSONObject b = bVar.mo62539b();
                String optString = b.has(V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE) ? b.optString(V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE) : null;
                String optString2 = b.optString("backgroundMD5");
                if (Util.isNullOrNil(optString)) {
                    Log.m105924i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "convertBackgroundImageToLocalPath, url is null");
                    q__u.mo110249a(optString, "");
                    return;
                }
                C87779d.m109218e(bVar.mo62544g(), optString, false, optString2, new C88601a(cVar, q__u, optString));
            }
        }
    }

    /* renamed from: s */
    public final void mo110223s(C91165a aVar) {
        if (this.f234330o != null && !Util.isNullOrNil(this.f234335t)) {
            C86224a aVar2 = this.f234330o;
            String str = this.f234335t;
            String str2 = this.f234336u;
            q$$o q__o = new q$$o(this);
            C88603c cVar = (C88603c) aVar2;
            cVar.getClass();
            if (aVar instanceof C81823b) {
                C81823b bVar = (C81823b) aVar;
                if (Util.isNullOrNil(str)) {
                    Log.m105924i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "convertFilterImageToLocalPath, url is null");
                } else {
                    C87779d.m109218e(bVar.mo62544g(), str, false, str2, new C88602b(cVar, q__o, str));
                }
            }
        }
    }

    /* renamed from: t */
    public final void mo110224t(String[] strArr, String[] strArr2, String[] strArr3, JSONObject jSONObject, C91165a aVar, JSONObject jSONObject2) {
        String[] strArr4 = strArr;
        int length = strArr4.length;
        q$$w q__w = new q$$w((C80010t) null);
        q__w.f234395a = length;
        for (int i = 0; i < length; i++) {
            C86224a aVar2 = this.f234330o;
            ((C88603c) aVar2).mo123046c(aVar, strArr4[i], strArr2[i], false, new q$$t(this, i, jSONObject, strArr3, aVar, q__w, jSONObject2));
        }
    }

    /* renamed from: u */
    public final void mo110225u(Activity activity, C91165a aVar) {
        int i = this.f234337v;
        this.f234337v = i + 1;
        if (i > 5) {
            Log.m105924i(mo110227w(), "doInvokeInsertAfterRequestPermission, avoid dead loop");
            Log.m105924i(mo110227w(), "doInvokeInsertAfterRequestPermission, invoke insertInternal");
            mo110229y(aVar);
            return;
        }
        C91085v.m114266a(aVar.getAppId(), new q$$p(this, activity, aVar));
        C91085v.m114266a(aVar.getAppId(), new q$$q(this, activity, aVar));
        if (!C89922k.m112464a(activity, aVar.mo62544g(), "android.permission.CAMERA", 117, "", "")) {
            Log.m105924i(mo110227w(), "doInvokeInsertAfterRequestPermission, no Camera Permission");
            return;
        }
        if (!C89922k.m112464a(activity, aVar.mo62544g(), "android.permission.RECORD_AUDIO", 118, "", "")) {
            Log.m105924i(mo110227w(), "doInvokeInsertAfterRequestPermission, no Microphone Permission");
            return;
        }
        Log.m105924i(mo110227w(), "doInvokeInsertAfterRequestPermission, invoke insertInternal");
        mo110229y(aVar);
    }

    /* renamed from: v */
    public String mo110226v() {
        return mo122122p() + "@" + hashCode();
    }

    /* renamed from: w */
    public final String mo110227w() {
        return String.format("%s(%s)", new Object[]{"MicroMsg.SameLayer.LivePusherPluginHandler", mo122122p()});
    }

    /* renamed from: x */
    public final int mo110228x() {
        if (MMApplicationContext.getContext().getSystemService("window") != null) {
            return ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
        }
        Log.m105920e(mo110227w(), "getRotationAngle, window service is null");
        return 0;
    }

    /* renamed from: y */
    public final void mo110229y(C91165a aVar) {
        C86224a aVar2;
        if (this.f234327i == null) {
            Log.m105924i(mo110227w(), "insert, adapter is null");
            return;
        }
        TXLiveBase.setAppVersion(String.format("weixin_%s", new Object[]{aVar.getAppId()}));
        this.f234331p = aVar;
        C82381f g = aVar.mo62544g();
        if (g instanceof C83780d1) {
            this.f234320J = !((C83780d1) g).f244563P;
        } else {
            Log.m105928w(mo110227w(), "insert, component is not AppBrandPageView");
        }
        C80014x xVar = new C80014x(this);
        this.f234332q = xVar;
        aVar.mo62538a(xVar);
        JSONObject b = aVar.mo62539b();
        mo110214D(aVar, b);
        mo110213C(b);
        if (b.has(V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE)) {
            this.f234338w = b.optInt(V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE, 0) != 0;
        }
        if (b.has(V2TXJSAdapterConstants.PUSHER_KEY_ZOOM)) {
            this.f234340y = b.optBoolean(V2TXJSAdapterConstants.PUSHER_KEY_ZOOM, false);
        }
        mo110212B(b);
        Bundle b2 = C91660a.m115196b(b);
        C86224a aVar3 = this.f234330o;
        if (aVar3 != null) {
            String b3 = ((C88603c) aVar3).mo123045b(aVar, b2);
            if (!Util.isNullOrNil(b3)) {
                Log.m105925i(mo110227w(), "insert fail, message:%s", b3);
                aVar.mo62552m("fail: can not insert VOIP mode LivePusher now", C86921f.f252331e);
                ((C119157j) C119157j.f356862d).mo183895z(new q$$k(aVar, b3));
                return;
            }
        }
        C21511u l = ((C79998d0) this.f234327i).mo21078l(b2);
        Log.m105925i(mo110227w(), "insert, code:%d info:%s", Integer.valueOf(l.f60905a), l.f60906b);
        aVar.mo62547h(l.f60905a == 0 ? C86920e.f252311a : C86920e.f252314d, l.f60907c);
        mo110222r(aVar);
        mo110223s(aVar);
        if (l.f60905a == 0 && (aVar2 = this.f234330o) != null) {
            ((C88603c) aVar2).mo123050g(this, this.f234331p, b2);
        }
    }

    /* renamed from: z */
    public final boolean mo110230z(int i) {
        if (i != this.f234313C) {
            this.f234313C = i;
            Log.m105925i("MicroMsg.SameLayer.LivePusherPluginHandler", "notifyOrientationChanged, new angle:%s", Integer.valueOf(i));
            C79999m mVar = this.f234327i;
            if (mVar != null) {
                mVar.mo33717i(i);
                this.f234325g.mo120979s().mo120975n(i);
                return true;
            }
        }
        return false;
    }
}
