package ga3;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ga3.j */
public enum C32369j implements C38174i<C32368i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85895d;

    public Object get() {
        Object obj = this.f85895d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85895d;
                if (obj == obj2) {
                    obj = new C32368i();
                    this.f85895d = obj;
                }
            }
        }
        return (C32368i) obj;
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
        return Objects.equals(obj, 5);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32368i.class.getName();
    }
}
