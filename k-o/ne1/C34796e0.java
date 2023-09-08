package ne1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ne1.e0 */
public enum C34796e0 implements C38174i<C47231d0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93501d;

    public Object get() {
        Object obj = this.f93501d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93501d;
                if (obj == obj2) {
                    obj = new C47231d0();
                    this.f93501d = obj;
                }
            }
        }
        return (C47231d0) obj;
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
        return "provider " + C47231d0.class.getName();
    }
}
