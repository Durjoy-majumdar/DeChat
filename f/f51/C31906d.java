package f51;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: f51.d */
public enum C31906d implements C38174i<C45750c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84997d;

    public Object get() {
        Object obj = this.f84997d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84997d;
                if (obj == obj2) {
                    obj = new C45750c();
                    this.f84997d = obj;
                }
            }
        }
        return (C45750c) obj;
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
        return Objects.equals(obj, 16);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C45750c.class.getName();
    }
}
