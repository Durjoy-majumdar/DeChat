package f51;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: f51.j */
public enum C31911j implements C38174i<C31909i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85006d;

    public Object get() {
        Object obj = this.f85006d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85006d;
                if (obj == obj2) {
                    obj = new C31909i();
                    this.f85006d = obj;
                }
            }
        }
        return (C31909i) obj;
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
        return "provider " + C31909i.class.getName();
    }
}
