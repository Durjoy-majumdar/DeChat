package ll0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import org.json.JSONObject;
import p225rc.C48016e;
import rt0.C110654g;
import rt0.C77568i;

/* renamed from: ll0.p */
public final class C109404p extends C109402o {
    private static final int CTRL_INDEX = 111;
    private static final String NAME = "updateTextArea";

    /* renamed from: A */
    public boolean mo160594A(C110654g gVar, JSONObject jSONObject, C83780d1 d1Var, int i) {
        C77568i iVar = (C77568i) gVar;
        boolean A = super.mo160594A(iVar, jSONObject, d1Var, i);
        iVar.f331050u = Boolean.TRUE;
        Object opt = jSONObject.opt("confirm");
        iVar.f331051v = opt == null ? null : C48016e.m53377c(opt);
        if (jSONObject.has("adjustKeyboardTo")) {
            iVar.f331027C = jSONObject.optString("adjustKeyboardTo", "cursor");
        }
        return A;
    }

    /* renamed from: B */
    public void mo160606B(C83780d1 d1Var, JSONObject jSONObject, int i) {
        super.mo1505u(d1Var, jSONObject, i);
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u((C83780d1) fVar, jSONObject, i);
    }
}
