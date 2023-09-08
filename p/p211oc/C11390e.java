package p211oc;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: oc.e */
public final class C11390e extends C82268c<C81879g> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "preloadSkylineView";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        C87412m.m108594g(gVar, "env");
        gVar.mo109673t(new C11389d(gVar, i, this));
    }
}
