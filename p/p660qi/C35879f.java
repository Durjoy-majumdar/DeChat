package p660qi;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qi.f */
public enum C35879f implements C38174i<C35878e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95744d;

    public Object get() {
        Object obj = this.f95744d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95744d;
                if (obj == obj2) {
                    obj = new C35878e();
                    this.f95744d = obj;
                }
            }
        }
        return (C35878e) obj;
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
        return "provider " + C35878e.class.getName();
    }
}
