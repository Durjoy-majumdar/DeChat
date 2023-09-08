package m80;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import java.util.Map;
import sx3.C64197v;

/* renamed from: m80.k */
public final class C34479k implements C34477c {
    /* renamed from: a */
    public void mo59601a(long j, List<Long> list, int i, int i2, Map<Long, Long> map, Map<Long, List<Long>> map2) {
        C87412m.m108594g(list, "frames");
        C87412m.m108594g(map, "parents");
        C87412m.m108594g(map2, "outPts");
        Log.m105924i("DecodeStrategy", "use passthrough decode strategy");
        long j2 = -1;
        for (Number longValue : list) {
            long longValue2 = longValue.longValue();
            if (longValue2 >= j) {
                map.put(Long.valueOf(longValue2), Long.valueOf(j2));
                map2.put(Long.valueOf(longValue2), C64197v.m75539h(Long.valueOf(longValue2)));
                j2 = longValue2;
            }
        }
    }
}
