package p376qn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qn.n */
public enum C36015n implements C38174i<C47872m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96024d;

    public Object get() {
        Object obj = this.f96024d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96024d;
                if (obj == obj2) {
                    obj = new C47872m();
                    this.f96024d = obj;
                }
            }
        }
        return (C47872m) obj;
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
        return "provider " + C47872m.class.getName();
    }
}
