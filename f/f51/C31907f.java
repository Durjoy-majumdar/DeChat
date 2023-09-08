package f51;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: f51.f */
public enum C31907f implements C38174i<C45751e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85000d;

    public Object get() {
        Object obj = this.f85000d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85000d;
                if (obj == obj2) {
                    obj = new C45751e();
                    this.f85000d = obj;
                }
            }
        }
        return (C45751e) obj;
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
        return "provider " + C45751e.class.getName();
    }
}
