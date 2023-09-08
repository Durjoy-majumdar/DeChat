package p1070zf;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86195z;
import gy3.C87412m;
import jk0.C87981f;
import org.json.JSONObject;
import p000ag.C79533b;
import p000ag.C79538i;

/* renamed from: zf.d */
public final class C91681d extends C87981f<C82520h> {
    public static final int CTRL_INDEX = 1195;
    public static final String NAME = "updateMiniProgramPlayableView";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        int i = jSONObject.getInt("viewId");
        Log.m105924i("MicroMsg.MagicPlayable.JsApiUpdateMiniProgramPlayableView", "viewId:" + i);
        return i;
    }

    /* renamed from: E */
    public boolean mo22381E(C82520h hVar, int i, View view, JSONObject jSONObject) {
        Log.m105924i("MicroMsg.MagicPlayable.JsApiUpdateMiniProgramPlayableView", "onUpdateView");
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C87412m.m108594g(fVar, "component");
        C87412m.m108594g(jSONObject, "data");
        Log.m105924i("MicroMsg.MagicPlayable.JsApiUpdateMiniProgramPlayableView", "invoke");
        if (jSONObject.has("resume") && jSONObject.optBoolean("resume", true)) {
            Log.m105924i("MagicPlayableMgr", "manualResume");
            C79538i iVar = C79533b.f233185a;
            if (iVar != null) {
                Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "manualResume");
                if (iVar.f233196e) {
                    C86195z<C79538i> zVar = iVar.f233192a;
                    if (zVar != null) {
                        zVar.resume();
                        iVar.f233196e = false;
                    } else {
                        C87412m.m108603p("magicBrush");
                        throw null;
                    }
                }
            }
        }
        if (jSONObject.has("mute")) {
            boolean optBoolean = jSONObject.optBoolean("mute");
            Log.m105924i("MagicPlayableMgr", "muteAudio mute:" + optBoolean);
            C79538i iVar2 = C79533b.f233185a;
            if (iVar2 != null) {
                Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "muteAudio mute:" + optBoolean);
                C86195z<C79538i> zVar2 = iVar2.f233192a;
                if (zVar2 != null) {
                    zVar2.setMute(optBoolean);
                } else {
                    C87412m.m108603p("magicBrush");
                    throw null;
                }
            }
        }
        if ((BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) && jSONObject.optBoolean("forceEnd", false)) {
            Log.m105924i("MagicPlayableMgr", "setTestForceEnd");
            C79538i iVar3 = C79533b.f233185a;
            if (iVar3 != null) {
                C79533b.C79534a aVar = iVar3.f233195d;
                if (aVar != null) {
                    aVar.mo109573a(0, "");
                } else {
                    C87412m.m108603p("playableContainerViewCallback");
                    throw null;
                }
            }
        }
        mo114531v(fVar, jSONObject, i, fVar.getJsRuntime());
    }
}
