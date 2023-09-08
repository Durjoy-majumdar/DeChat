package co2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import kg3.C76577a;
import ps2.C100894u;
import ps2.C118127b0;

/* renamed from: co2.s */
public class C92450s {
    @C118127b0(resType = 1)

    /* renamed from: a */
    public String f264585a;
    @C118127b0(resType = 1)

    /* renamed from: b */
    public String f264586b;
    @C118127b0(resType = 1)

    /* renamed from: c */
    public String f264587c;
    @C118127b0(resType = 1)

    /* renamed from: d */
    public String f264588d;

    /* renamed from: e */
    public String f264589e;

    /* renamed from: f */
    public String f264590f;

    /* renamed from: g */
    public String f264591g;

    /* renamed from: h */
    public float f264592h;

    /* renamed from: i */
    public float f264593i;

    /* renamed from: j */
    public float f264594j;

    /* renamed from: k */
    public int f264595k;

    /* renamed from: l */
    public int f264596l;

    /* renamed from: m */
    public int f264597m;

    /* renamed from: n */
    public int f264598n;

    /* renamed from: o */
    public AdClickActionInfo f264599o;

    /* renamed from: p */
    public boolean f264600p = true;

    /* renamed from: a */
    public static C92450s m116288a(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdTagButtonInfo");
        C92450s sVar = new C92450s();
        sVar.f264585a = Util.nullAsNil(map.get(str + ".bgImageUrl"));
        sVar.f264586b = Util.nullAsNil(map.get(str + ".bgImageUrlDark"));
        sVar.f264587c = Util.nullAsNil(map.get(str + ".iconUrl"));
        sVar.f264588d = Util.nullAsNil(map.get(str + ".iconUrlDark"));
        sVar.f264589e = Util.nullAsNil(map.get(str + ".title"));
        if (TextUtils.isEmpty(sVar.f264586b) && !TextUtils.isEmpty(sVar.f264585a)) {
            sVar.f264586b = sVar.f264585a;
            Log.m105928w("AdTagButtonInfo", "bgImageUrlDark is empty");
        }
        if (TextUtils.isEmpty(sVar.f264585a) && !TextUtils.isEmpty(sVar.f264586b)) {
            sVar.f264585a = sVar.f264586b;
            Log.m105928w("AdTagButtonInfo", "bgImageUrl is empty");
        }
        if (TextUtils.isEmpty(sVar.f264588d) && !TextUtils.isEmpty(sVar.f264587c)) {
            sVar.f264588d = sVar.f264587c;
            Log.m105928w("AdTagButtonInfo", "iconUrlDark is empty");
        }
        if (TextUtils.isEmpty(sVar.f264587c) && !TextUtils.isEmpty(sVar.f264588d)) {
            sVar.f264587c = sVar.f264588d;
            Log.m105928w("AdTagButtonInfo", "iconUrl is empty");
        }
        sVar.f264590f = Util.nullAsNil(map.get(str + ".titleColor"));
        sVar.f264591g = Util.nullAsNil(map.get(str + ".titleColorDark"));
        sVar.f264592h = Util.safeParseFloat(map.get(str + ".titleColorAlpha"));
        sVar.f264593i = Util.safeParseFloat(map.get(str + ".titleColorAlphaDark"));
        sVar.f264595k = Util.safeParseInt(map.get(str + ".basicRootFontSize"));
        sVar.f264596l = Util.safeParseInt(map.get(str + ".basicRemWidth"));
        int safeParseInt = Util.safeParseInt(map.get(str + ".layoutWidth"));
        int safeParseInt2 = Util.safeParseInt(map.get(str + ".layoutHeight"));
        sVar.f264597m = (int) C100894u.m132234n((double) safeParseInt, 1, sVar.f264596l, sVar.f264595k);
        sVar.f264598n = (int) C100894u.m132234n((double) safeParseInt2, 1, sVar.f264596l, sVar.f264595k);
        sVar.f264594j = (float) C76577a.m92151b(MMApplicationContext.getContext(), Util.safeParseInt(map.get(str + ".cornerRadius")));
        if (!map.containsKey(str + ".clickActionInfo")) {
            sVar.f264600p = false;
        }
        AdClickActionInfo b = AdClickActionInfo.m119629b(map, str + ".clickActionInfo");
        sVar.f264599o = b;
        b.f273639a = 2;
        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdTagButtonInfo");
        return sVar;
    }
}
