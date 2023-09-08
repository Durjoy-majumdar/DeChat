package fr2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.Serializable;
import java.util.Map;
import ps2.C118127b0;

/* renamed from: fr2.a */
public class C97952a implements Serializable {

    /* renamed from: d */
    public int f287302d;

    /* renamed from: e */
    public int f287303e;

    /* renamed from: f */
    public int f287304f;

    /* renamed from: g */
    public int f287305g;

    /* renamed from: h */
    public String f287306h;

    /* renamed from: i */
    public String f287307i;
    @C118127b0(resType = 2)

    /* renamed from: j */
    public String f287308j;

    /* renamed from: n */
    public String f287309n;
    @C118127b0(resType = 2)

    /* renamed from: o */
    public String f287310o;

    /* renamed from: p */
    public String f287311p;

    /* renamed from: q */
    public int f287312q;

    /* renamed from: r */
    public int f287313r;

    /* renamed from: a */
    public static C97952a m126505a(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.shakead.AdShakeInfo");
        if (map.containsKey(str)) {
            int safeParseInt = Util.safeParseInt(map.get(str + ".shakeStartTime"));
            int safeParseInt2 = Util.safeParseInt(map.get(str + ".shakeEndTime"));
            int safeParseInt3 = Util.safeParseInt(map.get(str + ".coverStartTime"));
            int safeParseInt4 = Util.safeParseInt(map.get(str + ".coverEndTime"));
            if (safeParseInt3 == 0) {
                safeParseInt3 = safeParseInt;
            }
            if (safeParseInt4 == 0) {
                safeParseInt4 = safeParseInt2;
            }
            if (safeParseInt >= 0 && safeParseInt2 > safeParseInt && safeParseInt4 >= safeParseInt3 && safeParseInt3 >= safeParseInt && safeParseInt4 <= safeParseInt2) {
                String nullAsNil = Util.nullAsNil(map.get(str + ".title"));
                String nullAsNil2 = Util.nullAsNil(map.get(str + ".desc"));
                C97952a aVar = new C97952a();
                aVar.f287302d = safeParseInt;
                aVar.f287303e = safeParseInt2;
                aVar.f287304f = safeParseInt3;
                aVar.f287305g = safeParseInt4;
                aVar.f287306h = nullAsNil;
                aVar.f287307i = nullAsNil2;
                aVar.f287308j = Util.nullAsNil(map.get(str + ".simpleTransitionAnimationUrl"));
                aVar.f287309n = Util.nullAsNil(map.get(str + ".simpleTransitionAnimationMD5"));
                aVar.f287310o = Util.nullAsNil(map.get(str + ".themePAGUrl"));
                aVar.f287311p = Util.nullAsNil(map.get(str + ".themePAGMD5"));
                aVar.f287312q = Util.safeParseInt(map.get(str + ".triggerGForceMin"));
                aVar.f287313r = Util.safeParseInt(map.get(str + ".triggerGForceMax"));
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.shakead.AdShakeInfo");
                return aVar;
            }
        }
        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.shakead.AdShakeInfo");
        return null;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.shakead.AdShakeInfo");
        String str = "{shakeStartTime=" + this.f287302d + ", shakeEndTime=" + this.f287303e + ", coverStartTime=" + this.f287304f + ", coverEndTime=" + this.f287305g + ", title=" + this.f287306h + ", desc=" + this.f287307i + ", simpleTransitionAnimationUrl=" + this.f287308j + ", simpleTransitionAnimationMD5=" + this.f287309n + ", themePAGUrl=" + this.f287310o + ", themePAGMD5=" + this.f287311p + '}';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.shakead.AdShakeInfo");
        return str;
    }
}
