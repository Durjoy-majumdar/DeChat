package co2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;

/* renamed from: co2.i */
public class C92442i {

    /* renamed from: a */
    public String f264532a;

    /* renamed from: b */
    public String f264533b;

    /* renamed from: c */
    public String f264534c;

    /* renamed from: d */
    public String f264535d;

    /* renamed from: e */
    public String f264536e;

    /* renamed from: f */
    public String f264537f;

    /* renamed from: g */
    public String f264538g;

    /* renamed from: a */
    public static C92442i m116271a(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderFollowInfo");
        if (map == null || !map.containsKey(str)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderFollowInfo");
            return null;
        }
        C92442i iVar = new C92442i();
        iVar.f264532a = Util.nullAsNil(map.get(str + ".finderUsername"));
        iVar.f264533b = Util.nullAsNil(map.get(str + ".finderAvatar"));
        iVar.f264534c = Util.nullAsNil(map.get(str + ".finderNickname"));
        iVar.f264535d = Util.nullAsNil(map.get(str + ".finderDesc"));
        iVar.f264536e = Util.nullAsNil(map.get(str + ".finderFollowingBtnTitle"));
        iVar.f264537f = Util.nullAsNil(map.get(str + ".finderExportId"));
        iVar.f264538g = Util.nullAsNil(map.get(str + ".finderObjectNonceId"));
        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderFollowInfo");
        return iVar;
    }
}
