package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.comps.offlinemap.OfflineItem;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.cc */
public class C113589cc extends JsonComposer {
    @Json(name = "domain1")

    /* renamed from: a */
    public String f339965a;
    @Json(name = "dirNew")

    /* renamed from: b */
    public String f339966b;
    @Json(name = "domain")

    /* renamed from: c */
    public String f339967c;
    @Json(name = "fileversion")

    /* renamed from: d */
    public int f339968d;
    @Json(name = "updateData")

    /* renamed from: e */
    public List<C113584ca> f339969e;

    /* renamed from: a */
    public final C113584ca mo171907a(OfflineItem offlineItem) {
        List<C113584ca> list = this.f339969e;
        if (list != null) {
            for (C113584ca next : list) {
                if (offlineItem.getPinyin().equals(next.f339935c)) {
                    next.f339933a = HttpWrapperBase.PROTOCAL_HTTPS + this.f339967c + this.f339966b;
                    return next;
                }
            }
        }
        return null;
    }
}
