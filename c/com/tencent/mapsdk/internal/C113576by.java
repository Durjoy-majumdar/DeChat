package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.comps.offlinemap.OfflineCity;
import com.tencent.map.sdk.comps.offlinemap.OfflineNation;
import com.tencent.map.sdk.comps.offlinemap.OfflineProvince;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.by */
public class C113576by extends JsonComposer {
    @Json(name = "name")

    /* renamed from: a */
    public String f339905a;
    @Json(name = "pinyin")

    /* renamed from: b */
    public String f339906b;
    @Json(name = "cityList")

    /* renamed from: c */
    public List<C113576by> f339907c;

    /* renamed from: a */
    public final OfflineCity mo171875a(OfflineProvince offlineProvince) {
        OfflineCity offlineCity = new OfflineCity();
        offlineCity.setName(this.f339905a);
        offlineCity.setPinyin(this.f339906b);
        offlineCity.setProvince(offlineProvince);
        return offlineCity;
    }

    /* renamed from: a */
    private OfflineProvince m156385a(List<OfflineCity> list) {
        OfflineProvince offlineProvince = new OfflineProvince();
        offlineProvince.setName(this.f339905a);
        offlineProvince.setPinyin(this.f339906b);
        offlineProvince.setCities(list);
        return offlineProvince;
    }

    /* renamed from: a */
    private OfflineNation m156384a() {
        OfflineNation offlineNation = new OfflineNation();
        offlineNation.setName(this.f339905a);
        offlineNation.setPinyin(this.f339906b);
        return offlineNation;
    }
}
