package wi0;

import com.tencent.p014mm.plugin.appbrand.config.WxaProfileAttributes;
import java.util.HashMap;

/* renamed from: wi0.i0 */
public class C90984i0 extends HashMap<String, Object> {
    public C90984i0(WxaProfileAttributes wxaProfileAttributes) {
        put("originalRedirectUrl", wxaProfileAttributes.f239588t);
        put("appServiceType", Integer.valueOf(wxaProfileAttributes.f239582n));
        put("originalFlag", Integer.valueOf(wxaProfileAttributes.f239587s));
        put("relievedBuyFlag", Integer.valueOf(wxaProfileAttributes.f239584p));
        put("flagshipFlag", Integer.valueOf(wxaProfileAttributes.f239585q));
        put("brandOfficialFlag", Integer.valueOf(wxaProfileAttributes.f239586r));
    }
}
