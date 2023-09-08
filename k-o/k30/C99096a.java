package k30;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import oa1.C117731d;

/* renamed from: k30.a */
public abstract class C99096a {

    /* renamed from: c */
    public static Map<Class, Map<String, Object>> f290566c = new HashMap();

    /* renamed from: d */
    public static MTimerHandler f290567d;

    /* renamed from: a */
    public boolean f290568a = false;

    /* renamed from: b */
    public boolean f290569b = false;

    /* renamed from: k30.a$a */
    public class C99097a implements MTimerHandler.CallBack {
        public boolean onTimerExpired() {
            synchronized (C99096a.f290566c) {
                ((HashMap) C99096a.f290566c).clear();
            }
            return false;
        }
    }

    /* renamed from: k30.a$b */
    public interface C99098b {
        Object getData();
    }

    static {
        MTimerHandler mTimerHandler = new MTimerHandler("KaraCleanCache", (MTimerHandler.CallBack) new C99097a(), false);
        f290567d = mTimerHandler;
        mTimerHandler.setLogging(false);
    }

    /* renamed from: a */
    public Object mo138469a(String str, C99098b bVar) {
        Object obj;
        if (!this.f290569b) {
            boolean z = false;
            if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_plugin_kara_data_cache", "1", false, true), 1) != 0) {
                z = true;
            }
            this.f290568a = z;
            this.f290569b = true;
        }
        if (!this.f290568a) {
            return bVar.getData();
        }
        synchronized (f290566c) {
            Class<?> cls = getClass();
            if (((HashMap) f290566c).get(cls) == null) {
                ((HashMap) f290566c).put(cls, new HashMap());
            }
            Map map = (Map) ((HashMap) f290566c).get(cls);
            obj = map.get(str);
            if (obj == null) {
                obj = bVar.getData();
                map.put(str, obj);
            }
        }
        if (f290567d.stopped()) {
            f290567d.startTimer(1200000);
        }
        return obj;
    }
}
