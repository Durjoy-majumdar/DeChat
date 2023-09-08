package p519fg;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fg.j */
public enum C32038j implements C38174i<C32036i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85275d;

    public Object get() {
        Object obj = this.f85275d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85275d;
                if (obj == obj2) {
                    obj = new C32036i();
                    this.f85275d = obj;
                }
            }
        }
        return (C32036i) obj;
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
        return Objects.equals(obj, 8);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32036i.class.getName();
    }
}
