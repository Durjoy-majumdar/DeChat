package com.tencent.p014mm.plugin.appbrand.jsapi.live;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView;
import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLiveBase;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLivePusher;
import jk0.C87978d;
import ml0.C21511u;
import ml0.C61498w;
import ml0.C88745a0;
import ml0.C88766f;
import ml0.C88767g;
import ml0.C88768h;
import ml0.C88781x;
import org.json.JSONException;
import org.json.JSONObject;
import p225rc.C89922k;
import p918s2.C90111a;
import wq0.C91085v;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a */
public class C82618a extends C87978d {
    private static final int CTRL_INDEX = 360;
    public static final String NAME = "insertLivePusher";

    /* renamed from: g */
    public int f241768g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$a */
    public class C82619a implements C90111a.C90113b {

        /* renamed from: d */
        public final /* synthetic */ Activity f241769d;

        /* renamed from: e */
        public final /* synthetic */ C82381f f241770e;

        /* renamed from: f */
        public final /* synthetic */ JSONObject f241771f;

        /* renamed from: g */
        public final /* synthetic */ int f241772g;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$a$a */
        public class C82620a implements Runnable {
            public C82620a() {
            }

            public void run() {
                C82619a aVar = C82619a.this;
                C82618a.this.mo114920J(aVar.f241769d, aVar.f241770e, aVar.f241771f, aVar.f241772g);
            }
        }

