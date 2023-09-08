package g70;

import android.view.ViewGroup;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import i70.C87665a;
import i70.C87667c;
import i70.C87674f;
import n70.C47167a;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: g70.h */
public final class C87163h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C87164i f252782d;

    /* renamed from: e */
    public final /* synthetic */ int f252783e;

    /* renamed from: f */
    public final /* synthetic */ int f252784f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87163h(C87164i iVar, int i, int i2) {
        super(0);
        this.f252782d = iVar;
        this.f252783e = i;
        this.f252784f = i2;
    }

    public Object invoke() {
        int i;
        MagicSclViewContainer magicSclViewContainer = this.f252782d.f252796l;
        ViewGroup.LayoutParams layoutParams = magicSclViewContainer != null ? magicSclViewContainer.getLayoutParams() : null;
        int i2 = this.f252783e;
        C87164i iVar = this.f252782d;
        int i3 = iVar.f252790f;
        boolean z = ((i2 == i3 || i2 == 0) && ((i = this.f252784f) == iVar.f252791g || i == 0)) ? false : true;
        if (i2 > 0 && i2 != i3) {
            iVar.f252790f = i2;
            if (layoutParams != null) {
                layoutParams.width = C47167a.m52445b(Integer.valueOf(i2));
            }
        }
        int i4 = this.f252784f;
        if (i4 > 0) {
            C87164i iVar2 = this.f252782d;
            if (i4 != iVar2.f252791g) {
                iVar2.f252791g = i4;
                if (layoutParams != null) {
                    layoutParams.height = C47167a.m52445b(Integer.valueOf(i4));
                }
            }
        }
        if (z) {
            C87164i iVar3 = this.f252782d;
            C87667c<?, ?>.a aVar = iVar3.f252787c;
            if (aVar != null) {
                String p0 = aVar.f253932g.mo122096p0();
                Log.m105924i(p0, "resize " + iVar3);
                C87667c<ViewType, T> cVar = aVar.f253932g;
                cVar.getClass();
                C87674f fVar = cVar.f253916c;
                fVar.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("frameSetRootId", aVar.f253930e);
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("frameSetId", iVar3.f252786b);
                jSONObject2.put("viewId", iVar3.f252800p);
                jSONObject2.put("frameSetName", iVar3.f252785a);
                jSONObject2.put("width", iVar3.f252790f);
                jSONObject2.put("height", iVar3.f252791g);
                jSONArray.put(jSONObject2);
                C13598b0 b0Var = C13598b0.f38549a;
                jSONObject.put("frameSets", jSONArray);
                String jSONObject3 = jSONObject.toString();
                C87412m.m108593f(jSONObject3, "JSONObject().apply {\n   …  })\n        }.toString()");
                fVar.mo122111a("surface:frameSet:resize", jSONObject3);
                C87665a aVar2 = aVar.f253932g.f253924k;
                if (aVar2 != null) {
                    aVar2.mo121196l(iVar3);
                }
            }
            C32224a<C13598b0> aVar3 = this.f252782d.f252793i;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        }
        MagicSclViewContainer magicSclViewContainer2 = this.f252782d.f252796l;
        if (magicSclViewContainer2 != null) {
            magicSclViewContainer2.setLayoutParams(layoutParams);
        }
        return C13598b0.f38549a;
    }
}
