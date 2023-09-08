package i72;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: i72.o */
public enum C33225o implements C38174i<C98611n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90145d;

    public Object get() {
        Object obj = this.f90145d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90145d;
                if (obj == obj2) {
                    obj = new C98611n();
                    this.f90145d = obj;
                }
            }
        }
        return (C98611n) obj;
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
        return "provider " + C98611n.class.getName();
    }
}
