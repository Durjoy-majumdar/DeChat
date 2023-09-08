package pb1;

import com.tencent.p014mm.autogen.mmdata.rpt.FavAddQualityStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FavForwardQualityStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FavSyncQualityStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

/* renamed from: pb1.b0 */
public final class C100698b0 {

    /* renamed from: a */
    public static final C100698b0 f295038a = new C100698b0();

    /* renamed from: b */
    public static final HashMap<Long, FavAddQualityStruct> f295039b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<Long, FavSyncQualityStruct> f295040c = new HashMap<>();

    /* renamed from: d */
    public static final HashMap<Long, FavForwardQualityStruct> f295041d = new HashMap<>();

    /* renamed from: e */
    public static final HashMap<Integer, Long> f295042e = new HashMap<>();

    /* renamed from: f */
    public static final HashMap<Long, Long> f295043f = new HashMap<>();

    /* renamed from: a */
    public final FavAddQualityStruct mo140125a(long j) {
        HashMap<Long, FavAddQualityStruct> hashMap = f295039b;
        FavAddQualityStruct favAddQualityStruct = hashMap.get(Long.valueOf(j));
        if (favAddQualityStruct != null) {
            return favAddQualityStruct;
        }
        Log.m105920e("MircoMsg.FavReport", "[getAddQualityReporter] struct = null, session = " + j);
        FavAddQualityStruct favAddQualityStruct2 = new FavAddQualityStruct();
        hashMap.put(Long.valueOf(j), favAddQualityStruct2);
        return favAddQualityStruct2;
    }

    /* renamed from: b */
    public final FavAddQualityStruct mo140126b() {
        Long l = f295042e.get(1);
        if (l != null) {
            return f295038a.mo140125a(l.longValue());
        }
        return null;
    }

    /* renamed from: c */
    public final FavForwardQualityStruct mo140127c() {
        Long l = f295042e.get(3);
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        HashMap<Long, FavForwardQualityStruct> hashMap = f295041d;
        FavForwardQualityStruct favForwardQualityStruct = hashMap.get(Long.valueOf(longValue));
        if (favForwardQualityStruct != null) {
            return favForwardQualityStruct;
        }
        Log.m105920e("MircoMsg.FavReport", "[getForwardQualityReporter] struct = null, session = " + longValue);
        FavForwardQualityStruct favForwardQualityStruct2 = new FavForwardQualityStruct();
        hashMap.put(Long.valueOf(longValue), favForwardQualityStruct2);
        return favForwardQualityStruct2;
    }

    /* renamed from: d */
    public final long mo140128d(int i) {
        Long l = f295042e.get(Integer.valueOf(i));
        if (l == null) {
            return -4369;
        }
        return l.longValue();
    }

    /* renamed from: e */
    public final FavSyncQualityStruct mo140129e() {
        Long l = f295042e.get(2);
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        HashMap<Long, FavSyncQualityStruct> hashMap = f295040c;
        FavSyncQualityStruct favSyncQualityStruct = hashMap.get(Long.valueOf(longValue));
        if (favSyncQualityStruct != null) {
            return favSyncQualityStruct;
        }
        Log.m105920e("MircoMsg.FavReport", "[getSyncQualityReporter] struct = null, session = " + longValue);
        FavSyncQualityStruct favSyncQualityStruct2 = new FavSyncQualityStruct();
        hashMap.put(Long.valueOf(longValue), favSyncQualityStruct2);
        return favSyncQualityStruct2;
    }

    /* renamed from: f */
    public final void mo140130f(int i, long j) {
        f295042e.put(Integer.valueOf(i), Long.valueOf(j));
        Log.m105924i("MircoMsg.FavReport", "[registerCurrentSession] type = " + i + ", session = " + j);
        if (i == 1) {
            f295039b.put(Long.valueOf(j), new FavAddQualityStruct());
            Log.m105924i("MircoMsg.FavReport", "[registerReporter] register addQuality reporter, session = " + j);
        } else if (i == 2) {
            f295040c.put(Long.valueOf(j), new FavSyncQualityStruct());
            Log.m105924i("MircoMsg.FavReport", "[registerReporter] register syncQuality reporter, session = " + j);
        } else if (i != 3) {
            Log.m105920e("MircoMsg.FavReport", "[registerReporter] error report type = " + i);
        } else {
            f295041d.put(Long.valueOf(j), new FavForwardQualityStruct());
            Log.m105924i("MircoMsg.FavReport", "[registerReporter] register forwardQuality reporter, session = " + j);
        }
    }

    /* renamed from: g */
    public final void mo140131g(int i) {
        HashMap<Integer, Long> hashMap = f295042e;
        Long l = hashMap.get(Integer.valueOf(i));
        if (l != null) {
            long longValue = l.longValue();
            if (i == 1) {
                f295039b.remove(Long.valueOf(longValue));
                Log.m105924i("MircoMsg.FavReport", "[unRegisterReporter] remove addQuality reporter, session = " + longValue);
            } else if (i == 2) {
                f295040c.remove(Long.valueOf(longValue));
                Log.m105924i("MircoMsg.FavReport", "[unRegisterReporter] remove syncQuality reporter, session = " + longValue);
            } else if (i != 3) {
                Log.m105920e("MircoMsg.FavReport", "[unRegisterReporter] error report type = " + i);
            } else {
                f295041d.remove(Long.valueOf(longValue));
                Log.m105924i("MircoMsg.FavReport", "[unRegisterReporter] remove forwardQuality reporter, session = " + longValue);
            }
        }
        hashMap.put(Integer.valueOf(i), -11L);
        Log.m105924i("MircoMsg.FavReport", "[unRegisterCurrentSession] type = " + i + ", set not register");
    }
}
