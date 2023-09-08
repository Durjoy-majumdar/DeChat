package l42;

import android.util.DisplayMetrics;
import c30.C104289g;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d42.C86195z;
import gy3.C87412m;
import js0.C88020k;
import o42.C89116a;
import rx3.C13598b0;

/* renamed from: l42.c */
public final class C88382c extends C88381b {
    /* renamed from: b */
    public void mo109587b() {
        C104289g gVar = new C104289g();
        StringBuilder sb = new StringBuilder();
        sb.append("api:createCanvas:");
        C104289g gVar2 = new C104289g();
        DisplayMetrics displayMetrics = MMApplicationContext.getContext().getResources().getDisplayMetrics();
        C87412m.m108593f(displayMetrics, "getContext().getResources().getDisplayMetrics()");
        gVar2.mo145953n("width", C88020k.m109555f(displayMetrics.widthPixels));
        gVar2.mo145953n("height", 100);
        gVar2.mo145953n("top", 100);
        gVar2.mo145953n("left", 0);
        String gVar3 = gVar2.toString();
        C87412m.m108593f(gVar3, "JSONObject().apply {\n   …, 0)\n        }.toString()");
        sb.append(gVar3);
        gVar.put("msg", sb.toString());
        C13598b0 b0Var = C13598b0.f38549a;
        String gVar4 = gVar.toString();
        C87412m.m108593f(gVar4, "JSONObject().apply {\n   …a())\n        }.toString()");
        C86195z<C88381b> zVar = this.f255370b;
        if (zVar != null) {
            zVar.mo120601d("postMessage", gVar4);
            C104289g gVar5 = new C104289g();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("api:createCanvas:");
            C104289g gVar6 = new C104289g();
            DisplayMetrics displayMetrics2 = MMApplicationContext.getContext().getResources().getDisplayMetrics();
            C87412m.m108593f(displayMetrics2, "getContext().getResources().getDisplayMetrics()");
            gVar6.mo145953n("width", C88020k.m109555f(displayMetrics2.widthPixels));
            gVar6.mo145953n("height", 100);
            gVar6.mo145953n("top", 250);
            gVar6.mo145953n("left", 0);
            String gVar7 = gVar6.toString();
            C87412m.m108593f(gVar7, "JSONObject().apply {\n   …, 0)\n        }.toString()");
            sb4.append(gVar7);
            gVar5.put("msg", sb4.toString());
            String gVar8 = gVar5.toString();
            C87412m.m108593f(gVar8, "JSONObject().apply {\n   …a())\n        }.toString()");
            C86195z<C88381b> zVar2 = this.f255370b;
            if (zVar2 != null) {
                zVar2.mo120601d("postMessage", gVar8);
            } else {
                C87412m.m108603p("magicBrush");
                throw null;
            }
        } else {
            C87412m.m108603p("magicBrush");
            throw null;
        }
    }

    /* renamed from: f0 */
    public void mo122783f0() {
        super.mo122783f0();
        C89116a.f256769a.getClass();
    }
}
