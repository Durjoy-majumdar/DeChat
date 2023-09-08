package hn0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import org.json.JSONObject;

/* renamed from: hn0.b */
public class C20960b implements C82531i.C82534c {

    /* renamed from: d */
    public AppBrandVideoView f59401d;

    /* renamed from: e */
    public C82520h f59402e;

    /* renamed from: f */
    public MTimerHandler f59403f;

    /* renamed from: g */
    public int f59404g;

    /* renamed from: hn0.b$a */
    public static final class C20961a extends C82919r2 {
        private static final int CTRL_INDEX = 480;
        private static final String NAME = "onVideoCanPlay";

        public C20961a(C20959a aVar) {
        }
    }

    /* renamed from: hn0.b$b */
    public static final class C20962b extends C82919r2 {
        private static final int CTRL_INDEX = 131;
        private static final String NAME = "onVideoClickDanmuBtn";

        public C20962b(C20959a aVar) {
        }
    }

    /* renamed from: hn0.b$c */
    public static final class C20963c extends C82919r2 {
        private static final int CTRL_INDEX = 129;
        private static final String NAME = "onVideoEnded";

        public C20963c(C20959a aVar) {
        }
    }

    /* renamed from: hn0.b$d */
    public static final class C20964d extends C82919r2 {
        private static final int CTRL_INDEX = 349;
        private static final String NAME = "onVideoError";

        public C20964d(C20959a aVar) {
        }
    }

    /* renamed from: hn0.b$e */
    public static final class C20965e extends C82919r2 {
        private static final int CTRL_INDEX = 130;
        private static final String NAME = "onVideoFullScreenChange";

        public C20965e(C20959a aVar) {
        }
    }

    /* renamed from: hn0.b$f */
    public static final class C20966f extends C82919r2 {
        private static final int CTRL_INDEX = 628;
        private static final String NAME = "onVideoLoadedMetaData";

        public C20966f(C20959a aVar) {
        }
    }

    /* renamed from: hn0.b$g */
    public static final class C20967g extends C82919r2 {
        private static final int CTRL_INDEX = 128;
        private static final String NAME = "onVideoPause";

        public C20967g(C20959a aVar) {
        }
    }

    /* renamed from: hn0.b$h */
    public static final class C20968h extends C82919r2 {
        private static final int CTRL_INDEX = 127;
        private static final String NAME = "onVideoPlay";

        public C20968h(C20959a aVar) {
        }
    }

    /* renamed from: hn0.b$i */
    public static final class C20969i extends C82919r2 {
        private static final int CTRL_INDEX = 548;
        private static final String NAME = "onVideoProgress";

        public C20969i(C20959a aVar) {
        }
    }

    /* renamed from: hn0.b$l */
    public static final class C20970l extends C82919r2 {
        private static final int CTRL_INDEX = 138;
        private static final String NAME = "onVideoTimeUpdate";

        public C20970l(C20959a aVar) {
        }
    }

    /* renamed from: hn0.b$m */
    public static final class C20971m extends C82919r2 {
        private static final int CTRL_INDEX = 350;
        private static final String NAME = "onVideoWaiting";

        public C20971m(C20959a aVar) {
        }
    }

    /* renamed from: hn0.b$j */
    public static final class C20972j extends C82919r2 {
        private static final int CTRL_INDEX = 484;
        private static final String NAME = "onVideoResourceError";
    }

    /* renamed from: hn0.b$k */
    public static final class C20973k extends C82919r2 {
        private static final int CTRL_INDEX = 483;
        private static final String NAME = "onVideoResourceLoad";
    }

    public C20960b(AppBrandVideoView appBrandVideoView, C82520h hVar) {
        this.f59401d = appBrandVideoView;
        this.f59402e = hVar;
        hVar.mo114865m(this);
    }

    /* renamed from: b */
    public final void mo32716b(C82919r2 r2Var, JSONObject jSONObject) {
        if (!(r2Var instanceof C20970l) && !(r2Var instanceof C20969i)) {
            Log.m105925i("MicroMsg.Video.JsApiVideoCallback", "dispatchEvent event %s", r2Var.mo114779e());
        }
        this.f59402e.mo109669n(r2Var.mo115163m(jSONObject.toString()), (int[]) null);
    }

    /* renamed from: c */
    public final JSONObject mo32717c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", this.f59401d.getCookieData());
        return jSONObject;
    }

    public void onDestroy() {
        Log.m105918d("MicroMsg.Video.JsApiVideoCallback", "onDestroy clean");
        this.f59402e.mo114867r(this);
        MTimerHandler mTimerHandler = this.f59403f;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        this.f59401d.setCallback((C20960b) null);
    }
}
