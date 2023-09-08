package r62;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: r62.e */
public enum C36256e implements C38174i<C118225d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96552d;

    public Object get() {
        Object obj = this.f96552d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96552d;
                if (obj == obj2) {
                    obj = new C118225d();
                    this.f96552d = obj;
                }
            }
        }
        return (C118225d) obj;
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
        return "provider " + C118225d.class.getName();
    }
}
