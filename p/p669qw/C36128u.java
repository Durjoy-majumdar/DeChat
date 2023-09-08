package p669qw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qw.u */
public enum C36128u implements C38174i<C77439s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96277d;

    public Object get() {
        Object obj = this.f96277d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96277d;
                if (obj == obj2) {
                    obj = new C77439s();
                    this.f96277d = obj;
                }
            }
        }
        return (C77439s) obj;
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
        return "provider " + C77439s.class.getName();
    }
}
