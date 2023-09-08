package fb2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fb2.g */
public enum C32003g implements C38174i<C58939f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85208d;

    public Object get() {
        Object obj = this.f85208d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85208d;
                if (obj == obj2) {
                    obj = new C58939f();
                    this.f85208d = obj;
                }
            }
        }
        return (C58939f) obj;
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
        return Objects.equals(obj, "1");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C58939f.class.getName();
    }
}
