package p377qu;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qu.o */
public enum C36094o implements C38174i<C36093n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96203d;

    public Object get() {
        Object obj = this.f96203d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96203d;
                if (obj == obj2) {
                    obj = new C36093n();
                    this.f96203d = obj;
                }
            }
        }
        return (C36093n) obj;
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
        return "provider " + C36093n.class.getName();
    }
}
