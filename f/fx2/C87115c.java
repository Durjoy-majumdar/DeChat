package fx2;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gy3.C87412m;
import java.util.HashMap;
import o40.C61926c;
import ob0.C47350c;
import org.json.JSONObject;
import pe3.C89349b;
import ql0.C89698a;
import te3.C90423kk2;
import te3.C90426lk2;
import te3.w55;
import z04.C119027c;

/* renamed from: fx2.c */
public final class C87115c extends C82016a0<C82381f> {
    public static final int CTRL_INDEX = 79;
    public static final String NAME = "operateWXData";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C87412m.m108594g(fVar, "component");
        C87412m.m108594g(jSONObject, "data");
        C90423kk2 kk22 = new C90423kk2();
        kk22.f259643d = fVar.getAppId();
        String optString = jSONObject.optString("data");
        C87412m.m108593f(optString, "data.optString(\"data\")");
        byte[] bytes = optString.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        kk22.f259644e = new C89349b(bytes, 0, bytes.length);
        kk22.f259647h = 0;
        kk22.f259646g = 0;
        kk22.f259645f = "";
        kk22.f259649j = 0;
        w55 w55 = new w55();
        w55.f143869e = C89698a.CTRL_INDEX;
        kk22.f259648i = w55;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = kk22;
        bVar.f127067b = new C90426lk2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/js-operatewxdata";
        bVar.f127069d = 1133;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C61926c.m72656A((String) null, new C87114b(bVar.mo72403a()));
        Object[] objArr = new Object[0];
        String str = "ok";
        HashMap hashMap = new HashMap();
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        hashMap.putAll(new HashMap());
        String m = mo115112m(str, hashMap);
        C87412m.m108593f(m, "makeReturnJson(ret.errMsg, ret.values)");
        return m;
    }
}
