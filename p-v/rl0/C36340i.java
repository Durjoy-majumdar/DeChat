package rl0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rl0.i */
public enum C36340i implements C38174i<C90006h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96722d;

    public Object get() {
        Object obj = this.f96722d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96722d;
                if (obj == obj2) {
                    obj = new C90006h();
                    this.f96722d = obj;
                }
            }
        }
        return (C90006h) obj;
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
        return "provider " + C90006h.class.getName();
    }
}
