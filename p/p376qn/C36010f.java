package p376qn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qn.f */
public enum C36010f implements C38174i<C36009e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96012d;

    public Object get() {
        Object obj = this.f96012d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96012d;
                if (obj == obj2) {
                    obj = new C36009e();
                    this.f96012d = obj;
                }
            }
        }
        return (C36009e) obj;
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
        return "provider " + C36009e.class.getName();
    }
}
