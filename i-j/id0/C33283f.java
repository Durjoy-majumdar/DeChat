package id0;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: id0.f */
public enum C33283f implements C38174i<C98667e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90275d;

    public Object get() {
        Object obj = this.f90275d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90275d;
                if (obj == obj2) {
                    obj = new C98667e();
                    this.f90275d = obj;
                }
            }
        }
        return (C98667e) obj;
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
        return Objects.equals(obj, 149) || Objects.equals(obj, 150);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C98667e.class.getName();
    }
}
