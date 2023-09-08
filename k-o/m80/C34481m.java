package m80;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C64197v;

/* renamed from: m80.m */
public final class C34481m implements C34477c {
    /* renamed from: a */
    public void mo59601a(long j, List<Long> list, int i, int i2, Map<Long, Long> map, Map<Long, List<Long>> map2) {
        long j2;
        String str;
        String str2;
        long j3;
        List<Long> list2 = list;
        Map<Long, List<Long>> map3 = map2;
        C87412m.m108594g(list2, "frames");
        C87412m.m108594g(map, "parents");
        C87412m.m108594g(map3, "outPts");
        String str3 = "DecodeStrategy";
        Log.m105924i(str3, "use vfr decode strategy");
        int i3 = 0;
        for (Long longValue : list) {
            int i4 = i3 + 1;
            if (longValue.longValue() >= j) {
                int size = list.size() - i3;
                int i5 = (size * i2) / i;
                List<T> t0 = C110818d0.m150948t0(list2, size);
                long currentTimeMillis = System.currentTimeMillis();
                C34478d dVar = C34478d.f92802a;
                int size2 = t0.size();
                ArrayList arrayList = new ArrayList(size2);
                for (int i6 = 0; i6 < size2; i6++) {
                    arrayList.add(Boolean.FALSE);
                }
                int i7 = i5 + 1;
                ArrayList arrayList2 = new ArrayList(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    ArrayList arrayList3 = new ArrayList(size2);
                    for (int i9 = 0; i9 < size2; i9++) {
                        arrayList3.add(2305843009213693952L);
                    }
                    arrayList2.add(arrayList3);
                }
                ArrayList arrayList4 = new ArrayList(i7);
                int i15 = 0;
                while (i15 < i7) {
                    ArrayList arrayList5 = new ArrayList(size2);
                    int i16 = i7;
                    int i17 = 0;
                    while (i17 < size2) {
                        arrayList5.add(-1);
                        i17++;
                        Map<Long, List<Long>> map4 = map2;
                    }
                    arrayList4.add(arrayList5);
                    i15++;
                    i7 = i16;
                    Map<Long, List<Long>> map5 = map2;
                }
                int i18 = 1;
                ((List) arrayList2.get(1)).set(0, 0L);
                ((List) arrayList4.get(1)).set(0, 0);
                ArrayList arrayList6 = new ArrayList();
                int i19 = 2;
                if (2 <= i5) {
                    while (true) {
                        arrayList6.clear();
                        arrayList6.add(Integer.valueOf(i19 - 2));
                        int i25 = i19 - 1;
                        int i26 = i25;
                        while (i26 < size2) {
                            while (true) {
                                if (arrayList6.size() <= i18) {
                                    str2 = str3;
                                    j3 = currentTimeMillis;
                                    break;
                                }
                                str2 = str3;
                                j3 = currentTimeMillis;
                                if (dVar.mo59605b(((Number) arrayList6.get(i18)).intValue(), ((Number) arrayList6.get(0)).intValue(), (List) arrayList2.get(i25), t0) >= ((Number) t0.get(i26)).doubleValue() * dVar.mo59604a(((Number) arrayList6.get(1)).intValue(), ((Number) arrayList6.get(0)).intValue(), t0)) {
                                    break;
                                }
                                arrayList6.remove(0);
                                currentTimeMillis = j3;
                                str3 = str2;
                                i18 = 1;
                            }
                            int intValue = ((Number) C110818d0.m150914L(arrayList6)).intValue();
                            ((List) arrayList2.get(i19)).set(i26, Long.valueOf(((Number) ((List) arrayList2.get(i25)).get(intValue)).longValue() + ((((Number) t0.get(i26)).longValue() - ((Number) t0.get(intValue)).longValue()) * (((Number) t0.get(i26)).longValue() - ((Number) t0.get(intValue)).longValue()))));
                            ((List) arrayList4.get(i19)).set(i26, Integer.valueOf(intValue));
                            while (arrayList6.size() > 1 && dVar.mo59605b(i26, ((Number) arrayList6.get(C64197v.m75536e(arrayList6))).intValue(), (List) arrayList2.get(i25), t0) * dVar.mo59604a(((Number) arrayList6.get(C64197v.m75536e(arrayList6))).intValue(), ((Number) arrayList6.get(C64197v.m75536e(arrayList6) - 1)).intValue(), t0) < dVar.mo59605b(((Number) arrayList6.get(C64197v.m75536e(arrayList6))).intValue(), ((Number) arrayList6.get(C64197v.m75536e(arrayList6) - 1)).intValue(), (List) arrayList2.get(i25), t0) * dVar.mo59604a(i26, ((Number) arrayList6.get(C64197v.m75536e(arrayList6))).intValue(), t0)) {
                                arrayList6.remove(C64197v.m75536e(arrayList6));
                            }
                            arrayList6.add(Integer.valueOf(i26));
                            i26++;
                            currentTimeMillis = j3;
                            Map<Long, Long> map6 = map;
                            str3 = str2;
                            i18 = 1;
                        }
                        str = str3;
                        j2 = currentTimeMillis;
                        if (i19 == i5) {
                            break;
                        }
                        i19++;
                        currentTimeMillis = j2;
                        Map<Long, Long> map7 = map;
                        str3 = str;
                        i18 = 1;
                    }
                } else {
                    str = str3;
                    j2 = currentTimeMillis;
                }
                int i27 = size2 - 1;
                for (int i28 = i5; i28 > 0; i28--) {
                    arrayList.set(i27, Boolean.TRUE);
                    i27 = ((Number) ((List) arrayList4.get(i28)).get(i27)).intValue();
                }
                Log.m105924i(str, "DropFrame, total frames = " + t0.size() + ", remain frames = " + i5 + ", cost " + (System.currentTimeMillis() - j2) + LocaleUtil.MALAY);
                long j4 = -1;
                Iterator it = ((ArrayList) C110818d0.m150908F0(arrayList, t0)).iterator();
                while (it.hasNext()) {
                    C13604l lVar = (C13604l) it.next();
                    boolean booleanValue = ((Boolean) lVar.f38555d).booleanValue();
                    long longValue2 = ((Number) lVar.f38556e).longValue();
                    if (booleanValue) {
                        map.put(Long.valueOf(longValue2), Long.valueOf(j4));
                        map2.put(Long.valueOf(longValue2), C64197v.m75539h(Long.valueOf(longValue2)));
                        j4 = longValue2;
                    } else {
                        Map<Long, Long> map8 = map;
                        Map<Long, List<Long>> map9 = map2;
                    }
                }
                return;
            }
            Map<Long, List<Long>> map10 = map3;
            i3 = i4;
        }
    }
}
