package p376qn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qn.p */
public enum C36016p implements C38174i<C47873o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96027d;

    public Object get() {
        Object obj = this.f96027d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96027d;
                if (obj == obj2) {
                    obj = new C47873o();
                    this.f96027d = obj;
                }
            }
        }
        return (C47873o) obj;
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
        return "provider " + C47873o.class.getName();
    }
}
