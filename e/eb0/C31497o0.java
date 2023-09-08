package eb0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: eb0.o0 */
public enum C31497o0 implements C38174i<C45615n0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84230d;

    public Object get() {
        Object obj = this.f84230d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84230d;
                if (obj == obj2) {
                    obj = new C45615n0();
                    this.f84230d = obj;
                }
            }
        }
        return (C45615n0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C45615n0.class.getName();
    }
}
