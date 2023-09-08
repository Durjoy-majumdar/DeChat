package dv1;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: dv1.s */
public enum C31309s implements C38174i<C31308r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83826d;

    public Object get() {
        Object obj = this.f83826d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83826d;
                if (obj == obj2) {
                    obj = new C31308r();
                    this.f83826d = obj;
                }
            }
        }
        return (C31308r) obj;
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
        return "provider " + C31308r.class.getName();
    }
}
