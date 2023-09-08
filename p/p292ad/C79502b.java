package p292ad;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.Surface;
import co0.C80123a;
import co0.C80127b;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C1735h2;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82725i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.xwebplugin.live.C83127a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fu3.C116901a;
import hr0.C87583a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import jo0.C87995c;
import jo0.C87997d;
import js0.C88020k;
import km0.C88226c;
import ml0.C21511u;
import ml0.C61498w;
import org.json.JSONException;
import org.json.JSONObject;
import p1066yc.C91397b0;
import p1066yc.C91398c;
import p1066yc.C91399c0;
import p1066yc.C91400d;
import p1066yc.C91412i;
import p1066yc.C91414k;
import p1066yc.C91415l;
import p1066yc.C91418n;
import p1066yc.C91419o;
import p1066yc.C91424t;
import p1066yc.C91433x;
import p1066yc.C91434y;
import p224ra.C89909e;
import p817kd.C88140c;
import p830xc.C91165a;
import p932bd.C79687a;
import p932bd.C79688b;
import p932bd.C79689c;
import p980id.C87695a;

/* renamed from: ad.b */
public class C79502b extends C87695a implements C91424t, C91418n {

    /* renamed from: W */
    public static C91415l.C91416a f233074W = C91433x.m114724b(C91434y.LivePlayer);

    /* renamed from: A */
    public final C91415l f233075A;

    /* renamed from: B */
    public final C116901a f233076B;

    /* renamed from: C */
    public boolean f233077C;

    /* renamed from: D */
    public volatile boolean f233078D;

    /* renamed from: E */
    public AtomicBoolean f233079E;

    /* renamed from: F */
    public volatile C91165a f233080F;

    /* renamed from: G */
    public C91398c f233081G;

    /* renamed from: H */
    public C91400d<C79520r> f233082H;

    /* renamed from: I */
    public String f233083I;

    /* renamed from: J */
    public C91399c0 f233084J;

    /* renamed from: K */
    public int f233085K;

    /* renamed from: L */
    public volatile boolean f233086L;

    /* renamed from: M */
    public boolean f233087M;

    /* renamed from: N */
    public boolean f233088N;

    /* renamed from: P */
    public boolean f233089P;

    /* renamed from: Q */
    public C91418n f233090Q;

    /* renamed from: R */
    public AtomicBoolean f233091R;

    /* renamed from: S */
    public volatile String f233092S;

    /* renamed from: T */
    public volatile String f233093T;

    /* renamed from: U */
    public volatile C91414k f233094U;

    /* renamed from: V */
    public volatile Bitmap f233095V;

    /* renamed from: g */
    public Surface f233096g;

    /* renamed from: h */
    public C79501a f233097h;

    /* renamed from: i */
    public C79689c f233098i;

    /* renamed from: j */
    public C79688b f233099j;

    /* renamed from: n */
    public C79687a f233100n;

    /* renamed from: o */
    public C91165a f233101o;

    /* renamed from: p */
    public C91165a.C53318a f233102p;

    /* renamed from: q */
    public int f233103q;

    /* renamed from: r */
    public int f233104r;

    /* renamed from: s */
    public int f233105s = 0;

    /* renamed from: t */
    public int f233106t = 0;

    /* renamed from: u */
    public boolean f233107u;

    /* renamed from: v */
    public boolean f233108v;

    /* renamed from: w */
    public C88226c f233109w = null;

    /* renamed from: x */
    public String f233110x = null;

    /* renamed from: y */
    public final C82725i2 f233111y;

    /* renamed from: z */
    public volatile boolean f233112z;

    public C79502b() {
        b$$h b__h = new b$$h(this);
        this.f233111y = new C82725i2(new C1735h2(b__h), new b$$o(this));
        this.f233112z = false;
        this.f233077C = false;
        this.f233078D = false;
        this.f233079E = null;
        this.f233080F = null;
        this.f233081G = new b$$q(this, this, new b$$p(this));
        this.f233082H = new b$$r(this);
        this.f233083I = "";
        this.f233084J = null;
        this.f233085K = -1;
        this.f233086L = false;
        this.f233087M = false;
        this.f233088N = false;
        this.f233089P = false;
        this.f233090Q = new C91397b0();
        this.f233091R = new AtomicBoolean(false);
        this.f233092S = null;
        this.f233093T = null;
        this.f233094U = null;
        this.f233095V = null;
        C91415l a = ((C91433x) f233074W).mo125370a();
        this.f233075A = a;
        a.start();
        this.f233076B = a.getHandler();
        C61498w.m72203a();
        C79513m mVar = new C79513m(MMApplicationContext.getContext());
        this.f233097h = mVar;
        mVar.setPlayListener(new C79508h(this));
        ((C79513m) this.f233097h).mo33725k(new C79509i(this));
    }

