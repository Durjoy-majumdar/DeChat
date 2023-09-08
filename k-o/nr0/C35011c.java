package nr0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: nr0.c */
public enum C35011c implements C38174i<C89051b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93962d;

    /* renamed from: nr0.c$a */
    public static final class C35012a {

        /* renamed from: a */
        public static final List<Object> f93963a = null;

        static {
            f93963a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: nr0.c$b */
    public static final class C35013b {

        /* renamed from: a */
        public static final List<Object> f93964a = null;

        static {
            f93964a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93962d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93962d;
                if (obj == obj2) {
                    obj = new C89051b();
                    this.f93962d = obj;
                }
            }
        }
        return (C89051b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C35012a.f93963a;
        }
        if ("onProcess".equals(str)) {
            return C35013b.f93964a;
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
        return "provider " + C89051b.class.getName();
    }
}
