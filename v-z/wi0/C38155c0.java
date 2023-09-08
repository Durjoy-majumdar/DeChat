package wi0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.config.C81654g;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: wi0.c0 */
public enum C38155c0 implements C38174i<C81654g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100813d;

    /* renamed from: wi0.c0$a */
    public static final class C38156a {

        /* renamed from: a */
        public static final List<Object> f100814a = null;

        static {
            f100814a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: wi0.c0$b */
    public static final class C38157b {

        /* renamed from: a */
        public static final List<Object> f100815a = null;

        static {
            f100815a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100813d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100813d;
                if (obj == obj2) {
                    obj = new C81654g();
                    this.f100813d = obj;
                }
            }
        }
        return (C81654g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C38156a.f100814a;
        }
        if ("onProcess".equals(str)) {
            return C38157b.f100815a;
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
        return "provider " + C81654g.class.getName();
    }
}