    /* renamed from: q */
    public static void m96468q(C79502b bVar) {
        Log.m105924i(bVar.mo109516v(), "muteIfIsUnMuted");
        if (!bVar.mo109517w()) {
            bVar.mo109503D(new b$$n(bVar, "mute", new b$$l(bVar)));
        }
    }

    /* renamed from: A */
    public final void mo109500A(JSONObject jSONObject) {
        if (this.f233078D && !this.f233082H.mo125355a(this.f233101o)) {
            Log.m105924i(mo109516v(), "insert, webView in background");
            try {
                jSONObject.put(V2TXJSAdapterConstants.PLAYER_KEY_CAN_AUTO_PLAY, false);
            } catch (JSONException e) {
                String v = mo109516v();
                Log.m105928w(v, "insert, put isInForeground fail since " + e.toString());
            }
            this.f233079E = new AtomicBoolean(jSONObject.optBoolean(V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY, false));
        }
    }

    /* renamed from: B */
    public final void mo109501B() {
        C79687a aVar = this.f233100n;
        if (aVar != null) {
            C87995c cVar = (C87995c) aVar;
            AppBrandRuntime a = C80127b.m97435a(this.f233101o);
            if (a != null) {
                a.f238113K.mo122982e(cVar.f254607f);
                C83127a aVar2 = (C83127a) a.mo113032U(C83127a.class);
                if (aVar2 != null) {
                    C79502b bVar = cVar.f254602a;
                    aVar2.f242930j.remove(bVar);
                    Log.m105925i(aVar2.f242924d, "unregisterLivePlayer:%s", bVar.mo109508b());
                } else {
                    Log.m105918d("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "unregisterForBackgroundVOIPIfNeed, no state manager");
                }
                Log.m105918d("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayerRelease");
                if (cVar.f254605d) {
                    Log.m105928w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayerRelease, is voip mode");
                } else if (cVar.f254602a == null) {
                    Log.m105928w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayerRelease, pluginHandler is null");
                } else {
                    C80123a aVar3 = (C80123a) a.mo113032U(C80123a.class);
                    if (aVar3 == null) {
                        Log.m105928w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayerRelease, audioOfVideoBackgroundPlayManager is null");
                    } else {
                        aVar3.mo110375x(cVar.f254602a);
                    }
                }
            }
            cVar.f254606e = true;
        }
        C79501a aVar4 = this.f233097h;
        if (aVar4 != null) {
            ((C79513m) aVar4).mo33723i();
            this.f233097h = null;
        }
        Surface surface = this.f233096g;
        if (surface != null) {
            surface.release();
            this.f233096g = null;
        }
        C91165a aVar5 = this.f233101o;
        if (aVar5 != null) {
            aVar5.mo62548i();
            this.f233102p = null;
        }
        Log.m105924i(mo109516v(), "LivePlayer release handler thread");
        this.f233076B.removeCallbacksAndMessages((Object) null);
        this.f233075A.mo125366a();
        Log.m105924i(mo109516v(), "release, abandonFocus");
        this.f233111y.mo115002L();
        C88140c cVar2 = this.f253973f;
        if (cVar2 != null) {
            cVar2.mo122542a(this.f253972e, this.f253971d);
        }
    }

    /* renamed from: C */
    public final void mo109502C(int i) {
        if (this.f233098i != null) {
            ((C87583a) C89909e.m112439d(C87583a.class, true)).idkeyStat(976, (long) i, 1, false);
        }
    }

    /* renamed from: D */
    public final void mo109503D(Runnable runnable) {
        this.f233076B.post(runnable);
    }

    /* renamed from: E */
    public <AddOn extends C91419o> void mo109504E(Class<AddOn> cls, AddOn addon) {
        String v = mo109516v();
        Log.m105924i(v, "setAddOn for " + cls.getSimpleName());
        C91397b0 b0Var = (C91397b0) this.f233090Q;
        if (addon == null) {
            ((ConcurrentHashMap) b0Var.f262100d).remove(cls);
        } else {
            ((ConcurrentHashMap) b0Var.f262100d).put(cls, addon);
        }
    }

    /* renamed from: F */
    public final void mo109505F() {
        Log.m105924i(mo109516v(), "unMuteIfIsMuted");
        if (mo109517w()) {
            mo109503D(new b$$n(this, "mute", (Runnable) null));
        }
    }

    /* renamed from: G */
    public void mo109506G(JSONObject jSONObject) {
        this.f233105s = C88020k.m109553d(jSONObject.optInt("x", this.f233105s));
        this.f233106t = C88020k.m109553d(jSONObject.optInt("y", this.f233106t));
        Log.m105919d(mo109516v(), "updateVideoPosition, mPosX: %d, mPosY: %d", Integer.valueOf(this.f233105s), Integer.valueOf(this.f233106t));
    }

    /* renamed from: a */
    public boolean mo109507a() {
        Log.m105924i(mo109516v(), "startIfForeground");
        if (this.f233078D || this.f233077C) {
            Log.m105924i(mo109516v(), "startIfForeground, not in foregound");
            return false;
        }
        mo109503D(new b$$d(this));
        return true;
    }

    /* renamed from: b */
    public String mo109508b() {
        return String.format("%s_%s", new Object[]{this.f253972e, Integer.valueOf(this.f253971d)});
    }

    /* renamed from: c */
    public <AddOn extends C91419o> AddOn mo109509c(Class<AddOn> cls) {
        String v = mo109516v();
        Log.m105924i(v, "getAddOn for " + cls.getSimpleName());
        return ((C91397b0) this.f233090Q).mo109509c(cls);
    }

    /* renamed from: e */
    public void mo109510e() {
        mo109503D(new b$$e(this));
    }

    public String getName() {
        return mo109515u();
    }

    /* renamed from: h */
    public void mo17968h(Surface surface) {
        mo109503D(new b$$i(this, surface));
    }

    /* renamed from: i */
    public String mo17969i(C91165a aVar) {
        mo109503D(new b$$f(this, aVar));
        return null;
    }

    /* renamed from: j */
    public void mo17970j(SurfaceTexture surfaceTexture) {
        mo17968h(new Surface(surfaceTexture));
    }

    /* renamed from: m */
    public void mo17971m() {
        mo109503D(new b$$j(this));
    }

    /* renamed from: o */
    public void mo17973o(Bitmap bitmap) {
        Log.m105925i(mo109516v(), "*** handler(%s) handlePluginScreenshotTaken", mo122122p());
        C91165a aVar = this.f233080F;
        if (aVar == null) {
            Log.m105928w(mo109516v(), "handlePluginScreenshotTaken4JsApiCall, invokeContext is null");
            return;
        }
        this.f233080F = null;
        C79687a aVar2 = this.f233100n;
        if (aVar2 == null) {
            Log.m105928w(mo109516v(), "handlePluginScreenshotTaken4JsApiCall, customHandler is null");
        } else {
            ((C87995c) aVar2).mo122448c(aVar, bitmap);
        }
    }

    /* renamed from: r */
    public final void mo109512r() {
        if (this.f233103q != 0 && this.f233104r != 0 && this.f233097h != null) {
            Log.m105925i(mo109516v(), "adjustHtmlSize, size:[%d, %d]", Integer.valueOf(this.f233103q), Integer.valueOf(this.f233104r));
            if (!this.f233082H.mo125355a(this.f233101o) || !this.f233078D) {
                ((C79513m) this.f233097h).setSurfaceSize(this.f233103q, this.f233104r);
                return;
            }
            Log.m105924i(mo109516v(), "adjustHtmlSize, i am pip player, isWebViewInBackground");
        }
    }

    /* renamed from: s */
    public final boolean mo109513s() {
        C91165a aVar = this.f233101o;
        if (aVar == null) {
            Log.m105928w(mo109516v(), "amIBackgroundAudioPlayer, mInsertInvokeContext is null");
            return false;
        }
        C80123a a = C91412i.m114704a(aVar);
        if (a != null) {
            return a.mo110365c(this);
        }
        Log.m105928w(mo109516v(), "amIBackgroundAudioPlayer, audioOfVideoBackgroundPlayManager is null");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109514t(p830xc.C91165a r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.mo109516v()
            java.lang.String r1 = "disableBackgroundPlayAudio"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            boolean r0 = r5.f233087M
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r5.mo109516v()
            java.lang.String r1 = "disableBackgroundPlayAudio, mIsRTCMode"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            fl0.c r0 = fl0.C86921f.f252337k
            r6.mo62551l(r0)
            return
        L_0x001c:
            java.lang.String r0 = r5.mo109516v()
            java.lang.String r1 = "disableBackgroundPlayAudioInternal"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L_0x0034
            java.lang.String r2 = r5.mo109516v()
            java.lang.String r3 = "disableBackgroundPlayAudioInternal, invokeContext is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
        L_0x0032:
            r2 = 0
            goto L_0x0048
        L_0x0034:
            co0.a r2 = p1066yc.C91412i.m114704a(r6)
            if (r2 != 0) goto L_0x0044
            java.lang.String r2 = r5.mo109516v()
            java.lang.String r3 = "disableBackgroundPlayAudio, audioOfVideoBackgroundPlayManager is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
            goto L_0x0032
        L_0x0044:
            r2.mo110367e(r5)
            r2 = 1
        L_0x0048:
            if (r2 == 0) goto L_0x0067
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.f233091R
            r2.set(r1)
            ad.a r2 = r5.f233097h
            if (r2 == 0) goto L_0x0058
            android.view.Surface r3 = r5.f233096g
            r2.setSurface(r3)
        L_0x0058:
            r5.f233089P = r1
            bd.b r2 = r5.f233099j
            if (r2 == 0) goto L_0x0065
            int r3 = r5.f253971d
            jo0.d r2 = (jo0.C87997d) r2
            r2.mo122452b(r3, r1)
        L_0x0065:
            r2 = 1
            goto L_0x0068
        L_0x0067:
            r2 = 0
        L_0x0068:
            java.lang.String r3 = r5.mo109516v()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r0[r1] = r4
            java.lang.String r1 = "disableBackgroundPlayAudio, result:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r0)
            if (r2 == 0) goto L_0x007e
            fl0.c r0 = fl0.C86920e.f252311a
            goto L_0x0080
        L_0x007e:
            fl0.c r0 = fl0.C86920e.f252314d
        L_0x0080:
            r6.mo62551l(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p292ad.C79502b.mo109514t(xc.a):void");
    }

    /* renamed from: u */
    public String mo109515u() {
        return mo122122p() + "@" + hashCode();
    }

    /* renamed from: v */
    public final String mo109516v() {
        return String.format("%s(%s)", new Object[]{"MicroMsg.SameLayer.LivePlayerPluginHandler", mo122122p()});
    }

    /* renamed from: w */
    public final boolean mo109517w() {
        C79501a aVar = this.f233097h;
        return aVar != null && aVar.isMuted();
    }

    /* renamed from: x */
    public final void mo109518x(String str, C21511u uVar) {
        boolean z = true;
        if (str.equalsIgnoreCase("pause")) {
            C91399c0 c0Var = this.f233084J;
            if (c0Var != null) {
                c0Var.onPause();
            } else {
                this.f233085K = 4;
            }
            C79687a aVar = this.f233100n;
            if (aVar != null) {
                ((C87995c) aVar).mo122447b(this.f253971d, 2006, (Bundle) null);
            }
        } else if (str.equalsIgnoreCase("stop")) {
            C91399c0 c0Var2 = this.f233084J;
            if (c0Var2 != null) {
                c0Var2.onStop();
            } else {
                this.f233085K = 6;
            }
            C79687a aVar2 = this.f233100n;
            if (aVar2 != null) {
                ((C87995c) aVar2).mo122447b(this.f253971d, 2006, (Bundle) null);
            }
        } else {
            if (str.equalsIgnoreCase("mute")) {
                Log.m105924i(mo109516v(), "operate, reset passive mute");
                this.f233112z = false;
            }
            z = false;
        }
        if (z) {
            String v = mo109516v();
            Log.m105924i(v, "operate " + str + ", abandonFocus");
            this.f233111y.mo115002L();
        }
    }

    /* renamed from: y */
    public final void mo109519y(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject.has("position") && (optJSONObject = jSONObject.optJSONObject("position")) != null) {
            this.f233103q = C88020k.m109553d(optJSONObject.optInt("width", 0));
            this.f233104r = C88020k.m109553d(optJSONObject.optInt("height", 0));
            Log.m105925i(mo109516v(), "parseHtmlPosition, size:[%d, %d]", Integer.valueOf(this.f233103q), Integer.valueOf(this.f233104r));
            mo109512r();
        }
    }

    /* renamed from: z */
    public final void mo109520z(C91165a aVar, JSONObject jSONObject) {
        if (jSONObject.has("needEvent")) {
            boolean z = false;
            jSONObject.optBoolean("needEvent", false);
            C79688b bVar = this.f233099j;
            if (bVar != null) {
                z = true;
            }
            if (z) {
                C87997d dVar = (C87997d) bVar;
                dVar.getClass();
                if (aVar instanceof C81823b) {
                    dVar.f254609a = (C81823b) aVar;
                }
            }
        }
    }
}
