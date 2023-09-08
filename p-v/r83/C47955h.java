package r83;

import com.tencent.p014mm.plugin.webview.fts.p810ui.FtsWebVideoView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSearchWebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import r83.C47951e;
import t83.C48590l;

/* renamed from: r83.h */
public class C47955h implements C47951e.C47952a {

    /* renamed from: a */
    public FtsWebVideoView f128644a;

    /* renamed from: b */
    public MTimerHandler f128645b;

    /* renamed from: c */
    public int f128646c;

    /* renamed from: d */
    public C48590l f128647d;

    public C47955h(FtsWebVideoView ftsWebVideoView, C47951e.C47953b bVar, C48590l lVar) {
        this.f128644a = ftsWebVideoView;
        ((HashSet) ((BaseSearchWebViewUI) bVar).f118876U2).add(this);
        this.f128647d = lVar;
    }

    /* renamed from: a */
    public void mo72717a() {
    }

    /* renamed from: b */
    public void mo72718b() {
    }

    /* renamed from: c */
    public void mo72719c() {
    }

    /* renamed from: d */
    public void mo72720d() {
    }

    /* renamed from: e */
    public void mo72721e() {
    }

    /* renamed from: f */
    public void mo72724f() {
        Log.m105925i("MicroMsg.JsApiVideoCallback", "clean %s", toString());
        MTimerHandler mTimerHandler = this.f128645b;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
    }

    /* renamed from: g */
    public final JSONObject mo72725g(int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("playerId", this.f128644a.getmVideoPlayerId());
        jSONObject2.put("event", i);
        if (jSONObject != null) {
            jSONObject2.put("detail", jSONObject);
        }
        return jSONObject2;
    }

    /* renamed from: h */
    public final JSONObject mo72726h() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", this.f128644a.getCookieData());
        return jSONObject;
    }

    /* renamed from: i */
    public void mo72727i() {
        try {
            JSONObject h = mo72726h();
            h.put("currentTime", this.f128644a.getCurrPosSec());
            mo72728j(mo72725g(6, h));
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.JsApiVideoCallback", e, (String) null, new Object[0]);
        }
    }

    /* renamed from: j */
    public final void mo72728j(JSONObject jSONObject) {
        this.f128647d.mo73236e0("onVideoPlayerCallback", (Map<String, Object>) null, jSONObject);
    }

    public boolean onBackPressed() {
        return false;
    }

    public void onDestroy() {
        Log.m105918d("MicroMsg.JsApiVideoCallback", "onDestroy clean");
        mo72724f();
        this.f128644a.setCallback((C47955h) null);
    }
}
