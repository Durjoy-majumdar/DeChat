package g82;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: g82.i */
public enum C32353i implements C38174i<C107786h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85859d;

    public Object get() {
        Object obj = this.f85859d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85859d;
                if (obj == obj2) {
                    obj = new C107786h();
                    this.f85859d = obj;
                }
            }
        }
        return (C107786h) obj;
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
        return Objects.equals(obj, "multivoip") || Objects.equals(obj, "voipmt");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C107786h.class.getName();
    }
}
