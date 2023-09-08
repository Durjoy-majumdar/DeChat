package ne1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ne1.q0 */
public enum C34814q0 implements C38174i<C61678p0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93555d;

    public Object get() {
        Object obj = this.f93555d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93555d;
                if (obj == obj2) {
                    obj = new C61678p0();
                    this.f93555d = obj;
                }
            }
        }
        return (C61678p0) obj;
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
        return "provider " + C61678p0.class.getName();
    }
}
