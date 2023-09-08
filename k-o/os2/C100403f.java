package os2;

import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import te3.C101804kv2;

/* renamed from: os2.f */
public final class C100403f {

    /* renamed from: a */
    public final AdClickActionInfo f294116a;

    /* renamed from: b */
    public final List<C100414o> f294117b;

    public C100403f(AdClickActionInfo adClickActionInfo, List<C100414o> list) {
        C87412m.m108594g(adClickActionInfo, "clickActionInfo");
        C87412m.m108594g(list, "gridItems");
        this.f294116a = adClickActionInfo;
        this.f294117b = list;
    }

    /* renamed from: c */
    public static final C100403f m131352c(Map<String, String> map, String str) {
        C100414o oVar;
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo$Companion");
        C100403f fVar = null;
        if (map != null) {
            if (str != null) {
                ArrayList arrayList = new ArrayList();
                String str2 = str + ".gridItems.item";
                int i = 0;
                while (true) {
                    if (i >= 3) {
                        fVar = new C100403f(AdClickActionInfo.m119629b(map, str + ".clickActionInfo"), arrayList);
                        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo$Companion");
                        break;
                    }
                    String str3 = str2 + (i != 0 ? String.valueOf(i) : "");
                    SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.GridItemInfo$Companion");
                    C101804kv2 a = C100415q.f294176a.mo139879a(str3 + ".media", map);
                    if (a == null) {
                        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.GridItemInfo$Companion");
                        oVar = null;
                    } else {
                        oVar = new C100414o(a, AdClickActionInfo.m119629b(map, str3 + ".clickActionInfo"));
                        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.GridItemInfo$Companion");
                    }
                    if (oVar == null) {
                        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo$Companion");
                        break;
                    }
                    arrayList.add(oVar);
                    i++;
                }
            } else {
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo$Companion");
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo$Companion");
        }
        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        return fVar;
    }

    /* renamed from: a */
    public final AdClickActionInfo mo139843a() {
        SnsMethodCalculate.markStartTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        AdClickActionInfo adClickActionInfo = this.f294116a;
        SnsMethodCalculate.markEndTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        return adClickActionInfo;
    }

    /* renamed from: b */
    public final List<C100414o> mo139844b() {
        SnsMethodCalculate.markStartTimeMs("getGridItems", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        List<C100414o> list = this.f294117b;
        SnsMethodCalculate.markEndTimeMs("getGridItems", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        return list;
    }
}
