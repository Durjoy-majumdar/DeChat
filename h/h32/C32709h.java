package h32;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: h32.h */
public enum C32709h implements C38174i<C32704g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86763d;

    public Object get() {
        Object obj = this.f86763d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86763d;
                if (obj == obj2) {
                    obj = new C32704g();
                    this.f86763d = obj;
                }
            }
        }
        return (C32704g) obj;
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
        return "provider " + C32704g.class.getName();
    }
}
