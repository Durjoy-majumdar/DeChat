package mz1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;
import p635os.C89291d;

/* renamed from: mz1.i */
public enum C34702i implements C38174i<C88864h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93318d;

    /* renamed from: mz1.i$a */
    public static final class C34703a {

        /* renamed from: a */
        public static final List<Object> f93319a = null;

        static {
            f93319a = Arrays.asList(new Object[]{C89291d.class});
        }
    }

    /* renamed from: mz1.i$b */
    public static final class C34704b {

        /* renamed from: a */
        public static final List<Object> f93320a = null;

        static {
            f93320a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93318d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93318d;
                if (obj == obj2) {
                    obj = new C88864h();
                    this.f93318d = obj;
                }
            }
        }
        return (C88864h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34704b.f93320a;
        }
        if ("dependencies".equals(str)) {
            return C34703a.f93319a;
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
        return "provider " + C88864h.class.getName();
    }
}
