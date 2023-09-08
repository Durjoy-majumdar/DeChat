package xo0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;
import xo0.C38782e;

/* renamed from: xo0.f */
public enum C38784f implements C38174i<C91313a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104604d;

    /* renamed from: xo0.f$a */
    public static final class C38785a {

        /* renamed from: a */
        public static final List<Object> f104605a = null;

        static {
            f104605a = Arrays.asList(new Object[]{C81161g2.class});
        }
    }

    /* renamed from: xo0.f$b */
    public static final class C38786b {

        /* renamed from: a */
        public static final List<Object> f104606a = null;

        static {
            f104606a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f104604d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104604d;
                if (obj == obj2) {
                    C38782e.f104601a.getClass();
                    obj = C91313a.f261928d;
                    this.f104604d = obj;
                }
            }
        }
        return (C91313a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C38782e.C38783a.class;
        }
        if ("onProcess".equals(str)) {
            return C38786b.f104606a;
        }
        if ("dependencies".equals(str)) {
            return C38785a.f104605a;
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
        return "provider " + C91313a.class.getName();
    }
}
