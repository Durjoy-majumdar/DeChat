package vs2;

import at2.C92091c;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: vs2.b */
public final class C102273b {

    /* renamed from: a */
    public static final C102273b f301234a = new C102273b();

    /* renamed from: a */
    public final void mo141838a(JSONArray jSONArray, List<C92091c> list, C92091c cVar, int i, int i2, Map<String, String> map) {
        JSONArray jSONArray2 = jSONArray;
        List<C92091c> list2 = list;
        C92091c cVar2 = cVar;
        int i3 = i;
        Map<String, String> map2 = map;
        SnsMethodCalculate.markStartTimeMs("reserveTree", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.JsDataMapper");
        C87412m.m108594g(jSONArray2, "childsJson");
        C87412m.m108594g(list2, "childsList");
        C87412m.m108594g(cVar2, "node");
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            ArrayList arrayList = new ArrayList();
            JSONObject optJSONObject = jSONArray2.optJSONObject(i4);
            String optString = optJSONObject.optString("k");
            String str = "";
            if (optString == null) {
                optString = str;
            }
            String optString2 = optJSONObject.optString("v");
            C87412m.m108593f(optString2, "nodeLabel");
            if (!C112551y.m153811k(optString2) || !(map2 == null || (optString2 = map2.get(optString)) == null)) {
                str = optString2;
            }
            C92091c cVar3 = new C92091c(optString, str, arrayList, cVar2);
            list2.add(cVar3);
            JSONArray optJSONArray = optJSONObject.optJSONArray("childs");
            if (optJSONArray != null && i3 < i2) {
                f301234a.mo141838a(optJSONArray, arrayList, cVar3, i3 + 1, i2, map);
            }
        }
        SnsMethodCalculate.markEndTimeMs("reserveTree", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.JsDataMapper");
    }
}
