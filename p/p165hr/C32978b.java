package p165hr;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: hr.b */
public enum C32978b implements C38174i<C46099a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89599d;

    public Object get() {
        Object obj = this.f89599d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89599d;
                if (obj == obj2) {
                    obj = new C46099a();
                    this.f89599d = obj;
                }
            }
        }
        return (C46099a) obj;
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
        return "provider " + C46099a.class.getName();
    }
}
