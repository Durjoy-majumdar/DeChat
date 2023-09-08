package k43;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: k43.e */
public enum C33826e implements C38174i<C108886d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91440d;

    public Object get() {
        Object obj = this.f91440d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91440d;
                if (obj == obj2) {
                    obj = new C108886d();
                    this.f91440d = obj;
                }
            }
        }
        return (C108886d) obj;
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
        return "provider " + C108886d.class.getName();
    }
}
