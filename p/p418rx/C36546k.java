package p418rx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rx.k */
public enum C36546k implements C38174i<C77581j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97210d;

    public Object get() {
        Object obj = this.f97210d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97210d;
                if (obj == obj2) {
                    obj = new C77581j();
                    this.f97210d = obj;
                }
            }
        }
        return (C77581j) obj;
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
        return "provider " + C77581j.class.getName();
    }
}
