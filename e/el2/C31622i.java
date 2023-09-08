package el2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: el2.i */
public enum C31622i implements C38174i<C31619h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84492d;

    public Object get() {
        Object obj = this.f84492d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84492d;
                if (obj == obj2) {
                    obj = new C31619h();
                    this.f84492d = obj;
                }
            }
        }
        return (C31619h) obj;
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
        return "provider " + C31619h.class.getName();
    }
}
