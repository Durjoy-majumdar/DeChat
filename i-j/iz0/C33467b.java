package iz0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: iz0.b */
public enum C33467b implements C38174i<C33459a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90641d;

    public Object get() {
        Object obj = this.f90641d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90641d;
                if (obj == obj2) {
                    obj = new C33459a();
                    this.f90641d = obj;
                }
            }
        }
        return (C33459a) obj;
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
        return "provider " + C33459a.class.getName();
    }
}
