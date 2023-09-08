package p535gn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: gn.b */
public enum C32486b implements C38174i<C116975a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86304d;

    public Object get() {
        Object obj = this.f86304d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86304d;
                if (obj == obj2) {
                    obj = new C116975a();
                    this.f86304d = obj;
                }
            }
        }
        return (C116975a) obj;
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
        return "provider " + C116975a.class.getName();
    }
}
