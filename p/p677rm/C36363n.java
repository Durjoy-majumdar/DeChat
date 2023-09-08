package p677rm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rm.n */
public enum C36363n implements C38174i<C90008m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96772d;

    public Object get() {
        Object obj = this.f96772d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96772d;
                if (obj == obj2) {
                    obj = new C90008m();
                    this.f96772d = obj;
                }
            }
        }
        return (C90008m) obj;
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
        return "provider " + C90008m.class.getName();
    }
}
