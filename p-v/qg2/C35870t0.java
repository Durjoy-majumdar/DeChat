package qg2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qg2.t0 */
public enum C35870t0 implements C38174i<C35867s0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95730d;

    public Object get() {
        Object obj = this.f95730d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95730d;
                if (obj == obj2) {
                    obj = new C35867s0();
                    this.f95730d = obj;
                }
            }
        }
        return (C35867s0) obj;
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
        return "provider " + C35867s0.class.getName();
    }
}