        public C82619a(Activity activity, C82381f fVar, JSONObject jSONObject, int i) {
            this.f241769d = activity;
            this.f241770e = fVar;
            this.f241771f = jSONObject;
            this.f241772g = i;
        }

        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            Log.m105925i("MicroMsg.JsApiInsertLivePusher", "onRequestPermissionsResult callback requestCode:%d", Integer.valueOf(i));
            if (i == 117) {
                if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                    Log.m105924i("MicroMsg.JsApiInsertLivePusher", "onRequestPermissionsResult callback not grant");
                    Log.m105924i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, super.invoke");
                    C82618a aVar = C82618a.this;
                    C82381f fVar = this.f241770e;
                    JSONObject jSONObject = this.f241771f;
                    int i2 = this.f241772g;
                    aVar.getClass();
                    aVar.mo114531v(fVar, jSONObject, i2, fVar.getJsRuntime());
                } else {
                    MMHandlerThread.postToMainThreadDelayed(new C82620a(), 50);
                }
            }
            C91085v.m114267b(this.f241770e.getAppId(), this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$b */
    public class C82621b implements C90111a.C90113b {

        /* renamed from: d */
        public final /* synthetic */ Activity f241775d;

        /* renamed from: e */
        public final /* synthetic */ C82381f f241776e;

        /* renamed from: f */
        public final /* synthetic */ JSONObject f241777f;

        /* renamed from: g */
        public final /* synthetic */ int f241778g;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$b$a */
        public class C82622a implements Runnable {
            public C82622a() {
            }

            public void run() {
                C82621b bVar = C82621b.this;
                C82618a.this.mo114920J(bVar.f241775d, bVar.f241776e, bVar.f241777f, bVar.f241778g);
            }
        }

        public C82621b(Activity activity, C82381f fVar, JSONObject jSONObject, int i) {
            this.f241775d = activity;
            this.f241776e = fVar;
            this.f241777f = jSONObject;
            this.f241778g = i;
        }

        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            Log.m105925i("MicroMsg.JsApiInsertLivePusher", "onRequestPermissionsResult callback requestCode:%d", Integer.valueOf(i));
            if (i == 118) {
                if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                    Log.m105924i("MicroMsg.JsApiInsertLivePusher", "onRequestPermissionsResult callback not grant");
                    Log.m105924i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, super.invoke");
                    C82618a aVar = C82618a.this;
                    C82381f fVar = this.f241776e;
                    JSONObject jSONObject = this.f241777f;
                    int i2 = this.f241778g;
                    aVar.getClass();
                    aVar.mo114531v(fVar, jSONObject, i2, fVar.getJsRuntime());
                } else {
                    MMHandlerThread.postToMainThreadDelayed(new C82622a(), 50);
                }
                C91085v.m114267b(this.f241776e.getAppId(), this);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$c */
    public class C82623c implements C82531i.C82535d {

        /* renamed from: d */
        public final /* synthetic */ AppBrandLivePusherView f241781d;

        public C82623c(C82618a aVar, AppBrandLivePusherView appBrandLivePusherView) {
            this.f241781d = appBrandLivePusherView;
        }

        /* renamed from: c */
        public void mo22090c() {
            AppBrandLivePusherView appBrandLivePusherView = this.f241781d;
            C21511u b = ((C88745a0) appBrandLivePusherView.f241760i).mo33714b();
            Log.m105925i("MicroMsg.AppBrandLivePusherView", "onForeground code:%d info:%s", Integer.valueOf(b.f60905a), b.f60906b);
            appBrandLivePusherView.f241755d.enable();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$d */
    public class C82624d implements C82531i.C82533b {

        /* renamed from: d */
        public final /* synthetic */ AppBrandLivePusherView f241782d;

        public C82624d(C82618a aVar, AppBrandLivePusherView appBrandLivePusherView) {
            this.f241782d = appBrandLivePusherView;
        }

        /* renamed from: b */
        public void mo22089b() {
            AppBrandLivePusherView appBrandLivePusherView = this.f241782d;
            C21511u d = ((C88745a0) appBrandLivePusherView.f241760i).mo33715d(false);
            Log.m105925i("MicroMsg.AppBrandLivePusherView", "onBackground code:%d info:%s", Integer.valueOf(d.f60905a), d.f60906b);
            appBrandLivePusherView.f241755d.disable();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$e */
    public class C82625e extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ AppBrandLivePusherView f241783d;

        /* renamed from: e */
        public final /* synthetic */ C82520h f241784e;

        public C82625e(C82618a aVar, AppBrandLivePusherView appBrandLivePusherView, C82520h hVar) {
            this.f241783d = appBrandLivePusherView;
            this.f241784e = hVar;
        }

        /* renamed from: c */
        public void mo109497c() {
            C83231l.m102144e(this.f241784e.getAppId(), this);
        }

        /* renamed from: e */
        public void mo74049e(C83231l.C83235e eVar) {
            AppBrandLivePusherView appBrandLivePusherView = this.f241783d;
            appBrandLivePusherView.getClass();
            Log.m105925i("MicroMsg.AppBrandLivePusherView", "onAppBrandPause pauseType:%s", eVar);
            if (eVar == C83231l.C83235e.BACK || eVar == C83231l.C83235e.CLOSE || eVar == C83231l.C83235e.LAUNCH_MINI_PROGRAM) {
                ((C88745a0) appBrandLivePusherView.f241760i).mo33715d(true);
            }
        }

        /* renamed from: f */
        public void mo109498f() {
            ((C88745a0) this.f241783d.f241760i).mo33714b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$f */
    public class C82626f implements C82531i.C82534c {

        /* renamed from: d */
        public final /* synthetic */ AppBrandLivePusherView f241785d;

        /* renamed from: e */
        public final /* synthetic */ C82520h f241786e;

        /* renamed from: f */
        public final /* synthetic */ C83231l.C83234d f241787f;

        public C82626f(C82618a aVar, AppBrandLivePusherView appBrandLivePusherView, C82520h hVar, C83231l.C83234d dVar) {
            this.f241785d = appBrandLivePusherView;
            this.f241786e = hVar;
            this.f241787f = dVar;
        }

        public void onDestroy() {
            this.f241785d.mo114909e();
            this.f241786e.mo114867r(this);
            C83231l.m102144e(this.f241786e.getAppId(), this.f241787f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$g */
    public class C82627g implements AppBrandLivePusherView.C82617d {

        /* renamed from: a */
        public final /* synthetic */ C82520h f241788a;

        /* renamed from: b */
        public final /* synthetic */ C82531i.C82535d f241789b;

        /* renamed from: c */
        public final /* synthetic */ C82531i.C82533b f241790c;

        public C82627g(C82618a aVar, C82520h hVar, C82531i.C82535d dVar, C82531i.C82533b bVar) {
            this.f241788a = hVar;
            this.f241789b = dVar;
            this.f241790c = bVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$h */
    public class C82628h implements ITXLivePushListener {

        /* renamed from: c */
        public final /* synthetic */ int f241791c;

        /* renamed from: d */
        public final /* synthetic */ C82520h f241792d;

        public C82628h(C82618a aVar, int i, C82520h hVar) {
            this.f241791c = i;
            this.f241792d = hVar;
        }

        public void onNetStatus(Bundle bundle) {
            C82637q qVar = new C82637q((C82623c) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("livePusherId", this.f241791c);
                JSONObject jSONObject2 = new JSONObject();
                if (bundle != null) {
                    for (String next : bundle.keySet()) {
                        jSONObject2.put(next, bundle.get(next));
                    }
                }
                jSONObject.put("info", jSONObject2);
            } catch (JSONException unused) {
            }
            C82520h hVar = this.f241792d;
            qVar.f242407f = jSONObject.toString();
            hVar.mo109669n(qVar, (int[]) null);
        }

        public void onPushEvent(int i, Bundle bundle) {
            Log.m105925i("MicroMsg.JsApiInsertLivePusher", "onPushEvent errCode:%d", Integer.valueOf(i));
            C82638r rVar = new C82638r((C82623c) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errCode", i);
                jSONObject.put("errMsg", bundle.getString(TXLiveConstants.EVT_DESCRIPTION));
                jSONObject.put("livePusherId", this.f241791c);
            } catch (JSONException unused) {
            }
            C82520h hVar = this.f241792d;
            rVar.f242407f = jSONObject.toString();
            hVar.mo109669n(rVar, (int[]) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$i */
    public class C82629i implements TXLivePusher.OnBGMNotify {

        /* renamed from: c */
        public final /* synthetic */ int f241793c;

        /* renamed from: d */
        public final /* synthetic */ C82520h f241794d;

        public C82629i(C82618a aVar, int i, C82520h hVar) {
            this.f241793c = i;
            this.f241794d = hVar;
        }

        public void onBGMComplete(int i) {
            Log.m105925i("MicroMsg.JsApiInsertLivePusher", "onBGMComplete, error:%s", Integer.valueOf(i));
            C82633m mVar = new C82633m((C82623c) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errCode", i);
                jSONObject.put("livePusherId", this.f241793c);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiInsertLivePusher", "onBGMComplete fail", e);
            }
            C82520h hVar = this.f241794d;
            mVar.f242407f = jSONObject.toString();
            hVar.mo109669n(mVar, (int[]) null);
        }

        public void onBGMProgress(long j, long j2) {
            C82634n nVar = new C82634n((C82623c) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("progress", j);
                jSONObject.put("duration", j2);
                jSONObject.put("livePusherId", this.f241793c);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiInsertLivePusher", "onBGMProgress fail", e);
            }
            C82520h hVar = this.f241794d;
            nVar.f242407f = jSONObject.toString();
            hVar.mo109669n(nVar, (int[]) null);
        }

        public void onBGMStart() {
            Log.m105924i("MicroMsg.JsApiInsertLivePusher", "onBGMStart");
            C82635o oVar = new C82635o((C82623c) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("livePusherId", this.f241793c);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiInsertLivePusher", "onBGMStart fail", e);
            }
            C82520h hVar = this.f241794d;
            oVar.f242407f = jSONObject.toString();
            hVar.mo109669n(oVar, (int[]) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$j */
    public class C82630j implements AppBrandLivePusherView.C82616c {

        /* renamed from: a */
        public final /* synthetic */ int f241795a;

        /* renamed from: b */
        public final /* synthetic */ C82520h f241796b;

        public C82630j(C82618a aVar, int i, C82520h hVar) {
            this.f241795a = i;
            this.f241796b = hVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$k */
    public class C82631k implements TXLivePusher.ITXAudioVolumeEvaluationListener {

        /* renamed from: c */
        public final /* synthetic */ int f241797c;

        /* renamed from: d */
        public final /* synthetic */ C82520h f241798d;

        public C82631k(C82618a aVar, int i, C82520h hVar) {
            this.f241797c = i;
            this.f241798d = hVar;
        }

        public void onAudioVolumeEvaluationNotify(int i) {
            Log.m105925i("MicroMsg.JsApiInsertLivePusher", "onAudioVolumeEvaluationNotify, volume:%s", Integer.valueOf(i));
            C82632l lVar = new C82632l((C82623c) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("volume", i);
                jSONObject.put("livePusherId", this.f241797c);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiInsertLivePusher", "onAudioVolumeEvaluationNotify fail", e);
            }
            C82520h hVar = this.f241798d;
            lVar.f242407f = jSONObject.toString();
            hVar.mo109669n(lVar, (int[]) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$l */
    public static final class C82632l extends C82919r2 {
        private static final int CTRL_INDEX = 783;
        private static final String NAME = "onLivePusherAudioVolume";

        public C82632l(C82623c cVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$m */
    public static final class C82633m extends C82919r2 {
        private static final int CTRL_INDEX = 515;
        private static final String NAME = "onLivePusherBGMComplete";

        public C82633m(C82623c cVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$n */
    public static final class C82634n extends C82919r2 {
        private static final int CTRL_INDEX = 514;
        private static final String NAME = "onLivePusherBGMProgress";

        public C82634n(C82623c cVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$o */
    public static final class C82635o extends C82919r2 {
        private static final int CTRL_INDEX = 513;
        private static final String NAME = "onLivePusherBGMStart";

        public C82635o(C82623c cVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$p */
    public static final class C82636p extends C82919r2 {
        private static final int CTRL_INDEX = 531;
        private static final String NAME = "onLivePusherError";

        public C82636p(C82623c cVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$q */
    public static final class C82637q extends C82919r2 {
        private static final int CTRL_INDEX = 411;
        private static final String NAME = "onLivePusherNetStatus";

        public C82637q(C82623c cVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.a$r */
    public static final class C82638r extends C82919r2 {
        private static final int CTRL_INDEX = 368;
        private static final String NAME = "onLivePusherEvent";

        public C82638r(C82623c cVar) {
        }
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("livePusherId");
    }

    /* renamed from: E */
    public View mo22377E(C82520h hVar, JSONObject jSONObject) {
        return new CoverViewContainer(hVar.getContext(), (View) new AppBrandLivePusherView(hVar.getContext()));
    }

    /* renamed from: H */
    public void mo22378H(C82520h hVar, int i, View view, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.JsApiInsertLivePusher", "onInsertView livePusherId=%d", Integer.valueOf(i));
        if (!(view instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.JsApiInsertLivePusher", "the view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return;
        }
        TXLiveBase.setAppVersion(String.format("weixin_%s", new Object[]{hVar.getAppId()}));
        AppBrandLivePusherView appBrandLivePusherView = (AppBrandLivePusherView) ((CoverViewContainer) view).mo114736d(AppBrandLivePusherView.class);
        if (appBrandLivePusherView == null) {
            Log.m105920e("MicroMsg.JsApiInsertLivePusher", "pusherView null");
            return;
        }
        C82623c cVar = new C82623c(this, appBrandLivePusherView);
        C82624d dVar = new C82624d(this, appBrandLivePusherView);
        C82625e eVar = new C82625e(this, appBrandLivePusherView, hVar);
        C82626f fVar = new C82626f(this, appBrandLivePusherView, hVar, eVar);
        hVar.mo114868y(cVar);
        hVar.mo114864j(dVar);
        hVar.mo114865m(fVar);
        appBrandLivePusherView.setOnExitListener(new C82627g(this, hVar, cVar, dVar));
        C83231l.m102140a(hVar.getAppId(), eVar);
        appBrandLivePusherView.setOnPushEventListener(new C82628h(this, i, hVar));
        appBrandLivePusherView.setBGMNotifyListener(new C82629i(this, i, hVar));
        appBrandLivePusherView.setOnErrorListener(new C82630j(this, i, hVar));
        appBrandLivePusherView.setAudioVolumeNotifyListener(new C82631k(this, i, hVar));
        if (jSONObject.has(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE)) {
            appBrandLivePusherView.f241759h = jSONObject.optString(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, appBrandLivePusherView.f241759h);
            jSONObject.optString("filterImageMd5", (String) null);
            if (Util.isNullOrNil(appBrandLivePusherView.f241759h)) {
                try {
                    jSONObject.put(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, "");
                } catch (JSONException e) {
                    Log.m105929w("MicroMsg.JsApiInsertLivePusher", "parseFilterImage, ignore exception:%s", e);
                }
            } else if (appBrandLivePusherView.f241759h.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || appBrandLivePusherView.f241759h.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
                jSONObject.remove(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE);
            }
        }
        C21511u n = ((C88745a0) appBrandLivePusherView.f241760i).mo21079n(appBrandLivePusherView, C88781x.m110846b(jSONObject));
        Log.m105925i("MicroMsg.AppBrandLivePusherView", "onInsert code:%d info:%s", Integer.valueOf(n.f60905a), n.f60906b);
        String optString = jSONObject.optString(V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE);
        String optString2 = jSONObject.optString("backgroundMD5");
        if (Util.isNullOrNil(optString)) {
            Log.m105924i("MicroMsg.JsApiInsertLivePusher", "convertBackgroundImageToLocalPath, url is null");
        } else {
            C84795y.m104477c(hVar, optString, optString2, new C88766f(this, appBrandLivePusherView, optString));
        }
        String optString3 = jSONObject.optString(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE);
        if (Util.isNullOrNil(optString3)) {
            Log.m105924i("MicroMsg.JsApiInsertLivePusher", "convertFilterImageToLocalPath, url is null");
        } else {
            C84795y.m104477c(hVar, optString3, (String) null, new C88767g(this, appBrandLivePusherView, optString3));
        }
        String optString4 = jSONObject.optString(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_IMAGE);
        String optString5 = jSONObject.optString("watermarkMD5");
        if (Util.isNullOrNil(optString4)) {
            Log.m105924i("MicroMsg.JsApiInsertLivePusher", "convertWatermarkImageToLocalPath, url is null");
        } else {
            C84795y.m104477c(hVar, optString4, optString5, new C88768h(this, appBrandLivePusherView));
        }
        appBrandLivePusherView.setContentDescription(view.getContext().getString(C0966R.string.f7583kb));
    }

    /* renamed from: J */
    public final void mo114920J(Activity activity, C82381f fVar, JSONObject jSONObject, int i) {
        int i2 = this.f241768g;
        this.f241768g = i2 + 1;
        if (i2 > 5) {
            Log.m105924i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, avoid dead loop");
            return;
        }
        C91085v.m114266a(fVar.getAppId(), new C82619a(activity, fVar, jSONObject, i));
        C91085v.m114266a(fVar.getAppId(), new C82621b(activity, fVar, jSONObject, i));
        if (!C89922k.m112464a(activity, fVar, "android.permission.CAMERA", 117, "", "")) {
            Log.m105924i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, !retCameraPermission");
        } else if (!C89922k.m112464a(activity, fVar, "android.permission.RECORD_AUDIO", 118, "", "")) {
            Log.m105924i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, !retMicrophonePermission");
        } else {
            Log.m105924i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, super.invoke");
            mo114531v(fVar, jSONObject, i, fVar.getJsRuntime());
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C61498w.m72203a();
        if (!(fVar.getContext() instanceof Activity)) {
            Log.m105928w("MicroMsg.JsApiInsertLivePusher", "invokeAfterRequestPermission pageContext not activity");
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            fVar.mo109647a(i, mo115115p("fail:internal error", jSONObject2));
            C91085v.m114268c(fVar.getAppId());
            return;
        }
        this.f241768g = 0;
        mo114920J((Activity) fVar.getContext(), fVar, jSONObject, i);
    }
}
