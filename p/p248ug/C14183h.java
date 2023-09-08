package p248ug;

import com.tencent.p014mm.api.EmotionStrategyInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import sx3.C64186f0;

/* renamed from: ug.h */
public final class C14183h {

    /* renamed from: a */
    public static final Map<String, List<EmotionStrategyInfo>> f39628a = new LinkedHashMap();

    /* renamed from: a */
    public static final List<EmotionStrategyInfo> m13517a(String str) {
        if (str == null) {
            Log.m105924i("MicroMsg.EmotionSafeStrategyManager", "getEmotionList() called with: path = null");
            return C64186f0.f181907d;
        }
        List<EmotionStrategyInfo> list = (List) ((LinkedHashMap) f39628a).get(str);
        if (list == null) {
            list = C64186f0.f181907d;
        }
        Log.m105924i("MicroMsg.EmotionSafeStrategyManager", "getEmotionList() called with: path = " + str + ", list.size = " + list.size());
        return list;
    }

    /* renamed from: b */
    public static final void m13518b(String str, List<EmotionStrategyInfo> list) {
        C87412m.m108594g(list, "list");
        Log.m105924i("MicroMsg.EmotionSafeStrategyManager", "putEmotionList() called with: path = " + str + ", list.size = " + list.size());
        if (str != null) {
            f39628a.put(str, list);
        }
    }
}
