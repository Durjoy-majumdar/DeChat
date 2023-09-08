package g12;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: g12.c */
public enum C32302c implements C38174i<C32301b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85776d;

    public Object get() {
        Object obj = this.f85776d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85776d;
                if (obj == obj2) {
                    obj = new C32301b();
                    this.f85776d = obj;
                }
            }
        }
        return (C32301b) obj;
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
        return "provider " + C32301b.class.getName();
    }
}
