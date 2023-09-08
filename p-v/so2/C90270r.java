package so2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import qs2.C101255a0;

/* renamed from: so2.r */
public class C90270r extends C101255a0 {

    /* renamed from: z */
    public String f259118z;

    /* renamed from: b */
    public static C90270r m113003b(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSeparatorCompInfo");
        try {
            C90270r rVar = new C90270r();
            String str2 = "#F2F2F2";
            if (map.containsKey(str + ".bgColor")) {
                String str3 = map.get(str + ".bgColor");
                if (!Util.isNullOrNil(str3)) {
                    str2 = str3;
                }
                rVar.f259118z = str2;
            } else {
                rVar.f259118z = str2;
            }
            SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSeparatorCompInfo");
            return rVar;
        } catch (Throwable th) {
            Log.m105920e("AdLandingSeparatorCompInfo", "parse, exp is " + th);
            Log.m105920e("AdLandingSeparatorCompInfo", "parse, null");
            SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSeparatorCompInfo");
            return null;
        }
    }
}
