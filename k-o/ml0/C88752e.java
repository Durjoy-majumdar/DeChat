package ml0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.page.C83798e4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLiveBase;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLivePlayer;
import jk0.C87978d;
import ml0.C88746b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ml0.e */
public class C88752e extends C87978d {
    private static final int CTRL_INDEX = 364;
    public static final String NAME = "insertLivePlayer";

    /* renamed from: ml0.e$a */
    public class C88753a implements C83798e4 {

        /* renamed from: a */
        public final /* synthetic */ C88746b f256162a;

        public C88753a(C88752e eVar, C88746b bVar) {
            this.f256162a = bVar;
        }

        /* renamed from: a */
        public void mo22379a() {
            C88746b bVar = this.f256162a;
            bVar.getClass();
            Log.m105924i("MicroMsg.AppBrandLivePlayerView", "onExitFullScreen");
            bVar.mo123189b(false);
        }
    }

    /* renamed from: ml0.e$b */
    public class C88754b implements C82531i.C82535d {

        /* renamed from: d */
        public final /* synthetic */ C88746b f256163d;

        public C88754b(C88752e eVar, C88746b bVar) {
            this.f256163d = bVar;
        }

        /* renamed from: c */
        public void mo22090c() {
            C21511u b = ((C88782y) this.f256163d.f256156e).mo14922b();
            Log.m105925i("MicroMsg.AppBrandLivePlayerView", "onForeground code:%d info:%s", Integer.valueOf(b.f60905a), b.f60906b);
        }
    }

    /* renamed from: ml0.e$c */
    public class C88755c implements C82531i.C82533b {

        /* renamed from: d */
        public final /* synthetic */ C82520h f256164d;

        /* renamed from: e */
        public final /* synthetic */ C88746b f256165e;

        public C88755c(C88752e eVar, C82520h hVar, C88746b bVar) {
            this.f256164d = hVar;
            this.f256165e = bVar;
        }

        /* renamed from: b */
        public void mo22089b() {
            C83231l.C83235e d = C83231l.m102143d(this.f256164d.getAppId());
            Log.m105925i("MicroMsg.JsApiInsertLivePlayer", "LivePlayer enter background, pause type:%s", d.name());
            C88746b bVar = this.f256165e;
            C21511u l = ((C88782y) bVar.f256156e).mo33726l(bVar.f256155d, d);
            Log.m105925i("MicroMsg.AppBrandLivePlayerView", "onBackground code:%d info:%s", Integer.valueOf(l.f60905a), l.f60906b);
        }
    }

    /* renamed from: ml0.e$d */
    public class C88756d implements C82531i.C82534c {

        /* renamed from: d */
        public final /* synthetic */ C88746b f256166d;

        /* renamed from: e */
        public final /* synthetic */ C82520h f256167e;

        public C88756d(C88752e eVar, C88746b bVar, C82520h hVar) {
            this.f256166d = bVar;
            this.f256167e = hVar;
        }

        public void onDestroy() {
            this.f256166d.mo123188a();
            this.f256167e.mo114867r(this);
        }
    }

    /* renamed from: ml0.e$e */
    public class C88757e implements C88746b.C88747a {

        /* renamed from: a */
        public final /* synthetic */ C82520h f256168a;

        /* renamed from: b */
        public final /* synthetic */ boolean f256169b;

        /* renamed from: c */
        public final /* synthetic */ int f256170c;

        /* renamed from: d */
        public final /* synthetic */ C83798e4 f256171d;

        public C88757e(C88752e eVar, C82520h hVar, boolean z, int i, C83798e4 e4Var) {
            this.f256168a = hVar;
            this.f256169b = z;
            this.f256170c = i;
            this.f256171d = e4Var;
        }
    }

    /* renamed from: ml0.e$f */
    public class C88758f implements C88746b.C88748b {

        /* renamed from: a */
        public final /* synthetic */ C82520h f256172a;

        /* renamed from: b */
        public final /* synthetic */ C82531i.C82533b f256173b;

        /* renamed from: c */
        public final /* synthetic */ C82531i.C82535d f256174c;

        public C88758f(C88752e eVar, C82520h hVar, C82531i.C82533b bVar, C82531i.C82535d dVar) {
            this.f256172a = hVar;
            this.f256173b = bVar;
            this.f256174c = dVar;
        }
    }

    /* renamed from: ml0.e$g */
    public class C88759g implements C88746b.C88749c {

        /* renamed from: a */
        public final /* synthetic */ int f256175a;

        /* renamed from: b */
        public final /* synthetic */ C82520h f256176b;

        public C88759g(C88752e eVar, int i, C82520h hVar) {
            this.f256175a = i;
            this.f256176b = hVar;
        }
    }

    /* renamed from: ml0.e$h */
    public class C88760h implements ITXLivePlayListener {

        /* renamed from: d */
        public final /* synthetic */ int f256177d;

        /* renamed from: e */
        public final /* synthetic */ C82520h f256178e;

        public C88760h(C88752e eVar, int i, C82520h hVar) {
            this.f256177d = i;
            this.f256178e = hVar;
        }

        public void onNetStatus(Bundle bundle) {
            C88764l lVar = new C88764l((C88753a) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("livePlayerId", this.f256177d);
                JSONObject jSONObject2 = new JSONObject();
                if (bundle != null) {
                    for (String next : bundle.keySet()) {
                        jSONObject2.put(next, bundle.get(next));
                    }
                }
                jSONObject.put("info", jSONObject2);
            } catch (JSONException unused) {
            }
            C82520h hVar = this.f256178e;
            lVar.f242407f = jSONObject.toString();
            hVar.mo109669n(lVar, (int[]) null);
        }

