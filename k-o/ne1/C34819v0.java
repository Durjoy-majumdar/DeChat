package ne1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ne1.v0 */
public enum C34819v0 implements C38174i<C61681u0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93570d;

    public Object get() {
        Object obj = this.f93570d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93570d;
                if (obj == obj2) {
                    obj = new C61681u0();
                    this.f93570d = obj;
                }
            }
        }
        return (C61681u0) obj;
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
        return "provider " + C61681u0.class.getName();
    }
}
