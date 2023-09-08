package p150eo;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: eo.x */
public enum C31643x implements C38174i<C86615w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84535d;

    public Object get() {
        Object obj = this.f84535d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84535d;
                if (obj == obj2) {
                    obj = new C86615w();
                    this.f84535d = obj;
                }
            }
        }
        return (C86615w) obj;
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
        return "provider " + C86615w.class.getName();
    }
}
