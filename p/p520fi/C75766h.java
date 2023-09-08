package p520fi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import p261wl.C38166b;
import p261wl.C38174i;

/* renamed from: fi.h */
public interface C75766h {

    /* renamed from: fi.h$a */
    public static class C75767a {

        /* renamed from: a */
        public static Map<String, C75766h> f222368a = new HashMap();

        /* renamed from: a */
        public static <T> T m91020a(String str, String str2, T t) {
            C75766h b = m91021b(str);
            if (b == null) {
                Log.m105920e("MicroMsg.ICacheService.Factory", "null service");
                return t;
            }
            try {
                return b.get(str2);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.ICacheService.Factory", "cast failed, different type ?");
                Log.m105921e("MicroMsg.ICacheService.Factory", "exception:%s", Util.stackTraceToString(e));
                return t;
            }
        }

        /* renamed from: b */
        public static C75766h m91021b(String str) {
            C75766h hVar = (C75766h) ((HashMap) f222368a).get(str);
            if (hVar != null) {
                return hVar;
            }
            C38174i<C32055i> g = C38166b.m41760g(C32055i.class, str);
            if (g != null) {
                return g.get();
            }
            return null;
        }

        /* renamed from: c */
        public static <T> void m91022c(String str, String str2, T t) {
            C75766h b = m91021b(str);
            if (b == null) {
                Log.m105920e("MicroMsg.ICacheService.Factory", "null service");
            } else {
                b.put(str2, t);
            }
        }
    }

    Object get(Object obj);

    void put(Object obj, Object obj2);

    Object remove(Object obj);
}
