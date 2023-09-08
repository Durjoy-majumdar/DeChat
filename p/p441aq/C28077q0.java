package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.q0 */
public enum C28077q0 implements C38174i<C39632p0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77432d;

    public Object get() {
        Object obj = this.f77432d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77432d;
                if (obj == obj2) {
                    obj = new C39632p0();
                    this.f77432d = obj;
                }
            }
        }
        return (C39632p0) obj;
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
        return "provider " + C39632p0.class.getName();
    }
}
