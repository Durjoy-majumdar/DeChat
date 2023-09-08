package com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import ba3.C39754e;
import ca3.C16886m;
import ca3.C39932b;
import ca3.C39934d;
import ca3.C39936h;
import ca3.C39937i;
import ca3.C39938j;
import ca3.C39940k;
import ca3.C39941l;
import com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18054e;
import com.tencent.p014mm.plugin.webview.model.C43720k;
import com.tencent.p014mm.plugin.webview.model.C43721l;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.C44209a;
import com.tencent.p014mm.plugin.webview.webcompt.C44463z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e00.C45514j0;
import e00.C45518r0;
import ea3.C7616k;
import gy3.C87412m;
import in0.C87760d;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import p830xc.C91165a;
import rx3.C36570n;
import t83.C13849g;
import t83.C13851h1;
import t83.C48590l;
import t83.C48610u0;
import we0.C53156a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.WebViewVideoEventHandler */
public final class WebViewVideoEventHandler {

    /* renamed from: a */
    public final String f119752a = ("MicroMsg.WebViewVideoEventHandler:" + hashCode());

    /* renamed from: b */
    public C39934d f119753b;

    /* renamed from: c */
    public C16886m f119754c;

    /* renamed from: d */
    public double f119755d;

    /* renamed from: e */
    public int f119756e;

    /* renamed from: f */
    public MTimerHandler f119757f;

    /* renamed from: g */
    public int f119758g;

    /* renamed from: h */
    public JSONObject f119759h;

    /* renamed from: i */
    public C39754e f119760i = new C44207b(this);

    /* renamed from: j */
    public int f119761j;

    /* renamed from: k */
    public int f119762k = -1;

    /* renamed from: l */
    public C53156a f119763l;

    /* renamed from: m */
    public ContentObserver f119764m;

    /* renamed from: n */
    public BroadcastReceiver f119765n;

    /* renamed from: o */
    public C43720k f119766o;

    /* renamed from: p */
    public C43721l f119767p;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/WebViewVideoEventHandler$VolumeBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.WebViewVideoEventHandler$VolumeBroadcastReceiver */
    public static final class VolumeBroadcastReceiver extends BroadcastReceiver {

        /* renamed from: a */
        public final WeakReference<WebViewVideoEventHandler> f119768a;

        /* renamed from: b */
        public final String f119769b = "MicroMsg.VolumeBroadcastReceiver";

        public VolumeBroadcastReceiver(WeakReference<WebViewVideoEventHandler> weakReference) {
            C87412m.m108594g(weakReference, "weakEventHandler");
            this.f119768a = weakReference;
        }

