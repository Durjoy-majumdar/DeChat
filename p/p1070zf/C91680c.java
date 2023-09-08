package p1070zf;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86195z;
import gy3.C87412m;
import jk0.C87979e;
import o40.C61926c;
import org.json.JSONObject;
import p000ag.C27884e;
import p000ag.C39564h;
import p000ag.C79533b;
import p000ag.C79538i;
import q52.C62582g;

/* renamed from: zf.c */
public final class C91680c extends C87979e<C82520h> {
    public static final int CTRL_INDEX = 1196;
    public static final String NAME = "removeMiniProgramPlayableView";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        int i = jSONObject.getInt("viewId");
        Log.m105924i("MicroMsg.MagicPlayable.JsApiRemoveMiniProgramPlayableView", "getViewId: " + i);
        return i;
    }

    /* renamed from: D */
    public boolean mo110323D(C82520h hVar, int i, View view, JSONObject jSONObject) {
        Log.m105924i("MicroMsg.MagicPlayable.JsApiRemoveMiniProgramPlayableView", "onRemoveView");
        Log.m105924i("MagicPlayableMgr", "releasePlayableService");
        C79538i iVar = C79533b.f233185a;
        if (iVar == null) {
            return true;
        }
        Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "cleanup");
        C61926c.m72668M(new C39564h(iVar));
        C86195z<C79538i> zVar = iVar.f233192a;
        if (zVar != null) {
            zVar.destroy();
            C62582g gVar = iVar.f233197f;
            if (gVar != null) {
                gVar.mo87640d();
            }
            C27884e.f77039a.mo55660a().clearAll();
            return true;
        }
        C87412m.m108603p("magicBrush");
        throw null;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105924i("MicroMsg.MagicPlayable.JsApiRemoveMiniProgramPlayableView", "invoke");
        mo114531v(fVar, jSONObject, i, fVar.getJsRuntime());
    }
}
