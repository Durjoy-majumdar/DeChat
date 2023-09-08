package iz0;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: iz0.d */
public enum C33470d implements C38174i<C33468c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90646d;

    public Object get() {
        Object obj = this.f90646d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90646d;
                if (obj == obj2) {
                    obj = new C33468c();
                    this.f90646d = obj;
                }
            }
        }
        return (C33468c) obj;
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
        return Objects.equals(obj, "carditemmsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33468c.class.getName();
    }
}
