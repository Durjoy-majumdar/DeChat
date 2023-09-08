package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.m */
public enum C28062m implements C38174i<C28059l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77399d;

    public Object get() {
        Object obj = this.f77399d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77399d;
                if (obj == obj2) {
                    obj = new C28059l();
                    this.f77399d = obj;
                }
            }
        }
        return (C28059l) obj;
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
        return "provider " + C28059l.class.getName();
    }
}
