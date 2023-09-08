package p633on;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: on.g */
public enum C35202g implements C38174i<C110054f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94380d;

    public Object get() {
        Object obj = this.f94380d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94380d;
                if (obj == obj2) {
                    obj = new C110054f();
                    this.f94380d = obj;
                }
            }
        }
        return (C110054f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C110054f.class.getName();
    }
}
