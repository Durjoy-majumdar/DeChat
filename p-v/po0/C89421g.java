package po0;

import co0.C80123a;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.event.AppBrandVideoPlayEvent;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;
import p1066yc.C91399c0;
import p1066yc.C91412i;
import p964fd.C86817b;
import p964fd.C86826e;
import p975hd.C87480d;
import po0.C89427n;
import ym0.C91516n;

/* renamed from: po0.g */
public class C89421g implements C87480d {

    /* renamed from: a */
    public C86826e f257444a;

    /* renamed from: b */
    public C81823b f257445b;

    /* renamed from: c */
    public double f257446c;

    /* renamed from: d */
    public int f257447d;

    /* renamed from: e */
    public MTimerHandler f257448e;

    /* renamed from: f */
    public String f257449f;

    /* renamed from: g */
    public volatile boolean f257450g = false;

    /* renamed from: h */
    public C86817b f257451h = null;

    /* renamed from: i */
    public C91399c0 f257452i = null;

    /* renamed from: a */
    public final void mo123740a(C82919r2 r2Var, JSONObject jSONObject) {
        C82381f g;
        if (r2Var != null) {
            if (!(r2Var instanceof g$$k) && !(r2Var instanceof g$$i)) {
                Log.m105925i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "dispatch event:%s, data:%s", r2Var.mo114779e(), jSONObject.toString());
            }
            C82919r2 m = r2Var.mo115163m(jSONObject.toString());
            C81823b bVar = this.f257445b;
            if (bVar != null && (g = bVar.mo62544g()) != null) {
                if (g instanceof C81925i2) {
                    C81925i2 i2Var = (C81925i2) g;
                    i2Var.mo109669n(m, (int[]) null);
                    C83780d1 l0 = i2Var.mo114341l0();
                    if (l0 != null) {
                        l0.mo109669n(m, (int[]) null);
                    }
                } else if (g instanceof C83780d1) {
                    C83780d1 d1Var = (C83780d1) g;
                    d1Var.mo109669n(m, (int[]) null);
                    C81925i2 O0 = d1Var.mo116160O0();
                    if (O0 != null) {
                        O0.mo109669n(m, (int[]) null);
                    }
                } else {
                    g.mo109669n(m, (int[]) null);
                }
            }
        }
    }

    /* renamed from: b */
    public final JSONObject mo123741b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", this.f257449f);
        return jSONObject;
    }

    /* renamed from: c */
    public final void mo123742c() {
        C81823b bVar;
        Log.m105918d("MicroMsg.SameLayer.AppBrandVideoEventHandler", "markVideoPlayPauseOrStop");
        if (this.f257444a == null || (bVar = this.f257445b) == null) {
            Log.m105928w("MicroMsg.SameLayer.AppBrandVideoEventHandler", "markVideoPlayPauseOrStop, pluginHandler or invokeContext is null");
            return;
        }
        C80123a a = C91412i.m114704a(bVar);
        if (a == null) {
            Log.m105928w("MicroMsg.SameLayer.AppBrandVideoEventHandler", "markVideoPlayPauseOrStop, audioOfVideoBackgroundPlayManager is null");
        } else {
            a.mo110373u(this.f257444a);
        }
    }

    /* renamed from: d */
    public void mo123743d(boolean z) {
        try {
            JSONObject b = mo123741b();
            b.put("playInBackground", z);
            mo123740a(new g$$b((C89422h) null), b);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onXWebVideoBackgroundPlaybackChange fail", e);
        }
    }

    /* renamed from: e */
    public void mo123744e(int i, int i2, int i3) {
        try {
            JSONObject b = mo123741b();
            b.put("width", i);
            b.put("height", i2);
            double d = (((double) i3) * 1.0d) / 1000.0d;
            this.f257446c = d;
            b.put("duration", d);
            mo123740a(new g$$e((C89422h) null), b);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onXWebVideoLoadedMetaData fail", e);
        }
    }

    /* renamed from: f */
    public void mo123745f(boolean z) {
        try {
            mo123740a(new g$$f((C89422h) null), mo123741b());
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoPause fail", e);
        }
        mo123750k();
        MMHandlerThread.postToMainThread(new C89423i(this));
        mo123742c();
        C91399c0 c0Var = this.f257452i;
        if (c0Var == null) {
            return;
        }
        if (!z) {
            c0Var.onPause();
        } else {
            c0Var.onStop();
        }
    }

    /* renamed from: g */
    public void mo123746g(boolean z) {
        C81823b bVar;
        this.f257450g = false;
        try {
            this.f257447d = 0;
            JSONObject b = mo123741b();
            b.put("timeStamp", System.currentTimeMillis());
            mo123740a(new g$$g((C89422h) null), b);
            mo123749j();
            MMHandlerThread.postToMainThread(new C89422h(this));
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoPlay fail", e);
        }
        Log.m105918d("MicroMsg.SameLayer.AppBrandVideoEventHandler", "markVideoPlayStart");
        if (this.f257444a == null || (bVar = this.f257445b) == null) {
            Log.m105928w("MicroMsg.SameLayer.AppBrandVideoEventHandler", "markVideoPlayStart, mPluginHandler or mInvokeContext is null");
        } else {
            C80123a a = C91412i.m114704a(bVar);
            if (a == null) {
                Log.m105928w("MicroMsg.SameLayer.AppBrandVideoEventHandler", "markVideoPlayStart, audioOfVideoBackgroundPlayManager is null");
            } else {
                a.mo110374w(this.f257444a);
            }
        }
        C91399c0 c0Var = this.f257452i;
        if (c0Var != null) {
            c0Var.mo110186c(z);
        }
    }

    /* renamed from: h */
    public void mo123747h(int i, int i2) {
        if (this.f257450g) {
            Log.m105918d("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onVideoTimeUpdate, video waiting");
            return;
        }
        try {
            if (Math.abs(i - this.f257447d) >= 250) {
                C86817b bVar = this.f257451h;
                if (bVar != null) {
                    ((C89427n.C89428a) bVar).mo123757a(i, i2);
                }
                this.f257447d = i;
                double doubleValue = new BigDecimal((((double) i) * 1.0d) / 1000.0d).setScale(3, 4).doubleValue();
                JSONObject b = mo123741b();
                b.put("position", doubleValue);
                b.put("duration", (((double) i2) * 1.0d) / 1000.0d);
                mo123740a(new g$$k((C89422h) null), b);
            }
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoTimeUpdate fail", e);
        }
    }

    /* renamed from: i */
    public void mo123748i() {
        this.f257450g = true;
        try {
            JSONObject b = mo123741b();
            b.put("timeStamp", System.currentTimeMillis());
            mo123740a(new g$$l((C89422h) null), b);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoWaiting fail", e);
        }
        C91399c0 c0Var = this.f257452i;
        if (c0Var != null) {
            c0Var.mo110188e();
        }
    }

    /* renamed from: j */
    public final void mo123749j() {
        Log.m105924i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "start video update timer");
        if (this.f257448e == null) {
            Log.m105924i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "start video update timer, create new timer");
            this.f257448e = new MTimerHandler("AppBrandVideoEventHandler_HandlerThread#" + hashCode(), (MTimerHandler.CallBack) new g$$a(this), true);
        }
        MTimerHandler mTimerHandler = this.f257448e;
        if (mTimerHandler != null) {
            mTimerHandler.startTimer(0, 250);
        }
        C81823b bVar = this.f257445b;
        if (bVar != null && C91516n.m114822a(bVar.f240074e)) {
            Log.m105924i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "startUpdateTimer, send play event");
            new AppBrandVideoPlayEvent().publish();
        }
    }

    /* renamed from: k */
    public final void mo123750k() {
        Log.m105924i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "stop video update timer");
        MTimerHandler mTimerHandler = this.f257448e;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
    }
}
