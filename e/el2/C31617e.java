package el2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: el2.e */
public enum C31617e implements C38174i<C31616d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84485d;

    public Object get() {
        Object obj = this.f84485d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84485d;
                if (obj == obj2) {
                    obj = new C31616d();
                    this.f84485d = obj;
                }
            }
        }
        return (C31616d) obj;
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
        return "provider " + C31616d.class.getName();
    }
}
