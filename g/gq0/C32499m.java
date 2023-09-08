package gq0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import gq0.C32497l;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: gq0.m */
public enum C32499m implements C38174i<C107892k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86329d;

    /* renamed from: gq0.m$a */
    public static final class C32500a {

        /* renamed from: a */
        public static final List<Object> f86330a = null;

        static {
            f86330a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: gq0.m$b */
    public static final class C32501b {

        /* renamed from: a */
        public static final List<Object> f86331a = null;

        static {
            f86331a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f86329d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86329d;
                if (obj == obj2) {
                    C32497l.f86326a.getClass();
                    obj = C107892k.f323054d;
                    this.f86329d = obj;
                }
            }
        }
        return (C107892k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C32497l.C32498a.class;
        }
        if ("dependencies".equals(str)) {
            return C32500a.f86330a;
        }
        if ("onProcess".equals(str)) {
            return C32501b.f86331a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C107892k.class.getName();
    }
}
