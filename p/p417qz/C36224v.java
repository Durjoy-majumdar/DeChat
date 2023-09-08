package p417qz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qz.v */
public enum C36224v implements C38174i<C77460u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96485d;

    public Object get() {
        Object obj = this.f96485d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96485d;
                if (obj == obj2) {
                    obj = new C77460u();
                    this.f96485d = obj;
                }
            }
        }
        return (C77460u) obj;
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
        return "provider " + C77460u.class.getName();
    }
}
