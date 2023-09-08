package p417qz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qz.n */
public enum C36220n implements C38174i<C26007m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96473d;

    public Object get() {
        Object obj = this.f96473d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96473d;
                if (obj == obj2) {
                    obj = new C26007m();
                    this.f96473d = obj;
                }
            }
        }
        return (C26007m) obj;
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
        return "provider " + C26007m.class.getName();
    }
}
