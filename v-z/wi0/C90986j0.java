package wi0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.config.WxaProfileAttributes;
import java.util.HashMap;

/* renamed from: wi0.j0 */
public class C90986j0 extends HashMap<String, Object> {
    public C90986j0(WxaProfileAttributes wxaProfileAttributes, C81925i2 i2Var) {
        put("nickName", wxaProfileAttributes.f239577f);
        put("iconUrl", wxaProfileAttributes.f239579h);
        put("appId", wxaProfileAttributes.f239576e);
        put("username", wxaProfileAttributes.f239575d);
        put("debugMode", Integer.valueOf(i2Var.getRuntime().mo113036W().f239365g));
        put("weappVersion", Integer.valueOf(wxaProfileAttributes.f239591w));
        put("signature", wxaProfileAttributes.f239578g);
        put("appBrandInfo", new C90984i0(wxaProfileAttributes));
    }
}
