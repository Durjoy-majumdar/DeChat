package p150eo;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: eo.i */
public enum C31638i implements C38174i<C86592h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84527d;

    public Object get() {
        Object obj = this.f84527d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84527d;
                if (obj == obj2) {
                    obj = new C86592h();
                    this.f84527d = obj;
                }
            }
        }
        return (C86592h) obj;
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
        return "provider " + C86592h.class.getName();
    }
}
