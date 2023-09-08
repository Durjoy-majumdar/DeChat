package el2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: el2.g */
public enum C31618g implements C38174i<C116779f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84488d;

    public Object get() {
        Object obj = this.f84488d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84488d;
                if (obj == obj2) {
                    obj = new C116779f();
                    this.f84488d = obj;
                }
            }
        }
        return (C116779f) obj;
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
        return Objects.equals(obj, 294);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C116779f.class.getName();
    }
}
