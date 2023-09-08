package k22;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lk22/e;", "Lcom/tencent/mm/plugin/lite/api/c;", "Lcom/tencent/mm/plugin/appbrand/jsapi/p;", "appBrandJsApi", "<init>", "(Lcom/tencent/mm/plugin/appbrand/jsapi/p;)V", "luggage-lite-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: k22.e */
public final class C88073e extends C4770c {

    /* renamed from: g */
    public C82870p f254727g;

    public C88073e(C82870p pVar) {
        C87412m.m108594g(pVar, "appBrandJsApi");
        this.f254727g = pVar;
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        C88075g a = C88075g.m109660a();
        a.getClass();
        C82870p pVar = this.f254727g;
        if (pVar instanceof C82268c) {
            int i = (int) this.f19814e.f31717e;
            a.f254731b.put(Integer.valueOf(i), this.f19814e);
            ((C82268c) pVar).mo1505u(a.f254730a, jSONObject, i);
            return;
        }
        ((C82016a0) pVar).mo1731t(a.f254730a, jSONObject);
    }
}
