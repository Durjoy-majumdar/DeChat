package np0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: np0.y */
public enum C34992y implements C38174i<C34987w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93925d;

    /* renamed from: np0.y$a */
    public static final class C34993a {

        /* renamed from: a */
        public static final List<Object> f93926a = null;

        static {
            f93926a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: np0.y$b */
    public static final class C34994b {

        /* renamed from: a */
        public static final List<Object> f93927a = null;

        static {
            f93927a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93925d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93925d;
                if (obj == obj2) {
                    obj = new C34987w();
                    this.f93925d = obj;
                }
            }
        }
        return (C34987w) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C34993a.f93926a;
        }
        if ("onProcess".equals(str)) {
            return C34994b.f93927a;
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
        return "provider " + C34987w.class.getName();
    }
}
