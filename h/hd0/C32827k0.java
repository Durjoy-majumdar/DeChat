package hd0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: hd0.k0 */
public enum C32827k0 implements C38174i<C98402j0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89290d;

    public Object get() {
        Object obj = this.f89290d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89290d;
                if (obj == obj2) {
                    obj = new C98402j0();
                    this.f89290d = obj;
                }
            }
        }
        return (C98402j0) obj;
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
        return "provider " + C98402j0.class.getName();
    }
}
