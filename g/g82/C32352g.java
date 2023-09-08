package g82;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: g82.g */
public enum C32352g implements C38174i<C32349f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85856d;

    public Object get() {
        Object obj = this.f85856d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85856d;
                if (obj == obj2) {
                    obj = new C32349f();
                    this.f85856d = obj;
                }
            }
        }
        return (C32349f) obj;
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
        return "provider " + C32349f.class.getName();
    }
}
