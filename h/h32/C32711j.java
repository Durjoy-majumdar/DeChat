package h32;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: h32.j */
public enum C32711j implements C38174i<C32710i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86766d;

    public Object get() {
        Object obj = this.f86766d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86766d;
                if (obj == obj2) {
                    obj = new C32710i();
                    this.f86766d = obj;
                }
            }
        }
        return (C32710i) obj;
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
        return "provider " + C32710i.class.getName();
    }
}
