package so2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import ps2.C118127b0;
import qs2.C101255a0;

/* renamed from: so2.p */
public class C101687p extends C101255a0 {

    /* renamed from: A */
    public String f297684A;
    @C118127b0(resType = 1)

    /* renamed from: B */
    public String f297685B;

    /* renamed from: C */
    public String f297686C;

    /* renamed from: D */
    public String f297687D;

    /* renamed from: E */
    public String f297688E;

    /* renamed from: F */
    public float f297689F;

    /* renamed from: G */
    public int f297690G = 0;

    /* renamed from: H */
    public float f297691H = 0.0f;

    /* renamed from: I */
    public int f297692I;

    /* renamed from: J */
    public int f297693J;

    /* renamed from: K */
    public int f297694K;

    /* renamed from: z */
    public int f297695z = 0;

    /* renamed from: b */
    public static C101687p m133568b(Map<String, String> map, String str, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingMusicComponentInfo");
        try {
            C101687p pVar = new C101687p();
            pVar.f297695z = Util.getInt(map.get(str + ".displayType"), 0);
            pVar.f297684A = Util.nullAsNil(map.get(str + ".musicInfo.voiceUrl"));
            pVar.f297685B = Util.nullAsNil(map.get(str + ".musicInfo.coverUrl"));
            pVar.f297686C = Util.nullAsNil(map.get(str + ".musicInfo.title"));
            pVar.f297687D = Util.nullAsNil(map.get(str + ".musicInfo.subTitle"));
            pVar.f297688E = Util.nullAsNil(map.get(str + ".musicInfo.bgColor"));
            pVar.f297689F = Util.getFloat(map.get(str + ".musicInfo.bgColorAlpha"), 1.0f);
            pVar.f297690G = Util.getInt(map.get(str + ".musicInfo.isDarkColor"), 0);
            pVar.f297691H = Util.getFloat(map.get(str + ".musicInfo.musicDuration"), 0.0f);
            pVar.f297692I = i;
            pVar.f297694K = i3;
            pVar.f297693J = i2;
            SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingMusicComponentInfo");
            return pVar;
        } catch (Throwable th) {
            Log.m105920e("AdLandingMusicComponentInfo", "parse, exp=" + th.toString());
            Log.m105920e("AdLandingMusicComponentInfo", "parse, null");
            SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingMusicComponentInfo");
            return null;
        }
    }
}
