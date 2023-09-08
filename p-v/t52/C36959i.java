package t52;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: t52.i */
public enum C36959i implements C38174i<C36958h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98034d;

    public Object get() {
        Object obj = this.f98034d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98034d;
                if (obj == obj2) {
                    obj = new C36958h();
                    this.f98034d = obj;
                }
            }
        }
        return (C36958h) obj;
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
        return Objects.equals(obj, 302);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36958h.class.getName();
    }
}
