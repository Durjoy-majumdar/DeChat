package p439ao;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ao.n */
public enum C27966n implements C38174i<C27964m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77201d;

    public Object get() {
        Object obj = this.f77201d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77201d;
                if (obj == obj2) {
                    obj = new C27964m();
                    this.f77201d = obj;
                }
            }
        }
        return (C27964m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
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
        return "provider " + C27964m.class.getName();
    }
}
