package hw1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: hw1.n */
public enum C33104n implements C38174i<C98552m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89890d;

    public Object get() {
        Object obj = this.f89890d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89890d;
                if (obj == obj2) {
                    obj = new C98552m();
                    this.f89890d = obj;
                }
            }
        }
        return (C98552m) obj;
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
        return "provider " + C98552m.class.getName();
    }
}
