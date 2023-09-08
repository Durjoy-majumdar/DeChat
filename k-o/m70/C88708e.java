package m70;

import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86174d;
import d42.C86177e;
import di3.C86312j;
import e42.C31415g;
import e42.C86428f;
import fy3.C32224a;
import g70.C59376g;
import g70.C87163h;
import g70.C87164i;
import gy3.C87412m;
import h70.C87459d;
import o40.C61926c;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: m70.e */
public abstract class C88708e<ViewType, T extends C86428f<ViewType>> extends C88704c<ViewType, T> {

    /* renamed from: m70.e$a */
    public static final class C88709a implements C86174d<C13598b0> {

        /* renamed from: a */
        public final /* synthetic */ C88708e<ViewType, T> f256061a;

        public C88709a(C88708e<ViewType, T> eVar) {
            this.f256061a = eVar;
        }

        /* renamed from: a */
        public void mo120570a(C31415g gVar, Object obj) {
            C13598b0 b0Var = (C13598b0) obj;
            C87412m.m108594g(gVar, "errInfo");
            this.f256061a.mo123141r(gVar);
        }
    }

    /* renamed from: u */
    public void mo123143u(JSONObject jSONObject, ViewType viewtype, C86177e<ViewType, Object> eVar) {
        C32224a<C13598b0> aVar;
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(viewtype, "view");
        C87412m.m108594g(eVar, "parent");
        super.mo123143u(jSONObject, viewtype, eVar);
        mo123144v(viewtype, jSONObject, eVar);
        JSONObject optJSONObject = jSONObject.optJSONObject("position");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("status");
        if (optJSONObject2 != null) {
            int i = 0;
            int optInt = optJSONObject != null ? optJSONObject.optInt("width") : 0;
            if (optJSONObject != null) {
                i = optJSONObject.optInt("height");
            }
            String optString = optJSONObject2.optString("frameSetId");
            boolean optBoolean = optJSONObject2.optBoolean("isOutOfBounds");
            Log.m105924i("MicroMsg.MBJsApiUpdateFrameSetCommonView", "setFrameSetStatus " + optString + ' ' + optBoolean + ' ' + optInt + ' ' + i);
            C87412m.m108593f(optString, "frameSetId");
            C87164i uo = ((C87459d) C86312j.m106911c(C87459d.class)).mo58574uo(optString);
            C13598b0 b0Var = null;
            if (uo != null) {
                if (optJSONObject2.has("isOutOfBounds")) {
                    boolean z = !optBoolean;
                    uo.f252794j = z;
                    C61926c.m72668M(new C59376g(uo, z));
                }
                C61926c.m72668M(new C87163h(uo, optInt, i));
                if (i > 0 && (aVar = uo.f252792h) != null) {
                    aVar.invoke();
                    uo.f252792h = null;
                }
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105928w("MicroMsg.MBJsApiUpdateFrameSetCommonView", "frameSet not found!");
            }
        }
        eVar.mo120575a(viewtype, eVar.mo120579e(jSONObject), new C88709a(this));
    }
}
