package xt0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.widget.recent.C85027a;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: xt0.i */
public enum C38831i implements C38174i<C85027a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104698d;

    /* renamed from: xt0.i$a */
    public static final class C38832a {

        /* renamed from: a */
        public static final List<Object> f104699a = null;

        static {
            f104699a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: xt0.i$b */
    public static final class C38833b {

        /* renamed from: a */
        public static final List<Object> f104700a = null;

        static {
            f104700a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f104698d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104698d;
                if (obj == obj2) {
                    obj = new C85027a();
                    this.f104698d = obj;
                }
            }
        }
        return (C85027a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C38832a.f104699a;
        }
        if ("onProcess".equals(str)) {
            return C38833b.f104700a;
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
        return "provider " + C85027a.class.getName();
    }
}
