package h12;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: h12.c */
public enum C32655c implements C38174i<C59748b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86665d;

    public Object get() {
        Object obj = this.f86665d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86665d;
                if (obj == obj2) {
                    obj = new C59748b();
                    this.f86665d = obj;
                }
            }
        }
        return (C59748b) obj;
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
        return "provider " + C59748b.class.getName();
    }
}
