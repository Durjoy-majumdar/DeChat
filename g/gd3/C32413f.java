package gd3;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: gd3.f */
public enum C32413f implements C38174i<C32410e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85978d;

    public Object get() {
        Object obj = this.f85978d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85978d;
                if (obj == obj2) {
                    obj = new C32410e();
                    this.f85978d = obj;
                }
            }
        }
        return (C32410e) obj;
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
        return "provider " + C32410e.class.getName();
    }
}
