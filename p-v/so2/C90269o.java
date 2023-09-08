package so2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import qs2.C101255a0;

/* renamed from: so2.o */
public class C90269o extends C101255a0 {

    /* renamed from: A */
    public String f259115A = "";

    /* renamed from: B */
    public int f259116B = 0;

    /* renamed from: z */
    public String f259117z = "";

    /* renamed from: b */
    public static C90269o m113002b(Map<String, String> map, String str, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingMBInfo");
        Log.m105924i("AdLandingMBInfo", "create a mb info from xml");
        C90269o oVar = new C90269o();
        oVar.f259115A = Util.nullAsNil(map.get(str + ".dsl"));
        oVar.f259117z = Util.nullAsNil(map.get(str + ".frameSetName"));
        oVar.f259116B = Util.safeParseInt(map.get(str + ".fullScreen"));
        SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingMBInfo");
        return oVar;
    }
}
