package mj0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: mj0.f */
public enum C34578f implements C38174i<C34577e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92992d;

    /* renamed from: mj0.f$a */
    public static final class C34579a {

        /* renamed from: a */
        public static final List<Object> f92993a = null;

        static {
            f92993a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: mj0.f$b */
    public static final class C34580b {

        /* renamed from: a */
        public static final List<Object> f92994a = null;

        static {
            f92994a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92992d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92992d;
                if (obj == obj2) {
                    obj = new C34577e();
                    this.f92992d = obj;
                }
            }
        }
        return (C34577e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C34579a.f92993a;
        }
        if ("onProcess".equals(str)) {
            return C34580b.f92994a;
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
        return "provider " + C34577e.class.getName();
    }
}
