package os1;

import android.util.ArrayMap;
import bl3.C0327w;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13598b0;
import te3.C64586nn1;
import zc1.C66785b;

/* renamed from: os1.p */
public class C11748p extends C0327w<FinderCommonFeatureService> {

    /* renamed from: e */
    public final ArrayMap<String, ConcurrentHashMap<Integer, Integer>> f34397e = new ArrayMap<>();

    /* renamed from: f */
    public ArrayMap<String, Integer> f34398f = new ArrayMap<>();

    /* renamed from: d3 */
    public static /* synthetic */ int m11445d3(C11748p pVar, int i, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                str = C66785b.f191882e.mo90662O5();
            }
            return pVar.mo11610c3(i, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEnterTabIndex");
    }

    /* renamed from: f3 */
    public static void m11446f3(C11748p pVar, int i, int i2, String str, int i3, Object obj) {
        C13598b0 b0Var;
        if (obj == null) {
            if ((i3 & 4) != 0) {
                str = C66785b.f191882e.mo90662O5();
            }
            pVar.getClass();
            C87412m.m108594g(str, "username");
            Log.m105924i("Finder.FinderTagCacheVm", "username:" + str + " type=" + i + " tabIndex=" + i2 + ' ');
            ConcurrentHashMap concurrentHashMap = pVar.f34397e.get(str);
            if (concurrentHashMap != null) {
                concurrentHashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                concurrentHashMap2.put(Integer.valueOf(i), Integer.valueOf(i2));
                pVar.f34397e.put(str, concurrentHashMap2);
            }
            pVar.f34398f.put(str, -1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: store");
    }

    /* renamed from: c3 */
    public int mo11610c3(int i, String str) {
        C87412m.m108594g(str, "username");
        Integer num = this.f34398f.get(str);
        if (num == null) {
            num = -1;
        }
        int intValue = num.intValue();
        if (intValue != -1) {
            return intValue;
        }
        ConcurrentHashMap concurrentHashMap = this.f34397e.get(str);
        Boolean[] boolArr = null;
        Integer num2 = concurrentHashMap != null ? (Integer) concurrentHashMap.get(Integer.valueOf(i)) : null;
        boolean z = false;
        int intValue2 = num2 == null ? 0 : num2.intValue();
        Boolean bool = Boolean.FALSE;
        Boolean[] boolArr2 = {bool, bool, bool};
        mo11611e3(boolArr2, str);
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (i2 < 3) {
            int i6 = i5 + 1;
            if (boolArr2[i2].booleanValue()) {
                i3++;
                if (i4 == -1) {
                    i4 = i5;
                }
            }
            i2++;
            i5 = i6;
        }
        Integer valueOf = Integer.valueOf(i3);
        Integer valueOf2 = Integer.valueOf(i4);
        this.f34398f.put(str, Integer.valueOf(intValue2));
        if (valueOf.intValue() == 0) {
            return intValue2;
        }
        if (intValue2 >= 0 && intValue2 < 3) {
            z = true;
        }
        if (z) {
            boolArr = boolArr2;
        }
        if (boolArr != null && boolArr2[intValue2].booleanValue()) {
            Log.m105924i("Finder.FinderTabStateCacheVM", "red dot index == cachedIndex");
            return intValue2;
        } else if (valueOf.intValue() != 2 && valueOf.intValue() != 1) {
            return intValue2;
        } else {
            this.f34398f.put(str, valueOf2);
            return valueOf2.intValue();
        }
    }

    /* renamed from: e3 */
    public void mo11611e3(Boolean[] boolArr, String str) {
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(boolArr, "redDotFlags");
        C87412m.m108594g(str, "username");
        C64586nn1 y = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77285y("NotificationCenterLike", str);
        C64586nn1 y2 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77285y("NotificationCenterComment", str);
        C64586nn1 y3 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77285y("NotificationCenterFollow", str);
        boolean z = true;
        boolArr[0] = Boolean.valueOf(y != null && y.f184503e > 0);
        boolArr[1] = Boolean.valueOf(y2 != null && y2.f184503e > 0);
        if (y3 == null || y3.f184503e <= 0) {
            z = false;
        }
        boolArr[2] = Boolean.valueOf(z);
    }
}
