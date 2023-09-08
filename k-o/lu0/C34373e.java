package lu0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: lu0.e */
public enum C34373e implements C38174i<C34372d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92581d;

    /* renamed from: lu0.e$a */
    public static final class C34374a {

        /* renamed from: a */
        public static final List<Object> f92582a = null;

        static {
            f92582a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: lu0.e$b */
    public static final class C34375b {

        /* renamed from: a */
        public static final List<Object> f92583a = null;

        static {
            f92583a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92581d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92581d;
                if (obj == obj2) {
                    obj = new C34372d();
                    this.f92581d = obj;
                }
            }
        }
        return (C34372d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34375b.f92583a;
        }
        if ("dependencies".equals(str)) {
            return C34374a.f92582a;
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
        return "provider " + C34372d.class.getName();
    }
}
