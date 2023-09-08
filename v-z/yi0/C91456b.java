package yi0;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import rx3.C13598b0;
import sx3.C110818d0;
import yi0.C91452a;

/* renamed from: yi0.b */
public final class C91456b {

    /* renamed from: a */
    public static final C91456b f262190a = new C91456b();

    /* renamed from: b */
    public static final ConcurrentSkipListSet<C91457a> f262191b = new ConcurrentSkipListSet<>(C91458b.f262195d);

    /* renamed from: c */
    public static final int[] f262192c = {31, 34, 37};

    /* renamed from: d */
    public static final int[] f262193d = {32, 35, 38};

    /* renamed from: e */
    public static final int[] f262194e = {33, 36, 39};

    /* renamed from: yi0.b$a */
    public interface C91457a {
        /* renamed from: a */
        void mo116912a();
    }

    /* renamed from: yi0.b$b */
    public static final class C91458b<T> implements Comparator {

        /* renamed from: d */
        public static final C91458b<T> f262195d = new C91458b<>();

        public int compare(Object obj, Object obj2) {
            C91457a aVar = (C91457a) obj;
            C91457a aVar2 = (C91457a) obj2;
            if (C87412m.m108589b(aVar, aVar2)) {
                return 0;
            }
            return aVar.hashCode() - aVar2.hashCode();
        }
    }

    /* renamed from: a */
    public final void mo125390a(int[] iArr) {
        int i;
        ArrayList<IDKey> arrayList = new ArrayList<>();
        arrayList.add(new IDKey(365, iArr[0], 1));
        C91452a aVar = C91452a.f262179d;
        LinkedHashMap<C91452a.C91454b, Boolean> linkedHashMap = C91452a.f262181f;
        synchronized (linkedHashMap) {
            if (linkedHashMap.size() > 0) {
                Set<C91452a.C91454b> keySet = linkedHashMap.keySet();
                C87412m.m108593f(keySet, "mRunningAppInfos.keys");
                i = ((C91452a.C91454b) C110818d0.m150922T(keySet)).f262188h;
            } else {
                C13598b0 b0Var = C13598b0.f38549a;
                i = -1;
            }
        }
        if (i == 4) {
            arrayList.add(new IDKey(365, iArr[2], 1));
        } else if (i >= 0) {
            arrayList.add(new IDKey(365, iArr[1], 1));
        }
        if (Log.getLogLevel() <= 1) {
            for (IDKey iDKey : arrayList) {
                Log.m105918d("MicroMsg.AppBrandCrashReportFullMonitor", "batchReportIDKey, id:" + iDKey.GetID() + "->key:" + iDKey.GetKey());
            }
        }
        C115669n.INSTANCE.mo160124a(arrayList, false);
    }

    /* renamed from: b */
    public final void mo125391b(int i, int i2) {
        C115669n.INSTANCE.mo175911u(i, i2);
        if (Log.getLogLevel() <= 1) {
            Log.m105918d("MicroMsg.AppBrandCrashReportFullMonitor", "reportIDKey, id:" + i + "->key:" + i2);
        }
    }
}
