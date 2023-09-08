package ne1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ne1.d1 */
public enum C34794d1 implements C38174i<C47230c1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93495d;

    public Object get() {
        Object obj = this.f93495d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93495d;
                if (obj == obj2) {
                    obj = new C47230c1();
                    this.f93495d = obj;
                }
            }
        }
        return (C47230c1) obj;
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
        return "provider " + C47230c1.class.getName();
    }
}
