package sx2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: sx2.i */
public enum C36901i implements C38174i<C36900h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97930d;

    public Object get() {
        Object obj = this.f97930d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97930d;
                if (obj == obj2) {
                    obj = new C36900h();
                    this.f97930d = obj;
                }
            }
        }
        return (C36900h) obj;
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
        return Objects.equals(obj, 56);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36900h.class.getName();
    }
}
