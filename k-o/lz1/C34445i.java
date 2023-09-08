package lz1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;
import p635os.C89291d;

/* renamed from: lz1.i */
public enum C34445i implements C38174i<C88672e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92739d;

    /* renamed from: lz1.i$a */
    public static final class C34446a {

        /* renamed from: a */
        public static final List<Object> f92740a = null;

        static {
            f92740a = Arrays.asList(new Object[]{C89291d.class});
        }
    }

    /* renamed from: lz1.i$b */
    public static final class C34447b {

        /* renamed from: a */
        public static final List<Object> f92741a = null;

        static {
            f92741a = Arrays.asList(new Object[]{C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f92739d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92739d;
                if (obj == obj2) {
                    obj = new C88672e();
                    this.f92739d = obj;
                }
            }
        }
        return (C88672e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34447b.f92741a;
        }
        if ("dependencies".equals(str)) {
            return C34446a.f92740a;
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
        return "provider " + C88672e.class.getName();
    }
}
