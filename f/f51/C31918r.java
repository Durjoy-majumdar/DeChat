package f51;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: f51.r */
public enum C31918r implements C38174i<C45753q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85027d;

    public Object get() {
        Object obj = this.f85027d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85027d;
                if (obj == obj2) {
                    obj = new C45753q();
                    this.f85027d = obj;
                }
            }
        }
        return (C45753q) obj;
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
        return "provider " + C45753q.class.getName();
    }
}
