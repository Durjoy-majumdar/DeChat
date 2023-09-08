package ib0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ib0.j */
public enum C33265j implements C38174i<C33264i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90241d;

    public Object get() {
        Object obj = this.f90241d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90241d;
                if (obj == obj2) {
                    obj = new C33264i();
                    this.f90241d = obj;
                }
            }
        }
        return (C33264i) obj;
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
        return "provider " + C33264i.class.getName();
    }
}
