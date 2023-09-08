package co0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import java.util.HashMap;
import java.util.Map;
import p830xc.C91165a;

/* renamed from: co0.b */
public class C80127b {

    /* renamed from: co0.b$a */
    public enum C80128a {
        ;
        

        /* renamed from: f */
        public static Map<C83231l.C83235e, Integer> f234624f;

        /* renamed from: g */
        public static Map<Integer, C83231l.C83235e> f234625g;

        /* renamed from: d */
        public final C83231l.C83235e f234627d;

        /* renamed from: e */
        public final int f234628e;

        /* access modifiers changed from: public */
        static {
            f234624f = null;
            f234625g = null;
        }

        /* access modifiers changed from: public */
        C80128a(C83231l.C83235e eVar, int i) {
            this.f234627d = eVar;
            this.f234628e = i;
        }

        /* renamed from: a */
        public static void m97438a() {
            C80128a[] values = values();
            f234624f = new HashMap(values.length * 2);
            f234625g = new HashMap(values.length * 2);
            for (C80128a aVar : values) {
                f234624f.put(aVar.f234627d, Integer.valueOf(aVar.f234628e));
                f234625g.put(Integer.valueOf(aVar.f234628e), aVar.f234627d);
            }
        }
    }

    /* renamed from: a */
    public static AppBrandRuntime m97435a(C91165a aVar) {
        if (!(aVar instanceof C81823b)) {
            return null;
        }
        C82381f g = aVar.mo62544g();
        if (g instanceof C83780d1) {
            return ((C83780d1) g).getRuntime();
        }
        if (g instanceof C81925i2) {
            return ((C81925i2) g).getRuntime();
        }
        return null;
    }

    /* renamed from: b */
    public static int m97436b(String str) {
        Map<C83231l.C83235e, Integer> map;
        C83231l.C83235e d = C83231l.m102143d(str);
        synchronized (C80128a.class) {
            map = C80128a.f234624f;
            if (map == null) {
                C80128a.m97438a();
                map = C80128a.f234624f;
            }
        }
        return map.get(d).intValue();
    }

    /* renamed from: c */
    public static C83231l.C83235e m97437c(int i) {
        Map<Integer, C83231l.C83235e> map;
        synchronized (C80128a.class) {
            map = C80128a.f234625g;
            if (map == null) {
                C80128a.m97438a();
                map = C80128a.f234625g;
            }
        }
        C83231l.C83235e eVar = map.get(Integer.valueOf(i));
        return eVar == null ? C83231l.C83235e.HIDE : eVar;
    }
}
