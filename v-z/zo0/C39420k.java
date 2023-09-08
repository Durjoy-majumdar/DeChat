package zo0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: zo0.k */
public enum C39420k implements C38174i<C91819j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105900d;

    /* renamed from: zo0.k$a */
    public static final class C39421a {

        /* renamed from: a */
        public static final List<Object> f105901a = null;

        static {
            f105901a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: zo0.k$b */
    public static final class C39422b {

        /* renamed from: a */
        public static final List<Object> f105902a = null;

        static {
            f105902a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f105900d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105900d;
                if (obj == obj2) {
                    obj = new C91819j();
                    this.f105900d = obj;
                }
            }
        }
        return (C91819j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C39421a.f105901a;
        }
        if ("onProcess".equals(str)) {
            return C39422b.f105902a;
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
        return "provider " + C91819j.class.getName();
    }
}
