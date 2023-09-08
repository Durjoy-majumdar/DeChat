package np0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: np0.p */
public enum C34977p implements C38174i<C76947o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93892d;

    /* renamed from: np0.p$a */
    public static final class C34978a {

        /* renamed from: a */
        public static final List<Object> f93893a = null;

        static {
            f93893a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: np0.p$b */
    public static final class C34979b {

        /* renamed from: a */
        public static final List<Object> f93894a = null;

        static {
            f93894a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93892d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93892d;
                if (obj == obj2) {
                    obj = new C76947o();
                    this.f93892d = obj;
                }
            }
        }
        return (C76947o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C34978a.f93893a;
        }
        if ("onProcess".equals(str)) {
            return C34979b.f93894a;
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
        return "provider " + C76947o.class.getName();
    }
}
