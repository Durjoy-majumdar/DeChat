package p669qw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qw.p */
public enum C36125p implements C38174i<C36124o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96271d;

    public Object get() {
        Object obj = this.f96271d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96271d;
                if (obj == obj2) {
                    obj = new C36124o();
                    this.f96271d = obj;
                }
            }
        }
        return (C36124o) obj;
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
        return "provider " + C36124o.class.getName();
    }
}