        public void onReceive(Context context, Intent intent) {
            if (context != null && intent != null && C87412m.m108589b("android.media.VOLUME_CHANGED_ACTION", intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                Log.m105918d(this.f119769b, "onReceive action");
                try {
                    WebViewVideoEventHandler webViewVideoEventHandler = this.f119768a.get();
                    if (webViewVideoEventHandler != null) {
                        webViewVideoEventHandler.mo68857a("onVolumeChange", webViewVideoEventHandler.mo68859c());
                    }
                } catch (JSONException e) {
                    String str = this.f119769b;
                    Log.m105920e(str, "onVolumeChange fail " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.WebViewVideoEventHandler$a */
    public static final class C44206a extends ContentObserver {

        /* renamed from: a */
        public final WeakReference<WebViewVideoEventHandler> f119770a;

        /* renamed from: b */
        public final String f119771b = "MicroMsg.BrightnessObserver";

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44206a(Handler handler, WeakReference<WebViewVideoEventHandler> weakReference) {
            super(handler);
            C87412m.m108594g(weakReference, "weakEventHandler");
            this.f119770a = weakReference;
        }

        public void onChange(boolean z) {
            String str = this.f119771b;
            Log.m105918d(str, "onChange selfChange=" + z);
            try {
                WebViewVideoEventHandler webViewVideoEventHandler = this.f119770a.get();
                if (webViewVideoEventHandler != null) {
                    JSONObject c = webViewVideoEventHandler.mo68859c();
                    c.put("selfChange", z);
                    webViewVideoEventHandler.mo68857a("onBrightnessChange", c);
                }
            } catch (JSONException e) {
                String str2 = this.f119771b;
                Log.m105920e(str2, "onBrightnessChange fail  " + e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.WebViewVideoEventHandler$b */
    public static final class C44207b extends C39754e {

        /* renamed from: a */
        public final /* synthetic */ WebViewVideoEventHandler f119772a;

        public C44207b(WebViewVideoEventHandler webViewVideoEventHandler) {
            this.f119772a = webViewVideoEventHandler;
        }

        /* renamed from: a */
        public void mo62392a() {
            try {
                this.f119772a.mo68857a("onEnterFullscreen", this.f119772a.mo68859c());
            } catch (JSONException e) {
                Log.m105921e(this.f119772a.f119752a, "OnXWebVideoError fail", e);
            }
        }

        /* renamed from: b */
        public void mo62393b() {
            try {
                this.f119772a.mo68857a("onExitFullscreen", this.f119772a.mo68859c());
            } catch (JSONException e) {
                Log.m105921e(this.f119772a.f119752a, "OnXWebVideoError fail", e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.WebViewVideoEventHandler$c */
    public static final class C44208c implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ WebViewVideoEventHandler f119773d;

        public C44208c(WebViewVideoEventHandler webViewVideoEventHandler) {
            this.f119773d = webViewVideoEventHandler;
        }

        public final boolean onTimerExpired() {
            WebViewVideoEventHandler webViewVideoEventHandler = this.f119773d;
            C16886m mVar = webViewVideoEventHandler.f119754c;
            if (mVar != null) {
                C87760d dVar = mVar.f45684n;
                int currentPosition = dVar != null ? dVar.getCurrentPosition() : 0;
                double d = (double) 1000;
                int i = (int) (this.f119773d.f119755d * d);
                try {
                    if (Math.abs(currentPosition - webViewVideoEventHandler.f119756e) >= 250) {
                        webViewVideoEventHandler.f119756e = currentPosition;
                        double d2 = (((double) i) * 1.0d) / d;
                        double doubleValue = new BigDecimal((((double) currentPosition) * 1.0d) / d).setScale(3, 4).doubleValue();
                        JSONObject c = webViewVideoEventHandler.mo68859c();
                        c.put("position", doubleValue);
                        c.put("duration", d2);
                        webViewVideoEventHandler.mo68857a("onVideoTimeUpdate", c);
                    }
                } catch (JSONException e) {
                    Log.m105921e(webViewVideoEventHandler.f119752a, "OnXWebVideoTimeUpdate fail", e);
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo68857a(String str, JSONObject jSONObject) {
        C39934d dVar = this.f119753b;
        if (dVar != null) {
            jSONObject.put("__timestamp", System.currentTimeMillis());
            Bundle bundle = dVar.f107068b.f38992e;
            String str2 = (bundle == null || !bundle.containsKey("name")) ? null : (String) dVar.f107068b.f38992e.get("name");
            if (!Util.isNullOrNil(str2)) {
                C13849g gVar = dVar.f107067a.f39001d;
                if (gVar instanceof C48590l) {
                    C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
                    C44463z z = ((C48590l) gVar).mo73268z();
                    if (z != null) {
                        C87412m.m108591d(str2);
                        String jSONObject2 = jSONObject.toString();
                        C87412m.m108594g(str, "event");
                        z.mo69227c().mo69180e(str2, str, jSONObject2);
                        return;
                    }
                    return;
                }
                return;
            }
            C13849g gVar2 = dVar.f107067a.f39001d;
            if (gVar2 instanceof C48590l) {
                C87412m.m108592e(gVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
                C48590l lVar = (C48590l) gVar2;
                if (!lVar.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "not ready");
                } else {
                    MMHandlerThread.postToMainThread(new C48610u0(lVar, C13851h1.C13852a.m13144d(str, jSONObject, lVar.f130011p, lVar.f130012q)));
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo68858b() {
        C18054e eVar = C18054e.f49894a;
        C16886m mVar = this.f119754c;
        String a = eVar.mo22563a(mVar != null ? mVar.f45651D : null);
        C16886m mVar2 = this.f119754c;
        boolean b = C87412m.m108589b(mVar2 != null ? mVar2.f45651D : null, (Object) null);
        boolean z = false;
        if (!b) {
            this.f119758g = 0;
        }
        long b2 = eVar.mo22564b(a);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("clientMediaId", a);
        C16886m mVar3 = this.f119754c;
        if (mVar3 != null) {
            z = ((Boolean) ((C36570n) mVar3.f45676W0).getValue()).booleanValue();
        }
        jSONObject.put("isOpenVideoPreload", z);
        jSONObject.put("previousCompletedSize", b2);
        jSONObject.put("playCount", this.f119758g);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "jsonObject.toString()");
        String str = this.f119752a;
        Log.m105924i(str, "generateWaitingReadyExtInfo:" + jSONObject2);
        return jSONObject2;
    }

    /* renamed from: c */
    public final JSONObject mo68859c() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = this.f119759h;
        if (jSONObject2 != null) {
            jSONObject.put("data", jSONObject2);
        }
        return jSONObject;
    }

    /* renamed from: d */
    public final void mo68860d() {
        Log.m105924i(this.f119752a, "onBufferReadyReport");
        if (C7616k.f25897a.mo8749a()) {
            try {
                mo68861e("BufferReady", (JSONObject) null);
            } catch (JSONException e) {
                Log.m105921e(this.f119752a, "onBufferReadyReport fail", e);
            }
        }
    }

    /* renamed from: e */
    public final void mo68861e(String str, JSONObject jSONObject) {
        String str2 = this.f119752a;
        Log.m105924i(str2, "onPlayerProcessStateChanged event=" + str);
        if (jSONObject == null) {
            try {
                jSONObject = mo68859c();
            } catch (JSONException e) {
                String str3 = this.f119752a;
                Log.m105921e(str3, "onPlayerProcessStateChanged " + str + " fail", e);
                return;
            }
        }
        jSONObject.put("event", str);
        mo68857a("onPlayerProcessStateChanged", jSONObject);
    }

    /* renamed from: f */
    public final void mo68862f(boolean z) {
        try {
            mo68857a("onVideoPause", mo68859c());
        } catch (JSONException e) {
            Log.m105921e(this.f119752a, "OnXWebVideoPause fail", e);
        }
        mo68867k();
        MMHandlerThread.postToMainThread(new C39941l(this));
    }

    /* renamed from: g */
    public final void mo68863g(boolean z) {
        try {
            this.f119756e = 0;
            mo68857a("onVideoPlay", mo68859c());
            mo68866j();
            MMHandlerThread.postToMainThread(new C39940k(this));
            Log.m105924i(this.f119752a, "onPlayingReport");
            if (C7616k.f25897a.mo8749a()) {
                try {
                    mo68861e("Playing", (JSONObject) null);
                } catch (JSONException e) {
                    Log.m105921e(this.f119752a, "onPlayingReport fail", e);
                }
            }
        } catch (JSONException e2) {
            Log.m105921e(this.f119752a, "OnXWebVideoPlay fail", e2);
        }
    }

    /* renamed from: h */
    public final void mo68864h() {
        try {
            mo68857a("onVideoWaiting", mo68859c());
        } catch (JSONException e) {
            Log.m105921e(this.f119752a, "OnXWebVideoWaiting fail", e);
        }
    }

    /* renamed from: i */
    public final void mo68865i(C91165a aVar) {
        Class cls = C45518r0.class;
        if (aVar instanceof C39934d) {
            C39934d dVar = (C39934d) aVar;
            this.f119753b = dVar;
            Context context = dVar.f107067a.f38998a;
            C39932b bVar = context instanceof C39932b ? (C39932b) context : null;
            if (bVar != null) {
                bVar.mo62535Y3(this.f119760i);
            }
            Context context2 = MMApplicationContext.getContext();
            C87412m.m108593f(context2, "getContext()");
            if (this.f119763l == null) {
                this.f119763l = new C53156a(context2, new C39938j(this));
            }
            if (this.f119764m == null) {
                this.f119764m = new C44206a(new Handler(), new WeakReference(this));
                ContentResolver contentResolver = MMApplicationContext.getContext().getApplicationContext().getContentResolver();
                Uri uriFor = Settings.System.getUriFor("screen_brightness");
                try {
                    ContentObserver contentObserver = this.f119764m;
                    C87412m.m108591d(contentObserver);
                    contentResolver.registerContentObserver(uriFor, false, contentObserver);
                } catch (Throwable th) {
                    Log.printErrStackTrace(this.f119752a, th, "initBrightnessObserver", new Object[0]);
                }
            }
            if (this.f119765n == null) {
                this.f119765n = new VolumeBroadcastReceiver(new WeakReference(this));
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                    MMApplicationContext.getContext().registerReceiver(this.f119765n, intentFilter);
                } catch (Throwable th4) {
                    Log.printErrStackTrace(this.f119752a, th4, "initBrightnessObserver", new Object[0]);
                }
            }
            C53156a aVar2 = this.f119763l;
            if (aVar2 != null) {
                aVar2.enable();
            }
            C43720k kVar = this.f119766o;
            if (!(kVar == null || ((C45518r0) C86312j.m106911c(cls)).gi0() == null)) {
                ArrayList<C43720k> arrayList = C44209a.f119775b;
                synchronized (arrayList) {
                    arrayList.remove(kVar);
                }
            }
            this.f119766o = new C39936h(this);
            C45514j0 gi02 = ((C45518r0) C86312j.m106911c(cls)).gi0();
            if (gi02 != null) {
                C43720k kVar2 = this.f119766o;
                C87412m.m108591d(kVar2);
                ((C44209a) gi02).mo68870a(kVar2);
            }
            C43721l lVar = this.f119767p;
            if (!(lVar == null || ((C45518r0) C86312j.m106911c(cls)).gi0() == null)) {
                ArrayList<C43721l> arrayList2 = C44209a.f119776c;
                synchronized (arrayList2) {
                    arrayList2.remove(lVar);
                }
            }
            this.f119767p = new C39937i(this);
            C45514j0 gi03 = ((C45518r0) C86312j.m106911c(cls)).gi0();
            if (gi03 != null) {
                C43721l lVar2 = this.f119767p;
                C87412m.m108591d(lVar2);
                ((C44209a) gi03).mo68871b(lVar2);
            }
        }
    }

    /* renamed from: j */
    public final void mo68866j() {
        Log.m105924i(this.f119752a, "start video update timer");
        if (this.f119757f == null) {
            Log.m105924i(this.f119752a, "start video update timer, create new timer");
            this.f119757f = new MTimerHandler("VideoUpdateTimer", (MTimerHandler.CallBack) new C44208c(this), true);
        }
        MTimerHandler mTimerHandler = this.f119757f;
        if (mTimerHandler != null) {
            mTimerHandler.startTimer(0, 250);
        }
    }

    /* renamed from: k */
    public final void mo68867k() {
        Log.m105924i(this.f119752a, "stop video update timer");
        MTimerHandler mTimerHandler = this.f119757f;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
    }
}
