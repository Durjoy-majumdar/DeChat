package m80;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.coremedia.TimeUtil;
import gy3.C87412m;
import java.util.List;
import java.util.Map;
import sx3.C64197v;

/* renamed from: m80.l */
public final class C34480l implements C34477c {

    /* renamed from: a */
    public long f92803a = 33;

    /* renamed from: a */
    public void mo59601a(long j, List<Long> list, int i, int i2, Map<Long, Long> map, Map<Long, List<Long>> map2) {
        Map<Long, Long> map3 = map;
        Map<Long, List<Long>> map4 = map2;
        C87412m.m108594g(list, "frames");
        C87412m.m108594g(map3, "parents");
        C87412m.m108594g(map4, "outPts");
        Log.m105924i("DecodeStrategy", "use simple vfr decode strategy");
        this.f92803a = TimeUtil.SECOND_TO_US / ((long) (i2 != 0 ? i2 : i));
        long j2 = -1;
        long j3 = -1;
        long j4 = -1;
        for (Number longValue : list) {
            long longValue2 = longValue.longValue();
            if (longValue2 >= j) {
                if (j3 == j2) {
                    j3 = longValue2;
                }
                int size = map.size() + 1;
                if (((size == 0 || size == 1) ? Float.MAX_VALUE : ((float) (longValue2 - j3)) / ((float) size)) >= ((float) this.f92803a)) {
                    map3.put(Long.valueOf(longValue2), Long.valueOf(j4));
                    map4.put(Long.valueOf(longValue2), C64197v.m75539h(Long.valueOf(longValue2)));
                    j4 = longValue2;
                }
            }
            j2 = -1;
        }
    }
}
