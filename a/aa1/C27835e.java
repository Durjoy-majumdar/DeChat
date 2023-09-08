package aa1;

import f81.C116807d;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: aa1.e */
public enum C27835e implements C38174i<C91980d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76948d;

    /* renamed from: aa1.e$a */
    public static final class C27836a {

        /* renamed from: a */
        public static final List<Object> f76949a = null;

        static {
            f76949a = Arrays.asList(new Object[]{C116807d.class});
        }
    }

    public Object get() {
        Object obj = this.f76948d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76948d;
                if (obj == obj2) {
                    obj = new C91980d();
                    this.f76948d = obj;
                }
            }
        }
        return (C91980d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C27836a.f76949a;
        }
        if ("onProcess".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C91980d.class.getName();
    }
}
