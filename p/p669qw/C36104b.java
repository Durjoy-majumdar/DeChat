package p669qw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qw.b */
public enum C36104b implements C38174i<C47886a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96222d;

    public Object get() {
        Object obj = this.f96222d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96222d;
                if (obj == obj2) {
                    obj = new C47886a();
                    this.f96222d = obj;
                }
            }
        }
        return (C47886a) obj;
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
        return "provider " + C47886a.class.getName();
    }
}
