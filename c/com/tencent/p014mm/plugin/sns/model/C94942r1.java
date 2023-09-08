package com.tencent.p014mm.plugin.sns.model;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.p014mm.api.EmotionStrategyInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import te3.b84;

/* renamed from: com.tencent.mm.plugin.sns.model.r1 */
public final class C94942r1 {

    /* renamed from: a */
    public static final C94942r1 f275179a = new C94942r1();

    /* renamed from: b */
    public static final Map<String, List<EmotionStrategyInfo>> f275180b = new LinkedHashMap();

    /* renamed from: c */
    public static final Map<String, List<b84>> f275181c = new LinkedHashMap();

    /* renamed from: a */
    public final void mo131222a(String str, List<EmotionStrategyInfo> list) {
        SnsMethodCalculate.markStartTimeMs("addEmotionSafeStrategyInfoListOnPost", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        C87412m.m108594g(str, "key");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (EmotionStrategyInfo emotionStrategyInfo : list) {
                b84 b84 = new b84();
                b84.f182229d = emotionStrategyInfo.f264619d;
                b84.f182230e = emotionStrategyInfo.f264620e;
                arrayList.add(b84);
            }
        }
        f275181c.put(str, arrayList);
        SnsMethodCalculate.markEndTimeMs("addEmotionSafeStrategyInfoListOnPost", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
    }

    /* renamed from: b */
    public final List<EmotionStrategyInfo> mo131223b(String str) {
        SnsMethodCalculate.markStartTimeMs("getEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        C87412m.m108594g(str, "path");
        Map<String, List<EmotionStrategyInfo>> map = f275180b;
        if (((LinkedHashMap) map).get(str) == null) {
            map.put(str, new ArrayList());
        }
        Object obj = ((LinkedHashMap) map).get(str);
        C87412m.m108591d(obj);
        List<EmotionStrategyInfo> list = (List) obj;
        SnsMethodCalculate.markEndTimeMs("getEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        return list;
    }

    /* renamed from: c */
    public final void mo131224c(String str, Bundle bundle, String str2) {
        SnsMethodCalculate.markStartTimeMs("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        C87412m.m108594g(str, "path");
        if (bundle == null || Util.isNullOrNil(str2) || Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.SnsPostSafeStrategyDataHelper", "putEmotionSafeStrategyInfoList: failed, arguments error");
            SnsMethodCalculate.markEndTimeMs("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
            return;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(str2);
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        SnsMethodCalculate.markStartTimeMs("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        ArrayList arrayList = new ArrayList();
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            Parcelable parcelable = (Parcelable) it.next();
            if (parcelable instanceof EmotionStrategyInfo) {
                arrayList.add(parcelable);
            }
        }
        SnsMethodCalculate.markStartTimeMs("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        f275180b.put(str, arrayList);
        Log.m105918d("MicroMsg.SnsPostSafeStrategyDataHelper", "putEmotionSafeStrategyInfoList: path=" + str + ", size=" + arrayList.size());
        SnsMethodCalculate.markEndTimeMs("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        SnsMethodCalculate.markEndTimeMs("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        SnsMethodCalculate.markEndTimeMs("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
    }
}
