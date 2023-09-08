package id0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: id0.d */
public enum C33282d implements C38174i<C98664c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90272d;

    public Object get() {
        Object obj = this.f90272d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90272d;
                if (obj == obj2) {
                    obj = new C98664c();
                    this.f90272d = obj;
                }
            }
        }
        return (C98664c) obj;
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
        return "provider " + C98664c.class.getName();
    }
}
