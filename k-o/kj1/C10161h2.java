package kj1;

import ak1.C54067f0;
import ak1.C54116w;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d50.C58113g;
import d50.C58114h;
import d50.C7170j;
import di3.C86312j;
import fj1.C45795b;
import gy3.C87412m;
import il1.C9065m6;
import kj1.C10125e1;
import nj3.C76912y0;
import org.json.JSONObject;
import rx3.C36570n;

/* renamed from: kj1.h2 */
public final class C10161h2 {
    /* renamed from: a */
    public static final void m10080a(C10125e1 e1Var, boolean z) {
        C9065m6 m6Var;
        C58114h hVar;
        C58113g gVar;
        C87412m.m108594g(e1Var, "<this>");
        C10125e1.C10127b bVar = e1Var.f30988g;
        if (bVar != null && (m6Var = bVar.f31020m) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("resolutionChange result:");
            sb.append(z);
            sb.append(",modifyVideoDefinition:");
            sb.append(m6Var.f28610e);
            sb.append(",showLevel:");
            C7170j jVar = m6Var.f28609d;
            sb.append(jVar != null ? Integer.valueOf(jVar.f25143b) : null);
            Log.m105924i("FinderLiveVideoDefinitionWidget", sb.toString());
            if (m6Var.f28610e) {
                int i = 0;
                m6Var.f28610e = false;
                if (z) {
                    C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
                    C7170j jVar2 = m6Var.f28609d;
                    int i2 = jVar2 != null ? jVar2.f25143b : 0;
                    C45795b bVar2 = m6Var.f28608c;
                    if (!(bVar2 == null || (hVar = ((C55001u) bVar2.mo71262a(C55001u.class)).f154421r) == null || (gVar = hVar.f166251b) == null)) {
                        i = gVar.mo82868a();
                    }
                    wVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("from_birate", i2);
                    jSONObject.put("to_birate", i);
                    C54116w.Ex0(wVar, C54067f0.C54076o0.MODIFY_VIDEO_DEFINITION, (String) null, 0, jSONObject.toString(), (String) null, (String) null, (String) null, (String) null, 244, (Object) null);
                }
                if (!((Boolean) ((C36570n) m6Var.f28607b).getValue()).booleanValue()) {
                    return;
                }
                if (z) {
                    C76912y0.m92768g(m6Var.f28606a, MMApplicationContext.getContext().getResources().getString(C0966R.string.mo_));
                } else {
                    C76912y0.m92767f(m6Var.f28606a, MMApplicationContext.getContext().getResources().getString(C0966R.string.e9r));
                }
            }
        }
    }
}
