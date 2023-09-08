package ne1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ne1.w */
public enum C34820w implements C38174i<C47236v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93573d;

    public Object get() {
        Object obj = this.f93573d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93573d;
                if (obj == obj2) {
                    obj = new C47236v();
                    this.f93573d = obj;
                }
            }
        }
        return (C47236v) obj;
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
        return "provider " + C47236v.class.getName();
    }
}
