package xz2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: xz2.j */
public enum C38936j implements C38174i<C66462i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104931d;

    public Object get() {
        Object obj = this.f104931d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104931d;
                if (obj == obj2) {
                    obj = new C66462i();
                    this.f104931d = obj;
                }
            }
        }
        return (C66462i) obj;
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
        return Objects.equals(obj, "8");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C66462i.class.getName();
    }
}
