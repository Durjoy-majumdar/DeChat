package hm3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: hm3.e */
public final class C32959e extends C87413o implements C32226l<JSONObject, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ArrayList<C32964i> f89553d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32959e(ArrayList<C32964i> arrayList) {
        super(1);
        this.f89553d = arrayList;
    }

    public Object invoke(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        C87412m.m108594g(jSONObject, LocaleUtil.ITALIAN);
        String string = jSONObject.getString("so");
        C87412m.m108593f(string, "it.getString(\"so\")");
        List U = C112550d0.m153785U(string, new String[]{"/"}, false, 0, 6, (Object) null);
        String str = (String) U.get(U.size() - 1);
        String string2 = jSONObject.getString("size");
        C87412m.m108593f(string2, "it.getString(\"size\")");
        long parseLong = Long.parseLong(string2);
        Long l = (Long) ((LinkedHashMap) C32960f.f89554a).get(str);
        if (parseLong > (l != null ? l.longValue() : C32960f.f89555b)) {
            this.f89553d.add(new C32964i(str, parseLong));
        }
        return C13598b0.f38549a;
    }
}
