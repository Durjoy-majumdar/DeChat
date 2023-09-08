package m80;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.coremedia.TimeUtil;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: m80.a */
public final class C34474a implements C34477c {

    /* renamed from: a */
    public final String f92786a = "DecodeStrategy";

    /* renamed from: b */
    public long f92787b = 33;

    /* renamed from: a */
    public void mo59601a(long j, List<Long> list, int i, int i2, Map<Long, Long> map, Map<Long, List<Long>> map2) {
        Map<Long, Long> map3 = map;
        Map<Long, List<Long>> map4 = map2;
        C87412m.m108594g(list, "frames");
        C87412m.m108594g(map3, "parents");
        C87412m.m108594g(map4, "outPts");
        Log.m105924i(this.f92786a, "use cfr decode strategy");
        this.f92787b = TimeUtil.SECOND_TO_US / ((long) (i2 != 0 ? i2 : i));
        long j2 = 0;
        long j3 = -1;
        long j4 = -1;
        for (Number longValue : list) {
            long longValue2 = longValue.longValue();
            if (longValue2 >= j) {
                if (j3 == -1) {
                    j2 = longValue2;
                    j3 = j2;
                }
                if (longValue2 >= j2) {
                    map3.put(Long.valueOf(longValue2), Long.valueOf(j4));
                    while (longValue2 >= j2) {
                        Long valueOf = Long.valueOf(longValue2);
                        List<Long> list2 = map4.get(valueOf);
                        if (list2 == null) {
                            list2 = new ArrayList<>();
                            map4.put(valueOf, list2);
                        }
                        list2.add(Long.valueOf(j2));
                        j2 += this.f92787b;
                    }
                    j4 = longValue2;
                }
            }
        }
    }
}
