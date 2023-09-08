package m52;

import androidx.lifecycle.C54219z;
import com.google.firebase.analytics.FirebaseAnalytics;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k52.C88115a;
import o52.C61943d;
import o52.C61944e;
import org.json.JSONObject;
import sx3.C64186f0;

/* renamed from: m52.b */
public final class C88698b extends C86430i<C88115a> {
    /* renamed from: e */
    public String mo16e() {
        return "removeFrameSet";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C61944e eVar;
        C87412m.m108594g(hVar, "data");
        JSONObject optJSONObject = hVar.optJSONObject("frameJson");
        int i = 0;
        if (optJSONObject != null) {
            i = optJSONObject.optInt(FirebaseAnalytics.C113379b.INDEX, 0);
        }
        C88115a aVar = (C88115a) this.f251227a;
        if (!(aVar == null || (eVar = aVar.f254866p) == null)) {
            C54219z<List<C61943d>> zVar = eVar.f176076e;
            Collection value = eVar.f176076e.getValue();
            if (value == null) {
                value = C64186f0.f181907d;
            }
            ArrayList arrayList = new ArrayList(value);
            arrayList.remove(i);
            zVar.setValue(arrayList);
        }
        mo120840p().invoke(mo120844i());
    }
}