        public void onPlayEvent(int i, Bundle bundle) {
            Log.m105925i("MicroMsg.JsApiInsertLivePlayer", "onPlayEvent errCode:%d", Integer.valueOf(i));
            C88765m mVar = new C88765m((C88753a) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errCode", i);
                jSONObject.put("errMsg", bundle.getString(TXLiveConstants.EVT_DESCRIPTION));
                jSONObject.put("livePlayerId", this.f256177d);
            } catch (JSONException unused) {
            }
            C82520h hVar = this.f256178e;
            mVar.f242407f = jSONObject.toString();
            hVar.mo109669n(mVar, (int[]) null);
        }
    }

    /* renamed from: ml0.e$i */
    public class C88761i implements TXLivePlayer.ITXAudioVolumeEvaluationListener {

        /* renamed from: a */
        public final /* synthetic */ int f256179a;

        /* renamed from: b */
        public final /* synthetic */ C82520h f256180b;

        public C88761i(C88752e eVar, int i, C82520h hVar) {
            this.f256179a = i;
            this.f256180b = hVar;
        }

        public void onAudioVolumeEvaluationNotify(int i) {
            C88762j jVar = new C88762j((C88753a) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("livePlayerId", this.f256179a);
                jSONObject.put("volume", i);
            } catch (JSONException unused) {
            }
            C82520h hVar = this.f256180b;
            jVar.f242407f = jSONObject.toString();
            hVar.mo109669n(jVar, (int[]) null);
        }
    }

    /* renamed from: ml0.e$j */
    public static final class C88762j extends C82919r2 {
        private static final int CTRL_INDEX = 709;
        private static final String NAME = "onLivePlayerAudioVolume";

        public C88762j(C88753a aVar) {
        }
    }

    /* renamed from: ml0.e$k */
    public static final class C88763k extends C82919r2 {
        private static final int CTRL_INDEX = 371;
        private static final String NAME = "onLivePlayerFullScreenChange";

        public C88763k(C88753a aVar) {
        }
    }

    /* renamed from: ml0.e$l */
    public static final class C88764l extends C82919r2 {
        private static final int CTRL_INDEX = 412;
        private static final String NAME = "onLivePlayerNetStatus";

        public C88764l(C88753a aVar) {
        }
    }

    /* renamed from: ml0.e$m */
    public static final class C88765m extends C82919r2 {
        private static final int CTRL_INDEX = 369;
        private static final String NAME = "onLivePlayerEvent";

        public C88765m(C88753a aVar) {
        }
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("livePlayerId");
    }

    /* renamed from: E */
    public View mo22377E(C82520h hVar, JSONObject jSONObject) {
        CoverViewContainer coverViewContainer = new CoverViewContainer(hVar.getContext(), (View) new C88746b(hVar, hVar.getContext()));
        coverViewContainer.setBackgroundColor(-16777216);
        return coverViewContainer;
    }

    /* renamed from: H */
    public void mo22378H(C82520h hVar, int i, View view, JSONObject jSONObject) {
        int i2;
        Context context;
        C82520h hVar2 = hVar;
        int i3 = i;
        View view2 = view;
        JSONObject jSONObject2 = jSONObject;
        Log.m105925i("MicroMsg.JsApiInsertLivePlayer", "onInsertView livePlayerId=%d", Integer.valueOf(i));
        if (!(view2 instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.JsApiInsertLivePlayer", "the view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return;
        }
        TXLiveBase.setAppVersion(String.format("weixin_%s", new Object[]{hVar.getAppId()}));
        C88746b bVar = (C88746b) ((CoverViewContainer) view2).mo114736d(C88746b.class);
        C88753a aVar = new C88753a(this, bVar);
        C88754b bVar2 = new C88754b(this, bVar);
        C88755c cVar = new C88755c(this, hVar2, bVar);
        C88756d dVar = new C88756d(this, bVar, hVar2);
        hVar2.mo114868y(bVar2);
        hVar2.mo114864j(cVar);
        hVar2.mo114865m(dVar);
        C88757e eVar = r0;
        C88757e eVar2 = new C88757e(this, hVar, jSONObject2.optBoolean("independent", false), i, aVar);
        bVar.setFullScreenDelegate(eVar);
        bVar.setExitListener(new C88758f(this, hVar2, cVar, bVar2));
        bVar.setNeedEvent(jSONObject2.optBoolean("needEvent", false));
        bVar.setOnFullScreenChangeListener(new C88759g(this, i3, hVar2));
        Bundle a = C88781x.m110845a(jSONObject);
        C21511u g = ((C88782y) bVar.f256156e).mo14927g(bVar, a);
        Log.m105925i("MicroMsg.AppBrandLivePlayerView", "onInsert code:%d info:%s", Integer.valueOf(g.f60905a), g.f60906b);
        bVar.setPlayEventListener(new C88760h(this, i3, hVar2));
        bVar.setAudioVolumeEventListener(new C88761i(this, i3, hVar2));
        if (a.getInt("mode", 0) == 5) {
            context = view.getContext();
            i2 = C0966R.string.f7582ka;
        } else {
            context = view.getContext();
            i2 = C0966R.string.f7581k_;
        }
        bVar.setContentDescription(context.getString(i2));
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C61498w.m72203a();
        mo114531v(fVar, jSONObject, i, fVar.getJsRuntime());
    }
}
